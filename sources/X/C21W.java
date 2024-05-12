package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository", f = "BGMPlaylistRepository.kt", l = {136}, m = "requestRemoveSong")
/* renamed from: X.21W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21W extends C3CS {
    public C14320hI LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C14320hI LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21W(C14320hI c14320hI, InterfaceC67352kd<? super C21W> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c14320hI;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJIIJ(0L, this);
    }
}
