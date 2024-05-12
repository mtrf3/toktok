package X;

import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1M implements FUZ {
    public final /* synthetic */ H1K LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
    }

    public H1M(H1K h1k, long j) {
        this.LIZ = h1k;
        this.LIZIZ = j;
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        String str;
        String str2;
        Long l;
        String str3;
        H1K h1k = this.LIZ;
        Long l2 = null;
        if (h1k.LJIIIZ != null) {
            if (i == 6) {
                if (imageUploadInfo != null) {
                    str = imageUploadInfo.getMImageToskey();
                } else {
                    str = null;
                }
                if (C78685UuP.LJJJZ(str)) {
                    VideoPublishEditModel videoPublishEditModel = this.LIZ.LJI;
                    if (videoPublishEditModel != null) {
                        PUgcTemplateData pUgcTemplateData = videoPublishEditModel.creativeModel.pugcTemplateData;
                        if (imageUploadInfo != null) {
                            str2 = imageUploadInfo.getMImageToskey();
                        } else {
                            str2 = null;
                        }
                        pUgcTemplateData.uploadVid = str2;
                        H1K h1k2 = this.LIZ;
                        long currentTimeMillis = System.currentTimeMillis() - this.LIZIZ;
                        h1k2.getClass();
                        C145995oB c145995oB = new C145995oB();
                        c145995oB.LIZIZ(currentTimeMillis, "duration");
                        c145995oB.LJI("creation_id", h1k2.LJIIIIZZ);
                        FMX.LJIIL("pugc_template_zip_upload_time_event", c145995oB.LIZ);
                        H1K h1k3 = this.LIZ;
                        if (imageUploadInfo != null) {
                            l = Long.valueOf(imageUploadInfo.getMErrorCode());
                        } else {
                            l = null;
                        }
                        h1k3.LJIIJJI(System.currentTimeMillis() - this.LIZ.LJII, l, true);
                        H1K h1k4 = this.LIZ;
                        if (imageUploadInfo != null) {
                            str3 = imageUploadInfo.getMImageToskey();
                        } else {
                            str3 = null;
                        }
                        C2U6 c2u6 = new C2U6(str3);
                        C67996QmO c67996QmO = h1k4.LJFF;
                        if (c67996QmO != null) {
                            c67996QmO.LJ(c2u6, true);
                            return;
                        } else {
                            o.LJIJI("nodeCallback");
                            throw null;
                        }
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
                H1K h1k5 = this.LIZ;
                if (imageUploadInfo != null) {
                    l2 = Long.valueOf(imageUploadInfo.getMErrorCode());
                }
                h1k5.LJIIJJI(System.currentTimeMillis() - this.LIZ.LJII, l2, false);
                this.LIZ.LJIIL(new H1P("template_upload_vid_null"), 10103);
                return;
            }
            if (i != 7) {
                return;
            }
            if (imageUploadInfo != null) {
                l2 = Long.valueOf(imageUploadInfo.getMErrorCode());
            }
            h1k.LJIIJJI(System.currentTimeMillis() - this.LIZ.LJII, l2, false);
            this.LIZ.LJIIL(new H1P("template_upload_fail"), 10104);
            return;
        }
        o.LJIJI("actualUploader");
        throw null;
    }
}
