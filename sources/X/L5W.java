package X;

import Y.ARunnableS8S1200000_9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class L5W implements SIR {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.SIR
    public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
    }

    @Override // X.SIR
    public final void LIZ(JSONObject jSONObject) {
        ARunnableS8S1200000_9 aRunnableS8S1200000_9 = new ARunnableS8S1200000_9(this.LIZ, this.LIZIZ, jSONObject, 6);
        if (((Boolean) C52448KiC.LIZ.getValue()).booleanValue()) {
            FMX.LIZIZ().execute(aRunnableS8S1200000_9);
        } else {
            aRunnableS8S1200000_9.run();
        }
    }

    public L5W(Aweme aweme, String str) {
        this.LIZ = aweme;
        this.LIZIZ = str;
    }
}
