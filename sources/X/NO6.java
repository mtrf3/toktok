package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NO6 extends NNJ {
    public final /* synthetic */ LinkData LIZJ;
    public final /* synthetic */ Context LIZLLL;
    public final /* synthetic */ Aweme LJ;
    public final /* synthetic */ boolean LJFF;

    @Override // X.NNJ
    public final boolean LIZ() {
        return TextUtils.equals(this.LIZJ.type, "app");
    }

    @Override // X.NNJ
    public final boolean LIZIZ() {
        return NOE.LJJIIZ(this.LIZLLL, this.LIZJ.packageName, null);
    }

    @Override // X.NNJ
    public final void LJ(boolean z, NNR params) {
        o.LJIIIZ(params, "params");
        if (z) {
            NN1.LJIJJ("open_url_app", this.LIZLLL, this.LIZJ, this.LJ, this.LJFF);
        }
    }

    public NO6(Context context, LinkData linkData, Aweme aweme, boolean z) {
        this.LIZJ = linkData;
        this.LIZLLL = context;
        this.LJ = aweme;
        this.LJFF = z;
    }
}
