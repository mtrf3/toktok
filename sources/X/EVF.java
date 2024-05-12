package X;

import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.utils.JacocoUtils;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EVF extends RunnableC39007FSp {
    public final /* synthetic */ boolean LJLJJL;

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-185680162635025635"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final void LIZJ() {
        Method method;
        Method method2;
        try {
            if (this.LJLJJL) {
                Method method3 = JacocoUtils.getDeviceIDMethod;
                if (method3 != null && TextUtils.isEmpty((String) LIZLLL(JacocoUtils.coverageMonitor, method3, new Object[0])) && (method2 = JacocoUtils.setDeviceIDMethod) != null) {
                    LIZLLL(JacocoUtils.coverageMonitor, method2, new Object[]{AppLog.getServerDeviceId()});
                }
                Method method4 = JacocoUtils.dataWriteNowMethod;
                if (method4 != null) {
                    LIZLLL(JacocoUtils.coverageMonitor, method4, new Object[0]);
                }
                Method method5 = JacocoUtils.dataUploadMethod;
                if (method5 != null) {
                    LIZLLL(JacocoUtils.coverageMonitor, method5, new Object[0]);
                    return;
                }
                return;
            }
            while (true) {
                Method method6 = JacocoUtils.getDeviceIDMethod;
                if (method6 != null && TextUtils.isEmpty((String) LIZLLL(JacocoUtils.coverageMonitor, method6, new Object[0])) && (method = JacocoUtils.setDeviceIDMethod) != null) {
                    LIZLLL(JacocoUtils.coverageMonitor, method, new Object[]{AppLog.getServerDeviceId()});
                }
                Method method7 = JacocoUtils.dataWriteNowMethod;
                if (method7 != null) {
                    LIZLLL(JacocoUtils.coverageMonitor, method7, new Object[0]);
                }
                Method method8 = JacocoUtils.dataUploadMethod;
                if (method8 != null) {
                    LIZLLL(JacocoUtils.coverageMonitor, method8, new Object[0]);
                }
                Method method9 = JacocoUtils.getInstrumentStatusMethod;
                if (method9 != null && !((Boolean) LIZLLL(JacocoUtils.coverageMonitor, method9, new Object[0])).booleanValue()) {
                    return;
                }
                try {
                    Thread.sleep(JacocoUtils.TimeInterval * 1000);
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVF(boolean z) {
        super((Object) null);
        this.LJLJJL = z;
    }
}
