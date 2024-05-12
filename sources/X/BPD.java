package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.notificatoin.AudioLiveService;
import com.bytedance.android.livesdk.util.GlobalContext;

/* loaded from: classes6.dex */
public final class BPD {
    public static void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stopService begin isRunning=");
        LIZ.append(AudioLiveService.isRunning);
        LIZ.append(" isStopping=");
        LIZ.append(AudioLiveService.isStopping);
        C0NB.LIZIZ("AudioLiveService", X1D.LIZIZ(LIZ));
        Context applicationContext = GlobalContext.getApplicationContext();
        if (!AudioLiveService.isRunning || applicationContext == null) {
            C0NB.LIZIZ("AudioLiveService", "stopService return");
            return;
        }
        AudioLiveService.isStopping = true;
        try {
            applicationContext.stopService(new Intent(applicationContext, (Class<?>) AudioLiveService.class));
        } catch (Exception e) {
            C0NB.LJI("AudioLiveService", e);
        }
        C0NB.LIZIZ("AudioLiveService", "stopService end");
    }
}
