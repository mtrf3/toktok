package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class TAR {
    public static void LIZ(W5G w5g, ImageModel imageModel) {
        C79238V7y c79238V7y;
        W5O[] w5oArr;
        if (w5g == null || imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return;
        }
        int measuredWidth = w5g.getMeasuredWidth();
        int measuredHeight = w5g.getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            c79238V7y = new C79238V7y(measuredWidth, measuredHeight);
        } else {
            c79238V7y = null;
        }
        if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            w5oArr = new W5O[0];
        } else {
            ArrayList arrayList = new ArrayList();
            C64358PNq c64358PNq = new C64358PNq();
            for (String str : imageModel.getUrls()) {
                if (!C38354F3m.LJ(str)) {
                    W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
                    if (c79238V7y != null) {
                        LIZLLL.LIZJ = c79238V7y;
                    }
                    c64358PNq.LIZIZ++;
                    LIZLLL.LJIILJJIL = c64358PNq;
                    arrayList.add(LIZLLL.LIZ());
                }
            }
            if (arrayList.size() == 0) {
                w5oArr = new W5O[0];
            } else {
                w5oArr = (W5O[]) arrayList.toArray(new W5O[arrayList.size()]);
                if (w5oArr == null) {
                    return;
                }
            }
        }
        if (w5oArr.length == 0) {
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = w5g.getController();
        LIZJ.LJFF(true, w5oArr);
        LIZJ.LJII = new C78792Uw8(imageModel);
        w5g.setController(LIZJ.LIZ());
    }
}
