package X;

import com.bytedance.apm6.cpu.ApmCpuManager;

/* renamed from: X.LUd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54335LUd implements LUY {
    public String LIZ;
    public String LIZIZ;
    public final C54336LUe LIZJ = new C54336LUe();

    @Override // X.LUY
    public final void LIZIZ(String str, String str2) {
        if (str == null || str2 == null || str.equals(this.LIZIZ)) {
            return;
        }
        this.LIZIZ = str;
        if (this.LIZ != null) {
            ApmCpuManager.getInstance().stopScene(this.LIZ);
            this.LIZ = null;
        }
        String str3 = this.LIZJ.get(str);
        if (str3 != null) {
            ApmCpuManager.getInstance().startScene(str3);
            this.LIZ = str3;
        }
    }
}
