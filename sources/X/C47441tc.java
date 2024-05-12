package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {193, 194, 197, 199}, m = "removeSong")
/* renamed from: X.1tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47441tc extends C3CS {
    public BGMPlaylistViewModel LJLIL;
    public MusicSong LJLILLLLZI;
    public MusicSong LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ BGMPlaylistViewModel LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47441tc(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC67352kd<? super C47441tc> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = bGMPlaylistViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.ov0(null, this);
    }
}
