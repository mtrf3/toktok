package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.ICj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C46229ICj extends TBS implements InterfaceC88472Yns<Effect, C76800UCe> {
    public static final C46229ICj LJLIL = new C46229ICj();

    public C46229ICj() {
        super(1, C46230ICk.class, "openUrl", "openUrl(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Effect effect) {
        Effect effect2 = effect;
        if (effect2 != null && effect2.getEffectType() == 2) {
            String schema = effect2.getSchema();
            C60903NvH.LJIIJJI().getApplicationService().getClass();
            C61200O0e.LIZLLL().LJII(schema);
        }
        return C76800UCe.LIZ;
    }
}
