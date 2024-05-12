package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.creative.CreativeInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler", f = "CutOptimizedVideoChosenHandler.kt", l = {816, 820}, m = "resizeImage")
/* renamed from: X.H7k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43552H7k extends C3CS {
    public C43544H7c LJLIL;
    public CreativeInfo LJLILLLLZI;
    public Object LJLJI;
    public long LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C43544H7c LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43552H7k(C43544H7c c43544H7c, InterfaceC67352kd<? super C43552H7k> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c43544H7c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJIJJLI(null, null, false, false, false, this);
    }
}
