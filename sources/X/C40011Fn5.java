package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Fn5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40011Fn5 extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        String str;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (o.LJ(str, "android.media.AUDIO_BECOMING_NOISY") && (LJIIIIZZ instanceof ActivityC45651qj)) {
            C3SZ.LIZ((ActivityC45651qj) LJIIIIZZ).LJLJL.postValue("on_ear_phone_unplug");
            C36922EeM.LIZLLL(2, "EarPhoneUnplugReceiver", "Received BECOMING_NOISY Broadcast");
            YTW.LIZ().LJIIIIZZ("audio become noisy");
            EarphonePlayerControl.LJII().LJFF(true);
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
