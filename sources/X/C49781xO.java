package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {392, 395}, m = "processDragStop")
/* renamed from: X.1xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49781xO extends C3CS {
    public C0UX LJLIL;
    public InterfaceC70422pa LJLILLLLZI;
    public C1N2 LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C0UX LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49781xO(C0UX c0ux, InterfaceC67352kd<? super C49781xO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c0ux;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, null, this);
    }
}
