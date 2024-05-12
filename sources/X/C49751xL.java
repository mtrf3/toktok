package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {890}, m = "verticalDrag-jO51t88")
/* renamed from: X.1xL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49751xL extends C3CS {
    public InterfaceC88472Yns LJLIL;
    public InterfaceC37471dX LJLILLLLZI;
    public InterfaceC37471dX LJLJI;
    public C72242sW LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public int LJLJJLL;

    public C49751xL(InterfaceC67352kd<? super C49751xL> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0US.LJI(null, 0L, null, this);
    }
}
