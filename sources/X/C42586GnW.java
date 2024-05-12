package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.api.SuspendApi;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.AnchorECSaleMode;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService$checkECommerceToggleResult$1", f = "ECommerceVideoService.kt", l = {296, 323, 388}, m = "invokeSuspend")
/* renamed from: X.GnW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42586GnW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;
    public final /* synthetic */ ECommerceVideoService LJLJJI;
    public final /* synthetic */ InterfaceC42587GnX LJLJJL;
    public final /* synthetic */ Fragment LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42586GnW(long j, List<String> list, ECommerceVideoService eCommerceVideoService, InterfaceC42587GnX interfaceC42587GnX, Fragment fragment, InterfaceC67352kd<? super C42586GnW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = list;
        this.LJLJJI = eCommerceVideoService;
        this.LJLJJL = interfaceC42587GnX;
        this.LJLJJLL = fragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42586GnW(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AnchorECSaleMode anchorECSaleMode;
        boolean z;
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C42590Gna c42590Gna = SuspendApi.LIZ;
            long j = this.LJLILLLLZI;
            List<String> list = this.LJLJI;
            this.LJLIL = 1;
            obj = c42590Gna.LIZ(j, 1, list, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (anchorECSaleMode = (AnchorECSaleMode) baseResponse.getData()) != null) {
            if (anchorECSaleMode.hasNonSelfProduct && !anchorECSaleMode.isBcWhiteList && Q7K.LIZIZ("creator_bc_toggle_video", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = anchorECSaleMode.hasSelfProduct;
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            if (this.LJLJJI.LJIIIIZZ()) {
                if (!z2) {
                    i3 = 2;
                }
            } else {
                i3 = 0;
            }
            if (!this.LJLJJI.LJIIIIZZ()) {
                z2 = false;
            }
            this.LJLJJL.LIZ(i, i3);
            if (z && !LCW.LIZ().getBoolean("key_ec_video_bc_tip_show", false)) {
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C42584GnU c42584GnU = new C42584GnU(this.LJLJJLL, null);
                this.LJLIL = 2;
                if (XKX.LJI(abstractC78621UtN, c42584GnU, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else if (z2 && !LCW.LIZ().getBoolean("key_ec_video_bo_tip_show", false)) {
                AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
                C42585GnV c42585GnV = new C42585GnV(this.LJLJJLL, null);
                this.LJLIL = 3;
                if (XKX.LJI(abstractC78621UtN2, c42585GnV, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
