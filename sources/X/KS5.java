package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class KS5 {
    public int LIZ;
    public final UrlModel LIZIZ;
    public final C62846OlW LIZJ;
    public W5O[] LIZLLL;
    public W4R LJ;
    public C81705W4v LJII;
    public final KS7 LJIIIIZZ;
    public boolean LJIIIZ = true;
    public final KS6 LJIIJ = new KS6(this);
    public final int LJFF = 0;
    public final int LJI = 0;

    public final void LIZ() {
        String str;
        int i;
        List<String> urlList = this.LIZIZ.getUrlList();
        int i2 = this.LIZ;
        this.LIZ = i2 + 1;
        if (C79004UzY.LJJIFFI(urlList) || i2 >= urlList.size()) {
            str = null;
        } else {
            str = (String) ListProtector.get(urlList, i2);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.LIZLLL == null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
            imageDecodeOptionsBuilder.LIZIZ(1);
            imageDecodeOptionsBuilder.LJ = false;
            C81810W8w c81810W8w = new C81810W8w(imageDecodeOptionsBuilder);
            W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
            LIZLLL.LJ = c81810W8w;
            int i3 = this.LJI;
            if (i3 > 0 && (i = this.LJFF) > 0) {
                LIZLLL.LIZJ = new C79238V7y(i, i3);
            }
            this.LIZLLL = new W5O[]{LIZLLL.LIZ()};
        }
        W5O[] w5oArr = this.LIZLLL;
        if (this.LJII == null) {
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJIIL = this.LIZJ.getController();
            LIZJ.LJFF(true, w5oArr);
            LIZJ.LJII = this.LJIIJ;
            this.LJII = LIZJ;
        }
        this.LJII.LJFF(true, w5oArr);
        if (this.LJ == null) {
            this.LJ = this.LJII.LIZ();
        }
        this.LIZJ.setController(this.LJ);
    }

    public KS5(C62846OlW c62846OlW, UrlModel urlModel, KS7 ks7) {
        this.LIZJ = c62846OlW;
        this.LIZIZ = urlModel;
        this.LJIIIIZZ = ks7;
    }
}
