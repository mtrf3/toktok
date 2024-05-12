package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y88 {
    public static final int LIZIZ;
    public static final String LIZJ;
    public static CommentImageUploadAuth LIZLLL;
    public static final java.util.Map<Integer, Y8G> LJ;
    public List<SH4> LIZ;

    public final void LIZ() {
        List<SH4> list = this.LIZ;
        if (list != null) {
            Iterator<SH4> it = list.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
        List<SH4> list2 = this.LIZ;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        java.util.Map<Integer, Y8G> map = LJ;
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (o.LJ(((Y8G) entry.getValue()).LJLIL, this)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(C7EK.LJLIL);
    }

    static {
        SettingsManager.LIZLLL().getClass();
        LIZIZ = SettingsManager.LJ("comment_image_upload_threshold", 3) * 1024 * 1024;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cmt_img_auth_");
        LIZ.append(AccountService.LJIJ().LJFF().getCurUserId());
        LIZJ = X1D.LIZIZ(LIZ);
        LJ = new LinkedHashMap();
    }

    public Y88() {
        C7EK c7ek = C7EK.LJLIL;
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(c7ek);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (X.C1B6.LIZIZ(r1) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.comment.model.CommentImageModel r9, X.SH7 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r2 = "CommentImageUploadController"
            if (r9 == 0) goto L17
            java.util.List r0 = r9.getUrlList()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L17
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
        L17:
            java.lang.String r0 = "upload image is null!"
            X.C71Y.LIZLLL(r2, r0)
            return
        L1d:
            java.lang.String r7 = X.Y87.LIZIZ(r9)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "upload file: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C71Y.LIZLLL(r2, r0)
            java.lang.String r1 = r9.getFormat()
            if (r1 == 0) goto Lf9
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r1.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
        L45:
            boolean r0 = X.Y87.LIZLLL(r9)
            if (r0 == 0) goto L51
            boolean r0 = X.Y87.LJ(r9)
            if (r0 == 0) goto Le9
        L51:
            int r0 = r9.getCompressedStatus()
            if (r0 == 0) goto L6f
            int r1 = r9.getCompressedStatus()
            r0 = 3
            if (r1 == r0) goto L6f
            int r0 = r9.getCompressedStatus()
            r3 = 2
            if (r0 != r3) goto Lb2
            java.lang.String r1 = r9.getCompressedFilePath()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Lab
        L6f:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = "image.size: "
            r3.append(r0)
            long r0 = r9.getSize()
            r3.append(r0)
            java.lang.String r0 = ", try to compress"
            r3.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r3)
            X.C71Y.LIZLLL(r2, r0)
            r9.setCompressedStatus(r4)
            X.Y89.LJII(r9)
            int r5 = r9.getWidth()
            int r4 = r9.getHeight()
            long r2 = r9.getSize()
            float r1 = (float) r2
            int r0 = X.Y88.LIZIZ
            float r0 = (float) r0
            float r1 = r1 / r0
            X.Y8B r0 = new X.Y8B
            r0.<init>(r9, r6, r8, r10)
            X.C77115UOh.LIZ(r7, r5, r4, r1, r0)
        Laa:
            return
        Lab:
            boolean r0 = X.C1B6.LIZIZ(r1)
            if (r0 != 0) goto Lb2
            goto L6f
        Lb2:
            int r0 = r9.getCompressedStatus()
            if (r0 != r3) goto Lc3
            java.lang.String r0 = "compress status is complete"
            X.C71Y.LIZLLL(r2, r0)
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = X.Y88.LIZLLL
            r8.LIZLLL(r9, r0, r10)
            goto Laa
        Lc3:
            int r0 = r9.getCompressedStatus()
            if (r0 != r4) goto Laa
            java.lang.String r0 = "compress status is compressing"
            X.C71Y.LIZLLL(r2, r0)
            java.lang.String r0 = "pre-compress savePendingInfo"
            X.C71Y.LIZLLL(r2, r0)
            java.util.Map<java.lang.Integer, X.Y8G> r2 = X.Y88.LJ
            int r0 = r9.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.Y8G r0 = new X.Y8G
            r0.<init>(r8, r10)
            r2.put(r1, r0)
            X.Y89.LJII(r9)
            goto Laa
        Le9:
            r9.setCompressed(r3)
            r0 = 0
            r9.setCompressedFilePath(r0)
            r9.setCompressedStatus(r3)
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = X.Y88.LIZLLL
            r8.LIZLLL(r9, r0, r10)
            goto Laa
        Lf9:
            java.lang.String r6 = ""
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y88.LIZJ(com.ss.android.ugc.aweme.comment.model.CommentImageModel, X.SH7):void");
    }

    public final void LIZIZ(CommentImageModel commentImageModel, CommentImageUploadAuth commentImageUploadAuth, SH7 sh7) {
        String LIZIZ2;
        boolean z;
        if (commentImageModel.isCompressed()) {
            LIZIZ2 = commentImageModel.getCompressedFilePath();
        } else {
            LIZIZ2 = Y87.LIZIZ(commentImageModel);
        }
        if (LIZIZ2 == null || LIZIZ2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("upload error filePath is null! image.isCompressed: ");
            LIZ.append(commentImageModel.isCompressed());
            C71Y.LIZLLL("CommentImageUploadController", X1D.LIZIZ(LIZ));
            sh7.onError();
            return;
        }
        if (commentImageUploadAuth == null) {
            C71Y.LIZLLL("CommentImageUploadController", "upload error auth is null!");
            sh7.onError();
            return;
        }
        SH4 sh4 = new SH4(commentImageUploadAuth);
        sh4.LIZIZ.setFilePath(1, new String[]{LIZIZ2});
        sh4.LIZIZ.setListener(new SH6(new Y8F(sh7, sh4, this, commentImageModel)));
        sh4.LIZIZ.start();
        C71Y.LIZLLL("CommentImageUploader", "start");
        int width = commentImageModel.getWidth();
        int height = commentImageModel.getHeight();
        long size = commentImageModel.getSize();
        Y8A LJI = Y89.LJI(commentImageModel);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startUploadImage: ");
        LIZ2.append(commentImageModel);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ2));
        if (LJI != null) {
            LJI.LJLJJLL = System.currentTimeMillis();
            LJI.LJZ = width;
            LJI.LJZI = height;
            LJI.LJZL = size;
            LJI.LJLLLL = width;
            LJI.LJLLLLLL = height;
            LJI.LJLZ = size;
        }
        if (this.LIZ == null) {
            this.LIZ = new ArrayList();
        }
        List<SH4> list = this.LIZ;
        if (list != null) {
            ((ArrayList) list).add(sh4);
        }
    }

    public final void LIZLLL(CommentImageModel imageModel, CommentImageUploadAuth commentImageUploadAuth, SH7 sh7) {
        if (Y87.LIZJ()) {
            C71Y.LIZLLL("CommentImageUploadController", "has valid auth, start upload");
            LIZIZ(imageModel, commentImageUploadAuth, sh7);
            return;
        }
        C71Y.LIZLLL("CommentImageUploadController", "has invalid auth, fetch authConfig");
        o.LJIIIZ(imageModel, "imageModel");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startRequestAuth: ");
        LIZ.append(imageModel);
        C71Y.LIZ("CommentImageMonitorUtil", X1D.LIZIZ(LIZ));
        Y8A LJI = Y89.LJI(imageModel);
        if (LJI != null) {
            LJI.LJLJJI = System.currentTimeMillis();
        }
        ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).fetchCommentImageUploadAuth().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new Y8D(imageModel, this, sh7));
    }
}
