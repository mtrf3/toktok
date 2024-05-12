package com.ss.android.ugc.feed.platform.cell.component.survey;

import X.AbstractC61774OMg;
import X.AnonymousClass901;
import X.C221108m2;
import X.C224888s8;
import X.C2297990d;
import X.C2298490i;
import X.C2298590j;
import X.C2298790l;
import X.C2K0;
import X.C2QN;
import X.C51029K0z;
import X.C55096Ljo;
import X.C57822Os;
import X.C59050NFm;
import X.C62822Ol8;
import X.C63100Opc;
import X.C63103Opf;
import X.C79081V1x;
import X.C90T;
import X.C93Y;
import X.C94C;
import X.C94F;
import X.EnumC61773OMf;
import X.InterfaceC2309294m;
import X.InterfaceC55102Lju;
import X.JIK;
import X.NQU;
import X.OBM;
import X.OGA;
import X.ONM;
import X.OO3;
import X.OO7;
import X.Z9N;
import Y.IDiS268S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CellSurveyComponent extends BaseCellContentComponent implements CellSurveyComponentAbility, InterfaceC55102Lju {
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public View LLF;
    public View LLFF;
    public FrameLayout LLFFF;
    public SmartImageView LLFII;
    public C94F LLFZ;
    public LongPressLayout LLI;
    public C94C LLIFFJFJJ;
    public ImageView LLII;
    public FrameLayout LLIIII;
    public View LLIIIILZ;
    public View LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public ViewStub LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public ViewStub LLIILII;
    public ViewStub LLIILZL;
    public ViewStub LLIIZ;
    public ViewStub LLIL;
    public ViewStub LLILII;
    public OO7 LLILIL;
    public OO3 LLILL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 102985896) {
            return null;
        }
        return this;
    }

    public CellSurveyComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1244));
        this.LLD = C221108m2.LIZIZ(new AqS154S0100000_4(this, 901));
        this.LLIIIL = C221108m2.LIZIZ(C2298590j.LJLIL);
        this.LLIIIZ = C221108m2.LIZIZ(C2297990d.LJLIL);
        this.LLIIJI = C221108m2.LIZIZ(C2298790l.LJLIL);
        this.LLIIL = C221108m2.LIZIZ(C2298490i.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void GJ() {
        C94F c94f = this.LLFZ;
        if (c94f != null) {
            c94f.LJLJJI = this.LLILL;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        ((OGA) this.LLIIIL.getValue()).LIZIZ.LIZJ();
        OO3 oo3 = this.LLILL;
        if (oo3 != null) {
            oo3.LJFF(null, null);
        }
        OO3 oo32 = this.LLILL;
        if (oo32 != null) {
            oo32.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final boolean S() {
        OO3 oo3 = this.LLILL;
        if (oo3 != null) {
            return oo3.LJIIJJI;
        }
        return false;
    }

    public final C63103Opf b4() {
        return (C63103Opf) this.LLIIL.getValue();
    }

    public final C90T c4() {
        AnonymousClass901 j3;
        NQU z2;
        if (Z9N.LIZIZ.LLJL(getContext())) {
            return (C90T) this.LLIIIZ.getValue();
        }
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C59050NFm.LIZIZ.LJIIIIZZ(aweme)) {
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LL.getValue();
            if (iVideoCellAbility != null && (j3 = iVideoCellAbility.j3()) != null && (z2 = j3.z2()) != null) {
                return z2.u70();
            }
            return null;
        }
        if (C93Y.LIZ(aweme)) {
            return (AbstractC61774OMg) this.LLIIJI.getValue();
        }
        return ((OGA) this.LLIIIL.getValue()).LIZ(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        C90T c4;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (O40()) {
            if (C79081V1x.LJIL(aweme)) {
                C90T c42 = c4();
                if (c42 != null) {
                    c42.LJI(EnumC61773OMf.SWIPE, aweme);
                }
                C90T c43 = c4();
                if (c43 != null) {
                    c43.LIZJ();
                }
            } else if (C79081V1x.LJIJJLI(aweme) && aweme.getIsSubAweme()) {
                C90T c44 = c4();
                if (c44 != null) {
                    c44.LJI(EnumC61773OMf.SWIPE, aweme);
                }
            } else if (C79081V1x.LJIJJ(aweme)) {
                C90T c45 = c4();
                if (c45 != null) {
                    c45.LJI(EnumC61773OMf.SWIPE, aweme);
                }
            } else if (Z9N.LIZIZ.LLJL(getContext())) {
                C90T c46 = c4();
                if (c46 != null) {
                    c46.LJI(EnumC61773OMf.SWIPE, aweme);
                }
            } else if (C59050NFm.LIZIZ.LJIIIIZZ(aweme) && (c4 = c4()) != null) {
                c4.LJI(EnumC61773OMf.SWIPE, aweme);
            }
            OO3 oo3 = this.LLILL;
            if (oo3 != null) {
                oo3.LJIIJJI();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final boolean O40() {
        C90T c4 = c4();
        if (c4 != null) {
            return c4.isShowing();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void U8() {
        if (!ONM.LJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) && C224888s8.LJFF(false)) {
            C90T c4 = c4();
            if (c4 != null) {
                c4.LJIIJ(this.LLIILZL, getContext(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), this.LLF, this.LLFF, this.LLIIIJ, this.LLIIIILZ, null);
            }
            C90T c42 = c4();
            if (c42 != null) {
                c42.LJIIJJI();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void checkViewHolderState() {
        C90T c4;
        if ((ONM.LJI(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) || S()) && (c4 = c4()) != null) {
            c4.LJII();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void f6() {
        C57822Os.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
        e4(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), false);
        ISurveyInteractAbility iSurveyInteractAbility = (ISurveyInteractAbility) this.LLD.getValue();
        if (iSurveyInteractAbility != null) {
            iSurveyInteractAbility.yk();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void onDestroyView() {
        IDiS268S0100000_4 iDiS268S0100000_4;
        HomeViewPagerAbility homeViewPagerAbility;
        C90T c4 = c4();
        if (c4 != null) {
            c4.LIZIZ();
        }
        OO3 oo3 = this.LLILL;
        if (oo3 != null && (iDiS268S0100000_4 = oo3.LJJJJJL) != null && (homeViewPagerAbility = oo3.LJJJJJ) != null) {
            homeViewPagerAbility.um(iDiS268S0100000_4);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        C90T c4;
        C90T c42;
        OO3 oo3;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        final Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        String str = item.mEventType;
        Context context = getContainerView().getContext();
        if (OBM.LIZ(aweme, str)) {
            if (this.LLILL == null || C59050NFm.LIZIZ.LJIIIIZZ(aweme)) {
                OO3 oo32 = new OO3();
                this.LLILL = oo32;
                C94F c94f = this.LLFZ;
                if (c94f != null) {
                    c94f.LJLJJI = oo32;
                }
            }
            InterfaceC2309294m interfaceC2309294m = new InterfaceC2309294m() { // from class: X.90g
                @Override // X.InterfaceC2309294m
                public final NFU LIZ() {
                    return C59050NFm.LIZIZ.LIZJ(Aweme.this);
                }

                @Override // X.InterfaceC2309294m
                public final View getRootView() {
                    return this.getContainerView();
                }

                @Override // X.InterfaceC2309294m
                public final AnonymousClass999 getScene() {
                    if (C59050NFm.LIZIZ.LJIIIIZZ(Aweme.this)) {
                        return AnonymousClass999.ACE_SURVEY;
                    }
                    Aweme aweme2 = Aweme.this;
                    if (aweme2 != null && aweme2.isAd()) {
                        return AnonymousClass999.AD_SURVEY;
                    }
                    return AnonymousClass999.FEED_SURVEY;
                }
            };
            OO3 oo33 = this.LLILL;
            if (oo33 != null) {
                oo33.LJFF(aweme, str);
            }
            C90T c43 = c4();
            if (c43 == null) {
                return;
            }
            OO7 oo7 = this.LLILIL;
            if (oo7 != null && (oo3 = this.LLILL) != null) {
                o.LJIIIIZZ(context, "context");
                oo3.LJII(context, c43, oo7, this.LLFFF, this.LLFII, this.LLF, this.LLFF, this.LLIIIJ, this.LLIIIILZ, this.LLII, this.LLIFFJFJJ, this.LLIIII, interfaceC2309294m);
            }
            OO3 oo34 = this.LLILL;
            LongPressLayout longPressLayout = this.LLI;
            if (longPressLayout != null) {
                longPressLayout.setVideoScalingListener(oo34);
            }
            e4(aweme, true);
        }
        b4().LIZJ();
        Z9N z9n = Z9N.LIZIZ;
        if (z9n.LLJL(getContext()) && (c42 = c4()) != null) {
            c42.LIZJ();
        }
        if ((!C79081V1x.LJIJJLI(aweme) && !z9n.LLJL(getContext())) || (c4 = c4()) == null) {
            return;
        }
        c4.LJIIJ(this.LLIIZ, getContext(), aweme, this.LLF, this.LLFF, this.LLIIIJ, this.LLIIIILZ, this.LLILL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        C90T c4 = c4();
        if (c4 != null) {
            c4.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void o6(C2QN c2qn) {
        ViewStub viewStub;
        if (c2qn == null || c2qn.LJLIL == null) {
            return;
        }
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (o.LJ(c2qn.LJLIL.getAid(), aweme.getAid())) {
            if (c2qn.LJLILLLLZI >= 90.0f) {
                if (!b4().LJIILJJIL() || b4().isShowing()) {
                    return;
                }
                b4().LJIIJ(this.LLIIJLIL, getContext(), aweme, this.LLF, this.LLFF, this.LLIIIJ, this.LLIIIILZ, null);
                return;
            }
            if (!JIK.LIZ(getContext(), aweme)) {
                return;
            }
            if (b4().LJLIL == null) {
                C63100Opc.LIZIZ(JIK.LJFF, JIK.LIZIZ);
            }
            if (b4().LJIILJJIL() || (viewStub = this.LLIIJLIL) == null) {
                return;
            }
            b4().LJIIIZ(viewStub, getContext(), aweme, this.LLF);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLF = view.findViewById(R.id.niu);
        this.LLFF = view.findViewById(R.id.adq);
        this.LLFFF = (FrameLayout) view.findViewById(R.id.player_view);
        this.LLFII = (SmartImageView) view.findViewById(R.id.cover);
        this.LLFZ = (C94F) view.findViewById(R.id.gpp);
        this.LLI = (LongPressLayout) view.findViewById(R.id.long_press_layout);
        this.LLIFFJFJJ = (C94C) view.findViewById(R.id.dy6);
        this.LLII = (ImageView) view.findViewById(R.id.hrs);
        this.LLIIII = (FrameLayout) view.findViewById(R.id.hqw);
        this.LLIIIILZ = view.findViewById(R.id.eq0);
        this.LLIIIJ = view.findViewById(R.id.k5d);
        this.LLIILII = (ViewStub) view.findViewById(R.id.bmp);
        this.LLIIJLIL = (ViewStub) view.findViewById(R.id.lv);
        this.LLIILZL = (ViewStub) view.findViewById(R.id.dyh);
        this.LLIIZ = (ViewStub) view.findViewById(R.id.dlq);
        this.LLIL = (ViewStub) view.findViewById(R.id.afc);
        this.LLILII = (ViewStub) view.findViewById(R.id.ie4);
        this.LLILIL = (OO7) view.findViewById(R.id.afb);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        C90T c4;
        OO3 oo3 = this.LLILL;
        if (oo3 != null) {
            if (oo3.LJIIJJI) {
                HomePageViewPagerAbility homePageViewPagerAbility = oo3.LJJJJIZL;
                if (homePageViewPagerAbility != null) {
                    homePageViewPagerAbility.LJJJJZ(false);
                }
            } else {
                HomePageViewPagerAbility homePageViewPagerAbility2 = oo3.LJJJJIZL;
                if (homePageViewPagerAbility2 != null) {
                    homePageViewPagerAbility2.LJJJJZ(true);
                }
            }
        }
        if ((!C79081V1x.LJIJJ(aweme) || Z9N.LIZIZ.LLJL(getContext()) || C59050NFm.LIZIZ.LJIIIIZZ(aweme)) && (c4 = c4()) != null) {
            c4.LJIIJJI();
        }
    }

    public final void e4(Aweme aweme, boolean z) {
        C90T c4;
        ViewStub viewStub;
        OO3 oo3 = this.LLILL;
        if (oo3 != null) {
            oo3.LJIILIIL(z);
            if (z && (c4 = c4()) != null) {
                if (C59050NFm.LIZIZ.LJIIIIZZ(aweme)) {
                    viewStub = this.LLIILII;
                } else if (C93Y.LIZ(aweme)) {
                    viewStub = this.LLILII;
                } else {
                    viewStub = this.LLIL;
                }
                c4.LJIIJ(viewStub, getContext(), aweme, this.LLF, this.LLFF, this.LLIIIJ, this.LLIIIILZ, this.LLILL);
            }
        }
    }
}
