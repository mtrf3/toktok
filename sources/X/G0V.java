package X;

import com.ss.android.ugc.aweme.journey.step.lynx.LynxExperienceFragment;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0V extends AbstractC40836G0y<C40787Fzb> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_LYNX_EXPERIENCE_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        C40787Fzb c40787Fzb = (C40787Fzb) c35656Dz2;
        if (c40787Fzb == null) {
            return false;
        }
        if (!o.LJ(c40787Fzb.LIZJ, "lynx_v1") && !o.LJ(c40787Fzb.LIZJ, "lynx_v2")) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC40836G0y
    public final NUJComponentFragment LJ(C40787Fzb c40787Fzb) {
        return new LynxExperienceFragment();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0V(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }
}
