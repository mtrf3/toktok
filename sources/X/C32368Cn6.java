package X;

import android.os.Handler;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Cn6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32368Cn6 {
    public static C73411SrX LIZ;
    public static Handler LIZIZ;

    public static void LIZ(AssetsModel assetsModel, int i) {
        FaceRecognitionMeta faceRecognitionMeta;
        List<String> list;
        if (assetsModel == null) {
            return;
        }
        int i2 = assetsModel.resourceType;
        if (i2 == AssetsModel.RESOURCE_TYPE_MP4) {
            C32366Cn4.LIZIZ(assetsModel.id, new CKI(), i, new HashMap(), null);
            return;
        }
        String str = null;
        if (i2 == AssetsModel.RESOURCE_TYPE_LYNX) {
            OST.LIZ(assetsModel, null, 6);
            return;
        }
        if (i2 != AssetsModel.RESOURCE_TYPE_STICKER) {
            return;
        }
        C32366Cn4.LIZIZ(assetsModel.id, new CKI(), i, new HashMap(), null);
        if (!C32257ClJ.LJI() || (faceRecognitionMeta = assetsModel.faceRecognitionArchiveMeta) == null || (list = faceRecognitionMeta.requirements) == null || !(!list.isEmpty())) {
            return;
        }
        FaceRecognitionMeta faceRecognitionMeta2 = assetsModel.faceRecognitionArchiveMeta;
        if (faceRecognitionMeta2 != null) {
            str = faceRecognitionMeta2.modelNames;
        }
        C79997VaT.LIZ(str, list);
    }
}
