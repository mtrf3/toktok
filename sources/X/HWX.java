package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes8.dex */
public final class HWX implements HWI {
    public final /* synthetic */ HWR LJLIL;
    public final /* synthetic */ MusicModel LJLILLLLZI;

    @Override // X.HWI
    public final void LIZIZ() {
        String str;
        C84913XUf c84913XUf = this.LJLIL.LIZLLL;
        if (c84913XUf != null) {
            MusicModel musicModel = this.LJLILLLLZI;
            if (musicModel == null || (str = musicModel.getMusicId()) == null) {
                str = "";
            }
            c84913XUf.LIZ(str);
        }
    }

    public HWX(MusicModel musicModel, HWR hwr) {
        this.LJLIL = hwr;
        this.LJLILLLLZI = musicModel;
    }
}
