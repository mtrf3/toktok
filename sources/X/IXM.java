package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IXM {
    public static boolean LIZ = true;

    public static int LIZLLL() {
        if (IUA.LIZ.LIZ().isPluginApplied() || C46982IcE.LIZ().isEnabled()) {
            return 1;
        }
        return 0;
    }

    public static IPlayerExperiment LIZ() {
        return IUB.LIZIZ();
    }

    public static int LJ(SimVideo simVideo) {
        if (simVideo == null || TextUtils.isEmpty(simVideo.getMeta()) || TextUtils.isEmpty("exp_sf")) {
            return -1;
        }
        try {
            String optString = IZG.from(simVideo.getMeta()).getJson().optString("exp_sf", "-1");
            if (TextUtils.isEmpty(optString)) {
                return -1;
            }
            return CastIntegerProtector.parseInt(optString);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r0 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel LJFF(com.ss.android.ugc.playerkit.simapicommon.model.SimVideo r3) {
        /*
            if (r3 == 0) goto L67
            boolean r0 = r3.isColdBoot()
            if (r0 == 0) goto L67
            r0 = 1
        L9:
            r2 = 0
            if (r0 == 0) goto L69
            X.5H3 r0 = X.IZ8.LLL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-COLD_BOOT_VIDEO_URL_SELECT_ENABLE>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L69
            X.5H3 r0 = X.IZ8.LLLI
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-COLD_BOOT_VIDEO_FORCE_H264>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L5b
            boolean r0 = r3.hasDashBitrate()
            if (r0 != 0) goto L42
            r3.setBitRate(r2)
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getH264PlayAddr()
            r0.setBitRate(r2)
        L42:
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r1 = r3.getH264PlayAddr()
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getPlayAddr()
            java.lang.String r0 = r0.getSourceId()
            r1.setSourceId(r0)
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getH264PlayAddr()
            LJII(r3, r0)
            if (r0 == 0) goto L69
        L5a:
            return r0
        L5b:
            X.ITZ r0 = X.ITZ.TT
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = X.C46767IXb.LIZ(r3, r0)
            if (r0 == 0) goto L69
            LJII(r3, r0)
            goto L5a
        L67:
            r0 = 0
            goto L9
        L69:
            X.5H3 r0 = X.IZ8.LLLZZIL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-enableOddOpt>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto Lb7
            boolean r1 = X.C46767IXb.LIZIZ()
        L80:
            if (r1 == 0) goto Lcb
            if (r3 == 0) goto Lcb
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getH264PlayAddr()
            if (r0 == 0) goto Lcb
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getPlayAddr()
            if (r0 == 0) goto Lcb
            boolean r0 = r3.hasDashBitrate()
            if (r0 != 0) goto La0
            r3.setBitRate(r2)
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getH264PlayAddr()
            r0.setBitRate(r2)
        La0:
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r1 = r3.getH264PlayAddr()
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getPlayAddr()
            java.lang.String r0 = r0.getSourceId()
            r1.setSourceId(r0)
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getH264PlayAddr()
            LJII(r3, r0)
            return r0
        Lb7:
            java.lang.Boolean r0 = X.C46767IXb.LIZIZ
            if (r0 == 0) goto Lc0
            boolean r1 = r0.booleanValue()
            goto L80
        Lc0:
            boolean r1 = X.C46767IXb.LIZIZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C46767IXb.LIZIZ = r0
            goto L80
        Lcb:
            com.ss.android.ugc.aweme.video.config.IPlayerExperiment r0 = LIZ()
            boolean r0 = r0.Bytevc1PlayAddrPolicyUnifyExperiment()
            if (r0 == 0) goto Le1
            X.ITZ r0 = X.ITZ.TT
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = X.C46767IXb.LIZ(r3, r0)
            if (r0 == 0) goto Lfd
            LJII(r3, r0)
            return r0
        Le1:
            if (r3 == 0) goto Lfd
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getPlayAddrBytevc1()
            boolean r0 = X.C46734IVu.LIZIZ(r0)
            if (r0 == 0) goto Lf5
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getPlayAddrBytevc1()
            LJII(r3, r0)
            return r0
        Lf5:
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r0 = r3.getPlayAddrH264()
            LJII(r3, r0)
            return r0
        Lfd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IXM.LJFF(com.ss.android.ugc.playerkit.simapicommon.model.SimVideo):com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel");
    }

    public static float LJI(SimVideo simVideo, String str) {
        if (simVideo == null || TextUtils.isEmpty(simVideo.getMeta()) || TextUtils.isEmpty(str)) {
            return Float.MIN_VALUE;
        }
        try {
            String optString = IZG.from(simVideo.getMeta()).getJson().optString(str, "");
            if (TextUtils.isEmpty(optString)) {
                return Float.MIN_VALUE;
            }
            return CastFloatProtector.parseFloat(optString);
        } catch (Exception unused) {
            return Float.MIN_VALUE;
        }
    }

    public static void LJII(SimVideo simVideo, SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null && simVideo != null) {
            simVideoUrlModel.setColdBoot(simVideo.isColdBoot());
            simVideoUrlModel.setMeta(simVideo.getMeta());
        }
    }

    public static IX4 LIZJ(SimVideo simVideo, boolean z, IWI iwi, int i, String str, boolean z2, EnumC47177IfN enumC47177IfN, boolean z3) {
        boolean z4;
        boolean isAsyncInit = LIZ().isAsyncInit();
        IXP ixp = new IXP(simVideo.getPlayAddr(), "", false, false, true);
        Application application = C46982IcE.LIZ;
        String sourceId = simVideo.getSourceId();
        IXN ixn = IXN.LIZJ;
        IX4 ix4 = new IX4(ixp, null, application, sourceId, z, iwi, false, 0, ixn.getRenderType(), null, simVideo.getVideoId(), z2, isAsyncInit, LIZ().get265DecodeType());
        ix4.LJJII = LIZ().frameWait();
        ix4.LJJIJLIJ = i;
        ix4.LJIJI = LIZLLL();
        ix4.LLII = LIZ().isDirectUrlCheckInfoEnable();
        boolean z5 = true;
        if (ixn.isUseVideoTextureRenderer() && z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        ix4.LJJJ = z4;
        if (!TextUtils.isEmpty(str)) {
            ix4.LJJJZ = str;
        }
        if (TextUtils.isEmpty(ix4.LJJJZ) && !TextUtils.isEmpty(iwi.getSubTag())) {
            ix4.LJJJZ = iwi.getSubTag();
        }
        IXO ixo = new IXO();
        ixo.LJ = simVideo.getVideoId();
        ixo.LJJI = simVideo.getVidPlayVersion();
        ixo.LJFF = simVideo.getVideoIdAuth();
        ixo.LJI = simVideo.getVideoIdPToken();
        ixo.LIZLLL = simVideo.getVideoIdApiHost();
        ixo.LJIILJJIL = C46982IcE.LIZIZ().defaultHost();
        ixo.LJII = String.valueOf(C46982IcE.LIZIZ().getAppID());
        ixo.LJIIIZ = EnumC47177IfN.SuperHigh;
        C46664ITc.LJIJ.LJIJ(simVideo.getSourceId(), simVideo.getVideoId());
        if (enumC47177IfN != null) {
            ixo.LJIIIZ = enumC47177IfN;
        }
        if (simVideo.enableIntertrustDrm()) {
            ixo.LJIIJJI = LIZ().enableIntertrust();
            ixo.LJIIL = LIZ().enableIntertrustDemotion();
        }
        ix4.LJJJJZI = ixo;
        if (LIZ().PlayeAbVIDDashHijackRetryEnableExp() != 1) {
            z5 = false;
        }
        ix4.LJJJIL = z5;
        IUB iub = IUA.LIZ;
        ix4.LJJL = iub.LIZ().getAverageSpeedInKBps();
        if (TextUtils.isEmpty(ix4.LJJJLZIJ) && !TextUtils.isEmpty(iwi.getTag())) {
            ix4.LJJJLZIJ = iwi.getTag();
        }
        if (LIZ) {
            LIZ = false;
            ix4.LJJJLZIJ = "nor";
        }
        ix4.LJJLIIIJILLIZJL = simVideo.getDuration();
        ix4.LJJLIIIJJI = Float.valueOf(LIZ().getVolLoudUnity());
        ix4.LJLI = LIZ().enableBufferTimeControl();
        ix4.LJLIIIL = LIZ().cacheDuration(simVideo.getDuration());
        ix4.LJLL = iub.LIZ().disableSleepResume(sourceId);
        ix4.LJJJJIZL = simVideo.isColdBoot();
        ix4.LJLJLLL = iub.LIZ().enableFileIoOpt(sourceId);
        ix4.LJLLI = LIZ().resumeFileIoBlockDurationThreshold();
        ix4.LJLLILLLL = LIZ().memCacheVideoDurationThreshold();
        return ix4;
    }

    public static IX4 LIZIZ(final SimVideoUrlModel simVideoUrlModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, String str, String str2, boolean z7, boolean z8, boolean z9, IWI iwi, C46745IWf c46745IWf) {
        String str3;
        boolean z10;
        boolean z11;
        if (simVideoUrlModel != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("createNormalPrepareData bit_rate_audio ");
            LIZ2.append(simVideoUrlModel.getAudioBitrate());
            LIZ2.append(" meta ");
            LIZ2.append(simVideoUrlModel.getMeta());
            LIZ2.append(" aid ");
            LIZ2.append(simVideoUrlModel.getSourceId());
            IXB.LIZIZ("SimPlayerHelper", X1D.LIZIZ(LIZ2));
        }
        IALog LIZ3 = C46982IcE.LIZ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("createNormalPrepareData aid:");
        if (simVideoUrlModel != null) {
            str3 = simVideoUrlModel.getSourceId();
        } else {
            str3 = "null";
        }
        LIZ4.append(str3);
        LIZ3.e("SimPlayerHelper", X1D.LIZIZ(LIZ4));
        boolean isAsyncInit = LIZ().isAsyncInit();
        if (simVideoUrlModel == null) {
            return null;
        }
        if (c46745IWf != null && c46745IWf.LJJLIIIJILLIZJL) {
            z10 = true;
        } else {
            z10 = false;
        }
        IXP ixp = new IXP(simVideoUrlModel, c46745IWf.LJJLIIJ, z4, z7, z10);
        IXJ ixj = new IXJ() { // from class: X.IUP
            @Override // X.IXJ
            public final /* synthetic */ Object LIZ() {
                return null;
            }

            @Override // X.IXJ
            public final Object get() {
                return Boolean.valueOf(IUA.LIZ.LIZ().isCache(SimVideoUrlModel.this));
            }
        };
        Application application = C46982IcE.LIZ;
        String sourceId = simVideoUrlModel.getSourceId();
        boolean isVr = simVideoUrlModel.isVr();
        int codecType = simVideoUrlModel.getCodecType();
        IXN ixn = IXN.LIZJ;
        boolean z12 = true;
        IX4 ix4 = new IX4(ixp, ixj, application, sourceId, z, iwi, isVr, codecType, ixn.getRenderType(), new IXJ() { // from class: X.IL5
            @Override // X.IXJ
            public final /* synthetic */ Object LIZ() {
                return null;
            }

            @Override // X.IXJ
            public final Object get() {
                Integer valueOf;
                SimVideoUrlModel simVideoUrlModel2 = SimVideoUrlModel.this;
                int i2 = -1;
                if (simVideoUrlModel2 != null) {
                    IYN hitBitrate = simVideoUrlModel2.getHitBitrate();
                    if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
                        valueOf = -1;
                    }
                    i2 = valueOf.intValue();
                }
                return Integer.valueOf(i2);
            }
        }, simVideoUrlModel.getUri(), !z2, isAsyncInit, LIZ().get265DecodeType());
        ix4.LJJII = LIZ().frameWait();
        String bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
        ix4.LJJIIJZLJL = bitRatedRatioUri;
        C46664ITc.LJIJ.LJIIZILJ(bitRatedRatioUri, simVideoUrlModel.getFileCheckSum());
        ix4.LJIJI = LIZLLL();
        ix4.LLII = LIZ().isDirectUrlCheckInfoEnable();
        if (!TextUtils.isEmpty(str)) {
            ix4.LJJJLZIJ = str;
        }
        if (TextUtils.isEmpty(ix4.LJJJLZIJ) && !TextUtils.isEmpty(iwi.getTag())) {
            ix4.LJJJLZIJ = iwi.getTag();
        }
        if (LIZ) {
            LIZ = false;
            if (z3) {
                ix4.LJJJLZIJ = "pre";
            } else {
                ix4.LJJJLZIJ = "nor";
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            ix4.LJJJZ = str2;
        }
        if (TextUtils.isEmpty(ix4.LJJJZ) && !TextUtils.isEmpty(iwi.getSubTag())) {
            ix4.LJJJZ = iwi.getSubTag();
        }
        if (!TextUtils.isEmpty(ix4.LJJJZ)) {
            simVideoUrlModel.setSubTag(ix4.LJJJZ);
        }
        IUB iub = IUA.LIZ;
        ix4.LJJL = iub.LIZ().getAverageSpeedInKBps();
        if (ixn.isUseVideoTextureRenderer() && z8) {
            z11 = true;
        } else {
            z11 = false;
        }
        ix4.LJJJ = z11;
        if (z5) {
            if (iub.LIZ().isHttpsVideoUrlModel(simVideoUrlModel)) {
                ix4.LJJJI = true;
            } else if (!IZ8.LJIIIZ()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("aid", simVideoUrlModel.getSourceId());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                C46982IcE.LJI().monitorCommonLog("need_set_token_exception", jSONObject);
            }
        }
        ix4.LJJJJJL = z6;
        ix4.LJJIJLIJ = i;
        if (LIZ().PlayeAbFixPrepareSeqTmpEnableExp() != 1) {
            z12 = false;
        }
        ix4.LJJJJLI = z12;
        ix4.LJJJJLL = z9;
        ix4.LJJLIIIIJ = simVideoUrlModel.getaK();
        ix4.LJJLIIIJILLIZJL = (int) simVideoUrlModel.getDuration();
        ix4.LJJLIIIJJIZ = Float.valueOf(LJI(c46745IWf.LIZJ, "loudness"));
        ix4.LJJLIIIJL = Float.valueOf(LJI(c46745IWf.LIZJ, "peak"));
        ix4.LJJLIIIJLJLI = LJ(c46745IWf.LIZJ);
        ix4.LLD = c46745IWf.LJJJLZIJ;
        ix4.LLF = c46745IWf.LJJLIIIIJ;
        ix4.LLFF = Long.valueOf(c46745IWf.LJJLIIIJ);
        ix4.LJJLIIIJJI = Float.valueOf(LIZ().getVolLoudUnity());
        ix4.LJLI = LIZ().enableBufferTimeControl();
        ix4.LJLIIIL = LIZ().cacheDuration((int) simVideoUrlModel.getDuration());
        IUB iub2 = IUA.LIZ;
        ix4.LJLL = iub2.LIZ().disableSleepResume(ix4.LJIIIZ);
        ix4.LJJJJIZL = simVideoUrlModel.isColdBoot();
        ix4.LJJJJL = simVideoUrlModel.getCdnUrlExpired();
        ix4.LJLJLLL = iub2.LIZ().enableFileIoOpt(ix4.LJIIIZ);
        ix4.LJLLI = LIZ().resumeFileIoBlockDurationThreshold();
        ix4.LJLLILLLL = LIZ().memCacheVideoDurationThreshold();
        ix4.LJLLJ = LIZ().enableSplitVideoAudioPlayback();
        ix4.LJJJJZ = simVideoUrlModel.isUseMdlAndVideoCache();
        return ix4;
    }
}
