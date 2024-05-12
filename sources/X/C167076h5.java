package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.AutoMusicRecommendDetectorConfig", f = "AutoMusicRecommendDetectorConfig.kt", l = {78}, m = "getVoiceDetectPath")
/* renamed from: X.6h5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167076h5 extends C3CS {
    public C167046h2 LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C167046h2 LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167076h5(C167046h2 c167046h2, InterfaceC67352kd<? super C167076h5> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c167046h2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.getVoiceDetectPath(this);
    }
}
