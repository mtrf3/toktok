package X;

import com.bytedance.android.live.effect.panel.LiveMultiGuestBeautyEffectFragment;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.panel.LiveMultiGuestBeautyEffectFragment$onViewCreated$4$1", f = "LiveMultiGuestBeautyEffectFragment.kt", l = {136}, m = "invokeSuspend")
/* renamed from: X.2Ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54172Ar extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiveMultiGuestBeautyEffectFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54172Ar(LiveMultiGuestBeautyEffectFragment liveMultiGuestBeautyEffectFragment, InterfaceC67352kd<? super C54172Ar> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveMultiGuestBeautyEffectFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54172Ar(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        XK4 xk4;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LJLILLLLZI.LJLL;
            if (liveSmallItemBeautyViewModel != null && (xk4 = liveSmallItemBeautyViewModel.LJLILLLLZI) != null) {
                C36901cc c36901cc = C36901cc.LIZ;
                this.LJLIL = 1;
                if (xk4.LJIIIZ(c36901cc, this) == enumC58928NAu) {
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
