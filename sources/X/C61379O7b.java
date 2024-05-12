package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.O7b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61379O7b extends BroadcastReceiver {
    public final WeakReference<C61385O7h> LIZ;

    public C61379O7b(C61385O7h c61385O7h) {
        this.LIZ = new WeakReference<>(c61385O7h);
    }

    public final void LIZ(Intent intent) {
        C61385O7h c61385O7h;
        C61403O7z c61403O7z;
        int LIZ;
        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (c61385O7h = this.LIZ.get()) != null && (c61403O7z = c61385O7h.LIZ) != null && (LIZ = c61385O7h.LIZ()) >= 0 && !c61403O7z.LIZLLL.LIZJ) {
            float f = c61403O7z.LIZ;
            if (f == 0.0f) {
                if (LIZ > 0) {
                    float f2 = (LIZ * 1.0f) / c61403O7z.LIZIZ;
                    c61403O7z.LIZ = f2;
                    C61380O7c.LIZJ(c61403O7z.LIZJ, f2);
                    return;
                }
                return;
            }
            if (f <= 0.0f || LIZ != 0) {
                return;
            }
            c61403O7z.LIZ = LIZ;
            C61380O7c.LIZIZ(c61403O7z.LIZJ);
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
