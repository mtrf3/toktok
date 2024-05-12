package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.ImageCell;

/* loaded from: classes13.dex */
public final class S5H extends AbstractC72439Sbr {
    public final /* synthetic */ ImageCell LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public S5H(ImageCell imageCell, long j) {
        this.LJLIL = imageCell;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        String str;
        if (!this.LJLIL.LJLJI) {
            Boolean bool = Boolean.FALSE;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            S5A.LIZ("finish", "display_image", bool, str, null, 16);
            this.LJLIL.LJLJI = true;
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        if (!this.LJLIL.LJLJI) {
            S5A.LIZ("finish", "display_image", Boolean.TRUE, null, Long.valueOf(System.currentTimeMillis() - this.LJLILLLLZI), 8);
            this.LJLIL.LJLJI = true;
        }
    }
}
