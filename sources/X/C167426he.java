package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService", f = "VoiceDetectorService.kt", l = {52}, m = "doDetect")
/* renamed from: X.6he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167426he extends C3CS {
    public VoiceDetectorService LJLIL;
    public Object LJLILLLLZI;
    public VoiceDetectionParam LJLJI;
    public IVoiceDetectorConfig LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ VoiceDetectorService LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167426he(VoiceDetectorService voiceDetectorService, InterfaceC67352kd<? super C167426he> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = voiceDetectorService;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LIZIZ(null, null, null, this);
    }
}
