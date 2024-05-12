package X;

import android.text.Editable;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment$afterTextChanged$1$1", f = "KaraokeLibraryFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54252Az extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokeLibraryFragment LJLIL;
    public final /* synthetic */ Editable LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54252Az(KaraokeLibraryFragment karaokeLibraryFragment, Editable editable, InterfaceC67352kd<? super C54252Az> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeLibraryFragment;
        this.LJLILLLLZI = editable;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54252Az(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        KaraokeViewModel karaokeViewModel = this.LJLIL.LJLLI;
        if (karaokeViewModel != null) {
            karaokeViewModel.yv0(new C31231Kl(this.LJLILLLLZI.toString()));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
