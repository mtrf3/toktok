package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gbi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41854Gbi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel model) {
        String LJIJI;
        AVUploadSaveModel saveModel;
        o.LJIIIZ(model, "model");
        if (model.isSaveLocalWithWaterMark()) {
            if (!model.getCoverPublishModel().getEffectTextModel().getHasCoverText() && model.getSaveModel() != null && (saveModel = model.getSaveModel()) != null && saveModel.getImageModeLocalPaths() != null) {
                AVUploadSaveModel saveModel2 = model.getSaveModel();
                o.LJI(saveModel2);
                List<String> imageModeLocalPaths = saveModel2.getImageModeLocalPaths();
                o.LJI(imageModeLocalPaths);
                LJIJI = (String) ListProtector.get(imageModeLocalPaths, model.getCoverPublishModel().getImageCurrentIndex());
            } else {
                File LJIIJJI = V16.LJIIJJI(model, EnumC43650HBe.SAVE_TO_LOCAL, "watermarks");
                StringBuilder LIZ2 = X1D.LIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("watermark");
                LIZ3.append(System.currentTimeMillis());
                LIZ2.append(C173376rF.LJI(X1D.LIZIZ(LIZ3)));
                LIZ2.append(".jpeg");
                LJIJI = new File(LJIIJJI, X1D.LIZIZ(LIZ2)).getAbsolutePath();
                String LIZ4 = AnonymousClass629.LIZ("randomUUID().toString()");
                long currentTimeMillis = System.currentTimeMillis();
                C43237Gy1.LIZ(1, 1, H7R.LJI(model));
                C43237Gy1.LIZJ(1, 1, H7R.LJI(model), currentTimeMillis, LIZ4);
                IWaterMarkService LIZ5 = WaterMarkServiceImpl.LIZ();
                C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
                o.LJI(currentUser);
                String LJIJI2 = C44729Hgz.LJIJI(model);
                String path = LJIIJJI.getPath();
                o.LJIIIIZZ(path, "waterMarkDir.path");
                LIZ5.addWaterMarkToImage(currentUser, LJIJI2, path);
                C43237Gy1.LIZIZ(1, 1, H7R.LJI(model), currentTimeMillis, LIZ4);
            }
        } else {
            LJIJI = C44729Hgz.LJIJI(model);
        }
        AVUploadSaveModel saveModel3 = model.getSaveModel();
        if (saveModel3 != null) {
            saveModel3.setImageModeCoverPath(LJIJI);
        }
        AVUploadSaveModel saveModel4 = model.getSaveModel();
        if (saveModel4 == null) {
            return;
        }
        saveModel4.setImageModeCoverPathNoWatermark(C44729Hgz.LJIJI(model));
    }
}
