package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListRepository", f = "BGMSongListRepository.kt", l = {128}, m = "loadMoreFavoriteSongs$liveeffect_impl_release")
/* renamed from: X.21e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C517021e extends C3CS {
    public C14410hR LJLIL;
    public long LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C14410hR LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517021e(C14410hR c14410hR, InterfaceC67352kd<? super C517021e> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c14410hR;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJFF(this);
    }
}
