package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6h3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167056h3 extends AbstractC167066h4 {
    public final NLEModel LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public final long LJ;

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final Boolean getVoiceDetectCacheResult() {
        return this.LIZLLL.creativeModel.musicBuzModel.stsVoiceDetectResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getVoiceDetectPath(X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.services.audio.DetectionPathResult> r26) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167056h3.getVoiceDetectPath(X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final void setVoiceDetectCacheResult(boolean z) {
        this.LIZLLL.creativeModel.musicBuzModel.stsVoiceDetectResult = Boolean.valueOf(z);
    }

    public C167056h3(long j, NLEModel nleModel, VideoPublishEditModel publishEditModel) {
        o.LJIIIZ(nleModel, "nleModel");
        o.LJIIIZ(publishEditModel, "publishEditModel");
        this.LIZJ = nleModel;
        this.LIZLLL = publishEditModel;
        this.LJ = j;
    }
}
