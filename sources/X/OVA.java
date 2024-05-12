package X;

import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes11.dex */
public final class OVA implements HWI {
    public final /* synthetic */ MusicShootAssem LJLIL;
    public final /* synthetic */ MusicModel LJLILLLLZI;

    @Override // X.HWI
    public final void LIZIZ() {
        C84913XUf c84913XUf = this.LJLIL.LLIFFJFJJ;
        if (c84913XUf != null) {
            c84913XUf.LIZ(this.LJLILLLLZI.getMusicId());
        }
    }

    public OVA(MusicShootAssem musicShootAssem, MusicModel musicModel) {
        this.LJLIL = musicShootAssem;
        this.LJLILLLLZI = musicModel;
    }
}
