package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C16880lQ;
import X.C17N;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72434Sbm;
import X.C78939UyV;
import X.C78963Uyt;
import X.C86343Xud;
import X.C86369Xv3;
import X.W5F;
import X.W5U;
import X.XJ8;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveUser;
import com.ss.android.ugc.aweme.feed.model.live.ShowInfo;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ShowInfoWidget extends LiveWatchPreviewWidget {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final Handler LJLJJI;

    public ShowInfoWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 310);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLILLLLZI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 311), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LJLJJI = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bqe;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public static void LJZL(C86369Xv3 c86369Xv3) {
        Context context = c86369Xv3.getContext();
        o.LJIIIIZZ(context, "parent.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText("-");
        tuxTextView.setTextColorRes(R.attr.dj);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.setMarginEnd(C17N.LJIILL(4.0d));
        c86369Xv3.addView(tuxTextView, layoutParams);
    }

    public final void LL(ShowInfo showInfo) {
        Integer num;
        C86369Xv3 parentContainer = (C86369Xv3) findViewById(R.id.ia3);
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null) {
            num = Integer.valueOf(LJLZ.LJIIZILJ);
        } else {
            num = null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            if (!TextUtils.isEmpty(showInfo.showIntroduction)) {
                o.LJIIIIZZ(parentContainer, "parentContainer");
                LJZI(showInfo, parentContainer);
                LJZL(parentContainer);
            }
            o.LJIIIIZZ(parentContainer, "parentContainer");
            LJZ(showInfo, parentContainer);
            return;
        }
        if (num.intValue() != 2) {
            return;
        }
        o.LJIIIIZZ(parentContainer, "parentContainer");
        LJZ(showInfo, parentContainer);
        if (TextUtils.isEmpty(showInfo.showIntroduction)) {
            return;
        }
        LJZL(parentContainer);
        LJZI(showInfo, parentContainer);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C86343Xud LJLZ;
        C86343Xud LJLZ2;
        String str;
        MutableLiveData<Integer> mutableLiveData;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        LiveRoomStruct newLiveRoomData;
        TopFrameSummary topFrameSummary;
        C86343Xud LJLZ3 = LJLZ();
        if ((LJLZ3 != null && LJLZ3.LJIIZILJ == 0) || (LJLZ = LJLZ()) == null || !C78963Uyt.LJJIJIIJIL(LJLZ)) {
            return;
        }
        C86343Xud LJLZ4 = LJLZ();
        if ((LJLZ4 == null || !C78963Uyt.LJII(LJLZ4)) && ((LJLZ2 = LJLZ()) == null || !C78963Uyt.LJI(LJLZ2))) {
            return;
        }
        C86343Xud LJLZ5 = LJLZ();
        String str2 = null;
        if (LJLZ5 != null && (aweme = LJLZ5.LIZ) != null && (newLiveRoomData = aweme.getNewLiveRoomData()) != null && (topFrameSummary = newLiveRoomData.topFrameSummary) != null) {
            str = topFrameSummary.getTitle();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            C86343Xud LJLZ6 = LJLZ();
            if (LJLZ6 != null && (liveRoomStruct = LJLZ6.LIZIZ) != null) {
                str2 = liveRoomStruct.title;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
        }
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM == null || (mutableLiveData = viewHolderStatusVM.LJLJL) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 36));
    }

    public final void LJZ(ShowInfo showInfo, C86369Xv3 c86369Xv3) {
        List<? extends LiveUser> list = showInfo.anchors;
        if (list == null || list.isEmpty()) {
            this.contentView.setVisibility(8);
        }
        List<? extends LiveUser> list2 = showInfo.anchors;
        if (list2 != null) {
            for (LiveUser liveUser : list2) {
                C72434Sbm c72434Sbm = new C72434Sbm(c86369Xv3.getContext());
                Context context = c86369Xv3.getContext();
                o.LJIIIIZZ(context, "parent.context");
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C17N.LJIILL(16.0d), C17N.LJIILL(16.0d));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMarginEnd(C17N.LJIILL(4.0d));
                layoutParams2.setMarginEnd(C17N.LJIILL(4.0d));
                tuxTextView.setText(liveUser.nickname);
                tuxTextView.setTextColorRes(R.attr.dj);
                c86369Xv3.addView(c72434Sbm, layoutParams);
                c86369Xv3.addView(tuxTextView, layoutParams2);
                C16880lQ.LJJIJL(c72434Sbm, new ACListenerS35S0100000_15(this, 285));
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 286));
                UrlModel urlModel = liveUser.avatarThumb;
                if (urlModel != null) {
                    W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                    LJII.LJJIIJ = c72434Sbm;
                    C16880lQ.LLJJJ(LJII);
                }
            }
        }
    }

    public final void LJZI(ShowInfo showInfo, C86369Xv3 c86369Xv3) {
        Context context = c86369Xv3.getContext();
        o.LJIIIIZZ(context, "parent.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(showInfo.showIntroduction);
        tuxTextView.setTextColorRes(R.attr.dj);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.setMarginEnd(C17N.LJIILL(4.0d));
        c86369Xv3.addView(tuxTextView, layoutParams);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 287));
    }
}
