package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.o;

/* renamed from: X.GdA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41944GdA {
    public static final String LIZIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LIZJ = LIZJ(creativeInfo);
        if (!C1B6.LIZIZ(LIZJ)) {
            C1I0.LIZJ(LIZJ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZJ);
        return JBR.LJFF(LIZ, File.separator, "PixelLoopResize.bmp", LIZ);
    }

    public static final String LIZJ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIIJ(creativeInfo));
        LIZ.append("resize_bitmap_tmp");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(String str, String newPath, C83489Wph c83489Wph, Context context, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(newPath, "newPath");
        C68322mC c68322mC = new C68322mC();
        int[] LIZLLL = C44739Hh9.LIZLLL();
        T t = LIZLLL;
        if (LIZLLL == null) {
            t = new int[]{720, 1280};
        }
        c68322mC.element = t;
        if (TextUtils.isEmpty(str) || !C44687HgJ.LIZIZ(str) || ((int[]) c68322mC.element).length < 2) {
            interfaceC88472Yns.invoke(str);
        } else {
            XKX.LIZLLL(C780334l.LJLIL, EXT.LIZ, null, new C41941Gd7(c83489Wph, str, newPath, c68322mC, interfaceC88472Yns, context, null), 2);
        }
    }

    public static final int[] LIZ(boolean z, int i, int i2, Context context, String str, int[] iArr) {
        if (z && i != -1 && i2 != -1) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeStream(new ContextWrapper(context).getContentResolver().openInputStream(UriProtector.parse(str)), null, options);
                int i3 = options.outWidth;
                int i4 = options.outHeight;
                if (i3 > i2 || i4 > i) {
                    float f = i3;
                    float f2 = i2 / f;
                    if (Math.round(f2 * f) > i2 || Math.round(i4 * f2) > i) {
                        f2 = i / i4;
                    }
                    iArr[0] = O6R.LJJIIZ(f * f2);
                    iArr[1] = O6R.LJJIIZ(f2 * i4);
                }
            } catch (FileNotFoundException unused) {
            }
        }
        return iArr;
    }
}
