package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173156qt {
    public static final /* synthetic */ int LIZ = 0;

    public static C145995oB LIZ(C173166qu c173166qu) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(c173166qu.LIZ, "status");
        c145995oB.LIZ(c173166qu.LIZIZ, "error_code");
        String str = c173166qu.LIZJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(c173166qu.LIZLLL, "duration");
        String str3 = c173166qu.LJ;
        if (str3 == null) {
            str3 = "";
        }
        c145995oB.LJI("creation_id", str3);
        String str4 = c173166qu.LJFF;
        if (str4 == null) {
            str4 = "";
        }
        c145995oB.LJI("shoot_way", str4);
        String str5 = c173166qu.LJI;
        if (str5 != null) {
            str2 = str5;
        }
        c145995oB.LJI("template_id", str2);
        return c145995oB;
    }

    public static void LIZIZ(C173166qu c173166qu, String str, String str2) {
        C145995oB LIZ2 = LIZ(c173166qu);
        LIZ2.LJI("template_url", str);
        LIZ2.LJI("template_md5", str2);
        FMX.LJIIL("tool_performance_cutsame_concat", LIZ2.LIZ);
    }

    public static void LIZJ(C173166qu c173166qu, String str, String str2) {
        C145995oB LIZ2 = LIZ(c173166qu);
        LIZ2.LJI("template_url", str);
        LIZ2.LJI("template_md5", str2);
        FMX.LJIIL("tool_performance_cutsame_preview", LIZ2.LIZ);
    }

    public static void LIZLLL(C173166qu params, String str, boolean z) {
        o.LJIIIZ(params, "params");
        C145995oB LIZ2 = LIZ(params);
        LIZ2.LJI("from", str);
        LIZ2.LIZ(z ? 1 : 0, "from_cache");
        FMX.LJIIL("tool_performance_mv_fetch_list", LIZ2.LIZ);
    }

    public static void LJFF(C173166qu c173166qu, String resUrl, String str, String str2) {
        o.LJIIIZ(resUrl, "resUrl");
        C145995oB LIZ2 = LIZ(c173166qu);
        LIZ2.LJI("from", str2);
        LIZ2.LJI("resource_type", "cc_template");
        LIZ2.LJI("template_url", resUrl);
        LIZ2.LJI("template_md5", str);
        FMX.LJIIL("tool_performance_resource_download", LIZ2.LIZ);
    }

    public static void LJ(C173166qu c173166qu, String str, String str2, String str3, String str4) {
        C145995oB LIZ2 = LIZ(c173166qu);
        LIZ2.LJI("from", str3);
        LIZ2.LJI("resource_type", str4);
        LIZ2.LJI("template_url", str);
        LIZ2.LJI("template_md5", str2);
        FMX.LJIIL("tool_performance_mv_process_resource", LIZ2.LIZ);
    }
}
