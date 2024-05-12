package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl", f = "VideoChosenResultFromAddSceneImpl.kt", l = {248, 251}, m = "resizeImageIfNeeded")
/* renamed from: X.Gdr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41987Gdr extends C3CS {
    public C41988Gds LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C41988Gds LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41987Gdr(C41988Gds c41988Gds, InterfaceC67352kd<? super C41987Gdr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c41988Gds;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJFF(null, this);
    }
}
