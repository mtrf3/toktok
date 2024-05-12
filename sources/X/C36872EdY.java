package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.EdY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36872EdY {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;

    public static File LIZ() {
        String absolutePath = C16880lQ.LLIIIL(EF7.LIZIZ()).getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(absolutePath);
        File file = new File(JBR.LJFF(LIZ2, File.separator, "extention_cached_feed.json", LIZ2));
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    public static final void LIZIZ(FeedItemList feedItemList) {
        FileOutputStream fileOutputStream;
        String absolutePath = C16880lQ.LLIIIL(EF7.LIZIZ()).getAbsolutePath();
        FileOutputStream fileOutputStream2 = null;
        if (absolutePath == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(absolutePath);
        File file = new File(JBR.LJFF(LIZ2, File.separator, "extention_cached_feed.json", LIZ2));
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception unused) {
                return;
            }
        }
        String value = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), feedItemList);
        if (TextUtils.isEmpty(value)) {
            try {
                File LIZ3 = LIZ();
                if (LIZ3 != null) {
                    C16880lQ.LLLZZIL(LIZ3);
                    return;
                }
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception unused3) {
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = fileOutputStream2;
        }
        try {
            o.LJIIIIZZ(value, "value");
            byte[] bytes = value.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            LIZIZ = true;
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(fileOutputStream);
        } catch (Exception unused4) {
            fileOutputStream2 = fileOutputStream;
            LIZIZ = false;
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(fileOutputStream);
            throw th;
        }
    }
}
