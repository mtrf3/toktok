package X;

import Y.IDfS125S0100000;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$handleAction$1$invokeSuspend$$inlined$collect$1", f = "KaraokeViewModel.kt", l = {136, 139, UserLevelGeckoUpdateSetting.DEFAULT, 141, 142, 143, 144, 145, 147, 149, 150, 151, 154, 156, 157, 158, 159, 161, 162}, m = "emit")
/* renamed from: X.1w3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48951w3 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS125S0100000 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48951w3(IDfS125S0100000 iDfS125S0100000, InterfaceC67352kd interfaceC67352kd) {
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
