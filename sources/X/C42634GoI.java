package X;

import Y.AgS124S0100000_7;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;

/* renamed from: X.GoI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42634GoI<T> implements InterfaceC86003Zc {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = false;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;

    public C42634GoI(long j, int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<SuggestMusicList> interfaceC73573Su9) {
        C10K LJJJJI;
        if (H92.LJ() && C19N.LJ("promote_should_use_new_recommend_list_api", true)) {
            PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
            if (C42622Go6.LIZJ(C42622Go6.LIZJ) != null) {
                LJJJJI = C42622Go6.LIZJ(C42622Go6.LIZJ);
            } else {
                IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
                int i = this.LJLIL;
                int i2 = this.LJLILLLLZI;
                boolean z = this.LJLJI;
                LJJJJI = LJJLIIIJJI.LJJJJI(this.LJLJJL, i, i2, this.LJLJJI, z);
            }
        } else {
            IMusicService LJJLIIIJJI2 = MusicService.LJJLIIIJJI();
            int i3 = this.LJLIL;
            int i4 = this.LJLILLLLZI;
            boolean z2 = this.LJLJI;
            LJJJJI = LJJLIIIJJI2.LJJJJI(this.LJLJJL, i3, i4, this.LJLJJI, z2);
        }
        if (LJJJJI != null) {
            LJJJJI.LIZLLL(new AgS124S0100000_7((C73433Srt) interfaceC73573Su9, 3));
        }
    }
}
