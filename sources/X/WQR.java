package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQR<T> implements InterfaceC64592gB<WQO> {
    public final /* synthetic */ WQW LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public WQR(WQW wqw, boolean z, int i) {
        this.LJLIL = wqw;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(WQO wqo) {
        WQO filterDataResponse = wqo;
        if (this.LJLILLLLZI) {
            C82891Wg3.LIZLLL().d("viki filter, DefaultFilterRepository#fetchDataWithReturn -> forceRefresh");
        }
        WQW wqw = this.LJLIL;
        o.LJIIIIZZ(filterDataResponse, "filterDataResponse");
        wqw.LLLZ(this.LJLJI, wqw.LLLLZ(filterDataResponse).LJLIL.LJLIL);
    }
}
