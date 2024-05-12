package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PPC<Q, R> {
    public Q LIZ;
    public R LIZIZ;
    public final WebView LIZJ;
    public final JSONObject LIZLLL;
    public final RuntimeException LJ;
    public PPD LJFF;

    public PPC() {
        this(null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PPC)) {
            return false;
        }
        PPC ppc = (PPC) obj;
        return o.LJ(this.LIZ, ppc.LIZ) && o.LJ(this.LIZIZ, ppc.LIZIZ) && o.LJ(this.LIZJ, ppc.LIZJ) && o.LJ(this.LIZLLL, ppc.LIZLLL) && o.LJ(this.LJ, ppc.LJ) && this.LJFF == ppc.LJFF;
    }

    public final int hashCode() {
        Q q = this.LIZ;
        int hashCode = (q == null ? 0 : q.hashCode()) * 31;
        R r = this.LIZIZ;
        int hashCode2 = (hashCode + (r == null ? 0 : r.hashCode())) * 31;
        WebView webView = this.LIZJ;
        int hashCode3 = (hashCode2 + (webView == null ? 0 : webView.hashCode())) * 31;
        JSONObject jSONObject = this.LIZLLL;
        int hashCode4 = (hashCode3 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        RuntimeException runtimeException = this.LJ;
        return this.LJFF.hashCode() + ((hashCode4 + (runtimeException != null ? runtimeException.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InterceptContext(request=");
        LIZ.append(this.LIZ);
        LIZ.append(", response=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", webView=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extra=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", exception=");
        LIZ.append(this.LJ);
        LIZ.append(", action=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(PPD ppd) {
        o.LJIIIZ(ppd, "<set-?>");
        this.LJFF = ppd;
    }

    public /* synthetic */ PPC(Object obj, int i) {
        this((i & 1) != 0 ? null : obj, null, null, null, null, (i & 32) != 0 ? PPD.CONTINUE : null);
    }

    public PPC(Q q, R r, WebView webView, JSONObject jSONObject, RuntimeException runtimeException, PPD action) {
        o.LJIIIZ(action, "action");
        this.LIZ = q;
        this.LIZIZ = r;
        this.LIZJ = webView;
        this.LIZLLL = jSONObject;
        this.LJ = runtimeException;
        this.LJFF = action;
    }
}
