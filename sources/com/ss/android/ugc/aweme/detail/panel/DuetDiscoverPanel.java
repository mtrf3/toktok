package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C221108m2;
import X.C55093Ljl;
import X.C55094Ljm;
import X.C61252an;
import X.C62822Ol8;
import X.C80796VnM;
import X.EnumC61812bh;
import X.KL2;
import X.LS9;
import X.M89;
import X.QD3;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.duetmode.impl.DuetDiscoverServiceImpl;
import com.ss.android.ugc.aweme.utils.Au2S16S0100000_7;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponentTemp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DuetDiscoverPanel extends DetailFragmentPanel {
    public RelativeLayout LLJJJIL;
    public final C62822Ol8 LLJJJJ;
    public boolean LLJJJJJIL;
    public final long LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final boolean shouldShowSeekBar() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        ViewGroup viewGroup;
        View LLLLIILL;
        int i;
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.LLJJJIL != null || (viewGroup = (ViewGroup) this.LLFII) == null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        int i2 = 0;
        if (this.param.isFromDuetMode()) {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.al9, relativeLayout, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.al_, relativeLayout, false);
        }
        View findViewById = LLLLIILL.findViewById(R.id.ap4);
        if (findViewById != null) {
            TuxTextView tuxTextView = (TuxTextView) findViewById.findViewById(R.id.irx);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(32);
                if (this.param.isFromDuetModeDetail()) {
                    i = R.string.f07;
                } else {
                    i = R.string.cft;
                }
                tuxTextView.setText(i);
            }
            C16880lQ.LJIIJ(new Au2S16S0100000_7(this, this.LLJJJJLIIL, 0), findViewById);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (!this.param.isFromDuetModeDetail()) {
            i2 = (int) KL2.LIZJ(relativeLayout.getContext(), 40.0f);
        }
        layoutParams.bottomMargin = i2;
        relativeLayout.addView(LLLLIILL, layoutParams);
        this.LLJJJIL = relativeLayout;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean LJJJLZIJ() {
        if (o.LJ(DuetDiscoverServiceImpl.LIZLLL().LIZIZ(), "full_screen")) {
            if (!this.LLJJJJJIL) {
                return true;
            }
            return false;
        }
        return super.LJJJLZIJ();
    }

    public final String LLIIJLIL() {
        if (TextUtils.equals(getFrom(), "from_duet_mode")) {
            return "duet";
        }
        if (TextUtils.equals(getFrom(), "from_duet_mode_detail")) {
            return "original";
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public final void initPanel() {
        super.initPanel();
        ScreenAdaptionComponentTemp screenAdaptionComponentTemp = this.mScreenAdaptionComponentTemp;
        if (screenAdaptionComponentTemp != null) {
            screenAdaptionComponentTemp.d40();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51688KQi, X.KRB
    public final void onResume() {
        super.onResume();
        if (LJJJLZIJ() && this.param.isFromDuetMode() && !this.LLJJJJJIL) {
            pausePlayer();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void showStrengthenGuide() {
        if (!isMockPopup() && !((C55093Ljl) this.LLJJJJ.getValue()).LIZ.getBoolean("duet_mode_swipe_guide_shown", false)) {
            showStrengthenGuideInternal();
            ((C55093Ljl) this.LLJJJJ.getValue()).LIZ.storeBoolean("duet_mode_swipe_guide_shown", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.IDR
    public final void showStrengthenGuideInternal() {
        C80796VnM c80796VnM;
        if (isMockPopup() || (c80796VnM = this.mViewPager) == null || c80796VnM.getChildCount() == 0) {
            return;
        }
        if (this.swipeUpGuide == null) {
            ViewGroup viewGroup = (ViewGroup) this.LLFII;
            if (viewGroup == null) {
                return;
            }
            C80796VnM mViewPager = this.mViewPager;
            o.LJIIIIZZ(mViewPager, "mViewPager");
            String swipeUpStrengthenResource = this.swipeUpStrengthenResource;
            o.LJIIIIZZ(swipeUpStrengthenResource, "swipeUpStrengthenResource");
            TextUtils.equals(getEventType(), "homepage_hot");
            this.swipeUpGuide = new LS9(viewGroup, mViewPager, swipeUpStrengthenResource, null, true, EnumC61812bh.SWIPE_UP_GUIDE);
        }
        LS9 ls9 = this.swipeUpGuide;
        if (ls9 == null) {
            return;
        }
        ls9.LJIILLIIL();
    }

    public DuetDiscoverPanel(M89 m89) {
        super(m89);
        this.LLJJJJ = C221108m2.LIZIZ(C55094Ljm.LJLIL);
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = 2000L;
    }

    @QD3
    public final void DuetTabSelectChanged(C61252an event) {
        o.LJIIIZ(event, "event");
        boolean z = event.LJLIL;
        this.LLJJJJJIL = z;
        if (z) {
            tryResumePlay();
        } else {
            if (z) {
                return;
            }
            stopPlayer();
        }
    }
}
