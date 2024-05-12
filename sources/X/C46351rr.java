package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {239}, m = "updateFavorite")
/* renamed from: X.1rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46351rr extends C3CS {
    public C0EV LJLIL;
    public C279917z LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C0EV LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46351rr(C0EV c0ev, InterfaceC67352kd<? super C46351rr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c0ev;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJJIFFI(null, false, this);
    }
}
