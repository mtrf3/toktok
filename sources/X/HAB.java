package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class HAB extends HA5 {
    public HAB(HAE hae) {
        super(hae);
    }

    @Override // X.InterfaceC43634HAo
    public final void LIZ(Object obj) {
        HA3 ha3;
        this.LIZJ.LIZIZ();
        HAE hae = this.LIZ;
        C43619H9z c43619H9z = hae.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LJIIJJI = 4;
        }
        if (hae.LJIIIIZZ != null && !TextUtils.isEmpty(hae.LJII) && C44687HgJ.LIZIZ(this.LIZ.LJII)) {
            long LIZ = this.LIZJ.LIZ("use shoot same music cache", "success");
            HAE hae2 = this.LIZ;
            C43619H9z c43619H9z2 = hae2.LIZ;
            if (c43619H9z2 != null) {
                c43619H9z2.LJFF = (int) LIZ;
            }
            HAY hay = hae2.LIZLLL;
            if (hay != null) {
                MusicModel musicModel = hae2.LJIIIIZZ;
                if (musicModel != null) {
                    String str = hae2.LJII;
                    if (str != null) {
                        hay.LIZ(musicModel, str, true);
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
        WeakReference<HA3> weakReference = this.LIZ.LJIIIZ;
        if (weakReference != null) {
            ha3 = weakReference.get();
        } else {
            ha3 = null;
        }
        if (ha3 != null && !C5WB.LIZ()) {
            HA4 preDownloadMusicData = ha3.getPreDownloadMusicData();
            if (preDownloadMusicData.LIZ()) {
                long LIZ2 = this.LIZJ.LIZ("use music cache", "success");
                HAE hae3 = this.LIZ;
                C43619H9z c43619H9z3 = hae3.LIZ;
                if (c43619H9z3 != null) {
                    c43619H9z3.LJFF = (int) LIZ2;
                }
                HAY hay2 = hae3.LIZLLL;
                if (hay2 != null) {
                    MusicModel musicModel2 = preDownloadMusicData.LIZ;
                    if (musicModel2 != null) {
                        String str2 = preDownloadMusicData.LIZIZ;
                        if (str2 != null) {
                            hay2.LIZ(musicModel2, str2, false);
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
        HAE hae4 = this.LIZ;
        if (hae4.LJIILJJIL) {
            HAY hay3 = hae4.LIZLLL;
            if (hay3 != null) {
                MusicModel musicModel3 = new MusicModel();
                musicModel3.setId(Long.MIN_VALUE);
                hay3.LIZ(musicModel3, "", false);
                return;
            }
            return;
        }
        HA5 ha5 = this.LIZIZ;
        if (ha5 != null) {
            ha5.LIZ(null);
        }
    }
}
