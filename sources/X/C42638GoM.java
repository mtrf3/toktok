package X;

import Y.AgS124S0100000_7;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: X.GoM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42638GoM<T> implements InterfaceC86003Zc {
    public final /* synthetic */ int LJLIL = 0;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public C42638GoM(String str, boolean z, int i, int i2, String str2) {
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = i2;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<List<MusicModel>> interfaceC73573Su9) {
        IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        C10K LJJJJJL = LJJLIIIJJI.LJJJJJL(this.LJLJJL, i, this.LJLJI, i2, this.LJLJJI, this.LJLJJLL);
        if (LJJJJJL != null) {
            LJJJJJL.LIZLLL(new AgS124S0100000_7((C73433Srt) interfaceC73573Su9, 2));
        }
    }
}
