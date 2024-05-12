package X;

import Y.AfS36S0101000_5;
import Y.AfS39S0101000_13;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.feedpage.LiveRoomInfoApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.api.room.PreviewTimeReportResponse;

/* renamed from: X.XvR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86393XvR implements X1Y {
    public final CopyOnWriteArrayList<String> LIZ = new CopyOnWriteArrayList<>();
    public X1X LIZIZ;

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30045Bqj createLiveCoverCameraFragment() {
        return ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).createLiveCoverCameraFragment();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC41312GJg A4() {
        return Live.getService().A4();
    }

    @Override // X.InterfaceC86394XvS
    public final void B7() {
        InterfaceC86394XvS service = Live.getService();
        if (service != null) {
            service.B7();
        }
    }

    @Override // X.InterfaceC86394XvS
    public final String LIZ() {
        return Live.getService().LIZ();
    }

    @Override // X.InterfaceC86394XvS
    public final C4RH LIZIZ() {
        return Live.getService().LIZIZ();
    }

    @Override // X.InterfaceC86394XvS
    public final Boolean LJ() {
        return Live.getService().LJ();
    }

    @Override // X.InterfaceC86394XvS
    public final IShortTouchService LJI() {
        return Live.getService().LJI();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIIIIZZ() {
        Live.getService().LJIIIIZZ();
    }

    @Override // X.InterfaceC86394XvS
    public final int LJIJI() {
        return Live.getService().LJIJI();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJIJJ() {
        return Live.getService().LJIJJ();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJIIJZLJL() {
        return Live.getService().LJJIIJZLJL();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJIIZ() {
        Live.getLiteService().LJJIIZ();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJIJ() {
        Live.getService().LJJIJ();
    }

    @Override // X.InterfaceC86394XvS
    public final C30039Bqd LJJIJIIJI() {
        return Live.getService().LJJIJIIJI();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJIJIIJIL() {
        Live.getService().LJJIJIIJIL();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC07990Tb LJJIJIL() {
        return Live.getService().LJJIJIL();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJIZ() {
        return Live.getLiteService().LJJIZ();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJ() {
        Live.getService().LJJJ();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJIZL() {
        Live.getService().LJJJJIZL();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJJ() {
        Live.getService().LJJJJJ();
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment LJJJJJL() {
        return Live.getService().LJJJJJL();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC28682BNm LJJJJL() {
        return Live.getService().LJJJJL();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJZI() {
        Live.getService().LJJJJZI();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC71013Rtx LJJJLL() {
        return Live.getService().LJJJLL();
    }

    @Override // X.InterfaceC86394XvS
    public final ILiveFeedApiService LJJL() {
        return Live.getService().LJJL();
    }

    @Override // X.InterfaceC86394XvS
    public final IWalletService LJJLI() {
        return Live.getService().LJJLI();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJLIIIJ() {
        return Live.getService().LJJLIIIJ();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJLIIIJL() {
        return Live.getService().LJJLIIIJL();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30044Bqi LJJZ() {
        return Live.getService().LJJZ();
    }

    @Override // X.InterfaceC86394XvS
    public final Context LJLI() {
        if (Live.getService() != null) {
            return Live.getService().LJLI();
        }
        return null;
    }

    @Override // X.InterfaceC86394XvS
    public final C75 LJLJJL() {
        return Live.getService().LJLJJL();
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LJLJJLL() {
        return Live.getService().LJLJJLL();
    }

    @Override // X.InterfaceC86394XvS
    public final Boolean LJLJL() {
        return Live.getService().LJLJL();
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLLI() {
        InterfaceC86394XvS service = Live.getService();
        if (service != null) {
            service.LJLLI();
        }
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLLJ() {
        Live.getService().LJLLJ();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJLLLLLL() {
        return Live.getService().LJLLLLLL();
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LJLZ() {
        return Live.getService().LJLZ();
    }

    @Override // X.InterfaceC86394XvS
    public final String LJZI() {
        return Live.getService().LJZI();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC08690Vt T7() {
        return Live.getLiteService().T7();
    }

    @Override // X.InterfaceC86394XvS
    public final void U() {
        Live.getService().U();
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment c2() {
        return Live.getService().c2();
    }

    @Override // X.InterfaceC86394XvS
    public final void cleanEffectCache() {
        Live.getService().cleanEffectCache();
    }

    @Override // X.InterfaceC86394XvS
    public final void d9() {
        Live.getService().d9();
    }

    @Override // X.InterfaceC86394XvS
    public final void e9() {
        Live.getService().e9();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC05190Ih getCurrentUser() {
        return Live.getService().getCurrentUser();
    }

    @Override // X.InterfaceC86394XvS
    public final String getLiveCoreVersion() {
        return Live.getService().getLiveCoreVersion();
    }

    @Override // X.InterfaceC86394XvS
    public final java.util.Map<String, String> getRoomInfo() {
        return Live.getService().getRoomInfo();
    }

    @Override // X.InterfaceC86394XvS
    public final String getRtcDeviceID() {
        return Live.getService().getRtcDeviceID();
    }

    @Override // X.InterfaceC86394XvS
    public final String getRtcVersion() {
        return Live.getService().getRtcVersion();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC28737BPp h0() {
        if (Live.getService() != null) {
            return Live.getService().h0();
        }
        return null;
    }

    @Override // X.InterfaceC86394XvS
    public final void j9() {
        Live.getLiteService().j9();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC41329GJx l4() {
        return Live.getService().l4();
    }

    @Override // X.InterfaceC86394XvS
    public final void releaseLiveStream() {
        Live.getService().releaseLiveStream();
    }

    @Override // X.InterfaceC86394XvS
    public final void releaseVoiceChatLiveStream() {
        Live.getService().releaseVoiceChatLiveStream();
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC28921BWr startLiveManager() {
        return Live.getService().startLiveManager();
    }

    @Override // X.InterfaceC86394XvS
    public final void v3() {
        Live.getLiteService().v3();
    }

    @Override // X.InterfaceC86394XvS
    public final B4Z w() {
        return Live.getService().w();
    }

    @Override // X.InterfaceC86394XvS
    public final void E8(long j) {
        Live.getService().E8(j);
    }

    @Override // X.InterfaceC86394XvS
    public final void F2(java.util.Map map) {
        Live.getService().F2(map);
    }

    @Override // X.InterfaceC86394XvS
    public final java.util.Map<String, Object> G1(long j) {
        return Live.getService().G1(j);
    }

    @Override // X.InterfaceC86394XvS
    public final void H8(UDV udv) {
        Live.getService().H8(udv);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJFF(String str) {
        Live.getService().LJFF(str);
    }

    @Override // X.InterfaceC86394XvS
    public final CharSequence LJIIJ(User user) {
        return Live.getService().LJIIJ(user);
    }

    @Override // X.InterfaceC86394XvS
    public final Drawable LJIILIIL(String str) {
        return Live.getService().LJIILIIL(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIILL(boolean z) {
        Live.getService().LJIILL(z);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIILLIIL(String str) {
        Live.getService().LJIILLIIL(str);
    }

    @Override // X.InterfaceC86394XvS
    public final long LJIIZILJ(boolean z) {
        return Live.getService().LJIIZILJ(z);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIJ(boolean z) {
        Live.getService().LJIJ(z);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIJJLI(Context context) {
        Live.getService().LJIJJLI(context);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LJIL(android.net.Uri uri) {
        return Live.getService().LJIL(uri);
    }

    @Override // X.InterfaceC86394XvS
    public final HashMap<String, String> LJJII(EnterRoomConfig enterRoomConfig) {
        return Live.getService().LJJII(enterRoomConfig);
    }

    @Override // X.InterfaceC86394XvS
    public final OSZ<Boolean, Boolean> LJJIII(boolean z) {
        return Live.getService().LJJIII(z);
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJIIZI(int i) {
        return Live.getService().LJJIIZI(i);
    }

    @Override // X.InterfaceC86394XvS
    public final java.util.Map<String, String> LJJIJLIJ(Context context) {
        return Live.getService().LJJIJLIJ(context);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJIL(C1794672o c1794672o) {
        Live.getService().LJJIL(c1794672o);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJI(C1X c1x) {
        Live.getLiteService().LJJJI(c1x);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJI(C29930Bos c29930Bos) {
        Live.getService().LJJJJI(c29930Bos);
    }

    @Override // X.InterfaceC86394XvS
    public final EnterRoomConfig LJJJJLI(Room room) {
        return Live.getService().LJJJJLI(room);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC28737BPp LJJJJZ(String str) {
        if (Live.getService() != null) {
            return Live.getService().LJJJJZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJLZIJ(C58610MzO c58610MzO) {
        Live.getLiteService().LJJJLZIJ(c58610MzO);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIIJ(Activity activity) {
        Live.getService().LJJLIIIIJ(activity);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJILLIZJL(C29930Bos c29930Bos) {
        Live.getService().LJJLIIIJILLIZJL(c29930Bos);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJJI(String str) {
        Live.getService().LJJLIIIJJI(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJLJLI(Activity activity) {
        Live.getService().LJJLIIIJLJLI(activity);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC54761LeP LJJLIIJ(String str) {
        return Live.getService().LJJLIIJ(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLJ(Context context) {
        Live.getService().LJJLJ(context);
    }

    @Override // X.InterfaceC86394XvS
    public final int LJJLJLI(String str) {
        return Live.getService().LJJLJLI(str);
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJLL(String str) {
        return Live.getService().LJJLL(str);
    }

    @Override // X.InterfaceC86394XvS
    public final String LJLIIIL(String str) {
        return Live.getService().LJLIIIL(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLILLLLZI(C71151RwB c71151RwB) {
        Live.getService().LJLILLLLZI(c71151RwB);
    }

    public final void LL(X1X x1x) {
        X1X x1x2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMPDPreloadCallBack->mMpdStreams.length->");
        LIZ.append(this.LIZ.size());
        B4I.LIZ("MPD", X1D.LIZIZ(LIZ));
        this.LIZIZ = x1x;
        if (!this.LIZ.isEmpty() && (x1x2 = this.LIZIZ) != null) {
            x1x2.LIZ(new ArrayList<>(this.LIZ));
            this.LIZ.clear();
        }
    }

    public final void LLD(ArrayList<String> arrayList) {
        this.LIZ.clear();
        this.LIZ.addAll(arrayList);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMPDPreloadStreams->mMpdStreams.length->");
        LIZ.append(this.LIZ.size());
        B4I.LIZ("MPD", X1D.LIZIZ(LIZ));
        X1X x1x = this.LIZIZ;
        if (x1x != null) {
            x1x.LIZ(new ArrayList<>(this.LIZ));
            this.LIZ.clear();
        }
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment O3(Context context) {
        return Live.getService().O3(context);
    }

    @Override // X.InterfaceC86394XvS
    public final void S1(Context context) {
        Live.getService().S1(context);
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
        return Live.getService().createLiveBroadcastEndFragment(bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final BBC createLiveBroadcastEndSafetyToolsFragment(Bundle bundle) {
        return Live.getService().createLiveBroadcastEndSafetyToolsFragment(bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30046Bqk createStartLiveFragment(InterfaceC29074Bb4 interfaceC29074Bb4) {
        return Live.getService().createStartLiveFragment(interfaceC29074Bb4);
    }

    @Override // X.InterfaceC86394XvS
    public final void onLocaleChanged(Locale locale) {
        Live.getService().onLocaleChanged(locale);
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment pa(String str) {
        return Live.getService().pa(str);
    }

    @Override // X.InterfaceC86394XvS
    public final void preloadVoiceChatLiveStream(Context context) {
        Live.getService().preloadVoiceChatLiveStream(context);
    }

    @Override // X.InterfaceC86394XvS
    public final void setBroadcastActivity(Activity activity) {
        Live.getService().setBroadcastActivity(activity);
    }

    @Override // X.InterfaceC86394XvS
    public final B3D w0(EnterRoomConfig enterRoomConfig) {
        return Live.getService().w0(enterRoomConfig);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean w9(String str) {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).w9(str);
    }

    public static final void LLF(String str, InterfaceC31127CJn interfaceC31127CJn) {
        C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).triggerFeedPush(str)).LJJJLIIL(new AfS39S0101000_13(1, interfaceC31127CJn, 2), new AfS36S0101000_5(1, interfaceC31127CJn, 46));
    }

    @Override // X.InterfaceC86394XvS
    public final void A5(SubscriptionAdPageActivity subscriptionAdPageActivity, String str) {
        Live.getService().A5(subscriptionAdPageActivity, str);
    }

    @Override // X.InterfaceC86394XvS
    public final void F4(String str, InterfaceC28161B3l interfaceC28161B3l) {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).F4(str, interfaceC28161B3l);
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment F6(String str, GetSubInfoResponse getSubInfoResponse) {
        return Live.getService().F6(str, getSubInfoResponse);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LIZLLL(Context context, String str) {
        return Live.getService().LIZLLL(context, str);
    }

    @Override // X.InterfaceC86394XvS
    public final Object LJIIIZ(Object obj, String str) {
        InterfaceC86394XvS liteService = Live.getLiteService();
        if (liteService == null) {
            return obj;
        }
        return liteService.LJIIIZ(obj, str);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJIILJJIL(Activity activity, C29930Bos c29930Bos) {
        Live.getService().LJIILJJIL(activity, c29930Bos);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJJ(Long l, C63081OpJ c63081OpJ) {
        return Live.getService().LJJ(l, c63081OpJ);
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJI(String str, String str2) {
        return Live.getLiteService().LJJI(str, str2);
    }

    @Override // X.InterfaceC86394XvS
    public final Spannable LJJIFFI(Text text, String str) {
        return Live.getService().LJJIFFI(text, str);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC86149XrV LJJIIJ(C61494OBm c61494OBm, Bundle bundle) {
        return Live.getService().LJJIIJ(c61494OBm, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean LJJJIL(Context context, android.net.Uri uri) {
        return Live.getService().LJJJIL(context, uri);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJJJJ(SubmitSurveyAnswerRequest submitSurveyAnswerRequest, C63105Oph c63105Oph) {
        return Live.getService().LJJJJ(submitSurveyAnswerRequest, c63105Oph);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJJLL(long j, long j2) {
        Live.getService().LJJJJLL(j, j2);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJLIIL(Activity activity, C29930Bos c29930Bos) {
        Live.getService().LJJJLIIL(activity, c29930Bos);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJJIZ(B5Z b5z, C59414NTm c59414NTm) {
        Live.getService().LJJLIIIJJIZ(b5z, c59414NTm);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJZZI(List list, java.util.Map map) {
        Live.getService().LJJZZI(list, map);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJL(long j, C30018BqI c30018BqI) {
        Live.getService().LJL(j, c30018BqI);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC86149XrV LJLIIL(C61494OBm c61494OBm, Bundle bundle) {
        return Live.getService().LJLIIL(c61494OBm, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLJI(C20010qT c20010qT, C31627Cb9 c31627Cb9) {
        Live.getService().LJLJI(c20010qT, c31627Cb9);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC86149XrV LJLJJI(C61492OBk c61492OBk, Bundle bundle) {
        return Live.getService().LJLJJI(c61492OBk, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLJLJ(Context context, C28555BIp c28555BIp) {
        Live.getService().LJLJLJ(context, c28555BIp);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLL(Activity activity, Boolean bool) {
        Live.getService().LJLL(activity, bool);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLLILLLL(Context context, C29930Bos c29930Bos) {
        Live.getService().LJLLILLLL(context, c29930Bos);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLLL(String str, InterfaceC28738BPq interfaceC28738BPq) {
        Live.getService().LJLLL(str, interfaceC28738BPq);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJZ(java.util.Map map, C63106Opi c63106Opi) {
        return Live.getService().LJZ(map, c63106Opi);
    }

    public final C73805Sxt LJZL(long j, String str) {
        LiveRoomInfoApi.LIZ.getClass();
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(Live.getLiveDomain());
        Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(X1D.LIZIZ(LIZ)).create(LiveRoomInfoApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…eRoomInfoApi::class.java)");
        return ((LiveRoomInfoApi) create).fetchUserRoom(j, str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new C57396Mfo());
    }

    @Override // X.InterfaceC86394XvS
    public final boolean S4(Context context, String str) {
        return Live.getService().S4(context, str);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC86149XrV c1(C61494OBm c61494OBm, Bundle bundle) {
        return Live.getService().c1(c61494OBm, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC30302Bus createLiveBroadcastFragment(C2M c2m, Bundle bundle) {
        return Live.getService().createLiveBroadcastFragment(c2m, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final java.util.Map<String, InterfaceC38012Evw> getLiveWalletJSB(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        return Live.getService().getLiveWalletJSB(weakReference, c38049EwX);
    }

    @Override // X.InterfaceC86394XvS
    public final AbstractC73672Svk<C28467BFf<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(long j, long j2) {
        return Live.getService().reportSubscribePreviewTime(j, j2);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJIIJJI(String str, String str2, C86346Xug c86346Xug) {
        return Live.getService().LJIIJJI(str, str2, c86346Xug);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
        Live.getService().LJJLIIIJLLLLLLLZ(jSONObject, str, z);
    }

    @Override // X.InterfaceC86394XvS
    public final String LJJLIL(Context context, EnterRoomConfig enterRoomConfig, long j) {
        return Live.getService().LJJLIL(context, enterRoomConfig, j);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJLJLLL(Activity activity, C20060qY c20060qY, C32050Chy c32050Chy) {
        Live.getService().LJLJLLL(activity, c20060qY, c32050Chy);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean M(String str, String str2, boolean z) {
        return Live.getService().M(str, str2, z);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC38012Evw getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        return Live.getService().getLiveWalletJSBByName(str, weakReference, c38049EwX);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean handleSchema(Context context, String str, Bundle bundle) {
        return Live.getService().handleSchema(context, str, bundle);
    }

    @Override // X.InterfaceC86394XvS
    public final boolean handleWithoutHost(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        return Live.getService().handleWithoutHost(context, uri, map);
    }

    @Override // X.InterfaceC86394XvS
    public final void preloadLiveStream(Context context, boolean z, boolean z2) {
        Live.getService().preloadLiveStream(context, z, z2);
    }

    @Override // X.InterfaceC86394XvS
    public final B4K r6(ActivityC45651qj activityC45651qj, BZM bzm, int i) {
        return ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).r6(activityC45651qj, bzm, i);
    }

    @Override // X.InterfaceC86394XvS
    public final void updateRoomInfo(IMessageManager iMessageManager, long j, Context context) {
        Live.getService().updateRoomInfo(iMessageManager, j, context);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJJIJL(String str, String str2, long j, BOM bom) {
        return Live.getService().LJJIJL(str, str2, j, bom);
    }

    @Override // X.InterfaceC86394XvS
    public final IMessageManager LJJZZIII(long j, Context context, boolean z, EnumC32070CiI enumC32070CiI) {
        return Live.getService().LJJZZIII(j, context, z, enumC32070CiI);
    }

    @Override // X.InterfaceC86394XvS
    public final int LJLIL(ActivityC45651qj activityC45651qj, DialogFragment dialogFragment, Bundle bundle, C59654Nb8 c59654Nb8) {
        return Live.getService().LJLIL(activityC45651qj, dialogFragment, bundle, c59654Nb8);
    }

    @Override // X.InterfaceC86394XvS
    public final InterfaceC92693kP LJLLLL(boolean z, long j, long j2, InterfaceC28696BOa interfaceC28696BOa) {
        return Live.getService().LJLLLL(z, j, j2, interfaceC28696BOa);
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment T5(long j, String str, String str2, boolean z) {
        return Live.getService().T5(j, str, str2, z);
    }

    @Override // X.InterfaceC86394XvS
    public final DialogFragment createRechargeDialogFragment(ActivityC45651qj activityC45651qj, InterfaceC77682UeE interfaceC77682UeE, Bundle bundle, C77591Ucl c77591Ucl) {
        return Live.getService().createRechargeDialogFragment(activityC45651qj, interfaceC77682UeE, bundle, c77591Ucl);
    }

    @Override // X.InterfaceC86394XvS
    public final void LIZJ(Context context, String str, String str2, Bundle bundle, AAM aam) {
        Live.getService().LIZJ(context, str, str2, bundle, aam);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJII(Context context, Room room, C29930Bos c29930Bos, C31605Can c31605Can, C29242Bdm c29242Bdm) {
        Live.getService().LJII(context, room, c29930Bos, c31605Can, c29242Bdm);
    }

    @Override // X.InterfaceC86394XvS
    public final Fragment LJIIL(int i, int i2, int i3, int i4, String str, String str2) {
        return Live.getService().LJIIL(i, i2, i3, i4, str, str2);
    }

    @Override // X.InterfaceC86394XvS
    public final void LJJJZ(Context context, long j, long j2, long j3, String str, String str2) {
        Live.getService().LJJJZ(context, j, j2, j3, str, str2);
    }
}
