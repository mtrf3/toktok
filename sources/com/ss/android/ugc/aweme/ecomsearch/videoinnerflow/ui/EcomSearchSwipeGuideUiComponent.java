package com.ss.android.ugc.aweme.ecomsearch.videoinnerflow.ui;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C2MJ;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.C77869UhF;
import X.C80796VnM;
import X.C84193Sd;
import X.EnumC221088m0;
import X.JAK;
import X.KU4;
import Y.ARunnableS20S0200000_1;
import Y.IDTListenerS111S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecomsearch.videoinnerflow.ui.EcomSearchSwipeGuideUiComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcomSearchSwipeGuideUiComponent extends BasePanelUIComponent {
    public final C5H3 LJLJJI;
    public ScrollSwitchStateManager LJLJJL;
    public SwipeUpGuideStrengthenLayout LJLJJLL;
    public C77869UhF LJLJL;
    public boolean LJLJLJ;
    public Aweme LJLJLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomSearchSwipeGuideUiComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS151S0100000_1((KU4) this, 54), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS58S0110000_1(false, (KU4) this, 1));
        }
        this.LJLJJI = c62822Ol8;
        this.LJLJLJ = true;
    }

    public final void dismiss() {
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LJLJJLL;
        if (swipeUpGuideStrengthenLayout != null) {
            swipeUpGuideStrengthenLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS20S0200000_1(this, swipeUpGuideStrengthenLayout, 8)).start();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJJL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.tv0(true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C77869UhF c77869UhF = this.LJLJL;
        if (c77869UhF != null) {
            c77869UhF.cancelAnimation();
        }
        this.LJLJL = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C80796VnM c80796VnM;
        IViewPagerComponentAbility viewPagerComponentAbility;
        IViewPagerComponentAbility viewPagerComponentAbility2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJJI.getValue();
            if (iFeedPanelPlatformAbility != null && (viewPagerComponentAbility2 = iFeedPanelPlatformAbility.getViewPagerComponentAbility()) != null) {
                viewPagerComponentAbility2.De0(new C2MJ() { // from class: X.2jl
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
                        boolean z;
                        String str;
                        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout;
                        String str2;
                        AnchorCustomData anchorCustomData;
                        String str3;
                        AnchorCustomData anchorCustomData2;
                        AnchorCustomData anchorCustomData3;
                        AnchorCustomData anchorCustomData4;
                        String pageName;
                        HashMap<String, String> mobParams;
                        EcomSearchSwipeGuideUiComponent ecomSearchSwipeGuideUiComponent = EcomSearchSwipeGuideUiComponent.this;
                        if (!ecomSearchSwipeGuideUiComponent.LJLJLJ) {
                            SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout2 = ecomSearchSwipeGuideUiComponent.LJLJJLL;
                            if (swipeUpGuideStrengthenLayout2 != null && swipeUpGuideStrengthenLayout2.getVisibility() == 0) {
                                EcomSearchSwipeGuideUiComponent.this.dismiss();
                            }
                            Aweme aweme = EcomSearchSwipeGuideUiComponent.this.LJLJLLL;
                            if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
                                mobParams.put("action_type", "draw");
                            }
                        } else {
                            M89 m89 = ecomSearchSwipeGuideUiComponent.getPanelContext().LIZJ;
                            if (m89 != null && (anchorCustomData4 = m89.getAnchorCustomData()) != null && (pageName = anchorCustomData4.getPageName()) != null && C78685UuP.LJJJZ(pageName)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Aweme aweme2 = null;
                            if (z) {
                                Keva keva = C66822jm.LIZ;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("search_invoke_inner_flow_guide_");
                                M89 m892 = ecomSearchSwipeGuideUiComponent.getPanelContext().LIZJ;
                                if (m892 != null && (anchorCustomData3 = m892.getAnchorCustomData()) != null) {
                                    str = anchorCustomData3.getPageName();
                                } else {
                                    str = null;
                                }
                                LIZ2.append(str);
                                if (C79057V0z.LJIJ(keva, X1D.LIZIZ(LIZ2), true) && ((swipeUpGuideStrengthenLayout = ecomSearchSwipeGuideUiComponent.LJLJJLL) == null || swipeUpGuideStrengthenLayout.getVisibility() != 0)) {
                                    SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout3 = ecomSearchSwipeGuideUiComponent.LJLJJLL;
                                    if (swipeUpGuideStrengthenLayout3 != null) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("search_invoke_inner_flow_guide_");
                                        M89 m893 = ecomSearchSwipeGuideUiComponent.getPanelContext().LIZJ;
                                        if (m893 != null && (anchorCustomData2 = m893.getAnchorCustomData()) != null) {
                                            str3 = anchorCustomData2.getPageName();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        C79057V0z.LJJJJJL(keva, X1D.LIZIZ(LIZ3), false);
                                        C45804HyK.LJJLL(swipeUpGuideStrengthenLayout3);
                                        swipeUpGuideStrengthenLayout3.setAlpha(0.0f);
                                        swipeUpGuideStrengthenLayout3.animate().alpha(1.0f).setDuration(300L).withEndAction(new ARunnableS20S0200000_1(ecomSearchSwipeGuideUiComponent, swipeUpGuideStrengthenLayout3, 42)).start();
                                    }
                                    ScrollSwitchStateManager scrollSwitchStateManager = ecomSearchSwipeGuideUiComponent.LJLJJL;
                                    if (scrollSwitchStateManager != null) {
                                        scrollSwitchStateManager.tv0(false);
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    M89 m894 = ecomSearchSwipeGuideUiComponent.getPanelContext().LIZJ;
                                    if (m894 == null || (anchorCustomData = m894.getAnchorCustomData()) == null || (str2 = anchorCustomData.getPageName()) == null) {
                                        str2 = "";
                                    }
                                    linkedHashMap.put("page_name", str2);
                                    C76542zS.LIZ("rd_ec_search_swipe_guide_of_video_show", linkedHashMap);
                                }
                            }
                            EcomSearchSwipeGuideUiComponent ecomSearchSwipeGuideUiComponent2 = EcomSearchSwipeGuideUiComponent.this;
                            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) ecomSearchSwipeGuideUiComponent2.LJLJJI.getValue();
                            if (iFeedPanelPlatformAbility2 != null) {
                                aweme2 = iFeedPanelPlatformAbility2.getCurrentAweme();
                            }
                            ecomSearchSwipeGuideUiComponent2.LJLJLLL = aweme2;
                        }
                        EcomSearchSwipeGuideUiComponent.this.LJLJLJ = false;
                    }
                });
            }
            this.LJLJJL = C84193Sd.LIZ(LIZ);
        }
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = (SwipeUpGuideStrengthenLayout) view.findViewById(R.id.ji3);
        String str = null;
        if (swipeUpGuideStrengthenLayout != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LJLJJI.getValue();
            if (iFeedPanelPlatformAbility2 != null && (viewPagerComponentAbility = iFeedPanelPlatformAbility2.getViewPagerComponentAbility()) != null) {
                c80796VnM = viewPagerComponentAbility.mj0();
            } else {
                c80796VnM = null;
            }
            swipeUpGuideStrengthenLayout.setViewPager(c80796VnM);
            swipeUpGuideStrengthenLayout.setOnTouchListener(new IDTListenerS111S0100000_1(this, 6));
        } else {
            swipeUpGuideStrengthenLayout = null;
        }
        this.LJLJJLL = swipeUpGuideStrengthenLayout;
        TextView textView = (TextView) view.findViewById(R.id.mj4);
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.ryt);
            }
            textView.setText(str);
        }
    }
}
