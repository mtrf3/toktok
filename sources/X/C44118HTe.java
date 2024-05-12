package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.HTe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44118HTe {
    public static final /* synthetic */ int LIZ = 0;

    public static File LIZ(Context context, EnumC44120HTg type) {
        File file;
        File file2;
        o.LJIIIZ(type, "type");
        StringBuilder sb = new StringBuilder();
        File file3 = null;
        if (context != null) {
            file = C16880lQ.LLIIIL(context);
        } else {
            file = null;
        }
        sb.append(file);
        sb.append(File.separator);
        sb.append(UUID.randomUUID());
        int i = C44119HTf.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    sb.append(".mp4");
                }
            } else {
                sb.append(".webp");
            }
        } else {
            sb.append(".png");
        }
        try {
            file2 = new File(sb.toString());
        } catch (Exception e) {
            e = e;
        }
        try {
            file2.createNewFile();
            return file2;
        } catch (Exception e2) {
            e = e2;
            file3 = file2;
            C16880lQ.LLLLIIL(e);
            return file3;
        }
    }

    public static File LIZIZ(Context context, Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        File file = null;
        try {
            file = LIZ(context, EnumC44120HTg.WEBP);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            bitmap.compress(Bitmap.CompressFormat.WEBP, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return file;
        }
    }
}
