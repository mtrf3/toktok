package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {448, 452, 462}, m = "fetchAndParseLyric")
/* renamed from: X.1tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47271tL extends C3CS {
    public KaraokeViewModel LJLIL;
    public C279917z LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ KaraokeViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47271tL(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C47271tL> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = karaokeViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.kv0(null, this);
    }
}
