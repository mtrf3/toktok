package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {70}, m = "invoke$emitExit")
/* renamed from: X.1wQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49181wQ extends C3CS {
    public InterfaceC35811ar LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C49181wQ(InterfaceC67352kd<? super C49181wQ> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C49211wT.LIZIZ(null, null, this);
    }
}
