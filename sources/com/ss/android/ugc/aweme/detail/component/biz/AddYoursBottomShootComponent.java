package com.ss.android.ugc.aweme.detail.component.biz;

import X.AbstractC220518l5;
import X.ActivityC45651qj;
import X.C110614Vt;
import X.C16880lQ;
import X.C220528l6;
import X.C221018lt;
import X.C221108m2;
import X.C226388uY;
import X.C28289B8j;
import X.C2MJ;
import X.C45804HyK;
import X.C62822Ol8;
import X.C77123UOp;
import X.C78565UsT;
import X.C78598Ut0;
import X.M89;
import X.SY4;
import X.X1D;
import X.XKX;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.component.biz.AddYoursBottomShootComponent;
import com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursBottomShootComponent extends ShootButtonBottomComponent {
    public TuxTextView LJLJJLL;
    public SY4 LJLJL;
    public AbstractC220518l5 LJLJLJ;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 177));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 178));

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(new C2MJ() { // from class: X.8lU
                @Override // X.C2MJ
                public final void J8(int i) {
                }

                @Override // X.C2MJ
                public final void e(int i, boolean z) {
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.C2MJ
                public final void Ye(C2MA selectedHolder) {
                    o.LJIIIZ(selectedHolder, "selectedHolder");
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageSelected(int i) {
                    Aweme currentAweme;
                    AbstractC220518l5 LJIIIZ;
                    int i2;
                    long j;
                    AddYoursBottomShootComponent addYoursBottomShootComponent = AddYoursBottomShootComponent.this;
                    addYoursBottomShootComponent.getClass();
                    C221018lt.LJFF("AddYoursBottomShootComponent", "onPageSelected");
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) addYoursBottomShootComponent.LJLJLLL.getValue();
                    AbstractC220518l5 abstractC220518l5 = null;
                    if (iFeedPanelPlatformAbility != null && (currentAweme = iFeedPanelPlatformAbility.getCurrentAweme()) != null && (LJIIIZ = C78598Ut0.LJIIIZ(currentAweme)) != null) {
                        if (LJIIIZ instanceof C220498l3) {
                            int LIZJ = C226388uY.LIZJ(R.plurals.b2, R.plurals.b3);
                            TuxTextView tuxTextView = addYoursBottomShootComponent.LJLJJLL;
                            if (tuxTextView != null) {
                                Resources resources = tuxTextView.getResources();
                                C220498l3 c220498l3 = (C220498l3) LJIIIZ;
                                Long videoCount = c220498l3.LJ.getVideoCount();
                                if (videoCount != null) {
                                    i2 = (int) videoCount.longValue();
                                } else {
                                    i2 = 0;
                                }
                                Object[] objArr = new Object[1];
                                Long videoCount2 = c220498l3.LJ.getVideoCount();
                                if (videoCount2 != null) {
                                    j = videoCount2.longValue();
                                } else {
                                    j = 0;
                                }
                                objArr[0] = C77123UOp.LJJIIJ(j);
                                tuxTextView.setText(resources.getQuantityString(LIZJ, i2, objArr));
                            } else {
                                o.LJIJI("descTv");
                                throw null;
                            }
                        } else {
                            TuxTextView tuxTextView2 = addYoursBottomShootComponent.LJLJJLL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setText(LJIIIZ.LIZJ);
                            } else {
                                o.LJIJI("descTv");
                                throw null;
                            }
                        }
                        abstractC220518l5 = LJIIIZ;
                    }
                    addYoursBottomShootComponent.LJLJLJ = abstractC220518l5;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final int x3() {
        return C226388uY.LIZJ(R.string.bcp, R.string.bd4);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void A3(View view) {
        TuxIconView tuxIconView;
        if (view == null || (tuxIconView = (TuxIconView) view.findViewById(R.id.irc)) == null) {
            return;
        }
        tuxIconView.setIconRes(R.raw.icon_camera_fill);
        tuxIconView.setTintColorRes(R.attr.dj);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final View C3(ViewGroup viewGroup) {
        AbstractC220518l5 abstractC220518l5;
        Long addYoursVideoCount;
        Aweme currentAweme;
        View LIZ = C28289B8j.LIZ(viewGroup, R.layout.al6, viewGroup, false);
        View findViewById = LIZ.findViewById(R.id.x_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.addyours_desc_tv)");
        this.LJLJJLL = (TuxTextView) findViewById;
        View findViewById2 = LIZ.findViewById(R.id.xb);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.addyours_shoot_btn)");
        SY4 sy4 = (SY4) findViewById2;
        this.LJLJL = sy4;
        sy4.setText(C226388uY.LIZJ(R.string.bcp, R.string.bd4));
        SY4 sy42 = this.LJLJL;
        String str = null;
        if (sy42 != null) {
            sy42.setTextColorRes(R.attr.dk);
            SY4 sy43 = this.LJLJL;
            if (sy43 != null) {
                sy43.setIconTintColorRes(R.attr.dk);
                SY4 sy44 = this.LJLJL;
                if (sy44 != null) {
                    sy44.setButtonStartIcon(Integer.valueOf(R.raw.icon_camera_fill));
                    SY4 sy45 = this.LJLJL;
                    if (sy45 != null) {
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LIZJ = Float.valueOf(Float.MAX_VALUE);
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
                        Context context = viewGroup.getContext();
                        o.LJIIIIZZ(context, "parentView.context");
                        sy45.setBackground(c110614Vt.LIZ(context));
                        SY4 sy46 = this.LJLJL;
                        if (sy46 != null) {
                            C16880lQ.LJJIZ(sy46, new ACListenerS23S0100000_3(this, 34));
                            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJLLL.getValue();
                            if (iFeedPanelPlatformAbility != null && (currentAweme = iFeedPanelPlatformAbility.getCurrentAweme()) != null) {
                                abstractC220518l5 = C78598Ut0.LJIIIZ(currentAweme);
                            } else {
                                abstractC220518l5 = null;
                            }
                            this.LJLJLJ = abstractC220518l5;
                            M89 m89 = getPanelContext().LIZJ;
                            if (m89 != null && (addYoursVideoCount = m89.getAddYoursVideoCount()) != null) {
                                long longValue = addYoursVideoCount.longValue();
                                int LIZJ = C226388uY.LIZJ(R.plurals.b2, R.plurals.b3);
                                TuxTextView tuxTextView = this.LJLJJLL;
                                if (tuxTextView != null) {
                                    Resources resources = viewGroup.getContext().getResources();
                                    if (resources != null) {
                                        str = resources.getQuantityString(LIZJ, (int) longValue, C77123UOp.LJJIIJ(longValue));
                                    }
                                    tuxTextView.setText(str);
                                } else {
                                    o.LJIJI("descTv");
                                    throw null;
                                }
                            }
                            return LIZ;
                        }
                        o.LJIJI("shootBtn");
                        throw null;
                    }
                    o.LJIJI("shootBtn");
                    throw null;
                }
                o.LJIJI("shootBtn");
                throw null;
            }
            o.LJIJI("shootBtn");
            throw null;
        }
        o.LJIJI("shootBtn");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.shoot.ShootButtonBottomComponent
    public final void v3(View view) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        Aweme currentAweme;
        Context context;
        ActivityC45651qj LJJIFFI;
        LifecycleOwner LJJIIJZLJL;
        LifecycleCoroutineScope lifecycleScope;
        AbstractC220518l5 abstractC220518l5 = this.LJLJLJ;
        if (abstractC220518l5 == null || (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJLLL.getValue()) == null || (currentAweme = iFeedPanelPlatformAbility.getCurrentAweme()) == null || (context = getContext()) == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null) {
            return;
        }
        if (view != null && (LJJIIJZLJL = C78565UsT.LJJIIJZLJL(view)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIIJZLJL)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new C220528l6(abstractC220518l5, this, currentAweme, LJJIFFI, null), 3);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cannot get valid add yours for aweme, aid=");
        LIZ.append(currentAweme.getAid());
        C221018lt.LJFF("AddYoursBottomShootComponent", X1D.LIZIZ(LIZ));
    }
}
