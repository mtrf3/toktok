package X;

import Y.IDCallableS414S0100000;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.0Gf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04650Gf {
    public static final java.util.Map<String, C0GU<C0GY>> LIZ = new ConcurrentHashMap();
    public static boolean LIZIZ = false;
    public static final C0GZ LIZJ = new ComponentCallbacks2() { // from class: X.0GZ
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
            if (C03970Dp.LIZ) {
                ((ConcurrentHashMap) C04650Gf.LIZ).clear();
                C263911v.LIZIZ.LIZ.LJIIIIZZ(-1);
            }
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            if ((i != 5 && i != 10 && i != 40) || !C03970Dp.LIZ) {
                return;
            }
            ((ConcurrentHashMap) C04650Gf.LIZ).clear();
            C263911v.LIZIZ.LIZ.LJIIIIZZ(-1);
        }
    };

    public static boolean LIZIZ(C0GY c0gy) {
        if (c0gy == null) {
            return false;
        }
        Iterator<Map.Entry<String, C04750Gp>> it = c0gy.LIZLLL.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().LJI == null) {
                return false;
            }
        }
        return true;
    }

    public static C0GU<C0GY> LIZ(final String str, Callable<C0GQ<C0GY>> callable) {
        if (str != null) {
            C0GY LIZ2 = C263911v.LIZIZ.LIZ(str);
            if (LIZ2 != null) {
                return new C0GU<>(new IDCallableS414S0100000(LIZ2, 2));
            }
            if (str != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
                if (concurrentHashMap.containsKey(str)) {
                    return (C0GU) concurrentHashMap.get(str);
                }
            }
        }
        C0GU<C0GY> c0gu = new C0GU<>(callable);
        if (str != null) {
            c0gu.LIZIZ(new InterfaceC04760Gq<C0GY>() { // from class: X.1Er
                @Override // X.InterfaceC04760Gq
                public final void onResult(C0GY c0gy) {
                    ((ConcurrentHashMap) C04650Gf.LIZ).remove(str);
                }
            });
            c0gu.LIZ(new InterfaceC04760Gq<Throwable>() { // from class: X.1Es
                @Override // X.InterfaceC04760Gq
                public final void onResult(Throwable th) {
                    ((ConcurrentHashMap) C04650Gf.LIZ).remove(str);
                }
            });
            ((ConcurrentHashMap) LIZ).put(str, c0gu);
        }
        return c0gu;
    }

    public static C0GU<C0GY> LIZJ(Context context, final String str) {
        final Context LLLLL = C16880lQ.LLLLL(context);
        return LIZ(str, new Callable<C0GQ<C0GY>>() { // from class: X.0Ga
            @Override // java.util.concurrent.Callable
            public final C0GQ<C0GY> call() {
                return C04650Gf.LIZLLL(LLLLL, str);
            }
        });
    }

    public static C0GQ<C0GY> LIZLLL(Context context, String str) {
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("asset_");
            LIZ2.append(str);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (str.endsWith(".zip")) {
                return LJIIJ(new ZipInputStream(context.getAssets().open(str)), LIZIZ2);
            }
            return LJII(context.getAssets().open(str), LIZIZ2, true);
        } catch (IOException e) {
            return new C0GQ<>((Throwable) e);
        }
    }

    public static C0GU<C0GY> LJI(final InputStream inputStream, final String str) {
        return LIZ(str, new Callable<C0GQ<C0GY>>() { // from class: X.0Gb
            @Override // java.util.concurrent.Callable
            public final C0GQ<C0GY> call() {
                return C04650Gf.LJII(inputStream, str, true);
            }
        });
    }

    public static C0GQ<C0GY> LJIIIIZZ(JsonReader jsonReader, String str) {
        try {
            C0GY LIZ2 = C04370Fd.LIZ(jsonReader);
            C263911v.LIZIZ.LIZIZ(LIZ2, str);
            return new C0GQ<>(LIZ2);
        } catch (Exception e) {
            return new C0GQ<>((Throwable) e);
        }
    }

    public static C0GU<C0GY> LJIIIZ(Context context, String str) {
        return new C0GU<>(new IDCallableS414S0100000(new C00W(context, str), 0));
    }

    public static C0GQ<C0GY> LJIIJ(ZipInputStream zipInputStream, String str) {
        try {
            return LJIIJJI(zipInputStream, str);
        } finally {
            C06310Mp.LIZJ(zipInputStream);
        }
    }

    public static C0GQ<C0GY> LJIIJJI(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C0GY c0gy = null;
            while (nextEntry != null) {
                if (nextEntry.getName().contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c0gy = LJII(zipInputStream, str, false).LIZ;
                } else if (nextEntry.getName().contains(".png")) {
                    hashMap.put(nextEntry.getName().split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c0gy == null) {
                return new C0GQ<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                Iterator<C04750Gp> it = c0gy.LIZLLL.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C04750Gp next = it.next();
                        if (next.LIZLLL.equals(key)) {
                            if (C03970Dp.LIZ) {
                                next.LJI = C06310Mp.LJFF((Bitmap) entry.getValue(), next.LIZ, next.LIZIZ, next);
                            } else {
                                next.LJI = (Bitmap) entry.getValue();
                            }
                        }
                    }
                }
            }
            for (Map.Entry<String, C04750Gp> entry2 : c0gy.LIZLLL.entrySet()) {
                if (entry2.getValue().LJI == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("There is no image for ");
                    LIZ2.append(entry2.getValue().LIZLLL);
                    return new C0GQ<>((Throwable) new IllegalStateException(X1D.LIZIZ(LIZ2)));
                }
            }
            C263911v.LIZIZ.LIZIZ(c0gy, str);
            return new C0GQ<>(c0gy);
        } catch (IOException e) {
            return new C0GQ<>((Throwable) e);
        }
    }

    public static void LJFF(final String str, final InterfaceC29711Ep interfaceC29711Ep, final C0GL c0gl) {
        C0GY LIZ2 = C263911v.LIZIZ.LIZ(null);
        if (LIZIZ(LIZ2)) {
            c0gl.LIZIZ(LIZ2);
        } else {
            C0GU.LJI.execute(new C0GW(c0gl, interfaceC29711Ep) { // from class: X.1Eu
                public final /* synthetic */ String LJLJJL = null;

                public final void LIZ() {
                    String str2 = str;
                    final String str3 = this.LJLJJL;
                    WeakReference<InterfaceC29711Ep> weakReference = this.LJLIL;
                    WeakReference<C0GL> weakReference2 = this.LJLILLLLZI;
                    if (weakReference.get() == null || weakReference2.get() == null) {
                        return;
                    }
                    InterfaceC29711Ep interfaceC29711Ep2 = weakReference.get();
                    final C0GL c0gl2 = weakReference2.get();
                    try {
                        C0GY c0gy = C04650Gf.LJII(new FileInputStream(new File(str2)), str3, true).LIZ;
                        if (c0gy == null) {
                            c0gl2.LIZ("fromJsonFileAsyncInternal Unable to parse composition and composition is null");
                        } else {
                            C04650Gf.LJIIL(c0gy, interfaceC29711Ep2, new C0GL() { // from class: X.1Ev
                                @Override // X.C0GL
                                public final void LIZ(String str4) {
                                    c0gl2.LIZ(str4);
                                }

                                @Override // X.C0GL
                                public final void LIZIZ(C0GY c0gy2) {
                                    C263911v.LIZIZ.LIZIZ(c0gy2, str3);
                                    c0gl2.LIZIZ(c0gy2);
                                }
                            });
                        }
                    } catch (Exception e) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("fromJsonFileAsyncInternal Unable to parse composition. Error msg is ");
                        LIZ3.append(e.toString());
                        c0gl2.LIZ(X1D.LIZIZ(LIZ3));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ3;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ3) {
                        }
                    }
                }
            });
        }
    }

    public static C0GQ<C0GY> LJII(InputStream inputStream, String str, boolean z) {
        try {
            return LJIIIIZZ(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C06310Mp.LIZJ(inputStream);
            }
        }
    }

    public static void LJIIL(C0GY c0gy, InterfaceC29711Ep interfaceC29711Ep, C0GL c0gl) {
        java.util.Map<String, C04750Gp> map = c0gy.LIZLLL;
        if (map == null || map.size() == 0) {
            c0gy.LJIIL = true;
            c0gl.LIZIZ(c0gy);
            return;
        }
        if (c0gy.LIZLLL != null) {
            AtomicInteger atomicInteger = new AtomicInteger(c0gy.LIZLLL.size());
            for (Map.Entry<String, C04750Gp> entry : c0gy.LIZLLL.entrySet()) {
                if (interfaceC29711Ep != null) {
                    C04750Gp value = entry.getValue();
                    if ("%s".equals(value.LIZLLL)) {
                        c0gy.LJIILIIL = true;
                        if (atomicInteger.decrementAndGet() == 0) {
                            c0gy.LJIIL = true;
                            c0gl.LIZIZ(c0gy);
                        }
                    } else {
                        interfaceC29711Ep.LJI(value, new C29751Et(value, atomicInteger, c0gy, c0gl));
                    }
                }
            }
        }
    }

    public static void LJ(final VNU vnu, final C0GL c0gl, final InterfaceC29711Ep interfaceC29711Ep, final String str, final String str2) {
        C0GY LIZ2 = C263911v.LIZIZ.LIZ(str2);
        if (LIZIZ(LIZ2)) {
            c0gl.LIZIZ(LIZ2);
        } else {
            C0GU.LJI.execute(new C0GW(vnu, c0gl, interfaceC29711Ep) { // from class: X.1Ew
                public final void LIZ() {
                    WeakReference<Context> weakReference = this.LJLJI;
                    String str3 = str;
                    final String str4 = str2;
                    WeakReference<InterfaceC29711Ep> weakReference2 = this.LJLIL;
                    WeakReference<C0GL> weakReference3 = this.LJLILLLLZI;
                    if (weakReference.get() == null || weakReference2.get() == null || weakReference3.get() == null) {
                        return;
                    }
                    Context context = weakReference.get();
                    final C0GL c0gl2 = weakReference3.get();
                    InterfaceC29711Ep interfaceC29711Ep2 = weakReference2.get();
                    try {
                        C0GY c0gy = C04650Gf.LIZLLL(context, str3).LIZ;
                        if (c0gy == null) {
                            c0gl2.LIZ("fromJsonAssetSyncInternal Unable to parse composition and composition is null");
                        } else {
                            C04650Gf.LJIIL(c0gy, interfaceC29711Ep2, new C0GL() { // from class: X.1Ex
                                @Override // X.C0GL
                                public final void LIZ(String str5) {
                                    c0gl2.LIZ(str5);
                                }

                                @Override // X.C0GL
                                public final void LIZIZ(C0GY c0gy2) {
                                    C263911v.LIZIZ.LIZIZ(c0gy2, str4);
                                    c0gl2.LIZIZ(c0gy2);
                                }
                            });
                        }
                    } catch (Exception e) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("load composition failed from asset. ");
                        LIZ3.append(e.getMessage());
                        c0gl2.LIZ(X1D.LIZIZ(LIZ3));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ3;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ3) {
                        }
                    }
                }
            });
        }
    }
}
