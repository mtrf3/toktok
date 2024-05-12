package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import o53.IDdS479S0100000_14;

/* loaded from: classes9.dex */
public final class KS9 {
    public final UrlModel LIZ;
    public final W5G LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final InterfaceC81853WAn LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public int LJIIL;
    public W5O[] LJIILIIL;
    public W4R LJIILJJIL;
    public C81705W4v LJIILL;
    public final IDdS479S0100000_14 LJIILLIIL = new IDdS479S0100000_14(this, 2);

    public final void LIZ() {
        String str;
        int i;
        InterfaceC81853WAn interfaceC81853WAn;
        List<String> urlList = this.LIZ.getUrlList();
        int i2 = this.LJIIL;
        this.LJIIL = i2 + 1;
        if (C79004UzY.LJJIFFI(urlList) || i2 >= urlList.size()) {
            str = null;
        } else {
            str = (String) ListProtector.get(urlList, i2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("has controller : ");
        LIZ.append(this.LIZIZ.getController());
        C34B.LIZIZ("FrescoAnimatedBinder", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(str)) {
            if (this.LJFF && (interfaceC81853WAn = this.LJ) != null && interfaceC81853WAn.LIZLLL()) {
                int LJIJJLI = C63081OpJ.LJIJJLI(this.LIZIZ.getContext(), 90.0f);
                ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                layoutParams.width = LJIJJLI;
                layoutParams.height = LJIJJLI;
                this.LIZIZ.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (this.LJIILIIL == null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
            imageDecodeOptionsBuilder.LIZIZ(this.LJIIJJI);
            imageDecodeOptionsBuilder.LJ = this.LJIIJ;
            imageDecodeOptionsBuilder.LIZLLL = this.LJIIIIZZ;
            imageDecodeOptionsBuilder.LJFF = this.LJIIIZ;
            C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
            W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
            LIZLLL.LJ = c81810W8w;
            int i3 = this.LIZLLL;
            if (i3 > 0 && (i = this.LIZJ) > 0) {
                LIZLLL.LIZJ = new C79238V7y(i, i3);
            }
            this.LJIILIIL = new W5O[]{LIZLLL.LIZ()};
        }
        W5O[] w5oArr = this.LJIILIIL;
        if (this.LJIILL == null) {
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJIIL = this.LIZIZ.getController();
            LIZJ.LJFF(true, w5oArr);
            LIZJ.LJIIJ = this.LJI;
            LIZJ.LJII = this.LJIILLIIL;
            this.LJIILL = LIZJ;
        }
        this.LJIILL.LJFF(true, w5oArr);
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = this.LJIILL.LIZ();
        }
        this.LIZIZ.setController(this.LJIILJJIL);
    }

    public KS9(C4AT c4at) {
        this.LIZIZ = c4at.LIZIZ;
        this.LIZ = c4at.LIZ;
        this.LIZJ = c4at.LIZJ;
        this.LIZLLL = c4at.LIZLLL;
        this.LJ = c4at.LJ;
        this.LJII = c4at.LJII;
        this.LJIIIIZZ = c4at.LJIIIIZZ;
        this.LJFF = c4at.LJFF;
        this.LJI = c4at.LJI;
        this.LJIIIZ = c4at.LJIIIZ;
        this.LJIIJJI = c4at.LJIIJJI;
        this.LJIIJ = c4at.LJIIJ;
    }
}
