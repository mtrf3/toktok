package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {275, 277}, m = "invokeSuspend")
/* renamed from: X.2CQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C31431Lf LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CQ(boolean z, C31431Lf c31431Lf, float f, float f2, InterfaceC67352kd<? super C2CQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = c31431Lf;
        this.LJLJJI = f;
        this.LJLJJL = f2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CQ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        Object LIZ2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI) {
                C31431Lf c31431Lf = this.LJLJI;
                o.LJII(c31431Lf, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                float f = this.LJLJJI;
                this.LJLIL = 1;
                LIZ2 = C0UW.LIZ(c31431Lf, f, C1JI.LJJIJIIJI(0.0f, 0.0f, null, 7), this);
                if (LIZ2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                C31431Lf c31431Lf2 = this.LJLJI;
                o.LJII(c31431Lf2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                float f2 = this.LJLJJL;
                this.LJLIL = 2;
                LIZ = C0UW.LIZ(c31431Lf2, f2, C1JI.LJJIJIIJI(0.0f, 0.0f, null, 7), this);
                if (LIZ == enumC58928NAu) {
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
