package X;

import com.ss.android.ugc.aweme.comment.model.CommentImageModel;

/* loaded from: classes16.dex */
public final class Y8C implements UUW {
    public final /* synthetic */ CommentImageModel LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.UUW
    public final void onError() {
        C71Y.LIZLLL("CommentImageUploadController", "pre-compress completed error");
        this.LIZ.setCompressedStatus(3);
        Y87.LJFF(this.LIZ);
        Y89.LIZ(this.LIZ, -1, 0, 0, 0L, this.LIZIZ);
    }

    @Override // X.UUW
    public final void LIZ(C77116UOi c77116UOi) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pre-compress completed: ");
        LIZ.append(c77116UOi.LJLIL);
        LIZ.append(" now image.format:{");
        LIZ.append(this.LIZ.getFormat());
        C71Y.LIZLLL("CommentImageUploadController", X1D.LIZIZ(LIZ));
        this.LIZ.setFormat("jpeg");
        this.LIZ.setCompressed(true);
        this.LIZ.setCompressedFilePath(c77116UOi.LJLIL);
        this.LIZ.setCompressedStatus(2);
        Y87.LJFF(this.LIZ);
        Y89.LIZ(this.LIZ, 1, c77116UOi.LJLILLLLZI, c77116UOi.LJLJI, c77116UOi.LJLJJI, this.LIZIZ);
    }

    public Y8C(CommentImageModel commentImageModel, String str) {
        this.LIZ = commentImageModel;
        this.LIZIZ = str;
    }
}
