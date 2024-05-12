package com.ss.android.ugc.aweme.feed.adapter.widget.share;

import X.C107794Kx;
import X.C115684gO;
import X.C16880lQ;
import X.C232629Ba;
import X.C53254KvC;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BZ;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import android.os.Handler;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public final class ShareWidget extends LiveWatchPreviewWidget implements Handler.Callback {
    public String LJLILLLLZI;
    public TextView LJLJI;
    public C115684gO LJLJJI;
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ(), this);
    public final C5H3 LJLJJLL;

    public ShareWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(LivePreviewShareVM.class);
        this.LJLJJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, XJ8.WIDGET, new AqS165S0100000_15(LIZ, 362), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void LJZ() {
        this.LJLJJL.removeMessages(1);
        this.LJLJJL.removeMessages(2);
        this.LJLJJL.removeMessages(3);
        this.LJLJJL.removeMessages(4);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C53254KvC.LIZ()) {
            return R.layout.bq4;
        }
        return super.getLayoutId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L38;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            int r2 = r9.what
            r4 = 2
            r1 = 0
            r6 = 0
            r3 = 1
            if (r2 == r3) goto L50
            if (r2 == r4) goto L35
            r0 = 3
            if (r2 == r0) goto L27
            r0 = 4
            if (r2 == r0) goto L16
            return r1
        L16:
            X.4gN r1 = X.C115674gN.LIZ
            X.4gO r0 = r8.LJLJJI
            r1.getClass()
            if (r0 != 0) goto L20
        L1f:
            return r3
        L20:
            X.C115674gN.LIZJ(r0, r6)
            X.C115674gN.LIZ(r0)
            goto L1f
        L27:
            X.4gN r1 = X.C115674gN.LIZ
            X.4gO r0 = r8.LJLJJI
            r1.getClass()
            if (r0 != 0) goto L31
        L30:
            return r3
        L31:
            X.C115674gN.LIZJ(r0, r6)
            goto L30
        L35:
            X.4gN r0 = X.C115674gN.LIZ
            X.4gO r2 = r8.LJLJJI
            r0.getClass()
            if (r2 != 0) goto L3f
        L3e:
            return r3
        L3f:
            android.view.View r0 = r2.LIZIZ
            if (r0 == 0) goto L46
            X.C16880lQ.LJIIJ(r6, r0)
        L46:
            Y.ALAdapterS0S0100000_1 r1 = new Y.ALAdapterS0S0100000_1
            r0 = 0
            r1.<init>(r2, r0)
            X.C115674gN.LIZJ(r2, r1)
            goto L3e
        L50:
            java.lang.Object r7 = r9.obj
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.ShareCompleteEvent"
            kotlin.jvm.internal.o.LJII(r7, r0)
            X.4Kx r7 = (X.C107794Kx) r7
            X.4gN r0 = X.C115674gN.LIZ
            X.4gO r5 = r8.LJLJJI
            r0.getClass()
            java.lang.String r0 = r7.LJLJLLL
            if (r0 == 0) goto L6a
            int r0 = r0.length()
            if (r0 != 0) goto L6d
        L6a:
            X.C115674gN.LIZIZ(r5)
        L6d:
            android.animation.ValueAnimator r0 = X.C115674gN.LIZIZ
            if (r0 == 0) goto L81
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L81
            java.lang.String r0 = r7.LJLJLLL
            if (r0 == 0) goto L81
            int r0 = r0.length()
            if (r0 != 0) goto La7
        L81:
            if (r5 != 0) goto L96
        L83:
            java.lang.String r0 = r7.LJLJLLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L93
            r1 = 5000(0x1388, double:2.4703E-320)
        L8d:
            android.os.Handler r0 = r8.LJLJJL
            r0.sendEmptyMessageDelayed(r4, r1)
            return r3
        L93:
            r1 = 2000(0x7d0, double:9.88E-321)
            goto L8d
        L96:
            android.view.View r2 = r5.LIZIZ
            if (r2 == 0) goto La3
            Y.ACListenerS27S0300000_1 r1 = new Y.ACListenerS27S0300000_1
            r0 = 0
            r1.<init>(r7, r5, r6, r0)
            X.C16880lQ.LJIIJ(r1, r2)
        La3:
            X.C115674gN.LIZLLL(r7, r5)
            goto L83
        La7:
            android.animation.ValueAnimator r2 = X.C115674gN.LIZIZ
            if (r2 == 0) goto L81
            Y.ALAdapterS0S0300000_1 r1 = new Y.ALAdapterS0S0300000_1
            r0 = 0
            r1.<init>(r7, r6, r5, r0)
            r2.addListener(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L83
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.share.ShareWidget.handleMessage(android.os.Message):boolean");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLJI = (TextView) findViewById(R.id.mt1);
        this.LJLJJI = new C115684gO((TuxTextView) findViewById(R.id.jt1), findViewById(R.id.fyo), (TuxIconView) findViewById(R.id.jtc), (TuxIconView) findViewById(R.id.cx1), this.LJLJI);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<C232629Ba> mutableLiveData;
        MutableLiveData<C9BZ> mutableLiveData2;
        MutableLiveData<C107794Kx> mutableLiveData3;
        LivePreviewShareVM livePreviewShareVM = (LivePreviewShareVM) this.LJLJJLL.getValue();
        if (livePreviewShareVM != null && (mutableLiveData3 = livePreviewShareVM.LJLILLLLZI) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 69));
        }
        LivePreviewShareVM livePreviewShareVM2 = (LivePreviewShareVM) this.LJLJJLL.getValue();
        if (livePreviewShareVM2 != null && (mutableLiveData2 = livePreviewShareVM2.LJLJI) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 70));
        }
        LivePreviewShareVM livePreviewShareVM3 = (LivePreviewShareVM) this.LJLJJLL.getValue();
        if (livePreviewShareVM3 != null && (mutableLiveData = livePreviewShareVM3.LJLJJI) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 71));
        }
    }
}
