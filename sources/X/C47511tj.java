package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel", f = "BGMSongListViewModel.kt", l = {154}, m = "loadMoreFavoriteSongs")
/* renamed from: X.1tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47511tj extends C3CS {
    public BGMSongListViewModel LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ BGMSongListViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47511tj(BGMSongListViewModel bGMSongListViewModel, InterfaceC67352kd<? super C47511tj> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = bGMSongListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.kv0(this);
    }
}
