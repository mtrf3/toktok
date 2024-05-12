package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {129}, m = "fetchQueueList$liveeffect_impl_release")
/* renamed from: X.1re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46221re extends C3CS {
    public C0EV LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C0EV LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46221re(C0EV c0ev, InterfaceC67352kd<? super C46221re> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c0ev;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(0, this);
    }
}
