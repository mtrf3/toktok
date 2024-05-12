package X;

import com.bytedance.android.livesdk.dialog.CommonBottomConfirmDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BgF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29395BgF extends AbstractC65781Prl implements InterfaceC88472Yns<CommonBottomConfirmDialog, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29395BgF(int i, int i2, int i3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(CommonBottomConfirmDialog commonBottomConfirmDialog) {
        CommonBottomConfirmDialog showBottomConfirmDialog = commonBottomConfirmDialog;
        o.LJIIIZ(showBottomConfirmDialog, "$this$showBottomConfirmDialog");
        showBottomConfirmDialog.LLF = R.layout.cuv;
        showBottomConfirmDialog.LL = this.LJLIL;
        showBottomConfirmDialog.LLD = this.LJLILLLLZI;
        int i = this.LJLJI;
        AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this.LJLJJI, (InterfaceC65784Pro<C76800UCe>) 105);
        showBottomConfirmDialog.LLFF = i;
        showBottomConfirmDialog.LLFFF = aqS171S0100000_5;
        C29396BgG cancelListener = C29396BgG.LJLIL;
        o.LJIIIZ(cancelListener, "cancelListener");
        showBottomConfirmDialog.LLFII = 0;
        showBottomConfirmDialog.LLFZ = cancelListener;
        return C76800UCe.LIZ;
    }
}
