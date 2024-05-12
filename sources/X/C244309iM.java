package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9iM */
/* loaded from: classes5.dex */
public final class C244309iM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "profile_photo");
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        if (z) {
            str = "checked";
        } else {
            str = "unchecked";
        }
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("change_default_publish_status", c188727au.LIZ);
    }

    public static void LJ(C244319iN c244319iN) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", c244319iN.LIZ);
        c188727au.LJIIIZ("type", c244319iN.LIZIZ.getStrValue());
        String str2 = c244319iN.LIZJ;
        if (str2 != null) {
            c188727au.LJI("enter_from", str2);
        }
        String str3 = c244319iN.LIZLLL;
        if (str3 != null) {
            c188727au.LJI("btn_name", str3);
        }
        Boolean bool = c244319iN.LJ;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "checked";
            } else {
                str = "unchecked";
            }
            c188727au.LJI("default_publish_status", str);
        }
        Boolean bool2 = c244319iN.LJFF;
        if (bool2 != null) {
            c188727au.LIZLLL(!bool2.booleanValue() ? 1 : 0, "complete_status");
        } else {
            c188727au.LIZLLL(-1, "complete_status");
        }
        EnumC243849hc enumC243849hc = c244319iN.LJI;
        if (enumC243849hc != null) {
            c188727au.LJI("platform", enumC243849hc.getStrValue());
        }
        ProfileNgoStruct profileNgoStruct = c244319iN.LJII;
        if (profileNgoStruct != null) {
            c188727au.LJI("ngo_name", profileNgoStruct.getName());
            c188727au.LJI("ngo_link", profileNgoStruct.getDonationLink());
        }
        FMX.LJIIL("save_profile", c188727au.LIZ);
    }

    public static void LJIIJJI(boolean z) {
        FMX.LJIIL("show_profile_bio", C78920UyC.LIZJ(z ? 1 : 0, "complete_status").LIZ);
    }

    public static void LJIIL(boolean z) {
        FMX.LJIIL("show_profile_name", C78920UyC.LIZJ(z ? 1 : 0, "complete_status").LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "profile_photo");
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("default_publish_status", str2);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJIILIIL(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "profile_photo");
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("default_publish_status", str);
        c188727au.LJIIIZ("confirm_method", str2);
        FMX.LJIIL("confirm_default_publish_window", c188727au.LIZ);
    }

    public static void LJFF(int i, String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LIZLLL(i, "status");
        LIZLLL.LJIIIZ("click_method", str2);
        FMX.LJIIL("modify_username_confirm", LIZLLL.LIZ);
    }

    public static void LJI(int i, String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", str2);
        c188727au.LJIIIZ("enter_method", "click_head");
        c188727au.LIZLLL(i, "old_is_avatar");
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJII(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", str3);
        c188727au.LJIIIZ("enter_method", str2);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJIIIIZZ(String str, String str2, HashMap extraMap) {
        o.LJIIIZ(extraMap, "extraMap");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "photo");
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJII(extraMap);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJIIIZ(int i, String str, Integer num, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(i, "status");
        c188727au.LIZLLL(z ? 1 : 0, "is_synced_from_username");
        if (num != null) {
            c188727au.LIZLLL(num.intValue(), "error_code");
        }
        FMX.LJIIL("save_nickname", c188727au.LIZ);
    }

    public static void LJIIJ(int i, String str, String str2, boolean z) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LIZLLL(i, "status");
        LIZLLL.LJIIIZ("error_code", str2);
        LIZLLL.LIZLLL(z ? 1 : 0, "is_synced_from_nickname");
        FMX.LJIIL("save_username", LIZLLL.LIZ);
    }

    public static void LIZJ(Context context, String tag, Long l, Boolean bool, long j, Boolean bool2) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tag, "tag");
        C188727au c188727au = new C188727au();
        if (l != null) {
            c188727au.LJ(l.longValue(), "clean_size");
        }
        String str2 = "true";
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "true";
            } else {
                str = "false";
            }
            c188727au.LJI("has_clean_success", str);
        }
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str2 = "false";
            }
            c188727au.LJI("is_save_success", str2);
        }
        c188727au.LJ(j, "available_storage_size");
        c188727au.LJ(C39687Fhr.LJI(context), "memory_size");
        c188727au.LJ(C39687Fhr.LJFF(), "internal_available_size");
        c188727au.LJI("tag", tag);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(tag);
        LIZ2.append(" availableStorageSize: ");
        LIZ2.append(j);
        LIZ2.append(", cleanSize: ");
        LIZ2.append(l);
        LIZ2.append(", hasCleanSuccess: ");
        LIZ2.append(bool);
        LIZ2.append(", isSaveSuccess: ");
        LIZ2.append(bool2);
        C221018lt.LJFF("test_clean", X1D.LIZIZ(LIZ2));
        FMX.LJIIL("storage_full_status", c188727au.LIZ);
    }

    public static /* synthetic */ void LIZLLL(Context context, String str, Long l, Boolean bool, long j, Boolean bool2, int i) {
        Long l2 = l;
        Boolean bool3 = bool;
        Boolean bool4 = null;
        if ((i & 4) != 0) {
            l2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = null;
        }
        if ((i & 32) == 0) {
            bool4 = bool2;
        }
        LIZJ(context, str, l2, bool3, j, bool4);
    }
}
