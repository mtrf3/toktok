package X;

import com.bytedance.android.live.effect.model.Area;
import com.bytedance.android.live.effect.model.Canvas;
import com.bytedance.android.live.effect.model.StreamSize;
import com.bytedance.android.live.effect.model.VideoSize;

/* renamed from: X.1Mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31661Mc implements C0RV {
    public static VideoSize LIZIZ;
    public static StreamSize LIZJ;
    public static Area LJII;
    public static final C31661Mc LIZ = new C31661Mc();
    public static int LIZLLL = C15380j0.LJIIL();
    public static int LJ = C15380j0.LJIIJJI();
    public static int LJFF = C15380j0.LIZ(347.0f);
    public static Area LJI = new Area(163, 302, 0, 0);

    static {
        int i;
        Integer LIZJ2 = InterfaceC30442Bx8.i2.LIZJ();
        int value = C0U1.VERTICAL.getValue();
        if (LIZJ2 == null || LIZJ2.intValue() != value) {
            i = 0;
        } else {
            i = 135;
        }
        LJII = new Area(216, null, 0, i);
    }

    public static final VideoSize LIZ() {
        int i;
        int i2;
        StreamSize streamSize = LIZJ;
        if (streamSize != null) {
            int i3 = streamSize.surfaceWidth;
            int i4 = streamSize.surfaceHeight;
            float f = i3;
            float f2 = i4;
            float f3 = f / f2;
            int i5 = streamSize.videoWidth;
            int i6 = streamSize.videoHeight;
            float f4 = i5 / i6;
            if (f3 > f4) {
                i2 = (int) (f / f4);
                i = i3;
            } else {
                i = (int) (f2 * f4);
                i2 = i4;
            }
            StringBuilder LIZJ2 = C06460Ne.LIZJ("surfaceWidth:", i3, ",videoWidth:", i5, ",realWidth:");
            C15890jp.LIZIZ(LIZJ2, i, ",surfaceHeight:", i4, ",videoHeight:");
            LIZJ2.append(i6);
            LIZJ2.append(",realHeight:");
            LIZJ2.append(i2);
            C0NB.LIZIZ("LiveGoalEffect", X1D.LIZIZ(LIZJ2));
            return new VideoSize(i, i3, i2, i4, true);
        }
        return null;
    }

    public static Canvas LIZIZ() {
        int i;
        int i2;
        VideoSize videoSize = LIZIZ;
        if (videoSize != null) {
            i = videoSize.realWidth;
        } else {
            i = 720;
        }
        int LJIJ = (int) C15380j0.LJIJ(i);
        VideoSize videoSize2 = LIZIZ;
        if (videoSize2 != null) {
            i2 = videoSize2.realHeight;
        } else {
            i2 = 1280;
        }
        return new Canvas(LJIJ, (int) C15380j0.LJIJ(i2));
    }

    public static int LIZJ() {
        VideoSize videoSize = LIZIZ;
        int i = 0;
        if (videoSize == null) {
            return 0;
        }
        int i2 = videoSize.realHeight - videoSize.surfaceHeight;
        if (!C29306Beo.LJJI()) {
            i = C15380j0.LJIILIIL();
        }
        return (int) C15380j0.LJIJ(i2 - ((int) ((videoSize.surfaceHeight / C15380j0.LJIIJJI()) * i)));
    }

    public static Area LIZLLL() {
        Area area = new Area(LIZJ() + LJII.top, null, LJII() + LJII.left, LJII() + LJII.right);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fullScreenArea: ");
        LIZ2.append(area);
        C0NB.LIZIZ("LiveGoalEffect", X1D.LIZIZ(LIZ2));
        Area area2 = new Area((int) (LJFF() * LJII.top), null, (int) (LJI() * LJII.left), (int) (LJI() * LJII.right));
        Area area3 = new Area(LIZJ() + area2.top, null, LJII() + area2.left, LJII() + area2.right);
        VideoSize videoSize = LIZIZ;
        if (videoSize != null && videoSize.isFullScreen) {
            return area;
        }
        return area3;
    }

    public static Area LJ() {
        int i;
        int i2;
        int i3;
        int LIZJ2 = LIZJ() + LJI.top;
        Integer num = LJI.bottom;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Area area = new Area(LIZJ2, Integer.valueOf(i), LJII() + LJI.left, LJII() + LJI.right);
        int LJFF2 = (int) (LJFF() * LJI.top);
        Integer num2 = LJI.bottom;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        Area area2 = new Area(LJFF2, Integer.valueOf((int) (LJFF() * i2)), (int) (LJI() * LJI.left), (int) (LJI() * LJI.right));
        int LIZJ3 = LIZJ() + area2.top;
        Integer num3 = area2.bottom;
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = 0;
        }
        Area area3 = new Area(LIZJ3, Integer.valueOf(i3), LJII() + area2.left, LJII() + area2.right);
        VideoSize videoSize = LIZIZ;
        if (videoSize != null && videoSize.isFullScreen) {
            return area;
        }
        return area3;
    }

    public static float LJFF() {
        VideoSize videoSize;
        float f = LJ;
        if (f > 0.0f && (videoSize = LIZIZ) != null) {
            return videoSize.surfaceHeight / f;
        }
        return 1.0f;
    }

    public static float LJI() {
        VideoSize videoSize;
        float f = LIZLLL;
        if (f > 0.0f && (videoSize = LIZIZ) != null) {
            return videoSize.surfaceWidth / f;
        }
        return 1.0f;
    }

    public static int LJII() {
        VideoSize videoSize = LIZIZ;
        if (videoSize != null) {
            return (int) C15380j0.LJIJ((videoSize.realWidth - videoSize.surfaceWidth) / 2);
        }
        return 0;
    }
}
