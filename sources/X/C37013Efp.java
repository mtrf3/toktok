package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Efp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37013Efp extends C37011Efn {
    public final /* synthetic */ C37014Efq LJLIL;

    public C37013Efp(C37014Efq c37014Efq) {
        this.LJLIL = c37014Efq;
    }

    @Override // X.C37011Efn
    public final void LIZ(C36754Ebe c36754Ebe) {
        c36754Ebe.LIZIZ();
        JSONObject LIZIZ = c36754Ebe.LIZIZ();
        if (LIZIZ.has("status_code")) {
            LIZIZ.remove("status_code");
        }
        this.LJLIL.LJJI(c36754Ebe.LJFF);
        this.LJLIL.finishWithResult(LIZIZ);
    }

    @Override // X.C37011Efn, X.InterfaceC37007Efj
    public final void onFailed(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        this.LJLIL.LJJI(-1);
        this.LJLIL.finishWithFailure(throwable);
    }
}
