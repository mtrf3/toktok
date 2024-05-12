package X;

import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import kotlin.jvm.internal.o;

/* renamed from: X.6ES, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ES {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZLLL() {
        if (AnchorListServiceImpl.LIZLLL().LIZJ(EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) && ECommerceAnchorService.LJJJJI().LJJIIZI()) {
            return 1;
        }
        return 0;
    }

    public static void LIZJ(int i, C188727au c188727au) {
        if (i == C6ER.POSSIBLE_SUBSCRIBE_LONG_VIDEO_CHECK_TYPE.getCheckType()) {
            c188727au.LIZLLL(0, "is_ecommerce_video");
            c188727au.LIZLLL(0, "is_long_video");
            c188727au.LIZLLL(1, "is_sub_only_video");
        } else {
            if (i == C6ER.SUBSCRIBE_VIDEO_CHECK_TYPE.getCheckType()) {
                c188727au.LIZLLL(0, "is_long_video");
                c188727au.LIZLLL(1, "is_sub_only_video");
                c188727au.LIZLLL(LIZLLL(), "is_ecommerce_video");
                return;
            }
            c188727au.LIZLLL(0, "is_sub_only_video");
        }
    }

    public static void LIZ(int i, int i2, C188727au c188727au) {
        if (i == EnumC139485dg.ECOMMERCE.getScene()) {
            c188727au.LIZLLL(LIZLLL(), "is_ecommerce_video");
            c188727au.LIZLLL(0, "is_long_video");
            c188727au.LIZLLL(i2, "is_sub_only_video");
            c188727au.LIZLLL(0, "is_short_video");
            return;
        }
        if (i == EnumC139485dg.LONG_VIDEO.getScene() || i == EnumC139485dg.LONG_VIDEO_NEW.getScene()) {
            c188727au.LIZLLL(0, "is_ecommerce_video");
            c188727au.LIZLLL(1, "is_long_video");
            c188727au.LIZLLL(0, "is_sub_only_video");
            c188727au.LIZLLL(0, "is_short_video");
            return;
        }
        if (i != EnumC139485dg.SHORT_VIDEO.getScene()) {
            return;
        }
        c188727au.LIZLLL(0, "is_ecommerce_video");
        c188727au.LIZLLL(0, "is_long_video");
        c188727au.LIZLLL(0, "is_sub_only_video");
        c188727au.LIZLLL(1, "is_short_video");
    }

    public static void LIZIZ(int i, int i2, int i3, int i4, String str, String str2, String enterFrom, String contentType, String contentSource) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LJIIIZ("shoot_way", str2);
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LIZLLL(i2, "creation_duration");
        c188727au.LIZLLL(i3, "is_copyright_sound_removed");
        LIZ(i, i4, c188727au);
        FMX.LJIIL("sound_copyright_issue_page_close", c188727au.LIZ);
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3) {
        C188727au LIZ2 = C78928UyK.LIZ(str4, "contentType", str5, "contentSource");
        LIZ2.LJIIIZ("creation_id", str);
        LIZ2.LJIIIZ("shoot_way", str2);
        LIZ2.LJIIIZ("draft_id", str3);
        LIZ2.LJIIIZ("enter_from", "video_edit_page");
        LIZ2.LJIIIZ("content_type", str4);
        LIZ2.LJIIIZ("content_source", str5);
        LIZ2.LJIIIZ("music_id", str6);
        LIZ(i, i3, LIZ2);
        LIZJ(i2, LIZ2);
        FMX.LJIIL("sound_copyright_check_page_show", LIZ2.LIZ);
    }

    public static void LJ(String str, String str2, String str3, String enterFrom, String contentType, String contentSource, int i, String str4, int i2, int i3) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LJIIIZ("shoot_way", str2);
        c188727au.LJIIIZ("draft_id", str3);
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LJIIIZ("music_id", str4);
        c188727au.LIZLLL(i2, "creation_duration");
        LIZ(i, i3, c188727au);
        FMX.LJIIL("sound_copyright_change_sound_click", c188727au.LIZ);
    }

    public static void LJI(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, long j, int i3, int i4) {
        C188727au LIZ2 = C78928UyK.LIZ(str4, "contentType", str5, "contentSource");
        LIZ2.LJIIIZ("creation_id", str);
        LIZ2.LJIIIZ("shoot_way", str2);
        LIZ2.LJIIIZ("draft_id", str3);
        LIZ2.LJIIIZ("enter_from", "video_edit_page");
        LIZ2.LJIIIZ("content_type", str4);
        LIZ2.LJIIIZ("content_source", str5);
        LIZ2.LJIIIZ("music_id", str6);
        LIZ2.LIZLLL(i2, "sound_copyright_check_result");
        LIZ2.LJ(j, "duration");
        LIZ2.LIZLLL(i3, "creation_duration");
        LIZ(i, i4, LIZ2);
        FMX.LJIIL("sound_copyright_check_result", LIZ2.LIZ);
    }

    public static void LJII(int i, int i2, String str, String str2, int i3, String str3, String enterFrom, String enterMethod, String contentType, String contentSource, String str4) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LJIIIZ("shoot_way", str2);
        c188727au.LJIIIZ("draft_id", str3);
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LJIIIZ("music_id", str4);
        c188727au.LIZLLL(i2, "creation_duration");
        if (enterMethod.length() > 0) {
            c188727au.LJI("enter_method", enterMethod);
        }
        LIZ(i, i3, c188727au);
        FMX.LJIIL("sound_copyright_issue_page_show", c188727au.LIZ);
    }
}
