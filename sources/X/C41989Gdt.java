package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.VideoChosenResultFromAddSceneImpl", f = "VideoChosenResultFromAddSceneImpl.kt", l = {222, 230}, m = "compressVideoIfNeeded")
/* renamed from: X.Gdt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41989Gdt extends C3CS {
    public C41988Gds LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C41988Gds LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41989Gdt(C41988Gds c41988Gds, InterfaceC67352kd<? super C41989Gdt> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c41988Gds;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LJ(null, this);
    }
}
