package X;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J1J extends C47849IqD {
    public int LIZIZ;

    public J1J(AudioManager audioManager) {
        super(audioManager);
        this.LIZIZ = C47636Imm.LJI(EF7.LIZIZ());
        new WeakReference(audioManager);
    }

    public final void LIZIZ(Context context, Intent intent) {
        J1M j1m;
        super.onReceive(context, intent);
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ() && o.LJ(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
            int LJI = C47636Imm.LJI(EF7.LIZIZ());
            String LIZIZ = jyh.LIZIZ(null);
            if (this.LIZIZ < LJI) {
                j1m = J1M.TURN_UP_VOLUME;
            } else {
                j1m = J1M.TURN_DOWN_VOLUME;
            }
            jyh.LIZLLL(LIZIZ, j1m, J1O.STYLE_NO_BUTTON);
            this.LIZIZ = LJI;
        }
    }

    @Override // X.C47849IqD, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZIZ(context, intent);
        }
    }
}
