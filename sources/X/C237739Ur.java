package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.feed.prompt.PromptHistorySheetVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.prompt.PromptHistorySheetVM", f = "PromptHistoryFragment.kt", l = {550}, m = "undo-gIAlu-s")
/* renamed from: X.9Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237739Ur extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ PromptHistorySheetVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237739Ur(PromptHistorySheetVM promptHistorySheetVM, InterfaceC67352kd<? super C237739Ur> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = promptHistorySheetVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object gv0 = this.LJLILLLLZI.gv0(null, this);
        if (gv0 == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return gv0;
        }
        return C3C5.m6boximpl(gv0);
    }
}
