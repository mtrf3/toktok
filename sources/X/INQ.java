package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.session.Session;

/* loaded from: classes9.dex */
public class INQ implements IXJ<IXY> {
    public final VideoUrlModel LIZ;
    public final Session LIZIZ;
    public final boolean LIZJ;

    @Override // X.IXJ
    public final /* synthetic */ IXY LIZ() {
        return null;
    }

    @Override // X.IXJ
    public final IXY get() {
        INO ino = INO.LIZJ;
        String urlKey = this.LIZ.getUrlKey();
        if (ino.LIZ == null) {
            C1DG.LIZ().LJ().getClass();
            ino.LIZ = new OHZ();
        }
        OHZ ohz = ino.LIZ;
        ino.LIZ(urlKey);
        ohz.getClass();
        return C46733IVt.LIZ().LIZJ(b.LJJIL(this.LIZ), this.LIZIZ.playerType, this.LIZJ);
    }

    public INQ(VideoUrlModel videoUrlModel, Session session, boolean z) {
        this.LIZ = videoUrlModel;
        this.LIZIZ = session;
        this.LIZJ = z;
    }
}
