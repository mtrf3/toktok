package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NWW {
    public final String LIZ;
    public final LifecycleOwner LIZIZ;
    public final int LIZJ;
    public final Bundle LIZLLL;
    public final AwemeRawAd LJ;
    public final boolean LJFF;
    public final AnchorLynxModel LJI;

    public NWW(String url, LifecycleOwner lifecycleOwner, int i, String title, Bundle bundle, AwemeRawAd awemeRawAd, boolean z, AnchorLynxModel anchorLynxModel) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(title, "title");
        this.LIZ = url;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = i;
        this.LIZLLL = bundle;
        this.LJ = awemeRawAd;
        this.LJFF = z;
        this.LJI = anchorLynxModel;
    }
}
