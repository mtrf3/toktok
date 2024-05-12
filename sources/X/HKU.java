package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HKU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(AutoCutMediaModel mediaModel, String str, InterfaceC88471Ynr callback) {
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(callback, "callback");
        if (!mediaModel.isVideoType) {
            callback.invoke(mediaModel.filePath, Boolean.FALSE);
            return;
        }
        if (ujb.o.LJJJJ(mediaModel.filePath, ".mp3", false) || ujb.o.LJJJJ(mediaModel.filePath, ".mp4", false)) {
            callback.invoke(mediaModel.filePath, Boolean.FALSE);
        } else if (str != null) {
            LIZJ(mediaModel, str, new AqS173S0100000_7(callback, (InterfaceC88471Ynr<? super List<String>, ? super String, C76800UCe>) 322));
        }
    }

    public static void LIZJ(AutoCutMediaModel media, String targetPath, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(media, "media");
        o.LJIIIZ(targetPath, "targetPath");
        if (media.isVideoType) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new H74(media, targetPath, 0, interfaceC88472Yns, null), 3);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new H73(media, targetPath, interfaceC88472Yns, null), 3);
        }
    }

    public static Bitmap LIZLLL(Bitmap bitmap, int i, int i2) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        float f = i2;
        matrix.postRotate(i);
        matrix.postScale(f / width, f / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, true);
        o.LJIIIIZZ(createBitmap, "createBitmap(\n          …, matrix, true,\n        )");
        return createBitmap;
    }

    public static void LIZ(Context context, String inputPath, String outputPath, String workSpacePath, int[] iArr, int[] iArr2, QXX qxx) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        o.LJIIIZ(workSpacePath, "workSpacePath");
        C145765no.LIZIZ(1920, 1920, context, new C45190HoQ(qxx), inputPath, outputPath, workSpacePath, iArr, iArr2);
    }
}
