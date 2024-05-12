package X;

import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$bootTask$1", f = "OfflineModeManager.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AQS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public AQS(InterfaceC67352kd<? super AQS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AQS(interfaceC67352kd);
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
                AQV.LJLILLLLZI.LJIIIIZZ("in bootTask()");
                this.LJLIL = 1;
                InterfaceC26200AQa LIZJ = AQY.LIZJ();
                String curSecUserId = AQY.LIZ.getCurSecUserId();
                if (curSecUserId == null) {
                    obj = C61878OQg.INSTANCE;
                } else {
                    AQV.LJLIL.getClass();
                    obj = LIZJ.LJIIIZ(AQV.LJLJI, curSecUserId);
                }
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            AQV aqv = AQV.LJLIL;
            aqv.getClass();
            AQV.LJJJIL((List) obj);
            AQW.LIZ.getClass();
            AQW.LJ();
            if (AQO.LIZJ() != C9SN.USER_PAUSE && AQO.LIZJ() != C9SN.UNINITIALIZED) {
                aqv.LJLLLL(EnumC237029Ry.SYSTEM_RESUME);
            }
        } catch (Exception unused) {
            AQV.LJLILLLLZI.LIZLLL("OfflineModeManager initTask failed ");
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new AQS(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
