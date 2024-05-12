package com.ss.android.ugc.aweme.simreporterdt;

import X.C221108m2;
import X.C2306893o;
import X.C35751E1j;
import X.C46554IOw;
import X.C46575IPr;
import X.C46648ISm;
import X.C46678ITq;
import X.C46685ITx;
import X.C5H3;
import X.EnumC221088m0;
import X.EnumC46675ITn;
import X.IGP;
import X.ILG;
import X.ILH;
import X.IPA;
import X.IQY;
import X.IRV;
import X.IRW;
import X.ISM;
import X.IT2;
import X.ITA;
import X.ITB;
import X.IZ8;
import Y.ARunnableS0S2211100_8;
import Y.ARunnableS7S1200000_8;
import Y.IDRunnableS0S1201000;
import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.InitInfo;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2;
import com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SimDtReportServiceV2 implements IPlayerEventReportService {
    public static final C46685ITx Companion = new C46685ITx();
    public final C35751E1j<String, List<Long>> decodingBlockDurations;
    public final C35751E1j<String, Long> decodingBufferingStartTimePoints;
    public final C35751E1j<String, Boolean> decodingBufferingStatus;
    public final C5H3 executorService$delegate;
    public final C35751E1j<String, EnumC46675ITn> fragmentNetworkBlockTypes;
    public final C35751E1j<String, List<Long>> networkBlockDurations;
    public final C35751E1j<String, Long> networkBufferingStartTimePoints;
    public final C35751E1j<String, Boolean> networkBufferingStatus;
    public final C35751E1j<String, List<Long>> pauseSpanRecords;
    public final C35751E1j<String, Long> pauseTimePoints;
    public ITA pm;
    public final C35751E1j<String, Long> prepareTimePoints;
    public final C35751E1j<String, Long> renderFirstFrameTimePoints;
    public IPlayerEventReporter reporter;
    public ISimReporterConfig reporterConfig;
    public final C35751E1j<String, Long> seekStartTimePoints;
    public int videoResponseHasReportedCount;

    public SimDtReportServiceV2() {
        this(null, 1, null);
    }

    private final boolean checkBufferingTimeValidity(long j, long j2) {
        return j2 > 0 && j > 0 && j2 > j;
    }

    /* renamed from: lambda$semisugar$reportVideoPlayStart$lambda-0$0 */
    public static /* synthetic */ void m183lambda$semisugar$reportVideoPlayStart$lambda0$0(Callable callable, SimDtReportServiceV2 simDtReportServiceV2, String str) {
        m190reportVideoPlayStart$lambda0(callable, simDtReportServiceV2, str);
    }

    /* renamed from: lambda$semisugar$reportVideoPlayTime$lambda-5$0 */
    public static /* synthetic */ void m184lambda$semisugar$reportVideoPlayTime$lambda5$0(SimDtReportServiceV2 simDtReportServiceV2, String str, Callable callable) {
        m191reportVideoPlayTime$lambda5(simDtReportServiceV2, str, callable);
    }

    private final boolean checkIfNeed2CallResponseFunc() {
        Object value = IZ8.D0.getValue();
        o.LJIIIIZZ(value, "<get-disableUnlimitedRequestResponse>(...)");
        if (!((Boolean) value).booleanValue() || this.videoResponseHasReportedCount < this.reporterConfig.getReportVideoResponseCount()) {
            return true;
        }
        return false;
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

    public SimDtReportServiceV2(IPlayerEventReporter iPlayerEventReporter) {
        this.reporter = iPlayerEventReporter;
        this.pm = new ITA();
        this.reporterConfig = new ILG();
        this.executorService$delegate = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C46678ITq.LJLIL);
        this.prepareTimePoints = new C35751E1j<>(20);
        this.renderFirstFrameTimePoints = new C35751E1j<>(20);
        this.networkBufferingStatus = new C35751E1j<>(20);
        this.networkBufferingStartTimePoints = new C35751E1j<>(20);
        this.pauseTimePoints = new C35751E1j<>(20);
        this.pauseSpanRecords = new C35751E1j<>(20);
        this.networkBlockDurations = new C35751E1j<>(20);
        this.fragmentNetworkBlockTypes = new C35751E1j<>(20);
        this.seekStartTimePoints = new C35751E1j<>(20);
        this.decodingBufferingStatus = new C35751E1j<>(20);
        this.decodingBufferingStartTimePoints = new C35751E1j<>(20);
        this.decodingBlockDurations = new C35751E1j<>(20);
    }

    private final int calculateBlockTypeNum(EnumC46675ITn enumC46675ITn) {
        if (enumC46675ITn == EnumC46675ITn.COMMON_BLOCK) {
            return 0;
        }
        if (enumC46675ITn == EnumC46675ITn.PRE_BLOCK) {
            return 1;
        }
        if (enumC46675ITn == EnumC46675ITn.SEEK_BLOCK) {
            return 2;
        }
        return -1;
    }

    private final boolean checkIfHasRenderedFirstFrame(String str) {
        if (getRenderFirstFrameTimePoint(str) > 0) {
            return true;
        }
        return false;
    }

    private final void clearFragmentNetworkBlockType(String str) {
        if (str == null) {
            return;
        }
        this.fragmentNetworkBlockTypes.remove(str);
    }

    private final void clearSeekStartTimePoint(String str) {
        if (str == null) {
            return;
        }
        this.seekStartTimePoints.remove(str);
    }

    private final long getDecodingBufferingStartTimePoint(String str) {
        Long l;
        if (str == null || !this.decodingBufferingStartTimePoints.containsKey(str) || (l = this.decodingBufferingStartTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final boolean getDecodingBufferingStatus(String str) {
        Boolean bool;
        if (str == null || !this.decodingBufferingStatus.containsKey(str) || (bool = this.decodingBufferingStatus.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final EnumC46675ITn getFragmentNetworkBlockType(String str) {
        if (str == null || !this.fragmentNetworkBlockTypes.containsKey(str)) {
            return EnumC46675ITn.INVALID;
        }
        EnumC46675ITn enumC46675ITn = this.fragmentNetworkBlockTypes.get(str);
        if (enumC46675ITn == null) {
            return EnumC46675ITn.INVALID;
        }
        return enumC46675ITn;
    }

    private final int getNetworkBlockCount(String str) {
        List<Long> list;
        if (str == null || !this.networkBlockDurations.containsKey(str) || (list = this.networkBlockDurations.get(str)) == null) {
            return 0;
        }
        return list.size();
    }

    private final long getNetworkBufferingStartTimePoint(String str) {
        Long l;
        if (str == null || !this.networkBufferingStartTimePoints.containsKey(str) || (l = this.networkBufferingStartTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final boolean getNetworkBufferingStatus(String str) {
        Boolean bool;
        if (str == null || !this.networkBufferingStatus.containsKey(str) || (bool = this.networkBufferingStatus.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final long getPauseTimePoint(String str) {
        Long l;
        if (str == null || !this.pauseTimePoints.containsKey(str) || (l = this.pauseTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final long getPrepareTimePoint(String str) {
        Long l;
        if (str == null || !this.prepareTimePoints.containsKey(str) || (l = this.prepareTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final long getRenderFirstFrameTimePoint(String str) {
        Long l;
        if (str == null || !this.renderFirstFrameTimePoints.containsKey(str) || (l = this.renderFirstFrameTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final long getSeekStartTimePoint(String str) {
        Long l;
        if (str == null || !this.seekStartTimePoints.containsKey(str) || (l = this.seekStartTimePoints.get(str)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final void resetNetworkBufferingStatus(String str) {
        setNetworkBufferingStatus(str, false);
    }

    private final long sumOfAllDecodingBlockDurations(String str) {
        List<Long> list;
        long j = 0;
        if (str != null && this.decodingBlockDurations.containsKey(str) && (list = this.decodingBlockDurations.get(str)) != null) {
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                j += it.next().longValue();
            }
        }
        return j;
    }

    private final long sumOfAllNetworkBlockDurations(String str) {
        List<Long> list;
        long j = 0;
        if (str != null && this.networkBlockDurations.containsKey(str) && (list = this.networkBlockDurations.get(str)) != null) {
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                j += it.next().longValue();
            }
        }
        return j;
    }

    private final long sumOfAllPauseSpans(String str) {
        List<Long> list;
        long j = 0;
        if (str != null && this.pauseSpanRecords.containsKey(str) && (list = this.pauseSpanRecords.get(str)) != null) {
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                j += it.next().longValue();
            }
        }
        return j;
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
        long pauseTimePoint = getPauseTimePoint(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (pauseTimePoint <= 0) {
            return;
        }
        recordPauseSpan(str, pauseTimePoint, elapsedRealtime);
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

    private final boolean checkIfBufferingComesFromSeek(String str, long j) {
        if (str != null && j > 0) {
            long seekStartTimePoint = getSeekStartTimePoint(str);
            if (seekStartTimePoint <= 0) {
                return false;
            }
            if (j >= seekStartTimePoint && j - seekStartTimePoint <= 300) {
                return true;
            }
            if (seekStartTimePoint >= j && seekStartTimePoint - j <= 300) {
                return true;
            }
        }
        return false;
    }

    private final void setDecodingBufferingStartTimePoint(String str, long j) {
        if (str == null || j < 0) {
            return;
        }
        this.decodingBufferingStartTimePoints.put(str, Long.valueOf(j));
    }

    private final void setDecodingBufferingStatus(String str, boolean z) {
        if (str == null) {
            return;
        }
        this.decodingBufferingStatus.put(str, Boolean.valueOf(z));
    }

    private final void setNetworkBufferingStartTimePoint(String str, long j) {
        if (str == null || j < 0) {
            return;
        }
        this.networkBufferingStartTimePoints.put(str, Long.valueOf(j));
    }

    private final void setNetworkBufferingStatus(String str, boolean z) {
        if (str == null) {
            return;
        }
        this.networkBufferingStatus.put(str, Boolean.valueOf(z));
    }

    private final void setPauseTimePoint(String str, long j) {
        if (str == null || j <= 0) {
            return;
        }
        this.pauseTimePoints.put(str, Long.valueOf(j));
    }

    private final void setPrepareTimePoint(String str, long j) {
        if (str == null || j <= 0) {
            return;
        }
        this.prepareTimePoints.put(str, Long.valueOf(j));
    }

    private final void setRenderFirstFrameTimePoint(String str, long j) {
        if (str == null || j <= 0) {
            return;
        }
        this.renderFirstFrameTimePoints.put(str, Long.valueOf(j));
    }

    private final void setSeekStartTimePoint(String str, long j) {
        if (str == null || j < 0) {
            return;
        }
        this.seekStartTimePoints.put(str, Long.valueOf(j));
    }

    private final void stashFragmentNetworkBlockType(String str, EnumC46675ITn enumC46675ITn) {
        if (str == null || this.fragmentNetworkBlockTypes.containsKey(str)) {
            return;
        }
        this.fragmentNetworkBlockTypes.put(str, enumC46675ITn);
    }

    private final void updateNetworkBufferingStartTimePoint(String str, long j) {
        setNetworkBufferingStartTimePoint(str, j);
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
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean networkBufferingStatus = getNetworkBufferingStatus(str);
        if (this.reporterConfig.getBlockReportStrategy() == ILH.STRATEGY_1) {
            setNetworkBufferingStartTimePoint(str, 0L);
        }
        this.reporterConfig.getBlockReportStrategy();
        if (this.reporterConfig.getBlockReportStrategy() == ILH.STRATEGY_3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (networkBufferingStatus && this.networkBufferingStartTimePoints.containsKey(str)) {
                setNetworkBufferingStartTimePoint(str, elapsedRealtime);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPause(String str, IGP igp) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pm.LJFF(str);
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIJ();
        }
        boolean checkIfHasRenderedFirstFrame = checkIfHasRenderedFirstFrame(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!checkIfHasRenderedFirstFrame) {
            return;
        }
        setPauseTimePoint(str, elapsedRealtime);
        boolean networkBufferingStatus = getNetworkBufferingStatus(str);
        boolean decodingBufferingStatus = getDecodingBufferingStatus(str);
        if (networkBufferingStatus) {
            reportNetworkBlockWhenPause(str, null, elapsedRealtime);
        }
        if (decodingBufferingStatus) {
            reportDecodingBlockWhenPause(str, null, elapsedRealtime);
        }
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPlayStart(String str, Callable<ISM> callable) {
        o.LJIIIZ(callable, "callable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getExecutorService().LIZ(new IDRunnableS0S1201000(this, str, callable, 1));
        setPrepareTimePoint(str, SystemClock.elapsedRealtime());
        this.pauseSpanRecords.remove(str);
        this.pauseTimePoints.remove(str);
        this.networkBlockDurations.remove(str);
        this.networkBufferingStatus.remove(str);
        this.renderFirstFrameTimePoints.remove(str);
        this.networkBufferingStartTimePoints.remove(str);
        this.decodingBlockDurations.remove(str);
        this.decodingBufferingStatus.remove(str);
        this.decodingBufferingStartTimePoints.remove(str);
        clearSeekStartTimePoint(str);
        resetNetworkBufferingStatus(str);
        clearFragmentNetworkBlockType(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SimDtReportServiceV2(com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto Le
            X.ITx r0 = com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2.Companion
            r0.getClass()
            X.ISC r2 = new X.ISC
            r2.<init>()
        Le:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simreporterdt.SimDtReportServiceV2.<init>(com.ss.android.ugc.aweme.simreporterdt.report.IPlayerEventReporter, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final EnumC46675ITn calculateBlockType(String str, long j, long j2) {
        if (!checkBufferingTimeValidity(j, j2)) {
            return EnumC46675ITn.INVALID;
        }
        long renderFirstFrameTimePoint = getRenderFirstFrameTimePoint(str);
        if (renderFirstFrameTimePoint <= 0) {
            return EnumC46675ITn.INVALID;
        }
        EnumC46675ITn fragmentNetworkBlockType = getFragmentNetworkBlockType(str);
        EnumC46675ITn enumC46675ITn = EnumC46675ITn.INVALID;
        if (fragmentNetworkBlockType != enumC46675ITn) {
            return fragmentNetworkBlockType;
        }
        if (checkIfBufferingComesFromSeek(str, j)) {
            return EnumC46675ITn.SEEK_BLOCK;
        }
        if (1 + j <= renderFirstFrameTimePoint && renderFirstFrameTimePoint <= j2) {
            return EnumC46675ITn.PRE_BLOCK;
        }
        if (renderFirstFrameTimePoint < j) {
            return EnumC46675ITn.COMMON_BLOCK;
        }
        return enumC46675ITn;
    }

    private final void recordDecodingBlockDuration(String str, long j, long j2) {
        List<Long> arrayList;
        if (str == null || j <= 0 || j2 <= 0 || j2 <= j) {
            return;
        }
        if (!this.decodingBlockDurations.containsKey(str) || (arrayList = this.decodingBlockDurations.get(str)) == null) {
            arrayList = new ArrayList<>();
            this.decodingBlockDurations.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j2 - j));
    }

    private final void recordNetworkBlockDuration(String str, long j, long j2) {
        List<Long> arrayList;
        if (str == null || j <= 0 || j2 <= 0 || j2 <= j) {
            return;
        }
        if (!this.networkBlockDurations.containsKey(str) || (arrayList = this.networkBlockDurations.get(str)) == null) {
            arrayList = new ArrayList<>();
            this.networkBlockDurations.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j2 - j));
    }

    private final void recordPauseSpan(String str, long j, long j2) {
        List<Long> arrayList;
        if (str == null || j2 <= 0 || j <= 0 || j2 <= j) {
            return;
        }
        if (!this.pauseSpanRecords.containsKey(str) || (arrayList = this.pauseSpanRecords.get(str)) == null) {
            arrayList = new ArrayList<>();
            this.pauseSpanRecords.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j2 - j));
    }

    private final void reportDecodingBlockWhenPause(String str, Callable<C46554IOw> callable, long j) {
        long decodingBufferingStartTimePoint = getDecodingBufferingStartTimePoint(str);
        EnumC46675ITn calculateBlockType = calculateBlockType(str, decodingBufferingStartTimePoint, j);
        if (EnumC46675ITn.INVALID == calculateBlockType) {
            return;
        }
        int calculateBlockTypeNum = calculateBlockTypeNum(calculateBlockType);
        if (decodingBufferingStartTimePoint <= 0) {
            return;
        }
        Boolean isReportTotalBlock = this.reporterConfig.isReportTotalBlock();
        o.LJIIIIZZ(isReportTotalBlock, "reporterConfig.isReportTotalBlock");
        if (isReportTotalBlock.booleanValue()) {
            reportBlock(str, callable, (j - decodingBufferingStartTimePoint) + sumOfAllDecodingBlockDurations(str), "leave", false, calculateBlockTypeNum);
        } else {
            reportBlock(str, callable, j - decodingBufferingStartTimePoint, "leave", false, calculateBlockTypeNum);
        }
    }

    private final void reportNetworkBlockWhenPause(String str, Callable<C46554IOw> callable, long j) {
        long networkBufferingStartTimePoint = getNetworkBufferingStartTimePoint(str);
        EnumC46675ITn calculateBlockType = calculateBlockType(str, networkBufferingStartTimePoint, j);
        if (EnumC46675ITn.INVALID == calculateBlockType) {
            return;
        }
        stashFragmentNetworkBlockType(str, calculateBlockType);
        int calculateBlockTypeNum = calculateBlockTypeNum(calculateBlockType);
        if (calculateBlockType == EnumC46675ITn.PRE_BLOCK) {
            Boolean isReportBlockV2 = this.reporterConfig.isReportBlockV2();
            o.LJIIIIZZ(isReportBlockV2, "reporterConfig.isReportBlockV2");
            if (isReportBlockV2.booleanValue()) {
                networkBufferingStartTimePoint = getRenderFirstFrameTimePoint(str);
            }
        }
        if (networkBufferingStartTimePoint <= 0) {
            return;
        }
        if (this.reporterConfig.getBlockReportStrategy() == ILH.STRATEGY_1) {
            setNetworkBufferingStartTimePoint(str, 0L);
        }
        if (this.reporterConfig.getBlockReportStrategy() == ILH.STRATEGY_2) {
            setNetworkBufferingStartTimePoint(str, j);
        }
        if (this.reporterConfig.getBlockReportStrategy() == ILH.STRATEGY_3) {
            setNetworkBufferingStartTimePoint(str, 0L);
        }
        Boolean isReportTotalBlock = this.reporterConfig.isReportTotalBlock();
        o.LJIIIIZZ(isReportTotalBlock, "reporterConfig.isReportTotalBlock");
        if (isReportTotalBlock.booleanValue()) {
            reportBlock(str, callable, (j - networkBufferingStartTimePoint) + sumOfAllNetworkBlockDurations(str), "leave", true, calculateBlockTypeNum);
        } else {
            reportBlock(str, callable, j - networkBufferingStartTimePoint, "leave", true, calculateBlockTypeNum);
        }
    }

    /* renamed from: reportVideoPlayFirstFinish$lambda-4 */
    public static final void m189reportVideoPlayFirstFinish$lambda4(SimDtReportServiceV2 this$0, String str, Callable callable) {
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
    public static final void m190reportVideoPlayStart$lambda0(Callable callable, SimDtReportServiceV2 this$0, String str) {
        o.LJIIIZ(callable, "$callable");
        o.LJIIIZ(this$0, "this$0");
        ISM vps = (ISM) callable.call();
        ITA ita = this$0.pm;
        o.LJIIIIZZ(vps, "vps");
        ita.LJIIIIZZ(str, vps);
        IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        iPlayerEventReporter.LIZJ(vps);
    }

    /* renamed from: reportVideoPlayTime$lambda-5 */
    public static final void m191reportVideoPlayTime$lambda5(SimDtReportServiceV2 this$0, String str, Callable callable) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(callable, "$callable");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        C46575IPr videoPlayTimeInfo = (C46575IPr) callable.call();
        IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
        if (iPlayerEventReporter == null) {
            return;
        }
        o.LJIIIIZZ(videoPlayTimeInfo, "videoPlayTimeInfo");
        iPlayerEventReporter.LJI(videoPlayTimeInfo, LIZJ);
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

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoPause(String str, Callable<C46554IOw> callable, IGP igp) {
        o.LJIIIZ(callable, "callable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pm.LJFF(str);
        IPlayerEventReporter iPlayerEventReporter = this.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJIIJ();
        }
        boolean checkIfHasRenderedFirstFrame = checkIfHasRenderedFirstFrame(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!checkIfHasRenderedFirstFrame) {
            return;
        }
        setPauseTimePoint(str, elapsedRealtime);
        boolean networkBufferingStatus = getNetworkBufferingStatus(str);
        boolean decodingBufferingStatus = getDecodingBufferingStatus(str);
        if (networkBufferingStatus) {
            reportNetworkBlockWhenPause(str, callable, elapsedRealtime);
        }
        if (decodingBufferingStatus) {
            reportDecodingBlockWhenPause(str, callable, elapsedRealtime);
        }
    }

    public void reportVideoPlayFirstFinish(String str, Callable<IQY> callable, HashMap<String, Object> hashMap) {
        o.LJIIIZ(callable, "callable");
        getExecutorService().LIZ(new ARunnableS7S1200000_8(callable, this, str, 18));
    }

    public void reportVideoPlayTime(String str, Callable<C46575IPr> callable, HashMap<String, Object> hashMap) {
        o.LJIIIZ(callable, "callable");
        getExecutorService().LIZ(new IDRunnableS0S1201000(str, 2, this, callable, 2));
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
        o.LJIIIZ(callable, "callable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            if (z2) {
                clearFragmentNetworkBlockType(str);
                setNetworkBufferingStatus(str, z2);
                setNetworkBufferingStartTimePoint(str, elapsedRealtime);
                return;
            }
        } else if (z2) {
            setDecodingBufferingStatus(str, z2);
            setDecodingBufferingStartTimePoint(str, elapsedRealtime);
            return;
        }
        if (z) {
            if (z2 || !getNetworkBufferingStatus(str)) {
                return;
            }
            setNetworkBufferingStatus(str, z2);
            long networkBufferingStartTimePoint = getNetworkBufferingStartTimePoint(str);
            EnumC46675ITn calculateBlockType = calculateBlockType(str, networkBufferingStartTimePoint, elapsedRealtime);
            if (EnumC46675ITn.INVALID == calculateBlockType) {
                return;
            }
            int calculateBlockTypeNum = calculateBlockTypeNum(calculateBlockType);
            if (calculateBlockType == EnumC46675ITn.PRE_BLOCK) {
                Boolean isReportBlockV2 = this.reporterConfig.isReportBlockV2();
                o.LJIIIIZZ(isReportBlockV2, "reporterConfig.isReportBlockV2");
                if (isReportBlockV2.booleanValue()) {
                    networkBufferingStartTimePoint = getRenderFirstFrameTimePoint(str);
                }
            }
            if (networkBufferingStartTimePoint <= 0) {
                return;
            }
            clearSeekStartTimePoint(str);
            clearFragmentNetworkBlockType(str);
            recordNetworkBlockDuration(str, networkBufferingStartTimePoint, elapsedRealtime);
            reportBlock(str, callable, elapsedRealtime - networkBufferingStartTimePoint, "resume", true, calculateBlockTypeNum);
            return;
        }
        if (z2 || !getDecodingBufferingStatus(str)) {
            return;
        }
        setDecodingBufferingStatus(str, z2);
        long decodingBufferingStartTimePoint = getDecodingBufferingStartTimePoint(str);
        EnumC46675ITn calculateBlockType2 = calculateBlockType(str, decodingBufferingStartTimePoint, elapsedRealtime);
        if (EnumC46675ITn.INVALID == calculateBlockType2) {
            return;
        }
        int calculateBlockTypeNum2 = calculateBlockTypeNum(calculateBlockType2);
        if (decodingBufferingStartTimePoint <= 0) {
            return;
        }
        recordDecodingBlockDuration(str, decodingBufferingStartTimePoint, elapsedRealtime);
        reportBlock(str, callable, elapsedRealtime - decodingBufferingStartTimePoint, "resume", false, calculateBlockTypeNum2);
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportPlayFailed(final String str, final Callable<IPA> callable, final HashMap<String, Object> hashMap, final Callable<HashMap<String, Object>> resCallable, final boolean z) {
        o.LJIIIZ(callable, "callable");
        o.LJIIIZ(resCallable, "resCallable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final boolean checkIfHasRenderedFirstFrame = checkIfHasRenderedFirstFrame(str);
        final long prepareTimePoint = getPrepareTimePoint(str);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        getExecutorService().LIZ(new Runnable() { // from class: X.ITu
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportServiceV2.m187reportPlayFailed$lambda3(SimDtReportServiceV2.this, str, prepareTimePoint, checkIfHasRenderedFirstFrame, z, resCallable, hashMap, elapsedRealtime, callable);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportRenderFirstFrame(final String str, final Callable<IT2> callable, final HashMap<String, Object> hashMap, final Callable<HashMap<String, Object>> resCallable, final boolean z) {
        o.LJIIIZ(callable, "callable");
        o.LJIIIZ(resCallable, "resCallable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final long prepareTimePoint = getPrepareTimePoint(str);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        setRenderFirstFrameTimePoint(str, elapsedRealtime);
        if (prepareTimePoint <= 0) {
            return;
        }
        getExecutorService().LIZ(new Runnable() { // from class: X.ITt
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportServiceV2.m188reportRenderFirstFrame$lambda1(SimDtReportServiceV2.this, str, callable, elapsedRealtime, prepareTimePoint, z, resCallable, hashMap);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.simreporter.service.IPlayerEventReportService
    public void reportVideoStop(final String str, final Callable<C46648ISm> callable, final HashMap<String, Object> hashMap, final Callable<HashMap<String, Object>> resCallable, final boolean z) {
        final long j;
        final long j2;
        o.LJIIIZ(callable, "callable");
        o.LJIIIZ(resCallable, "resCallable");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long prepareTimePoint = getPrepareTimePoint(str);
        final boolean networkBufferingStatus = getNetworkBufferingStatus(str);
        if (prepareTimePoint <= 0) {
            return;
        }
        final boolean checkIfHasRenderedFirstFrame = checkIfHasRenderedFirstFrame(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long renderFirstFrameTimePoint = getRenderFirstFrameTimePoint(str);
        final long sumOfAllPauseSpans = sumOfAllPauseSpans(str);
        final int networkBlockCount = getNetworkBlockCount(str);
        final long sumOfAllNetworkBlockDurations = sumOfAllNetworkBlockDurations(str);
        if (checkIfHasRenderedFirstFrame) {
            j = elapsedRealtime - renderFirstFrameTimePoint;
            j2 = renderFirstFrameTimePoint - prepareTimePoint;
        } else {
            j = elapsedRealtime - prepareTimePoint;
            j2 = elapsedRealtime - prepareTimePoint;
        }
        getExecutorService().LIZ(new Runnable() { // from class: X.ITv
            @Override // java.lang.Runnable
            public final void run() {
                SimDtReportServiceV2.m192reportVideoStop$lambda2(SimDtReportServiceV2.this, str, checkIfHasRenderedFirstFrame, z, resCallable, hashMap, j2, callable, networkBufferingStatus, sumOfAllNetworkBlockDurations, networkBlockCount, j, sumOfAllPauseSpans);
            }
        });
    }

    private final void reportBlock(String str, Callable<C46554IOw> callable, long j, String str2, boolean z, int i) {
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
        getExecutorService().LIZ(new ARunnableS0S2211100_8(callable, this, str, i, j, str2, z, 1));
    }

    /* renamed from: reportBlock$lambda-6 */
    public static final void m186reportBlock$lambda6(Callable callable, SimDtReportServiceV2 this$0, String str, boolean z, int i, long j, String endType) {
        C46554IOw LIZIZ;
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(endType, "$endType");
        if (callable != null) {
            LIZIZ = (C46554IOw) callable.call();
        } else {
            LIZIZ = this$0.pm.LIZIZ(str);
        }
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        this$0.pm.LJ(str, LIZIZ);
        if (LIZJ != null && LIZIZ != null) {
            LIZIZ.LIZLLL = i;
            IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
            if (iPlayerEventReporter == null) {
                return;
            }
            iPlayerEventReporter.LJ(LIZJ, LIZIZ, j, endType, z);
        }
    }

    /* renamed from: reportRenderFirstFrame$lambda-1 */
    public static final void m188reportRenderFirstFrame$lambda1(SimDtReportServiceV2 this$0, String str, Callable callable, long j, long j2, boolean z, Callable resCallable, HashMap hashMap) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(callable, "$callable");
        o.LJIIIZ(resCallable, "$resCallable");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        IT2 videoFirstFrameInfo = (IT2) callable.call();
        ITA ita = this$0.pm;
        o.LJIIIIZZ(videoFirstFrameInfo, "videoFirstFrameInfo");
        ita.LIZLLL(str, videoFirstFrameInfo);
        int i = (int) (j - j2);
        videoFirstFrameInfo.LJ = i;
        IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
        if (iPlayerEventReporter != null) {
            iPlayerEventReporter.LJII(videoFirstFrameInfo, LIZJ);
        }
        if (z && this$0.checkIfNeed2CallResponseFunc()) {
            HashMap hashMap2 = (HashMap) resCallable.call();
            IRV irv = new IRW(0).LIZ;
            irv.LIZIZ = 1;
            irv.LIZ = 1;
            irv.LIZ(hashMap);
            irv.LIZ(hashMap2);
            this$0.reportVideoResponse(str, i, irv);
        }
    }

    /* renamed from: reportPlayFailed$lambda-3 */
    public static final void m187reportPlayFailed$lambda3(SimDtReportServiceV2 this$0, String str, long j, boolean z, boolean z2, Callable resCallable, HashMap hashMap, long j2, Callable callable) {
        IPlayerEventReporter iPlayerEventReporter;
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(resCallable, "$resCallable");
        o.LJIIIZ(callable, "$callable");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        if (j > 0 && !z && z2 && this$0.checkIfNeed2CallResponseFunc()) {
            HashMap hashMap2 = (HashMap) resCallable.call();
            IRV irv = new IRW(0).LIZ;
            irv.LIZIZ = 0;
            irv.LIZ = 0;
            irv.LIZ(hashMap);
            irv.LIZ(hashMap2);
            this$0.reportVideoResponse(str, (int) (j2 - j), irv);
        }
        IPA ipa = (IPA) callable.call();
        if (LIZJ == null || ipa == null || (iPlayerEventReporter = this$0.reporter) == null) {
            return;
        }
        iPlayerEventReporter.LJIILJJIL(ipa, LIZJ);
    }

    /* renamed from: reportVideoStop$lambda-2 */
    public static final void m192reportVideoStop$lambda2(SimDtReportServiceV2 this$0, String str, boolean z, boolean z2, Callable resCallable, HashMap hashMap, long j, Callable callable, boolean z3, long j2, int i, long j3, long j4) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(resCallable, "$resCallable");
        o.LJIIIZ(callable, "$callable");
        VideoInfo LIZJ = this$0.pm.LIZJ(str);
        if (!z && z2 && this$0.checkIfNeed2CallResponseFunc()) {
            HashMap hashMap2 = (HashMap) resCallable.call();
            IRV irv = new IRW(0).LIZ;
            irv.LIZIZ = 0;
            irv.LIZ(hashMap2);
            irv.LIZ(hashMap);
            this$0.reportVideoResponse(str, (int) j, irv);
        }
        C46648ISm c46648ISm = (C46648ISm) callable.call();
        c46648ISm.LJIIIZ = z3;
        Long valueOf = Long.valueOf(j2);
        if (valueOf != null) {
            c46648ISm.LJIILLIIL.put("total_net_buffer_time", valueOf);
        }
        Integer valueOf2 = Integer.valueOf(i);
        if (valueOf2 != null) {
            c46648ISm.LJIILLIIL.put("total_net_buffer_count", valueOf2);
        }
        if (LIZJ != null) {
            c46648ISm.LJ = j;
            if (j2 <= j4) {
                j2 = j4;
            }
            long j5 = j3 - j2;
            c46648ISm.LIZJ = j5;
            if (j5 <= 0) {
                j5 = 0;
            }
            c46648ISm.LIZJ = j5;
            IPlayerEventReporter iPlayerEventReporter = this$0.reporter;
            if (iPlayerEventReporter != null) {
                iPlayerEventReporter.LJIILL(str, LIZJ, c46648ISm);
            }
            this$0.pm.LJII(str);
        }
    }
}
