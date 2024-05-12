package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: X.TOv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74581TOv<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C74580TOu LJLIL;
    public final /* synthetic */ TPG LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C74581TOv(C74580TOu c74580TOu, TPG tpg, int i) {
        this.LJLIL = c74580TOu;
        this.LJLILLLLZI = tpg;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<C35794E3a<ProviderEffectModel>> interfaceC65052gv) {
        InterfaceC84498XEg invoke = this.LJLIL.LJ.invoke();
        C74580TOu c74580TOu = this.LJLIL;
        String str = c74580TOu.LJI;
        String str2 = c74580TOu.LJFF;
        TPG tpg = this.LJLILLLLZI;
        invoke.LJIJJLI(tpg.LJLILLLLZI, tpg.LJLJI, this.LJLJI, new C74582TOw((C73578SuE) interfaceC65052gv), str, str2, c74580TOu.LJIIIZ);
    }
}
