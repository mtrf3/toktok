package X;

import com.bytedance.ies.abmock.debugtool.mock.ConfigMock;
import com.bytedance.keva.KevaImpl;
import com.ss.android.common.applog.AppLog;

/* loaded from: classes7.dex */
public class FGZ extends C43659HBn {
    public Boolean LJLJJL;

    @Override // X.InterfaceC38688FGi
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.C43659HBn, X.InterfaceC38688FGi
    public final void onEvent(String str) {
    }

    @Override // X.C43659HBn, X.InterfaceC38688FGi
    public final boolean LJ() {
        return ((Boolean) C34454Dfe.LIZIZ.getValue()).booleanValue();
    }

    @Override // X.C43659HBn, X.InterfaceC38688FGi
    public final boolean LJFF() {
        if (this.LJLJJL == null) {
            this.LJLJJL = Boolean.valueOf(KevaImpl.getRepoSync("settings_v3_config", 1).getBoolean("tt_use_libra_config_and", false));
        }
        return this.LJLJJL.booleanValue();
    }

    @Override // X.C43659HBn, X.InterfaceC38688FGi
    public final String getCurrentUid() {
        try {
            String curUserId = HG3.LJIILL().getCurUserId();
            return curUserId == null ? "" : curUserId;
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // X.InterfaceC38688FGi
    public final ConfigMock LIZLLL() {
        return ConfigMock.INSTANCE;
    }

    @Override // X.C43659HBn, X.InterfaceC38688FGi
    public final void LJI(String str) {
        if (!C67612l3.LIZIZ.get()) {
            str = C67652l7.LIZ(str);
        }
        AppLog.setAbSDKVersion(str);
    }
}
