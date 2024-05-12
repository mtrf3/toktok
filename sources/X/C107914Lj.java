package X;

import com.bytedance.forest.Forest;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.utils.SwipeForReplyIntroductionHelper$tryPlayIntroductionAnimation$1", f = "SwipeForReplyIntroductionHelper.kt", l = {185}, m = "invokeSuspend")
/* renamed from: X.4Lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107914Lj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C107914Lj(InterfaceC67352kd<? super C107914Lj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C107914Lj(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LJI;
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            C108004Ls c108004Ls = new C108004Ls((Forest) C108044Lw.LIZLLL.getValue());
            C34B c34b = C34B.LIZ;
            C107904Li c107904Li = new C107904Li(c34b);
            C107924Lk c107924Lk = new C107924Lk(c34b);
            XIA xia = C78613UtF.LIZJ;
            if (C108044Lw.LIZIZ.getAndSet(true)) {
                LJI = C76800UCe.LIZ;
            } else {
                LJI = XKX.LJI(xia, new C107934Ll(c107904Li, c108004Ls, c107924Lk, null, null, null), this);
                if (LJI != obj2) {
                    LJI = C76800UCe.LIZ;
                }
            }
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C107914Lj(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
