package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.R5v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68991R5v extends AbstractC65781Prl implements InterfaceC88472Yns<ARH, C76800UCe> {
    public final /* synthetic */ List<DialogButton> LJLIL;
    public final /* synthetic */ EnumC28063Azr LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<FetchInfo, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68991R5v(List<DialogButton> list, EnumC28063Azr enumC28063Azr, Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super FetchInfo, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, String str) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = enumC28063Azr;
        this.LJLJI = context;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC65784Pro2;
        this.LJLJL = str;
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
            buttonGroup.LJFF(text, new C28146B2w(this.LJLILLLLZI, this.LJLJI, ((DialogButton) ORZ.LJLLJ(this.LJLIL)).getButtonAction(), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL));
        }
        if (ORZ.LJLLLLLL(1, this.LJLIL) != null) {
            String text2 = ((DialogButton) ListProtector.get(this.LJLIL, 1)).getText();
            if (text2 != null) {
                str = text2;
            }
            buttonGroup.LJII(str, new C28146B2w(this.LJLILLLLZI, this.LJLJI, ((DialogButton) ListProtector.get(this.LJLIL, 1)).getButtonAction(), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL));
        }
        return C76800UCe.LIZ;
    }
}
