package X;

/* renamed from: X.Bqf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30041Bqf extends AbstractC30040Bqe {
    public String LIZIZ;
    public final /* synthetic */ C30036Bqa LIZJ;

    @Override // X.AbstractC30040Bqe
    public final String LIZ() {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = String.valueOf(C16880lQ.LLLLLLZ(this.LIZJ.LIZ.getPackageManager(), this.LIZJ.LIZ.getPackageName(), 0).versionName);
            }
            return this.LIZIZ;
        } catch (Exception unused) {
            return "";
        }
    }

    public C30041Bqf(C30036Bqa c30036Bqa) {
        this.LIZJ = c30036Bqa;
        this.LIZ = "webcast_client_version";
    }
}
