package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {223, 230, 233}, m = "selectSong")
/* renamed from: X.1te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47461te extends C3CS {
    public BGMPlaylistViewModel LJLIL;
    public MusicSong LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ BGMPlaylistViewModel LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47461te(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC67352kd<? super C47461te> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = bGMPlaylistViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.qv0(null, this);
    }
}
