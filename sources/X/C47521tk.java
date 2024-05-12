package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel", f = "BGMSongListViewModel.kt", l = {131}, m = "loadMoreSongsById")
/* renamed from: X.1tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47521tk extends C3CS {
    public BGMSongListViewModel LJLIL;
    public long LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ BGMSongListViewModel LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47521tk(BGMSongListViewModel bGMSongListViewModel, InterfaceC67352kd<? super C47521tk> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = bGMSongListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.lv0(0L, this);
    }
}
