package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel$startSpeech$2", f = "TakoSpeechViewModel.kt", l = {91, 97}, m = "invokeSuspend")
/* renamed from: X.4Dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105914Dr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TakoSpeechViewModel LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105914Dr(TakoSpeechViewModel takoSpeechViewModel, long j, InterfaceC67352kd<? super C105914Dr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = takoSpeechViewModel;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C105914Dr(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
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
            long totalTimeOut = C4EA.LIZ().getTotalTimeOut();
            this.LJLIL = 1;
            if (C1JD.LIZJ(totalTimeOut, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C105934Dt state = this.LJLILLLLZI.getState();
        long j = this.LJLJI;
        TakoSpeechViewModel takoSpeechViewModel = this.LJLILLLLZI;
        C105934Dt c105934Dt = state;
        if ((c105934Dt.LJLIL || C4Y9.LIZ()) && (l = c105934Dt.LJLJJI) != null && l.longValue() == j && c105934Dt.LJLILLLLZI.LJLIL.length() == 0 && !c105934Dt.LJLILLLLZI.LJLILLLLZI) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C105904Dq c105904Dq = new C105904Dq(takoSpeechViewModel, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN, c105904Dq, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
