package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel", f = "KaraokeViewModel.kt", l = {402, 407, 409}, m = "onLyricsStateChange")
/* renamed from: X.1tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47351tT extends C3CS {
    public KaraokeViewModel LJLIL;
    public boolean LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ KaraokeViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47351tT(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C47351tT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = karaokeViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.uv0(false, this);
    }
}