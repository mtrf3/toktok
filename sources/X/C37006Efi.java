package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Efi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37006Efi extends AbstractC38123Exj<JSONObject, JSONObject> implements InterfaceC37007Efj {
    public final C37005Efh LJLIL;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        C37005Efh c37005Efh = this.LJLIL;
        C36760Ebk c36760Ebk = c37005Efh.LIZ;
        if (c36760Ebk != null) {
            c36760Ebk.LIZ.remove(c37005Efh);
        }
    }

    public C37006Efi(C36991EfT prefetchProcessor) {
        o.LJIIJ(prefetchProcessor, "prefetchProcessor");
        this.LJLIL = new C37005Efh(prefetchProcessor, this);
    }

    @Override // X.InterfaceC37007Efj
    public final void LJ(JSONObject jSONObject) {
        finishWithResult(jSONObject);
    }

    @Override // X.InterfaceC37007Efj
    public final void onFailed(Throwable throwable) {
        o.LJIIJ(throwable, "throwable");
        finishWithFailure(throwable);
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIJ(params, "params");
        o.LJIIJ(context, "context");
        this.LJLIL.LIZIZ(params);
    }
}
