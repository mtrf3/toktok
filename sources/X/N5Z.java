package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes11.dex */
public final class N5Z implements N2X {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ LinkData LIZIZ;
    public final /* synthetic */ Aweme LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    public N5Z(Context context, LinkData linkData, Aweme aweme, boolean z) {
        this.LIZ = context;
        this.LIZIZ = linkData;
        this.LIZJ = aweme;
        this.LIZLLL = z;
    }

    @Override // X.N2X
    public final void LIZ(boolean z) {
        if (z) {
            NN1.LJIJJ("deeplink_success", this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        } else {
            NN1.LJIJJ("deeplink_failed", this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
    }
}
