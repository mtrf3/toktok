package Y;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C223338pd;
import X.C37250Eje;
import X.C48783JCp;
import X.C48813JDt;
import X.C50191Jmt;
import X.C50321Joz;
import X.C50440Jqu;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50676Jui;
import X.C50937Jyv;
import X.C73969T1h;
import X.EnumC48779JCl;
import X.F42;
import X.InterfaceC64592gB;
import X.JE0;
import X.JE2;
import X.JE9;
import X.NIP;
import X.T16;
import X.V1B;
import X.X1D;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.LayoutSwitcherAssem;
import com.ss.android.ugc.aweme.vision.PhotoSearchFragment;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AObserverS72S0200000_8 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            ((View) aObserverS72S0200000_8.l0).setVisibility(0);
            ((NIP) ((LayoutSwitcherAssem) aObserverS72S0200000_8.l1).LJLZ.getValue()).LJIIIIZZ(true);
        } else {
            ((View) aObserverS72S0200000_8.l0).setVisibility(8);
            ((NIP) ((LayoutSwitcherAssem) aObserverS72S0200000_8.l1).LJLZ.getValue()).LJIIIIZZ(false);
        }
    }

    public static final void onChanged$1(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        String str;
        Object obj2 = ((Map) obj).get("keyword");
        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
            str = "";
        }
        C50191Jmt.LIZ((RecyclerView) aObserverS72S0200000_8.l0, (ViewGroup) aObserverS72S0200000_8.l1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$10(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        Integer num;
        float intValue;
        Boolean isHeaderHideT = (Boolean) obj;
        SearchFragment searchFragment = (SearchFragment) aObserverS72S0200000_8.l0;
        o.LJIIIIZZ(isHeaderHideT, "isHeaderHideT");
        if (isHeaderHideT.booleanValue() || (num = (Integer) ((SearchContainerHeaderVM) aObserverS72S0200000_8.l1).LJLLJ.getValue()) == null) {
            intValue = 0.0f;
        } else {
            intValue = num.intValue();
        }
        searchFragment.sn(intValue);
    }

    public static final void onChanged$2(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        Boolean isRefreshing = (Boolean) obj;
        RecyclerView recyclerView = (RecyclerView) aObserverS72S0200000_8.l0;
        o.LJIIIIZZ(isRefreshing, "isRefreshing");
        recyclerView.suppressLayout(isRefreshing.booleanValue());
        if (isRefreshing.booleanValue()) {
            C50191Jmt.LIZJ((ViewGroup) aObserverS72S0200000_8.l1);
        }
    }

    public static final void onChanged$3(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        String str;
        PhotoSearchToolsEnterParams toolsParams;
        PhotoSearchViewModel photoSearchViewModel = ((PhotoSearchFragment) aObserverS72S0200000_8.l0).LJLJLJ;
        if (photoSearchViewModel != null) {
            PhotoSearchEnterParams photoSearchEnterParams = photoSearchViewModel.LJLILLLLZI;
            if (photoSearchEnterParams == null || (toolsParams = photoSearchEnterParams.getToolsParams()) == null || (str = toolsParams.getLocalFilePath()) == null) {
                str = "";
            }
            AbstractC73672Svk.LJIIJ(new IDuS80S0200000_11(((PhotoSearchFragment) aObserverS72S0200000_8.l0).getContext(), UriProtector.parse(C37250Eje.LIZ(str)), 1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0200000_8((PhotoSearchFragment) aObserverS72S0200000_8.l0, (ActivityC45651qj) aObserverS72S0200000_8.l1, 5), new InterfaceC64592gB() { // from class: X.9Fn
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                }
            });
        }
    }

    public static final void onChanged$4(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        int i;
        F42 f42 = (F42) obj;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        Fragment fragment = (Fragment) aObserverS72S0200000_8.l0;
        c50651JuJ.getClass();
        C50321Joz LJ = C50651JuJ.LJ(fragment);
        if (LJ != null) {
            i = LJ.getTabIndex();
        } else {
            i = 0;
        }
        if (!o.LJ(f42.LIZ, C50676Jui.LIZ(i)) || !f42.LIZIZ || C50440Jqu.LIZ()) {
            return;
        }
        C50937Jyv c50937Jyv = (C50937Jyv) aObserverS72S0200000_8.l1;
        c50937Jyv.LJLJJI = true;
        c50937Jyv.LJFF((Fragment) aObserverS72S0200000_8.l0);
    }

    public static final void onChanged$5(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        Boolean hasFocus = (Boolean) obj;
        o.LJIIIIZZ(hasFocus, "hasFocus");
        if (hasFocus.booleanValue()) {
            ((C50937Jyv) aObserverS72S0200000_8.l0).LJII((Fragment) aObserverS72S0200000_8.l1);
        }
    }

    public static final void onChanged$6(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((C50937Jyv) aObserverS72S0200000_8.l0).LJII((Fragment) aObserverS72S0200000_8.l1);
        }
    }

    public static final void onChanged$7(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        JE0 je0 = (JE0) obj;
        if (je0 != null) {
            ((View) aObserverS72S0200000_8.l0).postDelayed(new ARunnableS27S0200000_8(je0, (JE2) aObserverS72S0200000_8.l1, 78), 400L);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    public static final void onChanged$8(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        int i;
        ColorDrawable colorDrawable;
        int i2;
        EnumC48779JCl it = (EnumC48779JCl) obj;
        if (it == null) {
            i = -1;
        } else {
            i = C48783JCp.LIZ[it.ordinal()];
        }
        switch (i) {
            case 1:
                View view = ((JE9) aObserverS72S0200000_8.l0).LJLL;
                if (view != null) {
                    view.setVisibility(4);
                    ViewGroup viewGroup = ((JE9) aObserverS72S0200000_8.l0).LJLJJLL;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                        JE9 je9 = (JE9) aObserverS72S0200000_8.l0;
                        o.LJIIIIZZ(it, "it");
                        je9.getClass();
                        return;
                    }
                    o.LJIJI("commonStatusView");
                    throw null;
                }
                o.LJIJI("transitionLayer");
                throw null;
            case 2:
                JE9 je92 = (JE9) aObserverS72S0200000_8.l0;
                C223338pd c223338pd = je92.LJLJLLL;
                if (c223338pd != null) {
                    c223338pd.setVisibility(8);
                    TuxIconView tuxIconView = je92.LJLJL;
                    if (tuxIconView != null) {
                        tuxIconView.setVisibility(0);
                        tuxIconView.setIconRes(R.raw.icon_large_refresh);
                        tuxIconView.setTintColorRes(R.attr.dl);
                        TuxTextView tuxTextView = je92.LJLJLJ;
                        if (tuxTextView != null) {
                            tuxTextView.setVisibility(0);
                            C48813JDt value = ((PipFeedWindowVM) je92.LJLLILLLL.getValue()).LJLIL.getValue();
                            if (value != null && value.LIZIZ) {
                                i2 = R.string.im9;
                            } else {
                                i2 = R.string.dtn;
                            }
                            tuxTextView.setText(je92.LJIIIZ(i2));
                            tuxTextView.setTextColorRes(R.attr.dk);
                            ViewGroup viewGroup2 = je92.LJLJJLL;
                            if (viewGroup2 != null) {
                                viewGroup2.setBackground(new ColorDrawable(je92.LJII(R.attr.d4)));
                                je92.LJIILLIIL();
                                je92.LJIILL();
                                JE9 je93 = (JE9) aObserverS72S0200000_8.l0;
                                o.LJIIIIZZ(it, "it");
                                je93.getClass();
                                return;
                            }
                            o.LJIJI("commonStatusView");
                            throw null;
                        }
                        o.LJIJI("commonStatusViewPrompt");
                        throw null;
                    }
                    o.LJIJI("commonStatusViewIcon");
                    throw null;
                }
                o.LJIJI("dualBallView");
                throw null;
            case 3:
            case 4:
                ((View) aObserverS72S0200000_8.l1).setVisibility(0);
                ViewGroup viewGroup3 = ((JE9) aObserverS72S0200000_8.l0).LJLJJLL;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    C223338pd c223338pd2 = ((JE9) aObserverS72S0200000_8.l0).LJLJLLL;
                    if (c223338pd2 != null) {
                        c223338pd2.setVisibility(0);
                        TuxIconView tuxIconView2 = ((JE9) aObserverS72S0200000_8.l0).LJLJL;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setVisibility(8);
                            TuxTextView tuxTextView2 = ((JE9) aObserverS72S0200000_8.l0).LJLJLJ;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setVisibility(8);
                                ViewGroup viewGroup4 = ((JE9) aObserverS72S0200000_8.l0).LJLJJLL;
                                if (viewGroup4 != null) {
                                    if (it == EnumC48779JCl.LOADING_BLACKOUT) {
                                        colorDrawable = new ColorDrawable(((JE9) aObserverS72S0200000_8.l0).LJII(R.attr.d4));
                                    } else {
                                        colorDrawable = null;
                                    }
                                    viewGroup4.setBackground(colorDrawable);
                                    C223338pd c223338pd3 = ((JE9) aObserverS72S0200000_8.l0).LJLJLLL;
                                    if (c223338pd3 != null) {
                                        c223338pd3.LIZIZ();
                                        JE9 je932 = (JE9) aObserverS72S0200000_8.l0;
                                        o.LJIIIIZZ(it, "it");
                                        je932.getClass();
                                        return;
                                    }
                                    o.LJIJI("dualBallView");
                                    throw null;
                                }
                                o.LJIJI("commonStatusView");
                                throw null;
                            }
                            o.LJIJI("commonStatusViewPrompt");
                            throw null;
                        }
                        o.LJIJI("commonStatusViewIcon");
                        throw null;
                    }
                    o.LJIJI("dualBallView");
                    throw null;
                }
                o.LJIJI("commonStatusView");
                throw null;
            case 5:
                JE9 je94 = (JE9) aObserverS72S0200000_8.l0;
                C223338pd c223338pd4 = je94.LJLJLLL;
                if (c223338pd4 != null) {
                    c223338pd4.setVisibility(8);
                    TuxIconView tuxIconView3 = je94.LJLJL;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setVisibility(0);
                        tuxIconView3.setIconRes(R.raw.icon_2pt_hourglass);
                        tuxIconView3.setTintColorRes(R.attr.gu);
                        ViewGroup viewGroup5 = je94.LJLJJLL;
                        if (viewGroup5 != null) {
                            viewGroup5.setBackground(new ColorDrawable(je94.LJII(R.attr.cl)));
                            TuxTextView tuxTextView3 = je94.LJLJLJ;
                            if (tuxTextView3 != null) {
                                tuxTextView3.setVisibility(0);
                                tuxTextView3.setText(je94.LJIIIZ(R.string.jml));
                                tuxTextView3.setTextColorRes(R.attr.go);
                                je94.LJIILLIIL();
                                je94.LJIILL();
                                JE9 je9322 = (JE9) aObserverS72S0200000_8.l0;
                                o.LJIIIIZZ(it, "it");
                                je9322.getClass();
                                return;
                            }
                            o.LJIJI("commonStatusViewPrompt");
                            throw null;
                        }
                        o.LJIJI("commonStatusView");
                        throw null;
                    }
                    o.LJIJI("commonStatusViewIcon");
                    throw null;
                }
                o.LJIJI("dualBallView");
                throw null;
            case 6:
                JE9 je95 = (JE9) aObserverS72S0200000_8.l0;
                View view2 = je95.LJLL;
                if (view2 != null) {
                    view2.setVisibility(0);
                    ViewGroup viewGroup6 = je95.LJLJJLL;
                    if (viewGroup6 != null) {
                        viewGroup6.setVisibility(8);
                        View view3 = je95.LJLL;
                        if (view3 != null) {
                            view3.setAlpha(0.0f);
                            AnimatorSet animatorSet = new AnimatorSet();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.setDuration(100L);
                            ofFloat.setInterpolator(new LinearInterpolator());
                            ofFloat.addUpdateListener(new AUListenerS96S0100000_8(je95, 7));
                            AnimatorSet.Builder play = animatorSet.play(ofFloat);
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.setDuration(100L);
                            ofFloat2.setInterpolator(new LinearInterpolator());
                            ofFloat2.addUpdateListener(new AUListenerS96S0100000_8(je95, 8));
                            ofFloat2.addListener(new ALAdapterS6S0100000_8(je95, 9));
                            play.before(ofFloat2);
                            animatorSet.start();
                            JE9 je93222 = (JE9) aObserverS72S0200000_8.l0;
                            o.LJIIIIZZ(it, "it");
                            je93222.getClass();
                            return;
                        }
                        o.LJIJI("transitionLayer");
                        throw null;
                    }
                    o.LJIJI("commonStatusView");
                    throw null;
                }
                o.LJIJI("transitionLayer");
                throw null;
            default:
                JE9 je932222 = (JE9) aObserverS72S0200000_8.l0;
                o.LJIIIIZZ(it, "it");
                je932222.getClass();
                return;
        }
    }

    public static final void onChanged$9(AObserverS72S0200000_8 aObserverS72S0200000_8, Object obj) {
        float f;
        Integer num = (Integer) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mRecyclerView.setPaddingTop = ");
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (num != null) {
            SearchFragment searchFragment = (SearchFragment) aObserverS72S0200000_8.l0;
            SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) aObserverS72S0200000_8.l1;
            int intValue = num.intValue();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("rvTopPadding = ");
            LIZ2.append(intValue);
            X1D.LIZIZ(LIZ2);
            V1B.LJLLI(intValue, searchFragment.Zl());
            searchFragment.dn();
            if (o.LJ(searchContainerHeaderVM.LJZL.getValue(), Boolean.TRUE)) {
                f = 0.0f;
            } else {
                f = intValue;
            }
            searchFragment.sn(f);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS72S0200000_8(androidx.fragment.app.Fragment r2, X.C50937Jyv r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS72S0200000_8.<init>(androidx.fragment.app.Fragment, X.Jyv, int):void");
    }

    public AObserverS72S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
