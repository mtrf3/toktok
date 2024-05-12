package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectRestoreManager$observeBeautyData$1$invokeSuspend$$inlined$collect$1", f = "LiveEffectRestoreManager.kt", l = {142}, m = "emit")
/* renamed from: X.1w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48931w1 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C1KT LJLJI;
    public C1KT LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48931w1(C1KT c1kt, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c1kt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
