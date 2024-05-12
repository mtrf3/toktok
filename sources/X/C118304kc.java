package X;

import fjb.a;
import java.util.List;
import java.util.Map;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserUseCase$pull$4", f = "GetMsgByUserUseCase.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118304kc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C63363Otr LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, List<C109544Rq>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118304kc(C63363Otr c63363Otr, int i, java.util.Map<String, List<C109544Rq>> map, InterfaceC67352kd<? super C118304kc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c63363Otr;
        this.LJLILLLLZI = i;
        this.LJLJI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C118304kc(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63363Otr c63363Otr = this.LJLIL;
        int i = this.LJLILLLLZI;
        java.util.Map<String, List<C109544Rq>> map = this.LJLJI;
        c63363Otr.getClass();
        for (Map.Entry<String, List<C109544Rq>> entry : map.entrySet()) {
            String key = entry.getKey();
            C63309Osz.LIZLLL().LJFF(entry.getValue(), 3, new C107074Id());
            if (!C63269OsL.LJI(i, key)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("update conversation convId ");
                LIZ.append(key);
                C63322OtC.LJI("GetMsgByUserUseCase", X1D.LIZIZ(LIZ), null);
                C115284fk.LJIILIIL().LJIJJ(false, 2, C115284fk.LJIILIIL().LJIIIZ(key));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
