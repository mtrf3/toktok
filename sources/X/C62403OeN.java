package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.OeN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62403OeN {
    public static boolean LIZ;
    public static final User LIZIZ = ((RBX) HG3.LJIILL()).getCurUser();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C62531OgR.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZJ.getValue();
    }

    public static boolean LIZIZ(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return o.LJ(simpleDateFormat.format(new Date(j)), simpleDateFormat.format(new Date(System.currentTimeMillis())));
    }

    public static void LIZJ(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str2, "groupId");
        LIZLLL.LJIIIZ("show_reason", str);
        LIZLLL.LJIIIZ("group_id", str2);
        FMX.LJIIL("share_head_panel_show", LIZLLL.LIZ);
    }
}
