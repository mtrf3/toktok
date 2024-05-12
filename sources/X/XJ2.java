package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
/* loaded from: classes16.dex */
public final class XJ2 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ XK4<E> LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XJ2(XK4<E> xk4, InterfaceC67352kd<? super XJ2> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = xk4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LJIILJJIL = this.LJLILLLLZI.LJIILJJIL(this);
        if (LJIILJJIL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIILJJIL;
        }
        return new C79973Bx(LJIILJJIL);
    }
}
