package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {313, 322, 456, 506}, m = "awaitDownAndSlop")
/* renamed from: X.1xQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49801xQ extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public C11P LJLJJLL;
    public int LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public /* synthetic */ Object LJLLI;
    public int LJLLILLLL;

    public C49801xQ(InterfaceC67352kd<? super C49801xQ> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLI = obj;
        this.LJLLILLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C0UN.LIZ(null, null, null, null, null, this);
    }
}
