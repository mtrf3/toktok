package com.ss.android.ugc.feed.platform.cell.component.survey;

import X.AbstractC61774OMg;
import X.AnonymousClass901;
import X.C221108m2;
import X.C224888s8;
import X.C2297890c;
import X.C2298090e;
import X.C2298390h;
import X.C2298690k;
import X.C2298890m;
import X.C2QN;
import X.C57822Os;
import X.C59050NFm;
import X.C62822Ol8;
import X.C63100Opc;
import X.C63103Opf;
import X.C90T;
import X.C93Y;
import X.C94C;
import X.C94F;
import X.JIK;
import X.NQU;
import X.OGA;
import X.ONM;
import X.OO3;
import X.OO7;
import X.Z9N;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CellSurveyTemp implements CellSurveyComponentAbility {
    public final VideoViewCell LJLIL;
    public final View LJLILLLLZI;
    public final AnonymousClass901 LJLJI;
    public final C62822Ol8 LJLJJI;
    public Aweme LJLJJL;
    public BaseFeedPageParams LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final View LJLJLLL;
    public final View LJLL;
    public final FrameLayout LJLLI;
    public final SmartImageView LJLLILLLL;
    public final C94F LJLLJ;
    public final LongPressLayout LJLLL;
    public final C94C LJLLLL;
    public final ImageView LJLLLLLL;
    public final FrameLayout LJLZ;
    public final View LJZ;
    public final View LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final ViewStub LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final ViewStub LLFFF;
    public final ViewStub LLFII;
    public final ViewStub LLFZ;
    public final ViewStub LLI;
    public final ViewStub LLIFFJFJJ;
    public final OO7 LLII;
    public OO3 LLIIII;

    public final C63103Opf LIZ() {
        return (C63103Opf) this.LLF.getValue();
    }

    public final Context LIZIZ() {
        return (Context) this.LJLJJI.getValue();
    }

    public final CellSurveyComponentAbility LIZJ() {
        return (CellSurveyComponentAbility) this.LJLJLJ.getValue();
    }

    public final C90T LIZLLL() {
        if (Z9N.LIZIZ.LLJL(LIZIZ())) {
            return (C90T) this.LL.getValue();
        }
        if (C59050NFm.LIZIZ.LJIIIIZZ(this.LJLJJL)) {
            NQU z2 = this.LJLJI.z2();
            if (z2 != null) {
                return z2.u70();
            }
            return null;
        }
        if (C93Y.LIZ(this.LJLJJL)) {
            return (AbstractC61774OMg) this.LLFF.getValue();
        }
        return ((OGA) this.LJZL.getValue()).LIZ(this.LJLJJL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void GJ() {
        if (C2298890m.LIZ()) {
            CellSurveyComponentAbility LIZJ = LIZJ();
            if (LIZJ != null) {
                LIZJ.GJ();
                return;
            }
            return;
        }
        C94F c94f = this.LJLLJ;
        if (c94f == null) {
            return;
        }
        c94f.LJLJJI = this.LLIIII;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final boolean O40() {
        if (C2298890m.LIZ()) {
            CellSurveyComponentAbility LIZJ = LIZJ();
            if (LIZJ == null) {
                return false;
            }
            return LIZJ.O40();
        }
        C90T LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return false;
        }
        return LIZLLL.isShowing();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final boolean S() {
        if (C2298890m.LIZ()) {
            CellSurveyComponentAbility LIZJ = LIZJ();
            if (LIZJ == null) {
                return false;
            }
            return LIZJ.S();
        }
        OO3 oo3 = this.LLIIII;
        if (oo3 == null) {
            return false;
        }
        return oo3.LJIIJJI;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void U8() {
        if (C2298890m.LIZ()) {
            CellSurveyComponentAbility LIZJ = LIZJ();
            if (LIZJ != null) {
                LIZJ.U8();
                return;
            }
            return;
        }
        if (ONM.LJI(this.LJLJJL) || !C224888s8.LJFF(false)) {
            return;
        }
        C90T LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LJIIJ(this.LLFII, LIZIZ(), this.LJLJJL, this.LJLJLLL, this.LJLL, this.LJZI, this.LJZ, null);
        }
        C90T LIZLLL2 = LIZLLL();
        if (LIZLLL2 == null) {
            return;
        }
        LIZLLL2.LJIIJJI();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void checkViewHolderState() {
        C90T LIZLLL;
        if (C2298890m.LIZ()) {
            CellSurveyComponentAbility LIZJ = LIZJ();
            if (LIZJ != null) {
                LIZJ.checkViewHolderState();
                return;
            }
            return;
        }
        if ((!ONM.LJI(this.LJLJJL) && !S()) || (LIZLLL = LIZLLL()) == null) {
            return;
        }
        LIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void f6() {
        if (C2298890m.LIZ()) {
            CellSurveyComponentAbility LIZJ = LIZJ();
            if (LIZJ != null) {
                LIZJ.f6();
                return;
            }
            return;
        }
        C57822Os.LIZIZ(this.LJLJJL);
        LJ(false);
        ISurveyInteractAbility iSurveyInteractAbility = (ISurveyInteractAbility) this.LJLJL.getValue();
        if (iSurveyInteractAbility == null) {
            return;
        }
        iSurveyInteractAbility.yk();
    }

    public final void LJ(boolean z) {
        C90T LIZLLL;
        ViewStub viewStub;
        OO3 oo3 = this.LLIIII;
        if (oo3 != null) {
            oo3.LJIILIIL(z);
            if (z && (LIZLLL = LIZLLL()) != null) {
                if (C59050NFm.LIZIZ.LJIIIIZZ(this.LJLJJL)) {
                    viewStub = this.LLFFF;
                } else if (C93Y.LIZ(this.LJLJJL)) {
                    viewStub = this.LLIFFJFJJ;
                } else {
                    viewStub = this.LLI;
                }
                LIZLLL.LJIIJ(viewStub, LIZIZ(), this.LJLJJL, this.LJLJLLL, this.LJLL, this.LJZI, this.LJZ, this.LLIIII);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void o6(C2QN c2qn) {
        ViewStub viewStub;
        if (C2298890m.LIZ()) {
            CellSurveyComponentAbility LIZJ = LIZJ();
            if (LIZJ != null) {
                LIZJ.o6(c2qn);
                return;
            }
            return;
        }
        Aweme aweme = this.LJLJJL;
        if (c2qn == null || c2qn.LJLIL == null || aweme == null || !o.LJ(c2qn.LJLIL.getAid(), aweme.getAid())) {
            return;
        }
        if (c2qn.LJLILLLLZI >= 90.0f) {
            if (!LIZ().LJIILJJIL() || LIZ().isShowing()) {
                return;
            }
            LIZ().LJIIJ(this.LLD, LIZIZ(), this.LJLJJL, this.LJLJLLL, this.LJLL, this.LJZI, this.LJZ, null);
            return;
        }
        if (!JIK.LIZ(LIZIZ(), this.LJLJJL)) {
            return;
        }
        if (LIZ().LJLIL == null) {
            C63100Opc.LIZIZ(JIK.LJFF, JIK.LIZIZ);
        }
        if (LIZ().LJIILJJIL() || (viewStub = this.LLD) == null) {
            return;
        }
        LIZ().LJIIIZ(viewStub, LIZIZ(), this.LJLJJL, this.LJLJLLL);
    }

    public CellSurveyTemp(VideoViewCell videoViewCell, View view, AnonymousClass901 commerceDelegate) {
        o.LJIIIZ(commerceDelegate, "commerceDelegate");
        this.LJLIL = videoViewCell;
        this.LJLILLLLZI = view;
        this.LJLJI = commerceDelegate;
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 902));
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 903));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 904));
        this.LJZL = C221108m2.LIZIZ(C2298390h.LJLIL);
        this.LL = C221108m2.LIZIZ(C2297890c.LJLIL);
        this.LLF = C221108m2.LIZIZ(C2298090e.LJLIL);
        this.LLFF = C221108m2.LIZIZ(C2298690k.LJLIL);
        this.LJLJLLL = view.findViewById(R.id.niu);
        this.LJLL = view.findViewById(R.id.adq);
        this.LJLLI = (FrameLayout) view.findViewById(R.id.player_view);
        this.LJLLILLLL = (SmartImageView) view.findViewById(R.id.cover);
        this.LJLLJ = (C94F) view.findViewById(R.id.gpp);
        this.LJLLL = (LongPressLayout) view.findViewById(R.id.long_press_layout);
        this.LJLLLL = (C94C) view.findViewById(R.id.dy6);
        this.LJLLLLLL = (ImageView) view.findViewById(R.id.hrs);
        this.LJLZ = (FrameLayout) view.findViewById(R.id.hqw);
        this.LJZ = view.findViewById(R.id.eq0);
        this.LJZI = view.findViewById(R.id.k5d);
        this.LLFFF = (ViewStub) view.findViewById(R.id.bmp);
        this.LLD = (ViewStub) view.findViewById(R.id.lv);
        this.LLFII = (ViewStub) view.findViewById(R.id.dyh);
        this.LLFZ = (ViewStub) view.findViewById(R.id.dlq);
        this.LLI = (ViewStub) view.findViewById(R.id.afc);
        this.LLIFFJFJJ = (ViewStub) view.findViewById(R.id.ie4);
        this.LLII = (OO7) view.findViewById(R.id.afb);
    }
}
