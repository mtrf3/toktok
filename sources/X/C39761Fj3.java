package X;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.lang.reflect.Field;

/* renamed from: X.Fj3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39761Fj3 {
    public static Field LJI;
    public static Field LJII;
    public static Field LJIIIIZZ;
    public static Field LJIIIZ;
    public static Field LJIIJ;
    public static Field LJIIJJI;
    public static Field LJIIL;
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ = C16880lQ.LLLLIIIILLL().getName();
    public final int LJFF;

    public final String toString() {
        String LIZIZ;
        int i = this.LJFF;
        if (i == 0) {
            LIZIZ = "Not_Followed";
        } else if (i == 9527) {
            LIZIZ = "System";
        } else if (i == 9528) {
            LIZIZ = "Schedule";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error:");
            LIZ.append(this.LJFF);
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ServiceFollowBean{mServiceName='");
        Q89.LIZIZ(LIZ2, this.LIZ, '\'', ", mWhat=");
        LIZ2.append(this.LIZIZ);
        LIZ2.append(", mTimeStamp=");
        LIZ2.append(this.LIZJ);
        LIZ2.append(", mToken='");
        Q89.LIZIZ(LIZ2, this.LIZLLL, '\'', ", mThreadName='");
        LIZ2.append(this.LJ);
        LIZ2.append('\'');
        LIZ2.append(", mHandleFlag=");
        LIZ2.append(LIZIZ);
        LIZ2.append('}');
        return X1D.LIZIZ(LIZ2);
    }

    public static C39761Fj3 LIZ(Message message) {
        String str;
        try {
            switch (message.what) {
                case 113:
                    Object obj = message.obj;
                    if (LJIIL == null) {
                        LJIIL = C78934UyQ.LJIIL(obj.getClass(), "intent");
                    }
                    Intent intent = (Intent) LJIIL.get(obj);
                    if (intent != null) {
                        intent.getComponent().getClassName();
                        C39749Fir.LIZ();
                        return new C39761Fj3(message.what, System.currentTimeMillis(), intent.getComponent().getClassName(), 0, "null");
                    }
                    break;
                case 114:
                    if (LJI == null) {
                        LJI = C78934UyQ.LJIIL(message.obj.getClass(), "info");
                    }
                    if (LJII == null) {
                        LJII = C78934UyQ.LJIIL(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) LJI.get(message.obj);
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    } else {
                        str = null;
                    }
                    return new C39761Fj3(message.what, System.currentTimeMillis(), str, message.arg2, LJII.get(message.obj).toString());
                case 115:
                    if (LJIIIIZZ == null) {
                        LJIIIIZZ = C78934UyQ.LJIIL(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) LJIIIIZZ.get(message.obj);
                    if (iBinder != null) {
                        String LIZ = C39760Fj2.LJLJI.LIZ(iBinder);
                        return new C39761Fj3(message.what, System.currentTimeMillis(), LIZ, message.arg2, iBinder.toString());
                    }
                    break;
                case 116:
                    String LIZ2 = C39760Fj2.LJLJI.LIZ((IBinder) message.obj);
                    return new C39761Fj3(message.what, System.currentTimeMillis(), LIZ2, message.arg2, message.obj.toString());
                case 117:
                case 118:
                case 119:
                case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                default:
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("message.what = ");
                    LIZ3.append(message.what);
                    LIZ3.append(" is not excepted!");
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
                case 121:
                    if (LJIIIZ == null) {
                        LJIIIZ = C78934UyQ.LJIIL(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) LJIIIZ.get(message.obj);
                    if (iBinder2 != null) {
                        String LIZ4 = C39760Fj2.LJLJI.LIZ(iBinder2);
                        return new C39761Fj3(message.what, System.currentTimeMillis(), LIZ4, message.arg2, iBinder2.toString());
                    }
                    break;
                case 122:
                    if (LJIIJ == null) {
                        LJIIJ = C78934UyQ.LJIIL(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) LJIIJ.get(message.obj);
                    if (iBinder3 != null) {
                        String LIZ5 = C39760Fj2.LJLJI.LIZ(iBinder3);
                        return new C39761Fj3(message.what, System.currentTimeMillis(), LIZ5, message.arg2, iBinder3.toString());
                    }
                    break;
                case 123:
                    if (LJIIJJI == null) {
                        LJIIJJI = C78934UyQ.LJIIL(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) LJIIJJI.get(message.obj);
                    if (iBinder4 != null) {
                        String LIZ6 = C39760Fj2.LJLJI.LIZ(iBinder4);
                        return new C39761Fj3(message.what, System.currentTimeMillis(), LIZ6, message.arg2, iBinder4.toString());
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new C39761Fj3(message.what, System.currentTimeMillis(), "unknow", message.arg2, "unknow");
    }

    public C39761Fj3(int i, long j, String str, int i2, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJFF = i2;
    }
}
