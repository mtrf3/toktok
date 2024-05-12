package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.journey.step.slogan.ControlSloganFragment;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Fzx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40809Fzx extends AbstractC40836G0y<C35656Dz2> {
    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        return true;
    }

    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_SLOGAN_ID;
    }

    @Override // X.AbstractC40836G0y
    public final NUJComponentFragment LJ(C35656Dz2 c35656Dz2) {
        EnumC40753Fz3 enumC40753Fz3;
        boolean z;
        InterfaceC40766FzG interfaceC40766FzG;
        ControlSloganFragment controlSloganFragment = new ControlSloganFragment();
        C40804Fzs LJFF = ((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LJFF();
        Bundle bundle = new Bundle();
        int i = LJFF.LIZIZ;
        if (i > 0) {
            bundle.putInt("extra_optimize_option", i);
            bundle.putBoolean("extra_is_saveinstance", LJFF.LIZJ);
        }
        G15 g15 = this.LIZIZ;
        if (g15 != null && (interfaceC40766FzG = g15.LIZ) != null) {
            enumC40753Fz3 = interfaceC40766FzG.type();
        } else {
            enumC40753Fz3 = null;
        }
        if (enumC40753Fz3 == EnumC40753Fz3.NUJ_SCENE_NEW_VERSION) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("extra_new_version", z);
        bundle.putBoolean("useNewAppUpdateSloganUI", z);
        controlSloganFragment.setArguments(bundle);
        return controlSloganFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40809Fzx(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }
}
