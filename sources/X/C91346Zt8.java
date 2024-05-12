package X;

import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.BaseLyricsViewModel;
import com.ss.android.ugc.aweme.music.model.Music;

/* renamed from: X.Zt8, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91346Zt8<T> implements InterfaceC64592gB {
    public final /* synthetic */ BaseLyricsViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Music LJLJJI;

    public C91346Zt8(int i, BaseLyricsViewModel baseLyricsViewModel, Music music, String str) {
        this.LJLIL = baseLyricsViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = music;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        this.LJLIL.hv0(new C91075Zol(this.LJLJI, this.LJLILLLLZI, null), this.LJLJJI);
    }
}
