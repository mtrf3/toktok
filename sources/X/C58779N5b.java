package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.N5b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58779N5b extends NNK {
    public final /* synthetic */ Context LIZLLL;
    public final /* synthetic */ LinkData LJ;
    public final /* synthetic */ Aweme LJFF;
    public final /* synthetic */ boolean LJI;

    @Override // X.NNJ
    public final void LJ(boolean z, NNR params) {
        o.LJIIIZ(params, "params");
        if (z) {
            NN1.LJIJJ("open_url_app", this.LIZLLL, this.LJ, this.LJFF, this.LJI);
            NO5.LJIJI(new C58778N5a(this.LIZLLL, this.LJ, this.LJFF, this.LJI));
        }
    }

    public C58779N5b(Context context, LinkData linkData, Aweme aweme, boolean z) {
        this.LIZLLL = context;
        this.LJ = linkData;
        this.LJFF = aweme;
        this.LJI = z;
    }
}
