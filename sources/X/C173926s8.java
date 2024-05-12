package X;

import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.6s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173926s8 {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(String str) {
        ExifInterface LJIIIZ = C44694HgQ.LJIIIZ(str);
        if (LJIIIZ != null) {
            int attributeInt = LJIIIZ.getAttributeInt("Orientation", 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt == 8) {
                        return 270;
                    }
                } else {
                    return 90;
                }
            } else {
                return 180;
            }
        }
        return 0;
    }

    public static final C173916s7 LIZIZ(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        MediaMetadataRetriever LJIILLIIL = C44694HgQ.LJIILLIIL(str);
        int i5 = 0;
        C173916s7 c173916s7 = new C173916s7(0);
        c173916s7.LIZIZ = LJIILLIIL.extractMetadata(5);
        String extractMetadata = LJIILLIIL.extractMetadata(9);
        if (extractMetadata != null) {
            i = CastIntegerProtector.parseInt(extractMetadata);
        } else {
            i = 0;
        }
        c173916s7.LJ = i;
        c173916s7.LIZ = LJIILLIIL.extractMetadata(12);
        String LIZIZ = HOT.LIZIZ(LJIILLIIL);
        if (LIZIZ != null) {
            i2 = CastIntegerProtector.parseInt(LIZIZ);
        } else {
            i2 = 0;
        }
        c173916s7.LIZJ = i2;
        String LIZ2 = HOT.LIZ(LJIILLIIL);
        if (LIZ2 != null) {
            i3 = CastIntegerProtector.parseInt(LIZ2);
        } else {
            i3 = 0;
        }
        c173916s7.LIZLLL = i3;
        String extractMetadata2 = LJIILLIIL.extractMetadata(20);
        if (extractMetadata2 != null) {
            i4 = CastIntegerProtector.parseInt(extractMetadata2);
        } else {
            i4 = 0;
        }
        c173916s7.LJI = i4;
        String extractMetadata3 = LJIILLIIL.extractMetadata(24);
        if (extractMetadata3 != null) {
            i5 = CastIntegerProtector.parseInt(extractMetadata3);
        }
        c173916s7.LJII = i5;
        try {
            LJIILLIIL.release();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return c173916s7;
    }
}
