package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.api.AllowTenMinGuidanceApi;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.api.ShowTenMinResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$requestNeedShowAllowTenMinGuidance$1", f = "MvChoosePhotoScene.kt", l = {3816, 3818}, m = "invokeSuspend")
/* renamed from: X.2zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76872zz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76872zz(InterfaceC67352kd interfaceC67352kd, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76872zz(interfaceC67352kd, this.LJLJI, this.LJLILLLLZI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            AllowTenMinGuidanceApi.API api = AllowTenMinGuidanceApi.LIZ;
            boolean z = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = api.needShowAllowTenMinGuidance(z, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ShowTenMinResponse showTenMinResponse = (ShowTenMinResponse) obj;
        if (showTenMinResponse.status_code == 0) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C76862zy c76862zy = new C76862zy(this.LJLJI, showTenMinResponse, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN, c76862zy, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
