package X;

import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;

/* loaded from: classes16.dex */
public final class XU6 implements InterfaceC47328Iho {
    public final /* synthetic */ ChooseMusicDownloadPlayHelper LIZ;

    @Override // X.InterfaceC47328Iho
    public final void LIZIZ() {
        XUL xul = this.LIZ.LLFII;
        if (xul != null) {
            xul.LIZIZ();
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LIZ;
        if (chooseMusicDownloadPlayHelper.LLFFF.LJII) {
            XVF.LJ(chooseMusicDownloadPlayHelper.LJLLLLLL.getMusicId());
            String musicId = this.LIZ.LJLLLLLL.getMusicId();
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LIZ;
            XVF.LJIIJJI(musicId, chooseMusicDownloadPlayHelper2.LLFFF, chooseMusicDownloadPlayHelper2.LJLLLLLL);
        }
    }

    public XU6(ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper) {
        this.LIZ = chooseMusicDownloadPlayHelper;
    }
}
