package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.business.PublishShare$go$1", f = "PublishShare.kt", l = {173, 188}, m = "onChannelClickedPreShare")
/* renamed from: X.OeX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62413OeX extends C3CS {
    public C62393OeD LJLIL;
    public InterfaceC62225ObV LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C62393OeD LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62413OeX(C62393OeD c62393OeD, InterfaceC67352kd<? super C62413OeX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c62393OeD;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, null, null, this);
    }
}
