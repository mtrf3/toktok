package X;

import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.lang.reflect.Field;

/* renamed from: X.Fj4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39762Fj4 {
    public static Field LJFF;
    public static Field LJI;
    public static Field LJII;
    public static Field LJIIIIZZ;
    public static Field LJIIIZ;
    public static Field LJIIJ;
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ = C16880lQ.LLLLIIIILLL().getName();

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ServiceFollowBean{mServiceName='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", mWhat=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mTimeStamp=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mToken='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", mThreadName='");
        return C77800Ug8.LIZJ(LIZ, this.LJ, '\'', '}', LIZ);
    }

    public static C39762Fj4 LIZ(Message message) {
        String str;
        try {
            switch (message.what) {
                case 114:
                    if (LJFF == null) {
                        LJFF = C36508EUm.LIZ(message.obj.getClass(), "info");
                    }
                    if (LJI == null) {
                        LJI = C36508EUm.LIZ(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) LJFF.get(message.obj);
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    } else {
                        str = null;
                    }
                    return new C39762Fj4(message.what, str, LJI.get(message.obj).toString(), System.currentTimeMillis());
                case 115:
                    if (LJII == null) {
                        LJII = C36508EUm.LIZ(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) LJII.get(message.obj);
                    if (iBinder != null) {
                        String LIZ = C39763Fj5.LJLILLLLZI.LIZ(iBinder);
                        return new C39762Fj4(message.what, LIZ, iBinder.toString(), System.currentTimeMillis());
                    }
                    break;
                case 116:
                    String LIZ2 = C39763Fj5.LJLILLLLZI.LIZ((IBinder) message.obj);
                    return new C39762Fj4(message.what, LIZ2, message.obj.toString(), System.currentTimeMillis());
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
                    if (LJIIIIZZ == null) {
                        LJIIIIZZ = C36508EUm.LIZ(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) LJIIIIZZ.get(message.obj);
                    if (iBinder2 != null) {
                        String LIZ4 = C39763Fj5.LJLILLLLZI.LIZ(iBinder2);
                        return new C39762Fj4(message.what, LIZ4, iBinder2.toString(), System.currentTimeMillis());
                    }
                    break;
                case 122:
                    if (LJIIIZ == null) {
                        LJIIIZ = C36508EUm.LIZ(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) LJIIIZ.get(message.obj);
                    if (iBinder3 != null) {
                        String LIZ5 = C39763Fj5.LJLILLLLZI.LIZ(iBinder3);
                        return new C39762Fj4(message.what, LIZ5, iBinder3.toString(), System.currentTimeMillis());
                    }
                    break;
                case 123:
                    if (LJIIJ == null) {
                        LJIIJ = C36508EUm.LIZ(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) LJIIJ.get(message.obj);
                    if (iBinder4 != null) {
                        String LIZ6 = C39763Fj5.LJLILLLLZI.LIZ(iBinder4);
                        return new C39762Fj4(message.what, LIZ6, iBinder4.toString(), System.currentTimeMillis());
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new C39762Fj4(message.what, "unknow", "unknow", System.currentTimeMillis());
    }

    public C39762Fj4(int i, String str, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str2;
    }
}
