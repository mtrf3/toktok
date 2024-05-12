package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler", f = "CutOptimizedVideoChosenHandler.kt", l = {851, 856}, m = "downloadStickPointRes")
/* renamed from: X.H7j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43551H7j extends C3CS {
    public C43544H7c LJLIL;
    public Object LJLILLLLZI;
    public AVMusic LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C43544H7c LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43551H7j(C43544H7c c43544H7c, InterfaceC67352kd<? super C43551H7j> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c43544H7c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIIZ(null, null, null, false, this);
    }
}
