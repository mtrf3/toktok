package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;

/* renamed from: X.NEj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59021NEj implements InterfaceC47328Iho {
    public final /* synthetic */ ScopedMusicPlayer LIZ;

    public C59021NEj(ScopedMusicPlayer scopedMusicPlayer) {
        this.LIZ = scopedMusicPlayer;
    }

    @Override // X.InterfaceC47328Iho
    public final void LIZIZ() {
        ScopedMusicPlayer scopedMusicPlayer = this.LIZ;
        if (!scopedMusicPlayer.LJLILLLLZI) {
            scopedMusicPlayer.LJLJI.setValue(C58754N4c.LIZ);
        } else {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(scopedMusicPlayer.LJLIL), null, null, new C59020NEi(this.LIZ, null), 3);
        }
    }
}
