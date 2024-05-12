package X;

import Y.IDfS133S0100000_13;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialogComposablesKt$BottomButtons$lambda$4$$inlined$map$1$2", f = "MixVideosDialogComposables.kt", l = {136}, m = "emit")
/* renamed from: X.V6v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79209V6v extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS133S0100000_13 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79209V6v(IDfS133S0100000_13 iDfS133S0100000_13, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS133S0100000_13;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
