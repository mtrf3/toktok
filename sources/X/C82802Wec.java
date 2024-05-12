package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.Wec, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82802Wec {
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static final C82802Wec LIZ = new C82802Wec();
    public static final ConcurrentHashMap<String, C82803Wed<?>> LIZIZ = new ConcurrentHashMap<>();
    public static final PriorityBlockingQueue<C82803Wed<?>> LIZJ = new PriorityBlockingQueue<>();
    public static final Handler LJFF = new Handler(C16880lQ.LLJJJJ());

    public final boolean LJII() {
        N26 n26;
        C82803Wed<?> c82803Wed = LIZIZ.get("story_widget_guide");
        if (c82803Wed != null && (n26 = c82803Wed.LJLILLLLZI) != null) {
            int i = N24.LIZ[n26.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && LIZLLL(InputStream.class, "story_widget_guide") != null) {
                        return true;
                    }
                } else if (LIZLLL(File.class, "story_widget_guide") != null) {
                    return true;
                }
            } else if (LIZLLL(Bitmap.class, "story_widget_guide") != null) {
                return true;
            }
        }
        return false;
    }

    public final File LJI() {
        boolean z;
        File file;
        String absolutePath;
        C39030FTm.LIZIZ();
        String str = C82803Wed.LJLLJ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        File file2 = new File(JBR.LJFF(LIZ2, C82803Wed.LJLLJ, "text_dark_medium", LIZ2));
        if (!file2.exists()) {
            return null;
        }
        File[] it = file2.listFiles();
        o.LJIIIIZZ(it, "it");
        if (it.length == 0 || (file = it[0]) == null || (absolutePath = file.getAbsolutePath()) == null) {
            return null;
        }
        LIZ.getClass();
        return (File) LJIILL(File.class, absolutePath);
    }

    public static Bitmap LIZIZ(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            o.LJIIIIZZ(createBitmap, "{\n            Bitmap.cre…ed of 1x1 pixel\n        }");
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            o.LJIIIIZZ(createBitmap, "{\n            Bitmap.cre…8\n            )\n        }");
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static void LJIILIIL(String str) {
        String str2;
        C82803Wed<?> c82803Wed;
        EnumC82806Weg enumC82806Weg;
        while (true) {
            try {
                PriorityBlockingQueue<C82803Wed<?>> priorityBlockingQueue = LIZJ;
                if (!priorityBlockingQueue.isEmpty()) {
                    C82803Wed<?> poll = priorityBlockingQueue.poll();
                    if (poll != null && (str2 = poll.LJLIL) != null && (c82803Wed = LIZIZ.get(str2)) != null && c82803Wed.LJLJL && c82803Wed.LJLJJI.getValue() > N28.NO_PRELOAD.getValue() && ((enumC82806Weg = c82803Wed.LJLJLLL) != EnumC82806Weg.DOWNLOADING || enumC82806Weg != EnumC82806Weg.SUCCESS)) {
                        if (!c82803Wed.LIZJ()) {
                            LIZ.getClass();
                            LIZ(c82803Wed, str);
                            return;
                        }
                    }
                } else {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    public static void LJIIZILJ(String str) {
        File[] listFiles;
        C82803Wed<?> c82803Wed = LIZIZ.get(str);
        if (c82803Wed != null) {
            if (!c82803Wed.LIZJ()) {
                EnumC82806Weg enumC82806Weg = EnumC82806Weg.FAIL;
                o.LJIIIZ(enumC82806Weg, "<set-?>");
                c82803Wed.LJLJLLL = enumC82806Weg;
                c82803Wed.LJLLI++;
                LIZJ.add(c82803Wed);
            } else {
                c82803Wed.LJLLI = 0;
            }
            for (Map.Entry<InterfaceC82810Wek<?>, Class<?>> entry : c82803Wed.LJLLILLLL.entrySet()) {
                Class<?> value = entry.getValue();
                InterfaceC82810Wek<?> key = entry.getKey();
                if (o.LJ(value, String.class)) {
                    o.LJII(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<kotlin.String>");
                    LIZ.getClass();
                    key.LIZ(LJIILLIIL(str, String.class));
                } else if (o.LJ(value, Bitmap.class)) {
                    o.LJII(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<android.graphics.Bitmap>");
                    LIZ.getClass();
                    key.LIZ(LJIILLIIL(str, Bitmap.class));
                } else if (o.LJ(value, File.class)) {
                    o.LJII(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<java.io.File>");
                    LIZ.getClass();
                    key.LIZ(LJIILLIIL(str, File.class));
                } else {
                    key.LIZ(null);
                }
            }
            c82803Wed.LJLLILLLL.clear();
            C82802Wec c82802Wec = LIZ;
            String LIZLLL2 = c82803Wed.LIZLLL();
            String LJ2 = c82803Wed.LJ();
            c82802Wec.getClass();
            File file = new File(LIZLLL2);
            if (file.exists() && (listFiles = file.listFiles(new C82809Wej(LJ2))) != null) {
                for (File file2 : listFiles) {
                    C16880lQ.LLLZZIL(file2);
                }
            }
        }
    }

    public final boolean LJIIL(C29701Eo c29701Eo) {
        LIZ.getClass();
        InputStream inputStream = (InputStream) LIZLLL(InputStream.class, "story_widget_guide");
        if (inputStream != null) {
            try {
                C04650Gf.LJI(inputStream, null).LIZIZ(new A0I(c29701Eo));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void LIZ(C82803Wed c82803Wed, String str) {
        LJIIIIZZ(c82803Wed.LJLIL, "start", str);
        C82804Wee c82804Wee = new C82804Wee(c82803Wed, str);
        try {
            String LIZLLL2 = c82803Wed.LIZLLL();
            if (LIZLLL2 != null && LIZLLL2.length() != 0) {
                X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(c82803Wed.LJLJI);
                with.LJ = LIZLLL2;
                with.LJII = 3;
                with.LIZJ = c82803Wed.LJ();
                with.LJIIJ = "dynamic_resource_download";
                with.LJIIL = c82804Wee;
                with.LIZJ();
                EnumC82806Weg enumC82806Weg = EnumC82806Weg.DOWNLOADING;
                o.LJIIIZ(enumC82806Weg, "<set-?>");
                c82803Wed.LJLJLLL = enumC82806Weg;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static Object LIZJ(Class cls, String str) {
        C82803Wed<?> c82803Wed = LIZIZ.get(str);
        if (c82803Wed == null || !c82803Wed.LIZJ()) {
            return null;
        }
        C82802Wec c82802Wec = LIZ;
        String str2 = c82803Wed.LJLL;
        c82802Wec.getClass();
        return LJIILL(cls, str2);
    }

    public static Object LIZLLL(Class cls, String str) {
        Object obj;
        String str2;
        Object LIZJ2 = LIZJ(cls, str);
        if (LIZJ2 != null) {
            LJIIIZ(str, "sync", "sync_hit_cache");
        } else {
            ConcurrentHashMap<String, C82803Wed<?>> concurrentHashMap = LIZIZ;
            C82803Wed<?> c82803Wed = concurrentHashMap.get(str);
            if (c82803Wed != null) {
                LIZ.getClass();
                LIZ(c82803Wed, "sync");
            }
            C82803Wed<?> c82803Wed2 = concurrentHashMap.get(str);
            if (c82803Wed2 != null) {
                obj = c82803Wed2.LJLJLJ;
            } else {
                obj = null;
            }
            LIZJ2 = LJIILJJIL(cls, obj);
            if (LIZJ2 != null) {
                str2 = "sync_hit_fallback";
            } else {
                str2 = "sync_miss";
            }
            LJIIIZ(str, "sync", str2);
        }
        return LIZJ2;
    }

    public static final void LJFF(String str, InterfaceC82810Wek<? super Bitmap> interfaceC82810Wek) {
        LJ(str, Bitmap.class, interfaceC82810Wek);
    }

    public static final boolean LJIIJ(ImageView imageView, String str) {
        LIZ.getClass();
        Bitmap bitmap = (Bitmap) LIZLLL(Bitmap.class, str);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:7:0x0069
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static java.lang.Object LJIILJJIL(java.lang.Class r1, java.lang.Object r2) {
        /*
            if (r2 == 0) goto L69
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L33
            boolean r0 = r2 instanceof android.graphics.drawable.Drawable     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L1c
            X.Wec r0 = X.C82802Wec.LIZ     // Catch: java.lang.Exception -> L69
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2     // Catch: java.lang.Exception -> L69
            r0.getClass()     // Catch: java.lang.Exception -> L69
            android.graphics.Bitmap r0 = LIZIZ(r2)     // Catch: java.lang.Exception -> L69
            if (r0 != 0) goto L6a
            goto L69
        L1c:
            boolean r0 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L69
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Exception -> L69
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L69
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> L69
            int r0 = r2.intValue()     // Catch: java.lang.Exception -> L69
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)     // Catch: java.lang.Exception -> L69
            goto L6a
        L33:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L69
            boolean r0 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L52
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Exception -> L69
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L69
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Exception -> L69
            int r0 = r2.intValue()     // Catch: java.lang.Exception -> L69
            java.io.InputStream r0 = r1.openRawResource(r0)     // Catch: java.lang.Exception -> L69
            goto L6a
        L52:
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L69
            android.content.Context r0 = X.EF7.LIZIZ()     // Catch: java.lang.Exception -> L69
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L69
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Exception -> L69
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L69
            java.io.InputStream r0 = r0.open(r2)     // Catch: java.lang.Exception -> L69
            goto L6a
        L69:
            r0 = 0
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82802Wec.LJIILJJIL(java.lang.Class, java.lang.Object):java.lang.Object");
    }

    public static Object LJIILL(Class cls, String str) {
        Object fileInputStream;
        if (o.LJ(cls, String.class)) {
            return str;
        }
        if (o.LJ(cls, Bitmap.class)) {
            return BitmapFactory.decodeFile(str);
        }
        if (o.LJ(cls, File.class)) {
            fileInputStream = new File(str);
        } else if (o.LJ(cls, InputStream.class)) {
            fileInputStream = new FileInputStream(str);
        } else {
            return null;
        }
        return fileInputStream;
    }

    public static Object LJIILLIIL(String str, Class cls) {
        Object obj;
        String str2;
        Object LIZJ2 = LIZJ(cls, str);
        if (LIZJ2 != null) {
            LJIIIZ(str, "async", "async_re_download_success");
        } else {
            C82803Wed<?> c82803Wed = LIZIZ.get(str);
            if (c82803Wed != null) {
                obj = c82803Wed.LJLJLJ;
            } else {
                obj = null;
            }
            LIZJ2 = LJIILJJIL(cls, obj);
            if (LIZJ2 != null) {
                str2 = "async_re_download_fallback";
            } else {
                str2 = "async_re_download_fail";
            }
            LJIIIZ(str, "async", str2);
        }
        return LIZJ2;
    }

    public static void LJ(String str, Class cls, InterfaceC82810Wek interfaceC82810Wek) {
        C82805Wef c82805Wef = new C82805Wef(interfaceC82810Wek);
        C82803Wed<?> c82803Wed = LIZIZ.get(str);
        if (c82803Wed != null) {
            LIZ.getClass();
            Object LIZJ2 = LIZJ(cls, str);
            if (LIZJ2 != null) {
                LJIIIZ(str, "async", "async_hit_cache");
                c82805Wef.LIZ(LIZJ2);
            } else {
                c82803Wed.LJLLILLLL.put(c82805Wef, cls);
                if (c82803Wed.LJLJLLL != EnumC82806Weg.DOWNLOADING) {
                    LIZ(c82803Wed, "async");
                }
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        c82805Wef.LIZ(null);
    }

    public static void LJIIIIZZ(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("key", str);
        c188727au.LJIIIZ("status", str2);
        c188727au.LJIIIZ("launch_type", str3);
        FMX.LJIIL("heli_download_resource", c188727au.LIZ);
    }

    public static void LJIIIZ(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("key", str);
        c188727au.LJIIIZ("type", str2);
        c188727au.LJIIIZ("result", str3);
        FMX.LJIIL("heli_get_resource", c188727au.LIZ);
    }

    public static final void LJIIJJI(ImageView imageView, String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        C82802Wec c82802Wec = LIZ;
        C62040OWm c62040OWm = new C62040OWm(interfaceC88472Yns, imageView);
        c82802Wec.getClass();
        LJ(str, Bitmap.class, c62040OWm);
    }
}
