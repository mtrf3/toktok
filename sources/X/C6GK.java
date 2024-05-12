package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6GK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String groupId, String authorId, String fontSelected) {
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(fontSelected, "fontSelected");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "text_video_sticker");
        c188727au.LJIIIZ("enter_method", "click_button");
        c188727au.LJIIIZ("group_id", groupId);
        c188727au.LJIIIZ("author_id", authorId);
        c188727au.LJIIIZ("font_selected", fontSelected);
        FMX.LJIIL("text_video_sticker_confirm", c188727au.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C188727au LIZ2 = C78928UyK.LIZ(str2, "groupId", str3, "authorId");
        LIZ2.LJIIIZ("enter_from", "create_video_sticker");
        LIZ2.LJIIIZ("enter_method", str);
        LIZ2.LJIIIZ("group_id", str2);
        LIZ2.LJIIIZ("author_id", str3);
        FMX.LJIIL("text_video_sticker_entrance", LIZ2.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "groupId", str2, "authorId");
        LIZ2.LJIIIZ("enter_from", "crop_video_sticker");
        LIZ2.LJIIIZ("enter_method", "click_button");
        LIZ2.LJIIIZ("group_id", str);
        LIZ2.LJIIIZ("action", str4);
        LIZ2.LJIIIZ("author_id", str2);
        LIZ2.LJIIIZ("crop_size", str3);
        FMX.LJIIL("crop_video_sticker_dismiss", LIZ2.LIZ);
    }

    public static void LIZIZ(long j, String str, String str2, boolean z, boolean z2, boolean z3) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "groupId", str2, "authorId");
        LIZ2.LJIIIZ("enter_from", "create_video_sticker");
        LIZ2.LJIIIZ("group_id", str);
        LIZ2.LJIIIZ("author_id", str2);
        LIZ2.LIZLLL(z ? 1 : 0, "has_text");
        LIZ2.LIZLLL(z2 ? 1 : 0, "has_crop");
        LIZ2.LJ(j, "video_sticker_duration");
        LIZ2.LIZLLL(z3 ? 1 : 0, "pass_dm_moderation");
        FMX.LJIIL("finish_edit_video_sticker", LIZ2.LIZ);
    }
}
