package com.ss.android.ugc.aweme.journey.step.swipeup;

import X.AbstractC39351FcR;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C018905p;
import X.C0MT;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C188727au;
import X.C221108m2;
import X.C29S;
import X.C2OE;
import X.C2OF;
import X.C34126DaM;
import X.C35878E6g;
import X.C36222EJm;
import X.C38874FNm;
import X.C38986FRu;
import X.C38995FSd;
import X.C3C5;
import X.C40741Fyr;
import X.C40751Fz1;
import X.C40765FzF;
import X.C40804Fzs;
import X.C40805Fzt;
import X.C40884G2u;
import X.C40886G2w;
import X.C40888G2y;
import X.C56662Kg;
import X.C56K;
import X.C57722Oi;
import X.C5H3;
import X.C63078OpG;
import X.C73411SrX;
import X.C76800UCe;
import X.C78248UnM;
import X.C78685UuP;
import X.C7FC;
import X.C7MY;
import X.C84763XOl;
import X.C90903hW;
import X.DPY;
import X.E56;
import X.E6T;
import X.EF7;
import X.EnumC221088m0;
import X.EnumC40761FzB;
import X.EnumC61772bd;
import X.FFL;
import X.FNP;
import X.G0D;
import X.G1X;
import X.G2E;
import X.G2H;
import X.G2I;
import X.G2J;
import X.G3D;
import X.G3E;
import X.InterfaceC18010nF;
import X.InterfaceC40755Fz5;
import X.KL2;
import X.Q8U;
import X.T16;
import X.T5S;
import X.V2B;
import X.X1D;
import Y.ACListenerS26S0100000_6;
import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import Y.AfS58S0100000_6;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.plugin.progressbar.NewUserProgressModel$Stage;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* loaded from: classes7.dex */
public final class SwipeUpVideoComponent extends NUJComponentFragment implements InterfaceC18010nF {
    public ObjectAnimator LJLJJL;
    public String LJLJL;
    public GestureDetector LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public View LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;
    public boolean LJLLL;
    public C73411SrX LJLLLL;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public long LJLJJLL = System.currentTimeMillis();
    public final String LJLLLLLL = "welcome_screen_video4.mp4";
    public final int LJLZ = R.drawable.det;
    public final C5H3 LJZ = C221108m2.LIZ(EnumC221088m0.NONE, C40805Fzt.LJLIL);

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b8846";
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public SwipeUpVideoComponent() {
        G2J g2j;
        G2I LIZ = G2E.LIZ(EnumC40761FzB.JOURNEY_SWIPE_UP_ID);
        if (LIZ != null) {
            g2j = LIZ.LJLJLJ;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        Context LIZIZ = EF7.LIZIZ();
        if (C16880lQ.LLIIIZ(LIZIZ) == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        File LLIIIZ = C16880lQ.LLIIIZ(LIZIZ);
        o.LJI(LLIIIZ);
        LIZ2.append(LLIIIZ.getAbsolutePath());
        C0MT.LJ(LIZ2, File.separator, "welcome_screen_video4.mp4", LIZ2);
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ObjectAnimator objectAnimator = this.LJLJJL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.LJLJJL;
            o.LJI(objectAnimator2);
            objectAnimator2.cancel();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        G2J g2j;
        G2J g2j2;
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_SWIPE_UP_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j3 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onResume();
        this.LJLLLL = (C73411SrX) AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 11));
        this.LJLJJLL = System.currentTimeMillis();
        C12460eI.LJIIIIZZ(this, mo49getActivity());
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJL;
        } else {
            g2j2 = null;
        }
        G2E.LIZIZ(g2j2);
        G2I LIZ3 = G2E.LIZ(enumC40761FzB);
        if (LIZ3 != null) {
            g2j3 = LIZ3.LJLJLJ;
        }
        G2E.LIZIZ(g2j3);
        G2E.LIZLLL(enumC40761FzB);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (!this.LJLLL) {
            Dl("background");
        }
        super.onStop();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLLLL = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), C40884G2u.LJLIL).LJJL(T16.LIZ()).LJJJJZI(new AfS58S0100000_6(this, 10));
    }

    public final void Dl(String str) {
        AbstractC39351FcR LIZ = C38986FRu.LIZ();
        try {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("exit_method", str);
            c188727au.LJIIIZ("user_type", (String) this.LJZ.getValue());
            c188727au.LJ(System.currentTimeMillis() - this.LJLJJLL, "duration");
            c188727au.LIZLLL(LIZ.LJI, "if_send_fake_feed");
            c188727au.LJIIIZ("debuginfo", LIZ.LJII.toString());
            Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
            if (LIZIZ != null) {
                c188727au.LIZLLL(LIZIZ.intValue(), "is_ab_backend_resp_received");
            }
            c188727au.LIZLLL(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
            G2H g2h = G2H.EXIT_WELCOME_SCREEN;
            c188727au.LJIIIZ("enter_from", this.LJLJL);
            C36222EJm.LIZ(c188727au);
            Map<String, String> mobExitWelcomeScreen$lambda$7 = c188727au.LIZ;
            o.LJIIIIZZ(mobExitWelcomeScreen$lambda$7, "mobExitWelcomeScreen$lambda$7");
            V2B.LJIJ(mobExitWelcomeScreen$lambda$7);
            C36222EJm.LIZIZ(g2h, mobExitWelcomeScreen$lambda$7);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        G2J g2j;
        Integer num;
        G1X g1x;
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_SWIPE_UP_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJI;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        super.onCreate(bundle);
        C35878E6g.LIZ();
        C40765FzF c40765FzF = EnumC40761FzB.Companion;
        G0D LIZ2 = C40751Fz1.LIZ();
        if (LIZ2 != null && (g1x = (G1X) LIZ2.LIZ(G1X.class)) != null) {
            num = Integer.valueOf(g1x.c60());
        } else {
            num = null;
        }
        c40765FzF.getClass();
        this.LJLJL = C40765FzF.LIZIZ(num);
        if (C63078OpG.LIZ()) {
            C38995FSd.LIZLLL().execute(new ARunnableS42S0100000_6(this, 32));
        }
        G2I LIZ3 = G2E.LIZ(enumC40761FzB);
        if (LIZ3 != null) {
            g2j2 = LIZ3.LJLJJI;
        }
        G2E.LIZIZ(g2j2);
    }

    public final void Al(TuxTextView tuxTextView, String str) {
        if (isViewValid() && tuxTextView.getVisibility() != 0) {
            tuxTextView.setAlpha(0.0f);
            tuxTextView.setVisibility(0);
            if (str.length() > 0) {
                G2H g2h = G2H.START_WATCHING_BUTTON_SHOW;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("exit_method", str);
                c188727au.LJIIIZ("user_type", (String) this.LJZ.getValue());
                c188727au.LJ(System.currentTimeMillis() - this.LJLJJLL, "duration");
                Map<String, String> map = c188727au.LIZ;
                o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
                C36222EJm.LIZIZ(g2h, map);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxTextView, "alpha", 0.0f, 1.0f);
            this.LJLJJL = ofFloat;
            o.LJI(ofFloat);
            ofFloat.setDuration(200L);
            ObjectAnimator objectAnimator = this.LJLJJL;
            o.LJI(objectAnimator);
            objectAnimator.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        G2J g2j;
        String LIZIZ;
        int i;
        String str;
        String str2;
        float f;
        InterfaceC40755Fz5 interfaceC40755Fz5;
        C40804Fzs LJFF;
        final int i2;
        String string;
        o.LJIIIZ(view, "view");
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_SWIPE_UP_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJLL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        C56662Kg.LIZ().LIZJ("interest_swipe_fragment_view_created", false);
        super.onViewCreated(view, bundle);
        FNP.LIZ(2370);
        G2H g2h = G2H.WELCOME_SCREEN_SHOW;
        boolean z = true;
        if (C2OE.LJIIIZ == null) {
            LIZIZ = "swipe_up_guide";
        } else if (C2OE.LJIILJJIL == EnumC61772bd.PERCENTAGE) {
            List<NewUserProgressModel$Stage> list = C2OE.LJIILL;
            if (list != null) {
                LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(100 / ((Number) ListProtector.get(((NewUserProgressModel$Stage) ListProtector.get(list, 0)).range, 0)).intValue())}, 1, "watch %s videos", "format(this, *args)");
            } else {
                LIZIZ = Q8U.LIZIZ(new Object[]{20}, 1, "watch %s videos", "format(this, *args)");
            }
        } else {
            LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf((C2OF.LIZJ() * 1000) / 60000)}, 1, "watch %s minues", "format(this, *args)");
        }
        EnumC61772bd enumC61772bd = C2OE.LJIILJJIL;
        if (enumC61772bd == null) {
            i = -1;
        } else {
            i = C57722Oi.LIZ[enumC61772bd.ordinal()];
        }
        String str3 = "";
        if (i == -1) {
            str = "";
        } else if (i != 1) {
            str = "duration";
        } else {
            str = "video_count";
        }
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(C78685UuP.LJJJZ(null) ? 1 : 0, "new_copy_shown");
        c188727au.LJIIIZ("bar_type", str);
        c188727au.LJIIIZ("copy_detail", LIZIZ);
        c188727au.LJIIIZ("enter_from", this.LJLJL);
        c188727au.LJIIIZ("user_type", (String) this.LJZ.getValue());
        C36222EJm.LIZ(c188727au);
        Map<String, String> onViewCreated$lambda$3 = c188727au.LIZ;
        o.LJIIIIZZ(onViewCreated$lambda$3, "onViewCreated$lambda$3");
        V2B.LJIJ(onViewCreated$lambda$3);
        C36222EJm.LIZIZ(g2h, onViewCreated$lambda$3);
        if (a.LJIJJ().LJ(null)) {
            this.LJLJL = "consent_box";
            ITpcConsentService LJIJJ = a.LJIJJ();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            LJIJJ.LJIIIZ(mo49getActivity, "swipe_up");
        }
        TuxTextView start_watching = (TuxTextView) _$_findCachedViewById(R.id.kdu);
        o.LJIIIIZZ(start_watching, "start_watching");
        this.LJLLILLLL = start_watching;
        Context context = _$_findCachedViewById(R.id.title).getContext();
        ((TuxTextView) _$_findCachedViewById(R.id.title)).LJJJ(38.0f);
        ((TextView) _$_findCachedViewById(R.id.title)).setText(Keva.getRepo("swipe_up_repo").getString("swipe_up_title", context.getString(R.string.ip3)));
        ((TextView) _$_findCachedViewById(R.id.jjg)).setText(Keva.getRepo("swipe_up_repo").getString("swipe_up_subtitle", context.getString(R.string.rys)));
        TuxTextView tuxTextView = this.LJLLILLLL;
        if (tuxTextView != null) {
            tuxTextView.setText(context.getString(R.string.ino));
            TuxTextView title = (TuxTextView) _$_findCachedViewById(R.id.title);
            o.LJIIIIZZ(title, "title");
            C78248UnM.LJIIIIZZ(title);
            TuxTextView second_title = (TuxTextView) _$_findCachedViewById(R.id.jjg);
            o.LJIIIIZZ(second_title, "second_title");
            C78248UnM.LJIIIIZZ(second_title);
            ViewParent parent = _$_findCachedViewById(R.id.j71).getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            this.LJLLI = (View) parent;
            C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.j71), new ACListenerS26S0100000_6(this, 2));
            TuxTextView tuxTextView2 = this.LJLLILLLL;
            if (tuxTextView2 != null) {
                C16880lQ.LJIJI(tuxTextView2, new ACListenerS26S0100000_6(this, 3));
                TuxTextView nuj_nudge = (TuxTextView) _$_findCachedViewById(R.id.h8z);
                o.LJIIIIZZ(nuj_nudge, "nuj_nudge");
                this.LJLLJ = nuj_nudge;
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 == null || (str2 = mo49getActivity2.getString(R.string.dq8)) == null) {
                    str2 = "";
                }
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                if (mo49getActivity3 != null && (string = mo49getActivity3.getString(R.string.dq7, str2)) != null) {
                    str3 = string;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                int LJJLIIIJL = s.LJJLIIIJL(str3, str2, 0, false, 6);
                if (LJJLIIIJL >= 0) {
                    ActivityC45651qj mo49getActivity4 = mo49getActivity();
                    if (mo49getActivity4 != null) {
                        i2 = AnonymousClass636.LJIIIIZZ(R.attr.eb, mo49getActivity4);
                    } else {
                        i2 = -1;
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i2) { // from class: com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent$getNujNudgeText$1
                        @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            o.LJIIIZ(textPaint, "textPaint");
                            super.updateDrawState(textPaint);
                            T5S t5s = new T5S();
                            t5s.LIZ(82);
                            textPaint.setTypeface(t5s.getTypeface());
                        }
                    }, LJJLIIIJL, str2.length() + LJJLIIIJL, 34);
                }
                nuj_nudge.setText(spannableStringBuilder);
                TuxTextView tuxTextView3 = this.LJLLJ;
                if (tuxTextView3 != null) {
                    C16880lQ.LJIJI(tuxTextView3, new ACListenerS26S0100000_6(this, 4));
                    if (E56.LIZ()) {
                        TuxTextView tuxTextView4 = this.LJLLILLLL;
                        if (tuxTextView4 != null) {
                            ViewGroup.LayoutParams layoutParams = tuxTextView4.getLayoutParams();
                            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            C018905p c018905p = (C018905p) layoutParams;
                            c018905p.bottomToTop = R.id.h8z;
                            ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C7MY.LIZIZ(20);
                        } else {
                            o.LJIJI("startWatchingView");
                            throw null;
                        }
                    }
                    if (!((Boolean) DPY.LIZIZ.getValue()).booleanValue()) {
                        TuxTextView tuxTextView5 = this.LJLLILLLL;
                        if (tuxTextView5 != null) {
                            C7FC.LIZJ(tuxTextView5, 0.75f);
                            TuxTextView tuxTextView6 = this.LJLLJ;
                            if (tuxTextView6 != null) {
                                C7FC.LIZJ(tuxTextView6, 0.75f);
                                _$_findCachedViewById(R.id.j71).postDelayed(new ARunnableS42S0100000_6(this, 33), 2000L);
                            } else {
                                o.LJIJI("nujNudge");
                                throw null;
                            }
                        } else {
                            o.LJIJI("startWatchingView");
                            throw null;
                        }
                    } else {
                        TuxTextView tuxTextView7 = this.LJLLILLLL;
                        if (tuxTextView7 != null) {
                            tuxTextView7.setVisibility(0);
                            if (E56.LIZ()) {
                                TuxTextView tuxTextView8 = this.LJLLJ;
                                if (tuxTextView8 != null) {
                                    tuxTextView8.setVisibility(0);
                                } else {
                                    o.LJIJI("nujNudge");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("startWatchingView");
                            throw null;
                        }
                    }
                    this.LJLJLJ = new GestureDetector(_$_findCachedViewById(R.id.j71).getContext(), new G3E(this));
                    C35878E6g.LIZ();
                    G0D LIZ2 = C40751Fz1.LIZ();
                    if (LIZ2 != null && (interfaceC40755Fz5 = (InterfaceC40755Fz5) LIZ2.LJLILLLLZI) != null && (LJFF = interfaceC40755Fz5.LJFF()) != null && LJFF.LIZLLL) {
                        _$_findCachedViewById(R.id.j71).setOnTouchListener(new G3D(this));
                    }
                    CardView cardView = (CardView) _$_findCachedViewById(R.id.n4q);
                    o.LJII(cardView, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    cardView.setCardElevation(0.0f);
                    WidgetManager.xl(null, this, _$_findCachedViewById(R.id.n4q), getContext()).wl(_$_findCachedViewById(R.id.n4q), new WelcomeVideoWidget(this.LJLLLLLL, Integer.valueOf(this.LJLZ)));
                    int LJIIJJI = KL2.LJIIJJI(getContext());
                    float f2 = LJIIJJI;
                    if ((KL2.LJIIIZ(getContext()) * 1.0f) / f2 >= 1.7777778f) {
                        z = false;
                    }
                    Context context2 = getContext();
                    if (z) {
                        f = 300.0f;
                    } else {
                        f = 376.0f;
                    }
                    float LIZJ = KL2.LIZJ(context2, f);
                    C56K c56k = new C56K();
                    c56k.element = LIZJ;
                    if (f2 < LIZJ) {
                        c56k.element = f2;
                        _$_findCachedViewById(R.id.n4q).getLayoutParams().height = LJIIJJI;
                        _$_findCachedViewById(R.id.n4q).getLayoutParams().width = _$_findCachedViewById(R.id.n4q).getLayoutParams().height;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("video_container size:");
                        LIZ3.append(LJIIJJI);
                        C40741Fyr.LIZ(X1D.LIZIZ(LIZ3));
                    } else if (z) {
                        _$_findCachedViewById(R.id.n4q).getLayoutParams().height = (int) LIZJ;
                        _$_findCachedViewById(R.id.n4q).getLayoutParams().width = _$_findCachedViewById(R.id.n4q).getLayoutParams().height;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("video_container need adapt size:");
                        LIZ4.append(LIZJ);
                        C40741Fyr.LIZ(X1D.LIZIZ(LIZ4));
                    }
                    _$_findCachedViewById(R.id.n4q).post(new ARunnableS25S0200000_6(c56k, this, 11));
                    C56662Kg.LIZ().LJFF("interest_swipe_fragment_view_created", false);
                    boolean booleanValue = ((Boolean) C34126DaM.LIZ.getValue()).booleanValue();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("hybrid_uneven_test_experiment_swipe_up get value:");
                    LIZ5.append(booleanValue);
                    C40741Fyr.LIZIZ(X1D.LIZIZ(LIZ5));
                    C40886G2w.LIZ.getClass();
                    FFL LJIIIZ = FFL.LJIIIZ();
                    C40888G2y c40888G2y = C40886G2w.LIZIZ;
                    LJIIIZ.getClass();
                    Object LJIJI = FFL.LJIJI(true, "hybrid_test_experiment_custom_1", 31744, C40888G2y.class, c40888G2y, 1);
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("hybrid_test_experiment_custom_1 get value:");
                    LIZ6.append(LJIJI);
                    C40741Fyr.LIZIZ(X1D.LIZIZ(LIZ6));
                    G2I LIZ7 = G2E.LIZ(enumC40761FzB);
                    if (LIZ7 != null) {
                        g2j2 = LIZ7.LJLJJLL;
                    }
                    G2E.LIZIZ(g2j2);
                    return;
                }
                o.LJIJI("nujNudge");
                throw null;
            }
            o.LJIJI("startWatchingView");
            throw null;
        }
        o.LJIJI("startWatchingView");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        G2J g2j;
        View LLLLIILL;
        G2J g2j2;
        o.LJIIIZ(inflater, "inflater");
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_SWIPE_UP_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        C29S c29s = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJJL;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        C56662Kg.LIZ().LIZJ("interest_swipe_fragment_createview", false);
        if (C38874FNm.LIZ()) {
            LLLLIILL = C16970lZ.LIZJ(R.layout.bet, mo49getActivity(), viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bet, viewGroup, false);
        }
        C56662Kg.LIZ().LJFF("interest_swipe_fragment_createview", false);
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJJL;
        } else {
            g2j2 = null;
        }
        G2E.LIZIZ(g2j2);
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
