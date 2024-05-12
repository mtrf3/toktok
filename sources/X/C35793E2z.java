package X;

import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import org.json.JSONObject;

/* renamed from: X.E2z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35793E2z implements F67 {
    public static final C35793E2z LJLIL = new C35793E2z();

    @Override // X.F67
    public final void onChanged() {
        JSONObject jSONObject;
        PitayaExperiment.LIZ.getClass();
        PitayaExperiment.LIZIZ = PitayaExperiment.LIZ();
        try {
            jSONObject = new JSONObject(String.valueOf(PitayaExperiment.LIZIZ.content));
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        PitayaExperiment.LIZJ = jSONObject;
        try {
            new JSONObject(String.valueOf(PitayaExperiment.LIZIZ.magi));
        } catch (Exception unused2) {
            new JSONObject();
        }
    }
}
