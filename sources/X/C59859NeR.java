package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;

/* renamed from: X.NeR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59859NeR {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ() {
        if (C00F.LIZ(31744, 0, "music_pick_page_type", true) == 0 || CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        int LIZ2 = C00F.LIZ(31744, 0, "music_pick_page_type", true);
        if ((LIZ2 != 1 && LIZ2 != 2) || !LIZ()) {
            return false;
        }
        return true;
    }
}
