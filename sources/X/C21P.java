package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository", f = "BGMPlaylistRepository.kt", l = {74}, m = "addSongs$liveeffect_impl_release")
/* renamed from: X.21P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21P extends C3CS {
    public C14320hI LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C14320hI LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21P(C14320hI c14320hI, InterfaceC67352kd<? super C21P> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c14320hI;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, this);
    }
}
