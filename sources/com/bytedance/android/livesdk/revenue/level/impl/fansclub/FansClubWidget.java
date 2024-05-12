package com.bytedance.android.livesdk.revenue.level.impl.fansclub;

import X.B83;
import X.C0K2;
import X.C15380j0;
import X.C29374Bfu;
import X.C29760Bm8;
import X.C29770BmI;
import X.C29771BmJ;
import X.C29774BmM;
import X.C29791Bmd;
import X.C29927Bop;
import X.C30725C4b;
import X.C47261Igj;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72818Shy;
import X.C73994T2g;
import X.CN1;
import X.CXI;
import X.EnumC31509CYf;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC64592gB;
import X.Q7L;
import X.Q8U;
import X.T28;
import X.XJ8;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubReadConfigThreadSetting;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.OpenFansClubPageEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.ShowFansClubToastEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdk.watch.HorizontalOrientationChangeEvent;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class FansClubWidget extends RoomRecycleWidget {
    public final C5H3 LJLIL;
    public final C29760Bm8 LJLILLLLZI;

    public FansClubWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(FansClubViewModel.class);
        this.LJLIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, XJ8.WIDGET, new AqS155S0100000_5(LIZ, 270), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LJLILLLLZI = new C29760Bm8(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final FansClubViewModel LJLZ() {
        return (FansClubViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager;
        super.onUnload();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.FANS_EVENT_MESSAGE.getIntType(), LJLZ());
        }
        C73994T2g.LJJIIZI();
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            Handler LIZ = C29774BmM.LIZ();
            if (LIZ != null) {
                LIZ.removeMessages(0);
            }
        } else {
            C29791Bmd.LIZJ.LIZ.removeMessages(0);
        }
        C72818Shy.LJII("tt_live_fans_club_event_quit", this.LJLILLLLZI);
        C72818Shy.LJII("tt_live_fans_club_event_quit_clear_data", this.LJLILLLLZI);
        C72818Shy.LJII("FE_FANS_LEVEL_FETCH_TASK_DATA", this.LJLILLLLZI);
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        if (iFansClubService instanceof FansClubService) {
            iFansClubService.Q1();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        FansClubViewModel LJLZ;
        IMessageManager iMessageManager;
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.FANS_EVENT_MESSAGE.getIntType(), LJLZ());
        }
        C72818Shy.LIZLLL("tt_live_fans_club_event_quit", this.LJLILLLLZI);
        C72818Shy.LIZLLL("tt_live_fans_club_event_quit_clear_data", this.LJLILLLLZI);
        C72818Shy.LIZLLL("FE_FANS_LEVEL_FETCH_TASK_DATA", this.LJLILLLLZI);
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        if (iFansClubService instanceof FansClubService) {
            FansClubViewModel LJLZ2 = LJLZ();
            if (LJLZ2 != null) {
                iFansClubService.Et0(LJLZ2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        dataChannel2.ov0(this, RoomChannel.class, new AqS171S0100000_5(this, 785));
        dataChannel2.lv0(this, ShowFansClubToastEvent.class, new AqS171S0100000_5(this, 786));
        dataChannel2.lv0(this, OpenFansClubPageEvent.class, new AqS171S0100000_5(this, 787));
        try {
            if (FansClubReadConfigThreadSetting.INSTANCE.getValue()) {
                C29770BmI c29770BmI = C29770BmI.INSTANCE;
                if (HandlerThreadOptSetting.INSTANCE.enable()) {
                    ARunnableS41S0100000_5 aRunnableS41S0100000_5 = new ARunnableS41S0100000_5(c29770BmI, 342);
                    Handler LIZ = C29774BmM.LIZ();
                    if (LIZ != null) {
                        LIZ.post(aRunnableS41S0100000_5);
                    }
                } else {
                    C29791Bmd c29791Bmd = C29791Bmd.LIZJ;
                    ARunnableS41S0100000_5 aRunnableS41S0100000_52 = new ARunnableS41S0100000_5(c29770BmI, 342);
                    if (!c29791Bmd.LIZIZ.isAlive()) {
                        C0K2.LIZ("thread not alive", new Throwable());
                    }
                    c29791Bmd.LIZ.post(aRunnableS41S0100000_52);
                }
            } else {
                C29771BmJ.LIZ();
            }
        } catch (Throwable th) {
            C0K2.LIZ("fansClub load config from cache exception", th);
        }
        if (!C29771BmJ.LJII && (LJLZ = LJLZ()) != null) {
            AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this, 485);
            if (LJLZ.LJLJJI) {
                T28.LIZLLL(((FansClubApi) Q7L.LIZIZ(FansClubApi.class)).getFansConfig()).LJJII(new AfS57S0100000_5(aqS171S0100000_5, 356), new InterfaceC64592gB() { // from class: X.9Df
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.lv0(this, FansClubEvent.class, new AqS171S0100000_5(this, 486));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, OrientationChangeEvent.class, new AqS171S0100000_5(this, 487));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.lv0(this, HorizontalOrientationChangeEvent.class, new AqS171S0100000_5(this, 488));
        }
    }

    public final void LJZ(String str, BadgeStruct badgeStruct, String str2, String str3) {
        IMessageManager iMessageManager;
        InterfaceC05190Ih interfaceC05190Ih;
        int i;
        long j;
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        RoomMessage roomMessage = new RoomMessage();
        roomMessage.isLocalInsertMsg = true;
        roomMessage.scene = str2;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ == null || (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) == null) {
            return;
        }
        User user = (User) interfaceC05190Ih;
        Text text = new Text();
        text.key = str3;
        if (TextUtils.equals(str2, "user_fans_upgrade")) {
            i = R.string.l7h;
        } else {
            i = R.string.l7f;
        }
        text.defaultPattern = C15380j0.LJIILJJIL(i);
        TextFormat textFormat = new TextFormat();
        textFormat.color = "#ffffff";
        text.defaultFormat = textFormat;
        TextPieceUser textPieceUser = new TextPieceUser();
        C73994T2g.LJJIJ(10, badgeStruct, user);
        textPieceUser.user = user;
        TextPiece textPiece = new TextPiece();
        textPiece.userValue = textPieceUser;
        textPiece.type = CXI.USER.getPieceType();
        TextFormat textFormat2 = new TextFormat();
        textFormat2.color = Q8U.LIZIZ(new Object[]{Integer.valueOf(C15380j0.LIZIZ(R.color.aao))}, 1, "#%x", "format(format, *args)");
        textPiece.format = textFormat2;
        TextPiece textPiece2 = new TextPiece();
        textPiece2.type = CXI.STRING.getPieceType();
        textPiece2.stringValue = str;
        text.pieces = C47261Igj.LJJIJIIJI(textPiece, textPiece2);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        }
        CommonMessageData commonMessageData = new CommonMessageData();
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        commonMessageData.roomId = j;
        commonMessageData.showMsg = true;
        commonMessageData.messageId = C30725C4b.LIZ();
        commonMessageData.foldType = 0L;
        commonMessageData.displayText = text;
        roomMessage.baseMessage = commonMessageData;
        if (iMessageManager == null) {
            return;
        }
        iMessageManager.insertMessage(roomMessage, true);
    }
}
