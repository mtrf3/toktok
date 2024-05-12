package X;

import Y.AfS57S0100000_5;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.gift.ClearGiftMessageEvent;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.NormalGiftDisplayForVideoEvent;
import com.bytedance.android.live.gift.NormalGiftDisplayStatusEvent;
import com.bytedance.android.live.gift.NormalGiftLayoutBottomMarginUpdateEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.GiftDialogSizeChanged;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdkapi.dataChannel.GiftDialogSwitchDataChannelEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS48S0110000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.ChF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32005ChF {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC31765CdN LIZJ;
    public final MutableLiveData<Boolean> LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final C73318Sq2 LJII;
    public C32006ChG LJIIIIZZ;

    public final boolean LIZ() {
        Room room;
        DataChannel dataChannel;
        boolean z;
        boolean z2;
        CLB clb;
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room == null || (dataChannel = this.LIZ) == null || dataChannel.kv0(UserIsAnchorChannel.class) == null) {
            return false;
        }
        Object kv0 = this.LIZ.kv0(UserIsAnchorChannel.class);
        Boolean bool = Boolean.TRUE;
        boolean LJ = o.LJ(kv0, bool);
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null && roomAuthStatus.isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        if (((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC31154CKo LIZIZ = C31153CKn.LIZIZ(LJ, z2, z);
        if (LIZIZ != EnumC31154CKo.SHOW) {
            if (LIZIZ != EnumC31154CKo.GREY) {
                return false;
            }
            if (C31156CKq.LIZ(LJ, z2, z) == EnumC31155CKp.TOAST) {
                if (room.getRoomAuthStatus() == null || room.getRoomAuthStatus().getRoomAuthOffReasons() == null || room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() == null) {
                    return false;
                }
                C30868C9o.LJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
                this.LIZ.qv0(LogGiftCloseToastShowEvent.class, bool);
                return false;
            }
            InterfaceC31765CdN interfaceC31765CdN = this.LIZJ;
            if (interfaceC31765CdN == null || (clb = ((GiftWidget) interfaceC31765CdN).LJLLI) == null) {
                return false;
            }
            clb.LJFF("", false);
            return false;
        }
        return true;
    }

    public C32005ChF(DataChannel dataChannel, C31782Cde<Object> autoUnbindTransformer, LifecycleOwner lifecycleOwner, InterfaceC31765CdN interfaceC31765CdN, boolean z) {
        XWV xwv;
        o.LJIIIZ(autoUnbindTransformer, "autoUnbindTransformer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = interfaceC31765CdN;
        this.LIZLLL = new MutableLiveData<>();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJII = c73318Sq2;
        this.LJIIIIZZ = new C32006ChG(this);
        if (dataChannel != null) {
            dataChannel.lv0(lifecycleOwner, NormalGiftDisplayStatusEvent.class, new AqS171S0100000_5(this, 572));
            dataChannel.lv0(lifecycleOwner, GiftDialogSwitchDataChannelEvent.class, new AqS171S0100000_5(this, 573));
            dataChannel.lv0(lifecycleOwner, SendGiftEvent.class, new AqS171S0100000_5(this, 574));
            dataChannel.lv0(lifecycleOwner, KeyboardStatusChannel.class, new AqS171S0100000_5(this, 575));
            dataChannel.lv0(lifecycleOwner, NormalGiftDisplayForVideoEvent.class, new AqS171S0100000_5(this, 576));
            dataChannel.lv0(lifecycleOwner, PreShowKeyboardEvent.class, new AqS171S0100000_5(this, 577));
            dataChannel.lv0(lifecycleOwner, ClearGiftMessageEvent.class, new AqS171S0100000_5(this, 578));
            dataChannel.ov0(lifecycleOwner, NormalGiftLayoutBottomMarginUpdateEvent.class, new AqS171S0100000_5(this, 579));
            dataChannel.ov0(lifecycleOwner, MultiLiveRTCLayoutChannel.class, new AqS48S0110000_5(this, z, 2));
        }
        c73318Sq2.LIZ(C73943T0h.LIZ().LJ(C29428Bgm.class).LJII(autoUnbindTransformer).LJJJJZI(new AfS57S0100000_5(this, 196)));
        c73318Sq2.LIZ(C73943T0h.LIZ().LJ(C32008ChI.class).LJJJJZI(new AfS57S0100000_5(this, 197)));
        c73318Sq2.LIZ(C73943T0h.LIZ().LJ(C32305Cm5.class).LJJJJZI(new AfS57S0100000_5(this, 198)));
        c73318Sq2.LIZ(C73943T0h.LIZ().LJ(B43.class).LJJJJZI(new AfS57S0100000_5(this, 199)));
        c73318Sq2.LIZ(C73943T0h.LIZ().LJ(C32010ChK.class).LJJJJZI(new AfS57S0100000_5(this, 200)));
        DataChannelGlobal.LJLJJI.nv0(lifecycleOwner, lifecycleOwner, SubscribeSuccessEvent.class, new AqS171S0100000_5(this, 569));
        if (dataChannel != null) {
            dataChannel.lv0(lifecycleOwner, GiftDialogSizeChanged.class, new AqS171S0100000_5(this, 570));
            dataChannel.lv0(lifecycleOwner, GiftDialogDismissEvent.class, new AqS171S0100000_5(this, 571));
        }
        if (interfaceC31765CdN != null) {
            GiftWidget giftWidget = (GiftWidget) interfaceC31765CdN;
            if (((Boolean) giftWidget.dataChannel.kv0(BCW.class)).booleanValue() && (xwv = giftWidget.LL) != null) {
                ((AbsAudienceInteractionFragment) xwv.LJLIL).changeTextMessageViewHeight();
            }
        }
    }
}
