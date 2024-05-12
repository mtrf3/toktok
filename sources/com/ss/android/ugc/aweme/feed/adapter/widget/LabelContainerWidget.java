package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C04330Ez;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C32I;
import X.C3C5;
import X.C53254KvC;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C7Z1;
import X.C86343Xud;
import X.C86362Xuw;
import X.CountDownTimerC86356Xuq;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.commercialize.model.AdTagStruct;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LabelContainerWidget extends LiveWatchPreviewWidget {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 284));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 292));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 287));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 289));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 285));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 288));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, BuildConfig.VERSION_CODE));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 286));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 291));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 281));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 282));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 283));
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public boolean LJZI;
    public CountDownTimerC86356Xuq LJZL;
    public long LL;
    public TuxTextView LLD;

    public LabelContainerWidget() {
        new Handler(C16880lQ.LLJJJJ());
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 293);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 294), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(SubscribeMaskLayerVM.class);
        this.LJLLLLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 295), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ4 = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        this.LJLZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ4, xj8, new AqS165S0100000_15(LIZ4, 296), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ5 = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        this.LJZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ5, xj8, new AqS165S0100000_15(LIZ5, 297), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LL = -1L;
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

    public final C7Z1 LJZI() {
        return (C7Z1) this.LJLLILLLL.getValue();
    }

    public final TuxTextView LL() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-lineIconTxt>(...)");
        return (TuxTextView) value;
    }

    public final LivePreviewPlayerVM LLF() {
        return (LivePreviewPlayerVM) this.LJLZ.getValue();
    }

    public final RelativeLayout LLFF() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mLiveEventContainer>(...)");
        return (RelativeLayout) value;
    }

    public final RelativeLayout LLFFF() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-mLiveEventContainer2>(...)");
        return (RelativeLayout) value;
    }

    public final LinearLayout LLFII() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-mLiveFeedContainer>(...)");
        return (LinearLayout) value;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C53254KvC.LIZ()) {
            return R.layout.bpz;
        }
        return super.getLayoutId();
    }

    public static String LJZL(long j) {
        long j2 = j / 1000;
        if (j2 > 60) {
            String LJIILL = C15380j0.LJIILL(R.string.nq1, String.valueOf(j2 / 60));
            o.LJIIIIZZ(LJIILL, "getString(R.string.pm_pr…econds / 60L).toString())");
            return LJIILL;
        }
        String LJIILL2 = C15380j0.LJIILL(R.string.o_e, String.valueOf(j2));
        o.LJIIIIZZ(LJIILL2, "getString(R.string.pm_su…time / 1000L).toString())");
        return LJIILL2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        NextLiveData<C86362Xuw> nextLiveData;
        NextLiveData<C76800UCe> nextLiveData2;
        NextLiveData<Boolean> nextLiveData3;
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLLLL.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData3 = feedLiveViewHolderVM.LJZ) != null) {
            nextLiveData3.observe(this, new AqS181S0100000_15(this, 53), C53254KvC.LIZ());
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LJLLLL.getValue();
        if (feedLiveViewHolderVM2 != null && (nextLiveData2 = feedLiveViewHolderVM2.LJZI) != null) {
            nextLiveData2.observe(this, new AqS181S0100000_15(this, 54), C53254KvC.LIZ());
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LJLLLLLL.getValue();
        if (subscribeMaskLayerVM != null && (nextLiveData = subscribeMaskLayerVM.LJLJI) != null) {
            nextLiveData.observe(this, new AqS181S0100000_15(this, 55), C53254KvC.LIZ());
        }
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLLL.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData = viewHolderStatusVM.LJLJL) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 29));
        }
    }

    public final void LJZ(C7Z1 c7z1, int i) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        List<AdTagStruct> adTags;
        Object LIZ;
        Object LIZ2;
        c7z1.removeAllViews();
        boolean z = false;
        c7z1.LJLIL = 0;
        c7z1.LJLILLLLZI = 0;
        c7z1.setVisibility(0);
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null && (aweme = LJLZ.LIZ) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adTags = awemeRawAd.getAdTags()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AdTagStruct adTagStruct : adTags) {
                AdTagStruct adTagStruct2 = adTagStruct;
                if (adTagStruct2.getPosition() == 2 && !TextUtils.isEmpty(adTagStruct2.getTagText())) {
                    arrayList.add(adTagStruct);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AdTagStruct adTagStruct3 = (AdTagStruct) it.next();
                if (!z) {
                    try {
                        LIZ = Integer.valueOf(Color.parseColor(adTagStruct3.getBackgroundColor()));
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    Integer valueOf = Integer.valueOf(C04330Ez.LIZIZ(c7z1.getContext(), R.color.b7));
                    if (C3C5.m12isFailureimpl(LIZ)) {
                        LIZ = valueOf;
                    }
                    int intValue = ((Number) LIZ).intValue();
                    try {
                        LIZ2 = Integer.valueOf(Color.parseColor(adTagStruct3.getTextColor()));
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th2) {
                        LIZ2 = C141335gf.LIZ(th2);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    Integer valueOf2 = Integer.valueOf(C04330Ez.LIZIZ(c7z1.getContext(), R.color.bc));
                    if (C3C5.m12isFailureimpl(LIZ2)) {
                        LIZ2 = valueOf2;
                    }
                    z = c7z1.LIZ(intValue, adTagStruct3.getTagText(), ((Number) LIZ2).intValue(), adTagStruct3.getIcon(), i, C15380j0.LIZ(5.0f), C15380j0.LIZ(1.0f));
                }
                arrayList2.add(C76800UCe.LIZ);
            }
        }
        if (c7z1.getShowTagNum() == 0) {
            c7z1.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
    
        if (r4 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(int r8, java.lang.String r9, com.ss.android.ugc.aweme.base.model.UrlModel r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget.LLFZ(int, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, boolean, boolean):void");
    }
}
