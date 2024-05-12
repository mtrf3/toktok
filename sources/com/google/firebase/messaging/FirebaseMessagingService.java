package com.google.firebase.messaging;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C48215Iw7;
import X.C66163Pxv;
import X.C67223QZv;
import X.C67224QZw;
import X.C84763XOl;
import X.QZF;
import X.ThreadFactoryC39014FSw;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes12.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_google_firebase_messaging_FirebaseMessagingService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        LLJJIJI.remove("androidx.content.wakelockid");
        if (C67224QZw.LJFF(LLJJIJI)) {
            C67224QZw c67224QZw = new C67224QZw(LLJJIJI);
            ExecutorService LLLLZLLLI = C16880lQ.LLLLZLLLI(new ThreadFactoryC39014FSw("Firebase-Messaging-Network-Io"));
            try {
                if (new C67223QZv(this, c67224QZw, LLLLZLLLI).LIZ()) {
                    return;
                }
                LLLLZLLLI.shutdown();
                if (QZF.LIZIZ(intent)) {
                    QZF.LIZ(C16880lQ.LLJJIJI(intent), "_nf");
                }
            } finally {
                LLLLZLLLI.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(LLJJIJI));
    }

    private String getMessageId(Intent intent) {
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "google.message_id");
        if (LLJJIJIIJIL == null) {
            return C16880lQ.LLJJIJIIJIL(intent, "message_id");
        }
        return LLJJIJIIJIL;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(C16880lQ.LLJJIJIIJIL(intent, "google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:32|(1:34)|35|(1:37)(2:99|(2:101|102))|38|(2:93|94)|40|(1:42)(1:92)|43|(1:91)|47|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)|61|(6:87|88|70|(1:75)|72|(1:74))|63|(6:83|84|70|(0)|72|(0))|65|66|(1:68)(4:77|(2:79|(1:81))|72|(0))|69|70|(0)|72|(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.QYt] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [long] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void passMessageIntentToSdk(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.passMessageIntentToSdk(android.content.Intent):void");
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) C48215Iw7.LIZ().LIZLLL).poll();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            handleMessageIntent(intent);
        } else {
            if (!"com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                return;
            }
            onNewToken(C16880lQ.LLJJIJIIJIL(intent, "token"));
        }
    }

    public static void com_google_firebase_messaging_FirebaseMessagingService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(FirebaseMessagingService firebaseMessagingService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        firebaseMessagingService.com_google_firebase_messaging_FirebaseMessagingService__attachBaseContext$___twin___(context);
    }
}
