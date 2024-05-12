package X;

/* loaded from: classes7.dex */
public final class EJR implements EJS {
    public static final EJR LJLIL = new EJR();

    @Override // X.EJS
    public final void LIZ(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeModelLog : ");
        LIZ.append(android.util.Log.getStackTraceString(exc));
        H78.LIZJ(X1D.LIZIZ(LIZ));
    }
}
