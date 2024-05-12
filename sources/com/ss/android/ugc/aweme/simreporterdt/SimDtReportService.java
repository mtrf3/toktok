package com.ss.android.ugc.aweme.simreporterdt;

import X.C221108m2;
import X.C2306893o;
import X.C46554IOw;
import X.C46575IPr;
import X.C46648ISm;
import X.C46677ITp;
import X.C46693IUf;
import X.C46694IUg;
import X.C46695IUh;
import X.C46696IUi;
import X.C46697IUj;
import X.C46698IUk;
import X.C46699IUl;
import X.C46700IUm;
import X.C46701IUn;
import X.C46702IUo;
import X.C46703IUp;
import X.C5H3;
import X.C65777Prh;
import X.C72242sW;
import X.EnumC221088m0;
import X.ILG;
import X.IPA;
import X.IQY;
import X.IRV;
import X.IRW;
import X.ISC;
import X.ISM;
import X.IT2;
import X.ITA;
import X.ITB;
import Y.ARunnableS0S2211100_8;
import Y.ARunnableS11S0301000_11;
import Y.ARunnableS15S0301000_15;
import Y.ARunnableS7S1200000_8;
import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.InitInfo;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SimDtReportService implements IPlayerEventReportService {
    public final C5H3 executorService$delegate;
    public boolean isDecodeBuffering;
    public final LinkedHashMap<String, List<Long>> mBufferingTimeRecords;
    public final LinkedHashMap<String, List<Long>> mPausedTimeRecords;
    public final LinkedHashMap<String, Long> mSeekStartTimePoints;
    public final LinkedHashMap<String, Long> mVideoBufferingStartTimeMap;
    public final LinkedHashMap<String, Boolean> mVideoFirstBufferingCrossFirstFrame;
    public final LinkedHashMap<String, Long> mVideoFirstFrameTimeMap;
    public final LinkedHashMap<String, Boolean> mVideoHasRendered;
    public final LinkedHashMap<String, Boolean> mVideoIsNetworkBuffering;
    public final LinkedHashMap<String, Long> mVideoPausedTimeMap;
    public final LinkedHashMap<String, String> mVideoPendingRenderMap;
    public final LinkedHashMap<String, Long> mVideoPrepareTimeMap;
    public ITA pm;
    public IPlayerEventReporter reporter;
    public ISimReporterConfig reporterConfig;
    public int totalDecodeBufferCount;
    public long totalDecodeBufferTime;
    public int totalNetBufferCount;
    public final int triggerBufferingThreshold;
    public long videoDecodeBufferingStartTime;
    public int videoResponseHasReportedCount;

    public SimDtReportService() {
        this(null, 1, null);
    }

    private final C2306893o getExecutorService() {
        return (C2306893o) this.executorService$delegate.getValue();
    }

    public void release() {
        ITA ita = this.pm;
        ita.LIZ.clear();
        ita.LIZIZ = null;
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.release();
        }
        this.reporter = null;
    }

    public final int getVideoResponseHasReportedCount() {
        return this.videoResponseHasReportedCount;
    }

    public SimDtReportService(IPlayerEventReporter iPlayerEventReporter) {
        this.reporter = iPlayerEventReporter;
        this.pm = new ITA();
        this.executorService$delegate = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C46677ITp.LJLIL);
        this.reporterConfig = new ILG();
        this.triggerBufferingThreshold = 300;
        this.mVideoFirstBufferingCrossFirstFrame = new C46697IUj();
        this.mVideoHasRendered = new C46699IUl();
        this.mVideoIsNetworkBuffering = new C46700IUm();
        this.mVideoPendingRenderMap = new C46703IUp();
        this.mVideoPrepareTimeMap = new C46702IUo();
        this.mVideoFirstFrameTimeMap = new C46698IUk();
        this.mVideoPausedTimeMap = new C46701IUn();
        this.mVideoBufferingStartTimeMap = new C46696IUi();
        this.mPausedTimeRecords = new C46694IUg();
        this.mBufferingTimeRecords = new C46693IUf();
        this.mSeekStartTimePoints = new C46695IUh();
    }

    private final void clearSeekStartTimePoint(String str) {
        if (str == null) {
            return;
        }
        this.mSeekStartTimePoints.remove(str);
    }

    private final long getSeekStartTimePoint(String str) {
        Long l;
        if (str == null || !this.mSeekStartTimePoints.containsKey(str) || (l = this.mSeekStartTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final long getVideoBufferingStartTime(String str) {
        Long l;
        if (!TextUtils.isEmpty(str)) {
            LinkedHashMap<String, Long> linkedHashMap = this.mVideoBufferingStartTimeMap;
            if (linkedHashMap != null) {
                if (!linkedHashMap.containsKey(str) || (l = this.mVideoBufferingStartTimeMap.get(str)) == null) {
                    return -1L;
                }
                return l.longValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        return -1L;
    }

    private final boolean getVideoFirstBufferingCrossFirstFrame(String str) {
        Boolean bool;
        if (!TextUtils.isEmpty(str)) {
            LinkedHashMap<String, Boolean> linkedHashMap = this.mVideoFirstBufferingCrossFirstFrame;
            if (linkedHashMap != null) {
                if (!linkedHashMap.containsKey(str) || (bool = this.mVideoFirstBufferingCrossFirstFrame.get(str)) == null) {
                    return false;
                }
                return bool.booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        return false;
    }

    private final long getVideoFirstFrameTime(String str) {
        Long l;
        if (!TextUtils.isEmpty(str)) {
            LinkedHashMap<String, Long> linkedHashMap = this.mVideoFirstFrameTimeMap;
            if (linkedHashMap != null) {
                if (!linkedHashMap.containsKey(str) || (l = this.mVideoFirstFrameTimeMap.get(str)) == null) {
                    return -1L;
                }
                return l.longValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        return -1L;
    }

    private final boolean getVideoRenderedStatus(String str) {
        Boolean bool;
        if (!TextUtils.isEmpty(str)) {
            LinkedHashMap<String, Boolean> linkedHashMap = this.mVideoHasRendered;
            if (linkedHashMap != null) {
                if (!linkedHashMap.containsKey(str) || (bool = this.mVideoHasRendered.get(str)) == null) {
                    return false;
                }
                return bool.booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        return false;
    }

    private final boolean isNetworkBuffering(String str) {
        Boolean bool;
        if (!TextUtils.isEmpty(str)) {
            LinkedHashMap<String, Boolean> linkedHashMap = this.mVideoIsNetworkBuffering;
            if (linkedHashMap != null) {
                if (!linkedHashMap.containsKey(str) || (bool = this.mVideoIsNetworkBuffering.get(str)) == null) {
                    return false;
                }
                return bool.booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void initConfig(ISimReporterConfig config) {
        o.LJIIIZ(config, "config");
        this.reporterConfig = config;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportSeekEnd(String str) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPlaying(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap<String, Long> linkedHashMap = this.mVideoPausedTimeMap;
        o.LJI(str);
        Long l = linkedHashMap.get(str);
        if (l == null || l.longValue() < 0) {
            return;
        }
        if (elapsedRealtime > l.longValue()) {
            long longValue = elapsedRealtime - l.longValue();
            if (!TextUtils.isEmpty(str)) {
                List<Long> list = this.mPausedTimeRecords.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(Long.valueOf(longValue));
                this.mPausedTimeRecords.put(str, list);
            }
        }
        this.pm.LJI(str);
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LJIIJJI();
    }

    public void setUpdateCallback(UpdateCallback updateCallback) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LJIIIZ(updateCallback);
    }

    public final void setVideoResponseHasReportedCount(int i) {
        this.videoResponseHasReportedCount = i;
    }

    private final boolean checkIfBufferingComesFromSeek(String str, long j) {
        if (str != null && j > 0) {
            long seekStartTimePoint = getSeekStartTimePoint(str);
            if (seekStartTimePoint <= 0) {
                return false;
            }
            if (j >= seekStartTimePoint && j - seekStartTimePoint <= this.triggerBufferingThreshold) {
                return true;
            }
            if (seekStartTimePoint >= j && seekStartTimePoint - j <= this.triggerBufferingThreshold) {
                return true;
            }
        }
        return false;
    }

    private final void setNetworkBufferingState(String str, Boolean bool) {
        if (TextUtils.isEmpty(str) || bool == null) {
            return;
        }
        LinkedHashMap<String, Boolean> linkedHashMap = this.mVideoIsNetworkBuffering;
        o.LJI(str);
        linkedHashMap.put(str, bool);
    }

    private final void setSeekStartTimePoint(String str, long j) {
        if (str == null || j < 0) {
            return;
        }
        this.mSeekStartTimePoints.put(str, Long.valueOf(j));
    }

    private final void setVideoBufferingStartTime(String str, Long l) {
        if (TextUtils.isEmpty(str) || l == null || l.longValue() < 0) {
            return;
        }
        LinkedHashMap<String, Long> linkedHashMap = this.mVideoBufferingStartTimeMap;
        o.LJI(str);
        linkedHashMap.put(str, l);
    }

    private final void updateVideoBufferingStartTime(String str, long j) {
        setVideoBufferingStartTime(str, Long.valueOf(j));
    }

    public void init(Application application, InitInfo initInfo) {
        this.pm.getClass();
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.init();
    }

    public void reportBufferLength(String str, long j) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LJFF();
    }

    public void reportCdnIP(String str, String str2) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportSeekStart(String str, double d) {
        setSeekStartTimePoint(str, SystemClock.elapsedRealtime());
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoOnResume(String str, VideoInfo videoInfo) {
        Boolean bool;
        if (!TextUtils.isEmpty(str) && (bool = this.mVideoIsNetworkBuffering.get(str)) != null && bool.booleanValue()) {
            LinkedHashMap<String, Long> linkedHashMap = this.mVideoBufferingStartTimeMap;
            if (linkedHashMap != null) {
                if (linkedHashMap.containsKey(str)) {
                    LinkedHashMap<String, Long> linkedHashMap2 = this.mVideoBufferingStartTimeMap;
                    o.LJI(str);
                    linkedHashMap2.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportVideoPause(java.lang.String r24, X.IGP r25) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService.reportVideoPause(java.lang.String, X.IGP):void");
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPlayStart(String str, Callable<ISM> callable) {
        o.LJIIIZ(callable, "callable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getExecutorService().LIZ(new ARunnableS15S0301000_15(this, str, callable, 2));
        LinkedHashMap<String, Long> linkedHashMap = this.mVideoPrepareTimeMap;
        o.LJI(str);
        linkedHashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        this.mVideoPendingRenderMap.put(str, str);
        this.mVideoBufferingStartTimeMap.remove(str);
        this.mVideoIsNetworkBuffering.remove(str);
        this.mVideoFirstBufferingCrossFirstFrame.remove(str);
        this.mBufferingTimeRecords.remove(str);
        this.mVideoPausedTimeMap.remove(str);
        this.mVideoHasRendered.remove(str);
        this.mVideoFirstFrameTimeMap.remove(str);
        this.mPausedTimeRecords.remove(str);
        clearSeekStartTimePoint(str);
        this.isDecodeBuffering = false;
        this.videoDecodeBufferingStartTime = 0L;
        this.totalNetBufferCount = 0;
        this.totalDecodeBufferCount++;
        this.totalDecodeBufferTime = 0L;
    }

    public /* synthetic */ SimDtReportService(IPlayerEventReporter iPlayerEventReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ISC() : iPlayerEventReporter);
    }

    /* renamed from: reportVideoPlayFirstFinish$lambda-7 */
    public static final void m175reportVideoPlayFirstFinish$lambda7(SimDtReportService this$0, String str, Callable callable) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(callable, "$callable");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        IQY vpf = (IQY) callable.call();
        IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        o.LJIIIIZZ(vpf, "vpf");
        iPlayerEventReporter.LIZIZ(vpf, LIZJ);
    }

    /* renamed from: reportVideoPlayStart$lambda-0 */
    public static final void m176reportVideoPlayStart$lambda0(Callable callable, SimDtReportService this$0, String str) {
        o.LJIIIZ(callable, "$callable");
        o.LJIIIZ(this$0, "this$0");
        Object call = callable.call();
        o.LJIIIIZZ(call, "callable.call()");
        ISM ism = (ISM) call;
        this$0.pm.LJIIIIZZ(str, ism);
        IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LIZJ(ism);
    }

    /* renamed from: reportVideoPlayTime$lambda-8 */
    public static final void m177reportVideoPlayTime$lambda8(SimDtReportService this$0, String str, Callable callable) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(callable, "$callable");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        C46575IPr vpf = (C46575IPr) callable.call();
        IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        o.LJIIIIZZ(vpf, "vpf");
        iPlayerEventReporter.LJI(vpf, LIZJ);
    }

    private final void reportVideoResponse(String str, int i, IRV irv) {
        String str2;
        if (this.videoResponseHasReportedCount >= this.reporterConfig.getReportVideoResponseCount()) {
            return;
        }
        ITB LIZ = this.pm.LIZ(str);
        VideoInfo LIZJ = this.pm.LIZJ(str);
        if (TextUtils.isEmpty(str) || LIZJ == null) {
            return;
        }
        if (LIZ == null) {
            str2 = null;
        } else {
            str2 = LIZ.LIZ;
        }
        irv.LIZJ = str2;
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LIZLLL(i, LIZJ, irv);
        }
        this.videoResponseHasReportedCount++;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ab  */
    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportVideoPause(java.lang.String r21, java.util.concurrent.Callable<X.C46554IOw> r22, X.IGP r23) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService.reportVideoPause(java.lang.String, java.util.concurrent.Callable, X.IGP):void");
    }

    public void reportVideoPlayFirstFinish(String str, Callable<IQY> callable, HashMap<String, Object> hashMap) {
        o.LJIIIZ(callable, "callable");
        getExecutorService().LIZ(new ARunnableS11S0301000_11(1, this, str, callable, 3));
    }

    public void reportVideoPlayTime(String str, Callable<C46575IPr> callable, HashMap<String, Object> hashMap) {
        o.LJIIIZ(callable, "callable");
        getExecutorService().LIZ(new ARunnableS7S1200000_8(callable, this, str, 17));
    }

    public void reportVideoResolution(String str, int i, int i2) {
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoBuffering(String str, boolean z, boolean z2, Callable<C46554IOw> callable) {
        boolean z3;
        o.LJIIIZ(callable, "callable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap<String, Boolean> linkedHashMap = this.mVideoHasRendered;
        o.LJI(str);
        Boolean bool = linkedHashMap.get(str);
        int i = 0;
        if (z && z2) {
            LinkedHashMap<String, Boolean> linkedHashMap2 = this.mVideoFirstBufferingCrossFirstFrame;
            if (bool == null || !bool.booleanValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            linkedHashMap2.put(str, Boolean.valueOf(z3));
        }
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        if (z) {
            if (z2) {
                Boolean bool2 = this.mVideoIsNetworkBuffering.get(str);
                if (bool2 == null || !bool2.booleanValue()) {
                    this.mVideoBufferingStartTimeMap.put(str, Long.valueOf(elapsedRealtime));
                    this.mVideoIsNetworkBuffering.put(str, Boolean.TRUE);
                    this.totalNetBufferCount++;
                }
                reportBlock(str, true, callable, -1L, "", true, 0);
                return;
            }
            Long l = this.mVideoBufferingStartTimeMap.get(str);
            if (l == null || l.longValue() <= 0) {
                Boolean bool3 = this.mVideoFirstBufferingCrossFirstFrame.get(str);
                if (bool3 != null && bool3.booleanValue()) {
                    Boolean isReportBlockV2 = this.reporterConfig.isReportBlockV2();
                    o.LJIIIIZZ(isReportBlockV2, "reporterConfig.isReportBlockV2");
                    if (isReportBlockV2.booleanValue() && this.mVideoFirstFrameTimeMap.get(str) != null) {
                        Long l2 = this.mVideoFirstFrameTimeMap.get(str);
                        o.LJI(l2);
                        l = l2;
                        i = 1;
                    }
                }
                if (l == null) {
                    return;
                }
            }
            if (l.longValue() <= 0) {
                return;
            }
            this.mVideoIsNetworkBuffering.put(str, Boolean.FALSE);
            if (elapsedRealtime <= l.longValue()) {
                return;
            }
            long longValue = elapsedRealtime - l.longValue();
            List<Long> list = this.mBufferingTimeRecords.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(Long.valueOf(longValue));
            this.mBufferingTimeRecords.put(str, list);
            if (checkIfBufferingComesFromSeek(str, l.longValue())) {
                i = 2;
            }
            clearSeekStartTimePoint(str);
            reportBlock(str, false, callable, longValue, "resume", true, i);
            return;
        }
        this.isDecodeBuffering = z2;
        if (z2) {
            this.videoDecodeBufferingStartTime = elapsedRealtime;
            this.totalDecodeBufferCount++;
            reportBlock(str, true, callable, -1L, "", false, 0);
            return;
        }
        long j = this.videoDecodeBufferingStartTime;
        if (j == 0) {
            return;
        }
        long j2 = elapsedRealtime - j;
        this.totalDecodeBufferTime += j2;
        this.videoDecodeBufferingStartTime = 0L;
        reportBlock(str, false, callable, j2, "resume", false, 0);
    }

    private final void reportBlock(final String str, final long j, final String str2, final boolean z, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            if (j < this.reporterConfig.getNetBufferingThreshold()) {
                return;
            }
        } else if (j <= this.reporterConfig.getCodecBufferingThreshold()) {
            return;
        }
        getExecutorService().LIZ(new Runnable() { // from class: X.ITy
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportService.m171reportBlock$lambda3(SimDtReportService.this, str, i, j, str2, z);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportPlayFailed(final String str, final Callable<IPA> callable, final HashMap<String, Object> hashMap, final Callable<HashMap<String, Object>> resCallable, final boolean z) {
        o.LJIIIZ(callable, "callable");
        o.LJIIIZ(resCallable, "resCallable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Long l = this.mVideoPrepareTimeMap.get(str);
        LinkedHashMap<String, String> linkedHashMap = this.mVideoPendingRenderMap;
        if (linkedHashMap != null) {
            final boolean containsKey = linkedHashMap.containsKey(str);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            getExecutorService().LIZ(new Runnable() { // from class: X.ITr
                @Override // java.lang.Runnable
                public final void run() {
                    SimDtReportService.m173reportPlayFailed$lambda6(SimDtReportService.this, str, l, containsKey, z, elapsedRealtime, resCallable, hashMap, callable);
                }
            });
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportRenderFirstFrame(final String str, final Callable<IT2> callable, final HashMap<String, Object> hashMap, final Callable<HashMap<String, Object>> resCallable, final boolean z) {
        o.LJIIIZ(callable, "callable");
        o.LJIIIZ(resCallable, "resCallable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = this.mVideoPendingRenderMap;
        if (linkedHashMap != null) {
            C65777Prh.LIZJ(linkedHashMap).remove(str);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            LinkedHashMap<String, Long> linkedHashMap2 = this.mVideoFirstFrameTimeMap;
            o.LJI(str);
            linkedHashMap2.put(str, Long.valueOf(elapsedRealtime));
            this.mVideoHasRendered.put(str, Boolean.TRUE);
            final Long l = this.mVideoPrepareTimeMap.get(str);
            if (l == null || l.longValue() <= 0) {
                return;
            }
            getExecutorService().LIZ(new Runnable() { // from class: X.ITs
                @Override // java.lang.Runnable
                public final void run() {
                    SimDtReportService.m174reportRenderFirstFrame$lambda1(SimDtReportService.this, str, callable, elapsedRealtime, l, z, resCallable, hashMap);
                }
            });
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportVideoStop(final java.lang.String r25, final java.util.concurrent.Callable<X.C46648ISm> r26, final java.util.HashMap<java.lang.String, java.lang.Object> r27, final java.util.concurrent.Callable<java.util.HashMap<java.lang.String, java.lang.Object>> r28, final boolean r29) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simreporterdt.SimDtReportService.reportVideoStop(java.lang.String, java.util.concurrent.Callable, java.util.HashMap, java.util.concurrent.Callable, boolean):void");
    }

    private final void reportBlock(String str, Callable<C46554IOw> callable, long j, String str2, boolean z, int i) {
        if (TextUtils.isEmpty(str) || callable == null) {
            return;
        }
        if (z) {
            if (j < this.reporterConfig.getNetBufferingThreshold()) {
                return;
            }
        } else if (j <= this.reporterConfig.getCodecBufferingThreshold()) {
            return;
        }
        getExecutorService().LIZ(new ARunnableS0S2211100_8(callable, this, str, i, j, str2, z, 0));
    }

    /* renamed from: reportBlock$lambda-3 */
    public static final void m171reportBlock$lambda3(SimDtReportService this$0, String str, int i, long j, String endType, boolean z) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(endType, "$endType");
        C46554IOw LIZIZ = this$0.pm.LIZIZ(str);
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        if (LIZJ != null && LIZIZ != null) {
            LIZIZ.LIZLLL = i;
            IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
            if (iPlayerEventReporter == null) {
                return;
            }
            iPlayerEventReporter.LJ(LIZJ, LIZIZ, j, endType, z);
        }
    }

    private final void reportBlock(final String str, final boolean z, final Callable<C46554IOw> callable, final long j, final String str2, final boolean z2, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z2) {
            if (j < this.reporterConfig.getNetBufferingThreshold()) {
                return;
            }
        } else if (j <= this.reporterConfig.getCodecBufferingThreshold()) {
            return;
        }
        getExecutorService().LIZ(new Runnable() { // from class: X.ITw
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportService.m170reportBlock$lambda2(SimDtReportService.this, str, callable, z2, z, i, j, str2);
            }
        });
    }

    /* renamed from: reportBlock$lambda-4 */
    public static final void m172reportBlock$lambda4(Callable callable, SimDtReportService this$0, String str, int i, long j, String endType, boolean z) {
        o.LJIIIZ(callable, "$callable");
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(endType, "$endType");
        C46554IOw c46554IOw = (C46554IOw) callable.call();
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        if (LIZJ != null && c46554IOw != null) {
            c46554IOw.LIZLLL = i;
            IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
            if (iPlayerEventReporter == null) {
                return;
            }
            iPlayerEventReporter.LJ(LIZJ, c46554IOw, j, endType, z);
        }
    }

    /* renamed from: reportBlock$lambda-2 */
    public static final void m170reportBlock$lambda2(SimDtReportService this$0, String str, Callable callable, boolean z, boolean z2, int i, long j, String endType) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(callable, "$callable");
        o.LJIIIZ(endType, "$endType");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        C46554IOw vbi = (C46554IOw) callable.call();
        this$0.pm.LJ(str, vbi);
        if (!z2 && LIZJ != null) {
            if (vbi != null) {
                vbi.LIZLLL = i;
            }
            IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
            if (iPlayerEventReporter == null) {
                return;
            }
            o.LJIIIIZZ(vbi, "vbi");
            iPlayerEventReporter.LJ(LIZJ, vbi, j, endType, z);
        }
    }

    /* renamed from: reportRenderFirstFrame$lambda-1 */
    public static final void m174reportRenderFirstFrame$lambda1(SimDtReportService this$0, String str, Callable callable, long j, Long l, boolean z, Callable resCallable, HashMap hashMap) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(callable, "$callable");
        o.LJIIIZ(resCallable, "$resCallable");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        Object call = callable.call();
        o.LJIIIIZZ(call, "callable.call()");
        IT2 it2 = (IT2) call;
        this$0.pm.LIZLLL(str, it2);
        it2.LJ = (int) (j - l.longValue());
        IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJII(it2, LIZJ);
        }
        if (z) {
            long longValue = j - l.longValue();
            HashMap hashMap2 = (HashMap) resCallable.call();
            IRV irv = new IRW(0).LIZ;
            irv.LIZIZ = 1;
            irv.LIZ(hashMap);
            irv.LIZ(hashMap2);
            irv.LIZ = 1;
            this$0.reportVideoResponse(str, (int) longValue, irv);
        }
    }

    /* renamed from: reportPlayFailed$lambda-6 */
    public static final void m173reportPlayFailed$lambda6(SimDtReportService this$0, String str, Long l, boolean z, boolean z2, long j, Callable resCallable, HashMap hashMap, Callable callable) {
        IPlayerEventReporter iPlayerEventReporter;
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(resCallable, "$resCallable");
        o.LJIIIZ(callable, "$callable");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        if (l != null && l.longValue() > 0 && z && z2) {
            long longValue = j - l.longValue();
            HashMap hashMap2 = (HashMap) resCallable.call();
            IRV irv = new IRW(0).LIZ;
            irv.LIZIZ = 0;
            irv.LIZ(hashMap);
            irv.LIZ(hashMap2);
            irv.LIZ = 0;
            this$0.reportVideoResponse(str, (int) longValue, irv);
        }
        IPA ipa = (IPA) callable.call();
        if (LIZJ == null || ipa == null || (iPlayerEventReporter = this$0.reporter) == null) {
            return;
        }
        iPlayerEventReporter.LJIILJJIL(ipa, LIZJ);
    }

    /* renamed from: reportVideoStop$lambda-5 */
    public static final void m178reportVideoStop$lambda5(SimDtReportService this$0, String str, Callable resCallable, boolean z, boolean z2, HashMap hashMap, C72242sW waitDuration, Callable callable, C72242sW totalNetBufferTime, Boolean bool, C72242sW durationL, C72242sW totalPauseTime) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(resCallable, "$resCallable");
        o.LJIIIZ(waitDuration, "$waitDuration");
        o.LJIIIZ(callable, "$callable");
        o.LJIIIZ(totalNetBufferTime, "$totalNetBufferTime");
        o.LJIIIZ(durationL, "$durationL");
        o.LJIIIZ(totalPauseTime, "$totalPauseTime");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        HashMap hashMap2 = (HashMap) resCallable.call();
        if (z && z2) {
            IRV irv = new IRW(0).LIZ;
            irv.LIZIZ = 0;
            irv.LIZ(hashMap2);
            irv.LIZ(hashMap);
            this$0.reportVideoResponse(str, (int) waitDuration.element, irv);
        }
        C46648ISm c46648ISm = (C46648ISm) callable.call();
        Integer valueOf = Integer.valueOf(this$0.totalNetBufferCount);
        if (valueOf == null) {
            c46648ISm.getClass();
        } else {
            c46648ISm.LJIILLIIL.put("total_net_buffer_count", valueOf);
        }
        Long valueOf2 = Long.valueOf(totalNetBufferTime.element);
        if (valueOf2 != null) {
            c46648ISm.LJIILLIIL.put("total_net_buffer_time", valueOf2);
        }
        if (bool != null && bool.booleanValue()) {
            c46648ISm.LJIIIZ = true;
        }
        if (LIZJ != null) {
            c46648ISm.LJ = waitDuration.element;
            long j = durationL.element;
            long j2 = totalNetBufferTime.element;
            long j3 = totalPauseTime.element;
            if (j2 <= j3) {
                j2 = j3;
            }
            long j4 = j - j2;
            c46648ISm.LIZJ = j4;
            if (j4 < 0) {
                c46648ISm.LIZJ = 0L;
            }
            IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIILL(str, LIZJ, c46648ISm);
            }
            this$0.pm.LJII(str);
        }
    }
}
