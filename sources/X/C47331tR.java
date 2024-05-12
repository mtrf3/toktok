package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {612, 613, 618, 619}, m = "notifyAudienceKaraokeState")
/* renamed from: X.1tR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47331tR extends C3CS {
    public KaraokeViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ KaraokeViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47331tR(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C47331tR> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = karaokeViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.rv0(false, this);
    }
}
