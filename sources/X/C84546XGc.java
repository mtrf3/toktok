package X;

import Y.IDfS27S0200000_15;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.mota.runner.general.SourceRunner$run$$inlined$map$1$2", f = "SourceRunner.kt", l = {136}, m = "emit")
/* renamed from: X.XGc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84546XGc extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS27S0200000_15 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84546XGc(IDfS27S0200000_15 iDfS27S0200000_15, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS27S0200000_15;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
