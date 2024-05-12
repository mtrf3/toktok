package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;

/* loaded from: classes16.dex */
public final class XU5 extends Handler {
    public final /* synthetic */ int LIZ = 0;
    public final /* synthetic */ int LIZIZ = -1;
    public final /* synthetic */ ChooseMusicDownloadPlayHelper LIZJ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 2) {
            XU2 xu2 = this.LIZJ.LJLJJI;
            if (xu2 != null) {
                xu2.pause();
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        XTL xtl = (XTL) message.obj;
        super/*com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper*/.LJIIIZ(xtl.LIZ, xtl.LIZIZ, xtl.LIZJ, this.LIZ, this.LIZIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XU5(ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper, Looper looper) {
        super(looper);
        this.LIZJ = chooseMusicDownloadPlayHelper;
    }
}
