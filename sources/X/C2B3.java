package X;

import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment$startKaraoke$1", f = "KaraokeLibraryFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2B3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokeLibraryFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2B3(KaraokeLibraryFragment karaokeLibraryFragment, InterfaceC67352kd<? super C2B3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeLibraryFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2B3(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (C29306Beo.LJIIJ(this.LJLIL.LJLLL)) {
            KaraokeViewModel karaokeViewModel = this.LJLIL.LJLLI;
            if (karaokeViewModel != null) {
                karaokeViewModel.yv0(C31281Kq.LIZ);
            }
        } else {
            KaraokeViewModel karaokeViewModel2 = this.LJLIL.LJLLI;
            if (karaokeViewModel2 != null) {
                karaokeViewModel2.yv0(C31131Kb.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}