package X;

import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.io.File;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes8.dex */
public final class H0D implements FUZ {
    public final /* synthetic */ AbstractImageUploader LIZ;
    public final /* synthetic */ H0E LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ VideoPublishEditModel LIZLLL;

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        Long l;
        int i2;
        String mImageToskey;
        this.LIZ.LJ();
        if (i == 6) {
            this.LIZ.LIZJ();
            if (imageUploadInfo == null || (mImageToskey = imageUploadInfo.getMImageToskey()) == null || mImageToskey.length() == 0) {
                H0E h0e = this.LIZIZ;
                H0H h0h = new H0H(null, null, 3, null);
                h0h.setErrorCode(-235);
                h0e.LJIILIIL(h0h);
                return;
            }
            H0E h0e2 = this.LIZIZ;
            String mImageToskey2 = imageUploadInfo.getMImageToskey();
            if (mImageToskey2 == null) {
                mImageToskey2 = "";
            }
            C41785Gab c41785Gab = new C41785Gab(mImageToskey2);
            C67996QmO c67996QmO = h0e2.LJFF;
            if (c67996QmO != null) {
                c67996QmO.LJ(c41785Gab, false);
                return;
            } else {
                o.LJIJI("nodeCallback");
                throw null;
            }
        }
        this.LIZ.LJFF();
        if (i == 7) {
            this.LIZ.LIZJ();
            File file = new File(this.LIZJ);
            if (!file.exists() || file.length() == 0) {
                EffectTextModel effectTextModel = this.LIZLLL.getCoverPublishModel().getEffectTextModel();
                C67996QmO c67996QmO2 = this.LIZIZ.LJFF;
                if (c67996QmO2 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("hasCoverText: ");
                    LIZ.append(effectTextModel.getHasCoverText());
                    LIZ.append(", isCoverTextValid: ");
                    LIZ.append(effectTextModel.isCoverTextValid());
                    LIZ.append(", coverTextInfo: ");
                    LIZ.append(effectTextModel.getTextSticker());
                    LIZ.append(", model: ");
                    LIZ.append(C42000Ge4.LIZLLL(this.LIZLLL));
                    c67996QmO2.LIZIZ(new C43393H1h("CoverUploadTask", X1D.LIZIZ(LIZ)), EnumC43531H6p.OUTER);
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cover text image upload failed ... error code : ");
            if (imageUploadInfo != null) {
                l = Long.valueOf(imageUploadInfo.getMErrorCode());
            } else {
                l = null;
            }
            LIZ2.append(l);
            LIZ2.append(",image info: path=");
            LIZ2.append(this.LIZJ);
            LIZ2.append("&exist=");
            LIZ2.append(file.exists());
            LIZ2.append("&length=");
            LIZ2.append(file.length());
            LIZ2.append(", error msg : ");
            LIZ2.append(new JSONArray());
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            H0E h0e3 = this.LIZIZ;
            H0H h0h2 = new H0H(null, illegalArgumentException, 1, null);
            if (imageUploadInfo != null) {
                i2 = (int) imageUploadInfo.getMErrorCode();
            } else {
                i2 = 14;
            }
            h0h2.setErrorCode(i2);
            h0e3.LJIILIIL(h0h2);
            return;
        }
        this.LIZ.LJI();
    }

    public H0D(AbstractImageUploader abstractImageUploader, H0E h0e, String str, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = abstractImageUploader;
        this.LIZIZ = h0e;
        this.LIZJ = str;
        this.LIZLLL = videoPublishEditModel;
    }
}
