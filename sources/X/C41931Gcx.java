package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gcx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41931Gcx extends QXX {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;

    @Override // X.QXX
    public final boolean LLJJJJLIIL(QXX last) {
        o.LJIIIZ(last, "last");
        if (o.LJ(last, this)) {
            return true;
        }
        if (!(last instanceof C41931Gcx)) {
            return false;
        }
        C41931Gcx c41931Gcx = (C41931Gcx) last;
        if (o.LJ(this.LJLIL, c41931Gcx.LJLIL) && this.LJLILLLLZI == c41931Gcx.LJLILLLLZI && this.LJLJI == c41931Gcx.LJLJI) {
            return true;
        }
        return false;
    }

    public C41931Gcx(String videoPath, long j, long j2) {
        o.LJIIIZ(videoPath, "videoPath");
        this.LJLIL = videoPath;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
