package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {204}, m = "fetchLibrarySongListByTab")
/* renamed from: X.1rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46211rd extends C3CS {
    public C0EV LJLIL;
    public long LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C0EV LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46211rd(C0EV c0ev, InterfaceC67352kd<? super C46211rd> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c0ev;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJFF(0L, 0, this);
    }
}
