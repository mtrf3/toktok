package X;

import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment$initView$1$1$1", f = "KaraokePageFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2B4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokePageFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2B4(KaraokePageFragment karaokePageFragment, InterfaceC67352kd<? super C2B4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokePageFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2B4(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        KaraokeViewModel karaokeViewModel = this.LJLIL.LJLJJLL;
        if (karaokeViewModel != null) {
            karaokeViewModel.yv0(new C41921ki(EnumC07540Ri.QUEUE));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
