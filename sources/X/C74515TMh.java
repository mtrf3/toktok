package X;

import Y.IDuS81S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TMh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74515TMh extends TMS<EffectCategoryResponse, C109444Rg> implements TMQ {
    public final InterfaceC74530TMw LJ;
    public final InterfaceC74533TMz LJFF;

    @Override // X.TMP
    public final EffectCategoryResponse LIZLLL(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        return (EffectCategoryResponse) this.LIZ.get(effectId);
    }

    @Override // X.TMP
    public final EffectCategoryResponse LJ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        return LIZLLL(effect.getEffectId());
    }

    @Override // X.TMP
    public final C73622Suw LJFF(Effect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        return AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(this, effect, 7)).LJJL(T16.LIZ()).LJJLI(new C73432Srs(new CallableC74516TMi(this, effect, z)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74515TMh(TN3 listMetaFetcher, TMW tmw, TMT tmt, C74517TMj c74517TMj, C74526TMs c74526TMs, C74520TMm c74520TMm) {
        super(listMetaFetcher, tmw, tmt, c74517TMj);
        o.LJIIIZ(listMetaFetcher, "listMetaFetcher");
        this.LJ = c74526TMs;
        this.LJFF = c74520TMm;
    }
}
