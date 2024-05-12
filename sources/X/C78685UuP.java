package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.dsl.AlsVMContainer;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.di.push.PushServiceMock;
import com.ss.android.ugc.aweme.api.MultiRedDotRequest;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentityMatchRule;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotRequest;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.relation.ffp.ui.SearchResultFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendsV2Fragment;
import com.ss.android.ugc.aweme.service.IECDebugService;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.statemachine.StateMachine;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTAComponent;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* renamed from: X.UuP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78685UuP implements S3D, C0K7, RTU, InterfaceC36766Ebq {
    public static long LJLILLLLZI;
    public static long LJLJI;
    public static final C78685UuP LJLIL = new C78685UuP();
    public static final C78685UuP LJLJJI = new C78685UuP();

    public static int LJI(int i) {
        if (i >= 1000) {
            if (i < 1100) {
                return 2102;
            }
            if (i >= 1100 && i >= 1200 && i < 1300) {
                return 2101;
            }
        }
        return 2199;
    }

    public static IPushApi LJJIII() {
        try {
            IPushApi createIPushApibyMonsterPlugin = PushService.createIPushApibyMonsterPlugin(false);
            if (createIPushApibyMonsterPlugin != null) {
                return createIPushApibyMonsterPlugin;
            }
        } catch (Exception unused) {
        }
        return new PushServiceMock();
    }

    public static final void LJJZ() {
        C2063788b LIZ = C2063688a.LIZ();
        if (LIZ.LIZ.getBoolean("publish_since_photo_mode_educate_experiment", false)) {
            return;
        }
        LIZ.LIZ.storeBoolean("publish_since_photo_mode_educate_experiment", true);
    }

    @Override // X.InterfaceC36766Ebq
    public void LIZIZ() {
    }

    @Override // X.InterfaceC36766Ebq
    public void LIZJ(C36758Ebi request, EnumC36761Ebl hitState) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(hitState, "hitState");
    }

    public void LJJL(O1I o1i) {
        throw null;
    }

    public static final C44650Hfi LJIILIIL() {
        return new C44650Hfi(new C44642Hfa());
    }

    public static final C44650Hfi LJIIZILJ() {
        return new C44650Hfi(new C44633HfR());
    }

    public static void LJIJJLI() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public static void LJJ() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public static void LJJI() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public static final String LJJIIJZLJL() {
        String string = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getString("autogenerated_caption_language_selection", IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage());
        o.LJIIIIZZ(string, "getRepo(TOOLS_PUBLISH_RE…s.java).appLanguage\n    )");
        return string;
    }

    public static final boolean LJJJJI() {
        return Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getBoolean("select_publish_with_template_anchor", true);
    }

    public static boolean LJJJJLL() {
        return e1.LIZ(31744, "optimize_combinefeeddrawv2", true, false);
    }

    public static final boolean LJJJJZI() {
        return LJJJZ(Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getString("has_show_ugc_template_tips", ""));
    }

    public static void LJJJLL() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public static void LJJJLZIJ() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public static final void LJJLL() {
        if (Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getBoolean("redesign_has_posted", false)) {
            return;
        }
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeBoolean("redesign_has_posted", true);
    }

    public static final void LJJZZI() {
        int i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("redesign_more_option_hint", 0);
        if (i > 10) {
            return;
        }
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("redesign_more_option_hint", i + 1);
    }

    public static void LJLIL() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public static void LJLILLLLZI() {
        PK0.LJIIIIZZ.isDebugMode();
    }

    public S3R LJJIIJ() {
        return new L3T();
    }

    public InterfaceC71465S2z LJJIIZ() {
        return new L3X();
    }

    public InterfaceC71463S2x LJJIJLIJ() {
        return new C53433Ky5();
    }

    public InterfaceC71480S3o LJJIL() {
        return new C53618L2o();
    }

    public InterfaceC71436S1w LJJIZ() {
        return new C53645L3p();
    }

    public S3B LJJJ() {
        return new C53646L3q();
    }

    public InterfaceC71429S1p LJJJJIZL() {
        return new C53614L2k();
    }

    public static final C12I LJJIJIIJIL() {
        int i;
        Context LIZLLL = C15380j0.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getContext()");
        Integer LJI = C79045V0n.LJI(R.attr.dj, LIZLLL);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -1;
        }
        C1Q4 LIZLLL2 = C259910h.LIZLLL(R.attr.aw0, C15380j0.LIZLLL());
        if (LIZLLL2 != null) {
            LIZLLL2.setTint(i);
        } else {
            LIZLLL2 = null;
        }
        return new C12I(LIZLLL2, ColorStateList.valueOf(i));
    }

    public static final int LJJJJJ() {
        return Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt(C77339UWx.LIZJ(), 0);
    }

    public static final boolean LJJLIIIJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("needShowPrompt -> getShowPromptTimesForCurrentUser() = ");
        LIZ.append(LJJJJJ());
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (LJJJJJ() < 3) {
            return true;
        }
        return false;
    }

    public java.util.Map LJJJIL() {
        return TMC.LJIJI();
    }

    public static final String LJ(Integer num) {
        String str;
        if (num != null) {
            if (num.intValue() == 0) {
                str = "FF_PROFILE_AAC_MAIN";
            } else if (num.intValue() == 1) {
                str = "FF_PROFILE_AAC_LOW";
            } else if (num.intValue() == 2) {
                str = "FF_PROFILE_AAC_SSR";
            } else if (num.intValue() == 3) {
                str = "FF_PROFILE_AAC_LTP";
            } else if (num.intValue() == 4) {
                str = "FF_PROFILE_AAC_HE";
            } else if (num.intValue() == 22) {
                str = "FF_PROFILE_AAC_LD";
            } else if (num.intValue() == 28) {
                str = "FF_PROFILE_AAC_HE_V2";
            } else if (num.intValue() == 38) {
                str = "FF_PROFILE_AAC_ELD";
            } else if (num.intValue() == 128) {
                str = "FF_PROFILE_MPEG2_AAC_LOW";
            } else if (num.intValue() == 131) {
                str = "FF_PROFILE_MPEG2_AAC_HE";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(num);
            LIZ.append('_');
            LIZ.append(str);
            return X1D.LIZIZ(LIZ);
        }
        str = "Unknown";
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(num);
        LIZ2.append('_');
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    public static int LJFF(Throwable th) {
        if (th == null) {
            return -1;
        }
        if (th instanceof ConnectTimeoutException) {
            return 1101;
        }
        if (th instanceof SocketTimeoutException) {
            return 1102;
        }
        if (th instanceof ConnectException) {
            return 1103;
        }
        if (th instanceof BindException) {
            return 1104;
        }
        if (th instanceof NoRouteToHostException) {
            return 1105;
        }
        if (th instanceof PortUnreachableException) {
            return 1106;
        }
        if (th instanceof UnknownHostException) {
            return 1107;
        }
        if (th instanceof SocketException) {
            return 1108;
        }
        if (th instanceof IllegalArgumentException) {
            return 1201;
        }
        if (th instanceof IllegalStateException) {
            return 1202;
        }
        if (th instanceof RuntimeException) {
            return 1203;
        }
        if (th instanceof InterruptedException) {
            return 1204;
        }
        if (th instanceof FileNotFoundException) {
            return 1205;
        }
        if (!(th instanceof IOException)) {
            return -1;
        }
        String message = th.getMessage();
        if (message != null && message.length() != 0) {
            if (message.contains("canceled") || message.contains("Canceled")) {
                return 1001;
            }
            if (message.contains("network not available")) {
                return 1002;
            }
        }
        return 1206;
    }

    public static void LJII(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
            C39734Fic.LIZJ().getClass();
        }
    }

    public static void LJIIIIZZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static final int LJIIJ(float f) {
        double floor;
        if (f >= 0.0f) {
            floor = Math.ceil(f);
        } else {
            floor = Math.floor(f);
        }
        return -((int) floor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MultiRedDotRequest LJIILJJIL(EnumC36206EIw enumC36206EIw) {
        int i;
        int type;
        OSJ LJJIIJZLJL = C54029LIj.LIZIZ.LJJIIJZLJL();
        List list = (List) LJJIIJZLJL.getFirst();
        List list2 = (List) LJJIIJZLJL.getSecond();
        List list3 = (List) LJJIIJZLJL.getThird();
        ArrayList arrayList = new ArrayList(C32I.LJJL(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((C54859Lfz) it.next()).LJLIL);
        }
        int i2 = 0;
        if (C61052aT.LIZ()) {
            RBX rbx = (RBX) HG3.LJIILL();
            String curUserId = rbx.getCurUserId();
            if (rbx.getCurUser().getFriendCount() >= C226078u3.LIZ().triggerFriendCount) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("tt_friends_tab_educate_");
                LIZ.append(curUserId);
                Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
                if (repo.getInt("key_unclick_count", 0) < C226078u3.LIZ().maxUnClickCount) {
                    long j = repo.getLong("key_visit_friends_feed_timestamp", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = 3600000;
                    if ((currentTimeMillis - j) + j2 > C226078u3.LIZ().triggerLastVisitHours * 3600000 && (currentTimeMillis - repo.getLong("key_show_timestamp", 0L)) + j2 > C226078u3.LIZ().displayControlDays * 86400000 && (i = C226078u3.LIZ().triggerUnreadCount) >= 0) {
                        i2 = i;
                    }
                }
            }
        }
        SocialFeedRedDotRequest socialFeedRedDotRequest = new SocialFeedRedDotRequest(list, list2, arrayList, i2);
        ArrayList<Integer> sv = LHM.LIZIZ.LIZIZ().redDotLogic().sv();
        SocialFeedRedDotRequest socialFeedRedDotRequest2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (enumC36206EIw == EnumC36206EIw.SWITCH_ACCOUNT) {
            type = EnumC36206EIw.LOGIN_SUCCESS.getType();
        } else {
            type = enumC36206EIw.getType();
        }
        MultiRedDotRequest multiRedDotRequest = new MultiRedDotRequest(socialFeedRedDotRequest2, objArr2 == true ? 1 : 0, sv, type, 3, objArr == true ? 1 : 0);
        if (sv.contains(Integer.valueOf(LHC.FRIEND_FOLLOWING_MERGE_FEED.getType()))) {
            multiRedDotRequest.setFollowFriendMergeFeedRequest(socialFeedRedDotRequest);
        } else {
            multiRedDotRequest.setFriendFeedRedDotRequest(socialFeedRedDotRequest);
        }
        return multiRedDotRequest;
    }

    public static final boolean LJIJ(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(C28500BGm.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void LJIL(File file) {
        File[] listFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                LJIL(file2);
            }
        }
        C16880lQ.LLLZZIL(file);
    }

    public static final boolean LJJIFFI(AudioEnhanceParam audioEnhanceParam) {
        o.LJIIIZ(audioEnhanceParam, "<this>");
        if (audioEnhanceParam.getEnableOriginEnhance() || audioEnhanceParam.getEnableMusicEnhance()) {
            return true;
        }
        return false;
    }

    public static void LJJII(File file) {
        boolean mkdirs;
        List<String> list = C39639Fh5.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("origin:");
        LIZ.append(file);
        LIZ.append(" ");
        LIZ.append(file.exists());
        LIZ.append(" ");
        LIZ.append(file.canWrite());
        LIZ.append(" ");
        LIZ.append(file.canRead());
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
        copyOnWriteArrayList.add(X1D.LIZIZ(LIZ));
        if (!file.exists() && !(mkdirs = file.mkdirs())) {
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.exists()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("try mkdir single ");
                LIZ2.append(file.mkdir());
                copyOnWriteArrayList.add(X1D.LIZIZ(LIZ2));
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("mkdir failed");
            LIZ3.append(file);
            LIZ3.append(" ");
            LIZ3.append(mkdirs);
            copyOnWriteArrayList.add(X1D.LIZIZ(LIZ3));
        }
        boolean canWrite = file.canWrite();
        boolean canRead = file.canRead();
        if (!canWrite) {
            file.setWritable(true);
        }
        if (!canRead) {
            file.setReadable(true);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("after:");
        LIZ4.append(file);
        LIZ4.append(" ");
        LIZ4.append(file.exists());
        LIZ4.append(" ");
        LIZ4.append(file.canWrite());
        LIZ4.append(" ");
        LIZ4.append(file.canRead());
        copyOnWriteArrayList.add(X1D.LIZIZ(LIZ4));
    }

    public static final SocialFeedRedDotResponse LJJIJ(NewContentResponse newContentResponse) {
        if (newContentResponse == null) {
            return null;
        }
        if (LHM.LIZIZ.LIZIZ().redDotLogic().sv().contains(Integer.valueOf(LHC.FRIEND_FOLLOWING_MERGE_FEED.getType()))) {
            return newContentResponse.getFollowFriendMergeFeedResponse();
        }
        return newContentResponse.getFriendsFeedResponse();
    }

    public static final java.util.Map LJJIJIIJI(IZL izl) {
        C47750Ioc c47750Ioc;
        Object obj;
        java.util.Map map;
        C46882Iac player = izl.LLI.LJLILLLLZI.getPlayer();
        if (player == null || (c47750Ioc = player.LIZ.e) == null || (obj = c47750Ioc.LLJZIJLIL.LIZ) == null || !(((java.util.Map) obj).get("req_phase_cost") instanceof java.util.Map) || (map = (java.util.Map) ((java.util.Map) player.LIZ.e.LLJZIJLIL.LIZ).get("req_phase_cost")) == null) {
            return new HashMap();
        }
        return map;
    }

    public static final String LJJIJL(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "mp4";
            }
            if (num.intValue() == 2) {
                return "flv";
            }
            if (num.intValue() == 3) {
                return "cmaf";
            }
            if (num.intValue() == 4) {
                return "hls";
            }
            if (num.intValue() == 5) {
                return "dash";
            }
            if (num.intValue() == 6) {
                return "bash";
            }
            if (num.intValue() == 7) {
                return "mp3";
            }
            if (num.intValue() == 8) {
                return "avph";
            }
            if (num.intValue() == 9) {
                return "llash";
            }
            if (num.intValue() == 10) {
                return "webrtc";
            }
            if (num.intValue() == 11) {
                return "live";
            }
        }
        return "NotInEnum";
    }

    public static String LJJJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1005512447:
                if (!str.equals("output")) {
                    return "";
                }
                return "post";
            case -865586570:
                if (!str.equals("trends")) {
                    return "";
                }
                return "dongtai";
            case 3321751:
                if (!str.equals("like")) {
                    return "";
                }
                return "fav";
            default:
                return "";
        }
    }

    public static final int LJJJJ(long j) {
        int i;
        if (Math.abs(C10370av.LIZLLL(j)) >= 0.5f) {
            i = 1;
        } else {
            i = 0;
        }
        if (Math.abs(C10370av.LJ(j)) >= 0.5f) {
            return i | 2;
        }
        return i;
    }

    public static String LJJJJJL(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        th.printStackTrace(new PrintStream(byteArrayOutputStream));
        return byteArrayOutputStream.toString();
    }

    public static final boolean LJJJJL(long j) {
        int i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("USER_HD_VIDEO_SWITCH_SETTING", 0);
        if (i != 0) {
            if (i != 1) {
                return false;
            }
        } else if (!C44749HhJ.LIZ()) {
            C5H3 c5h3 = C52519KjL.LIZ;
            if (((Number) c5h3.getValue()).longValue() <= 0 || j <= 0 || j < ((Number) c5h3.getValue()).longValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Object LJJJJLI(C0FT value) {
        o.LJIIJ(value, "$this$value");
        return value.LIZ;
    }

    public static final String LJJJJZ(long j) {
        int i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("USER_HD_VIDEO_SWITCH_SETTING", 0);
        if (i != 0) {
            if (i != 1) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "1";
        }
        if (!C44674Hg6.LIZ() || !C44749HhJ.LIZ()) {
            if (C44674Hg6.LIZ() && !C44749HhJ.LIZ()) {
                long longValue = ((Number) C52519KjL.LIZ.getValue()).longValue();
                if (longValue <= 0 || j <= 0 || j < longValue) {
                    return "d0";
                }
            } else {
                return "d2";
            }
        }
        return "Y.AObserverS81S0100000_13";
    }

    public static final boolean LJJJLIIL(String str) {
        if (LJJJZ(Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getString("has_show_ugc_template_tips", "")) && !o.LJ(Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getString("has_show_ugc_template_tips", ""), str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJZ(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static SeiAppData LJJLIIIJJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("app_data")) {
                return null;
            }
            SeiAppData seiAppData = (SeiAppData) C09650Zl.LIZIZ.LJI(JSONObjectProtectorUtils.getString(jSONObject, "app_data"), SeiAppData.class);
            if (seiAppData == null) {
                return null;
            }
            if (seiAppData.version < 0) {
                return null;
            }
            return seiAppData;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void LJJLIIIJLLLLLLLZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void LJJLIIJ(Context context) {
        if (!FCD.LJI(context)) {
            return;
        }
        try {
            FFL.LJIIIZ().getClass();
            boolean LJ = FFL.LJ(31744, "keva_async_write_enable_v2", true, false);
            File file = new File(C16880lQ.LLIIJLIL(context) + "/is_keva_async_write_enabled.cfg");
            if (LJ && !file.exists() && !file.createNewFile()) {
                file.createNewFile();
            }
        } catch (Throwable unused) {
        }
    }

    public static final C65776Prg LJJLIL(boolean z) {
        Class cls;
        if (!z && ((Number) C52774KnS.LIZ.getValue()).intValue() != 0) {
            cls = SearchFriendsV2Fragment.class;
        } else {
            cls = SearchResultFragment.class;
        }
        return C65352Pkq.LIZ(cls);
    }

    public static final String LJJLJLI(String str) {
        return QZP.LIZIZ("\\{\\d+\\}", str, "%s");
    }

    public static C47164IfA LJL(InterfaceC46867IaN interfaceC46867IaN) {
        if (interfaceC46867IaN != null && interfaceC46867IaN.getTag() != null) {
            return interfaceC46867IaN.getTag();
        }
        return null;
    }

    @Override // X.S3D
    public TuxTextView LIZ(Object obj) {
        ViewGroup containerView = (ViewGroup) obj;
        o.LJIIIZ(containerView, "containerView");
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cmx);
        tuxTextView.setTextColorRes(R.attr.dj);
        tuxTextView.setTuxFont(92);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(1));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
        c110614Vt.LJII = C7MY.LIZIZ(6);
        Context context2 = containerView.getContext();
        o.LJIIIIZZ(context2, "containerView.context");
        Drawable LIZ = c110614Vt.LIZ(context2);
        tuxTextView.setCompoundDrawablesWithIntrinsicBounds(LIZ, (Drawable) null, LIZ, (Drawable) null);
        tuxTextView.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        tuxTextView.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        containerView.addView(tuxTextView, layoutParams);
        return tuxTextView;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static void LJIIIZ(C1B3 c1b3, boolean z) {
        if (z) {
            c1b3.LJII();
        } else {
            c1b3.LJI();
        }
    }

    public static final void LJIIJJI(WM7 config, InterfaceC88472Yns configInit) {
        o.LJIIIZ(config, "$this$config");
        o.LJIIIZ(configInit, "configInit");
        ViewModel viewModel = C165716et.LIZ(config).get(AlsVMContainer.class);
        o.LJIIIIZZ(viewModel, "SceneViewModelProviders.…sVMContainer::class.java]");
        C275616i c275616i = new C275616i(0);
        configInit.invoke(c275616i);
        ((AlsVMContainer) viewModel).LJLIL = c275616i;
    }

    public static void LJIJJ(C26227ARb c26227ARb, View view) {
        c26227ARb.LJIIIZ = new C244679ix(c26227ARb.LIZ, view, 0);
    }

    public static final int LJJIIZI(int i, Context context) {
        o.LJIIIZ(context, "context");
        try {
            return context.getResources().getDimensionPixelSize(i);
        } catch (Resources.NotFoundException e) {
            C34B.LJ("ActionBarAdapter", e);
            return 0;
        }
    }

    public static final void LJJLIIIJILLIZJL(String str, java.util.Map map) {
        Object LIZ;
        Object opt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    if (LJJJZ(key) && (opt = jSONObject.opt(key)) != null) {
                        o.LJIIIIZZ(key, "key");
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
    }

    public static final void LJJLIIIJJIZ(String str, java.util.Map map) {
        o.LJIIIZ(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        LJJLIIIJL(str, jSONObject);
    }

    public static final void LJJLIIIJL(String str, JSONObject jSONObject) {
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C48658J7u.LIZIZ(str, jSONObject);
    }

    public static final void LJJLIIIJLJLI(C188727au c188727au, String str) {
        JSONObject jSONObject = new JSONObject();
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "params.builder()");
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        LJJLIIIJL(str, jSONObject);
    }

    public static final void LJJLJ(C0FT value, Object obj) {
        o.LJIIJ(value, "$this$value");
        value.LIZ = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r2 < r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r3 < r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r3 > r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r2 > r1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LJJZZIII(long r5, int[] r7) {
        /*
            float r0 = X.C10370av.LIZLLL(r5)
            r1 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L41
            r0 = r7[r1]
            float r3 = (float) r0
            float r3 = r3 * r4
            float r1 = X.C10370av.LIZLLL(r5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L19
        L18:
            r3 = r1
        L19:
            float r0 = X.C10370av.LJ(r5)
            r1 = 1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L34
            r0 = r7[r1]
            float r2 = (float) r0
            float r2 = r2 * r4
            float r1 = X.C10370av.LJ(r5)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
        L2e:
            r2 = r1
        L2f:
            long r0 = X.C78923UyF.LIZ(r3, r2)
            return r0
        L34:
            r0 = r7[r1]
            float r2 = (float) r0
            float r2 = r2 * r4
            float r1 = X.C10370av.LJ(r5)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2f
            goto L2e
        L41:
            r0 = r7[r1]
            float r3 = (float) r0
            float r3 = r3 * r4
            float r1 = X.C10370av.LIZLLL(r5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L19
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78685UuP.LJJZZIII(long, int[]):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        if (r3 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJLI(java.lang.Integer r2, java.lang.Integer r3) {
        /*
            if (r2 != 0) goto L9
            r2 = r3
            if (r3 != 0) goto L9
        L5:
            r0 = 2130968757(0x7f0400b5, float:1.7546177E38)
        L8:
            return r0
        L9:
            int r0 = r2.intValue()
            if (r0 != 0) goto L13
            r0 = 2130968763(0x7f0400bb, float:1.7546189E38)
            goto L8
        L13:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L1e
            r0 = 2130968670(0x7f04005e, float:1.7546E38)
            goto L8
        L1e:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L29
            r0 = 2130968766(0x7f0400be, float:1.7546195E38)
            goto L8
        L29:
            int r1 = r2.intValue()
            r0 = 6
            if (r1 != r0) goto L34
            r0 = 2130968780(0x7f0400cc, float:1.7546223E38)
            goto L8
        L34:
            int r1 = r2.intValue()
            r0 = 5
            if (r1 != r0) goto L3f
            r0 = 2130968847(0x7f04010f, float:1.754636E38)
            goto L8
        L3f:
            int r1 = r2.intValue()
            r0 = 4
            if (r1 != r0) goto L4a
            r0 = 2130968758(0x7f0400b6, float:1.7546179E38)
            goto L8
        L4a:
            int r1 = r2.intValue()
            r0 = 7
            if (r1 != r0) goto L5
            r0 = 2130968764(0x7f0400bc, float:1.754619E38)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78685UuP.LJLI(java.lang.Integer, java.lang.Integer):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        if (r3 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJLIIIL(java.lang.Integer r2, java.lang.Integer r3) {
        /*
            if (r2 != 0) goto L8
            r2 = r3
            if (r3 != 0) goto L8
        L5:
            r0 = 41
        L7:
            return r0
        L8:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L12
            r0 = 51
            goto L7
        L12:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L1c
            r0 = 52
            goto L7
        L1c:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L26
            r0 = 61
            goto L7
        L26:
            int r1 = r2.intValue()
            r0 = 6
            if (r1 != r0) goto L30
            r0 = 62
            goto L7
        L30:
            int r1 = r2.intValue()
            r0 = 5
            if (r1 != r0) goto L5
            r0 = 42
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78685UuP.LJLIIIL(java.lang.Integer, java.lang.Integer):int");
    }

    public static final void LJLIIL(StateMachine stateMachine, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(stateMachine, "<this>");
        Y3I y3i = new Y3I();
        interfaceC88472Yns.invoke(y3i);
        C65776Prg c65776Prg = y3i.LIZ;
        if (c65776Prg != null) {
            OSZ osz = new OSZ(c65776Prg, y3i.LIZIZ);
            InterfaceC65350Pko interfaceC65350Pko = (InterfaceC65350Pko) osz.getFirst();
            for (Y27 y27 : (List) osz.getSecond()) {
                Y23 y23 = new Y23(interfaceC65350Pko, y27.LIZIZ, y27.LIZJ, y27.LIZLLL, y27.LJ);
                java.util.Set set = (java.util.Set) ((LinkedHashMap) stateMachine.LJLJLLL).get(y23.LIZ);
                if (set == null) {
                    set = new LinkedHashSet();
                }
                if (!set.contains(y23)) {
                    set.add(y23);
                    stateMachine.LJLJLLL.put(y23.LIZ, set);
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        List softBindMusic = (List) obj;
        RecommendMusic recommendMusic = (RecommendMusic) obj2;
        o.LJIIIZ(softBindMusic, "softBindMusic");
        o.LJIIIZ(recommendMusic, "recommendMusic");
        return new HNQ(recommendMusic, softBindMusic);
    }

    public static final String LIZLLL(String str, Object obj, String str2) {
        o.LJIIIZ(str, "<this>");
        if (obj == null) {
            obj = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append('&');
        LIZ.append(str2);
        LIZ.append('=');
        LIZ.append(obj);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object LJIILL(Class cls, BizIdentity bizIdentity, boolean z) {
        InterfaceC65784Pro<Object> interfaceC65784Pro;
        Object invoke;
        C69765RZp c69765RZp = C69757RZh.LIZ.get(cls);
        if (c69765RZp != null) {
            InterfaceC65784Pro<Object> interfaceC65784Pro2 = c69765RZp.LIZIZ.get(bizIdentity.getUniqueKey());
            if (interfaceC65784Pro2 != null) {
                invoke = interfaceC65784Pro2.invoke();
            } else {
                for (BizIdentityMatchRule bizIdentityMatchRule : c69765RZp.LIZ.getValue().keySet()) {
                    if (bizIdentityMatchRule.isMatch(bizIdentity) && (interfaceC65784Pro = c69765RZp.LIZ.getValue().get(bizIdentityMatchRule)) != null) {
                        c69765RZp.LIZIZ.put(bizIdentity.getUniqueKey(), interfaceC65784Pro);
                        invoke = interfaceC65784Pro.invoke();
                    }
                }
            }
            if (invoke != null) {
                return invoke;
            }
        }
        if (!z) {
            return null;
        }
        ((IECDebugService) ServiceManager.get().getService(IECDebugService.class)).LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[EC StrategyService] create strategy service failed, serviceType: ");
        LIZ.append(cls);
        LIZ.append(", id: ");
        LIZ.append(bizIdentity.getUniqueKey());
        C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        return null;
    }

    public static final void LJIJI(C26227ARb c26227ARb, View view, int i, int i2) {
        C244679ix c244679ix = new C244679ix(c26227ARb.LIZ, view, i);
        c244679ix.LJI = i2;
        c26227ARb.LJIIIZ = c244679ix;
    }

    public static final float LJJIJIL(C0VG c0vg, int i, boolean z, boolean z2) {
        int i2;
        int LJIILJJIL;
        boolean z3 = false;
        if (!z ? !z2 : z2) {
            i2 = Math.max(i - 1, 0);
        } else {
            i2 = i;
        }
        if (c0vg.LIZ(i2) == c0vg.LJIILIIL(i)) {
            z3 = true;
        }
        C08490Uz c08490Uz = c0vg.LIZIZ;
        c08490Uz.LIZJ(i);
        if (i == c08490Uz.LIZ.LIZ.length()) {
            LJIILJJIL = C47261Igj.LJJI(c08490Uz.LJII);
        } else {
            LJIILJJIL = C45804HyK.LJIILJJIL(i, c08490Uz.LJII);
        }
        C1NC c1nc = (C1NC) ListProtector.get(c08490Uz.LJII, LJIILJJIL);
        return c1nc.LJLIL.LJIJ(c1nc.M(i), z3);
    }

    public static final void LJJLI(int i, int i2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("fragment_id", str);
        linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("error_type", Integer.valueOf(i));
        linkedHashMap.put("error_code", Integer.valueOf(i2));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("error_msg", str2);
        C0K2.LJII(1, O5Y.LJJL("ttlive_highlight_to_draft_monitor"), linkedHashMap);
    }

    public static final void LJJLIIIIJ(int i, int i2, String str, String shootWay) {
        o.LJIIIZ(shootWay, "shootWay");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_type", Integer.valueOf(i));
        linkedHashMap.put("error_code", Integer.valueOf(i2));
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("error_msg", str);
        linkedHashMap.put("shoot_way", shootWay);
        C0K2.LJII(1, O5Y.LJJL("ttlive_highlight_jump_edit_result"), linkedHashMap);
    }

    public static final void LJIIL(ProfileHeaderCTAComponent profileHeaderCTAComponent, String str, C65776Prg c65776Prg, EnumC234309Hm maxStyle, int i) {
        o.LJIIIZ(profileHeaderCTAComponent, "<this>");
        o.LJIIIZ(maxStyle, "maxStyle");
        profileHeaderCTAComponent.LJLLILLLL.put(str, maxStyle);
        BaseContainerComponent.x3(profileHeaderCTAComponent, str, c65776Prg, null, i, 4);
    }
}
