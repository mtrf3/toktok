package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I0W implements InterfaceC45959I1z {
    public final /* synthetic */ InterfaceC83624Wrs LIZ;
    public final /* synthetic */ I0Z LIZIZ;

    @Override // X.InterfaceC45959I1z
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aec model download fail:");
        LIZ.append(android.util.Log.getStackTraceString(exception));
        H78.LIZJ(X1D.LIZIZ(LIZ));
        I0Z i0z = this.LIZIZ;
        if (i0z != null) {
            i0z.LIZIZ(false, null, -1, exception);
        }
    }

    @Override // X.InterfaceC45959I1z
    public final void onSuccess(String str) {
        H78.LIZ("aec model download success");
        boolean z = false;
        if (C39579Fg7.LIZIZ(str)) {
            boolean c = this.LIZ.c(str);
            I0Z i0z = this.LIZIZ;
            if (i0z != null) {
                i0z.LIZIZ(true, str, 0, null);
            }
            z = c;
        } else {
            I0Z i0z2 = this.LIZIZ;
            if (i0z2 != null) {
                i0z2.LIZIZ(false, str, -1, null);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aec model download success status:");
        LIZ.append(z);
        H78.LIZ(X1D.LIZIZ(LIZ));
        I0Z i0z3 = this.LIZIZ;
        if (i0z3 != null) {
            i0z3.LIZ(z);
        }
    }

    public I0W(InterfaceC83624Wrs interfaceC83624Wrs, C43964HNg c43964HNg) {
        this.LIZ = interfaceC83624Wrs;
        this.LIZIZ = c43964HNg;
    }
}
