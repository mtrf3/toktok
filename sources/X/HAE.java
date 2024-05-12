package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes8.dex */
public final class HAE {
    public final C43619H9z LIZ;
    public final WeakReference<Activity> LIZIZ;
    public final HAZ LIZJ;
    public final HAY LIZLLL;
    public final List<String> LJ;
    public final String LJFF;
    public InterfaceC84498XEg LJI;
    public final String LJII;
    public final MusicModel LJIIIIZZ;
    public final WeakReference<HA3> LJIIIZ;
    public String LJIIJ;
    public MusicModel LJIIJJI;
    public boolean LJIIL;
    public IPhotoPreDownloadMusic LJIILIIL;
    public boolean LJIILJJIL;

    public /* synthetic */ HAE(C43619H9z c43619H9z, WeakReference weakReference, HAZ haz, HAY hay, List list, String str, int i) {
        this(c43619H9z, (i & 2) != 0 ? null : weakReference, (i & 4) != 0 ? null : haz, (i & 8) != 0 ? null : hay, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str, null, null, null, null);
    }

    public HAE(C43619H9z c43619H9z, WeakReference<Activity> weakReference, HAZ haz, HAY hay, List<String> list, String str, InterfaceC84498XEg interfaceC84498XEg, String str2, MusicModel musicModel, WeakReference<HA3> weakReference2) {
        this.LIZ = c43619H9z;
        this.LIZIZ = weakReference;
        this.LIZJ = haz;
        this.LIZLLL = hay;
        this.LJ = list;
        this.LJFF = str;
        this.LJI = interfaceC84498XEg;
        this.LJII = str2;
        this.LJIIIIZZ = musicModel;
        this.LJIIIZ = weakReference2;
        this.LJIIL = true;
    }
}
