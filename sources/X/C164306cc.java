package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: X.6cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164306cc implements InterfaceC65644PpY<ProviderEffect, Effect> {
    @Override // X.InterfaceC65644PpY
    public final /* bridge */ /* synthetic */ Effect apply(ProviderEffect providerEffect) {
        ProviderEffect providerEffect2 = providerEffect;
        Effect effect = new Effect();
        effect.setEffectId(providerEffect2.getId());
        effect.setName(providerEffect2.getTitle());
        effect.setUnzipPath(providerEffect2.getPath());
        effect.setEffectType(10);
        return effect;
    }
}
