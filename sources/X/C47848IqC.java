package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.IqC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47848IqC extends BroadcastReceiver {
    public final WeakReference<AudioManager> LIZ;

    public C47848IqC(AudioManager audioManager) {
        this.LIZ = new WeakReference<>(audioManager);
    }

    public final void LIZ(Intent intent) {
        int streamVolume;
        try {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && this.LIZ.get() != null && (streamVolume = this.LIZ.get().getStreamVolume(3)) >= 0) {
                C47820Ipk.LIZIZ = streamVolume;
            }
        } catch (Exception unused) {
            C47820Ipk.LIZIZ = -1;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
