package X;

import org.json.JSONObject;

/* renamed from: X.Exj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38123Exj<P, R> extends AbstractC38082Ex4<P, R> {
    public C38131Exr callContext;
    public InterfaceC38137Exx callback;
    public boolean isValid = true;

    public final void finishWithFailure() {
        finishWithFailure(null);
    }

    public final void finishWithSuccess() {
        finishWithResult(null);
    }

    public abstract void invoke(P p, C38131Exr c38131Exr);

    public void onDestroy() {
        this.isValid = false;
        this.callContext = null;
    }

    public abstract void onTerminate();

    private boolean checkInvalid() {
        if (!this.isValid) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Jsb async call already finished: ");
            LIZ.append(getName());
            LIZ.append(", hashcode: ");
            LIZ.append(hashCode());
            IllegalStateException illegalStateException = new IllegalStateException(X1D.LIZIZ(LIZ));
            if (!C1A7.LJLIL) {
                return false;
            }
            throw illegalStateException;
        }
        return true;
    }

    @Override // X.AbstractC38082Ex4
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public void terminateActual() {
        onTerminate();
        onDestroy();
    }

    public final void finishWithFailure(Throwable th) {
        if (checkInvalid()) {
            this.callback.onFailed(th);
            onDestroy();
        }
    }

    public final void finishWithRawResult(JSONObject jSONObject) {
        if (checkInvalid()) {
            this.callback.LIZIZ(jSONObject);
            onDestroy();
        }
    }

    public final void finishWithResult(R r) {
        if (checkInvalid()) {
            this.callback.LIZ(r);
            onDestroy();
        }
    }

    public void invokeActual(P p, C38131Exr c38131Exr, InterfaceC38137Exx interfaceC38137Exx) {
        this.callContext = c38131Exr;
        this.callback = interfaceC38137Exx;
        invoke(p, c38131Exr);
    }
}
