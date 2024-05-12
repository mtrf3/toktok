package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.util.GsonUtilHelper", f = "GsonUtilHelper.kt", l = {14}, m = "toJsonOnCoroutine")
/* renamed from: X.2fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64352fn extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C64342fm LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64352fn(C64342fm c64342fm, InterfaceC67352kd<? super C64352fn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c64342fm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
