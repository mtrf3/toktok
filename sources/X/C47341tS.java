package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {944, 950, 952}, m = "notifyCurrentTabUpdate")
/* renamed from: X.1tS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47341tS extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ KaraokeViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47341tS(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C47341tS> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = karaokeViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.sv0(this);
    }
}
