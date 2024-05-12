package X;

import com.ss.android.ugc.aweme.journey.step.interestselector.SelectInterestsComponent;
import com.ss.android.ugc.aweme.journey.step.interestselector.SelectTopicInterestsComponent;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryStruct;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.SmartLockService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G00 extends AbstractC40836G0y<C40788Fzc> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_INTERESTS_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        EnumC40753Fz3 enumC40753Fz3;
        InterfaceC40766FzG interfaceC40766FzG;
        if ((!EOO.LIZJ() || !SmartLockService.createISmartLockServicebyMonsterPlugin(false).isLoginSuccessBySmartLock() || !EOO.LJI()) && !EOO.LJII() && !E59.LIZ() && !C35829E4j.LIZ() && !E5H.LIZIZ(EnumC40761FzB.JOURNEY_INTERESTS_ID) && !EOO.LJFF() && !G0G.LIZ().skipIS) {
            G15 g15 = this.LIZIZ;
            if (g15 != null && (interfaceC40766FzG = g15.LIZ) != null) {
                enumC40753Fz3 = interfaceC40766FzG.type();
            } else {
                enumC40753Fz3 = null;
            }
            if (enumC40753Fz3 == EnumC40753Fz3.NUJ_SCENE_NEW_USER) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC40836G0y
    public final NUJComponentFragment LJ(C40788Fzc c40788Fzc) {
        Boolean bool;
        List<TopicInterestCategoryStruct> list;
        C40788Fzc c40788Fzc2 = c40788Fzc;
        if (c40788Fzc2 != null && (list = c40788Fzc2.LJ) != null) {
            bool = Boolean.valueOf(!list.isEmpty());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            return new SelectTopicInterestsComponent();
        }
        return new SelectInterestsComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G00(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }
}
