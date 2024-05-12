package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.prompt.PromptHistoryRepository$1", f = "PromptHistoryFragment.kt", l = {582}, m = "undo-gIAlu-s")
/* renamed from: X.9Ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237609Ue extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C237589Uc LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237609Ue(C237589Uc c237589Uc, InterfaceC67352kd<? super C237609Ue> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c237589Uc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LJJJ = this.LJLILLLLZI.LJJJ(0L, this);
        if (LJJJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJJJ;
        }
        return C3C5.m6boximpl(LJJJ);
    }
}
