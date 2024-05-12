package X;

import android.os.Process;

/* renamed from: X.CFs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31028CFs extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C31028CFs LJLIL = new C31028CFs();

    public C31028CFs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Process.myPid());
    }
}
