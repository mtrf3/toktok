package X;

import android.os.CountDownTimer;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;

/* loaded from: classes16.dex */
public final class XU7 extends CountDownTimer {
    public final /* synthetic */ ChooseMusicDownloadPlayHelper LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LJLJJI.pause();
        XUL xul = this.LIZ.LLFII;
        if (xul != null) {
            xul.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XU7(ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper, long j) {
        super(j, 1000L);
        this.LIZ = chooseMusicDownloadPlayHelper;
    }
}
