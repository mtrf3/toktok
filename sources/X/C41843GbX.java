package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.composer.task.ExtractSourceVideoCoverTask", f = "ExtractSourceVideoCoverTask.kt", l = {42, C61447O9r.LJIIJ, 51, 54, 71}, m = "runInternal")
/* renamed from: X.GbX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41843GbX extends C3CS {
    public C41842GbW LJLIL;
    public C41841GbV LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C41842GbW LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41843GbX(C41842GbW c41842GbW, InterfaceC67352kd<? super C41843GbX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c41842GbW;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, this);
    }
}
