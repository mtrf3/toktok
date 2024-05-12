package com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection;

import X.C149595tz;
import X.C167416hd;
import X.C167436hf;
import X.C167446hg;
import X.C167486hk;
import X.C36636EZk;
import X.C48841JEv;
import X.C58096Mr6;
import X.X1D;
import X.XKX;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import defpackage.e1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VoiceDetectorService implements IVoiceDetectorService {
    public final C167446hg LIZ = new Object() { // from class: X.6hg
    };
    public final ConcurrentHashMap<Integer, C167436hf> LIZIZ = new ConcurrentHashMap<>();

    public static IVoiceDetectorService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IVoiceDetectorService.class, false);
        if (LIZ != null) {
            return (IVoiceDetectorService) LIZ;
        }
        if (C58096Mr6.x8 == null) {
            synchronized (IVoiceDetectorService.class) {
                if (C58096Mr6.x8 == null) {
                    C58096Mr6.x8 = new VoiceDetectorService();
                }
            }
        }
        return C58096Mr6.x8;
    }

    public final C167436hf LIZJ(int i) {
        C167436hf c167436hf = this.LIZIZ.get(Integer.valueOf(i));
        if (c167436hf == null) {
            C167436hf c167436hf2 = new C167436hf(0);
            this.LIZIZ.put(Integer.valueOf(i), c167436hf2);
            return c167436hf2;
        }
        return c167436hf;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void clearVoiceActivityDetection(Integer num) {
        if (num == null) {
            this.LIZIZ.clear();
        } else {
            this.LIZIZ.put(num, new C167436hf(0));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void setVoiceDetectionListener(int i, VoiceDetectionListener voiceDetectionListener) {
        C167436hf LIZJ = LIZJ(i);
        if (e1.LIZ(31744, "sts_aed_model_test", true, false) && i == 0) {
            if (voiceDetectionListener != null) {
                voiceDetectionListener.onVoiceActivityDetected(false, LIZJ.LIZIZ);
            }
        } else {
            Boolean bool = LIZJ.LIZ;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (voiceDetectionListener != null) {
                    voiceDetectionListener.onVoiceActivityDetected(booleanValue, LIZJ.LIZIZ);
                }
            }
            LIZJ.LIZJ = voiceDetectionListener;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService
    public final void startDetectVoiceActivity(VoiceDetectionParam param, IVoiceDetectorConfig config) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(config, "config");
        C167436hf LIZJ = LIZJ(param.getSourceType());
        LIZJ.LIZIZ = param.getTargetThresholds();
        boolean z = false;
        if (!C167486hk.LIZ() && param.getSourceType() == 0) {
            LIZJ.LIZ = Boolean.FALSE;
            VoiceDetectionListener voiceDetectionListener = LIZJ.LIZJ;
            if (voiceDetectionListener != null) {
                voiceDetectionListener.onVoiceActivityDetected(false, param.getTargetThresholds());
                return;
            }
            return;
        }
        if (!C149595tz.LIZ() && param.getSourceType() == 1) {
            LIZJ.LIZ = Boolean.TRUE;
            VoiceDetectionListener voiceDetectionListener2 = LIZJ.LIZJ;
            if (voiceDetectionListener2 != null) {
                voiceDetectionListener2.onVoiceActivityDetected(true, param.getTargetThresholds());
                return;
            }
            return;
        }
        Boolean voiceDetectCacheResult = config.getVoiceDetectCacheResult();
        if (voiceDetectCacheResult != null) {
            LIZJ.LIZ = voiceDetectCacheResult;
            VoiceDetectionListener voiceDetectionListener3 = LIZJ.LIZJ;
            if (voiceDetectionListener3 != null) {
                voiceDetectionListener3.onVoiceActivityDetected(voiceDetectCacheResult.booleanValue(), param.getTargetThresholds());
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("read result from cache, hasPass = ");
            LIZ.append(voiceDetectCacheResult);
            LIZ.append(", has callback = ");
            if (LIZJ.LIZJ != null) {
                z = true;
            }
            LIZ.append(z);
            X1D.LIZIZ(LIZ);
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C167416hd(config, LIZJ, param, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r34, com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam r35, com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig r36, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult> r37) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam, com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig, X.2kd):java.lang.Object");
    }
}
