package com.byted.cast.sdk.monitor;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.byted.cast.sdk.utils.Logger;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public class ScreenMonitor {
    public final Context mContext;
    public boolean mIsRegistered;
    public final ScreenStateListener mListener;
    public ScreenStateReceiver mReceiver;

    /* loaded from: classes29.dex */
    public interface ScreenStateListener {
        void onKeyguardUnlock();

        void onScreenOff();

        void onScreenOn();
    }

    public void register() {
        if (this.mIsRegistered) {
            Logger.w("ScreenMonitor", "Already register screen receiver!!!");
            return;
        }
        if (this.mReceiver == null) {
            this.mReceiver = new ScreenStateReceiver();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        Context context = this.mContext;
        if (context != null) {
            C16880lQ.LJJLIIIJILLIZJL(this.mReceiver, context, intentFilter);
        }
        this.mIsRegistered = true;
    }

    public void unregister() {
        ScreenStateReceiver screenStateReceiver;
        if (!this.mIsRegistered) {
            Logger.w("ScreenMonitor", "no need to unregister screen receiver.");
            return;
        }
        Context context = this.mContext;
        if (context != null && (screenStateReceiver = this.mReceiver) != null) {
            C16880lQ.LJJLIIIJL(context, screenStateReceiver);
            this.mReceiver = null;
        }
        this.mIsRegistered = false;
    }

    /* loaded from: classes29.dex */
    public class ScreenStateReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_byted_cast_sdk_monitor_ScreenMonitor$ScreenStateReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public ScreenStateReceiver() {
        }

        public void com_byted_cast_sdk_monitor_ScreenMonitor$ScreenStateReceiver__onReceive$___twin___(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                if (ScreenMonitor.this.mListener != null) {
                    Logger.i("ScreenMonitor", "receive ACTION_SCREEN_ON");
                    ScreenMonitor.this.mListener.onScreenOn();
                    return;
                }
                return;
            }
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                if (ScreenMonitor.this.mListener == null) {
                    return;
                }
                Logger.i("ScreenMonitor", "receive ACTION_SCREEN_OFF");
                ScreenMonitor.this.mListener.onScreenOff();
                return;
            }
            if (!intent.getAction().equals("android.intent.action.USER_PRESENT") || ScreenMonitor.this.mListener == null) {
                return;
            }
            Logger.i("ScreenMonitor", "receive ACTION_USER_PRESENT");
            ScreenMonitor.this.mListener.onKeyguardUnlock();
        }

        public static void com_byted_cast_sdk_monitor_ScreenMonitor$ScreenStateReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(ScreenStateReceiver screenStateReceiver, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                screenStateReceiver.com_byted_cast_sdk_monitor_ScreenMonitor$ScreenStateReceiver__onReceive$___twin___(context, intent);
            } else {
                C38523F9z.LIZ();
                screenStateReceiver.com_byted_cast_sdk_monitor_ScreenMonitor$ScreenStateReceiver__onReceive$___twin___(context, intent);
            }
        }

        public static void com_byted_cast_sdk_monitor_ScreenMonitor$ScreenStateReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(ScreenStateReceiver screenStateReceiver, Context context, Intent intent) {
            if (!C84763XOl.LJIIJJI && intent != null) {
                if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                    C35532Dx2.LIZIZ();
                }
            }
            com_byted_cast_sdk_monitor_ScreenMonitor$ScreenStateReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(screenStateReceiver, context, intent);
        }
    }

    public ScreenMonitor(Context context, ScreenStateListener screenStateListener) {
        this.mContext = context;
        this.mListener = screenStateListener;
    }
}
