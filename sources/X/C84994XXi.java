package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: X.XXi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84994XXi implements T5Q {
    public final /* synthetic */ C84995XXj LIZ;

    @Override // X.T5Q
    public final void LIZ() {
        MusicModel musicModel;
        C84995XXj c84995XXj = this.LIZ;
        c84995XXj.getClass();
        boolean z = c84995XXj.LL;
        List<MusicModel> list = c84995XXj.LJLZ;
        if (list != null) {
            musicModel = (MusicModel) ORZ.LJLLLLLL(c84995XXj.LJZ, list);
        } else {
            musicModel = null;
        }
        C2U8.LIZ(new XYA(musicModel, z ? 1 : 0));
    }

    public C84994XXi(C84995XXj c84995XXj) {
        this.LIZ = c84995XXj;
    }

    @Override // X.T5Q
    public final void LIZIZ(int i) {
        if (i == 1) {
            this.LIZ.Q();
        }
    }
}
