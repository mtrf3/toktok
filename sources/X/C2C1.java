package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$notifyAnchorKaraokeState$2$fetchTabList$2", f = "KaraokeViewModel.kt", l = {554}, m = "invokeSuspend")
/* renamed from: X.2C1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2C1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends AnonymousClass015>>, Object> {
    public int LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2C1(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C2C1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2C1(this.LJLILLLLZI, interfaceC67352kd);
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
            C0EV c0ev = this.LJLILLLLZI.LJLIL;
            this.LJLIL = 1;
            obj = c0ev.LJII(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends AnonymousClass015>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}