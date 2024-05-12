package X;

import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.8uC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226168uC extends AbstractC208468Gc {
    public static final /* synthetic */ int LJLZ = 0;
    public final Context LJLJLJ;
    public final String LJLJLLL;
    public final View LJLL;
    public final View LJLLI;
    public final TuxIconView LJLLILLLL;
    public final C119244m8 LJLLJ;
    public final TextView LJLLL;
    public final ViewGroup LJLLLL;
    public final C2068389v LJLLLLLL;

    @Override // X.AbstractC208468Gc
    public final int[] P() {
        return J7H.LIZ(200);
    }

    public final void X() {
        List<ImageInfo> imageInfos;
        ImageInfo imageInfo;
        Aweme aweme = this.LJLIL;
        if (aweme != null && (imageInfos = aweme.getImageInfos()) != null && !imageInfos.isEmpty() && (imageInfo = (ImageInfo) ListProtector.get(imageInfos, 0)) != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(imageInfo.getLabelThumb()));
            LJII.LJIILIIL(P());
            SmartImageView smartImageView = this.LJLILLLLZI;
            LJII.LJJIIJ = smartImageView;
            int width = smartImageView.getWidth();
            int height = this.LJLILLLLZI.getHeight();
            LJII.LJII = width;
            LJII.LJIIIIZZ = height;
            LJII.LIZIZ("ImageViewHolder");
            C16880lQ.LLJJJ(LJII);
        }
    }

    @Override // X.MFR
    public final void LLZLLLL() {
        X();
    }

    public C226168uC(View view, String str, MH9 mh9) {
        super(view);
        this.LJLJLJ = view.getContext();
        this.LJLJLLL = str;
        this.LJLL = view.findViewById(R.id.bs8);
        this.LJLLI = view.findViewById(R.id.hy9);
        this.LJLILLLLZI = (SmartImageView) view.findViewById(R.id.cover);
        this.LJLLJ = (C119244m8) view.findViewById(R.id.me4);
        this.LJLLILLLL = (TuxIconView) view.findViewById(R.id.n6q);
        this.LJLLL = (TextView) view.findViewById(R.id.moj);
        this.LJLLLL = (ViewGroup) view.findViewById(R.id.ehc);
        C16880lQ.LJJIJLIJ(this.LJLILLLLZI, new ACListenerS38S0200000_3(mh9, this, 121));
        this.LJLILLLLZI.setAnimationListener(this.LJLJL);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZJ = C17N.LJIILL(15.0d);
        c2068389v.LIZIZ = C17N.LJIILL(15.0d);
        this.LJLLLLLL = c2068389v;
    }
}
