package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import webcast.api.room.PreviewTimeReportResponse;

/* renamed from: X.XvS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86394XvS {
    InterfaceC41312GJg A4();

    void A5(SubscriptionAdPageActivity subscriptionAdPageActivity, String str);

    void B7();

    void E8(long j);

    void F2(java.util.Map map);

    void F4(String str, InterfaceC28161B3l interfaceC28161B3l);

    Fragment F6(String str, GetSubInfoResponse getSubInfoResponse);

    java.util.Map<String, Object> G1(long j);

    void H8(UDV udv);

    String LIZ();

    C4RH LIZIZ();

    void LIZJ(Context context, String str, String str2, Bundle bundle, AAM aam);

    boolean LIZLLL(Context context, String str);

    Boolean LJ();

    void LJFF(String str);

    IShortTouchService LJI();

    void LJII(Context context, Room room, C29930Bos c29930Bos, C31605Can c31605Can, C29242Bdm c29242Bdm);

    void LJIIIIZZ();

    Object LJIIIZ(Object obj, String str);

    CharSequence LJIIJ(User user);

    InterfaceC92693kP LJIIJJI(String str, String str2, C86346Xug c86346Xug);

    Fragment LJIIL(int i, int i2, int i3, int i4, String str, String str2);

    Drawable LJIILIIL(String str);

    void LJIILJJIL(Activity activity, C29930Bos c29930Bos);

    void LJIILL(boolean z);

    void LJIILLIIL(String str);

    long LJIIZILJ(boolean z);

    void LJIJ(boolean z);

    int LJIJI();

    String LJIJJ();

    void LJIJJLI(Context context);

    boolean LJIL(android.net.Uri uri);

    InterfaceC92693kP LJJ(Long l, C63081OpJ c63081OpJ);

    String LJJI(String str, String str2);

    Spannable LJJIFFI(Text text, String str);

    HashMap<String, String> LJJII(EnterRoomConfig enterRoomConfig);

    OSZ<Boolean, Boolean> LJJIII(boolean z);

    InterfaceC86149XrV LJJIIJ(C61494OBm c61494OBm, Bundle bundle);

    String LJJIIJZLJL();

    void LJJIIZ();

    String LJJIIZI(int i);

    void LJJIJ();

    C30039Bqd LJJIJIIJI();

    void LJJIJIIJIL();

    InterfaceC07990Tb LJJIJIL();

    InterfaceC92693kP LJJIJL(String str, String str2, long j, BOM bom);

    java.util.Map<String, String> LJJIJLIJ(Context context);

    void LJJIL(C1794672o c1794672o);

    String LJJIZ();

    void LJJJ();

    void LJJJI(C1X c1x);

    boolean LJJJIL(Context context, android.net.Uri uri);

    InterfaceC92693kP LJJJJ(SubmitSurveyAnswerRequest submitSurveyAnswerRequest, C63105Oph c63105Oph);

    void LJJJJI(C29930Bos c29930Bos);

    void LJJJJIZL();

    void LJJJJJ();

    Fragment LJJJJJL();

    InterfaceC28682BNm LJJJJL();

    EnterRoomConfig LJJJJLI(Room room);

    void LJJJJLL(long j, long j2);

    InterfaceC28737BPp LJJJJZ(String str);

    void LJJJJZI();

    void LJJJLIIL(Activity activity, C29930Bos c29930Bos);

    InterfaceC71013Rtx LJJJLL();

    void LJJJLZIJ(C58610MzO c58610MzO);

    void LJJJZ(Context context, long j, long j2, long j3, String str, String str2);

    ILiveFeedApiService LJJL();

    IWalletService LJJLI();

    void LJJLIIIIJ(Activity activity);

    String LJJLIIIJ();

    void LJJLIIIJILLIZJL(C29930Bos c29930Bos);

    void LJJLIIIJJI(String str);

    void LJJLIIIJJIZ(B5Z b5z, C59414NTm c59414NTm);

    String LJJLIIIJL();

    void LJJLIIIJLJLI(Activity activity);

    void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z);

    InterfaceC54761LeP LJJLIIJ(String str);

    String LJJLIL(Context context, EnterRoomConfig enterRoomConfig, long j);

    void LJJLJ(Context context);

    int LJJLJLI(String str);

    String LJJLL(String str);

    InterfaceC30044Bqi LJJZ();

    void LJJZZI(List list, java.util.Map map);

    IMessageManager LJJZZIII(long j, Context context, boolean z, EnumC32070CiI enumC32070CiI);

    void LJL(long j, C30018BqI c30018BqI);

    Context LJLI();

    String LJLIIIL(String str);

    InterfaceC86149XrV LJLIIL(C61494OBm c61494OBm, Bundle bundle);

    int LJLIL(ActivityC45651qj activityC45651qj, DialogFragment dialogFragment, Bundle bundle, C59654Nb8 c59654Nb8);

    void LJLILLLLZI(C71151RwB c71151RwB);

    void LJLJI(C20010qT c20010qT, C31627Cb9 c31627Cb9);

    InterfaceC86149XrV LJLJJI(C61492OBk c61492OBk, Bundle bundle);

    C75 LJLJJL();

    boolean LJLJJLL();

    Boolean LJLJL();

    void LJLJLJ(Context context, C28555BIp c28555BIp);

    void LJLJLLL(Activity activity, C20060qY c20060qY, C32050Chy c32050Chy);

    void LJLL(Activity activity, Boolean bool);

    void LJLLI();

    void LJLLILLLL(Context context, C29930Bos c29930Bos);

    void LJLLJ();

    void LJLLL(String str, InterfaceC28738BPq interfaceC28738BPq);

    InterfaceC92693kP LJLLLL(boolean z, long j, long j2, InterfaceC28696BOa interfaceC28696BOa);

    String LJLLLLLL();

    boolean LJLZ();

    InterfaceC92693kP LJZ(java.util.Map map, C63106Opi c63106Opi);

    String LJZI();

    boolean M(String str, String str2, boolean z);

    Fragment O3(Context context);

    void S1(Context context);

    boolean S4(Context context, String str);

    Fragment T5(long j, String str, String str2, boolean z);

    InterfaceC08690Vt T7();

    void U();

    void W5(String str);

    boolean ba(String str);

    InterfaceC86149XrV c1(C61494OBm c61494OBm, Bundle bundle);

    Fragment c2();

    void cleanEffectCache();

    InterfaceC30043Bqh createLiveBroadcastEndFragment(Bundle bundle);

    BBC createLiveBroadcastEndSafetyToolsFragment(Bundle bundle);

    InterfaceC30302Bus createLiveBroadcastFragment(C2M c2m, Bundle bundle);

    InterfaceC30045Bqj createLiveCoverCameraFragment();

    DialogFragment createRechargeDialogFragment(ActivityC45651qj activityC45651qj, InterfaceC77682UeE interfaceC77682UeE, Bundle bundle, C77591Ucl c77591Ucl);

    InterfaceC30046Bqk createStartLiveFragment(InterfaceC29074Bb4 interfaceC29074Bb4);

    void d9();

    void e9();

    InterfaceC05190Ih getCurrentUser();

    String getLiveCoreVersion();

    java.util.Map<String, InterfaceC38012Evw> getLiveWalletJSB(WeakReference<Context> weakReference, C38049EwX c38049EwX);

    InterfaceC38012Evw getLiveWalletJSBByName(String str, WeakReference<Context> weakReference, C38049EwX c38049EwX);

    java.util.Map<String, String> getRoomInfo();

    String getRtcDeviceID();

    String getRtcVersion();

    InterfaceC28737BPp h0();

    boolean handleSchema(Context context, String str, Bundle bundle);

    boolean handleWithoutHost(Context context, android.net.Uri uri, java.util.Map<String, String> map);

    void j9();

    InterfaceC41329GJx l4();

    void onLocaleChanged(Locale locale);

    Fragment pa(String str);

    void preloadLiveStream(Context context, boolean z, boolean z2);

    void preloadVoiceChatLiveStream(Context context);

    B4K r6(ActivityC45651qj activityC45651qj, BZM bzm, int i);

    void releaseLiveStream();

    void releaseVoiceChatLiveStream();

    AbstractC73672Svk<C28467BFf<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(long j, long j2);

    void setBroadcastActivity(Activity activity);

    InterfaceC28921BWr startLiveManager();

    void updateRoomInfo(IMessageManager iMessageManager, long j, Context context);

    void v3();

    B4Z w();

    B3D w0(EnterRoomConfig enterRoomConfig);

    boolean w9(String str);
}
