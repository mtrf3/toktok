package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45455Hsh {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String previewImageFile) {
        o.LJIIIZ(previewImageFile, "previewImageFile");
        File file = new File(C16880lQ.LLIIIL(EF7.LIZIZ()), "ecommerce");
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        File file2 = new File(absolutePath, "billboard_v2_success_use_effect_template_image");
        if (file2.exists()) {
            C16880lQ.LLLZZIL(file2);
        }
        if (C36980EfI.LIZIZ(previewImageFile, absolutePath, "billboard_v2_success_use_effect_template_image")) {
            return file2.getAbsolutePath();
        }
        return null;
    }

    public static String LIZIZ(View cellPreviewContainer) {
        Bitmap bitmap;
        o.LJIIIZ(cellPreviewContainer, "cellPreviewContainer");
        try {
            cellPreviewContainer.measure(View.MeasureSpec.makeMeasureSpec(cellPreviewContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(cellPreviewContainer.getHeight(), 1073741824));
            cellPreviewContainer.layout(cellPreviewContainer.getLeft(), cellPreviewContainer.getTop(), cellPreviewContainer.getRight(), cellPreviewContainer.getBottom());
            bitmap = Bitmap.createBitmap(cellPreviewContainer.getWidth(), cellPreviewContainer.getHeight(), Bitmap.Config.ARGB_8888);
            o.LJIIIIZZ(bitmap, "createBitmap(view.width,… Bitmap.Config.ARGB_8888)");
            Canvas canvas = new Canvas(bitmap);
            canvas.translate(-cellPreviewContainer.getScrollX(), -cellPreviewContainer.getScrollX());
            C37203Eit.LIZJ.getClass();
            C39214FaE.LIZ(cellPreviewContainer, canvas);
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            return "";
        }
        Context context = cellPreviewContainer.getContext();
        o.LJIIIIZZ(context, "cellPreviewContainer.context");
        File file = new File(C16880lQ.LLIIIL(context), "ecommerce");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "billboard_v2_template_preview");
        if (file2.exists()) {
            C16880lQ.LLLZZIL(file2);
        }
        C42300Giu.LIZ(bitmap, file2, 100, Bitmap.CompressFormat.PNG);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        String absolutePath = file2.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "imageFile.absolutePath");
        return absolutePath;
    }
}
