package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes7.dex */
public final class ESZ extends AbstractC65781Prl implements InterfaceC65784Pro<Effect> {
    public static final ESZ LJLIL = new ESZ();

    public ESZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Effect invoke() {
        Effect effect = new Effect(null, 1, null);
        effect.setId("id_fake_header");
        effect.setUnzipPath("");
        return effect;
    }
}
