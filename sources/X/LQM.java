package X;

import Y.ARunnableS45S0100000_9;
import Y.AfS36S0101000_5;
import Y.AfS61S0100000_9;
import Y.IDHandlerS9S0000000_9;
import android.content.Context;
import android.os.Message;
import android.view.View;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleGetSettingAvoidSwitchTab;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleWarmStarupSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingExtra;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingResponse;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleExtra;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LogPb;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LQM {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static LiveBubbleData LJFF;
    public static LiveBubbleData LJI;
    public static LiveBubbleExtra LJII;
    public static View LJIIIIZZ;
    public static View LJIIJ;
    public static View LJIIJJI;
    public static View LJIIL;
    public static BubbleSettingData LJIILL;
    public static LQ1 LJIILLIIL;
    public static boolean LJIIZILJ;
    public static boolean LJIJI;
    public static boolean LJIJJLI;
    public static long LJIL;
    public static boolean LJIIIZ = true;
    public static String LJIILIIL = "";
    public static String LJIILJJIL = "";
    public static boolean LJIJ = true;
    public static boolean LJIJJ = true;
    public static final IDHandlerS9S0000000_9 LJJ = new IDHandlerS9S0000000_9(C16880lQ.LLJJJJ(), 0);
    public static final RunnableC54221LPt LJJI = RunnableC54221LPt.LJLIL;

    public static boolean LIZIZ() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        return createIUserServicebyMonsterPlugin.isLogin() && o.LJ(LJIILJJIL, createIUserServicebyMonsterPlugin.getCurrentUserID());
    }

    public static void LIZLLL() {
        View view;
        LQ2.LJFF("livesdk_bubble_getLiveBubble");
        if (!LIZIZ() || LJIIZILJ) {
            return;
        }
        if ((LiveBubbleGetSettingAvoidSwitchTab.INSTANCE.disable() && !LJIJ) || (view = LJIIIIZZ) == null || !view.isShown() || LJ() || ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).isShowingInnerPush() || ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).isShowingAd()) {
            return;
        }
        IDHandlerS9S0000000_9 iDHandlerS9S0000000_9 = LJJ;
        C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).getLiveBubble()).LJJJLIIL(new AfS61S0100000_9(iDHandlerS9S0000000_9, 27), new AfS36S0101000_5(1, iDHandlerS9S0000000_9, 68));
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_bubble_interface")) {
            C28787BRn.LIZ("livesdk_bubble_interface").LJJIIJZLJL();
        }
    }

    public static boolean LJ() {
        if (LJIJJLI || ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).isShowingVideoGuide()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI() {
        LQ2.LJFF("livesdk_bubble_readBubbleSettingAndtryShowBubble");
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (!createIUserServicebyMonsterPlugin.isLogin()) {
            LQ2.LIZLLL("not_log_in");
            return;
        }
        String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
        o.LJIIIIZZ(currentUserID, "userService.currentUserID");
        LJIILJJIL = currentUserID;
        if (LJIIZILJ) {
            LQ2.LIZLLL("showed");
            return;
        }
        if (LiveBubbleGetSettingAvoidSwitchTab.INSTANCE.disable() && !LJIJ) {
            LQ2.LIZLLL("switch_tab");
            return;
        }
        if (LJIJI) {
            LQ2.LIZLLL("is_showing");
            return;
        }
        if (LJ()) {
            LQ2.LIZLLL("draw_guide");
            return;
        }
        IDHandlerS9S0000000_9 iDHandlerS9S0000000_9 = LJJ;
        Message obtainMessage = iDHandlerS9S0000000_9.obtainMessage(42);
        o.LJIIIIZZ(obtainMessage, "handler.obtainMessage(IR….MSG_WHAT_BUBBLE_SETTING)");
        BubbleSettingResponse bubbleSettingResponse = new BubbleSettingResponse(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        bubbleSettingResponse.setData(LiveBubbleSetting.INSTANCE.getConfig());
        bubbleSettingResponse.setExtra(new BubbleSettingExtra(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        obtainMessage.obj = bubbleSettingResponse;
        iDHandlerS9S0000000_9.sendMessage(obtainMessage);
    }

    public static void LJII() {
        if (LiveBubbleWarmStarupSetting.INSTANCE.enable()) {
            LQO.LIZJ = new C54219LPr();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("init, hasInit=");
            HH1.LIZIZ(LIZ2, LQO.LIZIZ, LIZ2, "LiveBubbleTrigger");
            if (!LQO.LIZIZ) {
                C84763XOl.LIZ().LJJJJZI(LQO.LIZLLL);
                C84763XOl.LIZLLL().LJJJJZI(LQO.LJ);
                C84763XOl.LJII().LJJJJZI(LQP.LJLIL);
                C38995FSd.LIZIZ().submit(new ARunnableS45S0100000_9(191));
                LQO.LIZIZ = true;
            }
        }
        LJI();
    }

    public static void LIZ(LiveBubbleData data) {
        o.LJIIIZ(data, "data");
        LQ2.LJFF("livesdk_bubble_checkIsShowBubblePopWindow");
        if (!LIZIZ()) {
            LQ2.LIZIZ("not_login_in");
            return;
        }
        if (LJIIZILJ || LJIJI) {
            LQ2.LIZIZ("showed");
            return;
        }
        BubbleSettingData bubbleSettingData = LJIILL;
        if (bubbleSettingData == null || bubbleSettingData.getStayInterval() <= 0) {
            LQ2.LIZIZ("switch_page");
            return;
        }
        if (LiveBubbleGetSettingAvoidSwitchTab.INSTANCE.disable() && !LJIJ) {
            LQ2.LIZIZ("switch_tab");
            return;
        }
        if (LJ()) {
            LQ2.LIZIZ("draw_guide");
            return;
        }
        if (((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).isShowingAd()) {
            LQ2.LIZIZ("ad_before");
        } else if (((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).isShowingInnerPush()) {
            LQ2.LIZIZ("push_before");
        } else {
            LQ2.LJFF("livesdk_bubble_showTopLiveBubble");
            LJJ.post(new ARunnableS45S0100000_9(data, 194));
        }
    }

    public static void LIZJ(String str, boolean z) {
        LQ1 lq1 = LJIILLIIL;
        if ((lq1 != null && lq1.isShowing()) || LJIJI) {
            LQ2.LJ = str;
            LQ2.LIZJ = "";
            LQ1 lq12 = LJIILLIIL;
            if (lq12 != null) {
                lq12.LJIILIIL = z;
                lq12.dismiss();
            }
            if (o.LJ("ad_avoid", str)) {
                LQ2.LIZIZ("ad_after");
            } else {
                if (!o.LJ("push_avoid", str)) {
                    return;
                }
                LQ2.LIZIZ("push_after");
            }
        }
    }

    public static void LJFF(int i, int i2) {
        String str;
        Room room;
        EnterRoomConfig enterRoomConfig;
        String str2;
        String str3;
        Room roomData;
        EnterRoomConfig.RoomsData roomsData;
        Room roomData2;
        LogPb logPb;
        java.util.Map<String, Object> G1 = ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).G1(-1L);
        if (G1.get("feed_url") instanceof String) {
            Object obj = G1.get("feed_url");
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            str = (String) obj;
        } else {
            str = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        LiveBubbleData liveBubbleData = LJI;
        String str4 = null;
        if (liveBubbleData != null) {
            room = liveBubbleData.getRoomData();
        } else {
            room = null;
        }
        LiveBubbleExtra liveBubbleExtra = LJII;
        if (room == null) {
            enterRoomConfig = null;
        } else {
            enterRoomConfig = new EnterRoomConfig();
            C28238B6k.LIZLLL(room, enterRoomConfig);
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            if (liveBubbleExtra != null && (logPb = liveBubbleExtra.getLogPb()) != null) {
                str2 = logPb.getImprId();
            } else {
                str2 = null;
            }
            logData.requestId = str2;
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            if (roomsData2 != null) {
                roomsData2.feedUrl = str;
            }
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                if (roomsData3 != null) {
                    roomsData3.fromNewStyle = true;
                }
                if (enterRoomConfig != null) {
                    EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
                    if (logData2 != null) {
                        logData2.loadDuration = currentTimeMillis;
                    }
                    if (enterRoomConfig != null) {
                        EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
                        if (roomsData4 != null) {
                            roomsData4.enterMethod = "live_cover";
                        }
                        if (enterRoomConfig != null) {
                            EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
                            if (roomsData5 != null) {
                                roomsData5.enterFromMerge = "live_merge";
                            }
                            if (enterRoomConfig != null) {
                                EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
                                if (roomsData6 != null) {
                                    roomsData6.actionType = "draw";
                                }
                                if (enterRoomConfig != null) {
                                    EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig.mRoomsData;
                                    if (roomsData7 != null) {
                                        roomsData7.fromNewStyle = true;
                                    }
                                    if (enterRoomConfig != null) {
                                        EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
                                        if (logData3 != null) {
                                            logData3.topLeftRoomLabel = LJIILIIL;
                                        }
                                        if (enterRoomConfig != null) {
                                            EnterRoomConfig.RoomsData roomsData8 = enterRoomConfig.mRoomsData;
                                            if (roomsData8 != null) {
                                                roomsData8.fromDrawerStyle = "homepage_hot";
                                            }
                                            if (enterRoomConfig != null) {
                                                EnterRoomConfig.RoomsData roomsData9 = enterRoomConfig.mRoomsData;
                                                if (roomsData9 != null) {
                                                    roomsData9.enterFromLiveSource = "live_square";
                                                }
                                                if (enterRoomConfig != null) {
                                                    EnterRoomConfig.RoomsData roomsData10 = enterRoomConfig.mRoomsData;
                                                    if (roomsData10 != null) {
                                                        roomsData10.windowMode = "full_screen";
                                                    }
                                                    if (enterRoomConfig != null) {
                                                        EnterRoomConfig.RoomsData roomsData11 = enterRoomConfig.mRoomsData;
                                                        if (roomsData11 != null) {
                                                            roomsData11.enterRoomScene = "outside_normal_click";
                                                        }
                                                        if (enterRoomConfig != null) {
                                                            EnterRoomConfig.RoomsData roomsData12 = enterRoomConfig.mRoomsData;
                                                            if (roomsData12 != null) {
                                                                LiveBubbleData liveBubbleData2 = LJI;
                                                                if (liveBubbleData2 != null && (roomData = liveBubbleData2.getRoomData()) != null) {
                                                                    str3 = C17280m4.LIZ(roomData);
                                                                } else {
                                                                    str3 = null;
                                                                }
                                                                roomsData12.bubbleRoomId = str3;
                                                            }
                                                            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                                                                LiveBubbleData liveBubbleData3 = LJI;
                                                                if (liveBubbleData3 != null && (roomData2 = liveBubbleData3.getRoomData()) != null) {
                                                                    str4 = Long.valueOf(roomData2.getOwnerUserId()).toString();
                                                                }
                                                                roomsData.bubbleOwnerd = str4;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        B57.LIZ.LIZJ(new EnterRoomLinkSession(enterRoomConfig));
        EnterRoomConfig.RoomsData roomsData13 = enterRoomConfig.mRoomsData;
        if (roomsData13 != null) {
            roomsData13.isFromBubble = i;
            roomsData13.isFromCache = i2;
        }
        IHostWatch iHostWatch = (IHostWatch) CN1.LIZ(IHostWatch.class);
        Context LIZLLL2 = C15380j0.LIZLLL();
        o.LJIIIIZZ(LIZLLL2, "getContext()");
        iHostWatch.watchLive(LIZLLL2, enterRoomConfig);
    }

    public static void LJIIIIZZ(ActivityC45651qj activityC45651qj, LiveBubbleData liveBubbleData) {
        Long l;
        Room roomData;
        Room roomData2;
        PopupManager.LJIIL(new LQN(activityC45651qj, liveBubbleData));
        BZI LIZ2 = C28787BRn.LIZ("livesdk_bubble_enter_queue");
        LiveBubbleData liveBubbleData2 = LJI;
        Long l2 = null;
        if (liveBubbleData2 != null && (roomData2 = liveBubbleData2.getRoomData()) != null) {
            l = Long.valueOf(roomData2.getId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "room_id");
        LiveBubbleData liveBubbleData3 = LJI;
        if (liveBubbleData3 != null && (roomData = liveBubbleData3.getRoomData()) != null) {
            l2 = Long.valueOf(roomData.getOwnerUserId());
        }
        LIZ2.LJIJJ(l2, "anchor_id");
        LIZ2.LJJIIJZLJL();
        ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).unregisterObserverInnerPush();
    }
}
