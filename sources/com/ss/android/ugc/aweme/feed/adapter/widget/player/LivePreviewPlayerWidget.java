package com.ss.android.ugc.aweme.feed.adapter.widget.player;

import X.B4I;
import X.B4L;
import X.C15380j0;
import X.C221108m2;
import X.C28185B4j;
import X.C51029K0z;
import X.C51093K3l;
import X.C53199KuJ;
import X.C53254KvC;
import X.C56692Kj;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73411SrX;
import X.C76800UCe;
import X.C77554UcA;
import X.C84365X9d;
import X.C86343Xud;
import X.C86345Xuf;
import X.C86352Xum;
import X.C86354Xuo;
import X.C86361Xuv;
import X.EnumC79342VBy;
import X.VIJ;
import X.X1D;
import X.XJ8;
import Y.AObserverS82S0100000_14;
import Y.AObserverS83S0100000_15;
import Y.ARunnableS24S0200000_5;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLandscapeFeedPreviewSwitchSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.PreviewEnterOpt1;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.ab.PullStreamSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LivePreviewPlayerWidget extends LiveWatchPreviewWidget {
    public static final int LJLL = C15380j0.LJFF(R.dimen.aed);
    public C73411SrX LJLILLLLZI;
    public C73411SrX LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public C86354Xuo LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    public LivePreviewPlayerWidget() {
        XJ8 xj8 = XJ8.WIDGET;
        C65776Prg LIZ = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 356);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 357), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 358), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ4 = C65352Pkq.LIZ(MaskLayerAndWarningVM.class);
        this.LJLJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ4, xj8, new AqS165S0100000_15(LIZ4, 359), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 360));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final FeedLiveViewHolderVM LJZ() {
        return (FeedLiveViewHolderVM) this.LJLJJL.getValue();
    }

    public final LivePreviewPlayerVM LJZI() {
        return (LivePreviewPlayerVM) this.LJLJJI.getValue();
    }

    public final ViewGroup LJZL() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-videoContainerViewGroup>(...)");
        return (ViewGroup) value;
    }

    public final ViewHolderStatusVM LL() {
        return (ViewHolderStatusVM) this.LJLJJLL.getValue();
    }

    public final void LLFFF() {
        C73411SrX c73411SrX = this.LJLILLLLZI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            B4I.LIZ("LivePlayHelper_Preview", "stopPauseStreamTimer");
            C73411SrX c73411SrX2 = this.LJLILLLLZI;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
        }
        this.LJLILLLLZI = null;
    }

    public final void LLFII() {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            B4I.LIZ("LivePlayHelper_Preview", "stopPlayLiveTimer");
            C73411SrX c73411SrX2 = this.LJLJI;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
        }
        this.LJLJI = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
        LLFF();
    }

    public final void LLFF() {
        LLFFF();
        LLFII();
        if (o.LJ(this.LJLJLJ, C56692Kj.LIZ().LIZ)) {
            C56692Kj.LIZ().LIZIZ();
            B4I.LIZ("LivePlayHelper_Preview", "set callback null");
            C56692Kj.LIZ().LIZ = null;
        }
        C56692Kj.LIZ().LIZIZ = null;
    }

    public final void LLF(VIJ vij) {
        LiveRoomStruct liveRoomStruct;
        C86343Xud LJLZ;
        int i;
        int i2;
        B4L LIZIZ;
        B4L LIZIZ2;
        C77554UcA c77554UcA;
        C86345Xuf c86345Xuf;
        C86345Xuf c86345Xuf2;
        int i3;
        VIJ vij2 = VIJ.PRE_PULL;
        if (vij != vij2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set liveCallBack: ");
            C86354Xuo c86354Xuo = this.LJLJLJ;
            if (c86354Xuo != null) {
                i3 = c86354Xuo.hashCode();
            } else {
                i3 = 0;
            }
            LIZ.append(i3);
            B4I.LIZ("LivePlayHelper_Preview", X1D.LIZIZ(LIZ));
            C56692Kj.LIZ().LIZ = this.LJLJLJ;
        }
        C86343Xud LJLZ2 = LJLZ();
        if (LJLZ2 != null && (liveRoomStruct = LJLZ2.LIZIZ) != null && (LJLZ = LJLZ()) != null && LJLZ.LJ) {
            C86343Xud LJLZ3 = LJLZ();
            if (LJLZ3 != null && LJLZ3.LJIILLIIL) {
                return;
            }
            C86343Xud LJLZ4 = LJLZ();
            if (LJLZ4 != null && (c86345Xuf2 = LJLZ4.LJIIIIZZ) != null) {
                c86345Xuf2.LJLILLLLZI = System.currentTimeMillis();
            }
            LivePreviewPlayerVM LJZI = LJZI();
            if (LJZI != null) {
                ViewGroup LJZL = LJZL();
                if (!LJZI.LJLJLJ) {
                    if (((PullStreamSyncConfig) C84365X9d.LIZIZ.getValue()).sync) {
                        C86343Xud hv0 = LJZI.hv0();
                        if (hv0 != null && (c86345Xuf = hv0.LJIIIIZZ) != null) {
                            c86345Xuf.LJLJJI = 0L;
                        }
                        C86343Xud hv02 = LJZI.hv0();
                        if (hv02 != null && (c77554UcA = hv02.LJII) != null) {
                            c77554UcA.LIZ = false;
                        }
                    }
                    LJZI.jv0(System.currentTimeMillis(), "start_real");
                    LJZL.post(new ARunnableS24S0200000_5(LJZI, LJZL, 56));
                    C86343Xud hv03 = LJZI.hv0();
                    if (hv03 != null) {
                        hv03.LJJIIZ = new C86352Xum(LJZI.LJLLLL);
                        String str = hv03.LIZJ;
                        LiveRoomStruct liveRoomStruct2 = hv03.LIZIZ;
                        if (liveRoomStruct2 != null && (LJZL instanceof FrameLayout)) {
                            LJZI.LJLLLL.k(LJZI.LJLJL);
                            LJZI.LJLLLL.j(new C51093K3l(str, "live_cell", ""));
                            LJZI.jv0(System.currentTimeMillis(), "start_pull_stream");
                            LJZI.LJLLLL.i(true, liveRoomStruct2, (FrameLayout) LJZL, PreviewEnterOpt1.INSTANCE.isEnable(), i0.LJFF(str, "-live_cell"));
                            C28185B4j l = LJZI.LJLLLL.l();
                            if (l != null && (LIZIZ2 = l.LIZIZ()) != null) {
                                i = LIZIZ2.getStreamWidth();
                            } else {
                                i = 0;
                            }
                            C28185B4j l2 = LJZI.LJLLLL.l();
                            if (l2 != null && (LIZIZ = l2.LIZIZ()) != null) {
                                i2 = LIZIZ.getStreamHeight();
                            } else {
                                i2 = 0;
                            }
                            if (LivesdkLandscapeFeedPreviewSwitchSetting.INSTANCE.isEnable() && i > i2) {
                                C28185B4j l3 = LJZI.LJLLLL.l();
                                if (l3 != null) {
                                    C28185B4j.LIZLLL(l3, 0);
                                }
                            } else {
                                C28185B4j l4 = LJZI.LJLLLL.l();
                                if (l4 != null) {
                                    C28185B4j.LIZLLL(l4, 2);
                                }
                            }
                            LJZI.LJLLLL.LLZZ(new AqS171S0100000_5(LJZI, 582));
                            hv03.LJII.LIZIZ = LJZI.LJLLLL.getPlayerTag();
                            LJZI.LJLJLJ = true;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("init play ");
                            LIZ2.append(liveRoomStruct2.id);
                            LJZI.LJLLLL.LLZLL(X1D.LIZIZ(LIZ2));
                        }
                    }
                }
            }
            LLFII();
            if (vij != vij2) {
                LLFFF();
                C56692Kj.LIZ().LIZIZ = null;
            }
            MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLJL.getValue();
            if (maskLayerAndWarningVM == null || !C51029K0z.LJJIJL(liveRoomStruct.maskLayer, maskLayerAndWarningVM.LJLJI)) {
                return;
            }
            if (C53199KuJ.LIZ()) {
                LivePreviewPlayerVM LJZI2 = LJZI();
                if (LJZI2 == null) {
                    return;
                }
                LJZI2.destroy();
                return;
            }
            LivePreviewPlayerVM LJZI3 = LJZI();
            if (LJZI3 == null) {
                return;
            }
            LJZI3.iv0();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LivePreviewPlayerVM LJZI;
        MutableLiveData<EnumC79342VBy> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4;
        MutableLiveData<C76800UCe> mutableLiveData5;
        MutableLiveData<C76800UCe> mutableLiveData6;
        MutableLiveData<C76800UCe> mutableLiveData7;
        MutableLiveData<C76800UCe> mutableLiveData8;
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<C76800UCe> nextLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData9;
        NextLiveData<Boolean> nextLiveData3;
        MutableLiveData<C86361Xuv> mutableLiveData10;
        MutableLiveData<C76800UCe> mutableLiveData11;
        LivePreviewPlayerVM LJZI2 = LJZI();
        if (LJZI2 != null && (mutableLiveData11 = LJZI2.LJLJI) != null) {
            mutableLiveData11.observe(this, new AObserverS83S0100000_15(this, 64));
        }
        LivePreviewPlayerVM LJZI3 = LJZI();
        if (LJZI3 != null && (mutableLiveData10 = LJZI3.LJLILLLLZI) != null) {
            mutableLiveData10.observe(this, new AObserverS83S0100000_15(this, 65));
        }
        FeedLiveViewHolderVM LJZ = LJZ();
        if (LJZ != null && (nextLiveData3 = LJZ.LJLLLL) != null) {
            nextLiveData3.observe(this, new AObserverS83S0100000_15(this, 66));
        }
        LivePreviewPlayerVM LJZI4 = LJZI();
        if (LJZI4 != null && (mutableLiveData9 = LJZI4.LJLJJL) != null) {
            mutableLiveData9.observe(this, new AObserverS82S0100000_14(this, 9));
        }
        FeedLiveViewHolderVM LJZ2 = LJZ();
        if (LJZ2 != null && (nextLiveData2 = LJZ2.LJLLLLLL) != null) {
            nextLiveData2.observe(this, new AObserverS83S0100000_15(this, 67));
        }
        FeedLiveViewHolderVM LJZ3 = LJZ();
        if (LJZ3 != null && (nextLiveData = LJZ3.LJZ) != null) {
            nextLiveData.observe(this, new AObserverS82S0100000_14(this, 10));
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLJL.getValue();
        if (maskLayerAndWarningVM != null && (mutableLiveData8 = maskLayerAndWarningVM.LJLJJLL) != null) {
            mutableLiveData8.observe(this, new AObserverS82S0100000_14(this, 11));
        }
        ViewHolderStatusVM LL = LL();
        if (LL != null && (mutableLiveData7 = LL.LJLILLLLZI) != null) {
            mutableLiveData7.observe(this, new AObserverS82S0100000_14(this, 12));
        }
        ViewHolderStatusVM LL2 = LL();
        if (LL2 != null && (mutableLiveData6 = LL2.LJLJI) != null) {
            mutableLiveData6.observe(this, new AObserverS83S0100000_15(this, 68));
        }
        ViewHolderStatusVM LL3 = LL();
        if (LL3 != null && (mutableLiveData5 = LL3.LJLJJLL) != null) {
            mutableLiveData5.observe(this, new AObserverS83S0100000_15(this, 60));
        }
        ViewHolderStatusVM LL4 = LL();
        if (LL4 != null && (mutableLiveData4 = LL4.LJLJL) != null) {
            mutableLiveData4.observe(this, new AObserverS83S0100000_15(this, 61));
        }
        ViewHolderStatusVM LL5 = LL();
        if (LL5 != null && (mutableLiveData3 = LL5.LJLJLJ) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 62));
        }
        ViewHolderStatusVM LL6 = LL();
        if (LL6 != null && (mutableLiveData2 = LL6.LJLJJI) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 63));
        }
        if (C53254KvC.LIZ() && (LJZI = LJZI()) != null && (mutableLiveData = LJZI.LJLIL) != null) {
            mutableLiveData.observe(this, new AObserverS82S0100000_14(this, 8));
        }
    }
}
