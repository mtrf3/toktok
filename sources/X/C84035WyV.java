package X;

import com.ss.android.vesdk.VEFileUtils;

/* renamed from: X.WyV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84035WyV implements InterfaceC84052Wym {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC84051Wyl LJ;

    @Override // X.InterfaceC84052Wym
    public final void LIZ(int i) {
        if (!VEFileUtils.exists(this.LIZ) && VEFileUtils.exists(this.LIZIZ)) {
            VEFileUtils.renameFile(this.LIZIZ, this.LIZ);
            if (!VEFileUtils.exists(this.LIZJ) && VEFileUtils.exists(this.LIZLLL)) {
                VEFileUtils.renameFile(this.LIZLLL, this.LIZJ);
            }
            C63922P6w.LIZLLL("VERecorder", "Concat failed. Restore concat file.");
        }
        InterfaceC84051Wyl interfaceC84051Wyl = this.LJ;
        if (interfaceC84051Wyl != null) {
            interfaceC84051Wyl.LIZIZ(i, this.LIZ, this.LIZJ);
        }
    }

    public C84035WyV(String str, String str2, String str3, String str4, InterfaceC84051Wyl interfaceC84051Wyl) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = interfaceC84051Wyl;
    }
}
