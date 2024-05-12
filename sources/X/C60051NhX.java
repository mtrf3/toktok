package X;

import android.os.Message;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton;
import java.util.TimerTask;
import kotlin.jvm.internal.o;

/* renamed from: X.NhX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60051NhX extends TimerTask {
    public final /* synthetic */ TopViewSkipButton LJLIL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Message obtainMessage = this.LJLIL.LJLJJLL.obtainMessage();
            o.LJIIIIZZ(obtainMessage, "handler.obtainMessage()");
            obtainMessage.what = 1;
            this.LJLIL.LJLJJLL.sendMessage(obtainMessage);
        } finally {
            if (LIZ) {
            }
        }
    }

    public C60051NhX(TopViewSkipButton topViewSkipButton) {
        this.LJLIL = topViewSkipButton;
    }
}
