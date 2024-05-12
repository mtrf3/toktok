package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.IMSearchDefaultRepository$refreshDefaultPage$2", f = "IMSearchDefaultRepository.kt", l = {195}, m = "invokeSuspend")
/* renamed from: X.339, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass339 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C33A LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass339(C33A c33a, InterfaceC67352kd<? super AnonymousClass339> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c33a;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass339(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLILLLLZI;
        if (i2 != 0) {
            if (i2 == 1) {
                currentTimeMillis = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLJI.LIZ().LJFF("updateSuggestedContact false recent start");
            C33A c33a = this.LJLJI;
            currentTimeMillis = System.currentTimeMillis();
            AnonymousClass336 LIZIZ = c33a.LIZIZ.LIZIZ();
            boolean z = LIZIZ.LJLIL;
            List<InterfaceC57784Mm4> list = LIZIZ.LJLILLLLZI;
            C3BJ c3bj = (C3BJ) c33a.LJI.getValue();
            if (c33a.LJII) {
                i = 3;
            } else {
                i = -1;
            }
            C33C c33c = new C33C(i, z, list);
            this.LJLIL = currentTimeMillis;
            this.LJLILLLLZI = 1;
            if (c3bj.emit(c33c, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C98453th LIZ = this.LJLJI.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateSuggestedContact false recent end, duration ");
        LIZ2.append(currentTimeMillis2);
        LIZ2.append("ms");
        LIZ.LJFF(X1D.LIZIZ(LIZ2));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
