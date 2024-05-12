package X;

import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes15.dex */
public final class VMZ {
    public int LIZLLL;
    public long LJ;
    public BidInfo LIZ = new BidInfo();
    public C40068Fo0 LIZIZ = new C40068Fo0();
    public long LIZJ = 0;
    public java.util.Map<String, Integer> LJFF = new HashMap();
    public java.util.Set<String> LJI = new HashSet();
    public C75312xT LJII = new C75312xT();

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HybridSettingResponse{bidInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", switchConfig=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", updateTime='");
        C62850Ola.LJIIIIZZ(LIZ, this.LIZJ, '\'', ", duration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", settingId=");
        C62850Ola.LJIIIIZZ(LIZ, this.LJ, '\'', ", allEventSample=");
        LIZ.append(this.LJFF);
        LIZ.append(", hostWhiteSet=");
        LIZ.append(this.LJI);
        LIZ.append(", checkFilter=");
        LIZ.append(this.LJII);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
