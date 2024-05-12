package com.google.android.gms.cast.framework.media;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.C90613ZhJ;
import X.C90639Zhj;
import X.QH7;
import X.ZYJ;
import X.ZYQ;
import X.ZYS;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_google_android_gms_cast_framework_media_MediaIntentReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    public static C90639Zhj getRemoteMediaClient(C90613ZhJ c90613ZhJ) {
        if (c90613ZhJ == null || !c90613ZhJ.LIZJ()) {
            return null;
        }
        return c90613ZhJ.LJIIIIZZ();
    }

    private void togglePlayback(C90613ZhJ c90613ZhJ) {
        C90639Zhj remoteMediaClient = getRemoteMediaClient(c90613ZhJ);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.LJIJJ();
    }

    public void onReceiveActionSkipNext(ZYQ zyq) {
        C90639Zhj remoteMediaClient;
        if (!(zyq instanceof C90613ZhJ) || (remoteMediaClient = getRemoteMediaClient((C90613ZhJ) zyq)) == null || remoteMediaClient.LJIILL()) {
            return;
        }
        remoteMediaClient.LJIILLIIL();
    }

    public void onReceiveActionSkipPrev(ZYQ zyq) {
        C90639Zhj remoteMediaClient;
        if (!(zyq instanceof C90613ZhJ) || (remoteMediaClient = getRemoteMediaClient((C90613ZhJ) zyq)) == null || remoteMediaClient.LJIILL()) {
            return;
        }
        remoteMediaClient.LJIIZILJ();
    }

    public void onReceiveActionTogglePlayback(ZYQ zyq) {
        if (zyq instanceof C90613ZhJ) {
            togglePlayback((C90613ZhJ) zyq);
        }
    }

    private void seek(C90613ZhJ c90613ZhJ, long j) {
        C90639Zhj remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(c90613ZhJ)) == null || remoteMediaClient.LJIIJJI() || remoteMediaClient.LJIILL()) {
            return;
        }
        remoteMediaClient.LJIJI(remoteMediaClient.LIZJ() + j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void com_google_android_gms_cast_framework_media_MediaIntentReceiver__onReceive$___twin___(Context context, Intent intent) {
        ZYS LIZ;
        ZYQ LIZLLL;
        char c;
        String action = intent.getAction();
        if (action == null || (LIZLLL = (LIZ = ZYJ.LIZIZ(context).LIZ()).LIZLLL()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -945151566:
                if (action.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -945080078:
                if (action.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (action.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (action.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 235550565:
                if (action.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (action.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                onReceiveActionTogglePlayback(LIZLLL);
                return;
            case 1:
                onReceiveActionSkipNext(LIZLLL);
                return;
            case 2:
                onReceiveActionSkipPrev(LIZLLL);
                return;
            case 3:
                onReceiveActionForward(LIZLLL, intent.getLongExtra("googlecast-extra_skip_step_ms", 0L));
                return;
            case 4:
                onReceiveActionRewind(LIZLLL, intent.getLongExtra("googlecast-extra_skip_step_ms", 0L));
                return;
            case 5:
                LIZ.LIZIZ(true);
                return;
            case 6:
                LIZ.LIZIZ(false);
                return;
            case 7:
                onReceiveActionMediaButton(LIZLLL, intent);
                return;
            default:
                onReceiveOtherAction(context, action, intent);
                return;
        }
    }

    public void onReceiveActionForward(ZYQ zyq, long j) {
        if (zyq instanceof C90613ZhJ) {
            seek((C90613ZhJ) zyq, j);
        }
    }

    public void onReceiveActionMediaButton(ZYQ zyq, Intent intent) {
        if (!(zyq instanceof C90613ZhJ) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return;
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        QH7.LJIIIIZZ(LLJJIJI);
        KeyEvent keyEvent = (KeyEvent) C16880lQ.LLJJIII(LLJJIJI, "android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 85) {
            return;
        }
        togglePlayback((C90613ZhJ) zyq);
    }

    public void onReceiveActionRewind(ZYQ zyq, long j) {
        if (zyq instanceof C90613ZhJ) {
            seek((C90613ZhJ) zyq, -j);
        }
    }

    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public static void com_google_android_gms_cast_framework_media_MediaIntentReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(MediaIntentReceiver mediaIntentReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            mediaIntentReceiver.com_google_android_gms_cast_framework_media_MediaIntentReceiver__onReceive$___twin___(context, intent);
        } else {
            C38523F9z.LIZ();
            mediaIntentReceiver.com_google_android_gms_cast_framework_media_MediaIntentReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_google_android_gms_cast_framework_media_MediaIntentReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(MediaIntentReceiver mediaIntentReceiver, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        com_google_android_gms_cast_framework_media_MediaIntentReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(mediaIntentReceiver, context, intent);
    }
}
