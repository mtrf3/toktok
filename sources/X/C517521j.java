package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {121}, m = "bringIntoView")
/* renamed from: X.21j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C517521j extends C3CS {
    public C10390ax LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C33661Tu LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517521j(C33661Tu c33661Tu, InterfaceC67352kd<? super C517521j> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c33661Tu;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LIZ(null, this);
    }
}
