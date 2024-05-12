package X;

import java.util.Random;

/* renamed from: X.Iy0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48332Iy0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C48332Iy0 LJLIL = new C48332Iy0();

    public C48332Iy0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (new Random().nextInt(2) >= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
