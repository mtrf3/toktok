package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {373}, m = "searchSong$liveeffect_impl_release")
/* renamed from: X.1rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46341rq extends C3CS {
    public C0EV LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C0EV LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46341rq(C0EV c0ev, InterfaceC67352kd<? super C46341rq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c0ev;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJJ(null, 0, this);
    }
}
