/*
 * Copyright (c) 2013, Apptentive, Inc. All Rights Reserved.
 * Please refer to the LICENSE file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.ApptentiveLog;
import org.json.JSONException;

/**
 * @author Sky Kelsey
 */
public class SdkFactory {
	public static SdkPayload fromJson(String json) {
		try {
			return new SdkPayload(json);
		} catch (JSONException e) {
			ApptentiveLog.v("Error parsing json as Sdk: %s", e, json);
		} catch (IllegalArgumentException e) {
			// Unknown unknown #rumsfeld
		}
		return null;
	}
}
