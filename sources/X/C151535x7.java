package X;

import Y.ARunnableS21S0200000_2;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.5x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151535x7 {
    public static final C151535x7 LIZ = new C151535x7();
    public static final LinkedBlockingQueue<Runnable> LIZIZ = new LinkedBlockingQueue<>();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C38008Evs.LJLIL);

    public static String[] LJ() {
        if (C1539462k.LIZ()) {
            File file = new File(new java.net.URI(C1539462k.LIZIZ()));
            if (file.exists()) {
                String path = file.getPath();
                o.LJIIIIZZ(path, "modelFile.path");
                return new String[]{path};
            }
        }
        return null;
    }

    public static void LIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        if (!C151435wx.LIZ()) {
            return;
        }
        System.currentTimeMillis();
        LIZIZ.clear();
        C151425ww.LIZ();
        C39579Fg7.LJIJJLI(C151445wy.LIZIZ(creativeInfo, false).getPath());
        System.currentTimeMillis();
    }

    public static String LIZLLL(String fileLocalUriPath) {
        o.LJIIIZ(fileLocalUriPath, "fileLocalUriPath");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C173376rF.LJI(fileLocalUriPath));
        LIZ2.append('.');
        LIZ2.append(C44694HgQ.LJIILL(fileLocalUriPath, false));
        return X1D.LIZIZ(LIZ2);
    }

    public static int LJI(String path) {
        Integer valueOf;
        o.LJIIIZ(path, "path");
        ExifInterface LJIIIZ = C44694HgQ.LJIIIZ(path);
        if (LJIIIZ != null && (valueOf = Integer.valueOf(LJIIIZ.getAttributeInt("Orientation", 1))) != null) {
            if (valueOf.intValue() == 6) {
                return 90;
            }
            if (valueOf.intValue() == 3) {
                return 180;
            }
            if (valueOf.intValue() == 8) {
                return 270;
            }
        }
        return 0;
    }

    public static float LJII(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return C151105wQ.LIZJ;
                        }
                        return C151105wQ.LJIIIZ;
                    }
                    return 1.3333334f;
                }
                return 1.0f;
            }
            return 0.75f;
        }
        return C151105wQ.LIZJ;
    }

    public static String LJIIIIZZ(int i) {
        String str;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append('_');
        LIZ2.append(System.currentTimeMillis());
        LIZ2.append("_edit_temp");
        if (C151435wx.LIZIZ().getEnableRgba()) {
            str = ".raw";
        } else {
            str = ".jpeg";
        }
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZIZ(CreativeInfo creativeInfo, MediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        if (!C151435wx.LIZ() || !mediaModel.LJ()) {
            return;
        }
        ((ExecutorService) LIZJ.getValue()).submit(new ARunnableS21S0200000_2(mediaModel, creativeInfo, 49));
    }

    public static float LJFF(float f, float f2) {
        if (C151105wQ.LJIILJJIL <= 0.45f) {
            if (f2 < 0.5294118f || f2 <= f) {
                return f;
            }
            return f2;
        }
        if (f2 <= f || f2 <= ((Number) C151105wQ.LJIILIIL.getValue()).floatValue()) {
            return f;
        }
        return f2;
    }

    public static void LJIIIZ(CreativeInfo creativeInfo, MediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        if (!C151435wx.LIZ() || !mediaModel.LJ()) {
            return;
        }
        ((ExecutorService) LIZJ.getValue()).submit(new ARunnableS21S0200000_2(mediaModel, creativeInfo, 50));
    }

    public static RectF LIZJ(float f, Rect sourceRect, Rect targetRect) {
        o.LJIIIZ(sourceRect, "sourceRect");
        o.LJIIIZ(targetRect, "targetRect");
        return new RectF(((targetRect.left - r2) * f) + sourceRect.left, ((targetRect.top - r2) * f) + sourceRect.top, ((targetRect.right - r2) * f) + sourceRect.right, (f * (targetRect.bottom - r2)) + sourceRect.bottom);
    }

    public static void LJIIJ(File originalImageDir, File decodeBufferDir, ArrayList arrayList, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(originalImageDir, "originalImageDir");
        o.LJIIIZ(decodeBufferDir, "decodeBufferDir");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C149075t9(arrayList, originalImageDir, new ArrayList(), decodeBufferDir, concurrentHashMap, copyOnWriteArrayList, interfaceC88472Yns, System.currentTimeMillis(), null), 2);
    }

    public static boolean LJIIJJI(MediaModel mediaModel, String str, CopyOnWriteArrayList copyOnWriteArrayList, ConcurrentHashMap concurrentHashMap) {
        int[] LIZJ2;
        if (!C151525x6.LIZJ(mediaModel, str)) {
            return false;
        }
        copyOnWriteArrayList.add(str);
        if (mediaModel.height <= 0 || mediaModel.width <= 0) {
            int[] LIZJ3 = C42307Gj1.LIZJ(str);
            if (LIZJ3 == null) {
                H78.LIZJ("photo mode - get size null");
            } else {
                mediaModel.width = LIZJ3[0];
                mediaModel.height = LIZJ3[1];
            }
        }
        try {
            if (C42117Gfx.LIZLLL() && (LIZJ2 = C42307Gj1.LIZJ(str)) != null) {
                int i = LIZJ2[1];
                double d = i;
                int i2 = LIZJ2[0];
                double d2 = i2;
                double d3 = d2 * 2.4d;
                if (d > d3) {
                    C42111Gfr.LIZLLL(str, str, i2, (int) d3, 1, Bitmap.CompressFormat.JPEG);
                } else {
                    double d4 = d * 2.4d;
                    if (d2 > d4) {
                        C42111Gfr.LIZLLL(str, str, (int) d4, i, 1, Bitmap.CompressFormat.JPEG);
                    }
                }
            }
            String str2 = mediaModel.fileLocalUriPath;
            o.LJIIIIZZ(str2, "mediaModel.fileLocalUriPath");
            MediaModel mediaModel2 = new MediaModel(mediaModel.id);
            mediaModel2.fileLocalUriPath = str;
            C151535x7 c151535x7 = LIZ;
            String str3 = mediaModel.fileLocalUriPath;
            o.LJIIIIZZ(str3, "mediaModel.fileLocalUriPath");
            c151535x7.getClass();
            if (LJI(str3) % 180 == 90) {
                mediaModel2.width = mediaModel.height;
                mediaModel2.height = mediaModel.width;
            } else {
                mediaModel2.width = mediaModel.width;
                mediaModel2.height = mediaModel.height;
            }
            concurrentHashMap.put(str2, mediaModel2);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
