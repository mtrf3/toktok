package com.ss.bytertc.engine.utils;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class CrashInfoUtil {
    public static volatile Method getAddTagsStaticMethod;
    public static AtomicInteger isApplogOrBDTracker = new AtomicInteger(0);
    public static volatile Method onEventV3StaticMethod;

    public static Object com_ss_bytertc_engine_utils_CrashInfoUtil_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "4520059458784442819"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static void getEventMethod() {
        if (onEventV3StaticMethod == null) {
            getMethodFromAppLog();
        }
        if (onEventV3StaticMethod == null) {
            getMethodFromBDTracker();
        }
    }

    public static void getMethodFromAppLog() {
        try {
            Class.forName("com.ss.android.common.applog.AppLog");
            onEventV3StaticMethod = Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class);
            isApplogOrBDTracker.set(1);
            LogUtil.d("CrashInfoUtil", "upload AppLog Success!");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("upload error (AppLog)");
            LIZ.append(e);
            LogUtil.e("CrashInfoUtil", X1D.LIZIZ(LIZ));
        }
    }

    public static void getMethodFromBDTracker() {
        try {
            onEventV3StaticMethod = Class.forName("com.bytedance.applog.AppLog").getMethod("onEventV3", String.class, JSONObject.class);
            isApplogOrBDTracker.set(2);
            LogUtil.d("CrashInfoUtil", "upload BDTracker Success!");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("upload error (bdtracker)");
            LIZ.append(e);
            LogUtil.e("CrashInfoUtil", X1D.LIZIZ(LIZ));
        }
    }

    public static void getMethodFromNpth() {
        try {
            getAddTagsStaticMethod = Class.forName("com.bytedance.crash.Npth").getMethod("addTags", Map.class);
            LogUtil.d("CrashInfoUtil", "upload Npth Success!");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("upload error (Npth)");
            LIZ.append(e);
            LogUtil.e("CrashInfoUtil", X1D.LIZIZ(LIZ));
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        LogUtil.i("CrashInfoUtil", "addTags");
        getMethodFromNpth();
        if (getAddTagsStaticMethod != null) {
            try {
                com_ss_bytertc_engine_utils_CrashInfoUtil_java_lang_reflect_Method_invoke(getAddTagsStaticMethod, null, new Object[]{map});
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("upload error ");
                LIZ.append(e);
                LogUtil.e("CrashInfoUtil", X1D.LIZIZ(LIZ));
            }
        }
    }

    public static void addTagsReport(String str) {
        LogUtil.d("CrashInfoUtil", "addTagsReport...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
            addTags(hashMap);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addTagsReport catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("CrashInfoUtil", X1D.LIZIZ(LIZ));
        }
    }

    public static void onEventV3Report(String str) {
        LogUtil.d("CrashInfoUtil", "onEventV3Report...");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String jSONObject2 = jSONObject.toString();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("custom", jSONObject2);
            jSONObject3.put("sdk_version", "1.3.0");
            if (!jSONObject.optString("rtc_room_id", "").isEmpty()) {
                jSONObject3.put("sdk_aid", 1304);
            } else {
                jSONObject3.put("sdk_aid", 2255);
            }
            onEventV3("sdk_session_launch", jSONObject3);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onEventV3Report catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("CrashInfoUtil", X1D.LIZIZ(LIZ));
        }
    }

    public static void onEventV3(String str, JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEventV2 monitorName ");
        LIZ.append(str);
        LogUtil.d("CrashInfoUtil", X1D.LIZIZ(LIZ));
        getEventMethod();
        if (onEventV3StaticMethod != null) {
            try {
                com_ss_bytertc_engine_utils_CrashInfoUtil_java_lang_reflect_Method_invoke(onEventV3StaticMethod, null, new Object[]{str, jSONObject});
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("upload error ");
                LIZ2.append(e);
                LogUtil.e("CrashInfoUtil", X1D.LIZIZ(LIZ2));
            }
        }
    }
}
