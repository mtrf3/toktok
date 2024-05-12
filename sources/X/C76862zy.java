package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.api.ShowTenMinResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene$requestNeedShowAllowTenMinGuidance$1$1", f = "MvChoosePhotoScene.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76862zy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;
    public final /* synthetic */ ShowTenMinResponse LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C76862zy(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, ShowTenMinResponse showTenMinResponse, InterfaceC67352kd<? super C76862zy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = showTenMinResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76862zy(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(this.LJLILLLLZI.needShowTenMin));
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
