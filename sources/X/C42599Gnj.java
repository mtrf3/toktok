package X;

import Y.IDeS155S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Gnj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42599Gnj {
    public static Bitmap LIZ(String imageBase64) {
        o.LJIIIZ(imageBase64, "imageBase64");
        try {
            byte[] decode = Base64.decode((String) ListProtector.get(s.LJLJJL(imageBase64, new String[]{","}, 0, 6), 1), 0);
            o.LJIIIIZZ(decode, "decode(imageBase64.split…roid.util.Base64.DEFAULT)");
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap LJ(View view) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout((int) view.getX(), (int) view.getY(), view.getMeasuredWidth() + ((int) view.getX()), view.getMeasuredHeight() + ((int) view.getY()));
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache, 0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static int LIZIZ(Activity activity, TokenCert tokenCert, InterfaceC88472Yns interfaceC88472Yns) {
        int LIZ;
        String[] strArr;
        int LIZ2;
        o.LJIIIZ(tokenCert, "tokenCert");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            LIZ = C04330Ez.LIZ(activity, "android.permission.READ_MEDIA_IMAGES");
        } else {
            LIZ = C04330Ez.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (LIZ == 0) {
            return ((Number) interfaceC88472Yns.invoke(Boolean.FALSE)).intValue();
        }
        if (i >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
            LIZ2 = C04330Ez.LIZ(activity, "android.permission.READ_MEDIA_IMAGES");
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
            LIZ2 = C04330Ez.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (LIZ2 == 0) {
            ((Number) interfaceC88472Yns.invoke(Boolean.FALSE)).intValue();
            return 2;
        }
        if (!(activity instanceof ActivityC45651qj)) {
            return 2;
        }
        C61099NyR.LIZIZ.LIZIZ(activity, tokenCert).LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new IDeS155S0200000_7(activity, interfaceC88472Yns, 2));
        return 2;
    }

    public static android.net.Uri LIZJ(Context context, Bitmap bitmap, String str) {
        if (bitmap == null) {
            return null;
        }
        if (context == null) {
            context = EF7.LIZIZ();
        }
        try {
            android.net.Uri LIZLLL = C268613q.LIZLLL(context, str, "image/png");
            if (LIZLLL != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, context.getContentResolver().openOutputStream(LIZLLL));
                return LIZLLL;
            }
            throw new IOException();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String LIZLLL(Bitmap bitmap, String str, String fileName) {
        o.LJIIIZ(fileName, "fileName");
        if (BitmapUtils.saveBitmapToSD(bitmap, str, fileName)) {
            return i0.LJFF(str, fileName);
        }
        return null;
    }
}
