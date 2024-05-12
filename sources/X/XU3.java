package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XU3 implements Handler.Callback {
    public final /* synthetic */ AVMusicDownloadPlayHelper LJLIL;
    public final /* synthetic */ int LJLILLLLZI = 0;
    public final /* synthetic */ int LJLJI = -1;

    public XU3(AVMusicDownloadPlayHelper aVMusicDownloadPlayHelper) {
        this.LJLIL = aVMusicDownloadPlayHelper;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((HandlerThread) this.LJLIL.LLFFF.getValue()).quit();
                    XU2 xu2 = this.LJLIL.LJLJJI;
                    if (xu2 != null) {
                        xu2.release();
                    }
                }
            } else {
                XU2 xu22 = this.LJLIL.LJLJJI;
                if (xu22 != null) {
                    xu22.pause();
                }
            }
        } else {
            Object obj = msg.obj;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.utils.PlayMusicInfo");
            XTL xtl = (XTL) obj;
            super/*com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper*/.LJIIIZ(xtl.LIZ, xtl.LIZIZ, xtl.LIZJ, this.LJLILLLLZI, this.LJLJI);
        }
        return true;
    }
}
