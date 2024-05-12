package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.I6w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46086I6w implements InterfaceC126004x2 {
    public final /* synthetic */ C46072I6i LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final /* synthetic */ AVMusic LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ boolean LJFF;

    @Override // X.InterfaceC126004x2
    public final void onFailed() {
        this.LIZ.LIZIZ.LJJIJLIJ(false, true, true);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC126004x2
    public final void LIZ(int i) {
        if (i < 0) {
            this.LIZ.LIZIZ.LJJIJLIJ(false, true, true);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        C46072I6i c46072I6i = this.LIZ;
        c46072I6i.LJIIL = 1.0f;
        c46072I6i.LJII(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LIZIZ);
    }

    public C46086I6w(C46072I6i c46072I6i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, AVMusic aVMusic, int i, boolean z, boolean z2) {
        this.LIZ = c46072I6i;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = aVMusic;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = z2;
    }
}
