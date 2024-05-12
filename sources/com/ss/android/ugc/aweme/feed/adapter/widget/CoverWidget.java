package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C5H3;
import X.C60996Nwm;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78963Uyt;
import X.C86343Xud;
import X.C86361Xuv;
import X.C86370Xv4;
import X.C86373Xv7;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import Y.ARunnableS4S0202000_13;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public final class CoverWidget extends LiveWatchPreviewWidget {
    public C62846OlW LJLILLLLZI;
    public C62846OlW LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public int LJLJL;

    public CoverWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 271);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 272), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        this.LJLJJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 273), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    public final void LJZ() {
        LiveRoomStruct liveRoomStruct;
        C62846OlW c62846OlW;
        MutableLiveData<C86361Xuv> mutableLiveData;
        C62846OlW c62846OlW2;
        MutableLiveData<C86361Xuv> mutableLiveData2;
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null && (liveRoomStruct = LJLZ.LIZIZ) != null) {
            UrlModel urlModel = liveRoomStruct.roomCover;
            if (urlModel == null) {
                User user = liveRoomStruct.owner;
                if (user != null) {
                    urlModel = user.getAvatarLarger();
                } else {
                    urlModel = null;
                }
            }
            int LJIIIIZZ = C60996Nwm.LJIIIIZZ(this.context);
            int LJ = C60996Nwm.LJ(this.context);
            UrlModel urlModel2 = liveRoomStruct.blurredCover;
            if (e1.LIZ(31744, "live_preview_background_image_setting", true, false) && urlModel2 != null) {
                C62846OlW c62846OlW3 = this.LJLILLLLZI;
                if (c62846OlW3 != null) {
                    c62846OlW3.post(new ARunnableS4S0202000_13(LJIIIIZZ, LJ, urlModel2, this, 0));
                }
                LivePreviewPlayerVM LJZI = LJZI();
                if ((LJZI != null && (mutableLiveData2 = LJZI.LJLILLLLZI) != null && mutableLiveData2.getValue() != null) || (c62846OlW2 = this.LJLILLLLZI) == null) {
                    return;
                }
                c62846OlW2.setVisibility(0);
                return;
            }
            if (urlModel != null) {
                C62846OlW c62846OlW4 = this.LJLILLLLZI;
                if (c62846OlW4 != null) {
                    c62846OlW4.post(new ARunnableS4S0202000_13(LJIIIIZZ, LJ, urlModel, this, 1));
                }
                LivePreviewPlayerVM LJZI2 = LJZI();
                if ((LJZI2 != null && (mutableLiveData = LJZI2.LJLILLLLZI) != null && mutableLiveData.getValue() != null) || (c62846OlW = this.LJLILLLLZI) == null) {
                    return;
                }
                c62846OlW.setVisibility(0);
                return;
            }
            C62846OlW c62846OlW5 = this.LJLILLLLZI;
            if (c62846OlW5 == null) {
                return;
            }
            c62846OlW5.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LivePreviewPlayerVM LJZI() {
        return (LivePreviewPlayerVM) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLILLLLZI = (C62846OlW) this.contentView.findViewById(R.id.j3i);
        this.LJLJI = (C62846OlW) this.contentView.findViewById(R.id.j3j);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String str;
        MutableLiveData<C76800UCe> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        NextLiveData<Boolean> nextLiveData;
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null) {
            str = C78963Uyt.LJIIZILJ(LJLZ);
        } else {
            str = null;
        }
        if (C86373Xv7.LIZ(str)) {
            C62846OlW c62846OlW = this.LJLJI;
            if (c62846OlW != null) {
                c62846OlW.setVisibility(8);
            }
        } else {
            C62846OlW c62846OlW2 = this.LJLILLLLZI;
            if (c62846OlW2 != null) {
                c62846OlW2.setVisibility(8);
            }
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLJJL.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LJLLLL) != null) {
            nextLiveData.observe(this, new AObserverS83S0100000_15(this, 21));
        }
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData3 = viewHolderStatusVM.LJLJLLL) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 22));
        }
        LivePreviewPlayerVM LJZI = LJZI();
        if (LJZI != null && (mutableLiveData2 = LJZI.LJLJI) != null) {
            mutableLiveData2.observe(this, new C86370Xv4(this));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData = viewHolderStatusVM2.LJLJLJ) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 23));
        }
    }
}
