package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cjc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32152Cjc implements InterfaceC22840v2 {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<JSONObject, String, C76800UCe> LJLILLLLZI;

    @Override // X.InterfaceC22840v2
    public final void LJIILIIL(C22830v1 outputData) {
        Object LIZ;
        JSONObject jSONObject;
        String str;
        o.LJIIIZ(outputData, "outputData");
        if (!outputData.LIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("run frequency control task error :: ");
            LIZ2.append(outputData.LIZJ);
            C0NB.LJIIL("LiveGiftGuidePredictManager", X1D.LIZIZ(LIZ2));
            this.LJLIL.invoke();
            return;
        }
        JSONObject jSONObject2 = outputData.LIZIZ;
        if (jSONObject2 != null && jSONObject2.optInt("result") > 0) {
            InterfaceC88471Ynr<JSONObject, String, C76800UCe> interfaceC88471Ynr = this.LJLILLLLZI;
            try {
                JSONObject jSONObject3 = outputData.LIZIZ;
                if (jSONObject3 == null || (jSONObject = jSONObject3.optJSONObject("features")) == null) {
                    jSONObject = new JSONObject();
                }
                JSONObject jSONObject4 = outputData.LIZIZ;
                if (jSONObject4 == null || (str = jSONObject4.optString("trigger_type")) == null) {
                    str = "";
                }
                interfaceC88471Ynr.invoke(jSONObject, str);
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
            if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32152Cjc(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super JSONObject, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = interfaceC88471Ynr;
    }
}
