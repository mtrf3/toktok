package X;

import com.ss.android.ugc.aweme.nows.cache.NowSelfAwemeDatabase;

/* loaded from: classes15.dex */
public final class VFJ {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(VFK.LJLIL);
    public static final XI8 LIZIZ;

    static {
        C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
        c38027EwB.LIZIZ = "serial-now-aweme-cache";
        LIZIZ = new XI8(C37191Eih.LIZ(c38027EwB));
    }

    public static NowSelfAwemeDatabase LIZ() {
        return (NowSelfAwemeDatabase) LIZ.getValue();
    }
}
