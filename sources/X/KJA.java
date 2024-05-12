package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;

/* loaded from: classes9.dex */
public final class KJA implements K55 {
    public final /* synthetic */ ChooseMusicFragment LIZ;

    @Override // X.K55
    public final void onDismiss() {
    }

    public KJA(ChooseMusicFragment chooseMusicFragment) {
        this.LIZ = chooseMusicFragment;
    }

    @Override // X.K55
    public final void LIZ(C50674Jug c50674Jug) {
        if (!this.LIZ.isViewValid()) {
            return;
        }
        this.LIZ.Gl(c50674Jug);
    }
}
