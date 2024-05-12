package X;

import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Ruy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71076Ruy {
    public final WeakReference<Aweme> LIZ;
    public FeedEcCardData LIZJ;
    public List<? extends Object> LIZLLL;
    public List<EcUgProduct> LJ;
    public List<String> LJFF;
    public long LJII;
    public final CopyOnWriteArrayList<String> LIZIZ = new CopyOnWriteArrayList<>();
    public String LJI = "";

    public C71076Ruy(WeakReference<Aweme> weakReference) {
        this.LIZ = weakReference;
    }
}
