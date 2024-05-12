package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager2;
import kotlin.jvm.internal.o;

/* renamed from: X.Op2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63064Op2 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ UniversalPopupManager2 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C10K<UniversalPopupResponse> LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ InterfaceC82923WgZ LJLJJL;
    public final /* synthetic */ InterfaceC36824Ecm LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63064Op2(UniversalPopupManager2 universalPopupManager2, int i, C10K<UniversalPopupResponse> c10k, Context context, InterfaceC82923WgZ interfaceC82923WgZ, InterfaceC36824Ecm interfaceC36824Ecm) {
        super(0);
        this.LJLIL = universalPopupManager2;
        this.LJLILLLLZI = i;
        this.LJLJI = c10k;
        this.LJLJJI = context;
        this.LJLJJL = interfaceC82923WgZ;
        this.LJLJJLL = interfaceC36824Ecm;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        UniversalPopupManager2 universalPopupManager2 = this.LJLIL;
        int i = this.LJLILLLLZI;
        UniversalPopupResponse LJIIJJI = this.LJLJI.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "it.result");
        universalPopupManager2.LJ(i, LJIIJJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
