package X;

import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment$onHiddenChanged$1", f = "KaraokeSongListFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2AL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokeSongListFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AL(KaraokeSongListFragment karaokeSongListFragment, InterfaceC67352kd<? super C2AL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeSongListFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AL(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        KaraokeSongListFragment karaokeSongListFragment = this.LJLIL;
        KaraokeViewModel karaokeViewModel = karaokeSongListFragment.LJLJJL;
        if (karaokeViewModel != null) {
            karaokeViewModel.yv0(new C31181Kg(karaokeSongListFragment.LJLJJLL, false, false));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
