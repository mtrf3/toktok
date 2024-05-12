package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HON implements IAVTransformService {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r7 == null) goto L18;
     */
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig parseUploadVideoConfig(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r0 = "sdkV4AuthKey"
            r2 = r16
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.EQd r0 = r0.getNetworkService()
            com.google.gson.Gson r1 = r0.getRetrofitFactoryGson()
            java.lang.Class<com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig> r0 = com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig.class
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r0 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r0
            com.ss.android.ugc.aweme.publish.model.UploadVideoConfig r0 = r0.videoConfig
            com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig r1 = new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig
            if (r0 == 0) goto L54
            int r2 = r0.maxFailTime
            int r3 = r0.sliceSize
        L25:
            r4 = 0
            if (r0 == 0) goto L2a
            java.lang.String r4 = r0.fileHostName
        L2a:
            java.lang.String r8 = ""
            if (r4 != 0) goto L2f
            r4 = r8
        L2f:
            if (r0 == 0) goto L35
            java.lang.String r5 = r0.videoHostName
            if (r5 != 0) goto L38
        L35:
            r5 = r8
            if (r0 == 0) goto L52
        L38:
            int r6 = r0.sliceTimeout
            java.lang.String r7 = r0.appKey
            if (r7 != 0) goto L3f
        L3e:
            r7 = r8
        L3f:
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.authorization
            if (r0 != 0) goto L50
        L45:
            r9 = 0
            r13 = 1920(0x780, float:2.69E-42)
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L50:
            r8 = r0
            goto L45
        L52:
            r6 = 0
            goto L3e
        L54:
            r2 = 0
            r3 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HON.parseUploadVideoConfig(java.lang.String):com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig");
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void audio2wavebean(String audioPath, IAVTransformService.ITransformCallback<MusicWaveBean> callback) {
        o.LJIIIZ(audioPath, "audioPath");
        o.LJIIIZ(callback, "callback");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = true;
        c43939HMh.LIZIZ = new AqS74S1100000_7(audioPath, (String) callback, (IAVTransformService.ITransformCallback<MusicWaveBean>) 22);
        c43939HMh.LIZ = new AqS157S0100000_7(callback, (IAVTransformService.ITransformCallback<MusicWaveBean>) 740);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void video2gif(VideoShare2GifEditContext context, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback<Boolean> iTransformCallback) {
        o.LJIIIZ(context, "context");
        HOO hoo = new HOO(context, iTransformProgress, iTransformCallback);
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = true;
        c43939HMh.LIZIZ = new AqS154S0200000_7(context, hoo, 139);
        c43939HMh.LIZ = new AqS157S0100000_7(iTransformCallback, (IAVTransformService.ITransformCallback<MusicWaveBean>) 741);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService
    public final void video2webp(String inputPath, String outputPath, int i, int i2, IAVTransformService.ITransformCallback<Integer> iTransformCallback, IAVTransformService.ITransformProgress iTransformProgress) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = true;
        c43939HMh.LIZIZ = new HOP(inputPath, outputPath, i, i2, iTransformCallback, iTransformProgress);
        c43939HMh.LIZ = new AqS157S0100000_7(iTransformCallback, (IAVTransformService.ITransformCallback<MusicWaveBean>) 742);
        c43939HMh.LIZ();
    }
}
