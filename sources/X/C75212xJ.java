package X;

import fjb.a;
import java.util.concurrent.TimeUnit;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.settingsrequest.serverpush.PushSettingsManager$syncPUshSettingData$1", f = "PushSettingsManager.kt", l = {105}, m = "invokeSuspend")
/* renamed from: X.2xJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75212xJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EUJ LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75212xJ(EUJ euj, InterfaceC67352kd<? super C75212xJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = euj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75212xJ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            long millis = TimeUnit.SECONDS.toMillis(1L);
            this.LJLIL = 1;
            if (C1JD.LIZJ(millis, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        EUH.LIZJ(this.LJLILLLLZI, true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
