package X;

import android.app.Notification;
import android.os.Binder;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import kotlin.jvm.internal.o;

/* renamed from: X.Fxp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class BinderC40677Fxp extends Binder {
    public final MediaSessionService LJLIL;

    public BinderC40677Fxp(MediaSessionService mService) {
        o.LJIIJ(mService, "mService");
        this.LJLIL = mService;
    }

    public final void LIZ(Notification notification) {
        try {
            MediaSessionService mediaSessionService = this.LJLIL;
            if (C40684Fxw.LIZ() && mediaSessionService != null) {
                PrintStream printStream = System.err;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("service info---->:");
                LIZ.append(mediaSessionService.getClass().getCanonicalName());
                printStream.println(X1D.LIZIZ(LIZ));
            }
            mediaSessionService.startForeground(R.string.txy, notification);
        } catch (Throwable unused) {
        }
    }
}
