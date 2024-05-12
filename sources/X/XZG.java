package X;

import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class XZG {
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public Boolean LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public MusicModel LJIIL;
    public StsAssetModel LJIILIIL;
    public boolean LJIILJJIL;
    public final ArrayList<MusicModel> LIZ = new ArrayList<>(31);
    public String LIZIZ = "";
    public final XTW LJII = new XTW();
    public MusicModel LJIIJ = new MusicModel();
    public String LJIIJJI = "";

    public XZG() {
        MusicModel musicModel = new MusicModel();
        musicModel.setMusicId("");
        musicModel.setName(C86V.LJFF(R.string.rhu));
        musicModel.setMusicType(MusicModel.MusicType.SPEECH2SONG);
        musicModel.setMusicStatus(10);
        this.LJIIL = musicModel;
    }
}
