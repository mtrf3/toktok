package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfo4FE;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdOutAnchor;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class O5Y implements IP0 {
    public static File LIZ = null;
    public static File LIZIZ = null;
    public static File LIZJ = null;
    public static File LIZLLL = null;
    public static Class LJ = null;
    public static Method LJFF = null;
    public static Method LJI = null;
    public static Method LJII = null;
    public static Method LJIIIIZZ = null;
    public static int LJIIIZ = 33554432;
    public static final int[] LJIIJ = {1, 2, 0, 3, 4};

    public static boolean LJIILJJIL() {
        Object value = IZ8.a1.getValue();
        o.LJIIIIZZ(value, "<get-dashFormatFixEnable>(...)");
        return ((Boolean) value).booleanValue();
    }

    public static final long LJIJJ() {
        return V0Q.Default.nextLong(4611686018427387903L, Long.MAX_VALUE);
    }

    public static synchronized File LJIL() {
        File file;
        synchronized (O5Y.class) {
            if (LIZIZ == null) {
                File file2 = new File(LJJIIZ(), "flush");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                LIZIZ = file2;
                if (C78248UnM.LJIIJ()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("prepare FlushDirectory success. name=");
                    LIZ2.append(LIZIZ);
                    C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
                }
            }
            file = LIZIZ;
        }
        return file;
    }

    public static synchronized File LJJIFFI() {
        File file;
        File file2;
        synchronized (O5Y.class) {
            if (LIZJ == null) {
                if (PC5.LJJIIZ()) {
                    file2 = new File(LJJIIZ(), "persistent");
                } else {
                    file2 = new File(LJJIIZ(), "child_process_persistent");
                }
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                LIZJ = file2;
                if (C78248UnM.LJIIJ()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("prepare PersistentDirectory success. name=");
                    LIZ2.append(LIZJ);
                    C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
                }
            }
            file = LIZJ;
        }
        return file;
    }

    public static synchronized File LJJII() {
        File file;
        synchronized (O5Y.class) {
            if (LIZ == null) {
                try {
                    String LJIJJ = PC5.LJIJJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJIJJ.replace(".", "_").replace(":", "-"));
                    LIZ2.append(".bin");
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    if (!PC5.LJJIIZ()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(PC5.LJIL());
                        LIZ3.append("_");
                        LIZ3.append(LIZIZ2);
                        LIZIZ2 = X1D.LIZIZ(LIZ3);
                    }
                    File file2 = new File(LJJIFFI(), LIZIZ2);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    LIZ = file2;
                    if (C78248UnM.LJIIJ()) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("prepare PersistentFile success. fileName=");
                        LIZ4.append(LIZ);
                        C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ4));
                    }
                } catch (Exception e) {
                    C64028PAy.LIZJ("APM-Slardar", "prepare PersistentFile fail.", e);
                }
            }
            file = LIZ;
        }
        return file;
    }

    public static synchronized File LJJIIZ() {
        File file;
        synchronized (O5Y.class) {
            if (LIZLLL == null) {
                File file2 = new File(C78248UnM.LJLJJI.getFilesDir(), "apm6");
                LIZLLL = file2;
                if (!file2.exists()) {
                    LIZLLL.mkdirs();
                }
            }
            file = LIZLLL;
        }
        return file;
    }

    @Override // X.IP0
    public int LIZLLL() {
        return C1DG.LIZ().LIZJ();
    }

    public static void LJIIIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String LJIIJ(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Exception:");
                    LIZ2.append(e);
                    X1D.LIZIZ(LIZ2);
                }
            } catch (Throwable th) {
                LJIIIZ(bufferedReader);
                throw th;
            }
        }
        LJIIIZ(bufferedReader);
        return sb.toString();
    }

    public static final ActivityTreasureBoxInfo4FE LJIIJJI(MessageRedEnvelopInfo messageRedEnvelopInfo) {
        String str;
        List<String> urls;
        ImageModel imageModel;
        List<String> urls2;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE = new ActivityTreasureBoxInfo4FE();
        activityTreasureBoxInfo4FE.businessType = messageRedEnvelopInfo.businessType;
        activityTreasureBoxInfo4FE.diamondCount = messageRedEnvelopInfo.diamondCount;
        activityTreasureBoxInfo4FE.envelopeId = messageRedEnvelopInfo.envelopeId;
        activityTreasureBoxInfo4FE.envelopeIdc = messageRedEnvelopInfo.envelopeIdc;
        activityTreasureBoxInfo4FE.peopleCount = messageRedEnvelopInfo.peopleCount;
        activityTreasureBoxInfo4FE.sendUserId = messageRedEnvelopInfo.sendUserId;
        activityTreasureBoxInfo4FE.unpackAt = messageRedEnvelopInfo.unpackAt;
        activityTreasureBoxInfo4FE.sendUserName = messageRedEnvelopInfo.sendUserName;
        ImageModel imageModel2 = messageRedEnvelopInfo.sendUserAvatar;
        if (imageModel2 == null || (urls = imageModel2.getUrls()) == null || urls.size() <= 0 || (imageModel = messageRedEnvelopInfo.sendUserAvatar) == null || (urls2 = imageModel.getUrls()) == null || (str = (String) ListProtector.get(urls2, 0)) == null) {
            str = "";
        }
        activityTreasureBoxInfo4FE.sendUserAvatar = str;
        activityTreasureBoxInfo4FE.followStatusShow = messageRedEnvelopInfo.followStatusShow;
        activityTreasureBoxInfo4FE.skinId = messageRedEnvelopInfo.skinId;
        return activityTreasureBoxInfo4FE;
    }

    public static final boolean LJIILL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !LJIILLIIL(awemeRawAd)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && LJJJJIZL(awemeRawAd) && o.LJ(awemeRawAd.getSearchAdInfo().getEnableSearchFollowBtn(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static int LJIJ(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith(CardStruct.IStatusCode.DEFAULT)) {
            str = str.substring(1);
        }
        try {
            parseInt = CastIntegerProtector.parseInt(str);
        } catch (Throwable unused) {
        }
        if (parseInt > 12 || parseInt < 1) {
            return -1;
        }
        return parseInt;
    }

    public static int LJIJI(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith(CardStruct.IStatusCode.DEFAULT)) {
            str = str.substring(1);
        }
        try {
            parseInt = CastIntegerProtector.parseInt(str);
        } catch (Throwable unused) {
        }
        if (parseInt == -1) {
            return -1;
        }
        if (parseInt < 1000) {
            return parseInt + LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        return parseInt;
    }

    public static long LJIJJLI(String str) {
        if (C78983UzD.LJJJI(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return 0L;
        }
        return file.length() / 1024;
    }

    public static long LJJ(File file) {
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                j += LJJ(file2);
            }
            return j;
        }
        return file.length() / 1024;
    }

    public static RectF LJJI(PointF[] pointFArr) {
        PointF pointF = pointFArr[0];
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = f;
        float f4 = f2;
        for (PointF pointF2 : pointFArr) {
            float f5 = pointF2.x;
            if (f5 < f) {
                f = f5;
            }
            if (f5 > f3) {
                f3 = f5;
            }
            float f6 = pointF2.y;
            if (f6 < f2) {
                f2 = f6;
            }
            if (f6 > f4) {
                f4 = f6;
            }
        }
        return new RectF(f, f2, f3, f4);
    }

    public static String LJJIII(String str) {
        if (str.startsWith("socket:")) {
            return "socket";
        }
        if (str.startsWith("pipe:")) {
            return "pipe";
        }
        if (str.equals("/dev/ashmem")) {
            return "dev-ashmem";
        }
        if (str.startsWith("anon_inode:")) {
            if (str.contains("eventpoll")) {
                return "anon_inode-eventpoll";
            }
            if (str.contains("dmabuf")) {
                return "anon_inode-dmabuf";
            }
            if (str.contains("eventfd")) {
                return "anon_inode-eventfd";
            }
            if (str.contains("inotify")) {
                return "anon_inode-inotify";
            }
            if (str.contains("sync_fence")) {
                return "anon_inode-sync_fence";
            }
            if (str.contains("timerfd")) {
                return "anon_inode-timerfd";
            }
            if (str.contains("malitl")) {
                return "anon_inode-malitl";
            }
        }
        if (str.contains("/mmkv/")) {
            return "mmkv";
        }
        if (str.contains("/dataloader/")) {
            return "dataloader";
        }
        if (str.contains("/app_indicators/")) {
            return "app_indicators";
        }
        String[] split = str.split("/");
        if (split.length > 0) {
            String str2 = split[split.length - 1];
            if (str2.contains(".db")) {
                return "db";
            }
            if (str2.endsWith(".apk")) {
                return "apk";
            }
        }
        if (str.startsWith("/storage")) {
            return "storage";
        }
        return "unknown";
    }

    public static String LJJIIJZLJL(String str) {
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        r2 = null;
        String str2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                str2 = LJIIJ(fileInputStream);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                LJIIIZ(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        LJIIIZ(fileInputStream);
        return str2;
    }

    public static final boolean LJJIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        java.util.Map<String, AnoleComponentRelationModel> componentRelations;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (componentRelations = anoleModel.getComponentRelations()) != null) {
            return componentRelations.containsKey("search_cta");
        }
        return false;
    }

    public static final boolean LJJIJIIJI(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str2 = null;
        if (awemeRawAd != null) {
            str = awemeRawAd.getWebUrl();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str2 = awemeRawAd2.getOpenUrl();
            }
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer animationType;
        if (!aweme.isAd() || !LJJJIL(aweme) || LJJIJLIJ(aweme) || LJIILL(aweme) || !LJJIJIIJI(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (animationType = searchAdInfo.getAnimationType()) == null || animationType.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIL(Aweme aweme) {
        N4S shareInfo;
        Integer valueOf;
        if (aweme == null || !LJJJIL(aweme)) {
            return false;
        }
        if (C46278IEg.LIZ()) {
            N7D LIZJ2 = C58784N5g.LIZIZ.LIZJ(aweme);
            if (LIZJ2 != null && (shareInfo = LIZJ2.getShareInfo()) != null && (valueOf = Integer.valueOf(shareInfo.LJLILLLLZI)) != null && valueOf.intValue() == 3) {
                return true;
            }
            return false;
        }
        if (SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIIJJI(aweme) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJL(Aweme aweme) {
        N4S shareInfo;
        Integer valueOf;
        if (aweme == null || !LJJJIL(aweme)) {
            return false;
        }
        if (C46278IEg.LIZ()) {
            N7D LIZJ2 = C58784N5g.LIZIZ.LIZJ(aweme);
            if (LIZJ2 != null && (shareInfo = LIZJ2.getShareInfo()) != null && (valueOf = Integer.valueOf(shareInfo.LJLILLLLZI)) != null && (valueOf.intValue() == 2 || valueOf.intValue() == 3)) {
                return true;
            }
            return false;
        }
        NIP LJIIIIZZ2 = SearchAdMainService.LJIIJJI().LJIIIIZZ();
        if (LJIIIIZZ2.LJIIJJI(aweme) == 2 || LJIIIIZZ2.LJIIJJI(aweme) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJLIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        return LJJIL(awemeRawAd);
    }

    public static final boolean LJJIL(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo;
        SearchAdOutAnchor outAnchor;
        if (!LJJJJ(awemeRawAd) || awemeRawAd == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (outAnchor = searchAdInfo.getOutAnchor()) == null || !o.LJ(outAnchor.getShowAnchor(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static void LJJIZ(ActivityC45651qj activityC45651qj) {
        AVExternalServiceImpl.LIZ().publishService().hideProgress(activityC45651qj);
    }

    public static final boolean LJJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer preciseAdCTAPosition;
        if (!aweme.isSearchPreciseAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (preciseAdCTAPosition = searchAdInfo.getPreciseAdCTAPosition()) == null || preciseAdCTAPosition.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return LJJJJ(awemeRawAd);
        }
        return false;
    }

    public static final boolean LJJJJ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getSearchAdInfo() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !LJJJJIZL(awemeRawAd)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJIZL(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo;
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
            return o.LJ(searchAdInfo.isCiAd(), Boolean.TRUE);
        }
        return false;
    }

    public static final String LJJJJJ(Locale locale) {
        String str = "";
        if (locale == null) {
            return "";
        }
        C39399FdD.LIZIZ.getClass();
        if (C39567Ffv.LIZIZ(locale).length() != 0) {
            str = o.LJIILLIIL(C39567Ffv.LIZIZ(locale), "-");
        }
        return o.LJIILLIIL(str, locale.getLanguage());
    }

    public static android.net.Uri LJJJJL(String path) {
        o.LJIIJ(path, "path");
        Uri.Builder path2 = new Uri.Builder().scheme("assets").authority("relative").path(path);
        o.LJFF(path2, "Uri.Builder()\n    .schem…RITY_RELATIVE).path(path)");
        android.net.Uri build = path2.build();
        o.LJFF(build, "Uri.Builder()\n    .schem…raPart(sourceUri).build()");
        return build;
    }

    public static android.net.Uri LJJJJLI(String path) {
        o.LJIIJ(path, "path");
        Uri.Builder path2 = new Uri.Builder().scheme("local_file").authority("relative").path(path);
        o.LJFF(path2, "Uri.Builder()\n    .schem…RITY_RELATIVE).path(path)");
        android.net.Uri build = path2.build();
        o.LJFF(build, "Uri.Builder()\n    .schem…raPart(sourceUri).build()");
        return build;
    }

    public static void LJJJJZI(Lock lock) {
        if (lock != null) {
            try {
                lock.unlock();
            } catch (Throwable unused) {
            }
        }
    }

    public static final void LJJJLIIL(N4S n4s) {
        o.LJIIIZ(n4s, "<this>");
        n4s.LJLIL = false;
        n4s.LJLILLLLZI = 1;
        n4s.LJLJJI = new LinkedHashSet();
        n4s.LJLJJL = true;
        n4s.LJLJJLL = true;
    }

    public static final void LJJJLL(Aweme aweme) {
        if (aweme != null && LJJJIL(aweme)) {
            SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIILIIL(1, aweme);
        }
    }

    public static final boolean LJJJLZIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer searchDeliveryType;
        if (CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk || ((awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchDeliveryType = searchAdInfo.getSearchDeliveryType()) != null && searchDeliveryType.intValue() == 3)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && LJJJJ(awemeRawAd) && (!TextUtils.isEmpty(awemeRawAd.getWebUrl()) || !TextUtils.isEmpty(awemeRawAd.getOpenUrl()))) {
            return true;
        }
        return false;
    }

    public static String LJJL(String str) {
        return i0.LJFF(str, "_all");
    }

    public static String LJJLI(String str) {
        return i0.LJFF(str, "_error");
    }

    public static void LJJLIIIIJ(Lock lock) {
        if (lock != null) {
            try {
                lock.tryLock(1500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                LJJJJZI(lock);
                throw th;
            }
            LJJJJZI(lock);
        }
    }

    public static void LJJLIIIJ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return;
        }
        AVExternalServiceImpl.LIZ().publishService().showProgress(activityC45651qj, true);
    }

    @Override // X.IP0
    public int LIZ(SimVideoUrlModel urlModel) {
        o.LJIIIZ(urlModel, "urlModel");
        if (C13870gZ.LIZ().isCache(urlModel)) {
            return C13870gZ.LIZ().LIZLLL(urlModel);
        }
        if (PreloadSessionManager.LIZIZ.LIZ(urlModel.getSourceId()) == null) {
            return -2;
        }
        return -1;
    }

    @Override // X.IP0
    public int LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        return (int) C13870gZ.LIZ().LIZIZ(simVideoUrlModel);
    }

    @Override // X.IP0
    public int LIZJ(SimVideoUrlModel simVideoUrlModel) {
        Session LIZIZ2 = C46664ITc.LJIJ.LIZIZ(simVideoUrlModel.getUri());
        if (LIZIZ2 != null) {
            return (int) ((LIZIZ2.speed / 8) / 1000);
        }
        return -1;
    }

    @Override // X.IP0
    public List getRequestInfoList(SimVideoUrlModel simVideoUrlModel) {
        return C13870gZ.LIZ().getRequestInfoList(simVideoUrlModel);
    }

    @Override // X.IP0
    public boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        return C13870gZ.LIZ().isCache(simVideoUrlModel);
    }

    public static final int LJIIIIZZ(int i, C25710zf c25710zf) {
        int i2 = c25710zf.LJLJI - 1;
        int i3 = 0;
        while (i3 < i2) {
            int LIZJ2 = AnonymousClass030.LIZJ(i2, i3, 2, i3);
            Object[] objArr = c25710zf.LJLIL;
            int i4 = ((C13000fA) objArr[LIZJ2]).LIZ;
            if (i4 != i) {
                if (i4 < i) {
                    i3 = LIZJ2 + 1;
                    if (i < ((C13000fA) objArr[i3]).LIZ) {
                    }
                } else {
                    i2 = LIZJ2 - 1;
                }
            }
            return LIZJ2;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:10:0x001d, B:13:0x0024, B:15:0x002a, B:18:0x0034, B:40:0x003d, B:28:0x0046, B:30:0x0053, B:31:0x0057, B:37:0x0063, B:34:0x0071, B:21:0x0042), top: B:9:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(java.io.File r8, java.util.Map r9) {
        /*
            boolean r0 = r8.exists()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4 = 0
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L79
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L79
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L79
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L79
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L79
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L24
            return
        L24:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L87
            java.lang.String r0 = "\\s++"
            java.lang.String[] r8 = r1.split(r0)     // Catch: java.lang.Throwable -> L7c
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L34
            goto L24
        L34:
            r0 = r8[r4]     // Catch: java.lang.Throwable -> L7c
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L7c
            r7 = 2
            if (r0 != 0) goto L42
            int r1 = r8.length     // Catch: java.lang.Throwable -> L7c
            r0 = 3
            if (r1 >= r0) goto L46
            goto L24
        L42:
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7c
            if (r0 >= r7) goto L46
            goto L24
        L46:
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7c
            r6 = 1
            int r0 = r0 - r6
            r1 = r8[r0]     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "remote_addr:"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L57
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 - r7
            r1 = r8[r0]     // Catch: java.lang.Throwable -> L7c
        L57:
            java.lang.String r1 = LJJIII(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r5.get(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L71
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7c
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L7c
            goto L24
        L71:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L7c
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L7c
            goto L24
        L79:
            r1 = move-exception
            r2 = r3
            goto L7d
        L7c:
            r1 = move-exception
        L7d:
            X.PJY r0 = X.PJZ.LIZ
            r0.getClass()
            java.lang.String r0 = "NPTH_CATCH"
            X.PJY.LIZ(r0, r1)
        L87:
            X.FPX.LIZIZ(r2)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L91
            return
        L91:
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r2 = r0.iterator()
        L99:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r5.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r4 >= r0) goto L99
            r3 = r1
            r4 = r0
            goto L99
        Lb2:
            java.lang.String r0 = "fd_leak_reason"
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.put(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O5Y.LJIIL(java.io.File, java.util.Map):void");
    }

    public static void LJIILIIL(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[Krypton]");
        LIZ2.append(str);
        LLog.LIZLLL(4, X1D.LIZIZ(LIZ2), str2);
    }

    public static boolean LJIIZILJ(Rect rect, PointF[] pointFArr) {
        boolean z = false;
        if (pointFArr == null || rect == null) {
            return false;
        }
        RectF LJJI = LJJI(pointFArr);
        if (LJJI.right < rect.left) {
            z = true;
        }
        if (LJJI.left > rect.right) {
            z = true;
        }
        if (LJJI.bottom < rect.top) {
            z = true;
        }
        if (LJJI.top > rect.bottom) {
            return true;
        }
        return z;
    }

    public static int LJJIIJ(int i, String str) {
        if (i >= 2 && i <= 3) {
            return 1080;
        }
        if (i >= 10) {
            if (i <= 18) {
                return 720;
            }
            if (i >= 20) {
                if (i <= 28) {
                    return 540;
                }
                if (i >= 30) {
                    if (i <= 38) {
                        return 480;
                    }
                    if (i >= 40 && i <= 48) {
                        return 360;
                    }
                }
            }
        }
        if (0 != 0 || TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.contains("1080")) {
            return 1080;
        }
        if (str.contains("720")) {
            return 720;
        }
        if (str.contains("540")) {
            return 540;
        }
        if (str.contains("480")) {
            return 480;
        }
        if (str.contains("360")) {
            return 360;
        }
        return 0;
    }

    public static void LJJJ(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[Krypton]");
        LIZ2.append(str);
        LLog.LIZLLL(2, X1D.LIZIZ(LIZ2), str2);
    }

    public static final List LJJJJZ(JSONArray map, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIJ(map, "$this$map");
        ArrayList arrayList = new ArrayList();
        int length = map.length();
        for (int i = 0; i < length; i++) {
            Object opt = map.opt(i);
            o.LJFF(opt, "opt(i)");
            arrayList.add(interfaceC88472Yns.invoke(opt));
        }
        return arrayList;
    }

    public static final void LJJLIIIJILLIZJL(N4S n4s, N4S n4s2) {
        o.LJIIIZ(n4s, "<this>");
        n4s.LJLIL = n4s2.LJLIL;
        n4s.LJLILLLLZI = n4s2.LJLILLLLZI;
        java.util.Set<EnumC58794N5q> set = n4s2.LJLJJI;
        o.LJIIIZ(set, "<set-?>");
        n4s.LJLJJI = set;
        n4s.LJLJJL = n4s2.LJLJJL;
        n4s.LJLJJLL = n4s2.LJLJJLL;
        n4s.LJLJI = n4s2.LJLJI;
    }

    public static void LJJLIIIJJI(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[Krypton]");
        LIZ2.append(str);
        LLog.LIZLLL(3, X1D.LIZIZ(LIZ2), str2);
    }

    public static void LJJLIIIJJIZ(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            C1DI.LIZIZ(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                C1DI.LIZIZ(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }

    @Override // X.IP0
    public int LJ(SimVideoUrlModel simVideoUrlModel, int i) {
        PreloadSessionManager.PreloadSession LIZ2 = PreloadSessionManager.LIZIZ.LIZ(simVideoUrlModel.getSourceId());
        if (LIZ2 != null && i > 0) {
            return LIZ2.speed;
        }
        return -1;
    }

    public static void LJFF(String str, Object obj, String str2) {
        LJJJJJL(67108864, str, str2, obj);
    }

    public static void LJI(String str, Object obj, String str2) {
        LJJJJJL(42926080, str, str2, obj);
    }

    public static void LJII(String str, Object obj, String str2) {
        LJJJJJL(50331648, str, str2, obj);
    }

    public static final boolean LJJIIZI(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        o.LJIIIIZZ(packageManager, "context.packageManager");
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("https://api.whatsapp.com/send?phone=");
            LIZ2.append(str);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (C78685UuP.LJJJZ(str2)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ2);
                LIZ3.append("&text=");
                LIZ3.append(URLEncoder.encode(str2, "UTF-8"));
                LIZIZ2 = X1D.LIZIZ(LIZ3);
            }
            intent.setPackage("com.whatsapp");
            intent.setData(UriProtector.parse(LIZIZ2));
            if (intent.resolveActivity(packageManager) != null) {
                intent.putExtra("pns.sandbox.dataflow_id", 1207960322);
                C16880lQ.LIZJ(context, intent);
                return true;
            }
            return false;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static final void LJJJJLL(String stage, M0L mallGlobalData, java.util.Map map) {
        boolean z;
        boolean z2;
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(mallGlobalData, "mallGlobalData");
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        long j = 0;
        if (M0M.LIZ != 0) {
            j = System.currentTimeMillis() - M0M.LIZ;
        }
        if (map == null || !map.containsKey("err_msg")) {
            z = true;
        } else {
            z = false;
        }
        EnumC56062LzO dataFrom = mallGlobalData.LJLIL;
        o.LJIIIZ(dataFrom, "dataFrom");
        if (dataFrom == EnumC56062LzO.API_ERROR_RETRY || dataFrom == EnumC56062LzO.NETWORK_UNAVAILABLE_RETRY || dataFrom == EnumC56062LzO.TEMPLATE_ERROR_RETRY) {
            z2 = true;
        } else {
            z2 = false;
        }
        c56092Lzs.getClass();
        C56092Lzs.LJIJ(stage, j, z, z2, map);
    }

    public static void LJJJJJL(int i, String str, String str2, Object obj) {
        int hashCode;
        if (i < (LJIIIZ & (-65536))) {
            return;
        }
        if (LJ == null) {
            try {
                Class<?> cls = Class.forName("com.ss.ttvideoengine.utils.TTVideoEngineLog");
                LJ = cls;
                LJI = cls.getMethod("d", String.class, String.class);
                LJFF = LJ.getMethod("i", String.class, String.class);
                LJII = LJ.getMethod("w", String.class, String.class);
                LJIIIIZZ = LJ.getMethod("e", String.class, String.class);
            } catch (Exception unused) {
                LJ = null;
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = str;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        objArr[1] = Integer.valueOf(hashCode);
        objArr[2] = str2;
        String LLLZI = C16880lQ.LLLZI(locale, "<%s,%x>%s", objArr);
        try {
            if (i != 0 && i != 16777216) {
                if (i != 33554432 && i != 34603008 && i != 42860544 && i != 42926080) {
                    if (i != 50331648) {
                        if (i != 67108864) {
                        } else {
                            LJIIIIZZ.invoke(LJ, "ttmj", LLLZI);
                        }
                    } else {
                        LJII.invoke(LJ, "ttmj", LLLZI);
                    }
                } else {
                    LJFF.invoke(LJ, "ttmj", LLLZI);
                }
            } else {
                LJI.invoke(LJ, "ttmj", LLLZI);
            }
        } catch (Exception unused2) {
        }
    }
}
