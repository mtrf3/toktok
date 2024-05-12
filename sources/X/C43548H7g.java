package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler", f = "CutOptimizedVideoChosenHandler.kt", l = {985, 993}, m = "compressVideo")
/* renamed from: X.H7g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43548H7g extends C3CS {
    public C43544H7c LJLIL;
    public C5W8 LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public VideoSegment LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public long LJLLI;
    public int LJLLILLLL;
    public /* synthetic */ Object LJLLJ;
    public final /* synthetic */ C43544H7c LJLLL;
    public int LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43548H7g(C43544H7c c43544H7c, InterfaceC67352kd<? super C43548H7g> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLL = c43544H7c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLJ = obj;
        this.LJLLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLL.LJI(null, null, false, false, false, false, false, this);
    }
}
