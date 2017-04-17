/*
 * Copyright (c) 2014, Apptentive, Inc. All Rights Reserved.
 * Please refer to the LICENSE file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.ApptentiveLog;
import com.apptentive.android.sdk.network.HttpRequestMethod;
import com.apptentive.android.sdk.util.StringUtils;

import org.json.JSONException;

/**
 * @author Sky Kelsey
 */
public class PersonPayload extends JsonPayload {

	public static final String KEY = "person";

	private static final String KEY_ID = "id";
	private static final String KEY_EMAIL = "email";
	private static final String KEY_NAME = "name";
	private static final String KEY_FACEBOOK_ID = "facebook_id";
	private static final String KEY_PHONE_NUMBER = "phone_number";
	private static final String KEY_STREET = "street";
	private static final String KEY_CITY = "city";
	private static final String KEY_ZIP = "zip";
	private static final String KEY_COUNTRY = "country";
	private static final String KEY_BIRTHDAY = "birthday";
	public static final String KEY_CUSTOM_DATA = "custom_data";

	public PersonPayload() {
		super();
	}

	public PersonPayload(String json) throws JSONException {
		super(json);
	}

	//region Http-request

	@Override
	public String getHttpEndPoint() {
		return StringUtils.format("/converations/%s/people", getConversationId());
	}

	@Override
	public HttpRequestMethod getHttpRequestMethod() {
		return HttpRequestMethod.PUT;
	}

	@Override
	public String getHttpRequestContentType() {
		return "application/json";
	}

	//endregion

	public void initBaseType() {
		setBaseType(BaseType.person);
	}

	public String getId() {
		try {
			if (!isNull(KEY_ID)) {
				return getString(KEY_ID);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setId(String id) {
		try {
			put(KEY_ID, id);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_ID + " of " + KEY);
		}
	}

	public String getEmail() {
		try {
			if (!isNull(KEY_EMAIL)) {
				return getString(KEY_EMAIL);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setEmail(String email) {
		try {
			put(KEY_EMAIL, email);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_EMAIL + " of " + KEY);
		}
	}

	public String getName() {
		try {
			if (!isNull(KEY_NAME)) {
				return getString(KEY_NAME);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setName(String name) {
		try {
			put(KEY_NAME, name);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_NAME + " of " + KEY);
		}
	}

	public String getFacebookId() {
		try {
			if (!isNull(KEY_FACEBOOK_ID)) {
				return getString(KEY_FACEBOOK_ID);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setFacebookId(String facebookId) {
		try {
			put(KEY_FACEBOOK_ID, facebookId);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_FACEBOOK_ID + " of " + KEY);
		}
	}

	public String getPhoneNumber() {
		try {
			if (!isNull(KEY_PHONE_NUMBER)) {
				return getString(KEY_PHONE_NUMBER);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setPhoneNumber(String phoneNumber) {
		try {
			put(KEY_PHONE_NUMBER, phoneNumber);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_PHONE_NUMBER + " of " + KEY);
		}
	}

	public String getStreet() {
		try {
			if (!isNull(KEY_STREET)) {
				return getString(KEY_STREET);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setStreet(String street) {
		try {
			put(KEY_STREET, street);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_STREET + " of " + KEY);
		}
	}

	public String getCity() {
		try {
			if (!isNull(KEY_CITY)) {
				return getString(KEY_CITY);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setCity(String city) {
		try {
			put(KEY_CITY, city);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_CITY + " of " + KEY);
		}
	}

	public String getZip() {
		try {
			if (!isNull(KEY_ZIP)) {
				return getString(KEY_ZIP);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setZip(String zip) {
		try {
			put(KEY_ZIP, zip);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_ZIP + " of " + KEY);
		}
	}

	public String getCountry() {
		try {
			if (!isNull(KEY_COUNTRY)) {
				return getString(KEY_COUNTRY);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setCountry(String country) {
		try {
			put(KEY_COUNTRY, country);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_COUNTRY + " of " + KEY);
		}
	}

	public String getBirthday() {
		try {
			if (!isNull(KEY_BIRTHDAY)) {
				return getString(KEY_BIRTHDAY);
			}
		} catch (JSONException e) {
			// Ignore
		}
		return null;
	}

	public void setBirthday(String birthday) {
		try {
			put(KEY_BIRTHDAY, birthday);
		} catch (JSONException e) {
			ApptentiveLog.e("Unable to set field " + KEY_BIRTHDAY + " of " + KEY);
		}
	}

	@SuppressWarnings("unchecked") // We check it coming in.
	public CustomData getCustomData() {
		if(!isNull(KEY_CUSTOM_DATA)) {
			try {
				return new CustomData(getJSONObject(KEY_CUSTOM_DATA));
			} catch (JSONException e) {
				// Ignore
			}
		}
		return null;
	}

	public void setCustomData(CustomData customData) {
		try {
			put(KEY_CUSTOM_DATA, customData);
		} catch (JSONException e) {
			ApptentiveLog.w("Error adding %s to Device.", KEY_CUSTOM_DATA);
		}
	}
}
