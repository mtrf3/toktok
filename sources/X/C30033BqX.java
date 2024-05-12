package X;

import Y.AObjectS42S0101000_5;
import Y.AfS17S0001000_5;
import Y.AfS35S0101000_3;
import Y.AfS36S0101000_5;
import Y.AfS38S0101000_10;
import Y.AfS39S0101000_13;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.AcademySurveyApi;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IContainerService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveevent.LiveEventApi;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.data.model.wallet.WalletInfoExtra;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import com.bytedance.android.livesdk.dataChannel.EndLiveWithoutEndPage;
import com.bytedance.android.livesdk.dataChannel.ModeratorSettingShowEvent;
import com.bytedance.android.livesdk.live.api.RoomFrequencyControlApi;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.livesetting.broadcast.CreatorToolsAgencyCenterUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCreatorHubEntranceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCreatorHubUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEncourageUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNudgeEntranceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNudgeUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptLiveAcademyTaskPanelSchema;
import com.bytedance.android.livesdk.livesetting.broadcast.OptLiveCenterSchema;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEventDetailSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.settings.CustomSettingFragment;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.api.room.PreviewTimeReportResponse;

/* renamed from: X.BqX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30033BqX implements InterfaceC86394XvS {
    public static volatile C30033BqX LIZIZ;
    public InterfaceC28921BWr LIZ;

    @Override // X.InterfaceC86394XvS
    public final int LJIJI() {
        return R.string.mld;
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LJLJJLL() {
        return true;
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC41312GJg A4() {
        return ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).A4();
    }

    @Override // X.InterfaceC86394XvS
    public final void B7() {
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
        if (iRoomFunctionService != null) {
            iRoomFunctionService.B7();
        }
    }

    @Override // X.InterfaceC86394XvS
    public final Boolean LJ() {
        return Boolean.valueOf(LiveNudgeEntranceSetting.INSTANCE.getValue());
    }

    @Override // X.InterfaceC86394XvS
    public final IShortTouchService LJI() {
        return (IShortTouchService) CN1.LIZ(IShortTouchService.class);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIIIIZZ() {
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        if (iBroadcastService != null) {
            iBroadcastService.showEndPageForPaidEvent();
        }
    }

    @Override // X.InterfaceC86394XvS
    public final String LJIJJ() {
        return CreatorToolsAgencyCenterUrl.INSTANCE.getValue();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJIIJZLJL() {
        return LiveCreatorHubUrlSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJIIZ() {
        IPullStreamService iPullStreamService = (IPullStreamService) CN1.LIZ(IPullStreamService.class);
        if (iPullStreamService != null) {
            iPullStreamService.SN().LIZ();
            iPullStreamService.ho().LIZ();
        }
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJIJ() {
        ((IHybridPerformanceService) CN1.LIZ(IHybridPerformanceService.class)).ZN();
    }

    @Override // X.InterfaceC86394XvS
    public final C30039Bqd LJJIJIIJI() {
        if (C30039Bqd.LIZ == null) {
            synchronized (C30039Bqd.class) {
                if (C30039Bqd.LIZ == null) {
                    C30039Bqd.LIZ = new C30039Bqd();
                }
            }
        }
        return C30039Bqd.LIZ;
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJIJIIJIL() {
        ((IHybridPerformanceService) CN1.LIZ(IHybridPerformanceService.class)).FH();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC07990Tb LJJIJIL() {
        return ((IEffectService) CN1.LIZ(IEffectService.class)).getEcExternalEffectHelper();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJIZ() {
        java.util.Map<String, Object> Ta = ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).Ta(1L);
        if (Ta != null && !Ta.isEmpty()) {
            Object obj = Ta.get("feed_name");
            if (obj instanceof String) {
                return (String) obj;
            }
            return "";
        }
        return "";
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJ() {
        WalletCenter walletCenter = (WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter();
        walletCenter.getClass();
        walletCenter.LJLJJL = new BalanceStruct();
        walletCenter.LJLIL = new WalletStruct();
        walletCenter.LJLILLLLZI = new WalletInfoExtra();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJIZL() {
        DataChannelGlobal.LJLJJI.rv0(EndLiveWithoutEndPage.class);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJJ() {
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJ();
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment LJJJJJL() {
        return new CustomSettingFragment();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC28682BNm LJJJJL() {
        return ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).nu0();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJZI() {
        DataChannelGlobal.LJLJJI.rv0(ModeratorSettingShowEvent.class);
    }

    @Override // X.InterfaceC86394XvS
    public final ILiveFeedApiService LJJL() {
        return (ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class);
    }

    @Override // X.InterfaceC86394XvS
    public final IWalletService LJJLI() {
        return (IWalletService) CN1.LIZ(IWalletService.class);
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJLIIIJ() {
        return LiveNudgeUrlSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJLIIIJL() {
        return UriProtector.parse(OptLiveCenterSchema.INSTANCE.getValue()).buildUpon().appendQueryParameter("click_time", String.valueOf(System.currentTimeMillis())).build().toString();
    }

    @Override // X.InterfaceC86394XvS
    public final Context LJLI() {
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastActivity();
    }

    @Override // X.InterfaceC86394XvS
    public final C75 LJLJJL() {
        return ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).X60("creator_tools_page");
    }

    @Override // X.InterfaceC86394XvS
    public final Boolean LJLJL() {
        return Boolean.valueOf(LiveCreatorHubEntranceSetting.INSTANCE.getValue());
    }

    @Override // X.InterfaceC86394XvS
    public final String LJLLLLLL() {
        return OptLiveAcademyTaskPanelSchema.INSTANCE.getValue();
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LJLZ() {
        if (((IRankService) CN1.LIZ(IRankService.class)).fp0() != null && C28571BJf.LIZLLL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC86394XvS
    public final String LJZI() {
        return LiveEncourageUrlSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC08690Vt T7() {
        return ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).T7();
    }

    @Override // X.InterfaceC86394XvS
    public final void U() {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).U();
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment c2() {
        return ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).c2();
    }

    @Override // X.InterfaceC86394XvS
    public final void cleanEffectCache() {
        ((IEffectService) CN1.LIZ(IEffectService.class)).cleanEffectCache();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30045Bqj createLiveCoverCameraFragment() {
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveCoverCameraFragment();
    }

    @Override // X.InterfaceC86394XvS
    public final void d9() {
        ((IToolbarService) CN1.LIZ(IToolbarService.class)).d9();
    }

    @Override // X.InterfaceC86394XvS
    public final void e9() {
        C0NB.LJIIIZ("LiveIconGeneratorLog", "LiveServiceApiImpl#requestTabListForyouPage");
        ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).e9();
    }

    @Override // X.InterfaceC86394XvS
    public final String getLiveCoreVersion() {
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        if (iBroadcastService == null) {
            return "";
        }
        return iBroadcastService.getLiveCoreVersion();
    }

    @Override // X.InterfaceC86394XvS
    public final java.util.Map<String, String> getRoomInfo() {
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getRoomInfo();
    }

    @Override // X.InterfaceC86394XvS
    public final String getRtcDeviceID() {
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        if (iBroadcastService == null) {
            return "";
        }
        return iBroadcastService.getRtcDeviceID();
    }

    @Override // X.InterfaceC86394XvS
    public final String getRtcVersion() {
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        if (iBroadcastService == null) {
            return "";
        }
        return iBroadcastService.getRtcVersion();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC28737BPp h0() {
        return ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).h0();
    }

    @Override // X.InterfaceC86394XvS
    public final void j9() {
        ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).j9();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC41329GJx l4() {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).l4();
    }

    @Override // X.InterfaceC86394XvS
    public final void releaseLiveStream() {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).releaseLiveStream();
    }

    @Override // X.InterfaceC86394XvS
    public final void releaseVoiceChatLiveStream() {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).releaseVoiceChatLiveStream();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC28921BWr startLiveManager() {
        if (this.LIZ == null) {
            this.LIZ = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).startLiveManager();
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC86394XvS
    public final void v3() {
        ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).v3();
    }

    @Override // X.InterfaceC86394XvS
    public final B4Z w() {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).w();
    }

    @Override // X.InterfaceC86394XvS
    public final String LIZ() {
        return C30443Bx9.LIZ();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLLJ() {
        UPJ.LJFF(32, C73943T0h.LIZ());
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC05190Ih getCurrentUser() {
        return B83.LIZ().LIZIZ().getCurrentUser();
    }

    @Override // X.InterfaceC86394XvS
    public final C4RH LIZIZ() {
        return C28835BTj.LIZ;
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC71013Rtx LJJJLL() {
        return BJM.LJLIL;
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30044Bqi LJJZ() {
        return new InterfaceC30044Bqi() { // from class: X.1GR
        };
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLLI() {
        C0IT.LIZ();
    }

    public static final InterfaceC31235CNr LJZL(Bundle bundle) {
        return ((IBrowserService) CN1.LIZ(IBrowserService.class)).u40(bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final void E8(long j) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).E8(j);
    }

    @Override // X.InterfaceC86394XvS
    public final void F2(java.util.Map map) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).F2(map);
    }

    @Override // X.InterfaceC86394XvS
    public final java.util.Map<String, Object> G1(long j) {
        return ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).G1(j);
    }

    @Override // X.InterfaceC86394XvS
    public final void H8(UDV udv) {
        ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).H8(udv);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJFF(String str) {
        long id;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        LiveEventApi liveEventApi = (LiveEventApi) Q7L.LIZIZ(LiveEventApi.class);
        if (room == null) {
            id = 0;
        } else {
            id = room.getId();
        }
        liveEventApi.bindLiveEvent(id, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), CastLongProtector.parseLong(str)).LJII(BTJ.LIZJ(LiveEventApi.class)).LJJJLIIL(new AfS17S0001000_5(3, 2), new AfS17S0001000_5(1, 6));
    }

    @Override // X.InterfaceC86394XvS
    public final CharSequence LJIIJ(User user) {
        return C05170If.LIZLLL(user);
    }

    @Override // X.InterfaceC86394XvS
    public final Drawable LJIILIIL(String str) {
        return C15490jB.LIZ(str, "ic_push_live_event_alarm_banner_new.png");
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIILL(boolean z) {
        ((IHybridPropsService) CN1.LIZ(IHybridPropsService.class)).NB(z);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIILLIIL(String str) {
        C30868C9o.LJI(str);
    }

    @Override // X.InterfaceC86394XvS
    public final long LJIIZILJ(boolean z) {
        return ((IGiftService) CN1.LIZ(IGiftService.class)).giftVideoResourcesClear(z);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIJ(boolean z) {
        C73943T0h.LIZ().LIZIZ(new B43(z));
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIJJLI(Context context) {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).onLiveTabShow(context);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LJIL(android.net.Uri uri) {
        return ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).canHandle(uri);
    }

    @Override // X.InterfaceC86394XvS
    public final HashMap<String, String> LJJII(EnterRoomConfig enterRoomConfig) {
        return C28835BTj.LJI(C28835BTj.LJIIIIZZ(enterRoomConfig));
    }

    @Override // X.InterfaceC86394XvS
    public final OSZ<Boolean, Boolean> LJJIII(boolean z) {
        if (!GameLivePartnershipDropsSetting.INSTANCE.getConfig().enablePermanentDropsShareItem && !z) {
            Boolean bool = Boolean.FALSE;
            return new OSZ<>(bool, bool);
        }
        C30451BxH zi0 = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).zi0();
        if (zi0 != null) {
            return zi0.LJFF();
        }
        Boolean bool2 = Boolean.FALSE;
        return new OSZ<>(bool2, bool2);
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJIIZI(int i) {
        return ((IHostShare) CN1.LIZ(IHostShare.class)).getBundleKey(i);
    }

    @Override // X.InterfaceC86394XvS
    public final java.util.Map<String, String> LJJIJLIJ(Context context) {
        C30036Bqa c30036Bqa = C78886Uxe.LJLL;
        if (c30036Bqa != null) {
            c30036Bqa.LIZ = context;
            ArrayList<AbstractC30040Bqe> arrayList = c30036Bqa.LIZIZ;
            if (arrayList == null || arrayList.isEmpty()) {
                if (c30036Bqa.LIZIZ == null) {
                    c30036Bqa.LIZIZ = new ArrayList<>();
                }
                c30036Bqa.LIZIZ.add(new C30034BqY());
                c30036Bqa.LIZIZ.add(new C30035BqZ());
                c30036Bqa.LIZIZ.add(new C30041Bqf(c30036Bqa));
                c30036Bqa.LIZIZ.add(new C30037Bqb());
            }
            HashMap hashMap = new HashMap();
            Iterator<AbstractC30040Bqe> it = c30036Bqa.LIZIZ.iterator();
            while (it.hasNext()) {
                AbstractC30040Bqe next = it.next();
                hashMap.put(next.LIZ, next.LIZ());
            }
            return hashMap;
        }
        return null;
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJIL(C1794672o c1794672o) {
        ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJIIJJI(c1794672o);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJI(C1X c1x) {
        List list = (List) DataChannelGlobal.LJLJJI.mv0(C29066Baw.class);
        if (list != null) {
            list.add(c1x);
        }
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJI(C29930Bos c29930Bos) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).pn(c29930Bos.LJJIII, c29930Bos.LJIJJLI, c29930Bos.LJIL, c29930Bos.LJJJJJ);
    }

    @Override // X.InterfaceC86394XvS
    public final EnterRoomConfig LJJJJLI(Room room) {
        return C28238B6k.LIZJ(false, room);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC28737BPp LJJJJZ(String str) {
        return ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZJ(str);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y.AObjectS42S0101000_5, O] */
    @Override // X.InterfaceC86394XvS
    public final void LJJJLZIJ(C58610MzO c58610MzO) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C4T.class)).LIZ = new AObjectS42S0101000_5(6, c58610MzO, 61);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIIJ(Activity activity) {
        IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
        if (iGiftService != null) {
            iGiftService.onLiveActivityDestroyed();
        }
        C0IT.LIZLLL(activity);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJILLIZJL(C29930Bos c29930Bos) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Gi(c29930Bos.LJJIII, c29930Bos.LJIJJLI, c29930Bos.LJIL, c29930Bos.LJJJJJ);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJJI(String str) {
        ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Jn0(str);
        ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).PX(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJLJLI(Activity activity) {
        C0IT.LIZJ(activity);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC54761LeP LJJLIIJ(String str) {
        return C28787BRn.LIZ(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLJ(Context context) {
        EnumC30226Bte enumC30226Bte;
        IToolbarService iToolbarService = (IToolbarService) CN1.LIZ(IToolbarService.class);
        if (ToolBarButtonWithTextExperiment.hasText()) {
            enumC30226Bte = EnumC30226Bte.ICON_WITH_TEXT;
        } else {
            enumC30226Bte = EnumC30226Bte.ICON;
        }
        iToolbarService.vh(context, 4, enumC30226Bte);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0008 A[RETURN] */
    @Override // X.InterfaceC86394XvS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJLJLI(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1893573924: goto L2d;
                case -1553517990: goto L24;
                case -95308304: goto L1b;
                case 1132577426: goto L12;
                case 1807167871: goto L9;
                default: goto L8;
            }
        L8:
            return r1
        L9:
            java.lang.String r0 = "moderator_setting_action"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L36
            goto L8
        L12:
            java.lang.String r0 = "follow_widget"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L8
        L1b:
            java.lang.String r0 = "share_setting"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3e
            goto L8
        L24:
            java.lang.String r0 = "live_game_drops_watch"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L42
            goto L8
        L2d:
            java.lang.String r0 = "pip_switch"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L46
            goto L8
        L36:
            r0 = 2131840465(0x7f114dd1, float:1.931421E38)
            return r0
        L3a:
            r0 = 2131838085(0x7f114485, float:1.9309383E38)
            return r0
        L3e:
            r0 = 2131840390(0x7f114d86, float:1.9314058E38)
            return r0
        L42:
            r0 = 2131837142(0x7f1140d6, float:1.930747E38)
            return r0
        L46:
            r0 = 2131835282(0x7f113992, float:1.9303698E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30033BqX.LJJLJLI(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC86394XvS
    public final String LJJLL(String str) {
        int i;
        switch (str.hashCode()) {
            case -2020688892:
                if (str.equals("pm_mt_multi_invite_joinfriendasguest")) {
                    i = R.string.na3;
                    break;
                }
                i = 0;
                break;
            case -939376402:
                if (str.equals("pm_end_live_end")) {
                    i = R.string.l0a;
                    break;
                }
                i = 0;
                break;
            case -877447116:
                if (str.equals("pm_pushfailure_popup_title")) {
                    i = R.string.nr7;
                    break;
                }
                i = 0;
                break;
            case -783867477:
                if (str.equals("pm_end_live_title")) {
                    i = R.string.l0d;
                    break;
                }
                i = 0;
                break;
            case -477192787:
                if (str.equals("pm_mt_multi_sendinvite")) {
                    i = R.string.nc0;
                    break;
                }
                i = 0;
                break;
            case 463549714:
                if (str.equals("pm_live_invitesent")) {
                    i = R.string.mik;
                    break;
                }
                i = 0;
                break;
            case 604213513:
                if (str.equals("pm_mt_multi_invite_badge")) {
                    i = R.string.n_y;
                    break;
                }
                i = 0;
                break;
            case 944541562:
                if (str.equals("pm_end_live_text")) {
                    i = R.string.l0c;
                    break;
                }
                i = 0;
                break;
            case 1758943741:
                if (str.equals("pm_end_live_not_now")) {
                    i = R.string.l0b;
                    break;
                }
                i = 0;
                break;
            default:
                i = 0;
                break;
        }
        String LJIILJJIL = C15380j0.LJIILJJIL(i);
        o.LJIIIIZZ(LJIILJJIL, "getString(getTextStringId(key))");
        return LJIILJJIL;
    }

    @Override // X.InterfaceC86394XvS
    public final String LJLIIIL(String str) {
        return C86881Y7x.LIZIZ().LIZ(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLILLLLZI(C71151RwB c71151RwB) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Lj0(c71151RwB);
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment O3(Context context) {
        return ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).O3(context);
    }

    @Override // X.InterfaceC86394XvS
    public final void S1(Context context) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).S1(context);
    }

    @Override // X.InterfaceC86394XvS
    public final void W5(String str) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).W5(str);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean ba(String str) {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).ba(str);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30043Bqh createLiveBroadcastEndFragment(Bundle bundle) {
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveBroadcastEndFragment(bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final BBC createLiveBroadcastEndSafetyToolsFragment(Bundle bundle) {
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveBroadcastEndSafetyToolsFragment(bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30046Bqk createStartLiveFragment(InterfaceC29074Bb4 interfaceC29074Bb4) {
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createStartLiveFragment(interfaceC29074Bb4);
    }

    @Override // X.InterfaceC86394XvS
    public final void onLocaleChanged(Locale locale) {
        C0NB.LIZIZ("i18n_translation", "notify I18nDataCenter when locale changed");
        C86881Y7x.LIZIZ().LIZJ(locale);
        if (CCJ.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()) && LiveServiceManagerOptSetting.enable()) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).onLocaleChanged(locale);
            ((IGiftService) CN1.LIZ(IGiftService.class)).onLocaleChanged(locale);
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).onLocaleChanged(locale);
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).onLocaleChanged(locale);
        }
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment pa(String str) {
        return ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).pa(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void preloadVoiceChatLiveStream(Context context) {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).preloadVoiceChatLiveStream(context);
    }

    @Override // X.InterfaceC86394XvS
    public final void setBroadcastActivity(Activity activity) {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).setBroadcastActivity(activity);
    }

    @Override // X.InterfaceC86394XvS
    public final B3D w0(EnterRoomConfig enterRoomConfig) {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).w0(enterRoomConfig);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean w9(String str) {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).w9(str);
    }

    public static final Fragment LLD(Context context, Bundle bundle) {
        return ((IBrowserService) CN1.LIZ(IBrowserService.class)).P(context, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final void A5(SubscriptionAdPageActivity subscriptionAdPageActivity, String str) {
        ((IapService) CN1.LIZ(IapService.class)).A5(subscriptionAdPageActivity, str);
    }

    @Override // X.InterfaceC86394XvS
    public final void F4(String str, InterfaceC28161B3l interfaceC28161B3l) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).F4(str, interfaceC28161B3l);
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment F6(String str, GetSubInfoResponse getSubInfoResponse) {
        return ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).F6(str, getSubInfoResponse);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LIZLLL(Context context, String str) {
        return ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handleWithoutHost(context, str);
    }

    @Override // X.InterfaceC86394XvS
    public final Object LJIIIZ(Object obj, String str) {
        return C30922CBq.LIZJ(str, obj);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIILJJIL(Activity activity, C29930Bos c29930Bos) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).y10(c29930Bos.LIZJ, activity);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJJ(Long l, C63081OpJ c63081OpJ) {
        if (l == null) {
            return null;
        }
        return C1EW.LIZ(((AcademySurveyApi) Q7L.LIZIZ(AcademySurveyApi.class)).fetchAcademySurvey(l.longValue())).LJJJLIIL(new AfS36S0101000_5(0, c63081OpJ, 53), new AfS36S0101000_5(1, c63081OpJ, 52));
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJI(String str, String str2) {
        return C15510jD.LJIIIZ(str, str2);
    }

    @Override // X.InterfaceC86394XvS
    public final Spannable LJJIFFI(Text text, String str) {
        return CXJ.LJI(str, text, null);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC86149XrV LJJIIJ(C61494OBm c61494OBm, Bundle bundle) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C30042Bqg.class)).LIZ = "third_party";
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createObsBroadcastFragment(c61494OBm, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LJJJIL(Context context, android.net.Uri uri) {
        return ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handleWithoutHost(context, uri.toString());
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJJJJ(SubmitSurveyAnswerRequest submitSurveyAnswerRequest, C63105Oph c63105Oph) {
        return C1EW.LIZ(((AcademySurveyApi) Q7L.LIZIZ(AcademySurveyApi.class)).postSurveyAnswer(submitSurveyAnswerRequest)).LJJJLIIL(new AfS36S0101000_5(1, c63105Oph, 65), new AfS36S0101000_5(2, c63105Oph, 5));
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJLL(long j, long j2) {
        BM1.LIZLLL = j;
        BM1.LJ = j2;
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJLIIL(Activity activity, C29930Bos c29930Bos) {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ((C32537Cpp) dataChannelGlobal.gv0(C29033BaP.class)).LIZ = "share_setting";
        ((C32537Cpp) dataChannelGlobal.gv0(C29036BaS.class)).LIZ = "setting";
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Kc0(activity);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJJIZ(B5Z b5z, C59414NTm c59414NTm) {
        if (b5z == B5Z.AUDIENCE_LIVE_PLAY_DURATION) {
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).dP(c59414NTm);
        }
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJZZI(List list, java.util.Map map) {
        BM1.LIZ(list, map);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJL(long j, C30018BqI c30018BqI) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_id", String.valueOf(j));
        C65814PsI.LIZ().getClass();
        ((RoomRetrofitApi) C65814PsI.LIZJ(RoomRetrofitApi.class)).fetchRoom(hashMap).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(1, c30018BqI, 69), new AfS36S0101000_5(3, c30018BqI, 3));
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC86149XrV LJLIIL(C61494OBm c61494OBm, Bundle bundle) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C30042Bqg.class)).LIZ = "mirror_cast";
        return ((IGameService) CN1.LIZ(IGameService.class)).du0(bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLJI(C20010qT c20010qT, C31627Cb9 c31627Cb9) {
        ((IapService) CN1.LIZ(IapService.class)).xi0(c20010qT, c31627Cb9);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC86149XrV LJLJJI(C61492OBk c61492OBk, Bundle bundle) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C30042Bqg.class)).LIZ = "voice_chat";
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createVoiceChatBroadcastFragment(c61492OBk, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLJLJ(Context context, C28555BIp c28555BIp) {
        if (C29306Beo.LIZIZ(context) == null) {
            return;
        }
        c28555BIp.LJIILIIL = true;
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Qp0(context, c28555BIp);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLL(Activity activity, Boolean bool) {
        C30451BxH zi0 = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).zi0();
        if (zi0 != null) {
            zi0.LIZLLL(activity, bool.booleanValue());
        }
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLLILLLL(Context context, C29930Bos c29930Bos) {
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Us(context, c29930Bos);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLLL(String str, InterfaceC28738BPq interfaceC28738BPq) {
        ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LJIIJJI(str, interfaceC28738BPq);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJZ(java.util.Map map, C63106Opi c63106Opi) {
        return C1EW.LIZ(((AcademySurveyApi) Q7L.LIZIZ(AcademySurveyApi.class)).postFeedBack(map)).LJJJLIIL(new AfS39S0101000_13(1, c63106Opi, 3), new AfS39S0101000_13(0, c63106Opi, 4));
    }

    public final Fragment LL(Context context, android.net.Uri uri) {
        return ((IContainerService) CN1.LIZ(IContainerService.class)).Se(uri);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean S4(Context context, String str) {
        return ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).S4(context, str);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC86149XrV c1(C61494OBm c61494OBm, Bundle bundle) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C30042Bqg.class)).LIZ = "screen_share";
        return ((IGameService) CN1.LIZ(IGameService.class)).c1(c61494OBm, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30302Bus createLiveBroadcastFragment(C2M c2m, Bundle bundle) {
        ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C30042Bqg.class)).LIZ = "video_live";
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveBroadcastFragment(c2m, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final java.util.Map<String, InterfaceC38012Evw> getLiveWalletJSB(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).getLiveWalletJSB(weakReference, c38049EwX);
    }

    @Override // X.InterfaceC86394XvS
    public final AbstractC73672Svk<C28467BFf<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(long j, long j2) {
        return C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).reportSubscribePreviewTime(j, j2));
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJIIJJI(String str, String str2, C86346Xug c86346Xug) {
        if (C38354F3m.LJ(str) || C38354F3m.LJ(str2)) {
            return null;
        }
        return C1EW.LIZ(((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).getUserInfo(str2)).LJJJLIIL(new AfS38S0101000_10(0, c86346Xug, 0), new AfS35S0101000_3(1, c86346Xug, 2));
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
        ((IImageService) CN1.LIZ(IImageService.class)).LJJLIIIJLLLLLLLZ(jSONObject, str, z);
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJLIL(Context context, EnterRoomConfig enterRoomConfig, long j) {
        B35 Wm0 = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Wm0(context, enterRoomConfig, j);
        if (Wm0 != null) {
            return Wm0.getPlayerTag();
        }
        return null;
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLJLLL(Activity activity, C20060qY c20060qY, C32050Chy c32050Chy) {
        ((IapService) CN1.LIZ(IapService.class)).I20(activity, c20060qY, c32050Chy);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean M(String str, String str2, boolean z) {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).M(str, str2, z);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC38012Evw getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).getLiveWalletJSBByName(str, weakReference, c38049EwX);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean handleSchema(Context context, String str, Bundle bundle) {
        return ((IHostAction) CN1.LIZ(IHostAction.class)).handleSchema(context, str, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean handleWithoutHost(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        return ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handleWithoutHost(context, uri, map);
    }

    @Override // X.InterfaceC86394XvS
    public final void preloadLiveStream(Context context, boolean z, boolean z2) {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).preloadLiveStream(context, z, z2);
    }

    @Override // X.InterfaceC86394XvS
    public final B4K r6(ActivityC45651qj activityC45651qj, BZM bzm, int i) {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).r6(activityC45651qj, bzm, i);
    }

    @Override // X.InterfaceC86394XvS
    public final void updateRoomInfo(IMessageManager iMessageManager, long j, Context context) {
        ((IMessageService) CN1.LIZ(IMessageService.class)).updateRoomInfo(iMessageManager, j, context);
    }

    public static final void LLF(Room room, String str, String str2, String str3) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).FU(room, str, str2, str3);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJJIJL(String str, String str2, long j, BOM bom) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_ids", String.valueOf(j));
        if (!C38354F3m.LJ(str)) {
            hashMap.put("enter_from", str);
        }
        if (!C38354F3m.LJ(str2)) {
            hashMap.put("check_params", str2);
        }
        return ((RoomStatApi) Q7L.LIZIZ(RoomStatApi.class)).checkRoom(hashMap).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(1, bom, 16), new AfS36S0101000_5(1, bom, 49));
    }

    @Override // X.InterfaceC86394XvS
    public final IMessageManager LJJZZIII(long j, Context context, boolean z, EnumC32070CiI enumC32070CiI) {
        return ((IMessageService) CN1.LIZ(IMessageService.class)).messageManagerProvider(j, false, context, true, z, enumC32070CiI);
    }

    @Override // X.InterfaceC86394XvS
    public final int LJLIL(ActivityC45651qj activityC45651qj, DialogFragment dialogFragment, Bundle bundle, C59654Nb8 c59654Nb8) {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).doExchangeBeforeRecharge(activityC45651qj, dialogFragment, bundle, c59654Nb8);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJLLLL(boolean z, long j, long j2, InterfaceC28696BOa interfaceC28696BOa) {
        if (z) {
            return ((RoomFrequencyControlApi) Q7L.LIZIZ(RoomFrequencyControlApi.class)).updateFrequencyControl(j, j2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(2, interfaceC28696BOa, 12), new AfS36S0101000_5(1, interfaceC28696BOa, 48));
        }
        return ((RoomFrequencyControlApi) Q7L.LIZIZ(RoomFrequencyControlApi.class)).frequencyControl(j, j2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(3, interfaceC28696BOa, 32), new AfS36S0101000_5(1, interfaceC28696BOa, 33));
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment T5(long j, String str, String str2, boolean z) {
        return ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).T5(j, str, str2, z);
    }

    @Override // X.InterfaceC86394XvS
    public final DialogFragment createRechargeDialogFragment(ActivityC45651qj activityC45651qj, InterfaceC77682UeE interfaceC77682UeE, Bundle bundle, C77591Ucl c77591Ucl) {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).createRechargeDialogFragment(activityC45651qj, interfaceC77682UeE, bundle, c77591Ucl);
    }

    @Override // X.InterfaceC86394XvS
    public final void LIZJ(Context context, String str, String str2, Bundle bundle, AAM aam) {
        C30882CAc Lu;
        HybridDialogFragment LIZ;
        ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(context);
        if (LIZIZ2 == null) {
            return;
        }
        float f = bundle.getFloat("bundle_dialog_screen_size", 0.95f);
        String string = bundle.getString("bundle_url_extra_param", "");
        android.net.Uri build = UriProtector.parse(LiveEventDetailSetting.INSTANCE.getValue()).buildUpon().appendQueryParameter("event_id", str).appendQueryParameter("user_id", str2).appendQueryParameter("aid", String.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId())).build();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(build.toString());
        LIZ2.append(string);
        String LIZIZ3 = X1D.LIZIZ(LIZ2);
        if (((IHostAction) CN1.LIZ(IHostAction.class)).hostInterceptSpark(LIZIZ3)) {
            C29682Bks LIZJ = C29683Bkt.LIZJ(LIZIZ3);
            C29682Bks.LJIJI(LIZJ, 8);
            LIZJ.LJIIIZ("bottom");
            int LJIJ = (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * f));
            BY3 by3 = BY3.DP;
            LIZJ.LJIIJ(LJIJ, by3);
            LIZJ.LJIL((int) C15380j0.LJIJ(C15380j0.LJIIL()), by3);
            LIZJ.LJ(-1);
            ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Vs0(LIZIZ2, LIZJ.LIZ().toString(), null);
            return;
        }
        C28870BUs c28870BUs = new C28870BUs(LIZIZ3);
        c28870BUs.LIZ(8, 8, 0);
        c28870BUs.LJIIJ = -1;
        c28870BUs.LJIIZILJ = true;
        c28870BUs.LIZJ = (int) C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * f));
        c28870BUs.LIZIZ = (int) C15380j0.LJIJ(C15380j0.LJIIL());
        c28870BUs.LJIIIZ = 80;
        c28870BUs.LJJII = bundle.getString("bundle_Hybrid_Dialog_Fragment_from_label", "");
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService == null || (Lu = iBrowserService.Lu()) == null || (LIZ = Lu.LIZ(c28870BUs)) == null) {
            return;
        }
        LIZ.LJLILLLLZI = aam;
        BaseDialogFragment.wl(LIZIZ2, LIZ);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJII(Context context, Room room, C29930Bos c29930Bos, C31605Can c31605Can, C29242Bdm c29242Bdm) {
        ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).Je0(context, false, room, c29930Bos, c31605Can, c29242Bdm);
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment LJIIL(int i, int i2, int i3, int i4, String str, String str2) {
        return ((IGameService) CN1.LIZ(IGameService.class)).pl0(i, i2, i3, i4, str, str2);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJZ(Context context, long j, long j2, long j3, String str, String str2) {
        C28555BIp c28555BIp = new C28555BIp(j, j2, j3, str, "fast_report", "homepage_hot", "live_cell", "click", "fast_report", str2, (C28837BTl) null);
        c28555BIp.LIZ = "full_screen";
        LJLJLJ(context, c28555BIp);
    }
}
