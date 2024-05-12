package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.viewmodel.SingleTitleBarCenterViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.viewmodel.SingleTitleBarCenterViewModel$fetchLocalUser$1", f = "SingleTitleBarCenterViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3IS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SingleTitleBarCenterViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3IS(SingleTitleBarCenterViewModel singleTitleBarCenterViewModel, InterfaceC67352kd<? super C3IS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = singleTitleBarCenterViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3IS(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMUser fromUser = ((C98523to) this.LJLIL.LJLILLLLZI.getValue()).getFromUser();
        if (fromUser != null) {
            final SingleTitleBarCenterViewModel singleTitleBarCenterViewModel = this.LJLIL;
            C80533Eb.LJI(fromUser.getUid(), fromUser.getSecUid(), new C3EU() { // from class: X.3IT
                @Override // X.C3EU
                public final void LIZ(IMUser result) {
                    o.LJIIIZ(result, "result");
                    SingleTitleBarCenterViewModel.this.setState(new AqS167S0100000_1(result, 377));
                }

                @Override // X.C3EU
                public final void LIZIZ(Throwable throwable) {
                    o.LJIIIZ(throwable, "throwable");
                }
            });
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
