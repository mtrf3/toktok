package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM", f = "InteractionBubbleListVM.kt", l = {262}, m = "fetchCommentList")
/* renamed from: X.779, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass779 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InteractionBubbleListVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass779(InteractionBubbleListVM interactionBubbleListVM, InterfaceC67352kd<? super AnonymousClass779> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = interactionBubbleListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.hv0(null, this);
    }
}
