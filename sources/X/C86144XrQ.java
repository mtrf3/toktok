package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.VelocityTracker;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.performance.degrade.ViewAutoPreloadOptSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.ECommerceGeneralSearchWidgetServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService;
import kotlin.jvm.internal.o;

/* renamed from: X.XrQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86144XrQ {
    public static InterfaceC55347Lnr LIZ;
    public static VelocityTracker LIZJ;
    public static float LIZLLL;
    public static float LJ;
    public static boolean LJIIIIZZ;
    public static String LIZIZ = "";
    public static boolean LJFF = true;
    public static boolean LJI = true;
    public static String LJII = "";

    public static boolean LIZIZ() {
        LiveOuterService.LJJJLL().LJJIJIL().getClass();
        if (!((IInteractService) CN1.LIZ(IInteractService.class)).Qh(true) && ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Yy() == 1) {
            return true;
        }
        return false;
    }

    public static void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        C20910rv.LJIIL(context);
        C78480Ur6.LIZ.S1(context);
        Live.getService().LJJLJ(context);
        Live.getService().LJJIJIIJIL();
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            if (LJIJJ instanceof ActivityC86117Xqz) {
                ((ActivityC86117Xqz) LJIJJ).activityConfiguration(C86119Xr1.LJLIL);
            }
            Live.getService().LJJLIIIJLJLI(LJIJJ);
        }
    }

    public static void LJ(Context context) {
        Activity activity = null;
        C20910rv.LJIILLIIL(null);
        C08680Vs.LJIILJJIL.LIZ();
        InterfaceC86394XvS service = Live.getService();
        if (context != null) {
            activity = C78949Uyf.LJIILL(context);
        }
        service.LJJLIIIIJ(activity);
        Live.getService().LJJIJ();
    }

    public static void LJFF(String str, InterfaceC28161B3l drawerActivity) {
        o.LJIIIZ(drawerActivity, "drawerActivity");
        Live.getLiteService().F4(str, drawerActivity);
    }

    public static EnterRoomConfig LIZLLL(Aweme aweme, boolean z, String str) {
        EnterRoomConfig enterRoomConfig;
        K22 LIZIZ2;
        String str2;
        Object LJJJJZ = SearchServiceImpl.LLLZI().LJJJJZ(aweme);
        if (LJJJJZ != null && (LJJJJZ instanceof EnterRoomConfig)) {
            enterRoomConfig = (EnterRoomConfig) LJJJJZ;
            C78469Uqv.LIZJ(aweme, enterRoomConfig);
        } else {
            enterRoomConfig = new EnterRoomConfig();
            C78469Uqv.LIZJ(aweme, enterRoomConfig);
        }
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        if (streamData != null && streamData.disablePrePullStream) {
            EnterRoomConfig.StreamData streamData2 = new EnterRoomConfig.StreamData(null, null, null, null, null, null, false, false, 0, 0, false, 0L, false, 0L, 16383, null);
            enterRoomConfig.mStreamData = streamData2;
            streamData2.disablePrePullStream = true;
        }
        if (ViewAutoPreloadOptSetting.INSTANCE.getEnable()) {
            C78480Ur6.LIZ.U();
        }
        if (TextUtils.isEmpty(LJII)) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (roomsData == null || (str2 = roomsData.enterType) == null) {
                str2 = "draw";
            }
            LJII = str2;
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (roomsData2 != null) {
            roomsData2.enterType = LJII;
        }
        EnterRoomConfig.SearchWrapData searchWrapData = enterRoomConfig.mSearchData;
        if (searchWrapData != null) {
            searchWrapData.isFromSearch = true;
            searchWrapData.isSearchHasMore = z;
        }
        IECommerceGeneralSearchWidgetService LIZJ2 = ECommerceGeneralSearchWidgetServiceImpl.LIZJ();
        if (LIZJ2 != null && (LIZIZ2 = LIZJ2.LIZIZ()) != null) {
            LIZIZ2.prepareEcLiveExtraArgs(enterRoomConfig, str);
        }
        EnterRoomLinkSession.LJI(enterRoomConfig);
        return enterRoomConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r0 = r10.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r0 = X.C45804HyK.LJJIFFI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r2 = r0.getSupportFragmentManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005d, code lost:
    
        r3 = new X.C1B3(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.B3D LIZJ(android.view.View r10, com.bytedance.android.livesdkapi.session.EnterRoomConfig r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86144XrQ.LIZJ(android.view.View, com.bytedance.android.livesdkapi.session.EnterRoomConfig, int, int):X.B3D");
    }
}
