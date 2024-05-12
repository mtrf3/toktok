package X;

import Y.IDfS125S0100000;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {224}, m = "emit")
/* renamed from: X.24k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C525424k extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS125S0100000 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C525424k(IDfS125S0100000 iDfS125S0100000, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS125S0100000;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
