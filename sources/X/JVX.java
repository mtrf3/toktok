package X;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JVX<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ JVZ LIZ;
    public final /* synthetic */ long LIZIZ;

    public JVX(JVZ jvz, long j) {
        this.LIZ = jvz;
        this.LIZIZ = j;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        if (JVW.LIZ != null) {
            JVZ jvz = this.LIZ;
            if (jvz.LIZIZ != 0 && jvz.LJIIIIZZ.isEmpty()) {
                JVZ jvz2 = this.LIZ;
                jvz2.LJI = this.LIZIZ - jvz2.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_lynx", this.LIZ.LJII);
                jSONObject.put("bind_cost", this.LIZ.LIZJ);
                jSONObject.put("cost", this.LIZ.LJI);
                FMX.LJIILLIIL("search_user_card_monitor", jSONObject);
                JVW.LIZ = null;
            }
        }
        return C76800UCe.LIZ;
    }
}
