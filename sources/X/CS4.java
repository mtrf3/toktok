package X;

import com.bytedance.android.live.publicscreen.impl.PublicScreenService;

/* loaded from: classes6.dex */
public final class CS4 implements CS2 {
    public final /* synthetic */ C72242sW LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ PublicScreenService LIZJ;
    public final /* synthetic */ CS2 LIZLLL = null;

    public CS4(C72242sW c72242sW, int i, PublicScreenService publicScreenService) {
        this.LIZ = c72242sW;
        this.LIZIZ = i;
        this.LIZJ = publicScreenService;
    }

    @Override // X.CS2
    public final void LIZ(long j) {
        CS2 cs2;
        this.LIZ.element = j;
        if (this.LIZIZ == this.LIZJ.LJLJI.size() - 1 && (cs2 = this.LIZLLL) != null) {
            cs2.LIZ(this.LIZ.element);
        }
    }
}
