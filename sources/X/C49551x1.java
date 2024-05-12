package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {533}, m = "onPostFling-RZ2iAVY")
/* renamed from: X.1x1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49551x1 extends C3CS {
    public C31811Mr LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C31811Mr LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49551x1(C31811Mr c31811Mr, InterfaceC67352kd<? super C49551x1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c31811Mr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(0L, 0L, this);
    }
}
