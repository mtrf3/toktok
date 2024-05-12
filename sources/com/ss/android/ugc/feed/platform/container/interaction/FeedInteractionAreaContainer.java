package com.ss.android.ugc.feed.platform.container.interaction;

import X.C204257zx;
import X.C214148ao;
import X.C214348b8;
import X.C241249dQ;
import X.C32151Nz;
import X.C34051DXz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C79004UzY;
import X.C7MY;
import X.C8NI;
import X.C8ON;
import X.C8OT;
import X.C8OU;
import X.C8PQ;
import X.EnumC210578Of;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.O6R;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerAssem;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.info.FeedInfoAreaContainer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedInteractionAreaContainer extends BaseContainer<VContainerProtocol, FeedInteractionAreaContainer> {
    public static final C8OU LLI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFFF;
    public final FeedInfoAreaContainer LLFII;
    public final EnumC210578Of LLFZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.8OU] */
    static {
        TBT tbt = new TBT(FeedInteractionAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt};
        LLI = new Object() { // from class: X.8OU
        };
    }

    public FeedInteractionAreaContainer() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1323), null, C8OT.INSTANCE, null, null);
        this.LLFII = new FeedInfoAreaContainer();
        this.LLFZ = EnumC210578Of.FEED_INTERACTION_AREA_CONTAINER;
    }

    public final ConstraintSizeVM n4() {
        return (ConstraintSizeVM) this.LLFFF.LIZ(this, LLIFFJFJJ[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final void e4() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        super.e4();
        C78926UyI.LJFF(this, new AqS169S0100000_3(this, 593));
        FeedInfoAreaContainer feedInfoAreaContainer = this.LLFII;
        feedInfoAreaContainer.getClass();
        C8NI.LIZ("FeedBottomButtonContainer", new AqS153S0100000_3(feedInfoAreaContainer, 1607));
        if (this.LL != null) {
            getContainerView();
            Context context = getContext();
            if (context != null && !C79004UzY.LJJIJIIJI(context)) {
                ConstraintSizeVM n4 = n4();
                View findViewById = getContainerView().findViewById(R.id.lhs);
                o.LJIIIIZZ(findViewById, "containerView.findViewBy….id.top_widget_container)");
                n4.getClass();
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    if (C34051DXz.LIZ() || C8PQ.LIZ()) {
                        int LIZIZ = C7MY.LIZIZ(0);
                        int marginStart = marginLayoutParams5.getMarginStart();
                        int i = marginLayoutParams5.topMargin;
                        int marginEnd = marginLayoutParams5.getMarginEnd();
                        marginLayoutParams5.setMarginStart(marginStart);
                        marginLayoutParams5.topMargin = i;
                        marginLayoutParams5.setMarginEnd(marginEnd);
                        marginLayoutParams5.bottomMargin = LIZIZ;
                    } else {
                        int LIZIZ2 = C7MY.LIZIZ(10);
                        int marginStart2 = marginLayoutParams5.getMarginStart();
                        int i2 = marginLayoutParams5.topMargin;
                        int marginEnd2 = marginLayoutParams5.getMarginEnd();
                        marginLayoutParams5.setMarginStart(marginStart2);
                        marginLayoutParams5.topMargin = i2;
                        marginLayoutParams5.setMarginEnd(marginEnd2);
                        marginLayoutParams5.bottomMargin = LIZIZ2;
                    }
                }
                if (!C214148ao.LIZ()) {
                    ConstraintSizeVM n42 = n4();
                    View findViewById2 = getContainerView().findViewById(R.id.n9l);
                    o.LJIIIIZZ(findViewById2, "containerView.findViewBy….id.videomusiccoverblock)");
                    n42.getClass();
                    ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        int LIZIZ3 = C8ON.LIZIZ();
                        int marginStart3 = marginLayoutParams4.getMarginStart();
                        int i3 = marginLayoutParams4.topMargin;
                        int marginEnd3 = marginLayoutParams4.getMarginEnd();
                        marginLayoutParams4.setMarginStart(marginStart3);
                        marginLayoutParams4.topMargin = i3;
                        marginLayoutParams4.setMarginEnd(marginEnd3);
                        marginLayoutParams4.bottomMargin = LIZIZ3;
                    }
                    ConstraintSizeVM n43 = n4();
                    View findViewById3 = getContainerView().findViewById(R.id.epy);
                    o.LJIIIIZZ(findViewById3, "containerView.findViewBy…R.id.interact_right_area)");
                    n43.getClass();
                    ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        RightAreaContainerAssem.LLFZ.getClass();
                        int LJJIIZ = (RightAreaContainerAssem.LLIFFJFJJ - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C204257zx.LJ())))) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(C204257zx.LIZLLL())));
                        int marginStart4 = marginLayoutParams3.getMarginStart();
                        int i4 = marginLayoutParams3.topMargin;
                        int marginEnd4 = marginLayoutParams3.getMarginEnd();
                        marginLayoutParams3.setMarginStart(marginStart4);
                        marginLayoutParams3.topMargin = i4;
                        marginLayoutParams3.setMarginEnd(marginEnd4);
                        marginLayoutParams3.bottomMargin = LJJIIZ;
                    }
                } else {
                    ConstraintSizeVM n44 = n4();
                    View findViewById4 = getContainerView().findViewById(R.id.epy);
                    o.LJIIIIZZ(findViewById4, "containerView.findViewBy…R.id.interact_right_area)");
                    n44.getClass();
                    ViewGroup.LayoutParams layoutParams4 = findViewById4.getLayoutParams();
                    if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                        int marginStart5 = marginLayoutParams.getMarginStart();
                        int i5 = marginLayoutParams.topMargin;
                        int marginEnd5 = marginLayoutParams.getMarginEnd();
                        marginLayoutParams.setMarginStart(marginStart5);
                        marginLayoutParams.topMargin = i5;
                        marginLayoutParams.setMarginEnd(marginEnd5);
                        marginLayoutParams.bottomMargin = 0;
                    }
                }
                ConstraintSizeVM n45 = n4();
                View findViewById5 = getContainerView().findViewById(R.id.k5d);
                o.LJIIIIZZ(findViewById5, "containerView.findViewBy…lot_video_caption_layout)");
                n45.getClass();
                ViewGroup.LayoutParams layoutParams5 = findViewById5.getLayoutParams();
                if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                    if (C34051DXz.LIZ()) {
                        int LIZIZ4 = C7MY.LIZIZ(6);
                        int marginStart6 = marginLayoutParams2.getMarginStart();
                        int i6 = marginLayoutParams2.topMargin;
                        int marginEnd6 = marginLayoutParams2.getMarginEnd();
                        marginLayoutParams2.setMarginStart(marginStart6);
                        marginLayoutParams2.topMargin = i6;
                        marginLayoutParams2.setMarginEnd(marginEnd6);
                        marginLayoutParams2.bottomMargin = LIZIZ4;
                        return;
                    }
                    int LIZIZ5 = C7MY.LIZIZ(8);
                    int marginStart7 = marginLayoutParams2.getMarginStart();
                    int i7 = marginLayoutParams2.topMargin;
                    int marginEnd7 = marginLayoutParams2.getMarginEnd();
                    marginLayoutParams2.setMarginStart(marginStart7);
                    marginLayoutParams2.topMargin = i7;
                    marginLayoutParams2.setMarginEnd(marginEnd7);
                    marginLayoutParams2.bottomMargin = LIZIZ5;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLFZ;
    }
}
