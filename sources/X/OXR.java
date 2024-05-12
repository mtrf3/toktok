package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OXR {
    public static final java.util.Map<Integer, String> LIZ = C113554cx.LJJL(new OSZ(3, "url_form"), new OSZ(2, "photo_form"), new OSZ(1, "url_photo_form"));

    public static void LIZIZ(String bizTag, String bisSceneTag, String containerType, String params) {
        o.LJIIIZ(bizTag, "bizTag");
        o.LJIIIZ(bisSceneTag, "bisSceneTag");
        o.LJIIIZ(containerType, "containerType");
        o.LJIIIZ(params, "params");
        C188727au c188727au = new C188727au();
        c188727au.LJI("business_tag_1", bizTag);
        c188727au.LJI("business_tag_2", bisSceneTag);
        c188727au.LJI("container_type", containerType);
        c188727au.LJI("params", params);
        FMX.LJIIL("share_jsb_panel_show", c188727au.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String platform, String str4, String str5) {
        o.LJIIIZ(platform, "platform");
        C188727au c188727au = new C188727au();
        c188727au.LJI("business_tag_1", str);
        c188727au.LJI("business_tag_2", str2);
        c188727au.LJI("enter_from", "h5_page");
        c188727au.LJI("container_type", str3);
        c188727au.LJI("platform", platform);
        c188727au.LJI("share_form", str4);
        c188727au.LJI("url", str5);
        FMX.LJIIL("h5_share", c188727au.LIZ);
    }
}
