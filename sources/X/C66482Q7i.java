package X;

import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Q7i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66482Q7i extends AbstractC66483Q7j<SharePhotoContent, C66482Q7i> {
    public final List<SharePhoto> LJI = new ArrayList();

    public final void LIZ(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SharePhoto sharePhoto = (SharePhoto) it.next();
                if (sharePhoto != null) {
                    List<SharePhoto> list2 = this.LJI;
                    C66491Q7r c66491Q7r = new C66491Q7r();
                    c66491Q7r.LIZ(sharePhoto);
                    ((ArrayList) list2).add(new SharePhoto(c66491Q7r));
                }
            }
        }
    }
}
