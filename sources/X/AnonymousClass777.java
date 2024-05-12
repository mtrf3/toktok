package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM", f = "InteractionBubbleListVM.kt", l = {167}, m = "onRefresh")
/* renamed from: X.777, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass777 extends C3CS {
    public InteractionBubbleListVM LJLIL;
    public C77H LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ InteractionBubbleListVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass777(InteractionBubbleListVM interactionBubbleListVM, InterfaceC67352kd<? super AnonymousClass777> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = interactionBubbleListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.onRefresh(this);
    }
}
