package X;

import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.DualStreamViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.JfC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49714JfC {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C46443IKp.LJLIL);

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ(DualStreamViewModel dualStreamViewModel, GlobalDoodleConfig globalDoodleConfig) {
        String tnsBanType;
        o.LJIIIZ(dualStreamViewModel, "dualStreamViewModel");
        if (LIZ() == 0 || dualStreamViewModel.LJLILLLLZI || dualStreamViewModel.LJLIL) {
            return false;
        }
        if (globalDoodleConfig != null && (tnsBanType = globalDoodleConfig.getTnsBanType()) != null && ujb.o.LJJJJIZL(tnsBanType, EnumC49738Jfa.AID.getType(), true)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(DualStreamViewModel dualStreamViewModel, GlobalDoodleConfig globalDoodleConfig, C50287JoR c50287JoR) {
        String str;
        String tnsBanType;
        o.LJIIIZ(dualStreamViewModel, "dualStreamViewModel");
        if (LIZ() == 0) {
            return false;
        }
        if (C49856JhU.LIZ) {
            return true;
        }
        if (dualStreamViewModel.LJLILLLLZI || dualStreamViewModel.LJLIL) {
            return false;
        }
        if (globalDoodleConfig != null && (tnsBanType = globalDoodleConfig.getTnsBanType()) != null && ujb.o.LJJJJIZL(tnsBanType, EnumC49738Jfa.AID.getType(), true)) {
            return false;
        }
        if (c50287JoR != null) {
            if (c50287JoR.isDefaultOption()) {
                ResearchFilterStruct researchFilterOption = c50287JoR.getResearchFilterOption();
                if (researchFilterOption != null) {
                    str = researchFilterOption.getRequestContent();
                } else {
                    str = null;
                }
                if (C78857UxB.LJJJIL(str)) {
                }
            }
            return false;
        }
        return true;
    }
}
