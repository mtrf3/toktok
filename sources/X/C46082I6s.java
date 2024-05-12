package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.I6s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46082I6s implements InterfaceC45785Hy1 {
    public final /* synthetic */ C46072I6i LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    @Override // X.InterfaceC45785Hy1
    public final void LIZ(AVMusic aVMusic, boolean z) {
        if (!z) {
            this.LJLIL.LIZIZ.LJJIJLIJ(false, true, true);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        AbstractC46064I6a.LLIILZL.getClass();
        C136195Wd.LIZ("startDefaultStickPoint");
        this.LJLIL.LJIIIZ().LIZJ(aVMusic, this.LJLJI, 2, new C46083I6t(this.LJLIL, this.LJLILLLLZI, aVMusic, this.LJLJJI, this.LJLJJL));
    }

    @Override // X.InterfaceC45785Hy1
    public final void LIZIZ(AVMusic aVMusic, boolean z) {
        if (!z) {
            this.LJLIL.LIZIZ.LJJIJLIJ(false, true, true);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    public C46082I6s(C46072I6i c46072I6i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, boolean z, boolean z2) {
        this.LJLIL = c46072I6i;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = i;
        this.LJLJJI = z;
        this.LJLJJL = z2;
    }
}
