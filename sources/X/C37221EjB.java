package X;

import android.os.Handler;

/* renamed from: X.EjB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37221EjB extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final C37221EjB LJLIL = new C37221EjB();

    public C37221EjB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        return new Handler(C06M.LIZ("RepeatRequestQuicklyMob").getLooper());
    }
}
