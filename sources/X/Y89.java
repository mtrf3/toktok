package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y89 {
    public static final java.util.Map<String, Y8A> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, VF6> LIZIZ = new LinkedHashMap();

    public static Y8A LJI(CommentImageModel commentImageModel) {
        for (Map.Entry entry : ((LinkedHashMap) LIZ).entrySet()) {
            if (o.LJ(((Y8A) entry.getValue()).LJLIL, commentImageModel)) {
                C71Y.LIZ("CommentImageMonitorUtil", "findMonitorInfoByImageModel success");
                return (Y8A) entry.getValue();
            }
        }
        C71Y.LIZ("CommentImageMonitorUtil", "findMonitorInfoByImageModel is null");
        return null;
    }

    public static void LJII(CommentImageModel imageModel) {
        o.LJIIIZ(imageModel, "imageModel");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startCompressImage: ");
        LIZ2.append(imageModel);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
        Y8A LJI = LJI(imageModel);
        if (LJI == null) {
            return;
        }
        LJI.LJLILLLLZI = System.currentTimeMillis();
    }

    public static void LIZJ(int i, String id) {
        o.LJIIIZ(id, "id");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("endImageLoad ");
        LIZ2.append(id);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
        VF6 vf6 = (VF6) ((LinkedHashMap) LIZIZ).get(id);
        if (vf6 == null) {
            return;
        }
        vf6.LJLJI = System.currentTimeMillis();
        vf6.LJLJJLL = i;
        if (vf6.LJLILLLLZI > vf6.LJLJI || vf6.LJLJL) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("monitor.toJson: ");
        LIZ3.append(vf6.LJJIII());
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ3));
        FMX.LJIILJJIL("comment_photo_loaded", vf6.LJJIII());
        vf6.LJLJL = true;
    }

    public static void LIZLLL(int i, String fakeId) {
        o.LJIIIZ(fakeId, "fakeId");
        java.util.Map<String, Y8A> map = LIZ;
        Y8A y8a = (Y8A) ((LinkedHashMap) map).get(fakeId);
        if (y8a != null) {
            C71Y.LIZ("CommentImageMonitorUtil", "findMonitorInfoByFakeId success");
            y8a.LJLJLLL = System.currentTimeMillis();
            y8a.LJLLJ = i;
        } else {
            C71Y.LIZ("CommentImageMonitorUtil", "findMonitorInfoByFakeId is null");
        }
        if (y8a != null) {
            int i2 = -1;
            if (y8a.LJLL != -1 && y8a.LJLLI != -1 && y8a.LJLLILLLL != -1 && y8a.LJLLJ != -1) {
                i2 = 1;
            }
            y8a.LJLLL = i2;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("endPostComment fakeId: ");
        LIZ2.append(fakeId);
        LIZ2.append(" status: ");
        LIZ2.append(i);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
        if (y8a != null && y8a.LJLILLLLZI <= y8a.LJLJI && y8a.LJLJJI <= y8a.LJLJJL && y8a.LJLJJLL <= y8a.LJLJL && y8a.LJLJLJ <= y8a.LJLJLLL) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("monitor.toJson: ");
            LIZ3.append(y8a.LJJIII());
            C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ3));
            FMX.LJIILJJIL("comment_photo_duration", y8a.LJJIII());
        } else {
            C71Y.LIZ("CommentImageMonitorUtil", "monitorInfo is invalid");
        }
        map.remove(fakeId);
    }

    public static void LJ(CommentImageModel imageModel, int i) {
        o.LJIIIZ(imageModel, "imageModel");
        Y8A LJI = LJI(imageModel);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("endRequestAuth: ");
        LIZ2.append(imageModel);
        LIZ2.append(" status: ");
        LIZ2.append(i);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
        if (LJI == null) {
            return;
        }
        LJI.LJLJJL = System.currentTimeMillis();
        LJI.LJLLI = i;
    }

    public static void LJFF(CommentImageModel imageModel, int i) {
        o.LJIIIZ(imageModel, "imageModel");
        Y8A LJI = LJI(imageModel);
        if (LJI != null) {
            LJI.LJLJL = System.currentTimeMillis();
            LJI.LJLLILLLL = i;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("endUploadImage: ");
        LIZ2.append(imageModel);
        LIZ2.append(" status: ");
        LIZ2.append(i);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
    }

    public static void LJIIIZ(CommentImageModel imageModel, String fakeId) {
        o.LJIIIZ(fakeId, "fakeId");
        o.LJIIIZ(imageModel, "imageModel");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startPostComment fakeId ");
        LIZ2.append(fakeId);
        LIZ2.append(" imageModel: ");
        LIZ2.append(imageModel);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
        Y8A y8a = new Y8A(imageModel);
        y8a.LJLJLJ = System.currentTimeMillis();
        LIZ.put(fakeId, y8a);
    }

    public static void LJIIIIZZ(UrlModel urlModel, String id, String str) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(urlModel, "urlModel");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startImageLoad ");
        LIZ2.append(id);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
        java.util.Map<String, VF6> map = LIZIZ;
        VF6 vf6 = (VF6) ((LinkedHashMap) map).get(id);
        if (vf6 == null) {
            vf6 = new VF6(str);
            vf6.LJLJL = false;
            map.put(id, vf6);
        }
        vf6.LJLILLLLZI = System.currentTimeMillis();
        vf6.LJLJJI = urlModel.getWidth();
        vf6.LJLJJL = urlModel.getHeight();
    }

    public static void LIZ(CommentImageModel imageModel, int i, int i2, int i3, long j, String originFormat) {
        o.LJIIIZ(imageModel, "imageModel");
        o.LJIIIZ(originFormat, "originFormat");
        Y8A LJI = LJI(imageModel);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("endCompressImage ");
        LIZ2.append(imageModel);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
        if (LJI == null) {
            return;
        }
        LJI.LJLJI = System.currentTimeMillis();
        LJI.LJLLLL = i2;
        LJI.LJLLLLLL = i3;
        LJI.LJLZ = j;
        LJI.LJLL = i;
        LJI.LL = originFormat;
    }
}
