package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.ttvideoengine.TTVideoEngineMonitor;
import java.util.ArrayList;

/* renamed from: X.IqB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47847IqB extends BroadcastReceiver {
    public final /* synthetic */ TTVideoEngineMonitor LIZ;

    public C47847IqB(TTVideoEngineMonitor tTVideoEngineMonitor) {
        this.LIZ = tTVideoEngineMonitor;
    }

    public final void LIZ(Intent intent) {
        C47865IqT c47865IqT;
        TTVideoEngineMonitor tTVideoEngineMonitor;
        boolean z;
        if (!TTVideoEngineMonitor.enableCheck || intent == null || TextUtils.isEmpty(intent.getAction())) {
            return;
        }
        intent.getAction();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "enginehash");
        if (TextUtils.isEmpty(LLJJIJIIJIL)) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("com.bytedance.android.livesdk.player.monitor.ACTION_LIVE_PLAYER_STOP_OR_RELEASE")) {
            if (!action.equals("com.bytedance.android.livesdk.player.monitor.ACTION_LIVE_PLAYER_PLAYING")) {
                return;
            }
            synchronized (this) {
                c47865IqT = this.LIZ.playingLivePLayerInfos.get(LLJJIJIIJIL);
            }
            if (c47865IqT != null) {
                return;
            }
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "tag");
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "subtag");
            C47865IqT c47865IqT2 = new C47865IqT();
            if (!TextUtils.isEmpty(LLJJIJIIJIL2)) {
                c47865IqT2.LIZ = LLJJIJIIJIL2;
            }
            if (!TextUtils.isEmpty(LLJJIJIIJIL3)) {
                c47865IqT2.LIZIZ = LLJJIJIIJIL3;
            }
            synchronized (this) {
                this.LIZ.playingLivePLayerInfos.put(LLJJIJIIJIL, c47865IqT2);
                int size = this.LIZ.playingLivePLayerInfos.size();
                tTVideoEngineMonitor = this.LIZ;
                if (tTVideoEngineMonitor.playingCount + size >= 2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
            tTVideoEngineMonitor.postRunCrosstalkCheck();
            return;
        }
        synchronized (this) {
            this.LIZ.playingLivePLayerInfos.remove(LLJJIJIIJIL);
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
