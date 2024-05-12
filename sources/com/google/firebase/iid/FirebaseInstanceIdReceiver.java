package com.google.firebase.iid;

import X.C16880lQ;
import X.C67164QXo;
import X.C67637Qgb;
import X.QZF;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.ExecutionException;

/* loaded from: classes12.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) C67637Qgb.LIZ(new C67164QXo(context).LIZJ(cloudMessage.zza))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (QZF.LIZIZ(putExtras)) {
            QZF.LIZ(C16880lQ.LLJJIJI(putExtras), "_nd");
        }
    }
}
