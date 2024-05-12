package com.bytedance.pipo.ocr.ocr;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C45878HzW;
import X.C86815Y5j;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class OcrViewModel extends AndroidViewModel {
    public static final /* synthetic */ int LJLJL = 0;
    public final MutableLiveData<C86815Y5j> LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public final Application LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrViewModel(Application context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJLL = context;
        this.LJLIL = new MutableLiveData<>();
    }

    public final Bitmap gv0(Uri imageUri) {
        Bitmap hv0;
        int attributeInt;
        int attributeInt2;
        o.LJIIIZ(imageUri, "imageUri");
        InputStream openInputStream = this.LJLJJLL.getContentResolver().openInputStream(imageUri);
        if (openInputStream == null) {
            return null;
        }
        try {
            float f = 90.0f;
            if (Build.VERSION.SDK_INT >= 24) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(openInputStream);
                bufferedInputStream.mark(bufferedInputStream.available());
                try {
                    attributeInt2 = new ExifInterface(bufferedInputStream).getAttributeInt("Orientation", 1);
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
                if (attributeInt2 != 3) {
                    if (attributeInt2 != 6) {
                        if (attributeInt2 == 8) {
                            f = 270.0f;
                        }
                        f = 0.0f;
                    }
                } else {
                    f = 180.0f;
                }
                bufferedInputStream.reset();
                Bitmap origin = BitmapFactory.decodeStream(bufferedInputStream);
                o.LJIIIIZZ(origin, "origin");
                hv0 = hv0(f, origin);
                AnonymousClass636.LJFF(openInputStream, null);
                return hv0;
            }
            try {
                attributeInt = new ExifInterface(C45878HzW.LIZJ(this.LJLJJLL, imageUri).getAbsolutePath()).getAttributeInt("Orientation", 1);
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt == 8) {
                        f = 270.0f;
                    }
                    f = 0.0f;
                }
            } else {
                f = 180.0f;
            }
            Bitmap origin2 = BitmapFactory.decodeStream(openInputStream);
            o.LJIIIIZZ(origin2, "origin");
            hv0 = hv0(f, origin2);
            AnonymousClass636.LJFF(openInputStream, null);
            return hv0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass636.LJFF(openInputStream, th);
                throw th2;
            }
        }
    }

    public static Bitmap hv0(float f, Bitmap bitmap) {
        Bitmap bitmap2;
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        try {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            bitmap2 = bitmap;
        }
        if (!o.LJ(bitmap, bitmap2)) {
            bitmap.recycle();
        }
        return bitmap2;
    }
}
