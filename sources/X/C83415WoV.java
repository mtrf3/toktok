package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.WoV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83415WoV extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final C83415WoV LJLIL = new C83415WoV();

    public C83415WoV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        return new Handler((Looper) C83412WoS.LJLILLLLZI.getValue(), C83412WoS.LJLIL);
    }
}
