package X;

import Y.ARunnableS10S0101000_6;
import android.os.Bundle;
import android.os.Handler;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HNO implements M5G {
    public final /* synthetic */ HNJ LIZ;

    public HNO(HNP hnp) {
        this.LIZ = hnp;
    }

    @Override // X.M5G
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        HNP hnp = (HNP) this.LIZ;
        hnp.LIZLLL.dismiss();
        C44018HPi.LJII(1504, false);
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS10S0101000_6(5, hnp.LJ, 13));
        if (hnp.LJFF) {
            hnp.LIZ.LIZLLL(e);
        } else {
            hnp.LIZ.LJ(new Bundle());
        }
    }

    @Override // X.M5G
    public final void onSuccess(MusicModel music, String path) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(music, "music");
        HNJ hnj = this.LIZ;
        new I9Q();
        AVMusic LIZ = I9Q.LIZ(music);
        o.LJI(LIZ);
        HNP hnp = (HNP) hnj;
        hnp.getClass();
        Bundle bundle = new Bundle();
        if (AVCommerceServiceImpl.LJIIJ().LIZ() && !LIZ.isCommerceMusic()) {
            hnp.LIZ.LJ(bundle);
            return;
        }
        H9H.LIZ(hnp.LIZIZ, path);
        LIZ.setMusicPriority(hnp.LIZJ);
        I9T.LJFF(LIZ);
        bundle.putSerializable("aweme_music", LIZ);
        bundle.putString("path", path);
        hnp.LIZ.LJ(bundle);
    }
}
