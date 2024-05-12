package com.bytedance.bae.webrtc.observer;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bytedance.realx.base.ContextUtils;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class MicMuteChangedObserver {
    public MicMuteBroadCastReceiver mMicMuteBroadCastReceiver;
    public OnMicMuteChangedListener mOnMicMuteChangedListener;

    /* loaded from: classes12.dex */
    public interface OnMicMuteChangedListener {
        void onMicMuteChanged(boolean z);
    }

    private void registerReceiver() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        MicMuteBroadCastReceiver micMuteBroadCastReceiver = new MicMuteBroadCastReceiver();
        this.mMicMuteBroadCastReceiver = micMuteBroadCastReceiver;
        C16880lQ.LJJLIIIJILLIZJL(micMuteBroadCastReceiver, applicationContext, new IntentFilter("android.media.action.MICROPHONE_MUTE_CHANGED"));
    }

    private void unregisterReceiver() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        try {
            MicMuteBroadCastReceiver micMuteBroadCastReceiver = this.mMicMuteBroadCastReceiver;
            if (micMuteBroadCastReceiver != null) {
                C16880lQ.LJJLIIIJL(applicationContext, micMuteBroadCastReceiver);
                this.mMicMuteBroadCastReceiver = null;
            }
        } catch (Exception unused) {
        }
    }

    public void release() {
        unregisterReceiver();
        this.mOnMicMuteChangedListener = null;
    }

    /* loaded from: classes12.dex */
    public final class MicMuteBroadCastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_bytedance_bae_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public MicMuteBroadCastReceiver() {
        }

        public void com_bytedance_bae_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver__onReceive$___twin___(Context context, Intent intent) {
            OnMicMuteChangedListener onMicMuteChangedListener;
            MicMuteChangedObserver micMuteChangedObserver = MicMuteChangedObserver.this;
            if (context != null && intent != null && micMuteChangedObserver != null && intent.getAction() == "android.media.action.MICROPHONE_MUTE_CHANGED") {
                try {
                    AudioManager audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
                    if (audioManager != null && (onMicMuteChangedListener = micMuteChangedObserver.mOnMicMuteChangedListener) != null) {
                        onMicMuteChangedListener.onMicMuteChanged(audioManager.isMicrophoneMute());
                    }
                } catch (Exception unused) {
                }
            }
        }

        public static void com_bytedance_bae_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(MicMuteBroadCastReceiver micMuteBroadCastReceiver, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                micMuteBroadCastReceiver.com_bytedance_bae_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                micMuteBroadCastReceiver.com_bytedance_bae_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver__onReceive$___twin___(context, intent);
            }
        }

        public static void com_bytedance_bae_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(MicMuteBroadCastReceiver micMuteBroadCastReceiver, Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_bytedance_bae_webrtc_observer_MicMuteChangedObserver$MicMuteBroadCastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(micMuteBroadCastReceiver, context, intent);
        }
    }

    public MicMuteChangedObserver(OnMicMuteChangedListener onMicMuteChangedListener) {
        this.mOnMicMuteChangedListener = onMicMuteChangedListener;
        registerReceiver();
    }
}
