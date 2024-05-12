package X;

import Y.AgS124S0100000_7;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;

/* renamed from: X.GoN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42639GoN<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    public C42639GoN(String str, String str2, long j, int i, int i2, int i3, int i4, String str3, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = j;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = str4;
        this.LJLJLJ = i3;
        this.LJLJLLL = i4;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<SuggestMusicList> interfaceC73573Su9) {
        if (C1B8.LIZJ() && !C1DG.LJIIIIZZ()) {
            IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
            String str = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            String str3 = this.LJLJI;
            long j = this.LJLJJI;
            C10K LJJIIJ = LJJLIIIJJI.LJJIIJ(this.LJLJJL, this.LJLJJLL, C00F.LIZ(31744, 0, "enable_music_new_format", true), this.LJLJLJ, this.LJLJLLL, j, str, str2, str3, this.LJLJL);
            if (LJJIIJ != null) {
                LJJIIJ.LIZLLL(new AgS124S0100000_7((C73433Srt) interfaceC73573Su9, 17));
                return;
            }
            return;
        }
        interfaceC73573Su9.onError(new IllegalStateException("User state illegal, cancel upload request."));
    }
}
