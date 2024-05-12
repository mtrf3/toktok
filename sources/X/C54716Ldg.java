package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Ldg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54716Ldg extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C54716Ldg LJLIL = new C54716Ldg();

    public C54716Ldg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (C54714Lde.LIZIZ()) {
            int LIZ = C54714Lde.LIZ();
            if (LIZ != 1) {
                if (LIZ != 2) {
                    i = R.layout.b_w;
                } else {
                    i = R.layout.b_x;
                }
            } else {
                i = R.layout.b_y;
            }
        } else {
            i = R.layout.b_t;
        }
        return Integer.valueOf(i);
    }
}
