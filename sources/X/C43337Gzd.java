package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Gzd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43337Gzd {
    public final /* synthetic */ H00 LIZ;
    public final /* synthetic */ List<PublishImageModel> LIZIZ;

    public final void LIZ(C42993Gu5 c42993Gu5) {
        this.LIZ.LJIIIIZZ(new C41767GaJ(new C43340Gzg(c42993Gu5.getErrorCode(), c42993Gu5.getErrorMsg(), 415), null, 2, null));
    }

    public final void LIZIZ(java.util.Map<String, AbstractImageUploader.ImageUploadInfo> imageUploadResults) {
        o.LJIIIZ(imageUploadResults, "imageUploadResults");
        C43336Gzc c43336Gzc = new C43336Gzc(((C43353Gzt) this.LIZ.LJIJI.getValue()).LIZ().LIZIZ(TimeUnit.MILLISECONDS), 0L, -1L, -1L, 0L, 32);
        H00 h00 = this.LIZ;
        C43403H1r c43403H1r = h00.LIZIZ;
        if (c43403H1r != null) {
            VideoPublishEditModel model = c43403H1r.LIZ;
            List<PublishImageModel> imageGroup = this.LIZIZ;
            o.LJIIIZ(model, "model");
            o.LJIIIZ(imageGroup, "imageGroup");
            for (PublishImageModel publishImageModel : imageGroup) {
                Object obj = ((LinkedHashMap) imageUploadResults).get(publishImageModel.path);
                o.LJI(obj);
                publishImageModel.uri = ((AbstractImageUploader.ImageUploadInfo) obj).getMImageToskey();
            }
            PublishImageModel publishImageModel2 = (PublishImageModel) ListProtector.get(imageGroup, model.getCoverPublishModel().getImageCurrentIndex());
            VideoCreation videoCreation = new VideoCreation();
            videoCreation.setImageGroup(imageGroup);
            videoCreation.setImageCoverModel(publishImageModel2);
            InterfaceC43351Gzr interfaceC43351Gzr = h00.LIZ;
            if (interfaceC43351Gzr != null) {
                interfaceC43351Gzr.LIZ(new C43335Gzb(videoCreation, c43336Gzc), false);
                return;
            } else {
                o.LJIJI("nodeCallback");
                throw null;
            }
        }
        o.LJIJI("editModelContainer");
        throw null;
    }

    public C43337Gzd(H00 h00, List<PublishImageModel> list) {
        this.LIZ = h00;
        this.LIZIZ = list;
    }
}
