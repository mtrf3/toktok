package com.bytedance.android.livesdk.impl.revenue.subscription.emoji;

import X.B9K;
import X.C0P2;
import X.C15G;
import X.C16880lQ;
import X.C28507BGt;
import X.C31071Jv;
import X.C38995FSd;
import X.C47121t6;
import X.C72818Shy;
import X.C73989T2b;
import X.C76052yf;
import X.C76952UIa;
import X.C76954UIc;
import X.C79057V0z;
import X.C80664VlE;
import X.T2R;
import X.T2Y;
import X.UIZ;
import X.VWJ;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS33S0100000_13;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS32S0200000_13;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.emoji.BadgeIcon;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.api.revenue.subscription.ILiveSubscribeEmojiInputDialog;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LiveSubscribeEmojiInputDialog extends ILiveSubscribeEmojiInputDialog implements C15G, T2Y {
    public static final /* synthetic */ int LJLLI = 0;
    public MeasureLinearLayout LJLILLLLZI;
    public C76954UIc LJLJJI;
    public T2Y LJLJJLL;
    public C31071Jv LJLJL;
    public boolean LJLJLJ;
    public Map<String, ? extends Object> LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public UIZ LJLJI = UIZ.PANEL;
    public final C73989T2b LJLJJL = new C73989T2b(this);

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ILiveSubscribeEmojiInputDialog, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ILiveSubscribeEmojiInputDialog, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ILiveSubscribeEmojiInputDialog
    public final void wl() {
        this.LJLJLJ = true;
    }

    @Override // X.T2Y
    public final void V3() {
        T2Y t2y = this.LJLJJLL;
        if (t2y != null) {
            t2y.V3();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d4u);
        c28507BGt.LIZJ = R.style.ad0;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ILiveSubscribeEmojiInputDialog
    public final void vl() {
        LiveEditText liveEditText;
        MeasureLinearLayout measureLinearLayout = this.LJLILLLLZI;
        if (measureLinearLayout != null) {
            measureLinearLayout.setVisibility(8);
        }
        this.LJLJI = UIZ.CLOSE;
        View view = getView();
        if (view != null && (liveEditText = (LiveEditText) view.findViewById(R.id.eop)) != null) {
            C79057V0z.LJJIIJZLJL(getContext(), liveEditText);
        }
        try {
            dismiss();
        } catch (Exception unused) {
        }
    }

    public final void Dl() {
        C31071Jv c31071Jv;
        if (getView() == null || (c31071Jv = this.LJLJL) == null) {
            return;
        }
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS32S0200000_13(this, c31071Jv, 33));
        }
        View view2 = getView();
        if (view2 != null) {
            view2.post(new ARunnableS32S0200000_13(this, c31071Jv, 34));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "subscription_badge_keyboard_close_success"));
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ILiveSubscribeEmojiInputDialog
    public final void Al(Map<String, ? extends Object> logInfo) {
        o.LJIIIZ(logInfo, "logInfo");
        this.LJLJLLL = logInfo;
        C76954UIc c76954UIc = this.LJLJJI;
        if (c76954UIc != null) {
            c76954UIc.LIZLLL = logInfo;
        }
    }

    @Override // X.InterfaceC61975OTz
    public final void We(C31071Jv c31071Jv) {
        this.LJLJL = c31071Jv;
        Dl();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void onDialogCreated(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDialogCreated(dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(19);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.addFlags(32);
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.subscription.ILiveSubscribeEmojiInputDialog
    public final void xl(T2R t2r) {
        this.LJLJJLL = t2r;
    }

    @Override // X.T2Y
    public final void F8(Context context, String str) {
        T2Y t2y = this.LJLJJLL;
        if (t2y != null) {
            t2y.F8(context, str);
        }
    }

    @Override // X.C15G
    public final void LLILLL(int i, boolean z) {
        LiveIconView liveIconView;
        View findViewById;
        View findViewById2;
        ViewGroup.LayoutParams layoutParams;
        View findViewById3;
        LiveIconView liveIconView2;
        View findViewById4;
        View findViewById5;
        ViewGroup.LayoutParams layoutParams2;
        View findViewById6;
        View view = null;
        if (z) {
            this.LJLJI = UIZ.KEYBOARD;
            View view2 = getView();
            if (view2 != null && (findViewById5 = view2.findViewById(R.id.cui)) != null && (layoutParams2 = findViewById5.getLayoutParams()) != null) {
                layoutParams2.height = i;
                View view3 = getView();
                if (view3 != null && (findViewById6 = view3.findViewById(R.id.cui)) != null) {
                    findViewById6.setLayoutParams(layoutParams2);
                }
            }
            View view4 = getView();
            if (view4 != null) {
                view = view4.findViewById(R.id.kyj);
            }
            if (view != null) {
                view.setVisibility(8);
            }
            View view5 = getView();
            if (view5 != null && (findViewById4 = view5.findViewById(R.id.kyf)) != null) {
                findViewById4.setVisibility(8);
            }
            View view6 = getView();
            if (view6 != null && (liveIconView2 = (LiveIconView) view6.findViewById(R.id.eoz)) != null) {
                liveIconView2.setIcon(R.drawable.d2q);
                return;
            }
            return;
        }
        this.LJLJI = UIZ.PANEL;
        View view7 = getView();
        if (view7 != null && (findViewById2 = view7.findViewById(R.id.cui)) != null && (layoutParams = findViewById2.getLayoutParams()) != null) {
            layoutParams.height = (int) B9K.LIZ(getContext(), 275.0f);
            View view8 = getView();
            if (view8 != null && (findViewById3 = view8.findViewById(R.id.cui)) != null) {
                findViewById3.setLayoutParams(layoutParams);
            }
        }
        View view9 = getView();
        if (view9 != null) {
            view = view9.findViewById(R.id.kyj);
        }
        if (view != null) {
            view.setVisibility(0);
        }
        View view10 = getView();
        if (view10 != null && (findViewById = view10.findViewById(R.id.kyf)) != null) {
            findViewById.setVisibility(0);
        }
        View view11 = getView();
        if (view11 == null || (liveIconView = (LiveIconView) view11.findViewById(R.id.eoz)) == null) {
            return;
        }
        liveIconView.setIconAttr(R.attr.aty);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) view.findViewById(R.id.bs8);
        this.LJLILLLLZI = measureLinearLayout;
        if (measureLinearLayout != null) {
            measureLinearLayout.setWindowInsetsEnable(true);
        }
        MeasureLinearLayout measureLinearLayout2 = this.LJLILLLLZI;
        if (measureLinearLayout2 != null) {
            measureLinearLayout2.setWindowInsetsKeyboardObserver(this);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C0P2.LIZ(window);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
        C80664VlE c80664VlE = (C80664VlE) view.findViewById(R.id.kyj);
        o.LJIIIIZZ(c80664VlE, "view.tab_emoji");
        VWJ vwj = (VWJ) view.findViewById(R.id.cuw);
        o.LJIIIIZZ(vwj, "view.emoji_view_pager");
        C76954UIc c76954UIc = new C76954UIc(c80664VlE, vwj, this);
        this.LJLJJI = c76954UIc;
        Map<String, ? extends Object> map = this.LJLJLLL;
        if (map != null) {
            c76954UIc.LIZLLL = map;
        }
        ((C80664VlE) view.findViewById(R.id.kyj)).LJIILLIIL((ViewPager) view.findViewById(R.id.cuw), false, false);
        ((ViewPager) view.findViewById(R.id.cuw)).setAdapter(this.LJLJJL);
        ((ViewPager) view.findViewById(R.id.cuw)).setOffscreenPageLimit(3);
        C16880lQ.LJJII((LiveIconView) view.findViewById(R.id.eoz), new ACListenerS33S0100000_13(this, 76));
        view.findViewById(R.id.nbu).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(this, 77)));
        C16880lQ.LJJIIZ((C47121t6) view.findViewById(R.id.cu6), new ACListenerS33S0100000_13(this, 78));
        ((TextView) view.findViewById(R.id.eop)).addTextChangedListener(new C76952UIa(this, view));
        if (this.LJLJLJ) {
            Context context = getContext();
            if (context != null) {
                C38995FSd.LIZIZ().submit(new ARunnableS29S0200000_10(context, this, 2));
                return;
            }
            return;
        }
        Dl();
    }

    @Override // X.T2Y
    public final void ca(Context context, BadgeIcon badgeIcon, BadgeIconTab badgeIconTab) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(badgeIcon, "badgeIcon");
        T2Y t2y = this.LJLJJLL;
        if (t2y != null) {
            t2y.ca(context, badgeIcon, badgeIconTab);
        }
    }
}
