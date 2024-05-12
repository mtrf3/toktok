package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.jvm.internal.o;

/* renamed from: X.5l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144025l0 {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZJ(int i) {
        if (i != 1) {
            if (i == 2) {
                return 0.75f;
            }
            if (i == 3) {
                return 0.5625f;
            }
            if (i == 4) {
                return 1.3333334f;
            }
        }
        return 1.0f;
    }

    public static float LIZLLL(int i) {
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return 1.3333334f;
        }
        if (i != 3) {
            return i != 4 ? 0.0f : 0.75f;
        }
        return 1.7777778f;
    }

    public static RectF LJ(float f) {
        float f2;
        float f3;
        float LIZIZ = C144035l1.LIZIZ() / C144035l1.LIZ();
        float LIZIZ2 = C144035l1.LIZIZ();
        float LIZ2 = C144035l1.LIZ();
        if (LIZIZ > f) {
            f3 = f * LIZ2;
            f2 = LIZ2;
        } else {
            f2 = (1 * LIZIZ2) / f;
            f3 = LIZIZ2;
        }
        RectF rectF = new RectF();
        float f4 = 2;
        rectF.left = ((LIZIZ2 - f3) / f4) + C74275TDb.LIZ(32);
        float LIZ3 = C1I0.LIZ(LIZ2, f2, f4, C74275TDb.LIZ(64));
        rectF.top = LIZ3;
        rectF.right = rectF.left + f3;
        rectF.bottom = LIZ3 + f2;
        return rectF;
    }

    public static float LIZIZ(float f, int i, int i2) {
        float LIZIZ = C144035l1.LIZIZ();
        float LIZ2 = C144035l1.LIZ();
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 > f) {
            f2 = f3 * f;
        } else {
            f3 = (1 * f2) / f;
        }
        if (LIZIZ / LIZ2 < f2 / f3) {
            return LIZIZ / f2;
        }
        return LIZ2 / f3;
    }

    public static RectF LJFF(NLEEditor nleEditor, float f, float f2) {
        o.LJIIIZ(nleEditor, "nleEditor");
        float scale = nleEditor.LJ().getMainTrack().LJIILIIL(0).getScale();
        float transformX = nleEditor.LJ().getMainTrack().LJIILIIL(0).getTransformX();
        float f3 = f * scale;
        float f4 = f2 * scale;
        float f5 = 2;
        float f6 = C144035l1.LIZ / f5;
        float f7 = (C144035l1.LIZIZ * transformX) + (C144035l1.LIZIZ / f5);
        float transformY = (C144035l1.LIZ * nleEditor.LJ().getMainTrack().LJIILIIL(0).getTransformY()) + f6;
        RectF rectF = new RectF();
        float f8 = f3 / f5;
        rectF.left = f7 - f8;
        rectF.right = f7 + f8;
        float f9 = f4 / f5;
        rectF.top = transformY - f9;
        rectF.bottom = transformY + f9;
        return rectF;
    }

    public static Rect LIZ(float f, float f2, int i, int i2) {
        float f3;
        float LIZ2 = (i2 - C74275TDb.LIZ(52.0f)) - C74275TDb.LIZ(158.0f);
        float LIZJ = i - ((int) KL2.LIZJ(C60903NvH.LJ, 32.0f));
        if (f2 > LIZJ / LIZ2) {
            f3 = LIZJ / f2;
        } else {
            LIZJ = f2 * LIZ2;
            f3 = LIZ2;
        }
        if (f > f2) {
            f3 = LIZJ / f;
        } else {
            LIZJ = f * f3;
        }
        float f4 = 2;
        float f5 = (i - LIZJ) / f4;
        float LIZ3 = C74275TDb.LIZ(52.0f) + ((LIZ2 - f3) / f4);
        return new Rect((int) f5, (int) LIZ3, (int) (f5 + LIZJ), (int) (LIZ3 + f3));
    }
}
