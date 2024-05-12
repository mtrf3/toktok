package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9W {
    public final ActivityC45651qj LIZ;
    public final ShortVideoContext LIZIZ;
    public final boolean LIZJ;
    public final FaceStickerBean LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final List<AVChallenge> LJI;
    public MusicModel LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public List<String> LJIIJ;

    public H9W(ActivityC45651qj activity, ShortVideoContext shortVideoContext, boolean z, FaceStickerBean faceStickerBean, long j, int i) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = activity;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = z;
        this.LIZLLL = faceStickerBean;
        this.LJ = j;
        this.LJFF = i;
        this.LJI = new ArrayList();
    }
}
