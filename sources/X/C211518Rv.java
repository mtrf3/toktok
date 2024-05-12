package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.popup.PopupWeaver$assembleTasks$2", f = "PopupWeaver.kt", l = {145, 147}, m = "invokeSuspend")
/* renamed from: X.8Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211518Rv extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C211498Rt LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C211518Rv(C211498Rt c211498Rt, InterfaceC67352kd<? super C211518Rv> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c211498Rt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C211518Rv(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(1000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (C210518Nz.LIZ()) {
            C211498Rt c211498Rt = this.LJLILLLLZI;
            C8S1 c8s1 = new C8S1(c211498Rt.LIZIZ, new C211538Rx(this.LJLILLLLZI));
            this.LJLIL = 2;
            if (c211498Rt.LJ(c8s1, "tap_gesture_tip_shown", this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
