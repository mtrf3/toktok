package com.ss.android.ugc.aweme.popularfeed.ui;

import X.C04330Ez;
import X.C16880lQ;
import X.C214298b3;
import X.C2K0;
import X.C2U8;
import X.C47704Ins;
import X.C47959Irz;
import X.C55026Lig;
import X.C55096Ljo;
import X.C55749LuL;
import X.C57092Lx;
import X.C61447O9r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C9BE;
import X.FMX;
import X.InterfaceC55102Lju;
import X.LZW;
import X.LZY;
import X.LZZ;
import X.OSZ;
import X.SJI;
import X.SJJ;
import X.SY4;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS45S0100000_9;
import Y.IDTListenerS118S0100000_9;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.popularfeed.panel.PopularFeedFragmentPanel;
import com.ss.android.ugc.aweme.popularfeed.vm.PopularFeedListViewModel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopularFeedToFYPAssem extends UISlotAssem implements IPopularToFYPAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLJLLL;
    public boolean LJLL;
    public final C55749LuL LJLLI;
    public PopularFeedFragmentPanel LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public int LJLLLL;
    public SY4 LJLLLLLL;
    public TuxTextView LJLZ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1941203764) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c1c;
    }

    public PopularFeedToFYPAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PopularFeedListViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 502), LZZ.INSTANCE, null);
        this.LJLLI = new C55749LuL(C47704Ins.LIZJ(this, LZW.class, null), checkSupervisorPrepared());
        this.LJLLLL = 10;
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularToFYPAssemAbility
    public final boolean LJLJLJ() {
        return ((Boolean) withState((AssemViewModel) this.LJLJLLL.getValue(), new AqS175S0100000_9(this, 191))).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularToFYPAssemAbility
    public final void LJLLL() {
        Aweme aweme;
        ILoadMoreAbility iLoadMoreAbility;
        if (this._isViewValid && this.LJLL) {
            PopularFeedFragmentPanel popularFeedFragmentPanel = this.LJLLILLLL;
            if (popularFeedFragmentPanel != null && (iLoadMoreAbility = popularFeedFragmentPanel.loadMoreAbility) != null) {
                iLoadMoreAbility.qW(false);
            }
            this.LJLL = false;
            PopularFeedFragmentPanel popularFeedFragmentPanel2 = this.LJLLILLLL;
            if (popularFeedFragmentPanel2 != null) {
                aweme = popularFeedFragmentPanel2.getCurrentAweme();
            } else {
                aweme = null;
            }
            C2U8.LIZ(new C55026Lig(1, aweme, this.LJLLILLLL, Boolean.TRUE));
            TuxTextView tuxTextView = this.LJLZ;
            if (tuxTextView != null) {
                tuxTextView.animate().setInterpolator(new SJJ()).translationYBy(C7MY.LIZIZ(10)).setDuration(200L).start();
            }
            SY4 sy4 = this.LJLLLLLL;
            if (sy4 != null) {
                sy4.animate().setInterpolator(new SJJ()).translationYBy(C7MY.LIZIZ(10)).setDuration(200L).start();
            }
            getContainerView().animate().setInterpolator(new SJI()).alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS45S0100000_9(this, 95)).start();
            getContainerView().postDelayed(LZY.LJLIL, 200L);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularToFYPAssemAbility
    public final boolean LJJLIIIJILLIZJL() {
        return this.LJLL;
    }

    public final void H3(String str) {
        FMX.LJIILL("homepage_return_guide", new OSZ("homepage_popular", "enter_from"), new OSZ(str, "action_type"));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        if (!(getContainerView() instanceof FrameLayout)) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            i = ViewConfiguration.get(context).getScaledTouchSlop();
        } else {
            i = 10;
        }
        this.LJLLLL = i;
        this.LJLLILLLL = ((LZW) this.LJLLI.getValue()).LJLIL;
        getContainerView().setOnTouchListener(new IDTListenerS118S0100000_9(this, 9));
        SY4 sy4 = (SY4) view.findViewById(R.id.auw);
        C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 292));
        ViewGroup.LayoutParams layoutParams = sy4.getLayoutParams();
        if (layoutParams != null) {
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                C57092Lx.LIZ.getClass();
                marginLayoutParams.bottomMargin = C47959Irz.LIZJ(38, C61447O9r.LIZ());
            }
        } else {
            layoutParams = null;
        }
        sy4.setLayoutParams(layoutParams);
        this.LJLLLLLL = sy4;
        this.LJLZ = (TuxTextView) view.findViewById(R.id.c7z);
        View findViewById = view.findViewById(R.id.bd0);
        if (findViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setColors(new int[]{C04330Ez.LIZIZ(view.getContext(), R.color.yi), C04330Ez.LIZIZ(view.getContext(), R.color.ey)});
            findViewById.setBackground(gradientDrawable);
        }
    }
}
