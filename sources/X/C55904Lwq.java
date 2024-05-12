package X;

import android.os.Build;

/* renamed from: X.Lwq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55904Lwq extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C55904Lwq LJLIL = new C55904Lwq();

    public C55904Lwq() {
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
