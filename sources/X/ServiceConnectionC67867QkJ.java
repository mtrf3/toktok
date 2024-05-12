package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.QkJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67867QkJ implements ServiceConnection, QCW {
    public final java.util.Map<ServiceConnection, ServiceConnection> LJLIL = new HashMap();
    public int LJLILLLLZI = 2;
    public boolean LJLJI;
    public IBinder LJLJJI;
    public final C65428Pm4 LJLJJL;
    public ComponentName LJLJJLL;
    public final /* synthetic */ C67868QkK LJLJL;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (r4.charAt(0) <= 'Z') goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006d A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:5:0x003e, B:7:0x0057, B:11:0x006d, B:13:0x0070), top: B:4:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0057 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:5:0x003e, B:7:0x0057, B:11:0x006d, B:13:0x0070), top: B:4:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.concurrent.Executor r11) {
        /*
            r10 = this;
            r0 = 3
            r7 = r10
            r7.LJLILLLLZI = r0
            android.os.StrictMode$VmPolicy r3 = android.os.StrictMode.getVmPolicy()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r2 = 1
            if (r1 < r0) goto L20
        Lf:
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r3)
            android.os.StrictMode$VmPolicy$Builder r0 = r0.permitUnsafeIntentLaunch()
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
            goto L3e
        L20:
            r0 = 30
            r5 = 0
            if (r1 < r0) goto L3e
            java.lang.String r4 = android.os.Build.VERSION.CODENAME
            int r0 = r4.length()
            if (r0 != r2) goto L3e
            char r1 = r4.charAt(r5)
            r0 = 83
            if (r1 < r0) goto L3e
            char r1 = r4.charAt(r5)
            r0 = 90
            if (r1 > r0) goto L3e
            goto Lf
        L3e:
            X.QkK r0 = r7.LJLJL     // Catch: java.lang.Throwable -> L7d
            X.QCV r4 = r0.LJI     // Catch: java.lang.Throwable -> L7d
            android.content.Context r5 = r0.LJ     // Catch: java.lang.Throwable -> L7d
            X.Pm4 r0 = r7.LJLJJL     // Catch: java.lang.Throwable -> L7d
            android.content.Intent r6 = r0.LIZ(r5)     // Catch: java.lang.Throwable -> L7d
            X.Pm4 r0 = r7.LJLJJL     // Catch: java.lang.Throwable -> L7d
            int r8 = r0.LIZJ     // Catch: java.lang.Throwable -> L7d
            r9 = r11
            boolean r0 = r4.LIZLLL(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7d
            r7.LJLJI = r0     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L6d
            X.QkK r0 = r7.LJLJL     // Catch: java.lang.Throwable -> L7d
            X.Ql3 r1 = r0.LJFF     // Catch: java.lang.Throwable -> L7d
            X.Pm4 r0 = r7.LJLJJL     // Catch: java.lang.Throwable -> L7d
            android.os.Message r4 = r1.obtainMessage(r2, r0)     // Catch: java.lang.Throwable -> L7d
            X.QkK r0 = r7.LJLJL     // Catch: java.lang.Throwable -> L7d
            X.Ql3 r2 = r0.LJFF     // Catch: java.lang.Throwable -> L7d
            X.QkK r0 = r7.LJLJL     // Catch: java.lang.Throwable -> L7d
            long r0 = r0.LJIIIIZZ     // Catch: java.lang.Throwable -> L7d
            r2.sendMessageDelayed(r4, r0)     // Catch: java.lang.Throwable -> L7d
            goto L79
        L6d:
            r0 = 2
            r7.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L7d
            X.QkK r0 = r7.LJLJL     // Catch: java.lang.IllegalArgumentException -> L79 java.lang.Throwable -> L7d
            X.QCV r1 = r0.LJI     // Catch: java.lang.IllegalArgumentException -> L79 java.lang.Throwable -> L7d
            android.content.Context r0 = r0.LJ     // Catch: java.lang.IllegalArgumentException -> L79 java.lang.Throwable -> L7d
            r1.LIZJ(r0, r7)     // Catch: java.lang.IllegalArgumentException -> L79 java.lang.Throwable -> L7d
        L79:
            android.os.StrictMode.setVmPolicy(r3)
            return
        L7d:
            r0 = move-exception
            android.os.StrictMode.setVmPolicy(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ServiceConnectionC67867QkJ.LIZ(java.util.concurrent.Executor):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.LJLJL.LIZLLL) {
            this.LJLJL.LJFF.removeMessages(1, this.LJLJJL);
            this.LJLJJI = null;
            this.LJLJJLL = componentName;
            Iterator it = ((HashMap) this.LJLIL).values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.LJLILLLLZI = 2;
        }
    }

    public ServiceConnectionC67867QkJ(C67868QkK c67868QkK, C65428Pm4 c65428Pm4) {
        this.LJLJL = c67868QkK;
        this.LJLJJL = c65428Pm4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.LJLJL.LIZLLL) {
            this.LJLJL.LJFF.removeMessages(1, this.LJLJJL);
            this.LJLJJI = iBinder;
            this.LJLJJLL = componentName;
            Iterator it = ((HashMap) this.LJLIL).values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.LJLILLLLZI = 1;
        }
    }
}
