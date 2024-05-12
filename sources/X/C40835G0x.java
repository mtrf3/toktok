package X;

import com.ss.android.ugc.aweme.journey.step.privacyhighlights.PrivacyHighlightsForTeensComponent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.G0x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40835G0x extends AbstractC40836G0y<C40791Fzf> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_PRIVACY_HIGHLIGHTS_FOR_TEENS;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        if (c35656Dz2 != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC40836G0y
    public final NUJComponentFragment LJ(C40791Fzf c40791Fzf) {
        return new PrivacyHighlightsForTeensComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40835G0x(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }
}
