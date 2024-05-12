package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$emitStateByCoroutine$1", f = "KaraokeViewModel.kt", l = {527}, m = "invokeSuspend")
/* renamed from: X.2AX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;
    public final /* synthetic */ AbstractC07660Ru LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AX(KaraokeViewModel karaokeViewModel, AbstractC07660Ru abstractC07660Ru, InterfaceC67352kd<? super C2AX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
        this.LJLJI = abstractC07660Ru;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AX(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            KaraokeViewModel karaokeViewModel = this.LJLILLLLZI;
            AbstractC07660Ru abstractC07660Ru = this.LJLJI;
            this.LJLIL = 1;
            if (karaokeViewModel.iv0(abstractC07660Ru, this) == enumC58928NAu) {
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
