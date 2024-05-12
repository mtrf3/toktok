package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I0X implements InterfaceC45959I1z {
    public final /* synthetic */ I0Z LIZ;

    public I0X(C43965HNh c43965HNh) {
        this.LIZ = c43965HNh;
    }

    @Override // X.InterfaceC45959I1z
    public final void LIZ(Exception exception) {
        o.LJIIIZ(exception, "exception");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NormalAudioAecHelper aec model download fail:");
        LIZ.append(android.util.Log.getStackTraceString(exception));
        H78.LIZJ(X1D.LIZIZ(LIZ));
        I0Z i0z = this.LIZ;
        if (i0z != null) {
            i0z.LIZIZ(false, null, -1, exception);
        }
    }

    @Override // X.InterfaceC45959I1z
    public final void onSuccess(String str) {
        if (C39579Fg7.LIZIZ(str)) {
            I0Z i0z = this.LIZ;
            if (i0z != null) {
                i0z.LIZIZ(true, str, 0, null);
            }
            H78.LIZ("aec model download success ");
            return;
        }
        I0Z i0z2 = this.LIZ;
        if (i0z2 != null) {
            i0z2.LIZIZ(false, str, -1, null);
        }
        H78.LIZ("aec model download fail , file not exit");
    }
}
