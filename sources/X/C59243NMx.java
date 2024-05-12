package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.NMx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59243NMx extends NOO {
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ LinkData LIZLLL;
    public final /* synthetic */ Aweme LJ;
    public final /* synthetic */ boolean LJFF;

    @Override // X.NNJ
    public final void LJ(boolean z, NNR params) {
        o.LJIIIZ(params, "params");
        if (z) {
            NN1.LJIJJ("open_url_h5", this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
        }
    }

    public C59243NMx(Context context, LinkData linkData, Aweme aweme, boolean z) {
        this.LIZJ = context;
        this.LIZLLL = linkData;
        this.LJ = aweme;
        this.LJFF = z;
    }
}
