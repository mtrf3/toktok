package com.bytedance.mt.protector.impl;

import X.C65415Plr;
import X.C78685UuP;
import X.EnumC65856Psy;
import X.PTF;
import com.bytedance.mt.protector.SelfDataManager;
import com.google.gson.j;
import com.google.gson.m;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes12.dex */
public class JSONArrayProtectorUtils {
    public static JSONArray createJSONArray(JSONTokener jSONTokener) {
        String str;
        if (C65415Plr.LIZIZ()) {
            try {
                return new JSONArray(jSONTokener);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ == null) {
                    if (jSONTokener != null) {
                        str = jSONTokener.toString();
                    } else {
                        str = "null JSONTokener";
                    }
                    addSelfData("createJSONArray", th, str);
                    throw th;
                }
                Object obj = LIZ.LIZ;
                if (obj instanceof j) {
                    return new JSONArray(obj.toString());
                }
                return null;
            }
        }
        return new JSONArray(jSONTokener);
    }

    public static JSONArray createJSONArray(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return new JSONArray(str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return new JSONArray(obj.toString());
                    }
                    return null;
                }
                addSelfData("createJSONArray", th, str);
                throw th;
            }
        }
        return new JSONArray(str);
    }

    public static boolean getBoolean(JSONArray jSONArray, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONArray.getBoolean(i);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return ((Boolean) LIZ.LIZ).booleanValue();
                }
                throw th;
            }
        }
        return jSONArray.getBoolean(i);
    }

    public static double getDouble(JSONArray jSONArray, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONArray.getDouble(i);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return ((Double) LIZ.LIZ).doubleValue();
                }
                throw th;
            }
        }
        return jSONArray.getDouble(i);
    }

    public static int getInt(JSONArray jSONArray, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONArray.getInt(i);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return ((Integer) LIZ.LIZ).intValue();
                }
                throw th;
            }
        }
        return jSONArray.getInt(i);
    }

    public static JSONArray getJSONArray(JSONArray jSONArray, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONArray.getJSONArray(i);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return new JSONArray(obj.toString());
                    }
                    return null;
                }
                throw th;
            }
        }
        return jSONArray.getJSONArray(i);
    }

    public static JSONObject getJSONObject(JSONArray jSONArray, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONArray.getJSONObject(i);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return new JSONObject(obj.toString());
                    }
                    return null;
                }
                throw th;
            }
        }
        return jSONArray.getJSONObject(i);
    }

    public static long getLong(JSONArray jSONArray, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONArray.getLong(i);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return ((Long) LIZ.LIZ).longValue();
                }
                throw th;
            }
        }
        return jSONArray.getLong(i);
    }

    public static String getString(JSONArray jSONArray, int i) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONArray.getString(i);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return (String) LIZ.LIZ;
                }
                throw th;
            }
        }
        return jSONArray.getString(i);
    }

    public static void addSelfData(String str, Throwable th, String str2) {
        try {
            String LJJJJJL = C78685UuP.LJJJJJL(th);
            m mVar = new m();
            mVar.LJJIIZ("stackTrace", LJJJJJL);
            mVar.LJJIIZ("inputData", str2);
            SelfDataManager.LJ.LIZ(str, th, mVar);
        } catch (Throwable unused) {
            C65415Plr.LJ.LJ();
        }
    }

    public static void addSelfData(String str, Throwable th, j jVar) {
        String str2;
        if (jVar != null) {
            str2 = jVar.toString();
        } else {
            str2 = "null-param";
        }
        addSelfData(str, th, str2);
    }
}
