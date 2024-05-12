package X;

import android.os.Build;

/* renamed from: X.MAu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56380MAu extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C56380MAu LJLIL = new C56380MAu();

    public C56380MAu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        return Integer.valueOf(i);
    }
}
