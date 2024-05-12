package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.B2z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28149B2z extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ List<DialogButton> LJLIL;
    public final /* synthetic */ EnumC28063Azr LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<FetchInfo, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJLJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ int LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28149B2z(List<DialogButton> list, EnumC28063Azr enumC28063Azr, Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super FetchInfo, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4, String str, int i) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = enumC28063Azr;
        this.LJLJI = context;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC65784Pro2;
        this.LJLJL = interfaceC65784Pro3;
        this.LJLJLJ = interfaceC88472Yns2;
        this.LJLJLLL = interfaceC65784Pro4;
        this.LJLL = str;
        this.LJLLI = i;
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
            actionGroup.LJII(text, new C28146B2w(this.LJLILLLLZI, this.LJLJI, ((DialogButton) ORZ.LJLLJ(this.LJLIL)).getButtonAction(), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL));
        }
        if (ORZ.LJLLLLLL(1, this.LJLIL) != null) {
            String text2 = ((DialogButton) ListProtector.get(this.LJLIL, 1)).getText();
            if (text2 == null) {
                text2 = "";
            }
            actionGroup.LJIIIZ(text2, new C28146B2w(this.LJLILLLLZI, this.LJLJI, ((DialogButton) ListProtector.get(this.LJLIL, 1)).getButtonAction(), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL));
        }
        if (ORZ.LJLLLLLL(2, this.LJLIL) != null) {
            String text3 = ((DialogButton) ListProtector.get(this.LJLIL, 2)).getText();
            if (text3 != null) {
                str = text3;
            }
            actionGroup.LJFF(str, new C28146B2w(this.LJLILLLLZI, this.LJLJI, ((DialogButton) ListProtector.get(this.LJLIL, 2)).getButtonAction(), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL));
        }
        if (this.LJLLI == 1) {
            actionGroup.LJI = true;
        }
        return C76800UCe.LIZ;
    }
}
