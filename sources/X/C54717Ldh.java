package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Ldh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54717Ldh extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C54717Ldh LJLIL = new C54717Ldh();

    public C54717Ldh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (C54714Lde.LIZIZ()) {
            int LIZ = C54714Lde.LIZ();
            if (LIZ != 1) {
                if (LIZ != 2) {
                    i = R.layout.ba2;
                } else {
                    i = R.layout.ba3;
                }
            } else {
                i = R.layout.ba4;
            }
        } else {
            i = R.layout.b_z;
        }
        return Integer.valueOf(i);
    }
}
