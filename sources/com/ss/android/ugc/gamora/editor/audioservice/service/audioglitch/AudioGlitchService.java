package com.ss.android.ugc.gamora.editor.audioservice.service.audioglitch;

import X.C168396jD;
import X.C168406jE;
import X.C168586jW;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.services.audio.IAudioGlitchService;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AudioGlitchService implements IAudioGlitchService {
    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void enableRecordGlitchInShootScene(VEAudioCapture veAudioCapture, boolean z) {
        o.LJIIIZ(veAudioCapture, "veAudioCapture");
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void getRecordGlitchAndReportInShootScene(VEAudioCapture veAudioCapture) {
        o.LJIIIZ(veAudioCapture, "veAudioCapture");
    }

    public static IAudioGlitchService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IAudioGlitchService.class, false);
        if (LIZ != null) {
            return (IAudioGlitchService) LIZ;
        }
        if (C58096Mr6.w8 == null) {
            synchronized (IAudioGlitchService.class) {
                if (C58096Mr6.w8 == null) {
                    C58096Mr6.w8 = new AudioGlitchService();
                }
            }
        }
        return C58096Mr6.w8;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void startDevicesChangedListener() {
        C168586jW.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void stopDevicesChangedListener() {
        C168586jW.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void enablePlayGlitchInShootScene(VERecorder veRecorder, boolean z) {
        o.LJIIIZ(veRecorder, "veRecorder");
        if (!C168406jE.LIZ()) {
            return;
        }
        veRecorder.LIZIZ.enableAudioPlayGlitchMetrics(z);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioGlitchService
    public final void getPlayGlitchAndReportInShootScene(CreativeModel creativeModel, VERecorder veRecorder, boolean z, String creationId) {
        int i;
        o.LJIIIZ(creativeModel, "creativeModel");
        o.LJIIIZ(veRecorder, "veRecorder");
        o.LJIIIZ(creationId, "creationId");
        if (!C168406jE.LIZ()) {
            return;
        }
        C168396jD audioPlayGlitchInfo = veRecorder.LIZIZ.getAudioPlayGlitchInfo();
        if (audioPlayGlitchInfo == null) {
            audioPlayGlitchInfo = new C168396jD();
            audioPlayGlitchInfo.LIZ = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C168396jD c168396jD = new C168396jD();
        c168396jD.LIZ = 0;
        C168586jW.LIZIZ(i, currentTimeMillis, creationId, audioPlayGlitchInfo, c168396jD, creativeModel, -1, "", "", "");
    }
}
