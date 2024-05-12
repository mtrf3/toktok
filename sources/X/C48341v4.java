package X;

import X.C0Q9;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {229, 261}, m = "animate")
/* renamed from: X.1v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48341v4<T, V extends C0Q9> extends C3CS {
    public C1JK LJLIL;
    public InterfaceC07130Pt LJLILLLLZI;
    public InterfaceC88472Yns LJLJI;
    public C68322mC LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public int LJLJJLL;

    public C48341v4(InterfaceC67352kd<? super C48341v4> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C07090Pp.LIZ(null, null, 0L, null, this);
    }
}
