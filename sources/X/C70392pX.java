package X;

import kotlin.jvm.internal.AqS39S1000000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.2pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70392pX {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final InterfaceC65784Pro<C76800UCe> LJII;
    public final XKW LJIIIIZZ;
    public final XLM LJIIIZ;
    public final C79863Bm LJIIJ;
    public C70172pB LJIIJJI;
    public final C62822Ol8 LJIIL;

    public final void LIZ() {
        if (this.LIZJ == null) {
            return;
        }
        synchronized (this) {
            if (this.LJIIJJI == null) {
                this.LJIIJJI = new C70172pB(this.LJIIJ, this.LIZJ, this.LIZIZ);
            }
        }
    }

    public C70392pX(String linkId, String sharerUid, String str, String awemeId, String checksum, String sharedTimestamp, boolean z, AqS39S1000000_1 aqS39S1000000_1) {
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(linkId, "linkId");
        o.LJIIIZ(sharerUid, "sharerUid");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(checksum, "checksum");
        o.LJIIIZ(sharedTimestamp, "sharedTimestamp");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LIZ = linkId;
        this.LIZIZ = sharerUid;
        this.LIZJ = str;
        this.LIZLLL = awemeId;
        this.LJ = checksum;
        this.LJFF = sharedTimestamp;
        this.LJI = z;
        this.LJII = aqS39S1000000_1;
        this.LJIIIIZZ = ioDispatcher;
        XLM LIZ = V8H.LIZ(C70212pF.LIZ);
        this.LJIIIZ = LIZ;
        this.LJIIJ = V1M.LIZLLL(LIZ);
        this.LJIIL = C221108m2.LIZIZ(C70442pc.LJLIL);
    }
}
