package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.ui.platform.g1;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableType;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.internal.b;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS6S0002000_5;
import kotlin.jvm.internal.IDqS0S0010000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OJY implements InterfaceC162186Yc, C68K, InterfaceC60696Nrw {
    public static final OJY LJLIL = new OJY();
    public static final OJY LJLILLLLZI = new OJY();
    public static boolean LJLJI;
    public static boolean LJLJJI;
    public static OJY LJLJJL;

    public static Object LIZJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-4601056418088438121"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.C68K
    public boolean LIZ() {
        return false;
    }

    public static final F5I LJIIZILJ(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new F5I(readableMap);
    }

    public static final BulletReadableType LJIJ(ReadableType readableType) {
        if (readableType == null) {
            return null;
        }
        switch (C38373F4f.LIZ[readableType.ordinal()]) {
            case 1:
                return BulletReadableType.Boolean;
            case 2:
                return BulletReadableType.Int;
            case 3:
                return BulletReadableType.Number;
            case 4:
                return BulletReadableType.String;
            case 5:
                return BulletReadableType.Map;
            case 6:
                return BulletReadableType.Array;
            default:
                return BulletReadableType.Null;
        }
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    public static void LJFF(Context context, Aweme aweme) {
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZ = "homepage_ad";
        LIZ.LIZIZ = "click_download";
        LIZ.LJ(aweme);
        LIZ.LJIIIZ(context);
        if (aweme != null) {
            C58704N2e.LIZLLL("homepage_ad", "click_download", aweme.getAwemeRawAd()).LJII();
        }
    }

    public static void LJI(Context context, Aweme aweme) {
        NN1.LJJJJI(context, "button_show", aweme, NN1.LJIIIZ(context, aweme));
        NN1.LJJJJI(context, "othershow", aweme, NN1.LJIIJ(context, aweme, "button"));
    }

    public static void LJII(Context context, Aweme aweme) {
        JSONObject LJIIIZ = NN1.LJIIIZ(context, aweme);
        if (!NN1.LJIJ(context, aweme)) {
            return;
        }
        NN1.LJJJJJL(context, aweme.getAwemeRawAd(), "receive_ad", "receive", LJIIIZ);
    }

    public static void LJIIIIZZ(Context context, Aweme aweme) {
        NN1.LJJJJJ(context, "click", aweme, NN1.LJIIL(context, aweme, true, null));
        if (C63081OpJ.LJJLIIIJJI(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            O8Z.LIZ("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra());
        }
    }

    public static void LJIIJ(Context context, Aweme aweme) {
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZ = "homepage_ad";
        LIZ.LIZIZ = "click_website";
        LIZ.LJ(aweme);
        LIZ.LJIIIZ(context);
        if (aweme != null) {
            C58704N2e.LIZLLL("homepage_ad", "click_website", aweme.getAwemeRawAd()).LJII();
        }
    }

    public static Method LIZLLL(Class cls, String str, Class... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Object LJ(Object obj, Method method, Object... objArr) {
        if (method != null) {
            try {
                return LIZJ(obj, method, objArr);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public static void LJIIIZ(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject LJIIIZ;
        int i;
        if (C63081OpJ.LJLJL(aweme)) {
            HashMap hashMap = new HashMap();
            int i2 = 1;
            if (followStatus != null && followStatus.isCheating()) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put("is_cheated_follow", Integer.valueOf(i));
            if (followStatus != null) {
                i2 = followStatus.followStatus;
            }
            hashMap.put("follow_status", Integer.valueOf(i2));
            LJIIIZ = NN1.LJIIL(context, aweme, false, NN1.LJFF(hashMap));
        } else {
            LJIIIZ = NN1.LJIIIZ(context, aweme);
        }
        NN1.LJJJJJ(context, "follow", aweme, LJIIIZ);
    }

    public static void LJIIJJI(Context context, AwemeRawAd awemeRawAd, String str) {
        if (awemeRawAd == null || TextUtils.isEmpty(str)) {
            return;
        }
        NN1.LJJJJJL(context, awemeRawAd, str, "hide_app", NN1.LJIILIIL(context, awemeRawAd, false, null));
    }

    @Override // X.InterfaceC60696Nrw
    public void LIZIZ(boolean z, boolean z2, long j) {
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZLLL = C00F.LIZLLL("precreate kitview firstCreate = ", z, ", hasCache = ", z2, ", duration = ");
        LIZLLL.append(j);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZLLL), null, null, 6);
    }

    public static final void LJIIL(int i, long j, long j2, boolean z, int i2) {
        LJIILIIL(j, i, "", 0, 0, i2, j2, z);
    }

    public static final void LJIILJJIL(int i, long j, long j2, boolean z, int i2) {
        if (i != 30001) {
            if (i != 50002) {
                LJIILIIL(j, 10007, "", i, 0, i2, j2, z);
                return;
            } else {
                LJIILIIL(j, 10006, "", i, 0, i2, j2, z);
                return;
            }
        }
        LJIILIIL(j, 10005, "", i, 0, i2, j2, z);
    }

    public static final void LJIILL(int i, int i2, String errorMsg, long j, long j2, boolean z, int i3) {
        o.LJIIIZ(errorMsg, "errorMsg");
        LJIILIIL(j, i, errorMsg, 0, i2, i3, j2, z);
    }

    public static final InterfaceC07790Sh LJIILLIIL(C1M1 selectable, boolean z, C1OH interactionSource, C63099Opb c63099Opb, boolean z2, C0QW c0qw, InterfaceC65784Pro onClick) {
        o.LJIIIZ(selectable, "$this$selectable");
        o.LJIIIZ(interactionSource, "interactionSource");
        o.LJIIIZ(onClick, "onClick");
        return g1.LIZ(selectable, b.LJJII(C07720Sa.LIZJ(InterfaceC07790Sh.LJJJI, interactionSource, c63099Opb, z2, null, c0qw, onClick, 8), false, new IDqS0S0010000(z, 2)));
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [X.C3P, O] */
    public static final void LJIILIIL(long j, int i, String str, int i2, int i3, int i4, long j2, boolean z) {
        String str2;
        boolean z2;
        boolean z3;
        String str3;
        Boolean bool;
        Integer num;
        LiveMode streamType;
        StreamUrl streamUrl;
        Boolean bool2;
        LiveMode streamType2;
        Boolean bool3;
        LiveMode streamType3;
        String str4 = str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C3N c3n = (C3N) dataChannelGlobal.mv0(C3U.class);
        if (c3n != null && c3n.LJLJJL == j2) {
            return;
        }
        if (!LJLJJI) {
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room != null && (streamType3 = room.getStreamType()) != null) {
                bool3 = Boolean.valueOf(C28509BGv.LJ(streamType3));
            } else {
                bool3 = null;
            }
            if (C29306Beo.LJJIFFI(bool3)) {
                ((C32537Cpp) dataChannelGlobal.gv0(C3V.class)).LIZ = new C3P(i, i3, str4);
            }
        }
        if (LJLJI) {
            if (!LJLJJI) {
                Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                if (room2 != null && (streamType2 = room2.getStreamType()) != null) {
                    bool2 = Boolean.valueOf(C28509BGv.LJ(streamType2));
                } else {
                    bool2 = null;
                }
                if (C29306Beo.LJJIFFI(bool2)) {
                    C29689Bkz.LIZ.LJIIL(new AqS6S0002000_5(i, i3, 3));
                    LJLJJI = true;
                    return;
                }
                return;
            }
            return;
        }
        ((ConcurrentHashMap) dataChannelGlobal.LJLIL).remove(C3U.class);
        LJLJI = true;
        LJLJJI = true;
        if (TextUtils.isEmpty(str4)) {
            str4 = C21040s8.LIZ(i);
        }
        boolean Ou = ((IGameService) CN1.LIZ(IGameService.class)).Ou();
        Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room3 != null && (streamUrl = room3.getStreamUrl()) != null) {
            str2 = streamUrl.pushSdkParams;
        } else {
            str2 = null;
        }
        C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_video_stream_end_all");
        LIZLLL.LJFF(Integer.valueOf(i), "error_code");
        LIZLLL.LJII("error_msg", str4);
        Boolean valueOf = Boolean.valueOf(z);
        JSONObject jSONObject = LIZLLL.LIZIZ;
        if (valueOf != null) {
            z2 = valueOf.booleanValue();
        } else {
            z2 = false;
        }
        jSONObject.put("isFirstPushStream", z2);
        JSONObject jSONObject2 = LIZLLL.LIZJ;
        if (valueOf != null) {
            z3 = valueOf.booleanValue();
        } else {
            z3 = false;
        }
        jSONObject2.put("isFirstPushStream", z3);
        LIZLLL.LJFF(Integer.valueOf(i2), "api_error_code");
        LIZLLL.LJFF(Integer.valueOf(i3), "liveCore_error_code");
        LIZLLL.LJI(Long.valueOf(j), "user_id");
        LIZLLL.LJI(Long.valueOf(j2), "room_id");
        String str5 = "";
        if (!C21040s8.LIZJ(i)) {
            str3 = "";
        } else {
            str3 = str2;
        }
        LIZLLL.LJII("push_params", str3);
        LIZLLL.LJFF(Integer.valueOf(i4), "resume_scene");
        LIZLLL.LJFF(Integer.valueOf(Ou ? 1 : 0), "isDualDevice");
        C78840Uwu.LJIIIIZZ(LIZLLL);
        LIZLLL.LJIIIZ();
        Room room4 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room4 != null && (streamType = room4.getStreamType()) != null) {
            bool = Boolean.valueOf(C28509BGv.LJ(streamType));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            num = Integer.valueOf(new AnonymousClass078(GlobalContext.getApplicationContext()).LIZIZ() ? 1 : 0);
        } else {
            num = null;
        }
        BZI LIZ = C28787BRn.LIZ("ttlive_video_stream_end_all");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Integer.valueOf(i), "error_code");
        LIZ.LJIJJ(str4, "error_msg");
        LIZ.LJIJJ(Boolean.valueOf(z), "is_first_push_stream_fail");
        LIZ.LJIJJ(Integer.valueOf(i2), "api_error_code");
        LIZ.LJIJJ(Integer.valueOf(i3), "liveCore_error_code");
        if (C21040s8.LIZJ(i)) {
            str5 = str2;
        }
        LIZ.LJIJJ(str5, "push_params");
        LIZ.LJIJJ(Integer.valueOf(C29697Bl7.LJIIL ? 1 : 0), "is_bytevc1");
        LIZ.LJIJJ(Integer.valueOf(C29697Bl7.LJIILIIL ? 1 : 0), "is_hw");
        LIZ.LJIJJ(Integer.valueOf(i4), "resume_scene");
        LIZ.LJIJJ(num, "is_notification_authorized");
        LIZ.LJIJJ(Integer.valueOf(Ou ? 1 : 0), "isDualDevice");
        LIZ.LJJIIZI();
        Context context = (Context) dataChannelGlobal.mv0(C54982Du.class);
        if (context != null && C30922CBq.LIZIZ && i != 10001) {
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LIZJ = "Only for Debugging";
            StringBuilder LIZJ = C06460Ne.LIZJ("Take it easy, if you are confused, \nyou can take a screenshot and find broadcast oncall.\nerrorCode = ", i, " \napi_error_code = ", i2, " \nliveCore_error_code = ");
            LIZJ.append(i3);
            LIZJ.append(" \nerrorMsg = ");
            LIZJ.append(str4);
            c47071t1.LJII(X1D.LIZIZ(LIZJ));
            c47071t1.LJIILIIL("OK", C61576OEq.LJLILLLLZI);
            LiveDialog LIZ2 = c47071t1.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "3447988321946810303")).LIZ) {
                return;
            }
            LIZ2.show();
        }
    }
}
