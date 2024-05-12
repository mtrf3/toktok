package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub;

import X.C214298b3;
import X.C32151Nz;
import X.C50194Jmw;
import X.C50264Jo4;
import X.C50266Jo6;
import X.C50269Jo9;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76732zl;
import X.C78926UyI;
import X.C7MY;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.O6R;
import X.TBT;
import Y.AUListenerS90S0100000_1;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchHubHeaderComponent extends UISlotAssem {
    public static final int LJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT)));
    public static final int LJLLI = C7MY.LIZIZ(92);
    public static final int LJLLILLLL = C7MY.LIZIZ(48);
    public final C214298b3 LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cgc;
    }

    public SearchHubHeaderComponent() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchHubHeaderVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 309), C50266Jo6.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS174S0100000_8(this, 107));
        if (C50269Jo9.LIZ()) {
            x3().findViewById(R.id.bd2).setVisibility(8);
            return;
        }
        View findViewById = x3().findViewById(R.id.dh6);
        LinearLayout linearLayout = (LinearLayout) x3().findViewById(R.id.g6n);
        TuxTextView tuxTextView = (TuxTextView) x3().findViewById(R.id.mo6);
        LinearLayout linearLayout2 = (LinearLayout) x3().findViewById(R.id.g6g);
        TuxTextView tuxTextView2 = (TuxTextView) x3().findViewById(R.id.mlu);
        FrameLayout frameLayout = (FrameLayout) x3().findViewById(R.id.dfi);
        TuxTextView tuxTextView3 = (TuxTextView) x3().findViewById(R.id.mc9);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Jo7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C50201Jn3) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(tuxTextView, 50), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Jo8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C50201Jn3) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(tuxTextView2, UserLevelGeckoUpdateSetting.DEFAULT), 6);
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = -1;
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.JnI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C50201Jn3) obj).LJLJJLL);
            }
        }, null, new C50264Jo4(c76732zl, this, findViewById, linearLayout, linearLayout2, frameLayout, tuxTextView3), 6);
    }

    public static void H3(View view, float f, boolean z) {
        if (view.getAlpha() == f) {
            return;
        }
        if (!z) {
            view.setAlpha(f);
            return;
        }
        ValueAnimator animateAlpha$lambda$2 = ValueAnimator.ofFloat(view.getAlpha(), f);
        o.LJIIIIZZ(animateAlpha$lambda$2, "animateAlpha$lambda$2");
        C50194Jmw.LIZ(animateAlpha$lambda$2);
        animateAlpha$lambda$2.addUpdateListener(new AUListenerS90S0100000_1(view, 25));
        animateAlpha$lambda$2.start();
    }

    public static void I3(View view, int i, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || (i2 = marginLayoutParams.topMargin) == i) {
            return;
        }
        if (!z) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = i;
                view.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ValueAnimator animateTopMargin$lambda$1 = ValueAnimator.ofInt(i2, i);
        o.LJIIIIZZ(animateTopMargin$lambda$1, "animateTopMargin$lambda$1");
        C50194Jmw.LIZ(animateTopMargin$lambda$1);
        animateTopMargin$lambda$1.addUpdateListener(new AUListenerS90S0100000_1(view, 26));
        animateTopMargin$lambda$1.start();
    }
}
