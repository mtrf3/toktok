package com.bytedance.bae.webrtc.observer;

import X.AnonymousClass028;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.realx.base.ContextUtils;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class VolumeChangedObserver {
    public VolumeBroadcastReceiver mVolumeBroadcastReceiver;
    public OnVolumeChangedListener onVolumeChangedListener;

    /* loaded from: classes9.dex */
    public interface OnVolumeChangedListener {
        void onVolumeChanged(int i, int i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3.mVolumeBroadcastReceiver = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r3.onVolumeChangedListener == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r3.onVolumeChangedListener != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r3.onVolumeChangedListener = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void unregisterReceiver() {
        /*
            r3 = this;
            r2 = 0
            android.content.Context r1 = com.bytedance.realx.base.ContextUtils.getApplicationContext()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L19
            com.bytedance.bae.webrtc.observer.VolumeChangedObserver$VolumeBroadcastReceiver r0 = r3.mVolumeBroadcastReceiver     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L19
            if (r0 == 0) goto L1e
            X.C16880lQ.LJJLIIIJL(r1, r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L19
            r3.mVolumeBroadcastReceiver = r2     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L19
            goto L1e
        Lf:
            r1 = move-exception
            com.bytedance.bae.webrtc.observer.VolumeChangedObserver$OnVolumeChangedListener r0 = r3.onVolumeChangedListener
            if (r0 == 0) goto L16
            r3.onVolumeChangedListener = r2
        L16:
            r3.mVolumeBroadcastReceiver = r2
            throw r1
        L19:
            com.bytedance.bae.webrtc.observer.VolumeChangedObserver$OnVolumeChangedListener r0 = r3.onVolumeChangedListener
            if (r0 == 0) goto L24
            goto L22
        L1e:
            com.bytedance.bae.webrtc.observer.VolumeChangedObserver$OnVolumeChangedListener r0 = r3.onVolumeChangedListener
            if (r0 == 0) goto L24
        L22:
            r3.onVolumeChangedListener = r2
        L24:
            r3.mVolumeBroadcastReceiver = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bae.webrtc.observer.VolumeChangedObserver.unregisterReceiver():void");
    }

    private void registerVolumeChangeAction() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        this.mVolumeBroadcastReceiver = new VolumeBroadcastReceiver();
        C16880lQ.LJJLIIIJILLIZJL(this.mVolumeBroadcastReceiver, applicationContext, AnonymousClass028.LIZ("android.media.VOLUME_CHANGED_ACTION"));
    }

    public void release() {
        unregisterReceiver();
        this.onVolumeChangedListener = null;
    }

    /* loaded from: classes9.dex */
    public class VolumeBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_bytedance_bae_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public VolumeBroadcastReceiver() {
        }

        public void com_bytedance_bae_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver__onReceive$___twin___(Context context, Intent intent) {
            VolumeChangedObserver volumeChangedObserver = VolumeChangedObserver.this;
            if (volumeChangedObserver.onVolumeChangedListener != null && "android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                try {
                    int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
                    if (intExtra == 3 || intExtra == 0 || intExtra == 6) {
                        volumeChangedObserver.onVolumeChangedListener.onVolumeChanged(intExtra, intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1));
                    }
                } catch (Exception unused) {
                }
            }
        }

        public static void com_bytedance_bae_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(VolumeBroadcastReceiver volumeBroadcastReceiver, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                volumeBroadcastReceiver.com_bytedance_bae_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                volumeBroadcastReceiver.com_bytedance_bae_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver__onReceive$___twin___(context, intent);
            }
        }

        public static void com_bytedance_bae_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(VolumeBroadcastReceiver volumeBroadcastReceiver, Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_bytedance_bae_webrtc_observer_VolumeChangedObserver$VolumeBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(volumeBroadcastReceiver, context, intent);
        }
    }

    public VolumeChangedObserver(OnVolumeChangedListener onVolumeChangedListener) {
        this.onVolumeChangedListener = onVolumeChangedListener;
        registerVolumeChangeAction();
    }
}
