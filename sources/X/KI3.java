package X;

import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;

/* loaded from: classes9.dex */
public final class KI3 implements K55 {
    public final /* synthetic */ ChooseSearchMusicFragment LIZ;

    @Override // X.K55
    public final void onDismiss() {
        if (!this.LIZ.isViewValid()) {
            return;
        }
        ChooseSearchMusicFragment chooseSearchMusicFragment = this.LIZ;
        if (chooseSearchMusicFragment.wl().getState().LJLIL == 1 || chooseSearchMusicFragment.wl().getState().LJLIL == 2) {
            chooseSearchMusicFragment.Il();
        }
    }

    public KI3(ChooseSearchMusicFragment chooseSearchMusicFragment) {
        this.LIZ = chooseSearchMusicFragment;
    }

    @Override // X.K55
    public final void LIZ(C50674Jug c50674Jug) {
        if (!this.LIZ.isViewValid()) {
            return;
        }
        ChooseSearchMusicFragment chooseSearchMusicFragment = this.LIZ;
        chooseSearchMusicFragment.getClass();
        C51468KHw c51468KHw = new C51468KHw();
        c51468KHw.LIZ = "voice_input";
        c51468KHw.LIZIZ = c50674Jug.LJLIL;
        chooseSearchMusicFragment.Al(c51468KHw);
    }
}
