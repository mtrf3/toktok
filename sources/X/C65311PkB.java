package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "retrofit2/KotlinExtensions", f = "KotlinExtensions.kt", l = {112, 119}, m = "suspendAndThrow")
/* renamed from: X.PkB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65311PkB extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public Object LJLJI;

    public C65311PkB(InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C65310PkA.LIZ(null, this);
    }
}
