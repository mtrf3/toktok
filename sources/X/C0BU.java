package X;

/* renamed from: X.0BU, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0BU implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.LJLIL
            r1 = 1
            r5 = 0
            switch(r0) {
                case 0: goto Lba;
                case 1: goto Lb0;
                case 2: goto La6;
                case 3: goto L9e;
                case 4: goto L96;
                case 5: goto L8c;
                case 6: goto L2d;
                case 7: goto L25;
                case 8: goto Lf;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            X.C46728IVo.LJIILJJIL(r0)
            return
        Lf:
            java.lang.Object r0 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            if (r0 == 0) goto L24
        L16:
            java.util.List r2 = r0.getItems()
            X.NFk r1 = X.EnumC59048NFk.PROFILE
            java.lang.String r0 = "preloadScene"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.NDZ.LIZ(r2, r1, r5)
        L24:
            return
        L25:
            java.lang.Object r0 = r6.LJLILLLLZI
            X.FEs r0 = (X.C38646FEs) r0
            r0.LJIILIIL()
            return
        L2d:
            java.lang.Object r0 = r6.LJLILLLLZI
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            android.content.Context r4 = r0.LIZLLL
            android.content.Context r1 = X.C16880lQ.LLLLL(r4)
            if (r1 != 0) goto L3a
            r1 = r4
        L3a:
            java.lang.String r0 = "com.google.firebase.messaging"
            r2 = 0
            android.content.SharedPreferences r1 = X.F9J.LIZIZ(r1, r2, r0)
            java.lang.String r0 = "proxy_notification_initialized"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L4a
        L49:
            return
        L4a:
            java.lang.String r3 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r0 = X.C16880lQ.LLLLL(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r2 == 0) goto L73
            java.lang.String r1 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = X.C16880lQ.LLLLLLLLL(r2, r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r1 == 0) goto L73
            android.os.Bundle r0 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r0 == 0) goto L73
            boolean r0 = r0.containsKey(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r0 == 0) goto L73
            android.os.Bundle r0 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            boolean r2 = r0.getBoolean(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            goto L74
        L73:
            r2 = 1
        L74:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L88
            X.Qgn r1 = new X.Qgn
            r1.<init>()
            X.FjH r0 = new X.FjH
            r0.<init>()
            r0.run()
            goto L49
        L88:
            X.C67637Qgb.LJ(r5)
            goto L49
        L8c:
            java.lang.Object r0 = r6.LJLILLLLZI
            X.W55 r0 = (X.W55) r0
            X.Vug<X.Vuj> r0 = r0.LJLIL
            r0.LJ()
            return
        L96:
            java.lang.Object r0 = r6.LJLILLLLZI
            com.bytedance.helios.nativeaudio.AudioMonitorImpl r0 = (com.bytedance.helios.nativeaudio.AudioMonitorImpl) r0
            com.bytedance.helios.nativeaudio.NativeAudioService.lambda$semisugar$startMonitor$0(r0)
            return
        L9e:
            java.lang.Object r0 = r6.LJLILLLLZI
            X.CKB r0 = (X.CKB) r0
            r0.onMessageFinish()
            return
        La6:
            java.lang.Object r0 = r6.LJLILLLLZI
            X.Bxh r0 = (X.C30477Bxh) r0
            com.bytedance.android.livesdk.broadcast.video.VideoWidget r0 = r0.LIZ
            r0.initEffect()
            return
        Lb0:
            java.lang.Object r0 = r6.LJLILLLLZI
            X.0qI r0 = (X.C19900qI) r0
            r0.LIZ = r1
            r0.dismiss()
            return
        Lba:
            java.lang.Object r0 = r6.LJLILLLLZI
            r0.getClass()
            java.util.Collections.emptyList()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0BU.run():void");
    }

    public /* synthetic */ C0BU(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
