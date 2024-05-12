package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Luw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55786Luw {
    public static final java.util.Map<String, String> LIZJ(C238479Xn c238479Xn) {
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("video_link_id", c238479Xn.LIZ);
        String str = c238479Xn.LJII;
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("video_link_item_id", str);
        oszArr[2] = new OSZ("video_link_share_type", String.valueOf(c238479Xn.LJ.getRawValue()));
        oszArr[3] = new OSZ("from", String.valueOf(c238479Xn.LJ.getFollowFrom()));
        return C113554cx.LJJL(oszArr);
    }

    public static final C55773Luj LIZLLL(Intent intent) {
        EnumC57171McB enumC57171McB;
        Integer LJJIL;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "social_share_type");
        if (LLJJIJIIJIL != null && (LJJIL = C38350F3i.LJJIL(LLJJIJIIJIL)) != null) {
            enumC57171McB = LJFF(LJJIL.intValue());
        } else {
            enumC57171McB = null;
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "share_url_item_id");
        if (LLJJIJIIJIL2 == null && (LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "gids")) == null) {
            LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "aweme_id");
        }
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "share_url_utm_source");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "share_url_link_id");
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(intent, "share_url_user_id");
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(intent, "share_sec_url_user_id");
        boolean booleanExtra = intent.getBooleanExtra("share_expose_sharer", false);
        String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(intent, "share_url_checksum");
        String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(intent, "share_url_timestamp");
        String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(intent, "invitation_scene");
        String LLJJIJIIJIL10 = C16880lQ.LLJJIJIIJIL(intent, "refer");
        String LLJJIJIIJIL11 = C16880lQ.LLJJIJIIJIL(intent, "share_url");
        if (LLJJIJIIJIL11 == null) {
            LLJJIJIIJIL11 = "";
        }
        return new C55773Luj(enumC57171McB, LLJJIJIIJIL2, LLJJIJIIJIL3, LLJJIJIIJIL4, LLJJIJIIJIL5, LLJJIJIIJIL6, booleanExtra, LLJJIJIIJIL7, LLJJIJIIJIL8, LLJJIJIIJIL9, LLJJIJIIJIL10, LLJJIJIIJIL11, intent.getIntExtra("share_link_mode", 0));
    }

    public static final C238479Xn LJ(User user) {
        if (user == null) {
            return null;
        }
        C238479Xn c238479Xn = (C238479Xn) ((LinkedHashMap) C55784Luu.LIZ).get(Integer.valueOf(user.hashCode()));
        if (c238479Xn == null) {
            java.util.Map<String, C238479Xn> map = C55784Luu.LIZIZ;
            String uid = user.getUid();
            if (uid == null) {
                uid = "_uid_";
            }
            return (C238479Xn) ((LinkedHashMap) map).get(uid);
        }
        return c238479Xn;
    }

    public static final EnumC57171McB LJFF(int i) {
        for (EnumC57171McB enumC57171McB : EnumC57171McB.values()) {
            if (enumC57171McB.getRawValue() == i) {
                return enumC57171McB;
            }
        }
        return null;
    }

    public static final java.util.Map<String, String> LJI(C238479Xn c238479Xn) {
        if (c238479Xn != null) {
            OSZ[] oszArr = new OSZ[2];
            oszArr[0] = new OSZ("share_type", String.valueOf(c238479Xn.LJ.getRawValue()));
            String str = c238479Xn.LJFF;
            if (str == null) {
                str = "";
            }
            oszArr[1] = new OSZ("share_source", str);
            return C113554cx.LJJL(oszArr);
        }
        return null;
    }

    public static final String LIZ(String str, EnumC57171McB type) {
        o.LJIIIZ(type, "type");
        if (str.length() == 0 || s.LJJJLZIJ(str, "social_share_type", false)) {
            return str;
        }
        C38281F0r c38281F0r = new C38281F0r(str);
        LIZIZ(c38281F0r, type);
        return c38281F0r.LJ();
    }

    public static final void LIZIZ(C38281F0r c38281F0r, EnumC57171McB type) {
        o.LJIIIZ(type, "type");
        c38281F0r.LIZ(type.getRawValue(), "social_share_type");
    }
}
