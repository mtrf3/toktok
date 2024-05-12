package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C16880lQ;
import X.C188727au;
import X.C29306Beo;
import X.C47121t6;
import X.C53254KvC;
import X.C53873LCj;
import X.C53887LCx;
import X.C5H3;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72433Sbl;
import X.C76800UCe;
import X.C86343Xud;
import X.EnumC53720L6m;
import X.FMX;
import X.KL2;
import X.SY4;
import X.ViewOnClickListenerC86324XuK;
import X.XJ8;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SubscribeMaskLayerWidget extends LiveWatchPreviewWidget {
    public C53887LCx LJLILLLLZI;
    public C53873LCj LJLJI;
    public C72433Sbl LJLJJI;
    public C62846OlW LJLJJL;
    public SY4 LJLJJLL;
    public C47121t6 LJLJL;
    public C47121t6 LJLJLJ;
    public boolean LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;

    public SubscribeMaskLayerWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 350);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        this.LJLLI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 351), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLLILLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 352), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZ() {
        /*
            r11 = this;
            r8 = r11
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r8.dataChannel
            java.lang.Class<X.BDn> r0 = X.C28423BDn.class
            java.lang.Object r0 = r1.kv0(r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            r8.LJLJLLL = r0
            X.Xud r0 = r8.LJLZ()
            r7 = 1
            if (r0 != 0) goto Ldc
        L18:
            X.Xud r0 = r8.LJLZ()
            X.C86323XuJ.LIZ(r0, r7)
            r8.LJZL()
            r8.show()
            X.5H3 r0 = r8.LJLLI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM r0 = (com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM) r0
            if (r0 == 0) goto L32
            r0.mv0()
        L32:
            X.Xud r0 = r8.LJLZ()
            r6 = 0
            r9 = 0
            if (r0 == 0) goto Ld7
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r2 = r0.LIZIZ
            if (r2 == 0) goto Ld7
            com.ss.android.ugc.aweme.profile.model.User r1 = r2.owner
            java.lang.String r0 = "it.owner"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r5 = X.C56331M8x.LIZIZ(r1, r6, r6)
            X.1t6 r0 = r8.LJLJLJ
            if (r0 != 0) goto Ld2
        L4d:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r2.roomCover
            if (r3 != 0) goto L59
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.owner
            if (r0 == 0) goto Ld9
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getAvatarLarger()
        L59:
            boolean r0 = r8.LJLJLLL
            if (r0 == 0) goto Lc2
            X.1t6 r2 = r8.LJLJL
            if (r2 != 0) goto Lb3
        L61:
            X.BQO r1 = X.C15650jR.LIZ()
            if (r3 == 0) goto Lb1
            java.util.List r0 = r3.getUrlList()
        L6b:
            X.Uuy r1 = r1.LIZ(r0)
            r1.LJIIL = r4
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.LIZLLL(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.LJIJI = r0
            X.Sbl r0 = r8.LJLJJI
            r1.LJIIJJI(r0)
            X.Xud r0 = r8.LJLZ()
            if (r0 == 0) goto Lae
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r1 = r0.LIZIZ
            if (r1 == 0) goto Lae
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.roomCover
            if (r0 != 0) goto Laf
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.owner
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r0.getAvatarLarger()
        L95:
            android.content.Context r0 = r8.context
            int r7 = X.KL2.LJIIJJI(r0)
            android.content.Context r0 = r8.context
            int r6 = X.KL2.LJIIIZ(r0)
            X.OlW r0 = r8.LJLJJL
            if (r0 == 0) goto Lae
            Y.ARunnableS2S0202000_8 r5 = new Y.ARunnableS2S0202000_8
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.post(r5)
        Lae:
            return
        Laf:
            r9 = r0
            goto L95
        Lb1:
            r0 = r9
            goto L6b
        Lb3:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r6] = r5
            r0 = 2131841209(0x7f1150b9, float:1.931572E38)
            java.lang.String r0 = X.C15380j0.LJIILL(r0, r1)
            r2.setText(r0)
            goto L61
        Lc2:
            X.1t6 r1 = r8.LJLJL
            if (r1 != 0) goto Lc7
            goto L61
        Lc7:
            r0 = 2131841446(0x7f1151a6, float:1.93162E38)
            java.lang.String r0 = X.C15380j0.LJIILJJIL(r0)
            r1.setText(r0)
            goto L61
        Ld2:
            r0.setText(r5)
            goto L4d
        Ld7:
            java.lang.String r5 = ""
        Ld9:
            r3 = r9
            goto L59
        Ldc:
            r0.LJIILLIIL = r7
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.SubscribeMaskLayerWidget.LJZ():void");
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bqs;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZL() {
        String str;
        String str2;
        Long l;
        Aweme aweme;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        User user;
        C188727au c188727au = new C188727au();
        C86343Xud LJLZ = LJLZ();
        String str3 = null;
        if (LJLZ != null) {
            str = LJLZ.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("enter_from_merge", str);
        c188727au.LJIIIZ("action_type", "click");
        C86343Xud LJLZ2 = LJLZ();
        if (LJLZ2 != null && (liveRoomStruct2 = LJLZ2.LIZIZ) != null && (user = liveRoomStruct2.owner) != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("anchor_id", str2);
        C86343Xud LJLZ3 = LJLZ();
        if (LJLZ3 != null && (liveRoomStruct = LJLZ3.LIZIZ) != null) {
            l = Long.valueOf(liveRoomStruct.id);
        } else {
            l = null;
        }
        c188727au.LJFF(l, "room_id");
        C86343Xud LJLZ4 = LJLZ();
        if (LJLZ4 != null && (aweme = LJLZ4.LIZ) != null) {
            str3 = aweme.getRequestId();
        }
        c188727au.LJIIIZ("request_id", str3);
        c188727au.LJIIIZ("enter_method", "live_cell");
        c188727au.LJIIIZ("show_entrance", "sub_only_preview_layer");
        FMX.LJIIL("livesdk_subscribe_icon_show", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        hide();
    }

    public final void LJZI(boolean z) {
        LivePreviewPlayerVM livePreviewPlayerVM;
        MutableLiveData<C76800UCe> mutableLiveData;
        if (isInitialized()) {
            hide();
            C86343Xud LJLZ = LJLZ();
            if (LJLZ != null) {
                LJLZ.LJIILLIIL = false;
            }
        }
        if (!z || (livePreviewPlayerVM = (LivePreviewPlayerVM) this.LJLLI.getValue()) == null || (mutableLiveData = livePreviewPlayerVM.LJLJJL) == null) {
            return;
        }
        mutableLiveData.setValue(C76800UCe.LIZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C29306Beo.LJJLIIIJJI(this.contentView, true);
        this.LJLJJI = (C72433Sbl) findViewById(R.id.kpz);
        this.LJLJI = (C53873LCj) findViewById(R.id.kq0);
        this.LJLJJL = (C62846OlW) findViewById(R.id.kq2);
        this.LJLJL = (C47121t6) findViewById(R.id.fvg);
        this.LJLJJLL = (SY4) findViewById(R.id.d86);
        this.LJLJLJ = (C47121t6) findViewById(R.id.fvf);
        findViewById(R.id.h0z);
        EnumC53720L6m enumC53720L6m = EnumC53720L6m.INBOX;
        C72433Sbl c72433Sbl = this.LJLJJI;
        this.LJLILLLLZI = new C53887LCx(enumC53720L6m, c72433Sbl, c72433Sbl, this.LJLJI);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<C76800UCe> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        NextLiveData<C76800UCe> nextLiveData;
        C16880lQ.LJIIJ(ViewOnClickListenerC86324XuK.LJLIL, this.contentView);
        C72433Sbl c72433Sbl = this.LJLJJI;
        if (c72433Sbl != null) {
            ViewGroup.LayoutParams layoutParams = c72433Sbl.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, ((int) (KL2.LJIIIZ(this.context) * 0.3d)) - KL2.LJIIL(this.context), 0, 0);
        }
        C53887LCx c53887LCx = this.LJLILLLLZI;
        if (c53887LCx != null) {
            c53887LCx.LJFF();
        }
        SY4 sy4 = this.LJLJJLL;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS35S0100000_15(this, 106));
        }
        LJZ();
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLL.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LJZI) != null) {
            nextLiveData.observe(this, new AObserverS83S0100000_15(this, 55));
        }
        if (C53254KvC.LIZ()) {
            ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLLILLLL.getValue();
            if (viewHolderStatusVM != null && (mutableLiveData3 = viewHolderStatusVM.LJLJLJ) != null) {
                mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 56));
            }
            ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLLILLLL.getValue();
            if (viewHolderStatusVM2 != null && (mutableLiveData2 = viewHolderStatusVM2.LJLILLLLZI) != null) {
                mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 57));
            }
            ViewHolderStatusVM viewHolderStatusVM3 = (ViewHolderStatusVM) this.LJLLILLLL.getValue();
            if (viewHolderStatusVM3 != null && (mutableLiveData = viewHolderStatusVM3.LJLJJL) != null) {
                mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 58));
            }
        }
    }
}
