package com.bytedance.android.livesdk.impl.revenue.goodybag.widget;

import X.ActivityC45651qj;
import X.BJM;
import X.BR0;
import X.BR7;
import X.BR9;
import X.BRQ;
import X.BRR;
import X.C0NB;
import X.C1EU;
import X.C221108m2;
import X.C30892CAm;
import X.C45804HyK;
import X.C5H3;
import X.CN1;
import X.EnumC221088m0;
import X.InterfaceC28772BQy;
import X.InterfaceC30642C0w;
import X.UOY;
import X.WM7;
import X.X1D;
import Y.IDDListenerS145S0100000_5;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagURLConfig;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GoodyBagWidget extends LiveRecyclableWidget implements InterfaceC28772BQy {
    public BRR LJLIL;
    public final C5H3 LJLILLLLZI = C221108m2.LIZ(EnumC221088m0.NONE, BR7.LJLIL);
    public boolean LJLJI;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final BR9 LJLZ() {
        return (BR9) this.LJLILLLLZI.getValue();
    }

    public final String LJZ() {
        if (((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
            return "program_live";
        }
        if (CN1.LIZ(IMicRoomService.class) != null && ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) {
            return "video_anchor_order";
        }
        if (CN1.LIZ(IInteractService.class) != null) {
            String h00 = ((IInteractService) CN1.LIZ(IInteractService.class)).h00();
            o.LJIIIIZZ(h00, "getService(IInteractService::class.java).roomScene");
            return h00;
        }
        return "normal_video_live";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleRevenueWidgetSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC28772BQy
    public final Context LJFF() {
        return super.getContext();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        LJLZ().onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        LJLZ().onResume();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C30892CAm Yd0;
        LJLZ().LIZ();
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null && (Yd0 = iBrowserService.Yd0()) != null) {
            Yd0.LIZ();
        }
        if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue()) {
            LJLZ().LIZJ();
        }
    }

    @Override // X.InterfaceC28772BQy
    public final void LJJIJL(String str) {
        int i;
        UOY uoy;
        if (LJLZ().LIZIZ() != null) {
            return;
        }
        String shortTouchUrl = GoodyBagURLConfig.INSTANCE.getShortTouchUrl();
        boolean isAnchor = LJLZ().isAnchor();
        IRankService iRankService = (IRankService) CN1.LIZ(IRankService.class);
        if (iRankService != null) {
            i = iRankService.xh0();
        } else {
            i = 0;
        }
        Uri uri = C1EU.LIZIZ(shortTouchUrl, "initial_data", str).appendQueryParameter("is_anchor", String.valueOf(isAnchor ? 1 : 0)).appendQueryParameter("online_watch_users", String.valueOf(i)).appendQueryParameter(WM7.SCENE_SERVICE, LJZ()).appendQueryParameter("action_type", BJM.LIZLLL()).appendQueryParameter("enter_from_merge", BJM.LJFF()).appendQueryParameter("enter_method", BJM.LJIIIIZZ()).build();
        o.LJIIIIZZ(uri, "uri");
        InterfaceC30642C0w FX = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).FX(this.context, uri, "shortTouchTypeGoodyBag", true);
        if (FX != null) {
            BR9 LJLZ = LJLZ();
            FX.LIZ();
            LJLZ.LIZJ();
            IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
            if (this.LJLJI && this.LJLIL != null) {
                uoy = new BRQ(this);
            } else {
                uoy = null;
            }
            iShortTouchService.B10(FX, uoy);
        }
    }

    @Override // X.InterfaceC28772BQy
    public final void LJJJJI(BR0 sendGoodyBag) {
        int i;
        int i2;
        Uri build;
        o.LJIIIZ(sendGoodyBag, "sendGoodyBag");
        String sendUrl = GoodyBagURLConfig.INSTANCE.getSendUrl();
        if (sendUrl != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("openGoodyBagCreate ");
            LIZ.append(sendUrl);
            C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ));
            Uri parse = UriProtector.parse(sendUrl);
            IRankService iRankService = (IRankService) CN1.LIZ(IRankService.class);
            boolean z = false;
            if (iRankService != null) {
                i = iRankService.xh0();
            } else {
                i = 0;
            }
            if (LJLZ().LIZIZ() != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("hasGoodyBag: ");
            LIZ2.append(i2);
            C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ2));
            String queryParameter = UriProtector.getQueryParameter(parse, "gravity");
            if (queryParameter == null || queryParameter.length() == 0) {
                z = true;
            }
            if (z) {
                build = parse.buildUpon().appendQueryParameter("gravity", "bottom").appendQueryParameter("online_watch_users", String.valueOf(i)).appendQueryParameter(WM7.SCENE_SERVICE, LJZ()).appendQueryParameter("action_type", BJM.LIZLLL()).appendQueryParameter("enter_from_merge", BJM.LJFF()).appendQueryParameter("enter_method", BJM.LJIIIIZZ()).appendQueryParameter("has_goody_bag", String.valueOf(i2)).build();
            } else {
                build = parse.buildUpon().appendQueryParameter("online_watch_users", String.valueOf(i)).appendQueryParameter(WM7.SCENE_SERVICE, LJZ()).appendQueryParameter("action_type", BJM.LIZLLL()).appendQueryParameter("enter_from_merge", BJM.LJFF()).appendQueryParameter("enter_method", BJM.LJIIIIZZ()).appendQueryParameter("has_goody_bag", String.valueOf(i2)).build();
            }
            String uri = build.toString();
            o.LJIIIIZZ(uri, "uri.toString()");
            if (((IHostAction) CN1.LIZ(IHostAction.class)).hostInterceptSpark(uri)) {
                IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                iHybridContainerService.Vs0(context, uri, new AqS171S0100000_5(this, 589));
                return;
            }
            PopupContainerFragment Mo = ((IBrowserService) CN1.LIZ(IBrowserService.class)).Mo(new PopupConfig(build));
            if ((Mo instanceof BaseDialogFragment) && Mo != null) {
                Mo.LJLILLLLZI = new IDDListenerS145S0100000_5(this, 5);
            }
            Context context2 = this.context;
            o.LJIIIIZZ(context2, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI == null) {
                return;
            }
            Mo.getClass();
            BaseDialogFragment.wl(LJJIFFI, Mo);
            return;
        }
        C0NB.LJ("GoodyBagWidget", "openGoodyBagCreate: send url is empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0410  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // X.InterfaceC28772BQy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI(webcast.api.goody_bag.GetGoodyBagLotteryResponse.ResponseData r35) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget.LJLI(webcast.api.goody_bag.GetGoodyBagLotteryResponse$ResponseData):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0206  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget.onLoad(java.lang.Object[]):void");
    }
}
