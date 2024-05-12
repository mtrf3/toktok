package X;

import android.view.View;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O8X implements InterfaceC61405O8b {
    public static final O8X LIZ = new O8X();

    @Override // X.InterfaceC61405O8b
    public final void LIZ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        C61408O8e.LIZ().LIZJ(new C38531fF(j, list, "show", z, j2, str, jSONObject));
    }

    @Override // X.InterfaceC61405O8b
    public final void LIZIZ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        C61408O8e.LIZ().LIZJ(new C38531fF(j, list, "click", z, j2, str, jSONObject));
    }

    @Override // X.InterfaceC61405O8b
    public final void LIZJ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        C61408O8e.LIZ().LIZJ(new C38531fF(j, list, "play_over", z, j2, str, jSONObject));
    }

    @Override // X.InterfaceC61405O8b
    public final void LIZLLL(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        C61408O8e.LIZ().LIZJ(new C38531fF(j, list, "play", z, j2, str, jSONObject));
    }
}
