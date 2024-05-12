package com.bytedance.bdlocation.utils;

import android.util.Base64;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class EncryptUtil {
    public static String decrypt(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                byte[] decode = Base64.decode(str, 10);
                int length = decode.length;
                for (int i = 0; i < length; i++) {
                    decode[i] = (byte) (decode[i] ^ (-99));
                }
                return new String(decode);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String encrypt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            byte[] bytes = jSONObject.toString().getBytes("utf-8");
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                bytes[i] = (byte) (bytes[i] ^ (-99));
            }
            return Base64.encodeToString(bytes, 10);
        } catch (Exception unused) {
            return null;
        }
    }
}
