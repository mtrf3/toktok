package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel", f = "ArtistMusicFeaturedVideoViewModel.kt", l = {125}, m = "requestAwemeList")
/* renamed from: X.9bJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239939bJ extends C3CS {
    public ArtistMusicFeaturedVideoViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ArtistMusicFeaturedVideoViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C239939bJ(ArtistMusicFeaturedVideoViewModel artistMusicFeaturedVideoViewModel, InterfaceC67352kd<? super C239939bJ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = artistMusicFeaturedVideoViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(this);
    }
}
