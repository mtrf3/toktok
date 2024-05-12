package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.TFp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74341TFp extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C74342TFq LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ Bundle LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74341TFp(C74342TFq c74342TFq, Effect effect, String str, int i, int i2, Bundle bundle) {
        super(0);
        this.LJLIL = c74342TFq;
        this.LJLILLLLZI = effect;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = bundle;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC74343TFr interfaceC74343TFr = this.LJLIL.LIZLLL;
        Effect effect = this.LJLILLLLZI;
        String str = this.LJLJI;
        if (str == null) {
            str = "";
        }
        interfaceC74343TFr.LIZIZ(effect, str, "click_main_panel", this.LJLJJI - this.LJLJJL, "main_panel", this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
