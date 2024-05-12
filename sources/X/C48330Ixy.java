package X;

import java.util.Random;

/* renamed from: X.Ixy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48330Ixy extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C48330Ixy LJLIL = new C48330Ixy();

    public C48330Ixy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (new Random().nextInt(100) >= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
