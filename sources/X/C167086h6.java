package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.SpeechToSongVoiceDetectorConfig", f = "SpeechToSongVoiceDetectorConfig.kt", l = {115}, m = "getVoiceDetectPath")
/* renamed from: X.6h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167086h6 extends C3CS {
    public C167056h3 LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C167056h3 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167086h6(C167056h3 c167056h3, InterfaceC67352kd<? super C167086h6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c167056h3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.getVoiceDetectPath(this);
    }
}
