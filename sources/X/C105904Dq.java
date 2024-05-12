package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.voice2text.vm.TakoSpeechViewModel$startSpeech$2$1$1", f = "TakoSpeechViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105904Dq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TakoSpeechViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105904Dq(TakoSpeechViewModel takoSpeechViewModel, InterfaceC67352kd<? super C105904Dq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = takoSpeechViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C105904Dq(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.kv0();
        this.LJLIL.lv0(new C105814Dh("no valid content"));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
