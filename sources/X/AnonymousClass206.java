package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {260, 261}, m = "scroll")
/* renamed from: X.206, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass206 extends C3CS {
    public C32541Pm LJLIL;
    public C0SF LJLILLLLZI;
    public InterfaceC88471Ynr LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C32541Pm LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass206(C32541Pm c32541Pm, InterfaceC67352kd<? super AnonymousClass206> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c32541Pm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, null, this);
    }
}
