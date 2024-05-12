package X;

import Y.ARunnableS22S0300000_11;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.push.PushBody;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;

/* renamed from: X.PMd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64319PMd extends AbstractC64321PMf {
    public final InterfaceC64320PMe LIZ;
    public final C63936P7k LIZIZ;

    public C64319PMd(InterfaceC64320PMe interfaceC64320PMe, InterfaceC63935P7j interfaceC63935P7j) {
        this.LIZ = interfaceC64320PMe;
        this.LIZIZ = new C63936P7k(interfaceC63935P7j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1.getNotificationChannel(r2) != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:6:0x0006, B:8:0x001b, B:9:0x0025, B:24:0x0050, B:26:0x0054, B:27:0x0059, B:29:0x0078, B:30:0x0082, B:32:0x0092, B:33:0x0098, B:45:0x009b, B:48:0x0048, B:11:0x002a, B:13:0x002e, B:15:0x0038, B:18:0x003f), top: B:5:0x0006, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:6:0x0006, B:8:0x001b, B:9:0x0025, B:24:0x0050, B:26:0x0054, B:27:0x0059, B:29:0x0078, B:30:0x0082, B:32:0x0092, B:33:0x0098, B:45:0x009b, B:48:0x0048, B:11:0x002a, B:13:0x002e, B:15:0x0038, B:18:0x003f), top: B:5:0x0006, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:6:0x0006, B:8:0x001b, B:9:0x0025, B:24:0x0050, B:26:0x0054, B:27:0x0059, B:29:0x0078, B:30:0x0082, B:32:0x0092, B:33:0x0098, B:45:0x009b, B:48:0x0048, B:11:0x002a, B:13:0x002e, B:15:0x0038, B:18:0x003f), top: B:5:0x0006, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:6:0x0006, B:8:0x001b, B:9:0x0025, B:24:0x0050, B:26:0x0054, B:27:0x0059, B:29:0x0078, B:30:0x0082, B:32:0x0092, B:33:0x0098, B:45:0x009b, B:48:0x0048, B:11:0x002a, B:13:0x002e, B:15:0x0038, B:18:0x003f), top: B:5:0x0006, inners: #2 }] */
    @Override // X.AbstractC64321PMf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification LIZ(android.content.Context r8, com.bytedance.push.PushBody r9, android.graphics.Bitmap r10) {
        /*
            r7 = this;
            X.PMe r0 = r7.LIZ
            r6 = 0
            if (r0 == 0) goto L6
            return r6
        L6:
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = r8.getPackageName()     // Catch: java.lang.Exception -> Lbd
            r5 = 0
            android.content.pm.PackageInfo r1 = X.C16880lQ.LLLLLLZ(r1, r0, r5)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = r9.title     // Catch: java.lang.Exception -> Lbd
            boolean r0 = X.C38354F3m.LJ(r0)     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto L25
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo     // Catch: java.lang.Exception -> Lbd
            int r0 = r0.labelRes     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Exception -> Lbd
            r9.title = r0     // Catch: java.lang.Exception -> Lbd
        L25:
            java.lang.String r2 = r9.mNotificationChannelId     // Catch: java.lang.Exception -> Lbd
            r3 = 1
            r4 = 26
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L47
            if (r0 < r4) goto L45
            java.lang.String r0 = "notification"
            java.lang.Object r1 = X.C16880lQ.LLILL(r8, r0)     // Catch: java.lang.Exception -> L47
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto L4b
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L3f
            goto L4b
        L3f:
            android.app.NotificationChannel r0 = r1.getNotificationChannel(r2)     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L4b
        L45:
            r0 = 1
            goto L4c
        L47:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Exception -> Lbd
        L4b:
            r0 = 0
        L4c:
            if (r0 != 0) goto L50
            java.lang.String r2 = "push"
        L50:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lbd
            if (r0 < r4) goto L9b
            android.app.Notification$Builder r4 = new android.app.Notification$Builder     // Catch: java.lang.Exception -> Lbd
            r4.<init>(r8, r2)     // Catch: java.lang.Exception -> Lbd
        L59:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r2 = r9.title     // Catch: java.lang.Exception -> Lbd
            android.app.Notification$Builder r2 = r4.setTicker(r2)     // Catch: java.lang.Exception -> Lbd
            r2.setAutoCancel(r3)     // Catch: java.lang.Exception -> Lbd
            r4.setWhen(r0)     // Catch: java.lang.Exception -> Lbd
            boolean r0 = r9.showWhen     // Catch: java.lang.Exception -> Lbd
            r4.setShowWhen(r0)     // Catch: java.lang.Exception -> Lbd
            r0 = 2131234267(0x7f080ddb, float:1.8084695E38)
            r4.setSmallIcon(r0)     // Catch: java.lang.Exception -> Lbd
            boolean r0 = r9.useLED     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto L82
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 2500(0x9c4, float:3.503E-42)
            r4.setLights(r2, r1, r0)     // Catch: java.lang.Exception -> Lbd
        L82:
            r4.setPriority(r3)     // Catch: java.lang.Exception -> Lbd
            long[] r0 = new long[r5]     // Catch: java.lang.Exception -> Lbd
            r4.setVibrate(r0)     // Catch: java.lang.Exception -> Lbd
            android.app.Notification r2 = X.AbstractC64321PMf.LIZJ(r4, r8, r9, r10)     // Catch: java.lang.Exception -> Lbd
            boolean r0 = r9.useSound     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto L98
            int r0 = r2.defaults     // Catch: java.lang.Exception -> Lbd
            r0 = r0 | 1
            r2.defaults = r0     // Catch: java.lang.Exception -> Lbd
        L98:
            boolean r0 = r9.useVibrator     // Catch: java.lang.Exception -> Lbd
            goto La1
        L9b:
            android.app.Notification$Builder r4 = new android.app.Notification$Builder     // Catch: java.lang.Exception -> Lbd
            r4.<init>(r8)     // Catch: java.lang.Exception -> Lbd
            goto L59
        La1:
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "audio"
            java.lang.Object r0 = X.C16880lQ.LLILL(r8, r0)     // Catch: java.lang.Throwable -> Lb4
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch: java.lang.Throwable -> Lb4
            int r1 = r0.getRingerMode()     // Catch: java.lang.Throwable -> Lb4
            r0 = 2
            if (r1 == r3) goto Lb6
            if (r1 == r0) goto Lb6
        Lb4:
            r6 = r2
            goto Lc1
        Lb6:
            int r0 = r2.defaults     // Catch: java.lang.Throwable -> Lb4
            r0 = r0 | 2
            r2.defaults = r0     // Catch: java.lang.Throwable -> Lb4
            goto Lb4
        Lbd:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64319PMd.LIZ(android.content.Context, com.bytedance.push.PushBody, android.graphics.Bitmap):android.app.Notification");
    }

    public final void LJ(Context context, int i, PushBody pushBody) {
        if (this.LIZ != null) {
            MessageShowHandler messageShowHandler = C39115FWt.LIZ;
            String LIZ = pushBody.LIZ();
            messageShowHandler.getClass();
            MessageShowHandler.LIZJ(context, 1, LIZ, i);
            return;
        }
        HG3 hg3 = QRM.LJIIIIZZ.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("show message :");
        LIZ2.append(pushBody);
        X1D.LIZIZ(LIZ2);
        hg3.getClass();
        if (pushBody.imageType != 0 && !TextUtils.isEmpty(pushBody.imageUrl)) {
            String str = pushBody.imageUrl;
            C63937P7l c63937P7l = new C63937P7l(this, context, i, pushBody);
            C63936P7k c63936P7k = this.LIZIZ;
            C63934P7i c63934P7i = new C63934P7i(UriProtector.parse(str));
            if (c63936P7k.LJLILLLLZI == null) {
                c63936P7k.LJLILLLLZI = new Handler(C16880lQ.LLJJJJ(), c63936P7k);
            }
            RunnableC39007FSp.LIZIZ(new ARunnableS22S0300000_11(c63936P7k, c63934P7i, c63937P7l, 17));
            return;
        }
        LIZLLL(context, i, pushBody, null);
    }
}
