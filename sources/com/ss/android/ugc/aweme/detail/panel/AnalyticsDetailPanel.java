package com.ss.android.ugc.aweme.detail.panel;

import X.AbstractC55082Lja;
import X.C16880lQ;
import X.C221108m2;
import X.C222588oQ;
import X.C32151Nz;
import X.C45804HyK;
import X.C47261Igj;
import X.C50420Jqa;
import X.C56448MDk;
import X.C56451MDn;
import X.C61447O9r;
import X.C62822Ol8;
import X.C6M4;
import X.C6M5;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.C80253Cz;
import X.InterfaceC2302191t;
import X.InterfaceC60822a6;
import X.InterfaceC72642tA;
import X.M89;
import X.O6R;
import X.T16;
import X.X1D;
import Y.AfS50S0200000_1;
import Y.AfS53S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.model.InsightTypeRequest;
import com.ss.android.ugc.aweme.service.IAnalyticsDetailService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AnalyticsDetailPanel extends DetailFragmentPanel {
    public final C62822Ol8 LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final C73318Sq2 LLJJJJLIIL;
    public RelativeLayout LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public C56448MDk LLJLILLLLZIIL;
    public InterfaceC60822a6 LLJLL;
    public final C62822Ol8 LLJLLIL;
    public final C62822Ol8 LLJLLL;
    public final HashMap<Float, Float> LLJZ;

    public final int LLIIJLIL() {
        return ((Number) this.LLJLLL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        String str;
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.LLJJL != null) {
            return;
        }
        View seekBarFrame = this.LLFZ;
        o.LJIIIIZZ(seekBarFrame, "seekBarFrame");
        seekBarFrame.setVisibility(8);
        ViewGroup viewGroup = (ViewGroup) getFragment().getView();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        if (viewGroup != null) {
            viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        C45804HyK.LJJL(C61447O9r.LJIILJJIL - O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)), relativeLayout);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(relativeLayout.getContext()), R.layout.al4, relativeLayout, false);
        this.LLJJLIIIJLLLLLLLZ = (FrameLayout) LLLLIILL.findViewById(R.id.a1m);
        relativeLayout.addView(LLLLIILL);
        if (viewGroup != null) {
            this.LLJL = (TuxTextView) viewGroup.findViewById(R.id.a1o);
            this.LLJLIL = (TuxTextView) viewGroup.findViewById(R.id.a1n);
            C56448MDk c56448MDk = (C56448MDk) viewGroup.findViewById(R.id.n7r);
            this.LLJLILLLLZIIL = c56448MDk;
            if (c56448MDk != null) {
                c56448MDk.setDisableSeekTouch(true);
            }
        }
        this.LLJJL = relativeLayout;
        IAnalyticsDetailService iAnalyticsDetailService = (IAnalyticsDetailService) this.LLJJJIL.getValue();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C6M4 LIZIZ = iAnalyticsDetailService.LIZIZ(context);
        this.LLJLL = LIZIZ;
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.setOnPointSelectedListener(new C6M5() { // from class: X.3Cy
            @Override // X.C6M5
            public final void LIZJ() {
                C56448MDk c56448MDk2 = AnalyticsDetailPanel.this.LLJLILLLLZIIL;
                if (c56448MDk2 == null) {
                    return;
                }
                c56448MDk2.setSeekBarShowType(2);
            }

            @Override // X.C6M5
            public final void LIZ(float f) {
                AnalyticsDetailPanel.this.seekProgress(f / r1.LLIIJLIL());
                C56448MDk c56448MDk2 = AnalyticsDetailPanel.this.LLJLILLLLZIIL;
                if (c56448MDk2 != null) {
                    c56448MDk2.setProgress((f * 100) / r2.LLIIJLIL());
                }
                C56448MDk c56448MDk3 = AnalyticsDetailPanel.this.LLJLILLLLZIIL;
                if (c56448MDk3 == null) {
                    return;
                }
                c56448MDk3.setSeekBarShowType(0);
            }

            @Override // X.C6M5
            public final void LIZIZ(float f, float f2) {
                C56448MDk c56448MDk2 = AnalyticsDetailPanel.this.LLJLILLLLZIIL;
                if (c56448MDk2 != null) {
                    c56448MDk2.setProgress((100 * f) / r3.LLIIJLIL());
                }
                AnalyticsDetailPanel.this.LLIILII((int) f);
                AnalyticsDetailPanel.this.LLIIL(f2);
            }
        });
        FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout != null) {
            frameLayout.addView(LIZIZ);
        }
        String str2 = this.LLJJJJ;
        if (o.LJ(str2, "retention")) {
            str = "video_retention_rate_history_7d";
        } else if (!o.LJ(str2, "likes")) {
            return;
        } else {
            str = "video_like_distrubution_7d";
        }
        if (this.LLJJJJJIL == null) {
            return;
        }
        C78999UzT.LJFF(((IAnalyticsDetailService) this.LLJJJIL.getValue()).LIZ(C47261Igj.LJJIJ(new InsightTypeRequest(str, this.LLJJJJJIL))).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS50S0200000_1(LIZIZ, this, 1), new AfS53S0100000_1(this, 21)), this.LLJJJJLIIL);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJJJLIIL.dispose();
    }

    /* loaded from: classes2.dex */
    public static final class AnalyticsDetailViewHolder extends FullFeedVideoViewHolder {
        @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
        public final int LJLJJLL() {
            return 3;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnalyticsDetailViewHolder(C222588oQ params) {
            super(params);
            o.LJIIIZ(params, "params");
        }

        @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
        public final void LJLLLL(Aweme aweme) {
            super.LJLLLL(aweme);
            b2(true);
            Yc0(null);
        }
    }

    public final void LLIIL(float f) {
        String string;
        int i = (int) (f * 100.0f);
        String str = this.LLJJJJ;
        if (o.LJ(str, "retention")) {
            string = getContext().getString(R.string.e9g, Integer.valueOf(i));
        } else if (!o.LJ(str, "likes")) {
            return;
        } else {
            string = getContext().getString(R.string.e9e, Integer.valueOf(i));
        }
        o.LJIIIIZZ(string, "when (metric) {\n        … else -> return\n        }");
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(string);
    }

    public final void LLIILII(int i) {
        boolean z;
        boolean z2 = false;
        if (LLIIJLIL() >= 3600) {
            z = true;
        } else {
            z = false;
        }
        String LIZ = C56451MDn.LIZ(i, z);
        int LLIIJLIL = LLIIJLIL();
        if (LLIIJLIL() >= 3600) {
            z2 = true;
        }
        String LIZ2 = C56451MDn.LIZ(LLIIJLIL, z2);
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView == null) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZ);
        LIZ3.append("  /  ");
        LIZ3.append(LIZ2);
        tuxTextView.setText(X1D.LIZIZ(LIZ3));
    }

    public AnalyticsDetailPanel(Bundle bundle, M89 m89) {
        super(m89);
        String str;
        this.LLJJJIL = C221108m2.LIZIZ(C80253Cz.LJLIL);
        if (bundle != null) {
            str = bundle.getString("metrics");
        } else {
            str = null;
        }
        this.LLJJJJ = str;
        this.LLJJJJJIL = bundle != null ? bundle.getString("id") : null;
        this.LLJJJJLIIL = new C73318Sq2();
        this.LLJLLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 52));
        this.LLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 53));
        this.LLJZ = new HashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void onProgressUpdated(String str, int i) {
        super.onProgressUpdated(str, i);
        C56448MDk c56448MDk = this.LLJLILLLLZIIL;
        if (c56448MDk != null && c56448MDk.getSeekBarShowType() == 2) {
            return;
        }
        InterfaceC60822a6 interfaceC60822a6 = this.LLJLL;
        if (interfaceC60822a6 != null) {
            interfaceC60822a6.LIZ(i);
        }
        LLIILII(i);
        float f = i;
        Float f2 = this.LLJZ.get(Float.valueOf(1000.0f * f));
        if (f2 == null) {
            f2 = Float.valueOf(0.0f);
        }
        LLIIL(f2.floatValue());
        C56448MDk c56448MDk2 = this.LLJLILLLLZIIL;
        if (c56448MDk2 != null) {
            c56448MDk2.setProgress((f * 100) / LLIIJLIL());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        String str2 = this.LLJJJJ;
        if (o.LJ(str2, "retention")) {
            str = getContext().getString(R.string.e9h);
        } else if (o.LJ(str2, "likes")) {
            str = getContext().getString(R.string.e9f);
        } else {
            str = null;
        }
        LJLILLLLZI(str);
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LLJLLIL.getValue();
        if (baseScrollSwitchStateManager != null) {
            baseScrollSwitchStateManager.tv0(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final AbstractC55082Lja createFeedPagerAdapter(final Context context, final LayoutInflater inflater, final InterfaceC72642tA<C50420Jqa> listener, final Fragment fragment, final View.OnTouchListener tapTouchListener, final BaseFeedPageParams baseFeedPageParams, final InterfaceC2302191t iHandlePlay) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        return new FullFeedPagerAdapter(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay) { // from class: X.3DB
            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final String LJJIJLIJ() {
                return "analytics_detail_adapter_vh";
            }

            @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
            public final C55136LkS LJJJ() {
                return new C55136LkS(C3DC.LJLIL);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
                o.LJIIIZ(context, "context");
                o.LJIIIZ(inflater, "inflater");
                o.LJIIIZ(listener, "listener");
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(tapTouchListener, "tapTouchListener");
                o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
                o.LJIIIZ(iHandlePlay, "iHandlePlay");
            }
        };
    }
}
