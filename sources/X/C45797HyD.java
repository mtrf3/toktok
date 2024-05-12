package X;

/* renamed from: X.HyD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45797HyD implements InterfaceC44698HgU {
    @Override // X.InterfaceC44698HgU
    public final void LIZ() {
    }

    @Override // X.InterfaceC44698HgU
    public final void LIZIZ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FileAdapterAndroidR code:");
        LIZ.append(i);
        LIZ.append(", msg:");
        LIZ.append(str);
        H78.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("FileAdapterAndroidR code:");
        LIZ2.append(i);
        LIZ2.append(", msg:");
        LIZ2.append(str);
        LIZ2.append(", trace:");
        LIZ2.append(android.util.Log.getStackTraceString(new Throwable()));
        C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
    }
}
