package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAP implements InterfaceC84897XTp {
    public final /* synthetic */ HAF LIZ;
    public final /* synthetic */ Object LIZIZ;

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    public HAP(HAF haf, Object obj) {
        this.LIZ = haf;
        this.LIZIZ = obj;
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        long LIZ = this.LIZ.LIZJ.LIZ("download music", "success");
        HAE hae = this.LIZ.LIZ;
        C43619H9z c43619H9z = hae.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LJFF = (int) LIZ;
        }
        HAY hay = hae.LIZLLL;
        if (hay != null) {
            hay.LIZ((MusicModel) this.LIZIZ, musicFile, false);
        }
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        int i;
        long LIZ = this.LIZ.LIZJ.LIZ("download music", "failed.");
        C43619H9z c43619H9z = this.LIZ.LIZ.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LJFF = (int) LIZ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            c43619H9z.LJII = i;
        }
        HAE hae = this.LIZ.LIZ;
        C43619H9z c43619H9z2 = hae.LIZ;
        if (c43619H9z2 != null) {
            c43619H9z2.LJIIJ = str;
            c43619H9z2.LJIIIZ = 7;
        }
        HAY hay = hae.LIZLLL;
        if (hay != null) {
            hay.onFailed();
        }
    }
}
