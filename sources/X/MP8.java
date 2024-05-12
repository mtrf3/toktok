package X;

/* loaded from: classes10.dex */
public final class MP8<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ MLW LJLILLLLZI;
    public final /* synthetic */ MP2 LJLJI;
    public final /* synthetic */ C34K LJLJJI;

    public MP8(boolean z, MLW mlw, MP2 mp2, C34K c34k) {
        this.LJLIL = z;
        this.LJLILLLLZI = mlw;
        this.LJLJI = mp2;
        this.LJLJJI = c34k;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C56769MPt c56769MPt = (C56769MPt) obj;
        if ((c56769MPt.LIZ instanceof MP1) && this.LJLIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handle pre-refresh result, reason:");
            LIZ.append(this.LJLILLLLZI);
            C221018lt.LJFF("NotificationTLModel", X1D.LIZIZ(LIZ));
            int i = !this.LJLJI.LJIJ() ? 1 : 0;
            if (C56805MRd.LIZJ()) {
                EnumC56806MRe.LJLLI.LJFF(i);
            }
            MP2.LJIILLIIL(this.LJLJI, this.LJLILLLLZI, false, true, 2);
        }
        if (c56769MPt.LIZJ != null) {
            this.LJLJJI.element = true;
        }
    }
}
