package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {68}, m = "fetchRemoteTabs")
/* renamed from: X.1rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46231rf extends C3CS {
    public C0EV LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C0EV LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46231rf(C0EV c0ev, InterfaceC67352kd<? super C46231rf> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c0ev;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJII(this);
    }
}
