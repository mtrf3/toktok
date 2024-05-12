package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.82l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2049182l {
    public static Bitmap LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2049282m.LJLIL);
    public static final java.util.Map<String, Float> LIZJ = new LinkedHashMap();

    public static float LIZ(Integer num, Integer num2) {
        int i;
        int i2 = 1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        if (num2 != null && num2.intValue() != 0) {
            i2 = num2.intValue();
        }
        return ((int) Math.rint((i / i2) * 100)) / 100;
    }

    public static ImageView.ScaleType LIZIZ(float f, EnumC2053484c longTextType) {
        o.LJIIIZ(longTextType, "longTextType");
        if (LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZJ()) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (longTextType == EnumC2053484c.CASE_C) {
            if (f < 0.75f) {
                return ImageView.ScaleType.CENTER_CROP;
            }
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (f <= ((Number) C84V.LIZJ.getValue()).floatValue()) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        return ImageView.ScaleType.FIT_CENTER;
    }

    public static float LIZJ(ImageView.ScaleType scaleType, EnumC2053484c enumC2053484c, int i, Aweme aweme, int i2) {
        String aid;
        String LIZIZ2;
        UrlModel urlModel;
        o.LJIIIZ(scaleType, "scaleType");
        float f = 1.0f;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            PhotoModeImage LJJIII = C62819Ol5.LJJIII(i2, aweme);
            if (LJJIII == null || (urlModel = LJJIII.urlModel) == null || (LIZIZ2 = urlModel.getUrlKey()) == null) {
                LIZIZ2 = YE1.LIZIZ(aid, " + ", i2);
            }
            if (C83A.LIZ()) {
                java.util.Map<String, Float> map = LIZJ;
                if (map.containsKey(LIZIZ2)) {
                    Float f2 = (Float) ((LinkedHashMap) map).get(LIZIZ2);
                    if (f2 == null) {
                        return 1.0f;
                    }
                    return f2.floatValue();
                }
            }
            if (i == 0) {
                i = 1;
            }
            if (enumC2053484c == EnumC2053484c.CASE_C) {
                f = ((Number) LIZIZ.getValue()).floatValue() / i;
            } else if (scaleType == ImageView.ScaleType.FIT_CENTER) {
                f = 0.83f;
            }
            if (!Float.isNaN(f)) {
                LIZJ.put(LIZIZ2, Float.valueOf(f));
            }
        }
        return f;
    }
}
