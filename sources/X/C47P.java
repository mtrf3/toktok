package X;

import android.view.ViewConfiguration;

/* renamed from: X.47P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47P extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C47P LJLIL = new C47P();

    public C47P() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(ViewConfiguration.get(EF7.LIZIZ()).getScaledTouchSlop() / 5);
    }
}
