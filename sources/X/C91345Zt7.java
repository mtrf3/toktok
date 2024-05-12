package X;

import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.BaseLyricsViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Zt7, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91345Zt7<T> implements InterfaceC64592gB {
    public final /* synthetic */ BaseLyricsViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Music LJLJJI;

    public C91345Zt7(int i, BaseLyricsViewModel baseLyricsViewModel, Music music, String str) {
        this.LJLIL = baseLyricsViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = music;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C91316Zse lyrics = (C91316Zse) obj;
        BaseLyricsViewModel baseLyricsViewModel = this.LJLIL;
        o.LJIIIIZZ(lyrics, "lyrics");
        ArrayList<C91077Zon> gv0 = baseLyricsViewModel.gv0(lyrics);
        baseLyricsViewModel.hv0(new C91075Zol(this.LJLJI, this.LJLILLLLZI, gv0), this.LJLJJI);
    }
}
