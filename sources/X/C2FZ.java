package X;

import Y.IDfS125S0100000;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget$initObserver$1$3", f = "KaraokeHoverWidget.kt", l = {616}, m = "invokeSuspend")
/* renamed from: X.2FZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ KaraokeHoverWidget LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FZ(KaraokeHoverWidget karaokeHoverWidget, InterfaceC67352kd<? super C2FZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = karaokeHoverWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FZ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        XLL xll;
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
            KaraokeHoverWidget karaokeHoverWidget = this.LJLILLLLZI;
            KaraokeViewModel karaokeViewModel = karaokeHoverWidget.LJLIL;
            if (karaokeViewModel != null && (xll = karaokeViewModel.LJLJJI) != null) {
                IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(karaokeHoverWidget, 41);
                this.LJLIL = 1;
                if (xll.collect(iDfS125S0100000, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}