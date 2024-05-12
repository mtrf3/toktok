package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: X.TOx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74583TOx<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C74579TOt LJLIL;
    public final /* synthetic */ TPG LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C74583TOx(C74579TOt c74579TOt, TPG tpg, int i) {
        this.LJLIL = c74579TOt;
        this.LJLILLLLZI = tpg;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<C35794E3a<ProviderEffectModel>> interfaceC65052gv) {
        InterfaceC84498XEg invoke = this.LJLIL.LJ.invoke();
        C74579TOt c74579TOt = this.LJLIL;
        String str = c74579TOt.LJFF;
        TPG tpg = this.LJLILLLLZI;
        invoke.LJJIFFI(tpg.LJLILLLLZI, tpg.LJLJI, this.LJLJI, new C74584TOy((C73578SuE) interfaceC65052gv), str, c74579TOt.LJII, c74579TOt.LJIIIIZZ);
    }
}
