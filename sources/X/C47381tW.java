package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {904}, m = "tryInterceptAction")
/* renamed from: X.1tW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47381tW extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47381tW(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C47381tW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.Av0(null, this);
    }
}