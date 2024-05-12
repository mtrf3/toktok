package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.R5w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68992R5w extends AbstractC65781Prl implements InterfaceC88472Yns<ARH, C76800UCe> {
    public final /* synthetic */ List<DialogButton> LJLIL;
    public final /* synthetic */ C26227ARb LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<FetchInfo, C76800UCe> LJLJJI = null;
    public final /* synthetic */ InterfaceC88472Yns<ButtonAction, Boolean> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68992R5w(List list, C26227ARb c26227ARb, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = c26227ARb;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARH arh) {
        ARH buttonGroup = arh;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        String str = "";
        if (ORZ.LJLLLL(this.LJLIL) != null) {
            String text = ((DialogButton) ORZ.LJLLJ(this.LJLIL)).getText();
            if (text == null) {
                text = "";
            }
            buttonGroup.LJFF(text, new C28147B2x(this.LJLILLLLZI.LIZ, ((DialogButton) ORZ.LJLLJ(this.LJLIL)).getButtonAction(), this.LJLJI, this.LJLJJI, this.LJLJJL));
        }
        if (ORZ.LJLLLLLL(1, this.LJLIL) != null) {
            String text2 = ((DialogButton) ListProtector.get(this.LJLIL, 1)).getText();
            if (text2 != null) {
                str = text2;
            }
            buttonGroup.LJII(str, new C28147B2x(this.LJLILLLLZI.LIZ, ((DialogButton) ListProtector.get(this.LJLIL, 1)).getButtonAction(), this.LJLJI, this.LJLJJI, this.LJLJJL));
        }
        return C76800UCe.LIZ;
    }
}
