package X;

import android.os.SystemClock;
import java.io.File;

/* renamed from: X.Gcs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41926Gcs extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C41926Gcs LJLIL = new C41926Gcs();

    public C41926Gcs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C78966Uyw.LJIJJLI((String) C43014GuQ.LIZJ.getValue()));
        LIZ.append(SystemClock.elapsedRealtime());
        File file = new File(X1D.LIZIZ(LIZ));
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }
}
