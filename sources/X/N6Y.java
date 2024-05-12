package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N6Y extends N6Q<C59948Nfs> {
    public final C59948Nfs LJLJJLL;

    @Override // X.N6Q, X.JK9
    public final void LLLLZI() {
        AwemeRawAd awemeRawAd;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bind ad Tag componentView = ");
        LIZ.append(this.LJLJJLL);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        C59948Nfs c59948Nfs = this.LJLJJLL;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C182957Fz.LIZ(c59948Nfs, awemeRawAd);
    }

    @Override // X.N6Q
    public final /* bridge */ /* synthetic */ C59948Nfs LIZ() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6Y(C58809N6f param) {
        super(param);
        C59948Nfs c59948Nfs;
        o.LJIIIZ(param, "param");
        ViewGroup viewGroup = this.LJLIL.LIZ;
        if (viewGroup != null) {
            c59948Nfs = (C59948Nfs) viewGroup.findViewById(R.id.ub);
        } else {
            c59948Nfs = null;
        }
        this.LJLJJLL = c59948Nfs;
    }
}
