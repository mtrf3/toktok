package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.image.model.ImageBufferData;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151425ww {
    public static final HashMap<String, ImageBufferData> LIZ = new HashMap<>();
    public static volatile OSJ<String, String, ? extends WeakReference<Bitmap>> LIZIZ;
    public static C10H LIZJ;

    public static void LIZ() {
        WeakReference<Bitmap> third;
        Bitmap bitmap;
        C10H c10h = LIZJ;
        if (c10h != null) {
            c10h.LIZ();
        }
        LIZJ = null;
        OSJ<String, String, ? extends WeakReference<Bitmap>> osj = LIZIZ;
        if (osj != null && (third = osj.getThird()) != null && (bitmap = third.get()) != null) {
            bitmap.recycle();
        }
        LIZIZ = null;
    }

    public static void LIZIZ(CreativeInfo creativeInfo, String str) {
        String str2;
        o.LJIIIZ(creativeInfo, "creativeInfo");
        if (C151435wx.LIZIZ.contains(Integer.valueOf(C151435wx.LIZJ)) && C151435wx.LIZIZ().getEnableFirstImageDecode()) {
            OSJ<String, String, ? extends WeakReference<Bitmap>> osj = LIZIZ;
            if (osj != null) {
                str2 = osj.getFirst();
            } else {
                str2 = null;
            }
            if (o.LJ(str, str2)) {
                return;
            }
            LIZ();
            LIZIZ = new OSJ<>(str, null, null);
            LIZJ = C151525x6.LJ(str, 0, 0, new AqS56S1100000_2(creativeInfo, str, 4), 14);
        }
    }
}
