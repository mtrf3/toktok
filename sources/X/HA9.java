package X;

import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HA9 implements HAZ {
    public final C43619H9z LIZ;
    public final String LIZIZ;
    public final HA6 LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final MusicModel LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final IPhotoPreDownloadMusic LJIIIZ = null;
    public final HAX LJIIJ;
    public final /* synthetic */ HAA LJIIJJI;

    @Override // X.HAZ
    public final void onFailed() {
        HA6 ha6;
        if (!this.LJIIJJI.LIZLLL && (ha6 = this.LIZJ) != null) {
            ha6.onFailed();
        }
        this.LJIIJJI.LIZIZ.removeCallbacksAndMessages(null);
    }

    @Override // X.HAZ
    public final void LIZ(MvThemeData mvThemeData) {
        boolean z;
        o.LJIIIZ(mvThemeData, "mvThemeData");
        this.LJIIJJI.LJ = mvThemeData;
        String str = this.LIZIZ;
        HAM ham = new HAM();
        if (o.LJ("singlepiceffect", str)) {
            ham.LIZ(mvThemeData);
        } else if (o.LJ("slideshoweffect", str)) {
            ham.LIZIZ(mvThemeData);
        }
        HAA haa = this.LJIIJJI;
        C43619H9z c43619H9z = this.LIZ;
        HA6 ha6 = this.LIZJ;
        List<String> list = this.LIZLLL;
        String str2 = this.LJ;
        String str3 = this.LJFF;
        MusicModel musicModel = this.LJI;
        boolean z2 = this.LJII;
        String str4 = this.LJIIIIZZ;
        IPhotoPreDownloadMusic iPhotoPreDownloadMusic = this.LJIIIZ;
        HAX hax = this.LJIIJ;
        haa.getClass();
        if (hax.LIZ == 1) {
            z = true;
        } else {
            z = false;
        }
        if (C00F.LIZ(31744, 0, "studio_photo_ai_music_optimization", true) == 2 && !o.LJ(str4, "photo_shoot") && !o.LJ(str4, "photo_anchor") && !o.LJ(str4, "no_change_music")) {
            if (list != null) {
                IAnotherMusicService iAnotherMusicService = haa.LJFF;
                if (iAnotherMusicService != null) {
                    iAnotherMusicService.LJIL();
                    MusicModel LJ = C43014GuQ.LJ();
                    if (LJ != null && !z2) {
                        HA8 ha8 = new HA8(haa, ha6, mvThemeData);
                        HAE hae = new HAE(c43619H9z, new WeakReference(haa.LIZ), null, ha8, list, str2, null, str3, musicModel, new WeakReference(haa.LIZJ));
                        hae.LJIIJJI = LJ;
                        hae.LJIILJJIL = z;
                        HAC hac = new HAC(hae);
                        hac.LIZIZ = new HAF(new HAE(c43619H9z, new WeakReference(haa.LIZ), null, ha8, list, str2, 960));
                        hac.LIZ(null);
                        return;
                    }
                }
                haa.LIZ(c43619H9z, ha6, list, str2, mvThemeData, str3, musicModel, iPhotoPreDownloadMusic, z).LIZ(null);
                return;
            }
            return;
        }
        haa.LIZ(c43619H9z, ha6, list, str2, mvThemeData, str3, musicModel, iPhotoPreDownloadMusic, z).LIZ(null);
    }

    public HA9(HAA haa, C43619H9z c43619H9z, String str, C43616H9w c43616H9w, List list, String str2, String str3, MusicModel musicModel, boolean z, String str4, HAX hax) {
        this.LJIIJJI = haa;
        this.LIZ = c43619H9z;
        this.LIZIZ = str;
        this.LIZJ = c43616H9w;
        this.LIZLLL = list;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = musicModel;
        this.LJII = z;
        this.LJIIIIZZ = str4;
        this.LJIIJ = hax;
    }
}
