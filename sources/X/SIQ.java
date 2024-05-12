package X;

import java.lang.ref.Reference;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class SIQ implements QGM {
    public final SIR LIZ;

    @Override // X.QGM
    public final /* bridge */ /* synthetic */ void LIZ() {
    }

    public SIQ(SIR sir) {
        this.LIZ = sir;
    }

    @Override // X.QGM
    public final void LJJLIIIJLLLLLLLZ(final JSONObject jSONObject, final String str, final boolean z) {
        if (str != null) {
            C2050382x.LIZ.execute(new Runnable() { // from class: X.SIP
                @Override // java.lang.Runnable
                public final void run() {
                    SIR sir;
                    String str2 = str;
                    boolean z2 = z;
                    JSONObject jSONObject2 = jSONObject;
                    Reference reference = (Reference) ((HashMap) IJZ.LIZ).get(str2);
                    if (reference != null && (sir = (SIR) reference.get()) != null) {
                        sir.LJJLIIIJLLLLLLLZ(jSONObject2, str2, z2);
                        if (str2 == null) {
                            return;
                        }
                        C2050382x.LIZ.execute(new RunnableC47136Iei(1, str2));
                    }
                }
            });
        }
        this.LIZ.LJJLIIIJLLLLLLLZ(jSONObject, str, z);
    }
}
