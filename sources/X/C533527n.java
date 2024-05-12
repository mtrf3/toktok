package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {600}, m = "withTimeoutOrNull")
/* renamed from: X.27n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533527n<T> extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C44251oT<Object> LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533527n(C44251oT<Object> c44251oT, InterfaceC67352kd<? super C533527n> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c44251oT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJIIJ(0L, null, this);
    }
}
