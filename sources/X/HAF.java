package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAF extends HA5 {
    public HAF(HAE hae) {
        super(hae);
    }

    @Override // X.InterfaceC43634HAo
    public final void LIZ(Object obj) {
        this.LIZJ.LIZIZ();
        C43619H9z c43619H9z = this.LIZ.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LJIIJJI = 4;
        }
        if (obj instanceof MusicModel) {
            AVMusic transformMusicModel = C78934UyQ.LJLIL.getMusicService().transformMusicModel((MusicModel) obj);
            if (transformMusicModel == null) {
                long LIZ = this.LIZJ.LIZ("download music", "failed.");
                HAE hae = this.LIZ;
                C43619H9z c43619H9z2 = hae.LIZ;
                if (c43619H9z2 != null) {
                    c43619H9z2.LJFF = (int) LIZ;
                    c43619H9z2.LJIIJ = "avmusic model null";
                    c43619H9z2.LJIIIZ = 7;
                }
                HAY hay = hae.LIZLLL;
                if (hay != null) {
                    hay.onFailed();
                    return;
                }
                return;
            }
            C43619H9z c43619H9z3 = this.LIZ.LIZ;
            if (c43619H9z3 != null) {
                String musicId = transformMusicModel.getMusicId();
                o.LJIIIIZZ(musicId, "avMusic.musicId");
                c43619H9z3.LJI = musicId;
            }
            WeakReference<Activity> weakReference = this.LIZ.LIZIZ;
            Activity activity = null;
            if (weakReference == null || weakReference.get() == null) {
                long LIZ2 = this.LIZJ.LIZ("download music", "failed.");
                HAE hae2 = this.LIZ;
                C43619H9z c43619H9z4 = hae2.LIZ;
                if (c43619H9z4 != null) {
                    c43619H9z4.LJFF = (int) LIZ2;
                    c43619H9z4.LJIIJ = "activity is null";
                    c43619H9z4.LJIIIZ = 7;
                }
                HAY hay2 = hae2.LIZLLL;
                if (hay2 != null) {
                    hay2.onFailed();
                    return;
                }
                return;
            }
            IAnotherMusicService iAnotherMusicService = C44172HVg.LJI;
            WeakReference<Activity> weakReference2 = this.LIZ.LIZIZ;
            if (weakReference2 != null) {
                activity = weakReference2.get();
            }
            o.LJI(activity);
            iAnotherMusicService.LJIILL(activity, transformMusicModel, 6, false, new HAP(this, obj));
            return;
        }
        long LIZ3 = this.LIZJ.LIZ("download music", "failed.");
        HAE hae3 = this.LIZ;
        C43619H9z c43619H9z5 = hae3.LIZ;
        if (c43619H9z5 != null) {
            c43619H9z5.LJFF = (int) LIZ3;
            c43619H9z5.LJIIJ = "avmusic model type error";
            c43619H9z5.LJIIIZ = 7;
        }
        HAY hay3 = hae3.LIZLLL;
        if (hay3 != null) {
            hay3.onFailed();
        }
    }
}
