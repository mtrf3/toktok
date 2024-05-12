package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorEntry$tryShowTheIndicator$1", f = "UnreadIndicatorEntry.kt", l = {60, 66}, m = "invokeSuspend")
/* renamed from: X.42B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42B extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C42C LJLILLLLZI;
    public final /* synthetic */ C63120Opw LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42B(C42C c42c, C63120Opw c63120Opw, InterfaceC67352kd<? super C42B> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c42c;
        this.LJLJI = c63120Opw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42B(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("try show result : ");
                    LIZ.append(booleanValue);
                    C34B.LIZIZ("UnreadIndicatorStateMachine", X1D.LIZIZ(LIZ));
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C1047549f c1047549f = this.LJLILLLLZI.LIZIZ;
            this.LJLIL = 1;
            obj = c1047549f.LIZJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue2 = ((Boolean) obj).booleanValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("show unread message indicator : ");
        LIZ2.append(booleanValue2);
        C34B.LIZIZ("UnreadIndicatorStateMachine", X1D.LIZIZ(LIZ2));
        if (!booleanValue2) {
            C42C c42c = this.LJLILLLLZI;
            C63120Opw c63120Opw = this.LJLJI;
            c42c.getClass();
            AnonymousClass325.LIZ.getClass();
            boolean LJFF = AnonymousClass325.LJFF(AnonymousClass325.LJ(c63120Opw));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("show unread reaction indicator : ");
            LIZ3.append(LJFF);
            C34B.LIZIZ("UnreadIndicatorStateMachine", X1D.LIZIZ(LIZ3));
            if (LJFF) {
                C1047549f c1047549f2 = this.LJLILLLLZI.LIZJ;
                this.LJLIL = 2;
                obj = c1047549f2.LIZJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("try show result : ");
                LIZ4.append(booleanValue3);
                C34B.LIZIZ("UnreadIndicatorStateMachine", X1D.LIZIZ(LIZ4));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
