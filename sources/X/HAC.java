package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class HAC extends HA5 {
    public HAC(HAE hae) {
        super(hae);
    }

    @Override // X.InterfaceC43634HAo
    public final void LIZ(Object obj) {
        HA3 ha3;
        HA5 ha5;
        this.LIZJ.LIZIZ();
        HAE hae = this.LIZ;
        C43619H9z c43619H9z = hae.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LJIIJJI = 5;
        }
        WeakReference<HA3> weakReference = hae.LJIIIZ;
        if (weakReference != null) {
            ha3 = weakReference.get();
        } else {
            ha3 = null;
        }
        if (ha3 != null) {
            HA4 preDownloadMusicData = ha3.getPreDownloadMusicData();
            if (preDownloadMusicData.LIZ()) {
                long LIZ = this.LIZJ.LIZ("use music cache", "success");
                HAE hae2 = this.LIZ;
                C43619H9z c43619H9z2 = hae2.LIZ;
                if (c43619H9z2 != null) {
                    c43619H9z2.LJFF = (int) LIZ;
                }
                HAY hay = hae2.LIZLLL;
                if (hay != null) {
                    MusicModel musicModel = preDownloadMusicData.LIZ;
                    if (musicModel != null) {
                        String str = preDownloadMusicData.LIZIZ;
                        if (str != null) {
                            hay.LIZ(musicModel, str, false);
                            return;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                return;
            }
        }
        HAE hae3 = this.LIZ;
        if (hae3.LJIILJJIL) {
            HAY hay2 = hae3.LIZLLL;
            if (hay2 != null) {
                MusicModel musicModel2 = new MusicModel();
                musicModel2.setId(Long.MIN_VALUE);
                hay2.LIZ(musicModel2, "", false);
                return;
            }
            return;
        }
        MusicModel musicModel3 = hae3.LJIIJJI;
        if (musicModel3 != null && (ha5 = this.LIZIZ) != null) {
            ha5.LIZ(musicModel3);
        }
    }
}
