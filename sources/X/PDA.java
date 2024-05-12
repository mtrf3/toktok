package X;

import Y.IDComparatorS342S0100000_11;
import Y.IDComparatorS39S0000000_11;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Size;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class PDA {
    public static String LIZ;
    public static final boolean LIZIZ;
    public static final boolean LJ;
    public static Class LJFF;
    public static Field LJI;
    public static Method LJII;
    public static byte LJIIIIZZ;
    public static final String[] LIZJ = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};
    public static final String[] LIZLLL = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};
    public static final ArrayList<TEFrameSizei> LJIIIZ = new ArrayList<>(Arrays.asList(new TEFrameSizei(160, LiveTryModeCountDownThresholdSetting.DEFAULT), new TEFrameSizei(240, 160), new TEFrameSizei(320, 240), new TEFrameSizei(LiveChatShowDelayForHotLiveSetting.DEFAULT, 240), new TEFrameSizei(480, 320), new TEFrameSizei(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 360), new TEFrameSizei(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 480), new TEFrameSizei(768, 480), new TEFrameSizei(854, 480), new TEFrameSizei(800, 600), new TEFrameSizei(960, 540), new TEFrameSizei(960, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT), new TEFrameSizei(1024, 576), new TEFrameSizei(1024, 600), new TEFrameSizei(1280, 720), new TEFrameSizei(1280, 1024), new TEFrameSizei(1920, 1080), new TEFrameSizei(1920, 1440), new TEFrameSizei(2560, 1440), new TEFrameSizei(3840, 2160)));

    public static int LIZLLL(int i) {
        if (i > 1000) {
            return 1000;
        }
        if (i < -1000) {
            return -1000;
        }
        return i;
    }

    public static Object LJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1050918739491767169"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b2, code lost:
    
        r1 = r1[1].trim();
        X.PDA.LIZ = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ba, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c0, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x012f  */
    static {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PDA.<clinit>():void");
    }

    public static List<TEFrameSizei> LJI(List<Size> list) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            arrayList2.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList2;
    }

    public static boolean LJIIIIZZ(Object obj) {
        try {
            if (LJFF == null || LJI == null || LJII == null) {
                LJFF = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                LJI = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = LJFF.getDeclaredMethod("finalize", new Class[0]);
                LJII = declaredMethod;
                declaredMethod.setAccessible(true);
                LJI.setAccessible(true);
            }
            LJII.invoke(LJI.get(obj), new Object[0]);
            return true;
        } catch (ClassNotFoundException unused) {
            C63922P6w.LJ("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (IllegalAccessException unused2) {
            C63922P6w.LJ("TECameraUtils", "illegal access");
            return false;
        } catch (NoSuchFieldException unused3) {
            C63922P6w.LJ("TECameraUtils", "mResults field not found");
            return false;
        } catch (NoSuchMethodException unused4) {
            C63922P6w.LJ("TECameraUtils", "finalize method not found");
            return false;
        } catch (InvocationTargetException unused5) {
            C63922P6w.LJ("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception unused6) {
            C63922P6w.LJ("TECameraUtils", "unknown error");
            return false;
        }
    }

    public static int LJIIL(Context context) {
        int rotation = ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    public static boolean LJIILL(Rect rect) {
        if (rect != null && !rect.isEmpty() && rect.left >= 0 && rect.right >= 0 && rect.top >= 0 && rect.bottom >= 0) {
            return true;
        }
        return false;
    }

    public static TEFrameSizei LIZ(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        Iterator it = ((ArrayList) list).iterator();
        TEFrameSizei tEFrameSizei2 = null;
        while (it.hasNext()) {
            TEFrameSizei tEFrameSizei3 = (TEFrameSizei) it.next();
            int i = tEFrameSizei3.width;
            if (i > tEFrameSizei.width && tEFrameSizei3.height > tEFrameSizei.height && (tEFrameSizei2 == null || i < tEFrameSizei2.width)) {
                tEFrameSizei2 = tEFrameSizei3;
            }
        }
        if (tEFrameSizei2 == null) {
            return null;
        }
        return tEFrameSizei2;
    }

    public static TEFrameSizei LIZIZ(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        int i;
        TEFrameSizei tEFrameSizei2 = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int i2 = tEFrameSizei.width;
        int i3 = tEFrameSizei.height;
        float f = i2 / i3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (Float.compare(f, tEFrameSizei3.width / tEFrameSizei3.height) == 0) {
                arrayList.add(tEFrameSizei3);
            } else {
                arrayList2.add(tEFrameSizei3);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new IDComparatorS39S0000000_11(9));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TEFrameSizei tEFrameSizei4 = (TEFrameSizei) it.next();
                if (tEFrameSizei2 != null) {
                    int i4 = tEFrameSizei4.width;
                    if (i4 == i2 && tEFrameSizei4.height == i3) {
                        return tEFrameSizei4;
                    }
                    if (i4 <= i2 || i4 >= tEFrameSizei2.width) {
                        if (i4 < i2) {
                            return tEFrameSizei2;
                        }
                    }
                }
                tEFrameSizei2 = tEFrameSizei4;
            }
            return tEFrameSizei2;
        }
        Collections.sort(arrayList2, new IDComparatorS39S0000000_11(4));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            TEFrameSizei tEFrameSizei5 = (TEFrameSizei) it2.next();
            if (tEFrameSizei2 == null || ((i = tEFrameSizei5.width) >= i2 && tEFrameSizei5.height >= i3)) {
                tEFrameSizei2 = tEFrameSizei5;
            } else if (i < i2 && tEFrameSizei5.height < i3) {
                return tEFrameSizei2;
            }
        }
        return tEFrameSizei2;
    }

    public static TEFrameSizei LIZJ(List<TEFrameSizei> list, float f) {
        if (f <= 0.0f || list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei : list) {
            if (Float.compare(f, tEFrameSizei.width / tEFrameSizei.height) == 0) {
                arrayList.add(tEFrameSizei);
            } else {
                arrayList2.add(tEFrameSizei);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<TEFrameSizei> arrayList3 = LJIIIZ;
            if (arrayList.contains(ListProtector.get(arrayList3, 14))) {
                return (TEFrameSizei) ListProtector.get(arrayList3, 14);
            }
            if (arrayList.contains(ListProtector.get(arrayList3, 16))) {
                return (TEFrameSizei) ListProtector.get(arrayList3, 16);
            }
            Collections.sort(arrayList, new IDComparatorS39S0000000_11(5));
            return (TEFrameSizei) ListProtector.get(arrayList, 0);
        }
        ArrayList<TEFrameSizei> arrayList4 = LJIIIZ;
        if (arrayList2.contains(ListProtector.get(arrayList4, 14))) {
            return (TEFrameSizei) ListProtector.get(arrayList4, 14);
        }
        if (arrayList.contains(ListProtector.get(arrayList4, 16))) {
            return (TEFrameSizei) ListProtector.get(arrayList4, 16);
        }
        Collections.sort(arrayList2, new IDComparatorS39S0000000_11(6));
        return (TEFrameSizei) ListProtector.get(arrayList, arrayList.size() / 2);
    }

    public static boolean LJFF(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int[] LJIIIZ(List list, int[] iArr) {
        int[] iArr2;
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr3 = (int[]) it.next();
                if (iArr[0] > 1000) {
                    if (iArr3[1] == 30000) {
                        arrayList.add(iArr3);
                    } else {
                        arrayList2.add(iArr3);
                    }
                } else if (iArr3[1] == 30) {
                    arrayList.add(iArr3);
                } else {
                    arrayList2.add(iArr3);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new IDComparatorS39S0000000_11(10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    iArr2 = (int[]) it2.next();
                    if (iArr2[0] <= iArr[0]) {
                        break;
                    }
                }
            }
            iArr2 = (int[]) Collections.min(list, new IDComparatorS342S0100000_11(iArr, 1));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("calculate fps range = [");
            LIZ2.append(iArr2[0]);
            LIZ2.append(",");
            LIZ2.append(iArr2[1]);
            LIZ2.append("]");
            C63922P6w.LIZ("TECameraUtils", X1D.LIZIZ(LIZ2));
            return iArr2;
        }
        C63922P6w.LJ("TECameraUtils", "supported fpsRange is null,use [7,30]");
        return new int[]{7, 30};
    }

    public static int[] LJIILIIL(List list, int[] iArr) {
        int[] iArr2;
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr3 = (int[]) it.next();
                if (iArr3[1] == iArr3[0]) {
                    arrayList.add(iArr3);
                } else {
                    arrayList2.add(iArr3);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new IDComparatorS39S0000000_11(3));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    iArr2 = (int[]) it2.next();
                    int i = iArr2[0];
                    if (i >= 15 && (i <= 30 || (i >= 15000 && iArr2[1] <= 30000))) {
                        if (iArr[1] == iArr2[1]) {
                            break;
                        }
                    }
                }
            }
            iArr2 = (int[]) Collections.min(list, new IDComparatorS342S0100000_11(iArr, 1));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("calculate fps range = [");
            LIZ2.append(iArr2[0]);
            LIZ2.append(",");
            LIZ2.append(iArr2[1]);
            LIZ2.append("]");
            C63922P6w.LIZ("TECameraUtils", X1D.LIZIZ(LIZ2));
            return iArr2;
        }
        C63922P6w.LJ("TECameraUtils", "supported fpsRange is null,use [30,30]");
        return new int[]{30, 30};
    }

    public static TEFrameSizei LJIIJJI(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
        ArrayList arrayList = new ArrayList(list);
        if (tEFrameSizei != null && tEFrameSizei.width > 0 && tEFrameSizei.height > 0) {
            if (tEFrameSizei.equals(tEFrameSizei2) && arrayList.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TEFrameSizei tEFrameSizei3 = (TEFrameSizei) it.next();
                if (tEFrameSizei3.width * tEFrameSizei.height != tEFrameSizei3.height * tEFrameSizei.width) {
                    it.remove();
                }
            }
        }
        Collections.sort(arrayList, new IDComparatorS39S0000000_11(7));
        Iterator it2 = arrayList.iterator();
        TEFrameSizei tEFrameSizei4 = null;
        while (it2.hasNext()) {
            TEFrameSizei tEFrameSizei5 = (TEFrameSizei) it2.next();
            if (tEFrameSizei4 != null) {
                if (tEFrameSizei5.width == tEFrameSizei2.width && tEFrameSizei5.height == tEFrameSizei2.height) {
                    return tEFrameSizei5;
                }
                int i = tEFrameSizei5.height;
                int i2 = tEFrameSizei2.height;
                if (i <= i2 || i >= tEFrameSizei4.height) {
                    if (i < i2) {
                        return tEFrameSizei4;
                    }
                }
            }
            tEFrameSizei4 = tEFrameSizei5;
        }
        return tEFrameSizei4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("getClosestSupportedSize failed, maxWidth: ");
        r1.append(r8);
        r1.append(", accuracy: ");
        r1.append(r9);
        r1.append(", previewSize: ");
        r1.append(r7);
        X.C63922P6w.LIZIZ("TECameraUtils", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008b, code lost:
    
        if (r0 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ttvecamera.TEFrameSizei LJIIJ(java.util.List<com.ss.android.ttvecamera.TEFrameSizei> r6, com.ss.android.ttvecamera.TEFrameSizei r7, int r8, float r9) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            if (r7 == 0) goto L3f
            int r0 = r7.width
            if (r0 <= 0) goto L3f
            int r0 = r7.height
            if (r0 <= 0) goto L3f
            java.util.Iterator r6 = r3.iterator()
            int r0 = r7.width
            float r4 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            int r0 = r7.height
            float r0 = (float) r0
            float r4 = r4 / r0
        L1d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r2 = r6.next()
            com.ss.android.ttvecamera.TEFrameSizei r2 = (com.ss.android.ttvecamera.TEFrameSizei) r2
            int r0 = r2.width
            float r1 = (float) r0
            float r1 = r1 * r5
            int r0 = r2.height
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = r4 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L1d
            r6.remove()
            goto L1d
        L3f:
            Y.IDComparatorS39S0000000_11 r1 = new Y.IDComparatorS39S0000000_11
            r0 = 8
            r1.<init>(r0)
            java.util.Collections.sort(r3, r1)
            java.util.Iterator r1 = r3.iterator()
        L4d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r2 = r1.next()
            com.ss.android.ttvecamera.TEFrameSizei r2 = (com.ss.android.ttvecamera.TEFrameSizei) r2
            int r0 = r2.width
            if (r0 > r8) goto L4d
        L5d:
            byte r0 = X.PDA.LJIIIIZZ
            r0 = r0 & 8
            if (r0 == 0) goto L79
            if (r2 == 0) goto L71
            int r1 = r2.width
            int r0 = r7.width
            if (r1 <= r0) goto L71
            int r1 = r2.height
            int r0 = r7.height
            if (r1 > r0) goto L78
        L71:
            com.ss.android.ttvecamera.TEFrameSizei r0 = LIZ(r3, r7)
            if (r0 == 0) goto L8e
        L77:
            r2 = r0
        L78:
            return r2
        L79:
            if (r2 == 0) goto L87
            int r1 = r2.width
            int r0 = r7.width
            if (r1 < r0) goto L87
            int r1 = r2.height
            int r0 = r7.height
            if (r1 >= r0) goto L78
        L87:
            com.ss.android.ttvecamera.TEFrameSizei r0 = LIZ(r3, r7)
            if (r0 == 0) goto L8e
            goto L77
        L8e:
            if (r2 != 0) goto L78
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getClosestSupportedSize failed, maxWidth: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", accuracy: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", previewSize: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "TECameraUtils"
            X.C63922P6w.LIZIZ(r0, r1)
            goto L78
        Lb6:
            r2 = 0
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PDA.LJIIJ(java.util.List, com.ss.android.ttvecamera.TEFrameSizei, int, float):com.ss.android.ttvecamera.TEFrameSizei");
    }

    public static int[] LJIILJJIL(int i, int i2, int[] iArr, List<int[]> list) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("requiredFpsRange : [");
        LIZ2.append(iArr[0]);
        LIZ2.append(",");
        LIZ2.append(iArr[1]);
        LIZ2.append("]");
        C63922P6w.LIZ("TECameraUtils", X1D.LIZIZ(LIZ2));
        if (i == 1) {
            C63922P6w.LIZ("TECameraUtils", "fixed framerate for all cameras");
            return LJIILIIL(list, iArr);
        }
        if (i == 2) {
            if (i2 == 0) {
                C63922P6w.LIZ("TECameraUtils", "fixed framerate for rear camera");
                return LJIILIIL(list, iArr);
            }
            C63922P6w.LIZ("TECameraUtils", "dynamic framerate for front camera");
            return LJIIIZ(list, iArr);
        }
        if (i == 3) {
            C63922P6w.LIZ("TECameraUtils", "dynamic framerate without select");
            return (int[]) Collections.min(list, new IDComparatorS342S0100000_11(iArr, 1));
        }
        if (i == 4) {
            C63922P6w.LIZ("TECameraUtils", "framerate by user");
            for (int[] iArr2 : list) {
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return iArr;
                }
            }
            return LJIIIZ(list, iArr);
        }
        C63922P6w.LIZ("TECameraUtils", "dynamic framerate");
        return LJIIIZ(list, iArr);
    }

    public static Object LJII(String str, int i, Context context, YQV yqv, Handler handler, PDC pdc) {
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = null;
        try {
            Method method = Class.forName(str).getMethod("create", Integer.TYPE, Context.class, YQV.class, Handler.class, PDB.class);
            method.setAccessible(true);
            obj = method.invoke(null, Integer.valueOf(i), context, yqv, handler, pdc);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("createCameraInstance for ");
            LIZ2.append(str);
            LIZ2.append(", exception occurred.");
            C63922P6w.LJFF("TECameraUtils", X1D.LIZIZ(LIZ2), e);
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("createCameraInstance for ", str, ", cost time = ");
        LIZIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        LIZIZ2.append("ms, cameraInstance = ");
        LIZIZ2.append(obj);
        C63922P6w.LIZLLL("TECameraUtils", X1D.LIZIZ(LIZIZ2));
        return obj;
    }
}
