package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler", f = "CutOptimizedVideoChosenHandler.kt", l = {756, 772}, m = "downloadTemplate")
/* renamed from: X.H7h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43549H7h extends C3CS {
    public C43544H7c LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public boolean LJLJL;
    public long LJLJLJ;
    public /* synthetic */ Object LJLJLLL;
    public final /* synthetic */ C43544H7c LJLL;
    public int LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43549H7h(C43544H7c c43544H7c, InterfaceC67352kd<? super C43549H7h> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLL = c43544H7c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLLL = obj;
        this.LJLLI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLL.LJIIJ(null, false, false, null, null, this);
    }
}
