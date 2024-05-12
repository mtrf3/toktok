package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$renderCache$1", f = "PdpViewModel.kt", l = {3629, 3630}, m = "invokeSuspend")
/* renamed from: X.2tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72772tN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpViewModel LJLILLLLZI;
    public final /* synthetic */ OSZ<ProductPackStruct, String> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72772tN(PdpViewModel pdpViewModel, OSZ<ProductPackStruct, String> osz, String str, Context context, InterfaceC67352kd<? super C72772tN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpViewModel;
        this.LJLJI = osz;
        this.LJLJJI = str;
        this.LJLJJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72772tN(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZLLL;
        String obj2;
        ProductPackStruct productPackStruct;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (!this.LJLILLLLZI.Zv0()) {
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), this.LJLJI.getSecond(), C65330PkU.LIZJ(C65352Pkq.LJI(ProductPackStruct.class)));
                    if (!(fromJson instanceof ProductPackStruct)) {
                        fromJson = null;
                    }
                    productPackStruct = (ProductPackStruct) fromJson;
                } catch (s unused) {
                    productPackStruct = null;
                }
                PdpViewModel.yx0(this.LJLILLLLZI, productPackStruct, null, false, true, false, false, 48);
            }
            if (this.LJLILLLLZI.LLIIL == null && C78685UuP.LJJJZ(this.LJLJJI) && (LIZLLL = C72264SXs.LIZ(this.LJLJJL).LIZLLL(this.LJLJJI)) != null && (obj2 = LIZLLL.toString()) != null) {
                try {
                    Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), obj2, C65330PkU.LIZJ(C65352Pkq.LJI(PdpPreviewInfo.class)));
                    if (!(fromJson2 instanceof PdpPreviewInfo)) {
                        fromJson2 = null;
                    }
                    PdpPreviewInfo pdpPreviewInfo = (PdpPreviewInfo) fromJson2;
                    if (pdpPreviewInfo != null) {
                        this.LJLILLLLZI.LLIIL = pdpPreviewInfo;
                    }
                } catch (s unused2) {
                }
            }
            this.LJLIL = 1;
            if (C1JD.LIZJ(300L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C72762tM c72762tM = new C72762tM(this.LJLILLLLZI, this.LJLJI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c72762tM, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
