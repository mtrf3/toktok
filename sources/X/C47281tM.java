package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {471, 473, 481, 489, 490}, m = "fetchQueueListForContinue")
/* renamed from: X.1tM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47281tM extends C3CS {
    public KaraokeViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ KaraokeViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47281tM(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C47281tM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = karaokeViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.lv0(this);
    }
}
