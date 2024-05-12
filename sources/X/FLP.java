package X;

import android.content.pm.PackageInfo;

/* loaded from: classes7.dex */
public final class FLP extends AbstractC65781Prl implements InterfaceC65784Pro<PackageInfo> {
    public static final FLP INSTANCE = new FLP();

    public FLP() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final PackageInfo invoke() {
        return C16880lQ.LLLLLLZ(EF7.LIZIZ().getPackageManager(), EF7.LIZIZ().getPackageName(), 0);
    }
}
