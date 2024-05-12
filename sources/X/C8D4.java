package X;

import android.content.Context;

/* renamed from: X.8D4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8D4 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C8D4 LJLIL = new C8D4();

    public C8D4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Context LIZIZ = EF7.LIZIZ();
        if (C8D3.LIZ == 0) {
            C8D3.LIZ = (int) C63081OpJ.LLILZ(LIZIZ, LIZIZ.getResources().getDisplayMetrics().heightPixels);
        }
        if (C8D3.LIZ <= 640) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
