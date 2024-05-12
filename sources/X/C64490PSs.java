package X;

import android.content.pm.PackageInfo;

/* renamed from: X.PSs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64490PSs extends JFP<PackageInfo> {
    public final /* synthetic */ QIZ LIZJ;

    public C64490PSs(QIZ qiz) {
        this.LIZJ = qiz;
    }

    @Override // X.JFP
    public final PackageInfo LIZ(Object[] objArr) {
        try {
            return C16880lQ.LLLLLLZ(this.LIZJ.LJFF.getPackageManager(), this.LIZJ.LJFF.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }
}
