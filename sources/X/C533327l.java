package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {628}, m = "withTimeout")
/* renamed from: X.27l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533327l<T> extends C3CS {
    public XKQ LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C44251oT<R> LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533327l(C44251oT<R> c44251oT, InterfaceC67352kd<? super C533327l> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c44251oT;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJJLIIJ(0L, null, this);
    }
}
