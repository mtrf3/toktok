package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository", f = "BGMPlaylistRepository.kt", l = {124}, m = "removeSong$liveeffect_impl_release")
/* renamed from: X.21V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21V extends C3CS {
    public C14320hI LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C14320hI LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21V(C14320hI c14320hI, InterfaceC67352kd<? super C21V> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c14320hI;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIIZ(0, this);
    }
}
