package X;

import Y.IDRunnableS88S0100000_29;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.common.preload.MusicDspPreload;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuW, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91432ZuW implements LEA {
    public static volatile boolean LJLIL;
    public static volatile boolean LJLILLLLZI;
    public static volatile boolean LJLJI;
    public static BaseDspFeedResponse LJLJJI;
    public static boolean LJLJJL;
    public static int LJLJJLL;
    public static int LJLJL;
    public static String LJLJLJ;
    public static boolean LJLJLLL;
    public static WeakReference<Context> LJLL;
    public static boolean LJLLI;

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
    }

    static {
        C91432ZuW c91432ZuW = new C91432ZuW();
        LJLJJL = true;
        LJLJL = -1;
        LJLJLJ = "";
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(c91432ZuW);
    }

    public static void LIZJ(X8W x8w) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LIZIZ(String.valueOf(1), "", "preload_api", "/tiktok/music/dsp/feed/get/v2/");
        x8w.LIZIZ(null, MusicDspPreload.class, new C91431ZuV(elapsedRealtime));
    }

    public static void LIZLLL(BaseDspFeedResponse baseDspFeedResponse) {
        Context context;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preloadVideo ");
        LIZ.append(LJLJI);
        X1D.LIZIZ(LIZ);
        LJLJJI = baseDspFeedResponse;
        if (!LJLJI) {
            return;
        }
        LJ(baseDspFeedResponse);
        WeakReference<Context> weakReference = LJLL;
        if (weakReference == null || (context = weakReference.get()) == null || LJLLI) {
            return;
        }
        LJLLI = true;
        C1DH.LJJIJIIJI(new IDRunnableS88S0100000_29(context, 18));
    }

    public static void LJ(BaseDspFeedResponse baseDspFeedResponse) {
        DspStruct dspStruct;
        String str;
        if (!YBK.LIZ().firstFrameOpt.getEnableVideoPreload() || LJLIL) {
            return;
        }
        Context LIZIZ = EF7.LIZIZ();
        if (C48207Ivz.LIZIZ == null) {
            C48207Ivz.LIZIZ = C48203Ivv.LIZIZ(LIZIZ);
        }
        if (C48207Ivz.LIZIZ != EnumC48204Ivw.NONE) {
            if (!C48207Ivz.LIZ(EF7.LIZIZ()) && !YBK.LIZ().firstFrameOpt.getEnableMobileVideoPreload()) {
                return;
            }
            List<DspStruct> dspList = baseDspFeedResponse.getDspList();
            if (dspList.isEmpty() || (dspStruct = (DspStruct) ORZ.LJLLLL(dspList)) == null) {
                return;
            }
            String mediaId = dspStruct.getMediaId();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (dspStruct.isAudio()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ(str, mediaId, "preload_media", "");
            if (LJLJLLL) {
                return;
            }
            LJLJLLL = true;
            C91149Zpx.LIZIZ(dspStruct.getDspMusic().getPlayInfo(), new C91598ZxC(dspStruct, mediaId, elapsedRealtime));
        }
    }

    public static void LIZIZ(String mediaType, String mediaId, String str, String str2) {
        o.LJIIIZ(mediaType, "mediaType");
        o.LJIIIZ(mediaId, "mediaId");
        HashMap hashMap = new HashMap();
        hashMap.put("scene_name", "track_reco");
        hashMap.put("media_type", mediaType);
        hashMap.put("media_id", mediaId);
        hashMap.put("process_name", str);
        hashMap.put("url_path", str2);
        FMX.LJIIL("dsp_preload_start", hashMap);
    }

    public static void LIZ(String sceneName, String mediaType, String mediaId, long j, String str, Integer num, String str2, String str3) {
        o.LJIIIZ(sceneName, "sceneName");
        o.LJIIIZ(mediaType, "mediaType");
        o.LJIIIZ(mediaId, "mediaId");
        HashMap hashMap = new HashMap();
        hashMap.put("scene_name", sceneName);
        hashMap.put("media_type", mediaType);
        hashMap.put("media_id", mediaId);
        hashMap.put("duration", String.valueOf(j));
        hashMap.put("status", str);
        if (num != null) {
            hashMap.put("error_code", String.valueOf(num.intValue()));
        }
        hashMap.put("process_name", str2);
        hashMap.put("url_path", str3);
        FMX.LJIIL("dsp_preload_finish", hashMap);
    }
}
