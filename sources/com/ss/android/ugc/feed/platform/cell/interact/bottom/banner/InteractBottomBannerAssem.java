package com.ss.android.ugc.feed.platform.cell.interact.bottom.banner;

import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C37179EiV;
import X.C38995FSd;
import X.C3C8;
import X.C51029K0z;
import X.C62822Ol8;
import X.C73098SmU;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OM7;
import X.OM8;
import X.ViewOnClickListenerC13880ga;
import X.W5F;
import Y.ARunnableS21S0300000_10;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class InteractBottomBannerAssem<T extends C3C8> extends BaseCellSlotComponent<T> {
    public FeedBottomBannerView LLFII;
    public final C62822Ol8 LLFZ;
    public FeedBottomBannerConfig LLI;
    public boolean LLIFFJFJJ;

    public abstract FeedBottomBannerConfig B4(Context context, FeedBottomBannerConfig.Builder builder);

    public boolean E4() {
        return false;
    }

    public boolean P2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aaa;
    }

    public abstract String r4();

    public InteractBottomBannerAssem() {
        new LinkedHashMap();
        this.LLFZ = C221108m2.LIZIZ(new AqS160S0100000_10((InteractBottomBannerAssem) this, 367));
    }

    public final FeedBottomBannerConfig u4() {
        FeedBottomBannerConfig feedBottomBannerConfig = this.LLI;
        if (feedBottomBannerConfig != null) {
            return feedBottomBannerConfig;
        }
        o.LJIJI("feedBottomBannerConfig");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public void onParentSet() {
        super.onParentSet();
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        FeedBottomBannerConfig B4 = B4(context, (FeedBottomBannerConfig.Builder) this.LLFZ.getValue());
        o.LJIIIZ(B4, "<set-?>");
        this.LLI = B4;
    }

    public final void A4(FeedBottomBannerConfig feedBottomBannerConfig) {
        Integer num = feedBottomBannerConfig.interactionLayoutId;
        if (num != null) {
            C38995FSd.LIZLLL().execute(new ARunnableS21S0300000_10(this, num, feedBottomBannerConfig, 8));
        }
    }

    @Override // X.C8XO
    /* renamed from: C4, reason: merged with bridge method [inline-methods] */
    public void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        getContainerView().setVisibility(8);
        if (P2(item)) {
            F4(item);
        } else {
            z4(item);
        }
    }

    public final void D4(FeedBottomBannerConfig.Builder builder) {
        View view;
        FeedBottomBannerView feedBottomBannerView;
        OM7 om7;
        FeedBottomBannerView feedBottomBannerView2;
        C2068389v c2068389v;
        FeedBottomBannerView feedBottomBannerView3;
        FeedBottomBannerView feedBottomBannerView4;
        FeedBottomBannerView feedBottomBannerView5;
        InterfaceC88472Yns<W5F, C76800UCe> interfaceC88472Yns;
        FeedBottomBannerView feedBottomBannerView6;
        Integer num;
        o.LJIIIZ(builder, "builder");
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            FeedBottomBannerConfig build = builder.build();
            OM8 om8 = new OM8(build, u4());
            if (!o.LJ(om8.LIZ.iconType, om8.LIZIZ.iconType)) {
                FeedBottomBannerConfig feedBottomBannerConfig = om8.LIZ;
                FeedBottomBannerView feedBottomBannerView7 = this.LLFII;
                if (feedBottomBannerView7 != null) {
                    feedBottomBannerView7.setIconType(feedBottomBannerConfig.iconType);
                }
            }
            if ((!o.LJ(om8.LIZ.iconRes, om8.LIZIZ.iconRes)) && (num = om8.LIZ.iconRes) != null) {
                int intValue = num.intValue();
                FeedBottomBannerView feedBottomBannerView8 = this.LLFII;
                if (feedBottomBannerView8 != null) {
                    feedBottomBannerView8.setIcon(intValue);
                }
            }
            if ((!o.LJ(om8.LIZ.iconLighten, om8.LIZIZ.iconLighten)) && (interfaceC88472Yns = om8.LIZ.iconLighten) != null && (feedBottomBannerView6 = this.LLFII) != null) {
                feedBottomBannerView6.setLightenBuilder(interfaceC88472Yns);
            }
            boolean z = om8.LIZ.titleSyncSet;
            if (z != om8.LIZIZ.titleSyncSet && (feedBottomBannerView5 = this.LLFII) != null) {
                feedBottomBannerView5.setTitleUpdateSync(z);
            }
            int i = om8.LIZ.titleMaxLine;
            if (i != om8.LIZIZ.titleMaxLine && (feedBottomBannerView4 = this.LLFII) != null) {
                feedBottomBannerView4.setTitleMaxLines(i);
            }
            if ((!o.LJ(om8.LIZ.titleEndIcon, om8.LIZIZ.titleEndIcon)) && (c2068389v = om8.LIZ.titleEndIcon) != null && (feedBottomBannerView3 = this.LLFII) != null) {
                feedBottomBannerView3.LIZJ(c2068389v, null);
            }
            if (!o.LJ(om8.LIZ.interactionType, om8.LIZIZ.interactionType)) {
                FeedBottomBannerConfig feedBottomBannerConfig2 = om8.LIZ;
                FeedBottomBannerView feedBottomBannerView9 = this.LLFII;
                if (feedBottomBannerView9 != null) {
                    feedBottomBannerView9.setInteractionAreaType(feedBottomBannerConfig2.interactionType);
                }
            }
            if ((!o.LJ(om8.LIZ.interactionAction, om8.LIZIZ.interactionAction)) && (om7 = om8.LIZ.interactionAction) != null && (feedBottomBannerView2 = this.LLFII) != null) {
                feedBottomBannerView2.setInteractionAction(om7);
            }
            if ((!o.LJ(om8.LIZ.interactionLayoutView, om8.LIZIZ.interactionLayoutView)) && (view = om8.LIZ.interactionLayoutView) != null && (feedBottomBannerView = this.LLFII) != null) {
                feedBottomBannerView.setInteractionArea(view);
            }
            if (!o.LJ(om8.LIZ.interactionLayoutId, om8.LIZIZ.interactionLayoutId)) {
                A4(build);
            }
            this.LLI = build;
            return;
        }
        C37179EiV.LIZ().post(new ARunnableS29S0200000_10(builder, this, 25));
    }

    public void F4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (u4().interactionType == FeedBottomBannerConfig.InteractionType.BUTTON) {
            this.LLIFFJFJJ = true;
            getContainerView().setVisibility(8);
        } else {
            getContainerView().setVisibility(0);
        }
    }

    public final void G4(List<? extends FeedBottomBannerUIProps> payload) {
        FeedBottomBannerView feedBottomBannerView;
        FeedBottomBannerView feedBottomBannerView2;
        o.LJIIIZ(payload, "payload");
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            for (FeedBottomBannerUIProps feedBottomBannerUIProps : payload) {
                if (feedBottomBannerUIProps instanceof FeedBottomBannerUIProps.Icon) {
                    String str = ((FeedBottomBannerUIProps.Icon) feedBottomBannerUIProps).url;
                    if (str != null && (feedBottomBannerView = this.LLFII) != null) {
                        feedBottomBannerView.setIcon(str);
                    }
                } else if ((feedBottomBannerUIProps instanceof FeedBottomBannerUIProps.Title) && (feedBottomBannerView2 = this.LLFII) != null) {
                    feedBottomBannerView2.setTitle(((FeedBottomBannerUIProps.Title) feedBottomBannerUIProps).content);
                }
            }
            return;
        }
        C37179EiV.LIZ().post(new ARunnableS28S0200000_9(this, payload, 35));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        FeedBottomBannerView feedBottomBannerView;
        FeedBottomBannerView feedBottomBannerView2;
        FeedBottomBannerView feedBottomBannerView3;
        FeedBottomBannerView feedBottomBannerView4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLFII = (FeedBottomBannerView) view.findViewById(R.id.j78);
        FeedBottomBannerConfig u4 = u4();
        FeedBottomBannerView feedBottomBannerView5 = this.LLFII;
        if (feedBottomBannerView5 != null) {
            feedBottomBannerView5.setIconType(u4.iconType);
        }
        Integer num = u4.iconRes;
        if (num != null) {
            int intValue = num.intValue();
            FeedBottomBannerView feedBottomBannerView6 = this.LLFII;
            if (feedBottomBannerView6 != null) {
                feedBottomBannerView6.setIcon(intValue);
            }
        }
        InterfaceC88472Yns<W5F, C76800UCe> interfaceC88472Yns = u4.iconLighten;
        if (interfaceC88472Yns != null && (feedBottomBannerView4 = this.LLFII) != null) {
            feedBottomBannerView4.setLightenBuilder(interfaceC88472Yns);
        }
        FeedBottomBannerView feedBottomBannerView7 = this.LLFII;
        if (feedBottomBannerView7 != null) {
            feedBottomBannerView7.setTitleMaxLines(u4.titleMaxLine);
        }
        FeedBottomBannerView feedBottomBannerView8 = this.LLFII;
        if (feedBottomBannerView8 != null) {
            feedBottomBannerView8.setTitleUpdateSync(u4.titleSyncSet);
        }
        C2068389v c2068389v = u4.titleEndIcon;
        if (c2068389v != null && (feedBottomBannerView3 = this.LLFII) != null) {
            feedBottomBannerView3.LIZJ(c2068389v, u4.titleEndIconView);
        }
        FeedBottomBannerView feedBottomBannerView9 = this.LLFII;
        if (feedBottomBannerView9 != null) {
            feedBottomBannerView9.setInteractionAreaType(u4.interactionType);
        }
        OM7 om7 = u4.interactionAction;
        if (om7 != null && (feedBottomBannerView2 = this.LLFII) != null) {
            feedBottomBannerView2.setInteractionAction(om7);
        }
        View view2 = u4.interactionLayoutView;
        if (view2 != null && (feedBottomBannerView = this.LLFII) != null) {
            feedBottomBannerView.setInteractionArea(view2);
        }
        A4(u4);
    }

    public final void q4(View.OnClickListener l) {
        o.LJIIIZ(l, "l");
        FeedBottomBannerView feedBottomBannerView = this.LLFII;
        if (feedBottomBannerView != null) {
            feedBottomBannerView.setOnClickListener(new ViewOnClickListenerC13880ga(l));
        }
    }

    public final void z4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        getContainerView().setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public void B2(int i, Aweme aweme) {
        if ((this.LLIFFJFJJ || E4()) && P2((VideoItemParams) C51029K0z.LJIILLIIL(this))) {
            this.LLIFFJFJJ = false;
            FeedBottomBannerView feedBottomBannerView = this.LLFII;
            if (feedBottomBannerView != null) {
                feedBottomBannerView.LIZIZ(new AqS160S0100000_10((InteractBottomBannerAssem) this, 368));
            }
        }
    }
}
