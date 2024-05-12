package X;

import android.os.Handler;

/* renamed from: X.ERg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36424ERg extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final C36424ERg LJLIL = new C36424ERg();

    public C36424ERg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        return new Handler(C06M.LIZ("pschedulerHandler").getLooper());
    }
}
