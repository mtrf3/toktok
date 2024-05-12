package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VsL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81105VsL {
    public static final List<String> LIZLLL;
    public int LIZ;
    public final List<Camera.Area> LIZIZ = new ArrayList();
    public final List<Camera.Area> LIZJ = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        LIZLLL = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    public final List<Camera.Area> LIZ(int i, int i2, float f, int i3, int i4, int i5, EnumC81106VsM enumC81106VsM) {
        Rect LIZIZ = LIZIZ(i, i2, f, 180.0f, i3, i4, i5, enumC81106VsM);
        if (((ArrayList) this.LIZJ).size() > 0) {
            ((ArrayList) this.LIZJ).clear();
        }
        ((ArrayList) this.LIZJ).add(new Camera.Area(LIZIZ, 1000));
        return this.LIZJ;
    }

    public final Rect LIZIZ(int i, int i2, float f, float f2, int i3, int i4, int i5, EnumC81106VsM enumC81106VsM) {
        int intValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) (((i3 * LiveNetAdaptiveHurryTimeSetting.DEFAULT) * 1.0f) / i)) - 1000;
        int i7 = ((int) (((i4 * LiveNetAdaptiveHurryTimeSetting.DEFAULT) * 1.0f) / i2)) - 1000;
        if (this.LIZ == 1 && enumC81106VsM == EnumC81106VsM.VIEW) {
            i6 = -i6;
        }
        int i8 = intValue / 2;
        int i9 = i6 - i8;
        if (i9 > 1000) {
            i9 = 1000;
        } else if (i9 < -1000) {
            i9 = -1000;
        }
        int i10 = i7 - i8;
        if (i10 > 1000) {
            i10 = 1000;
        } else if (i10 < -1000) {
            i10 = -1000;
        }
        Rect rect = new Rect();
        RectF rectF = new RectF(i9, i10, PDA.LIZLLL(i9 + intValue), PDA.LIZLLL(i10 + intValue));
        Rect rect2 = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        Rect rect3 = new Rect(-1000, -1000, 1000, 1000);
        if (enumC81106VsM == EnumC81106VsM.VIEW) {
            Matrix matrix = new Matrix();
            matrix.setRotate(-i5);
            RectF rectF2 = new RectF(rect3);
            RectF rectF3 = new RectF(rect2);
            matrix.mapRect(rectF2);
            matrix.mapRect(rectF3);
            matrix.reset();
            matrix.setTranslate(-rectF2.left, -rectF2.top);
            matrix.mapRect(rectF2);
            matrix.mapRect(rectF3);
            rect3.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            rect2.set((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
            rect = new Rect(rect2.left - 1000, rect2.top - 1000, rect2.right - 1000, rect2.bottom - 1000);
        } else if (enumC81106VsM == EnumC81106VsM.ORIGINAL_FRAME) {
            rect = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        rect.left = PDA.LIZLLL(rect.left);
        rect.right = PDA.LIZLLL(rect.right);
        rect.top = PDA.LIZLLL(rect.top);
        rect.bottom = PDA.LIZLLL(rect.bottom);
        return rect;
    }
}
