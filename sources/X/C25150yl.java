package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.0yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25150yl {
    public static final ConcurrentHashMap<Integer, LinkedBlockingQueue<Bitmap>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(C04740Go lottieDrawable, DisplayMetrics metrics) {
        C29701Eo c29701Eo;
        o.LJIIJ(lottieDrawable, "lottieDrawable");
        o.LJIIJ(metrics, "metrics");
        Bitmap LIZ2 = C25140yk.LIZ(lottieDrawable, Bitmap.Config.ARGB_8888, metrics);
        int hashCode = lottieDrawable.hashCode();
        ConcurrentHashMap<Integer, LinkedBlockingQueue<Bitmap>> concurrentHashMap = LIZ;
        if (concurrentHashMap.get(Integer.valueOf(hashCode)) == null) {
            concurrentHashMap.put(Integer.valueOf(hashCode), new LinkedBlockingQueue<>());
        }
        if (LIZ2 != null) {
            WeakReference<C29701Eo> weakReference = lottieDrawable.LLFF;
            if (weakReference != null && (c29701Eo = weakReference.get()) != null) {
                try {
                    Canvas canvas = new Canvas(LIZ2);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    if (c29701Eo.getBackground() != null) {
                        c29701Eo.getBackground().setBounds(0, 0, LIZ2.getWidth(), LIZ2.getHeight());
                        if ((c29701Eo.getScrollX() | c29701Eo.getScrollY()) == 0) {
                            c29701Eo.getBackground().draw(canvas);
                        } else {
                            canvas.translate(c29701Eo.getScrollX(), c29701Eo.getScrollY());
                            c29701Eo.getBackground().draw(canvas);
                            canvas.translate(-c29701Eo.getScrollX(), -c29701Eo.getScrollY());
                        }
                    }
                    if (c29701Eo.getImageMatrix() == null && c29701Eo.getPaddingTop() == 0 && c29701Eo.getPaddingLeft() == 0) {
                        lottieDrawable.LJIIIZ(canvas);
                    } else {
                        int saveCount = canvas.getSaveCount();
                        canvas.save();
                        if (c29701Eo.getCropToPadding()) {
                            canvas.clipRect(c29701Eo.getScrollX() + c29701Eo.getPaddingLeft(), c29701Eo.getScrollY() + c29701Eo.getPaddingTop(), ((c29701Eo.getScrollX() + c29701Eo.getRight()) - c29701Eo.getLeft()) - c29701Eo.getPaddingRight(), ((c29701Eo.getScrollY() + c29701Eo.getBottom()) - c29701Eo.getTop()) - c29701Eo.getPaddingBottom());
                        }
                        canvas.translate(c29701Eo.getPaddingLeft(), c29701Eo.getPaddingTop());
                        if (c29701Eo.getImageMatrix() != null) {
                            canvas.concat(c29701Eo.getImageMatrix());
                        }
                        lottieDrawable.LJIIIZ(canvas);
                        canvas.restoreToCount(saveCount);
                    }
                    LinkedBlockingQueue<Bitmap> linkedBlockingQueue = concurrentHashMap.get(Integer.valueOf(hashCode));
                    if (linkedBlockingQueue != null) {
                        synchronized (linkedBlockingQueue) {
                            linkedBlockingQueue.add(LIZ2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (C04020Du.LIZ) {
                if (C04020Du.LIZJ == null) {
                    C04020Du.LIZJ = new Random();
                }
                C04020Du.LIZJ.nextFloat();
            }
        }
    }
}
