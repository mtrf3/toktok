package X;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class FA8 extends Handler {
    public final Handler LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ MainLooperOptService LIZJ;

    public static Object LIZ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-333487723956193647"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    public final void LIZIZ() {
        try {
            this.LIZIZ = false;
            if (this.LIZJ.LJIILLIIL() == this) {
                FA5.LIZJ(LIZ(C36508EUm.LIZIZ(this.LIZJ.LJLLI, "currentActivityThread", new Class[0]), new Object[0]), C36508EUm.LIZ(this.LIZJ.LJLLI, "mH"), this.LIZ);
                FA5.LIZIZ(this, this.LIZ);
            }
        } catch (Throwable th) {
            android.util.Log.getStackTraceString(th);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Handler handler = this.LIZ;
        if (handler != null) {
            handler.handleMessage(message);
        } else {
            super.handleMessage(message);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FA8(com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService r6, android.os.Handler r7) {
        /*
            r5 = this;
            r5.LIZJ = r6
            if (r7 == 0) goto Lf
            android.os.Looper r0 = r7.getLooper()
        L8:
            r5.<init>(r0)
            r5.LIZ = r7
            r4 = 0
            goto L14
        Lf:
            android.os.Looper r0 = X.C16880lQ.LLJJJJ()
            goto L8
        L14:
            java.lang.Class<?> r1 = r6.LJLLI     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r3 = X.C36508EUm.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L34
            com.bytedance.sysoptimizer.java.ReflectionUtils.removeFinal(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.Class<?> r2 = r6.LJLLI     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "currentActivityThread"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Method r1 = X.C36508EUm.LIZIZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L34
            java.lang.Object r0 = LIZ(r1, r0)     // Catch: java.lang.Throwable -> L34
            X.FA5.LIZ(r0, r3, r7, r5)     // Catch: java.lang.Throwable -> L34
            r4 = 1
            goto L39
        L34:
            r0 = move-exception
            android.util.Log.getStackTraceString(r0)
        L39:
            r5.LIZIZ = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FA8.<init>(com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService, android.os.Handler):void");
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        boolean z;
        if (this.LIZIZ) {
            java.util.Map<FAB, Boolean> map = this.LIZJ.LJLIL;
            FAB fab = FAB.WATCH_EXECUTE_TRANSACTION;
            if (!((Boolean) ((HashMap) map).get(fab)).booleanValue()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DelegateActivityThreadHandler: Whether the current message is equal to ");
                LIZ.append(this.LIZJ.LJLILLLLZI.name());
                X1D.LIZIZ(LIZ);
                int i = Build.VERSION.SDK_INT;
                if (i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.LIZJ.LJLILLLLZI == fab && message.what == 159) {
                        boolean sendMessageAtTime = super.sendMessageAtTime(message, 0L);
                        this.LIZJ.LJIILIIL();
                        return sendMessageAtTime;
                    }
                } else {
                    MainLooperOptService mainLooperOptService = this.LIZJ;
                    FAB fab2 = mainLooperOptService.LJLILLLLZI;
                    FAB fab3 = FAB.WATCH_PAUSE_TOP_ACTIVITY;
                    if (fab2 == fab3) {
                        if (message.what == 101) {
                            ((HashMap) mainLooperOptService.LJLIL).put(fab3, Boolean.TRUE);
                            this.LIZJ.LJIILIIL();
                            return super.sendMessageAtTime(message, 0L);
                        }
                    } else {
                        FAB fab4 = FAB.WATCH_LAUNCH_ACTIVITY;
                        if (fab2 == fab4 && message.what == 100) {
                            ((HashMap) mainLooperOptService.LJLIL).put(fab4, Boolean.TRUE);
                            this.LIZJ.LJIILIIL();
                            return super.sendMessageAtTime(message, 0L);
                        }
                    }
                }
                return super.sendMessageAtTime(message, j);
            }
        }
        return super.sendMessageAtTime(message, j);
    }
}
