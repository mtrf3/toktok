package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.Skin;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BJB {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static final BJA LJFF = new BJA(0);
    public static String LJI = "";
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(BJC.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(B7U.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(B7V.LJLIL);
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(B7T.LJLIL);

    public static HashMap LIZIZ() {
        return (HashMap) LJIIIIZZ.getValue();
    }

    public static List LIZJ() {
        return (List) LJII.getValue();
    }

    public static java.util.Map LIZ() {
        BJA bja = (BJA) ORZ.LLFII(LIZJ());
        if (bja == null) {
            bja = LJFF;
        }
        if (bja.LJLIL.length() == 0) {
            if (bja.LJLILLLLZI.length() > 0) {
                return E2C.LIZJ("drawer_from_room_id", bja.LJLILLLLZI);
            }
            return C113554cx.LJJJLIIL();
        }
        return bja.L();
    }

    public static void LIZLLL(boolean z) {
        if (z && LIZIZ > 0) {
            return;
        }
        LIZ = 0L;
        LIZIZ = 0L;
        LIZJ = 0L;
        LIZLLL = 0L;
        ((List) LJIIIZ.getValue()).clear();
        ((List) LJIIJ.getValue()).clear();
        LIZIZ().clear();
    }

    public static void LJ(boolean z) {
        if (LJ) {
            return;
        }
        LJ = true;
        if (z) {
            LIZIZ().put("is_left_page", "1");
        } else {
            LIZIZ().put("is_left_page", CardStruct.IStatusCode.DEFAULT);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_entrance_impr_duration");
        LIZ2.LJJIFFI(LIZIZ());
        C62822Ol8 c62822Ol8 = LJIIIZ;
        LIZ2.LJIJJ(Integer.valueOf(((List) c62822Ol8.getValue()).size()), "room_cnt");
        LIZ2.LJIJJ(c62822Ol8.getValue().toString(), "room_id_list");
        LIZ2.LJIJJ(LJIIJ.getValue().toString(), "anchor_id_list");
        LIZ2.LJIJJ("drawer", "enter_from_merge");
        LIZ2.LJIJJ("live_cover", "enter_method");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        }
        LIZLLL(false);
    }

    public static void LJFF(Room room) {
        Object obj;
        String str;
        Skin skin;
        BJA bja = LJFF;
        String str2 = "";
        if (room == null) {
            obj = "";
        } else {
            obj = Long.valueOf(room.getId());
        }
        String obj2 = obj.toString();
        bja.getClass();
        o.LJIIIZ(obj2, "<set-?>");
        bja.LJLILLLLZI = obj2;
        if (room != null && (skin = room.skin) != null) {
            str = skin.scene;
        } else {
            str = null;
        }
        if (o.LJ(str, "game_drawer")) {
            str2 = "esports";
        } else if (o.LJ(str, "game_drawer_drops")) {
            str2 = "more_drops";
        }
        bja.LJLIL = str2;
    }
}
