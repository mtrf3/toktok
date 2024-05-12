package X;

import com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment$fetchDataWhenResume$1", f = "KaraokeQueueSongListFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2AG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokeQueueSongListFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AG(KaraokeQueueSongListFragment karaokeQueueSongListFragment, InterfaceC67352kd<? super C2AG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeQueueSongListFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AG(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (C29306Beo.LJIIJ(this.LJLIL.LJLJLLL)) {
            KaraokeQueueSongListFragment karaokeQueueSongListFragment = this.LJLIL;
            KaraokeViewModel karaokeViewModel = karaokeQueueSongListFragment.LJLJJL;
            if (karaokeViewModel != null) {
                karaokeViewModel.yv0(new C31181Kg(karaokeQueueSongListFragment.LJLJJLL, false, false));
            }
        } else {
            KaraokeQueueSongListFragment karaokeQueueSongListFragment2 = this.LJLIL;
            KaraokeViewModel karaokeViewModel2 = karaokeQueueSongListFragment2.LJLJJL;
            if (karaokeViewModel2 != null) {
                karaokeViewModel2.yv0(new C31181Kg(karaokeQueueSongListFragment2.LJLJJLL, false, true));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
