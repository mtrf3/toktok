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
public class JSONObjectProtectorUtils {
    public static JSONObject createJSONObject(JSONTokener jSONTokener) {
        String str;
        if (C65415Plr.LIZIZ()) {
            try {
                return new JSONObject(jSONTokener);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ == null) {
                    if (jSONTokener != null) {
                        str = jSONTokener.toString();
                    } else {
                        str = "null JSONTokener";
                    }
                    addSelfData("createJSONObject", th, str);
                    throw th;
                }
                Object obj = LIZ.LIZ;
                if (obj instanceof j) {
                    return new JSONObject(obj.toString());
                }
                return null;
            }
        }
        return new JSONObject(jSONTokener);
    }

    public static JSONObject createJSONObject(String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return new JSONObject(str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return new JSONObject(obj.toString());
                    }
                    return null;
                }
                addSelfData("createJSONObject", th, str);
                throw th;
            }
        }
        return new JSONObject(str);
    }

    public static boolean getBoolean(JSONObject jSONObject, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONObject.getBoolean(str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return ((Boolean) LIZ.LIZ).booleanValue();
                }
                throw th;
            }
        }
        return jSONObject.getBoolean(str);
    }

    public static double getDouble(JSONObject jSONObject, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONObject.getDouble(str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return ((Double) LIZ.LIZ).doubleValue();
                }
                throw th;
            }
        }
        return jSONObject.getDouble(str);
    }

    public static int getInt(JSONObject jSONObject, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONObject.getInt(str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return ((Integer) LIZ.LIZ).intValue();
                }
                throw th;
            }
        }
        return jSONObject.getInt(str);
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONObject.getJSONArray(str);
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
        return jSONObject.getJSONArray(str);
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONObject.getJSONObject(str);
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
        return jSONObject.getJSONObject(str);
    }

    public static long getLong(JSONObject jSONObject, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONObject.getLong(str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return ((Long) LIZ.LIZ).longValue();
                }
                throw th;
            }
        }
        return jSONObject.getLong(str);
    }

    public static String getString(JSONObject jSONObject, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return (String) LIZ.LIZ;
                }
                throw th;
            }
        }
        return jSONObject.getString(str);
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
