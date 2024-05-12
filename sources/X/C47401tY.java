package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {144, 145, 149}, m = "addSong")
/* renamed from: X.1tY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47401tY extends C3CS {
    public BGMPlaylistViewModel LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ BGMPlaylistViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47401tY(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC67352kd<? super C47401tY> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = bGMPlaylistViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(null, this);
    }
}
