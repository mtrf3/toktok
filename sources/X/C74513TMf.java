package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.TMf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74513TMf extends TP5 implements TMR<Effect, CategoryEffectModel> {
    public final int LJII;

    @Override // X.TMR
    public final C73634Sv8 LIZIZ() {
        return LJIIIZ(this.LJII);
    }

    @Override // X.TMR
    public final C73634Sv8 next() {
        return C74514TMg.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74513TMf(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform, String panel, int i, TPF tpf, boolean z) {
        super(effectPlatform, panel, tpf, z);
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(panel, "panel");
        this.LJII = i;
    }
}
