package com.ss.android.ugc.aweme.feed.landscape.service;

import X.C208088Eq;
import X.C209418Jt;
import X.C217358fz;
import X.C217588gM;
import X.C217598gN;
import X.C217608gO;
import X.C227768wm;
import X.C3C8;
import X.C62623Ohv;
import X.C65352Pkq;
import X.C79004UzY;
import X.C8VR;
import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.ILandscapeFeedService;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeInteractEntrancesContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeFeedServiceImpl implements ILandscapeFeedService {
    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJFF() {
        return C208088Eq.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZJ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return activity instanceof LandscapeFeedActivity;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LIZLLL(Aweme aweme) {
        if (aweme == null || !C217588gM.LIZIZ(aweme) || C217588gM.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJ(Aweme aweme) {
        if (aweme == null || !C227768wm.LJJIII(aweme) || !C217588gM.LIZIZ(aweme) || C217588gM.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJI(int i, Aweme aweme) {
        if (LJIIIZ(i, aweme) || C62623Ohv.LIZIZ.LJFF(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJIIIIZZ(Assembler assembler, InteractAreaComponent reusedUIAssem) {
        o.LJIIIZ(assembler, "assembler");
        o.LJIIIZ(reusedUIAssem, "reusedUIAssem");
        assembler.rv0(reusedUIAssem, C217358fz.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIIIZ(int i, Aweme aweme) {
        C217598gN.LIZ.getClass();
        if ((C217598gN.LIZIZ || i == 2 || i == 27) && C209418Jt.LIZ(aweme).LIZIZ() && C79004UzY.LJJIJIIJIL(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final boolean LJIIJ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        if (!C79004UzY.LJJIJIIJI(context)) {
            return false;
        }
        C217608gO.LIZ.getClass();
        if (!C217608gO.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeFeedService
    public final void LJII(ReusedUIAssem<? extends C3C8> reusedUIAssem, int i, Aweme aweme) {
        o.LJIIIZ(reusedUIAssem, "reusedUIAssem");
        if (LJI(i, aweme)) {
            C8VR.LIZJ(reusedUIAssem, C65352Pkq.LIZ(LandscapeInteractEntrancesContainer.class));
        }
    }
}
