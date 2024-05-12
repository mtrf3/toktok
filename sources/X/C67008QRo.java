package X;

import android.content.Context;

/* renamed from: X.QRo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67008QRo extends C78880UxY {
    public final Context LJLJI;

    public C67008QRo(Context context) {
        this.LJLJI = context;
    }

    @Override // X.C78880UxY
    public final boolean LJJLI(InterfaceC67012QRs interfaceC67012QRs, int i) {
        Context context;
        Context context2;
        if (interfaceC67012QRs == null || (context = this.LJLJI) == null || C38354F3m.LJ("com.android.vending")) {
            return false;
        }
        try {
            if (C16880lQ.LLLLLLZ(context.getPackageManager(), "com.android.vending", 0) == null || (context2 = this.LJLJI) == null || C38354F3m.LJ("com.google.android.gms")) {
                return false;
            }
            if (C16880lQ.LLLLLLZ(context2.getPackageManager(), "com.google.android.gms", 0) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
