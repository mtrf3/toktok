package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IXZ implements ISimPlayerConfig {
    public final ISimPlayerConfig LIZ;

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void downloadFile(String str, String str2, String str3, String str4) {
        this.LIZ.downloadFile(str, str2, str3, "legacy_video_thumb");
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getAverageSpeedInKBps() {
        return this.LIZ.getAverageSpeedInKBps();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC46772IXg getBindCpuCore() {
        return InterfaceC46772IXg.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C46999IcV getISimPlayerPlaySessionConfig(boolean z) {
        return this.LIZ.getISimPlayerPlaySessionConfig(z);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final C47282Ih4 getPlayerConfig(ITZ itz, boolean z, boolean z2) {
        return this.LIZ.getPlayerConfig(itz, false, z2);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final EnumC47177IfN getProperResolution(String str, InterfaceC46867IaN interfaceC46867IaN) {
        return this.LIZ.getProperResolution(str, interfaceC46867IaN);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final SimVideoUrlModel getVideoPlayAddr(SimVideo simVideo, ITZ itz) {
        return this.LIZ.getVideoPlayAddr(simVideo, itz);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        return this.LIZ.isCache(simVideoUrlModel);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isHttpsVideoUrlModel(SimVideoUrlModel simVideoUrlModel) {
        return this.LIZ.isHttpsVideoUrlModel(simVideoUrlModel);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPluginApplied() {
        return this.LIZ.isPluginApplied();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final /* synthetic */ boolean perfEventEnabledInPlayRequest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        this.LIZ.recordMiscLog(context, "video_playq", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC46770IXe createAudioUrlProcessor() {
        InterfaceC46770IXe createAudioUrlProcessor = this.LIZ.createAudioUrlProcessor();
        if (createAudioUrlProcessor != null) {
            return createAudioUrlProcessor;
        }
        ArrayList arrayList = new ArrayList();
        if (C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHooks() != null) {
            List<IY4> videoUrlHooks = C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHooks();
            o.LJIIIIZZ(videoUrlHooks, "get().config.commonConfig.videoUrlHooks");
            arrayList.addAll(videoUrlHooks);
        }
        if (C1DG.LIZ().getConfig().getPreloaderExperiment().PreloadTypeExperiment() == EnumC47317Ihd.VideoCache) {
            arrayList.add(new IY8(C47242IgQ.LIZ()));
        } else {
            arrayList.add(new IY7(C47242IgQ.LIZ(), C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHookHook()));
        }
        return new C46776IXk(arrayList, C1DG.LIZ().getConfig().getCommonConfig().getDefaultCDNTimeoutTime());
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC46771IXf createSubUrlProcessor() {
        InterfaceC46771IXf createSubUrlProcessor = this.LIZ.createSubUrlProcessor();
        if (createSubUrlProcessor != null) {
            return createSubUrlProcessor;
        }
        ArrayList arrayList = new ArrayList();
        if (C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHooks() != null) {
            List<IY4> videoUrlHooks = C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHooks();
            o.LJIIIIZZ(videoUrlHooks, "get().config.commonConfig.videoUrlHooks");
            arrayList.addAll(videoUrlHooks);
        }
        if (C1DG.LIZ().getConfig().getPreloaderExperiment().PreloadTypeExperiment() == EnumC47317Ihd.VideoCache) {
            arrayList.add(new IY8(C47242IgQ.LIZ()));
        } else {
            arrayList.add(new IY7(C47242IgQ.LIZ(), C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHookHook()));
        }
        return new C46787IXv(arrayList, C1DG.LIZ().getConfig().getCommonConfig().getDefaultCDNTimeoutTime());
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final IY2 createVideoUrlProcessor() {
        IY2 createVideoUrlProcessor = this.LIZ.createVideoUrlProcessor();
        if (createVideoUrlProcessor != null) {
            return createVideoUrlProcessor;
        }
        return C46733IVt.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableByteVc1FailCheckCountPolicy() {
        return this.LIZ.enableByteVc1FailCheckCountPolicy();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableForceUseH264CheckPolicy() {
        return this.LIZ.enableForceUseH264CheckPolicy();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableForceUseH264Global() {
        return this.LIZ.enableForceUseH264Global();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getPlayerType() {
        return this.LIZ.getPlayerType();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final InterfaceC46774IXi getPreRenderConfig() {
        InterfaceC46774IXi preRenderConfig = this.LIZ.getPreRenderConfig();
        o.LJIIIIZZ(preRenderConfig, "iSimPlayerConfig.preRenderConfig");
        return preRenderConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final int getTTPlayerPlan() {
        return this.LIZ.getTTPlayerPlan();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPlayerPreferchCaption() {
        return this.LIZ.isPlayerPreferchCaption();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return this.LIZ.isPlayerPreferchTtsAudio();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean perfEventEnabled() {
        return this.LIZ.perfEventEnabled();
    }

    public IXZ(ISimPlayerConfig iSimPlayerConfig) {
        o.LJIIIZ(iSimPlayerConfig, "iSimPlayerConfig");
        this.LIZ = iSimPlayerConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean disableSleepResume(String str) {
        return this.LIZ.disableSleepResume(str);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean enableFileIoOpt(String str) {
        return this.LIZ.enableFileIoOpt(str);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final String getThumbCacheDir(Context context) {
        return this.LIZ.getThumbCacheDir(context);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final IXY getProcessUrlData(SimVideoUrlModel simVideoUrlModel, String str) {
        SimBitRate simBitRate = null;
        if (simVideoUrlModel == null) {
            return null;
        }
        InterfaceC46732IVs LIZ = C47242IgQ.LIZ();
        if (LIZ != null && simVideoUrlModel.getBitRate() != null && simVideoUrlModel.getBitRate().size() != 0 && !TextUtils.isEmpty(str)) {
            Iterator<SimBitRate> it = simVideoUrlModel.getBitRate().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SimBitRate next = it.next();
                if (LIZ.getCacheSizeByCustomPath(next.getUrlKey(), str) > 0) {
                    simBitRate = next;
                    break;
                }
            }
        }
        IXY ixy = new IXY();
        if (simBitRate != null && !TextUtils.isEmpty(simBitRate.getUrlKey()) && simBitRate.urlList() != null && simBitRate.urlList().size() > 0) {
            ixy.LIZ = ListProtector.get(simBitRate.urlList(), 0);
            ixy.LJ = simBitRate.getUrlKey();
            ixy.LJFF = simBitRate.getChecksum();
            ixy.LJIJ = new String[simBitRate.urlList().size()];
            simBitRate.urlList().toArray(ixy.LJIJ);
            ixy.LIZJ = simBitRate.getCodecType();
            ixy.LIZLLL = new IXX(simBitRate.getBitRate(), simBitRate.getGearName(), simBitRate.getQualityType(), simBitRate.isBytevc1(), simBitRate.getUrlKey(), simBitRate.urlList(), simBitRate.getChecksum(), simBitRate.getSize(), simBitRate.getSimVideoExtra(), simBitRate.getHdrType(), simBitRate.getHdrBit());
        } else {
            ixy.LJ = simVideoUrlModel.getUrlKey();
            ixy.LJFF = simVideoUrlModel.getFileCheckSum();
            ixy.LJIJ = new String[simVideoUrlModel.getUrlList().size()];
            simVideoUrlModel.getUrlList().toArray(ixy.LJIJ);
            ixy.LIZJ = simVideoUrlModel.getCodecType();
            ixy.LIZ = ListProtector.get(simVideoUrlModel.getUrlList(), 0);
            ixy.LIZLLL = new IXX((int) simVideoUrlModel.getSize(), "", -1, simVideoUrlModel.getCodecType(), simVideoUrlModel.getUrlKey(), simVideoUrlModel.getUrlList(), simVideoUrlModel.getFileCheckSum(), (int) simVideoUrlModel.getSize(), null, -1, -1);
        }
        return ixy;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final boolean isCacheAboveOrComplete(SimVideoUrlModel simVideoUrlModel, int i) {
        return this.LIZ.isCacheAboveOrComplete(simVideoUrlModel, i);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final IXY getDashProcessUrlData(String str, boolean z, long j) {
        int i;
        IXY ixy = new IXY();
        InterfaceC46631IRv superResolutionStrategy = C1DG.LIZ().getConfig().getCommonConfig().getSuperResolutionStrategy();
        if (z && superResolutionStrategy != null) {
            i = superResolutionStrategy.LJ(str, j);
            if (i == 100) {
                ixy.LJIIIIZZ = true;
            }
        } else {
            i = 1;
        }
        Session LJ = C46664ITc.LJIJ.LJ(str);
        if (LJ != null) {
            boolean z2 = ixy.LJIIIIZZ;
            if (z2) {
                i = 100;
            }
            LJ.preSuperResolution = i;
            LJ.isOpenSuperResolution = z2;
        }
        return ixy;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordFirstFrameTime(String str, long j, String str2, boolean z, int i) {
        this.LIZ.onRecordFirstFrameTime(str, j, str2, z, i);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordPrepareTime(String str, long j, String str2, boolean z, int i) {
        this.LIZ.onRecordPrepareTime(str, j, str2, z, i);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2) {
        this.LIZ.onRecordFirstFrameTime(str, j, str2, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public final void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2) {
        this.LIZ.onRecordPrepareTime(str, j, str2, z, z2);
    }
}
