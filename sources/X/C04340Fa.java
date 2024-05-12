package X;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.0Fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04340Fa {
    public static final Interpolator LIZ = new LinearInterpolator();
    public static C0MB<WeakReference<Interpolator>> LIZIZ;

    public static void LIZIZ(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C04340Fa.class) {
            LIZIZ.LJI(i, weakReference);
        }
    }

    public static <T> C06780Ok<T> LIZ(JsonReader jsonReader, C0GY c0gy, float f, InterfaceC04380Fe<T> interfaceC04380Fe, boolean z) {
        Interpolator interpolator;
        int i;
        WeakReference<Interpolator> LJ;
        if (z) {
            jsonReader.beginObject();
            PointF pointF = null;
            PointF pointF2 = null;
            T t = null;
            T t2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            boolean z2 = false;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case 101:
                        if (!nextName.equals("e")) {
                            break;
                        } else {
                            t = interfaceC04380Fe.LIZ(jsonReader, f);
                            break;
                        }
                    case 104:
                        if (!nextName.equals("h")) {
                            break;
                        } else if (jsonReader.nextInt() == 1) {
                            z2 = true;
                            break;
                        } else {
                            z2 = false;
                            break;
                        }
                    case 105:
                        if (!nextName.equals("i")) {
                            break;
                        } else {
                            pointF2 = C0FZ.LIZIZ(jsonReader, f);
                            break;
                        }
                    case 111:
                        if (!nextName.equals("o")) {
                            break;
                        } else {
                            pointF = C0FZ.LIZIZ(jsonReader, f);
                            break;
                        }
                    case 115:
                        if (!nextName.equals("s")) {
                            break;
                        } else {
                            t2 = interfaceC04380Fe.LIZ(jsonReader, f);
                            break;
                        }
                    case 116:
                        if (!nextName.equals("t")) {
                            break;
                        } else {
                            f2 = (float) jsonReader.nextDouble();
                            break;
                        }
                    case 3701:
                        if (!nextName.equals("ti")) {
                            break;
                        } else {
                            pointF3 = C0FZ.LIZIZ(jsonReader, f);
                            break;
                        }
                    case 3707:
                        if (!nextName.equals("to")) {
                            break;
                        } else {
                            pointF4 = C0FZ.LIZIZ(jsonReader, f);
                            break;
                        }
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            if (z2) {
                interpolator = LIZ;
                t = t2;
            } else if (pointF != null && pointF2 != null) {
                float f3 = -f;
                pointF.x = C06260Mk.LIZIZ(pointF.x, f3, f);
                pointF.y = C06260Mk.LIZIZ(pointF.y, -100.0f, 100.0f);
                pointF2.x = C06260Mk.LIZIZ(pointF2.x, f3, f);
                float LIZIZ2 = C06260Mk.LIZIZ(pointF2.y, -100.0f, 100.0f);
                pointF2.y = LIZIZ2;
                float f4 = pointF.x;
                float f5 = pointF.y;
                float f6 = pointF2.x;
                if (f4 != 0.0f) {
                    i = (int) (527 * f4);
                } else {
                    i = 17;
                }
                if (f5 != 0.0f) {
                    i = (int) (i * 31 * f5);
                }
                if (f6 != 0.0f) {
                    i = (int) (i * 31 * f6);
                }
                if (LIZIZ2 != 0.0f) {
                    i = (int) (i * 31 * LIZIZ2);
                }
                synchronized (C04340Fa.class) {
                    if (LIZIZ == null) {
                        LIZIZ = new C0MB<>();
                    }
                    LJ = LIZIZ.LJ(i, null);
                }
                if (LJ == null || (interpolator = LJ.get()) == null) {
                    interpolator = C18950ol.LIZIZ(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                    try {
                        LIZIZ(i, new WeakReference(interpolator));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
            } else {
                interpolator = LIZ;
            }
            C06780Ok<T> c06780Ok = new C06780Ok<>(c0gy, t2, t, interpolator, f2, null);
            c06780Ok.LJIIL = pointF4;
            c06780Ok.LJIILIIL = pointF3;
            return c06780Ok;
        }
        return new C06780Ok<>(interfaceC04380Fe.LIZ(jsonReader, f));
    }
}
