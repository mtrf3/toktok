package X;

import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAA {
    public static final /* synthetic */ int LJI = 0;
    public final ActivityC45651qj LIZ;
    public final SafeHandler LIZIZ;
    public final HA3 LIZJ;
    public volatile boolean LIZLLL;
    public MvThemeData LJ;
    public final IAnotherMusicService LJFF;

    public HAA(ActivityC45651qj activity, WM7 wm7) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = new SafeHandler(C60903NvH.LJIIJJI().LJIL().LIZ(activity));
        this.LIZJ = C42273GiT.LIZ(activity, wm7);
        this.LJFF = (IAnotherMusicService) C60903NvH.LJIIJJI().LJJIJ();
    }

    public final HAD LIZIZ(C43619H9z c43619H9z, MusicModel musicModel, HAY hay, List list, String str) {
        HAE hae = new HAE(c43619H9z, new WeakReference(this.LIZ), null, hay, list, str, 960);
        hae.LJIIJJI = musicModel;
        HAD had = new HAD(hae);
        had.LIZIZ = new HAF(hae);
        return had;
    }

    public final HA5 LIZJ(C43619H9z c43619H9z, String str, String str2, boolean z, HAZ haz) {
        HAE hae = new HAE(c43619H9z, new WeakReference(this.LIZ), haz, null, null, null, 1016);
        hae.LJIIJ = str;
        HAG hag = new HAG(str2, hae);
        HAK hak = new HAK(str2, hae);
        HAJ haj = new HAJ(hae);
        HAL hal = new HAL(hae);
        hag.LIZIZ = hak;
        hak.LIZIZ = haj;
        haj.LIZIZ = hal;
        if (z) {
            HAH hah = new HAH(str2, hae);
            hah.LIZIZ = hag;
            return hah;
        }
        return hag;
    }

    public final HAB LIZ(C43619H9z c43619H9z, HA6 ha6, List list, String str, MvThemeData mvThemeData, String str2, MusicModel musicModel, IPhotoPreDownloadMusic iPhotoPreDownloadMusic, boolean z) {
        HA8 ha8 = new HA8(this, ha6, mvThemeData);
        HAE hae = new HAE(c43619H9z, new WeakReference(this.LIZ), null, ha8, list, str, null, str2, musicModel, new WeakReference(this.LIZJ));
        hae.LJIILIIL = iPhotoPreDownloadMusic;
        hae.LJIILJJIL = z;
        HAB hab = new HAB(hae);
        hab.LIZIZ = LIZIZ(c43619H9z, null, ha8, list, str);
        return hab;
    }
}
