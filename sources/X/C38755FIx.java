package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.List;
import yq4.a;

/* renamed from: X.FIx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38755FIx implements FJ0 {
    @Override // X.FJ0
    public final void LIZ() {
        List<String> list;
        if (DeviceRegisterManager.isChildMode()) {
            list = a.LJI().LJFF();
        } else {
            list = null;
        }
        AppLog.setEventFilterByClient(list, false);
        try {
            AppLog.setUseGoogleAdId(true);
        } catch (IllegalStateException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initApplog startLaunch:");
            LIZ.append(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ);
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            C36922EeM.LIZ(e);
        }
        if (!((Boolean) C34276Dcm.LIZLLL.getValue()).booleanValue()) {
            AppLog.registerLogRequestCallback(new C38756FIy());
        }
        if (((Boolean) FLX.LJ.getValue()).booleanValue()) {
            AppLog.setStartLogReaperDelay(5000L);
        }
    }
}
