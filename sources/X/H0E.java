package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class H0E extends AbstractC43455H3r {
    public C67996QmO LJFF;
    public VideoPublishEditModel LJI;

    public abstract boolean LJIIL(VideoPublishEditModel videoPublishEditModel);

    public abstract String LJIILJJIL(VideoPublishEditModel videoPublishEditModel);

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.COVER_TEXT_UPLOAD;
    }

    public final void LJIILIIL(H0H h0h) {
        C67996QmO c67996QmO = this.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(h0h.getErrorCode(), h0h);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2 A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:49:0x00ce, B:51:0x00d2, B:53:0x00d6, B:54:0x00d9), top: B:48:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: Exception -> 0x00da, TryCatch #0 {Exception -> 0x00da, blocks: (B:49:0x00ce, B:51:0x00d2, B:53:0x00d6, B:54:0x00d9), top: B:48:0x00ce }] */
    @Override // X.AbstractC43455H3r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.ERR r9, X.C67996QmO r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H0E.LJI(X.ERR, X.QmO):void");
    }

    public final void LJIIJJI(VideoPublishEditModel videoPublishEditModel, String str, UploadImageConfig uploadImageConfig) {
        AbstractImageUploader LIZ;
        if (H7R.LJJJJL(videoPublishEditModel)) {
            LIZ = new C43859HJf(uploadImageConfig);
        } else {
            LIZ = H0I.LIZ(uploadImageConfig);
        }
        try {
            LIZ.LJIIIZ(new H0D(LIZ, this, str, videoPublishEditModel));
            H75 h75 = new H75();
            h75.LIZJ(uploadImageConfig);
            LIZ.LJIIJJI(h75.LIZLLL());
            LIZ.LJIIIIZZ(1, new String[]{str});
            LIZ.LJIIJ(C45039Hlz.LIZLLL());
            LIZ.LJIIL();
        } catch (Exception e) {
            LIZ.LIZJ();
            throw e;
        }
    }
}
