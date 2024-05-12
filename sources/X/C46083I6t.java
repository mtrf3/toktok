package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.I6t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46083I6t implements InterfaceC126004x2 {
    public final /* synthetic */ C46072I6i LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final /* synthetic */ AVMusic LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ boolean LJ;

    @Override // X.InterfaceC126004x2
    public final void onFailed() {
        this.LIZ.LIZIZ.LJJIJLIJ(false, true, true);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LIZ.LJIIIZ.Nd0(null);
    }

    @Override // X.InterfaceC126004x2
    public final void LIZ(int i) {
        C46072I6i c46072I6i = this.LIZ;
        AVMusic aVMusic = this.LIZJ;
        c46072I6i.LIZLLL = aVMusic;
        c46072I6i.LJIIIZ().LIZJ = aVMusic;
        this.LIZ.LIZIZ.LJJIIZ(i);
        this.LIZ.LIZIZ.LJJIJLIJ(true, this.LIZLLL, this.LJ);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LIZ.LIZIZ.LJJJJZI();
        this.LIZ.LJIIIZ.Nd0(null);
        this.LIZ.LJIILIIL = 1.0f;
    }

    public C46083I6t(C46072I6i c46072I6i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, AVMusic aVMusic, boolean z, boolean z2) {
        this.LIZ = c46072I6i;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = aVMusic;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
