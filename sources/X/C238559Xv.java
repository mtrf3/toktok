package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$setCacheCount$1", f = "OfflineModeManager.kt", l = {283}, m = "invokeSuspend")
/* renamed from: X.9Xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238559Xv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238559Xv(int i, InterfaceC67352kd<? super C238559Xv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238559Xv(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                int i2 = this.LJLILLLLZI;
                this.LJLIL = 1;
                obj = AQY.LIZLLL(i2);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            List list = (List) obj;
            C26222AQw c26222AQw = AQV.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get exceededList: ");
            LIZ.append(list);
            c26222AQw.LJIIIIZZ(X1D.LIZIZ(LIZ));
            AQO.LJII(this.LJLILLLLZI);
            AQV.LJLIL.getClass();
            AQV.LJJJIL(list);
        } catch (Exception e) {
            C26222AQw c26222AQw2 = AQV.LJLILLLLZI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("set cache count, delete exceededAidList failed ");
            LIZ2.append(e);
            c26222AQw2.LIZLLL(X1D.LIZIZ(LIZ2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
