package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EtZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37865EtZ implements EX0 {
    public final /* synthetic */ C38150EyA LIZ;
    public final /* synthetic */ C38048EwW LIZIZ;

    @Override // X.EX0
    public final void LIZ(java.util.Map<String, ? extends Object> data) {
        o.LJIIIZ(data, "data");
        C38150EyA c38150EyA = this.LIZ;
        String str = this.LIZIZ.LIZIZ;
        JSONObject jSONObject = new JSONObject(data);
        C38049EwX c38049EwX = c38150EyA.LJ;
        if (c38049EwX != null) {
            c38049EwX.LIZLLL(str, jSONObject);
        }
    }

    public C37865EtZ(C38150EyA c38150EyA, C38048EwW c38048EwW) {
        this.LIZ = c38150EyA;
        this.LIZIZ = c38048EwW;
    }
}
