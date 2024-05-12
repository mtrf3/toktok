package X;

import Y.AfS1S1101100_5;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.room.ChatMessageReplaceEvent;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBag;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBagToast;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.LiveSendGoodyBagEvent;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCoinDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.impl.revenue.goodybag.api.GoodyBagApi;
import com.bytedance.android.livesdk.impl.revenue.goodybag.model.GoodyBag4FEModel;
import com.bytedance.android.livesdk.impl.revenue.goodybag.model.GoodyBagShortTouchInitData;
import com.bytedance.android.livesdk.impl.revenue.goodybag.model.GoodyBagShourTouchModel4FE;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* loaded from: classes6.dex */
public final class BR1 implements BR9 {
    public DataChannel LIZ;
    public InterfaceC28772BQy LIZIZ;
    public boolean LIZJ;
    public Room LIZLLL;
    public boolean LJ;
    public volatile boolean LJFF;
    public String LJI;
    public final BR2 LJII = new BR2(this);
    public final C28771BQx LJIIIIZZ = new C28771BQx(this);
    public GoodyBagMessage LJIIIZ;
    public GoodyBagBaseInfo LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public XKQ LJIILIIL;

    @Override // X.BR9
    public final void LIZ() {
        IMessageManager iMessageManager;
        this.LIZIZ = null;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this.LJII);
        }
        C72818Shy.LJII("EVENT_GOODY_BAG_CREATE_SUCCESS", this.LJIIIIZZ);
        C72818Shy.LJII("EVENT_GOODY_BAG_END", this.LJIIIIZZ);
        C72818Shy.LJII("EVENT_GOODY_BAG_SHARE_EVENT", this.LJIIIIZZ);
        if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue()) {
            this.LIZLLL = null;
        }
    }

    @Override // X.BR9
    public final void LIZJ() {
    }

    public final void LJIIIZ() {
        int i;
        String str;
        String str2;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
        if (goodyBagBaseInfo != null) {
            String str3 = goodyBagBaseInfo.goodyBagId;
            GoodyBagCommonDetail goodyBagCommonDetail = goodyBagBaseInfo.commonDetail;
            if (goodyBagCommonDetail != null) {
                i = goodyBagCommonDetail.openAt;
            } else {
                i = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = this.LJIIJJI;
            if (i2 == 3) {
                LJIIL();
                return;
            }
            boolean z = this.LIZJ;
            HashMap LIZ = C1R5.LIZ(str3, "goodyBagId");
            B83 LIZ2 = B83.LIZ();
            if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                UFE.LIZJ(interfaceC05190Ih, LIZ, "user_id");
            }
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.put("is_anchor", str);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                LIZ.put("room_id", idStr);
                LIZ.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                User owner = room.getOwner();
                if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str2 = Q4K.LIZJ(followInfo)) == null) {
                    str2 = "";
                }
                LIZ.put("follow_status", str2);
            }
            C116484hg.LIZIZ(LIZ, "goody_bag_id", str3, i, "open_at");
            LIZ.put("time_diff", String.valueOf(C31012CFc.LIZIZ));
            LIZ.put("dur_from_open_at", String.valueOf(C31012CFc.LIZIZ() - (i * 1000)));
            LIZ.put("retry_count", String.valueOf(i2));
            BZI LIZ3 = C28787BRn.LIZ("livesdk_goody_bag_lottery_request");
            LIZ3.LJIIZILJ();
            LIZ3.LJJIFFI(LIZ);
            LIZ3.LJIIL("other");
            LIZ3.LJIIIZ("live");
            LIZ3.LJJIIJZLJL();
            C0K2.LJII(0, "ttlive_goody_bag_lottery_request", LIZ);
            C65814PsI.LIZ().getClass();
            T28.LIZLLL(((GoodyBagApi) C65814PsI.LIZJ(GoodyBagApi.class)).getUserIfWinner(str3)).LJJII(new AfS1S1101100_5(this, str3, i, currentTimeMillis, 0), new AfS1S1101100_5(this, str3, i, currentTimeMillis, 1));
        }
    }

    public final void LJIILIIL() {
        int i;
        String str;
        String str2;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
        if (goodyBagBaseInfo != null) {
            String str3 = goodyBagBaseInfo.goodyBagId;
            GoodyBagCommonDetail goodyBagCommonDetail = goodyBagBaseInfo.commonDetail;
            if (goodyBagCommonDetail != null) {
                i = goodyBagCommonDetail.openAt;
            } else {
                i = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = this.LJIIJJI;
            if (i2 == 3) {
                LJIIL();
                return;
            }
            boolean z = this.LIZJ;
            HashMap LIZ = C1R5.LIZ(str3, "goodyBagId");
            B83 LIZ2 = B83.LIZ();
            if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                UFE.LIZJ(interfaceC05190Ih, LIZ, "user_id");
            }
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.put("is_anchor", str);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                LIZ.put("room_id", idStr);
                LIZ.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                User owner = room.getOwner();
                if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str2 = Q4K.LIZJ(followInfo)) == null) {
                    str2 = "";
                }
                LIZ.put("follow_status", str2);
            }
            C116484hg.LIZIZ(LIZ, "goody_bag_id", str3, i, "open_at");
            LIZ.put("time_diff", String.valueOf(C31012CFc.LIZIZ));
            LIZ.put("dur_from_open_at", String.valueOf(C31012CFc.LIZIZ() - (i * 1000)));
            LIZ.put("request_platform", "client");
            LIZ.put("retry_count", String.valueOf(i2));
            BZI LIZ3 = C28787BRn.LIZ("livesdk_goody_bag_winner_list_request");
            LIZ3.LJIIZILJ();
            LIZ3.LJJIFFI(LIZ);
            LIZ3.LJIIL("other");
            LIZ3.LJIIIZ("live");
            LIZ3.LJJIIJZLJL();
            C0K2.LJII(0, "ttlive_goody_bag_winner_list_request", LIZ);
            C65814PsI.LIZ().getClass();
            T28.LIZLLL(((GoodyBagApi) C65814PsI.LIZJ(GoodyBagApi.class)).getWinnerList(str3, 0L, 200L)).LJJII(new AfS1S1101100_5(this, str3, i, currentTimeMillis, 2), new AfS1S1101100_5(this, str3, i, currentTimeMillis, 3));
        }
    }

    @Override // X.BR9
    public final void onPause() {
    }

    @Override // X.BR9
    public final void onResume() {
    }

    public final void LJI() {
        IWalletCenter walletCenter;
        C0NB.LIZIZ("GoodyBagPresenter", "anchorOpenWinnerPage: ");
        IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
        if (iWalletService != null && (walletCenter = iWalletService.walletCenter()) != null) {
            ((WalletCenter) walletCenter).LJIIJ();
        }
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C28759BQl(this, null), 3);
    }

    public final void LJIIJJI() {
        String str;
        int i;
        Context LJFF;
        InterfaceC28772BQy interfaceC28772BQy;
        Context LJFF2;
        boolean z;
        Boolean bool;
        GoodyBagCommonDetail goodyBagCommonDetail;
        C0NB.LIZIZ("GoodyBagPresenter", "preOpenWinnerPage");
        XKQ xkq = this.LJIILIIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
        if (goodyBagBaseInfo == null || (str = goodyBagBaseInfo.goodyBagId) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (goodyBagBaseInfo != null && (goodyBagCommonDetail = goodyBagBaseInfo.commonDetail) != null) {
            i = goodyBagCommonDetail.openAt;
        } else {
            i = 0;
        }
        ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(UOS.NAME, "shortTouchTypeGoodyBag");
        if (!this.LIZJ && (interfaceC28772BQy = this.LIZIZ) != null && (LJFF2 = interfaceC28772BQy.LJFF()) != null) {
            IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
            if (iBrowserService == null || (bool = (Boolean) iBrowserService.Wn(LJFF2, "AUDIENCE_JOINED_GOODY_BAG")) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            this.LJ = z;
        }
        boolean z2 = this.LIZJ;
        if (!z2) {
            if (this.LJ) {
                BR4.LJ(i, str, z2);
                GoodyBagMessage goodyBagMessage = this.LJIIIZ;
                if (goodyBagMessage != null && goodyBagMessage.winners != null) {
                    C0NB.LIZIZ("GoodyBagPresenter", "openMsgIsNotNull Audience Open");
                    LJII(null);
                    return;
                } else {
                    XKX.LIZLLL(C780334l.LJLIL, null, null, new C28755BQh(this, null), 3);
                    return;
                }
            }
            LJIIL();
            return;
        }
        BR4.LJ(i, str, z2);
        InterfaceC28772BQy interfaceC28772BQy2 = this.LIZIZ;
        if (interfaceC28772BQy2 == null || (LJFF = interfaceC28772BQy2.LJFF()) == null) {
            return;
        }
        IBrowserService iBrowserService2 = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService2 == null || !o.LJ(iBrowserService2.Wn(LJFF, "ANCHOR_OPENED_GOODY_BAG_PANEL"), Boolean.TRUE)) {
            GoodyBagMessage goodyBagMessage2 = this.LJIIIZ;
            if (goodyBagMessage2 != null && goodyBagMessage2.winners != null) {
                LJI();
                return;
            } else {
                XKX.LIZLLL(C780334l.LJLIL, null, null, new C28756BQi(this, null), 3);
                return;
            }
        }
        C0NB.LIZIZ("GoodyBagPresenter", "ANCHOR_OPENED_GOODY_BAG_PANEL");
        LJIIL();
    }

    public final void LJIIL() {
        C0NB.LIZIZ("GoodyBagPresenter", "reSetStatus");
        LJIILJJIL(false);
        this.LJIIJ = null;
        C28773BQz.LIZ = null;
        this.LJIIIZ = null;
        this.LJIIJJI = 0;
        this.LJIIL = false;
        this.LJFF = false;
        this.LJI = null;
        XKQ xkq = this.LJIILIIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    @Override // X.BR9
    public final GoodyBagBaseInfo LIZIZ() {
        return this.LJIIJ;
    }

    @Override // X.BR9
    public final GoodyBagMessage LIZLLL() {
        return this.LJIIIZ;
    }

    @Override // X.BR9
    public final boolean isAnchor() {
        return this.LIZJ;
    }

    @Override // X.BR9
    public final void LJ(GetRoomGoodyBagResponse.ResponseData goodyBag) {
        int i;
        Number number;
        int i2;
        int i3;
        int i4;
        GoodyBagCommonDetail goodyBagCommonDetail;
        GoodyBagCommonDetail goodyBagCommonDetail2;
        GoodyBagCoinDetail goodyBagCoinDetail;
        GoodyBagCommonDetail goodyBagCommonDetail3;
        String str;
        GoodyBagCommonDetail goodyBagCommonDetail4;
        GoodyBagCommonDetail goodyBagCommonDetail5;
        User owner;
        String str2;
        List<String> urls;
        o.LJIIIZ(goodyBag, "goodyBag");
        if (C29306Beo.LJIJJLI(goodyBag.goodyBagId) && !this.LJFF) {
            this.LJFF = true;
            C0NB.LIZIZ("GoodyBagPresenter", "getGoodyBagRoom");
            boolean z = goodyBag.joined;
            GoodyBagShourTouchModel4FE goodyBagShourTouchModel4FE = new GoodyBagShourTouchModel4FE();
            ArrayList arrayList = new ArrayList();
            GoodyBagShortTouchInitData goodyBagShortTouchInitData = new GoodyBagShortTouchInitData();
            Room room = this.LIZLLL;
            int i5 = 0;
            String str3 = "";
            if (room != null && (owner = room.getOwner()) != null) {
                ImageModel avatarLarge = owner.getAvatarLarge();
                if (avatarLarge == null || (urls = avatarLarge.getUrls()) == null || (str2 = (String) ListProtector.get(urls, 0)) == null) {
                    str2 = "";
                }
                goodyBagShortTouchInitData.anchorAvatarUrl = str2;
                String LJ = C05170If.LJ(owner);
                o.LJIIIIZZ(LJ, "getUsername(this)");
                goodyBagShortTouchInitData.anchorName = LJ;
            }
            goodyBagShortTouchInitData.goodyBagId = goodyBag.goodyBagId;
            GoodyBagBaseInfo goodyBagBaseInfo = goodyBag.baseInfo;
            if (goodyBagBaseInfo != null) {
                i = goodyBagBaseInfo.biz;
            } else {
                i = 0;
            }
            goodyBagShortTouchInitData.goodyBagBiz = i;
            if (goodyBagBaseInfo != null && (goodyBagCommonDetail5 = goodyBagBaseInfo.commonDetail) != null) {
                number = Integer.valueOf(goodyBagCommonDetail5.openAt);
            } else {
                number = 0L;
            }
            goodyBagShortTouchInitData.openAt = number.longValue() - (C31012CFc.LIZIZ / 1000);
            GoodyBagBaseInfo goodyBagBaseInfo2 = goodyBag.baseInfo;
            if (goodyBagBaseInfo2 != null && (goodyBagCommonDetail4 = goodyBagBaseInfo2.commonDetail) != null) {
                i2 = goodyBagCommonDetail4.participateMethod;
            } else {
                i2 = 0;
            }
            goodyBagShortTouchInitData.participateMethod = i2;
            if (goodyBagBaseInfo2 != null && (goodyBagCommonDetail3 = goodyBagBaseInfo2.commonDetail) != null && (str = goodyBagCommonDetail3.participateMethodContent) != null) {
                str3 = str;
            }
            goodyBagShortTouchInitData.participateMethodContent = str3;
            if (goodyBagBaseInfo2 != null && (goodyBagCoinDetail = goodyBagBaseInfo2.coinDetail) != null) {
                i3 = goodyBagCoinDetail.totalCoin;
            } else {
                i3 = 0;
            }
            goodyBagShortTouchInitData.totalCoins = i3;
            if (goodyBagBaseInfo2 != null && (goodyBagCommonDetail2 = goodyBagBaseInfo2.commonDetail) != null) {
                i4 = goodyBagCommonDetail2.winnerHeadcount;
            } else {
                i4 = 0;
            }
            goodyBagShortTouchInitData.winnerHeadCount = i4;
            if (goodyBagBaseInfo2 != null && (goodyBagCommonDetail = goodyBagBaseInfo2.commonDetail) != null) {
                i5 = goodyBagCommonDetail.countDownMinutes;
            }
            goodyBagShortTouchInitData.countDownMinutes = i5;
            goodyBagShourTouchModel4FE.timeDiff = C31012CFc.LIZIZ;
            goodyBagShortTouchInitData.timeDiff = C31012CFc.LIZIZ;
            arrayList.add(goodyBagShortTouchInitData);
            goodyBagShourTouchModel4FE.goodyBagList = arrayList;
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, goodyBagShourTouchModel4FE);
            o.LJIIIIZZ(json, "gson.toJson(model)");
            InterfaceC28772BQy interfaceC28772BQy = this.LIZIZ;
            if (interfaceC28772BQy != null) {
                interfaceC28772BQy.LJJIJL(json);
            }
            this.LJIIJ = goodyBag.baseInfo;
            LJIIJ("api");
            LJIILJJIL(z);
            C28773BQz.LIZ = this.LJIIJ;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bytedance.android.livesdk.model.message.GoodyBagMessage, O] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo, O] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [webcast.api.goody_bag.GetGoodyBagLotteryResponse$ResponseData, O] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void LJII(GetGoodyBagLotteryResponse.ResponseData responseData) {
        String str;
        ?? r3;
        Boolean bool;
        IWalletCenter walletCenter;
        IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
        if (iWalletService != null && (walletCenter = iWalletService.walletCenter()) != null) {
            ((WalletCenter) walletCenter).LJIIJ();
        }
        GoodyBag4FEModel goodyBag4FEModel = new GoodyBag4FEModel();
        GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
        if (goodyBagBaseInfo == null || (str = goodyBagBaseInfo.goodyBagId) == null) {
            str = "";
        }
        goodyBag4FEModel.goodyBagId = str;
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(new JSONObject(GsonProtectorUtils.toJson(C09650Zl.LIZIZ, goodyBag4FEModel))), "EVENT_GOODY_BAG_OPEN"));
        if (responseData != null) {
            GetGoodyBagLotteryResponse.ResponseData responseData2 = new GetGoodyBagLotteryResponse.ResponseData();
            responseData2.win = responseData.win;
            responseData2.coins = responseData.coins;
            r3 = responseData2;
        } else {
            r3 = 0;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BCW.class)) != null && !bool.booleanValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            ((C32537Cpp) dataChannelGlobal.gv0(C29043BaZ.class)).LIZ = this.LJIIIZ;
            ((C32537Cpp) dataChannelGlobal.gv0(C29021BaD.class)).LIZ = this.LJIIJ;
            ((C32537Cpp) dataChannelGlobal.gv0(C29045Bab.class)).LIZ = r3;
            ((C32537Cpp) dataChannelGlobal.gv0(C29024BaG.class)).LIZ = Boolean.TRUE;
            LJIIL();
            C73943T0h.LIZ().LIZIZ(new B3N("goody_bag_open_winner_horizontal"));
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C28762BQo(this, r3, null), 3);
    }

    public final String LJIIIIZZ(GoodyBagBaseInfo goodyBagBaseInfo) {
        boolean z;
        Number number;
        int i;
        int i2;
        int i3;
        String str;
        User owner;
        String str2;
        List<String> urls;
        int i4 = 0;
        if (goodyBagBaseInfo == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        GoodyBagShourTouchModel4FE goodyBagShourTouchModel4FE = new GoodyBagShourTouchModel4FE();
        ArrayList arrayList = new ArrayList();
        GoodyBagShortTouchInitData goodyBagShortTouchInitData = new GoodyBagShortTouchInitData();
        Room room = this.LIZLLL;
        String str3 = "";
        if (room != null && (owner = room.getOwner()) != null) {
            ImageModel avatarLarge = owner.getAvatarLarge();
            if (avatarLarge == null || (urls = avatarLarge.getUrls()) == null || (str2 = (String) ListProtector.get(urls, 0)) == null) {
                str2 = "";
            }
            goodyBagShortTouchInitData.anchorAvatarUrl = str2;
            String LJ = C05170If.LJ(owner);
            o.LJIIIIZZ(LJ, "getUsername(this)");
            goodyBagShortTouchInitData.anchorName = LJ;
        }
        if (goodyBagBaseInfo != null) {
            goodyBagShortTouchInitData.goodyBagId = goodyBagBaseInfo.goodyBagId;
            goodyBagShortTouchInitData.goodyBagBiz = goodyBagBaseInfo.biz;
            GoodyBagCommonDetail goodyBagCommonDetail = goodyBagBaseInfo.commonDetail;
            if (goodyBagCommonDetail != null) {
                number = Integer.valueOf(goodyBagCommonDetail.openAt);
            } else {
                number = 0L;
            }
            goodyBagShortTouchInitData.openAt = number.longValue() - (C31012CFc.LIZIZ / 1000);
            GoodyBagCommonDetail goodyBagCommonDetail2 = goodyBagBaseInfo.commonDetail;
            if (goodyBagCommonDetail2 != null) {
                i = goodyBagCommonDetail2.participateMethod;
            } else {
                i = 0;
            }
            goodyBagShortTouchInitData.participateMethod = i;
            if (goodyBagCommonDetail2 != null && (str = goodyBagCommonDetail2.participateMethodContent) != null) {
                str3 = str;
            }
            goodyBagShortTouchInitData.participateMethodContent = str3;
            GoodyBagCoinDetail goodyBagCoinDetail = goodyBagBaseInfo.coinDetail;
            if (goodyBagCoinDetail != null) {
                i2 = goodyBagCoinDetail.totalCoin;
            } else {
                i2 = 0;
            }
            goodyBagShortTouchInitData.totalCoins = i2;
            if (goodyBagCommonDetail2 != null) {
                i3 = goodyBagCommonDetail2.winnerHeadcount;
            } else {
                i3 = 0;
            }
            goodyBagShortTouchInitData.winnerHeadCount = i3;
            if (goodyBagCommonDetail2 != null) {
                i4 = goodyBagCommonDetail2.countDownMinutes;
            }
            goodyBagShortTouchInitData.countDownMinutes = i4;
        }
        goodyBagShourTouchModel4FE.timeDiff = C31012CFc.LIZIZ;
        goodyBagShortTouchInitData.timeDiff = C31012CFc.LIZIZ;
        arrayList.add(goodyBagShortTouchInitData);
        goodyBagShourTouchModel4FE.goodyBagList = arrayList;
        return GsonProtectorUtils.toJson(C09650Zl.LIZIZ, goodyBagShourTouchModel4FE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, "api") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r6.element = (r1 * 60) * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r6.element >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r12.LJIILIIL = X.XKX.LIZLLL(X.C780334l.LJLIL, null, null, new X.C28758BQk(r6, r12, r8, r9, r13, null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r6.element = (r9 * 1000) - X.C31012CFc.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        r0 = r2.commonDetail;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001b, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001d, code lost:
    
        r1 = r0.countDownMinutes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r2 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r2 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.String r13) {
        /*
            r12 = this;
            X.2sW r6 = new X.2sW
            r6.<init>()
            r7 = r12
            com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo r2 = r7.LJIIJ
            r1 = 0
            if (r2 == 0) goto L44
            com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail r0 = r2.commonDetail
            if (r0 == 0) goto L44
            int r9 = r0.openAt
        L11:
            java.lang.String r8 = r2.goodyBagId
            if (r8 != 0) goto L19
        L15:
            java.lang.String r8 = ""
            if (r2 == 0) goto L1f
        L19:
            com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail r0 = r2.commonDetail
            if (r0 == 0) goto L1f
            int r1 = r0.countDownMinutes
        L1f:
            java.lang.String r0 = "api"
            r10 = r13
            boolean r0 = kotlin.jvm.internal.o.LJ(r10, r0)
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L3a
            long r0 = (long) r1
            r2 = 60
            long r0 = r0 * r2
            long r0 = r0 * r4
            r6.element = r0
        L31:
            long r0 = r6.element
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L48
            return
        L3a:
            long r0 = (long) r9
            long r0 = r0 * r4
            long r2 = X.C31012CFc.LIZIZ()
            long r0 = r0 - r2
            r6.element = r0
            goto L31
        L44:
            r9 = 0
            if (r2 == 0) goto L15
            goto L11
        L48:
            X.34l r1 = X.C780334l.LJLIL
            X.BQk r5 = new X.BQk
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 3
            X.XKQ r0 = X.XKX.LIZLLL(r1, r11, r11, r5, r0)
            r7.LJIILIIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BR1.LJIIJ(java.lang.String):void");
    }

    public final void LJIILJJIL(boolean z) {
        Context LJFF;
        String str;
        Object obj;
        String str2;
        FollowInfo followInfo;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        InterfaceC28772BQy interfaceC28772BQy = this.LIZIZ;
        if (interfaceC28772BQy != null && (LJFF = interfaceC28772BQy.LJFF()) != null) {
            IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
            if (iBrowserService != null) {
                iBrowserService.qk0(LJFF, Boolean.valueOf(z), "AUDIENCE_JOINED_GOODY_BAG");
            }
            this.LJ = z;
            GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (goodyBagBaseInfo == null || (str = goodyBagBaseInfo.goodyBagId) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            HashMap hashMap = new HashMap();
            B83 LIZ = B83.LIZ();
            if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
            }
            if (C30184Bsy.LIZ) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_anchor", obj);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                hashMap.put("room_id", idStr);
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                User owner = room.getOwner();
                if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str2 = Q4K.LIZJ(followInfo)) == null) {
                    str2 = "";
                }
                hashMap.put("follow_status", str2);
            }
            hashMap.put("goody_bag_id", str);
            if (z) {
                str3 = "1";
            }
            hashMap.put("joined", str3);
            BZI LIZ2 = C28787BRn.LIZ("livesdk_goody_bag_joined_storage_status");
            LIZ2.LJJIFFI(hashMap);
            LIZ2.LJIIZILJ();
            LIZ2.LJIIL("other");
            LIZ2.LJIIIZ("live");
            LIZ2.LJJIIJZLJL();
            C0K2.LJII(0, "ttlive_goody_bag_joined_storage_status", hashMap);
        }
    }

    @Override // X.BR9
    public final void LJFF(DataChannel dataChannel, InterfaceC28772BQy view) {
        boolean z;
        IMessageManager iMessageManager;
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attachView(");
        LIZ.append(dataChannel);
        LIZ.append(')');
        C0NB.LIZIZ("GoodyBagPresenter", X1D.LIZIZ(LIZ));
        this.LIZIZ = view;
        this.LIZ = dataChannel;
        Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LIZJ = z;
        this.LIZLLL = (Room) dataChannel.kv0(RoomChannel.class);
        this.LJ = false;
        LifecycleOwner lifecycleOwner = null;
        this.LJIILIIL = null;
        this.LJFF = false;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = 0;
        this.LJIIL = false;
        this.LJI = null;
        InterfaceC28772BQy interfaceC28772BQy = this.LIZIZ;
        if (interfaceC28772BQy instanceof LifecycleOwner) {
            o.LJII(interfaceC28772BQy, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            lifecycleOwner = (LifecycleOwner) interfaceC28772BQy;
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.lv0(lifecycleOwner, LiveSendGoodyBagEvent.class, new AqS171S0100000_5(this, 525));
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.lv0(lifecycleOwner, ChatMessageReplaceEvent.class, new AqS171S0100000_5(this, 526));
        }
        DataChannel dataChannel4 = this.LIZ;
        if (dataChannel4 != null) {
            dataChannel4.lv0(lifecycleOwner, ShareJoinInGoodyBag.class, new AqS171S0100000_5(this, 527));
        }
        DataChannel dataChannel5 = this.LIZ;
        if (dataChannel5 != null) {
            dataChannel5.lv0(lifecycleOwner, ShareJoinInGoodyBagToast.class, new AqS171S0100000_5(this, 528));
        }
        C72818Shy.LIZLLL("EVENT_GOODY_BAG_CREATE_SUCCESS", this.LJIIIIZZ);
        C72818Shy.LIZLLL("EVENT_GOODY_BAG_END", this.LJIIIIZZ);
        C72818Shy.LIZLLL("EVENT_GOODY_BAG_SHARE_EVENT", this.LJIIIIZZ);
        DataChannel dataChannel6 = this.LIZ;
        if (dataChannel6 != null && (iMessageManager = (IMessageManager) dataChannel6.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.GOODY_BAG_MESSAGE.getIntType(), this.LJII);
        }
    }
}
