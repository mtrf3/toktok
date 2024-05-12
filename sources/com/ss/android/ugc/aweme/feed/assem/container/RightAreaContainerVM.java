package com.ss.android.ugc.aweme.feed.assem.container;

import X.C202067wQ;
import X.C202677xP;
import X.C203457yf;
import X.C209418Jt;
import X.C33Q;
import X.C63081OpJ;
import X.C79004UzY;
import X.C84763XOl;
import X.C8D3;
import android.app.Activity;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RightAreaContainerVM extends FeedBaseViewModel<C203457yf> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        boolean z;
        C202067wQ c202067wQ;
        C202067wQ c202067wQ2;
        float f;
        Aweme aweme;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        boolean z2 = true;
        if (LJIIIIZZ != null && C79004UzY.LJJIJIIJI(LJIIIIZZ)) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme2 = null;
        if (z) {
            VideoItemParams gv0 = gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            if (C209418Jt.LIZ(aweme).LIZJ()) {
                if (C8D3.LIZIZ()) {
                    c202067wQ = new C202067wQ(44.0f, 30.0f, 0.0f, 0.0f, 0.0f, -4.5f, true, 0.0f, 0.0f, 3976);
                } else {
                    c202067wQ = new C202067wQ(44.0f, 32.0f, 0.0f, 0.0f, 0.0f, -4.5f, false, 0.0f, 0.0f, 3976);
                }
            } else {
                c202067wQ = new C202067wQ(44.0f, 24.0f, 24.0f, 0.0f, 0.0f, -8.0f, false, 0.0f, 0.0f, 3976);
            }
        } else if (C8D3.LIZJ()) {
            if (!C202677xP.LIZ()) {
                float f2 = (52 - 45.0f) / 2.0f;
                C8D3.LIZJ();
                z2 = true;
                c202067wQ = new C202067wQ(45.0f, 32.0f, 0.0f, 0.0f, 0.0f, -9.0f, true, f2 - 0, f2, 3596);
            } else if (FavoriteServiceImpl.LJIJJLI().LJI() > 0) {
                z2 = true;
                c202067wQ = new C202067wQ(45.0f, 36.0f, 10.5f, 4.5f, 6.0f, -4.5f, true, 0.0f, 0.0f, 3968);
            } else {
                z2 = true;
                c202067wQ = new C202067wQ(45.0f, 36.0f, 0.0f, 9.5f, 6.0f, -4.5f, true, 0.0f, 0.0f, 3972);
            }
        } else if (!C202677xP.LIZ()) {
            float f3 = ((60 - 45.0f) / 2.0f) - 0.0f;
            C8D3.LIZJ();
            c202067wQ = new C202067wQ(45.0f, 32.0f, 0.0f, 0.0f, 4.0f, -5.0f, false, f3 - 0, f3, 3648);
        } else if (FavoriteServiceImpl.LJIJJLI().LJIJJ()) {
            c202067wQ = new C202067wQ(45.0f, 36.0f, 16.0f, 10.0f, 8.0f, -5.0f, false, 0.0f, 0.0f, 4032);
        } else {
            c202067wQ = new C202067wQ(50.0f, 40.0f, 0.0f, 6.0f, 13.0f, -3.0f, false, 0.0f, 0.0f, 4036);
        }
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ2 != null && C79004UzY.LJJIJIIJI(LJIIIIZZ2) == z2) {
            VideoItemParams gv02 = gv0();
            if (gv02 != null) {
                aweme2 = gv02.getAweme();
            }
            if (C209418Jt.LIZ(aweme2).LIZJ()) {
                if (C8D3.LIZIZ()) {
                    c202067wQ2 = new C202067wQ(40.0f, 40.0f, 0.0f, 0.0f, 0.0f, -4.5f, true, 0.0f, 0.0f, 3972);
                } else {
                    c202067wQ2 = new C202067wQ(40.0f, 40.0f, 0.0f, 0.0f, 0.0f, -4.5f, false, 0.0f, 0.0f, 3972);
                }
            } else if (C8D3.LIZIZ()) {
                c202067wQ2 = new C202067wQ(40.0f, 40.0f, 0.0f, 12.0f, 0.0f, -4.5f, true, 0.0f, 0.0f, 3972);
            } else {
                c202067wQ2 = new C202067wQ(44.0f, 44.0f, 0.0f, 12.0f, 0.0f, -4.5f, false, 0.0f, 0.0f, 3972);
            }
        } else if (C8D3.LIZJ()) {
            if (FavoriteServiceImpl.LJIJJLI().LJI() > 0) {
                f = 1.0f;
            } else {
                f = 5.5f;
            }
            if (!C202677xP.LIZ()) {
                c202067wQ2 = new C202067wQ(52.0f, 40.0f, 0.0f, 0.0f, 2.0f, 0.0f, true, 0.0f, 0.0f, 3972);
            } else {
                c202067wQ2 = new C202067wQ(53.0f, 40.0f, 0.0f, f, 8.0f, 0.0f, true, 0.0f, 0.0f, 3972);
            }
        } else if (!C202677xP.LIZ()) {
            c202067wQ2 = new C202067wQ(60.0f, 44.0f, 0.0f, 0.0f, 10.0f, 0.0f, false, 0.0f, 0.0f, 4044);
        } else {
            c202067wQ2 = new C202067wQ(64.0f, 48.0f, 0.0f, 0.0f, 15.0f, 0.0f, false, 0.0f, 0.0f, 4044);
        }
        return new C203457yf(c202067wQ, c202067wQ2);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C203457yf iv0(C203457yf c203457yf, VideoItemParams item) {
        C203457yf state = c203457yf;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return new C203457yf(C202067wQ.L(state.LJLIL, 0.0f, C63081OpJ.LLJJIII(item.getAweme()), 2047), state.LJLILLLLZI);
    }
}
