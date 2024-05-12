package X;

import Y.IDfS26S0200000_13;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {136, 136}, m = "emit")
/* renamed from: X.V1b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79059V1b extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public InterfaceC64672gJ LJLJI;
    public final /* synthetic */ IDfS26S0200000_13 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79059V1b(IDfS26S0200000_13 iDfS26S0200000_13, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = iDfS26S0200000_13;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.emit(null, this);
    }
}
