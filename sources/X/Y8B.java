package X;

import com.ss.android.ugc.aweme.comment.model.CommentImageModel;

/* loaded from: classes16.dex */
public final class Y8B implements UUW {
    public final /* synthetic */ CommentImageModel LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Y88 LIZJ;
    public final /* synthetic */ SH7 LIZLLL;

    @Override // X.UUW
    public final void onError() {
        C71Y.LIZLLL("CommentImageUploadController", "compress completed error");
        this.LIZLLL.onError();
        this.LIZ.setCompressedStatus(3);
        Y89.LIZ(this.LIZ, -1, 0, 0, 0L, this.LIZIZ);
    }

    @Override // X.UUW
    public final void LIZ(C77116UOi c77116UOi) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("compress completed: ");
        LIZ.append(c77116UOi.LJLIL);
        LIZ.append(" now image.format:{");
        LIZ.append(this.LIZ.getFormat());
        LIZ.append('}');
        C71Y.LIZLLL("CommentImageUploadController", X1D.LIZIZ(LIZ));
        this.LIZ.setFormat("jpeg");
        this.LIZ.setCompressed(true);
        this.LIZ.setCompressedFilePath(c77116UOi.LJLIL);
        this.LIZ.setCompressedStatus(2);
        Y89.LIZ(this.LIZ, 1, c77116UOi.LJLILLLLZI, c77116UOi.LJLJI, c77116UOi.LJLJJI, this.LIZIZ);
        this.LIZJ.LIZLLL(this.LIZ, Y88.LIZLLL, this.LIZLLL);
    }

    public Y8B(CommentImageModel commentImageModel, String str, Y88 y88, SH7 sh7) {
        this.LIZ = commentImageModel;
        this.LIZIZ = str;
        this.LIZJ = y88;
        this.LIZLLL = sh7;
    }
}
