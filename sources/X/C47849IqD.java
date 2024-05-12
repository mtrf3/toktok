package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: X.IqD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47849IqD extends BroadcastReceiver {
    public final WeakReference<AudioManager> LIZ;

    public C47849IqD(AudioManager audioManager) {
        this.LIZ = new WeakReference<>(audioManager);
    }

    public final void LIZ(Intent intent) {
        int streamVolume;
        try {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && this.LIZ.get() != null && (streamVolume = this.LIZ.get().getStreamVolume(3)) >= 0) {
                C47636Imm.LIZJ = streamVolume;
            }
        } catch (Exception unused) {
            C47636Imm.LIZJ = -1;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
