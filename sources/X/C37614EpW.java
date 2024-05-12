package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.EpW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37614EpW extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final C37614EpW LJLIL = new C37614EpW();

    public C37614EpW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        return new Handler(((HandlerThread) C37613EpV.LIZ.getValue()).getLooper());
    }
}
