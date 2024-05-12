package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B30 extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ List<DialogButton> LJLIL;
    public final /* synthetic */ C26227ARb LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<FetchInfo, C76800UCe> LJLJJI = null;
    public final /* synthetic */ InterfaceC88472Yns<ButtonAction, Boolean> LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B30(List list, C26227ARb c26227ARb, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = c26227ARb;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String str = "";
        if (ORZ.LJLLLL(this.LJLIL) != null) {
            String text = ((DialogButton) ORZ.LJLLJ(this.LJLIL)).getText();
            if (text == null) {
                text = "";
            }
            actionGroup.LJII(text, new C28147B2x(this.LJLILLLLZI.LIZ, ((DialogButton) ORZ.LJLLJ(this.LJLIL)).getButtonAction(), this.LJLJI, this.LJLJJI, this.LJLJJL));
        }
        if (ORZ.LJLLLLLL(1, this.LJLIL) != null) {
            String text2 = ((DialogButton) ListProtector.get(this.LJLIL, 1)).getText();
            if (text2 == null) {
                text2 = "";
            }
            actionGroup.LJIIIZ(text2, new C28147B2x(this.LJLILLLLZI.LIZ, ((DialogButton) ListProtector.get(this.LJLIL, 1)).getButtonAction(), this.LJLJI, this.LJLJJI, this.LJLJJL));
        }
        if (ORZ.LJLLLLLL(2, this.LJLIL) != null) {
            String text3 = ((DialogButton) ListProtector.get(this.LJLIL, 2)).getText();
            if (text3 != null) {
                str = text3;
            }
            actionGroup.LJFF(str, new C28147B2x(this.LJLILLLLZI.LIZ, ((DialogButton) ListProtector.get(this.LJLIL, 2)).getButtonAction(), this.LJLJI, this.LJLJJI, this.LJLJJL));
        }
        if (this.LJLJJLL == 1) {
            actionGroup.LJI = true;
        }
        return C76800UCe.LIZ;
    }
}
