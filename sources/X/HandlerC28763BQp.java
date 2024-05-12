package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import java.lang.ref.WeakReference;

/* renamed from: X.BQp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class HandlerC28763BQp extends Handler {
    public final WeakReference<AmeLiveWallpaper> LIZ;

    public HandlerC28763BQp(AmeLiveWallpaper ameLiveWallpaper) {
        this.LIZ = new WeakReference<>(ameLiveWallpaper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AmeLiveWallpaper ameLiveWallpaper;
        if (message.what == 1 && (ameLiveWallpaper = this.LIZ.get()) != null) {
            ameLiveWallpaper.LIZIZ();
        }
    }
}
