package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {382, 385, 387}, m = "processDragStart")
/* renamed from: X.1xN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49771xN extends C3CS {
    public C0UX LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public C1N1 LJLJI;
    public C1OB LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C0UX LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49771xN(C0UX c0ux, InterfaceC67352kd<? super C49771xN> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c0ux;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZIZ(null, null, this);
    }
}
