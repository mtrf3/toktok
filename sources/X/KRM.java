package X;

import android.os.Handler;

/* loaded from: classes9.dex */
public final class KRM extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final KRM INSTANCE = new KRM();

    public KRM() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        return new Handler(C16880lQ.LLJJJJ());
    }
}
