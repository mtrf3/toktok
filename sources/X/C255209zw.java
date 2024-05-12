package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C255209zw {
    public static boolean LIZ;

    public static void LIZJ() {
        String str;
        int i;
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(AV1.LJIIJJI() ? 1 : 0, "is_child_mode");
        if (C255199zv.LJIILIIL()) {
            str = "click_set_up_profile";
        } else {
            str = "click_edit_profile";
        }
        c188727au.LJIIIZ("enter_method", str);
        User LJ = C255199zv.LJ();
        if (LJ != null && LJ.getFansCount() >= 1000) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "fans_1K");
        FMX.LJIIL("edit_profile", c188727au.LIZ);
    }

    public static void LJ() {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(C255199zv.LIZLLL ? 1 : 0, "click_upload_video_show");
        int i = 1;
        c188727au.LIZLLL(!C255199zv.LJIIIZ() ? 1 : 0, "add_photo_icon");
        c188727au.LIZLLL(!C255199zv.LJII() ? 1 : 0, "add_name_icon");
        if (C255199zv.LIZ() || !C255199zv.LJII) {
            i = 0;
        }
        c188727au.LIZLLL(i, "add_bio_icon");
        if (C255199zv.LIZLLL) {
            c188727au.LJI("wording", C255199zv.LJ);
        }
        FMX.LJIIL("personal_homepage_interface_show", c188727au.LIZ);
    }

    public static void LJI() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        FMX.LJIIL("shoot_bubble_show", c188727au.LIZ);
    }

    public static void LIZ(String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "actionType");
        LIZLLL.LJIIIZ("enter_from", "personal_homepage");
        LIZLLL.LJIIIZ("action_type", str);
        FMX.LJIIL("bind_phone_num_bar", LIZLLL.LIZ);
    }

    public static void LJFF(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        if (z == LIZ) {
            return;
        }
        LIZ = z;
        ArrayList LIZJ = C255199zv.LIZJ();
        int i5 = 0;
        if (!((C9YH) ListProtector.get(LIZJ, 0)).LJLJJL || !C255199zv.LIZJ) {
            i = -1;
            i2 = -1;
            i3 = -1;
            i4 = -1;
        } else {
            Iterator it = LIZJ.iterator();
            int i6 = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            while (it.hasNext()) {
                int i7 = i6 + 1;
                int i8 = ((C9YH) it.next()).LJLILLLLZI;
                if (i8 == R.string.hgh) {
                    i = i6;
                } else if (i8 == R.string.hgd) {
                    i2 = i6;
                } else if (i8 == R.string.c9t) {
                    i4 = i6;
                } else if (i8 == R.string.hg_) {
                    i3 = i6;
                }
                i6 = i7;
            }
        }
        if (!FMX.LIZJ("personal_homepage_profile_status")) {
            return;
        }
        C188727au c188727au = new C188727au();
        if (C255199zv.LJIILIIL()) {
            str = "set_up_profile";
        } else {
            str = "edit_profile";
        }
        c188727au.LJIIIZ("edit_profile_icon", str);
        c188727au.LIZLLL(C255199zv.LIZLLL ? 1 : 0, "create_video_show");
        c188727au.LIZLLL(C255199zv.LJI, "personal_videos_cnt");
        c188727au.LIZLLL(i, "photo_card_order");
        c188727au.LIZLLL(C255199zv.LJIIIZ() ? 1 : 0, "photo_card_edited");
        c188727au.LIZLLL(i2, "name_card_order");
        c188727au.LIZLLL(C255199zv.LJII() ? 1 : 0, "name_card_edited");
        c188727au.LIZLLL(i3, "bio_card_order");
        c188727au.LIZLLL(C255199zv.LIZ() ? 1 : 0, "bio_card_edited");
        if (z) {
            str2 = "enter";
        } else {
            str2 = "leave";
        }
        c188727au.LJIIIZ("enter_from", str2);
        User LJ = C255199zv.LJ();
        if (LJ != null && LJ.getFansCount() >= 1000) {
            i5 = 1;
        }
        c188727au.LIZLLL(i5, "fans_1K");
        if (C255199zv.LJIIJJI()) {
            c188727au.LIZLLL(C255199zv.LJIIIIZZ() ? 1 : 0, "phone_num_card_added");
            c188727au.LIZLLL(i4, "phone_num_card_order");
        }
        FMX.LJIIL("personal_homepage_profile_status", c188727au.LIZ);
    }

    public static void LIZLLL(String str, boolean z) {
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", str);
        c188727au.LJIIIZ("enter_method", "click_card");
        if (z) {
            str2 = "add";
        } else {
            str2 = "edit";
        }
        c188727au.LJIIIZ("btn_name", str2);
        FMX.LJIIL("enter_personal_homepage_click_add", c188727au.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3) {
        String str4;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("enter_method", "click_create_video");
        c188727au.LJIIIZ("shoot_way", "direct_shoot");
        c188727au.LJIIIZ("creation_id", str2);
        if (C255199zv.LIZ()) {
            str4 = "set_up_profile";
        } else {
            str4 = "edit_profile";
        }
        c188727au.LJIIIZ("btn_name", str4);
        c188727au.LIZLLL(C255199zv.LIZLLL ? 1 : 0, "with_guidence");
        c188727au.LJIIIZ("tab_name", C255199zv.LIZIZ);
        if (str3 != null && str3.length() != 0) {
            c188727au.LJI("wording", str3);
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
