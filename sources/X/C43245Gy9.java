package X;

import android.content.Context;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import defpackage.b1;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Gy9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43245Gy9 {
    public final WeakReference<Context> LIZ;
    public final String LIZIZ;
    public final CountDownLatch LIZJ = new CountDownLatch(1);
    public boolean LIZLLL;

    public C43245Gy9(WeakReference<Context> weakReference) {
        this.LIZ = weakReference;
        String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "getExternalStoragePublic…ECTORY_DCIM).absolutePath");
        this.LIZIZ = absolutePath;
    }

    public final C15070iV LIZ(String str, C41272GHs c41272GHs) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            new RuntimeException("Image url is empty.");
            c41272GHs.LIZ();
            return new C15070iV(Boolean.FALSE, null);
        }
        c41272GHs.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        String LIZIZ = b1.LIZIZ(str, LIZ, ".png", LIZ);
        String imagePath = new File(this.LIZIZ, LIZIZ).getPath();
        if (C39579Fg7.LIZIZ(imagePath)) {
            this.LIZLLL = true;
        }
        if (!this.LIZLLL) {
            C38816FLg.LJ(new RunnableC43246GyA(this, str, LIZIZ, c41272GHs));
            try {
                this.LIZJ.await();
            } catch (InterruptedException unused) {
            }
        }
        if (this.LIZLLL) {
            o.LJIIIIZZ(imagePath, "imagePath");
            if (!TextUtils.isEmpty(imagePath) && this.LIZ.get() != null) {
                File file = new File(imagePath);
                Context context = this.LIZ.get();
                o.LJI(context);
                try {
                    ParcelFileDescriptor openFileDescriptor = EF7.LIZIZ().getContentResolver().openFileDescriptor(C268613q.LJ(context, file.getName(), "image/*", AnonymousClass073.LIZIZ(new StringBuilder(), Environment.DIRECTORY_PICTURES, "/tiktok/")), "w");
                    if (openFileDescriptor != null) {
                        C268513p.LIZ(file, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        if (this.LIZLLL) {
            o.LJIIIIZZ(imagePath, "imagePath");
            c41272GHs.onSuccess(imagePath);
        } else {
            c41272GHs.LIZ();
        }
        Boolean valueOf = Boolean.valueOf(this.LIZLLL);
        if (this.LIZLLL) {
            str2 = imagePath;
        }
        C15070iV c15070iV = new C15070iV(valueOf, str2);
        this.LIZLLL = false;
        return c15070iV;
    }
}
