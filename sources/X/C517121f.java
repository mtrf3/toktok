package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListRepository", f = "BGMSongListRepository.kt", l = {104}, m = "loadMoreSongsById$liveeffect_impl_release")
/* renamed from: X.21f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C517121f extends C3CS {
    public C14410hR LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C14410hR LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517121f(C14410hR c14410hR, InterfaceC67352kd<? super C517121f> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c14410hR;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJI(0L, this);
    }
}
