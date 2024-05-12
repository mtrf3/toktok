package X;

import android.view.Window;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.service.AnchorPdpPreloadModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment$initData$6$1", f = "PdpFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.RjA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70344RjA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PdpFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70344RjA(PdpFragment pdpFragment, InterfaceC67352kd<? super C70344RjA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pdpFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70344RjA(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PdpFragment pdpFragment = this.LJLIL;
        pdpFragment.getClass();
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            AnchorPdpPreloadModel anchorPdpPreloadModel = C70084Rey.LIZ;
            LJIIIZ.getClass();
            AnchorPdpPreloadModel anchorPdpPreloadModel2 = (AnchorPdpPreloadModel) FFL.LJIJ(true, "ec_anchor_pdp_preload_opt_android", 31744, AnchorPdpPreloadModel.class, anchorPdpPreloadModel);
            if (anchorPdpPreloadModel2 != null) {
                anchorPdpPreloadModel = anchorPdpPreloadModel2;
            }
            if (anchorPdpPreloadModel.enable != 1 || !pdpFragment.LLFFF) {
                DialogC25756A8y dialogC25756A8y = (DialogC25756A8y) pdpFragment.LLII.getValue();
                dialogC25756A8y.setCanceledOnTouchOutside(true);
                Window window = dialogC25756A8y.getWindow();
                if (window != null) {
                    window.setFlags(8, 8);
                }
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-8548624424182890964")).LIZ) {
                    dialogC25756A8y.show();
                }
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
