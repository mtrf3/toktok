package X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05630Jz {
    public static void LIZ(int i, String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, i);
        } catch (JSONException e) {
            C0NB.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LIZIZ(String str, JSONArray jSONArray, JSONObject jSONObject) {
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e) {
            C0NB.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            C0NB.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LIZLLL(JSONObject jSONObject, String str, double d) {
        try {
            jSONObject.put(str, d);
        } catch (JSONException e) {
            C0NB.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJ(JSONObject jSONObject, String str, float f) {
        try {
            jSONObject.put(str, f);
        } catch (JSONException e) {
            C0NB.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJFF(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            C0NB.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJI(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C0NB.LJFF("BaseMonitor", "", e);
        }
    }

    public static void LJII(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
        } catch (JSONException e) {
            C0NB.LJFF("BaseMonitor", "", e);
        }
    }
}
