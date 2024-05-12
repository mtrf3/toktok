package X;

import android.os.Bundle;

/* renamed from: X.IvC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48158IvC implements InterfaceC47895Iqx {
    public final /* synthetic */ C48157IvB LIZ;

    public C48158IvC(C48157IvB c48157IvB) {
        this.LIZ = c48157IvB;
    }

    @Override // X.InterfaceC47895Iqx
    public final void LIZJ(int i, int i2, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("pts", i2);
        bundle.putString("info", str);
        this.LIZ.LIZJ(1002, 0, 0, bundle);
    }
}
