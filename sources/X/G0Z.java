package X;

import com.ss.android.ugc.aweme.journey.step.deeplink.DeeplinkComponent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G0Z extends AbstractC40836G0y<C35656Dz2> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_DEEPLINK_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        C40769FzJ c40769FzJ = ((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LJFF().LJ;
        if (c40769FzJ != null && ((!c40769FzJ.LJLIL || (HG3.LJIILL().isLogin() && c40769FzJ != null)) && c40769FzJ.LJLILLLLZI != null)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC40836G0y
    public final NUJComponentFragment LJ(C35656Dz2 c35656Dz2) {
        C71426S1m c71426S1m = ActivityC86117Xqz.Companion;
        C40816G0e c40816G0e = new C40816G0e(this);
        c71426S1m.getClass();
        C71426S1m.LIZ(c40816G0e);
        return new DeeplinkComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0Z(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }
}
