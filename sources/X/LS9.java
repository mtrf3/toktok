package X;

import Y.ACListenerS29S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class LS9 extends PMI {
    public final ViewGroup LIZIZ;
    public final InterfaceC92113jT LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final boolean LJFF;
    public final EnumC61812bh LJI;
    public final C54258LRe LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public TuxTextView LJIIJ;
    public TuxTextView LJIIJJI;
    public SY4 LJIIL;
    public View LJIILIIL;
    public InterfaceC56382Je LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public C77869UhF LJIIZILJ;
    public LSY LJIJ;
    public SwipeUpGuideStrengthenLayout LJIJI;

    public final void LJIILLIIL() {
        View view = this.LJIILIIL;
        if (view == null || view.getParent() == null) {
            this.LIZIZ.addView(this.LJIILIIL);
        }
        View view2 = this.LJIILIIL;
        if (view2 != null) {
            view2.setVisibility(0);
            view2.setAlpha(0.0f);
            view2.animate().alpha(1.0f).setDuration(300L).withEndAction(new ARunnableS28S0200000_9(view2, this, 46)).start();
            EnumC61812bh enumC61812bh = this.LJI;
            if (enumC61812bh == EnumC61812bh.SWIPE_UP_GUIDE) {
                G2H g2h = G2H.NEW_USER_GUIDE_SHOW;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("guide_type", "slide");
                java.util.Map<String, String> show$lambda$1$lambda$0 = c188727au.LIZ;
                o.LJIIIIZZ(show$lambda$1$lambda$0, "show$lambda$1$lambda$0");
                V2B.LJIJ(show$lambda$1$lambda$0);
                C36222EJm.LIZIZ(g2h, show$lambda$1$lambda$0);
                this.LJII.LJIIJ("swipe_up_guide", true, null);
                LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
                LQM.LJIJJLI = true;
                LQM.LIZJ("draw_guide", false);
                C82699Wcx.LIZ();
                return;
            }
            if (enumC61812bh != EnumC61812bh.NOT_INTERESTED_TUTORIAL) {
                return;
            }
            this.LJII.LJI(true);
        }
    }

    public final void LJIILL() {
        InterfaceC56382Je interfaceC56382Je;
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            View view = this.LJIILIIL;
            if (view != null) {
                SpecActServiceImpl.LJJJIL().LJIJI(false);
                view.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS28S0200000_9(view, this, 45)).start();
            }
        } else {
            String stackTraceString = android.util.Log.getStackTraceString(new Throwable("execute UI not in main Thread"));
            o.LJIIIIZZ(stackTraceString, "getStackTraceString(Throwable(ename))");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("error_type", "UI_not_in_main");
                FUA.LIZJ("aweme_error_find_bug", jSONObject);
            } catch (Exception unused) {
                C39623Fgp.LIZIZ(stackTraceString);
            }
        }
        if (this.LJI != EnumC61812bh.NOT_INTERESTED_TUTORIAL || (interfaceC56382Je = this.LJIILJJIL) == null) {
            return;
        }
        interfaceC56382Je.LIZ((SystemClock.elapsedRealtime() - this.LJIILL) + this.LJIILLIIL, "got_it");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LS9(ViewGroup viewContainer, C80796VnM viewPager, String source, Integer num, boolean z, EnumC61812bh type) {
        super((View) viewContainer);
        boolean z2;
        int i;
        View LLLLIILL;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        CharSequence text;
        Integer valueOf;
        o.LJIIIZ(viewContainer, "viewContainer");
        o.LJIIIZ(viewPager, "viewPager");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(type, "type");
        this.LIZIZ = viewContainer;
        this.LIZJ = viewPager;
        this.LIZLLL = source;
        this.LJ = num;
        this.LJFF = z;
        this.LJI = type;
        Context context = viewContainer.getContext();
        o.LJIIIIZZ(context, "viewContainer.context");
        this.LJII = LRD.LIZ(context);
        if (type == EnumC61812bh.SWIPE_UP_GUIDE && FFL.LJIIIZ().LJIIJJI(ClientExpManager.launch_opt_swipeup(), "launch_opt_swipeup") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIIIZZ = z2;
        this.LJIIIZ = LFH.LIZIZ.LIZLLL().LJIILLIIL().LJJIJIIJI();
        this.LJIILL = SystemClock.elapsedRealtime();
        if (this.LJIILIIL == null) {
            int i2 = C2R4.LIZ[type.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = R.layout.adp;
                } else {
                    throw new C162476Zf();
                }
            } else {
                i = R.layout.aew;
            }
            if (C38866FNe.LIZIZ()) {
                try {
                    Context context2 = viewContainer.getContext();
                    o.LJIIIIZZ(context2, "viewContainer.context");
                    Activity LJIJJ = C45804HyK.LJIJJ(context2);
                    o.LJI(LJIJJ);
                    LLLLIILL = C16970lZ.LIZLLL(LJIJJ, i);
                } catch (Exception unused) {
                    LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(((View) this.LIZ).getContext()), i, this.LIZIZ, false);
                }
            } else {
                LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(((View) this.LIZ).getContext()), i, viewContainer, false);
            }
            this.LJIILIIL = LLLLIILL;
            if (LLLLIILL != null) {
                tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.mli);
            } else {
                tuxTextView = null;
            }
            this.LJIIJ = tuxTextView;
            Integer num2 = this.LJ;
            if (num2 != null) {
                int intValue = num2.intValue();
                TuxTextView tuxTextView3 = this.LJIIJ;
                if (tuxTextView3 != null) {
                    C1DG.LJI((View) this.LIZ, intValue, tuxTextView3);
                }
            }
            EnumC61812bh enumC61812bh = this.LJI;
            if (enumC61812bh == EnumC61812bh.SWIPE_UP_GUIDE) {
                View view = this.LJIILIIL;
                if (view instanceof SwipeUpGuideStrengthenLayout) {
                    o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout");
                    this.LJIJI = (SwipeUpGuideStrengthenLayout) view;
                }
                SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LJIJI;
                if (swipeUpGuideStrengthenLayout != null) {
                    swipeUpGuideStrengthenLayout.setViewPager(this.LIZJ);
                    swipeUpGuideStrengthenLayout.setFallBackRunnable(new ARunnableS37S0100000_1(this, 68));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("viewPager ");
                    LIZ.append(this.LIZJ);
                    X1D.LIZIZ(LIZ);
                }
            } else if (enumC61812bh == EnumC61812bh.NOT_INTERESTED_TUTORIAL) {
                View view2 = this.LJIILIIL;
                if (view2 != null) {
                    tuxTextView2 = (TuxTextView) view2.findViewById(R.id.mlj);
                } else {
                    tuxTextView2 = null;
                }
                this.LJIIJJI = tuxTextView2;
                View view3 = this.LJIILIIL;
                SY4 sy4 = view3 != null ? (SY4) view3.findViewById(R.id.cby) : null;
                this.LJIIL = sy4;
                if (sy4 != null) {
                    C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(this, 92));
                }
            }
            TuxTextView tuxTextView4 = this.LJIIJ;
            if (tuxTextView4 != null && (text = tuxTextView4.getText()) != null && (valueOf = Integer.valueOf(text.length())) != null) {
                int intValue2 = valueOf.intValue();
                if (1 <= intValue2) {
                    if (intValue2 < 21) {
                        return;
                    }
                    if (intValue2 < 41) {
                        TuxTextView tuxTextView5 = this.LJIIJ;
                        if (tuxTextView5 == null) {
                            return;
                        }
                        tuxTextView5.setTextSize(25.0f);
                        return;
                    }
                }
                TuxTextView tuxTextView6 = this.LJIIJ;
                if (tuxTextView6 == null) {
                    return;
                }
                tuxTextView6.setTextSize(20.0f);
            }
        }
    }
}
