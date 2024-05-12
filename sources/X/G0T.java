package X;

import com.ss.android.ugc.aweme.journey.step.contentlanguage.ContentLanguageComponent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0T extends AbstractC40836G0y<C40787Fzb> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        if (c35656Dz2 == null || G2G.LIZIZ.LJI() || E5H.LIZIZ(EnumC40761FzB.JOURNEY_CONTENT_LANGUAGE_ID) || G0G.LIZ().skipLanguage) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC40836G0y
    public final NUJComponentFragment LJ(C40787Fzb c40787Fzb) {
        return new ContentLanguageComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0T(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }
}
