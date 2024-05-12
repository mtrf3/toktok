package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", l = {555}, m = "performFling")
/* renamed from: X.1x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49611x7 extends C3CS {
    public C56K LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C31861Mw LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49611x7(C31861Mw c31861Mw, InterfaceC67352kd<? super C49611x7> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c31861Mw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, 0.0f, this);
    }
}
