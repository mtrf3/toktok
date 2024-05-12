package X;

/* renamed from: X.P6y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63924P6y implements InterfaceC87371YQt {
    @Override // X.InterfaceC87371YQt
    public final void LIZ(int i, int i2, String str) {
        if (i > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Focus done, cost: ");
            LIZ.append(i);
            LIZ.append("ms");
            C63922P6w.LIZ("TEFocusNullCallback", X1D.LIZIZ(LIZ));
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Focus failed, error code: ");
            LIZ2.append(i);
            LIZ2.append(", msg: ");
            LIZ2.append(str);
            C63922P6w.LIZLLL("TEFocusNullCallback", X1D.LIZIZ(LIZ2));
        }
        C63922P6w.LIZ("Debug", android.util.Log.getStackTraceString(new Throwable()));
    }
}
