package X;

import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class Y8F implements SH7 {
    public final /* synthetic */ SH7 LIZ;
    public final /* synthetic */ SH4 LIZIZ;
    public final /* synthetic */ Y88 LIZJ;
    public final /* synthetic */ CommentImageModel LIZLLL;

    @Override // X.SH7
    public final void onError() {
        this.LIZ.onError();
        this.LIZIZ.LIZ();
        List<SH4> list = this.LIZJ.LIZ;
        if (list != null) {
            ((ArrayList) list).remove(this.LIZIZ);
        }
        if (this.LIZLLL.isCompressed()) {
            Y87.LJIIIIZZ(this.LIZLLL.getCompressedFilePath());
        }
        Y89.LJFF(this.LIZLLL, -1);
    }

    @Override // X.SH7
    public final void onComplete(String str) {
        this.LIZ.onComplete(str);
        this.LIZIZ.LIZ();
        List<SH4> list = this.LIZJ.LIZ;
        if (list != null) {
            ((ArrayList) list).remove(this.LIZIZ);
        }
        if (this.LIZLLL.isCompressed()) {
            Y87.LJIIIIZZ(this.LIZLLL.getCompressedFilePath());
        }
        Y89.LJFF(this.LIZLLL, 1);
    }

    @Override // X.SH7
    public final void onProgress(long j) {
        this.LIZ.onProgress(j);
    }

    public Y8F(SH7 sh7, SH4 sh4, Y88 y88, CommentImageModel commentImageModel) {
        this.LIZ = sh7;
        this.LIZIZ = sh4;
        this.LIZJ = y88;
        this.LIZLLL = commentImageModel;
    }
}
