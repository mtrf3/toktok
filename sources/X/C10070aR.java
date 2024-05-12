package X;

import defpackage.i0;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.0aR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10070aR {
    public InterfaceC10050aP LIZ;
    public final HashSet<String> LIZIZ = new HashSet<>();

    public final void LIZ(Throwable th) {
        JSONObject jSONObject;
        try {
            InterfaceC10050aP interfaceC10050aP = this.LIZ;
            if (interfaceC10050aP != null) {
                ((PDS) interfaceC10050aP).LIZ("apm_error", th);
            }
        } catch (Throwable unused) {
        }
        if (!C09970aH.LJII() && ((jSONObject = C09970aH.LJFF) == null || jSONObject.optString("channel") == null || !C09970aH.LJFF.optString("channel").contains("local"))) {
        } else {
            throw new RuntimeException(th);
        }
    }

    public final void LIZIZ(Throwable th, String str) {
        if (this.LIZ != null && !this.LIZIZ.contains(str)) {
            this.LIZIZ.add(str);
            InterfaceC10050aP interfaceC10050aP = this.LIZ;
            String LJFF = i0.LJFF("apm_", str);
            interfaceC10050aP.getClass();
            PEH.LIZLLL(th, LJFF);
        }
    }
}
