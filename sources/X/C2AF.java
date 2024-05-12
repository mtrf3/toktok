package X;

import com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment$fetchDataWhenResume$1", f = "KaraokeLibrarySongListFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2AF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokeLibrarySongListFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AF(KaraokeLibrarySongListFragment karaokeLibrarySongListFragment, InterfaceC67352kd<? super C2AF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeLibrarySongListFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AF(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        KaraokeLibrarySongListFragment karaokeLibrarySongListFragment = this.LJLIL;
        KaraokeViewModel karaokeViewModel = karaokeLibrarySongListFragment.LJLJJL;
        if (karaokeViewModel != null) {
            karaokeViewModel.yv0(new C31181Kg(karaokeLibrarySongListFragment.LJLJJLL, false, false));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
