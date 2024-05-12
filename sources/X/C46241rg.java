package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {164}, m = "fetchRequestList")
/* renamed from: X.1rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46241rg extends C3CS {
    public C0EV LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C0EV LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46241rg(C0EV c0ev, InterfaceC67352kd<? super C46241rg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c0ev;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIIIZZ(0, this);
    }
}
