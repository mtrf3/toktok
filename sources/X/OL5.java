package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class OL5 {
    public final WeakReference<Aweme> LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final EcUgVSAData LIZLLL;
    public final String LJ;
    public VSAProductCardsResponse.ProductCard LJFF;
    public final java.util.Map<String, String> LJI = new LinkedHashMap();
    public Bitmap LJII;
    public OLK LJIIIIZZ;
    public DataCenter LJIIIZ;
    public volatile boolean LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public volatile boolean LJIILIIL;
    public volatile boolean LJIILJJIL;

    public OL5(WeakReference<Aweme> weakReference, String str, long j, EcUgVSAData ecUgVSAData, String str2) {
        this.LIZ = weakReference;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = ecUgVSAData;
        this.LJ = str2;
    }
}
