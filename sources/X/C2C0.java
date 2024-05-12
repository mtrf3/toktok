package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$notifyAnchorKaraokeState$2$fetchTabList$1", f = "KaraokeViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2C0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2C0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<AnonymousClass015>>, Object> {
    public final /* synthetic */ KaraokeViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2C0(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C2C0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2C0(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return this.LJLIL.LJLIL.LJFF;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<AnonymousClass015>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
