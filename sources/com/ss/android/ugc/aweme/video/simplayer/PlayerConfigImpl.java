package com.ss.android.ugc.aweme.video.simplayer;

import X.C00F;
import X.C16880lQ;
import X.C198517qh;
import X.C1DG;
import X.C39579Fg7;
import X.C46734IVu;
import X.C46982IcE;
import X.C47036Id6;
import X.C47242IgQ;
import X.C47281Ih3;
import X.C47282Ih4;
import X.C47483IkJ;
import X.C47497IkX;
import X.C64734Pas;
import X.EnumC47177IfN;
import X.EnumC47429IjR;
import X.FMX;
import X.FUA;
import X.IGO;
import X.ITZ;
import X.IWF;
import X.IXY;
import X.IY2;
import X.IYK;
import X.InterfaceC46770IXe;
import X.InterfaceC46771IXf;
import X.InterfaceC46772IXg;
import X.InterfaceC46774IXi;
import X.InterfaceC46867IaN;
import X.InterfaceC47040IdA;
import X.P8H;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class PlayerConfigImpl implements ISimPlayerConfig {
    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ InterfaceC46770IXe createAudioUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ InterfaceC46771IXf createSubUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ IY2 createVideoUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean disableSleepResume(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void downloadFile(String str, String str2, String str3, String str4) {
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean enableByteVc1FailCheckCountPolicy() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean enableFileIoOpt(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean enableForceUseH264CheckPolicy() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean enableForceUseH264Global() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public InterfaceC46772IXg getBindCpuCore() {
        return InterfaceC46772IXg.LIZ;
    }

    public /* bridge */ /* synthetic */ int getBitrateQuality() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ IXY getDashProcessUrlData(String str, boolean z, long j) {
        return null;
    }

    public /* bridge */ /* synthetic */ IGO getGlobalPlayListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ int getPlayerType() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ IXY getProcessUrlData(SimVideoUrlModel simVideoUrlModel, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ int getTTPlayerPlan() {
        return 0;
    }

    public /* bridge */ /* synthetic */ boolean ignoreExoReleaseState() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean isCacheAboveOrComplete(SimVideoUrlModel simVideoUrlModel, int i) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPluginApplied() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean isUseLastNetworkSpeed() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean perfEventEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public /* bridge */ /* synthetic */ boolean perfEventEnabledInPlayRequest() {
        return false;
    }

    public /* bridge */ /* synthetic */ InterfaceC47040IdA surfaceOptimizer() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public InterfaceC46774IXi getPreRenderConfig() {
        return new C47036Id6(this);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPlayerPreferchCaption() {
        if (C00F.LIZ(31744, 0, "player_prefetch_cla_caption", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isPlayerPreferchTtsAudio() {
        if (C00F.LIZ(31744, 0, "player_preferch_tts_audio", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public int getAverageSpeedInKBps() {
        return C47497IkX.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C46999IcV getISimPlayerPlaySessionConfig(boolean r9) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl.getISimPlayerPlaySessionConfig(boolean):X.IcV");
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public String getThumbCacheDir(Context context) {
        File LLIIIL;
        if (C39579Fg7.LJIILL()) {
            LLIIIL = C39579Fg7.LJII(context);
            if (P8H.LJIIJJI()) {
                LLIIIL = P8H.LJI(context, EnumC47429IjR.PREFER_EXTERNAL);
            }
        } else {
            LLIIIL = C16880lQ.LLIIIL(context);
            if (P8H.LJIIJJI()) {
                LLIIIL = P8H.LJI(context, EnumC47429IjR.PREFER_PRIVATE);
            }
        }
        File file = new File(LLIIIL, "cache/thumbs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        return C47242IgQ.LIZ().isCache(simVideoUrlModel);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public boolean isHttpsVideoUrlModel(SimVideoUrlModel simVideoUrlModel) {
        List<String> urlList;
        if (simVideoUrlModel == null || (urlList = simVideoUrlModel.getUrlList()) == null || urlList.size() <= 0) {
            return false;
        }
        Iterator<String> it = urlList.iterator();
        while (it.hasNext()) {
            if (!isCookieSharedUrl(C46982IcE.LIZ, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public EnumC47177IfN getProperResolution(String str, InterfaceC46867IaN interfaceC46867IaN) {
        C1DG.LIZ().LJFF().getClass();
        return IYK.LIZ.LJ(str, interfaceC46867IaN).LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public SimVideoUrlModel getVideoPlayAddr(SimVideo simVideo, ITZ itz) {
        if (simVideo != null) {
            if (shouldPlayInBytevc1(simVideo, itz)) {
                return simVideo.getPlayAddrBytevc1();
            }
            return simVideo.getPlayAddrH264();
        }
        return null;
    }

    public boolean isCookieSharedUrl(Context context, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("https://")) {
            return false;
        }
        try {
            if (C64734Pas.LJIIIZ(context).LIZLLL(URI.create(str).getHost()) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean shouldPlayInBytevc1(SimVideo simVideo, ITZ itz) {
        if (C46734IVu.LIZIZ(simVideo.getPlayAddrBytevc1()) && C46734IVu.LIZ(itz)) {
            return true;
        }
        return false;
    }

    private JSONObject getPrepareOrFirstFrameExtraJSON(long j, boolean z, int i) {
        C198517qh c198517qh = new C198517qh();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(j);
        LIZ.append("");
        c198517qh.LIZ.put("duration", X1D.LIZIZ(LIZ));
        c198517qh.LIZ(Boolean.valueOf(z), "is_cache");
        boolean z2 = true;
        if (1 != i) {
            z2 = false;
        }
        c198517qh.LIZ(Boolean.valueOf(z2), "bytevc1");
        c198517qh.LIZJ(Long.valueOf(IWF.LJJLIIIIJ().getDuration()), "video_duration");
        C47483IkJ.LIZ(c198517qh);
        return c198517qh.LJ();
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public C47282Ih4 getPlayerConfig(ITZ itz, boolean z, boolean z2) {
        return C47281Ih3.LJI(itz, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_recordMiscLog(context, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void onRecordFirstFrameTime(String str, long j, String str2, boolean z, int i) {
        MobClick obtain = MobClick.obtain();
        obtain.setEventName(str2);
        obtain.setLabelName("perf_monitor");
        obtain.setExtValueLong(j);
        FMX.onEvent(obtain);
        FUA.LIZJ(str, getPrepareOrFirstFrameExtraJSON(j, z, i));
    }

    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfig
    public void onRecordPrepareTime(String str, long j, String str2, boolean z, int i) {
        FUA.LIZJ(str, getPrepareOrFirstFrameExtraJSON(j, z, i));
    }
}
