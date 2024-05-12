package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;

/* renamed from: X.F9y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38522F9y extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!C38523F9z.LIZJ) {
                if (C38523F9z.LJIIIIZZ != null) {
                    Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeInt("network_data", 1);
                }
                C38523F9z.LIZJ = true;
            }
            C38523F9z.LIZIZ = true;
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
