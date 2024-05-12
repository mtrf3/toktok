package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {55}, m = "updateKaraokeStatus")
/* renamed from: X.1ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46381ru extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C0EV LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46381ru(C0EV c0ev, InterfaceC67352kd<? super C46381ru> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c0ev;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJII(0, this, false);
    }
}
