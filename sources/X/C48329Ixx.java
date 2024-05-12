package X;

import java.util.Random;

/* renamed from: X.Ixx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48329Ixx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C48329Ixx LJLIL = new C48329Ixx();

    public C48329Ixx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (new Random().nextInt(10) >= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
