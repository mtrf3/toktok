package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.unlocktts.UnlockReadTextVoiceComponent$fetchVoiceEffectList$1$2", f = "UnlockReadTextVoiceComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5cY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138785cY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C138805ca LJLIL;
    public final /* synthetic */ RuntimeException LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138785cY(C138805ca c138805ca, RuntimeException runtimeException, InterfaceC67352kd<? super C138785cY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c138805ca;
        this.LJLILLLLZI = runtimeException;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C138785cY(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC138705cQ LJJLJ = this.LJLIL.LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.Mz(new ExceptionResult(this.LJLILLLLZI));
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
