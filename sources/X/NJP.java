package X;

import Y.ACallableS104S0100000_1;
import android.text.TextUtils;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NJP implements A20 {
    public static final void LJIIJ() {
        C59161NJt.LIZ();
    }

    public static final void LJII(AwemeRawAd awemeRawAd) {
        String channelPath;
        String LJIIL = AdLandPagePreloadServiceImpl.LJJI().LJIIL("feed");
        String channelName = awemeRawAd.getChannelName();
        if (TextUtils.isEmpty(LJIIL) || TextUtils.isEmpty(channelName)) {
            channelPath = "";
        } else {
            channelPath = O3U.LIZJ(LJIIL, channelName);
            if (channelPath == null) {
                return;
            }
        }
        if (channelPath.length() == 0) {
            return;
        }
        o.LJIIIZ(channelPath, "channelPath");
        File file = new File(channelPath, "resource.android.html");
        if (!file.exists() || !file.isFile()) {
            return;
        }
        Long creativeId = awemeRawAd.getCreativeId();
        o.LJIIIIZZ(creativeId, "rawAd.creativeId");
        long longValue = creativeId.longValue();
        String absolutePath = file.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "resourceHtml.absolutePath");
        String webUrl = awemeRawAd.getWebUrl();
        File file2 = new File(C38943FQd.LIZLLL().getPath(), LJIIL);
        C39579Fg7.LJFF(file2);
        String path = file2.getPath();
        o.LJIIIIZZ(path, "getInstance().offlineRootDir(accessKey)");
        NJV njv = new NJV(path, channelName);
        int incrementAndGet = C59161NJt.LIZIZ.incrementAndGet();
        C10K.LJII(500L).LIZLLL(new NUY(incrementAndGet, absolutePath)).LJ(new C59444NUq(incrementAndGet, longValue, webUrl, njv), C10K.LJIIIIZZ, null);
    }

    public static final void LJIIIZ(List<? extends Aweme> list) {
        o.LJIIIZ(list, "list");
        if (!list.isEmpty()) {
            C10K.LIZIZ(new ACallableS104S0100000_1(list, 5), C10K.LJI, null);
        }
        if (list.isEmpty()) {
            return;
        }
        C10K.LIZIZ(new ACallableS104S0100000_1(list, 6), C10K.LJI, null);
    }

    public static final long LJIIIIZZ(long j, long j2) {
        if (j != C59161NJt.LJ) {
            return -1L;
        }
        long j3 = C59161NJt.LJFF;
        if (j3 == -1) {
            return -1L;
        }
        return j2 - j3;
    }

    public final void LIZ(String str, C59089NGz c59089NGz) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
        targetChannel.channelName = str;
        arrayList.add(targetChannel);
        hashMap.put(C38943FQd.LIZ(), arrayList);
        C61520OCm LJIILIIL = O3U.LJIILIIL();
        if (LJIILIIL != null) {
            LJIILIIL.LIZJ(hashMap, c59089NGz);
        }
    }

    public final void LIZLLL(String str, List list) {
        LJFF(list, str, "lynx_feed", new C40323Fs7());
    }

    public final void LJI(String str, List list) {
        if (list == null) {
            return;
        }
        C61520OCm LIZ = O3E.LIZ(str);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str2;
            arrayList.add(targetChannel);
        }
        if (str != null) {
            hashMap.put(str, arrayList);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setChannelUpdatePriority(3);
            optionCheckUpdateParams.setLazyUpdate(true);
            if (LIZ != null) {
                LIZ.LIZ(null, hashMap, optionCheckUpdateParams);
            }
        }
    }

    public static final void LIZIZ(String str, String str2, AbstractC61537ODd abstractC61537ODd) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
        targetChannel.channelName = str;
        arrayList.add(targetChannel);
        if (str2 != null) {
            hashMap.put(str2, arrayList);
            C61520OCm LJIIL = O3U.LJIIL(str2);
            if (LJIIL != null) {
                if (abstractC61537ODd == null) {
                    abstractC61537ODd = new C40323Fs7();
                }
                LJIIL.LIZJ(hashMap, abstractC61537ODd);
            }
        }
    }

    public static final void LJ(List<String> list, String str, OptionCheckUpdateParams optionCheckUpdateParams) {
        if (list == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str2;
            arrayList.add(targetChannel);
        }
        hashMap.put(str, arrayList);
        C61520OCm LJIIL = O3U.LJIIL(str);
        if (LJIIL != null) {
            LJIIL.LIZ("default", hashMap, optionCheckUpdateParams);
        }
    }

    public final void LIZJ(Aweme aweme, String str, List list) {
        LJFF(list, str, "dynamic_ad_feed", new FDJ(aweme));
    }

    public static final void LJFF(List<String> list, String str, String str2, AbstractC61537ODd abstractC61537ODd) {
        if (list == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str3;
            arrayList.add(targetChannel);
        }
        if (str != null) {
            hashMap.put(str, arrayList);
            C61520OCm LJIIL = O3U.LJIIL(str);
            if (LJIIL != null) {
                LJIIL.LIZJ(hashMap, abstractC61537ODd);
            }
        }
    }
}
