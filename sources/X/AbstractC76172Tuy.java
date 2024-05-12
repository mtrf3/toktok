package X;

import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkMicAlogUploadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkMicExceptionUploadSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Tuy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76172Tuy implements InterfaceC64412ft {
    public abstract int LIZJ();

    public abstract int LIZLLL();

    public abstract void LJI(int i, String str, Throwable th, java.util.Map map);

    public boolean LJFF(int i) {
        int LIZJ = LIZJ();
        if (i <= LIZLLL() && LIZJ <= i) {
            return true;
        }
        return false;
    }

    public static String LJ(int i, String msg, Throwable throwable) {
        String LIZIZ;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(throwable, "throwable");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[ExceptionType-");
        LIZ.append(i);
        LIZ.append("]: ");
        if (throwable instanceof CH1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("code: ");
            CH1 ch1 = (CH1) throwable;
            LIZ2.append(ch1.getErrorCode());
            LIZ2.append(" logId: ");
            LIZ2.append(ch1.getxTtLogId());
            LIZ2.append(" msg: ");
            LIZ2.append(ch1.getErrorMsg());
            LIZIZ = X1D.LIZIZ(LIZ2);
        } else if (throwable instanceof C0TL) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("code: ");
            C0TL c0tl = (C0TL) throwable;
            LIZ3.append(c0tl.statusCode);
            LIZ3.append(" msg: ");
            LIZ3.append(c0tl.getLocalizedMessage());
            LIZIZ = X1D.LIZIZ(LIZ3);
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("msg: ");
            LIZ4.append(throwable.getLocalizedMessage());
            LIZIZ = X1D.LIZIZ(LIZ4);
        }
        return C0MT.LIZ(LIZ, LIZIZ, ' ', msg, LIZ);
    }

    @Override // X.InterfaceC64412ft
    public void LIZ(int i, String msg, java.util.Map<String, String> map) {
        o.LJIIIZ(msg, "msg");
        LJII(i, msg, null, map);
    }

    @Override // X.InterfaceC64412ft
    public void LIZIZ(int i, String msg, Throwable t, java.util.Map<String, String> map) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(t, "t");
        LJII(i, msg, t, map);
    }

    public final void LJII(int i, String str, Throwable th, java.util.Map<String, String> map) {
        java.util.Map map2;
        if (th == null) {
            th = new Throwable(str);
        }
        if (LiveLinkMicExceptionUploadSetting.INSTANCE.canUpload(i)) {
            if (map != null) {
                map2 = C65618Pp8.of("linkmic_extra", map.toString());
            } else {
                map2 = null;
            }
            LJI(i, str, th, map2);
        }
        boolean canUpload = LiveLinkMicAlogUploadSetting.INSTANCE.canUpload(i);
        if (C29306Beo.LJIILLIIL(Boolean.valueOf(canUpload))) {
            return;
        }
        boolean LIZ = ((C31040CGe) C58461Mwz.LIZ.getValue()).LIZ();
        if (!canUpload) {
            return;
        }
        if (LIZ) {
            Throwable th2 = new Throwable();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("hitSample but out of freq of ALog ");
            LIZ2.append(i);
            LIZ2.append('.');
            C0K2.LIZ(X1D.LIZIZ(LIZ2), th2);
            return;
        }
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHostMonitorAndLog.class);
        o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
        ((IHostMonitorAndLog) LIZ3).j20();
        ((C31040CGe) C58461Mwz.LIZ.getValue()).LIZJ.add(Long.valueOf(System.currentTimeMillis()));
    }
}
