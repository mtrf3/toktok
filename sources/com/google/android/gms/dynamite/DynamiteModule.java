package com.google.android.gms.dynamite;

import X.BinderC68153Qov;
import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C64363PNv;
import X.C65300Pk0;
import X.C67609Qg9;
import X.C68457Qtp;
import X.C68458Qtq;
import X.C68460Qts;
import X.C68462Qtu;
import X.C68465Qtx;
import X.C78840Uwu;
import X.EGR;
import X.F51;
import X.QH7;
import X.R1H;
import X.R1I;
import X.R1J;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes12.dex */
public final class DynamiteModule {
    public static Boolean LJ = null;
    public static String LJFF = null;
    public static boolean LJI = false;
    public static int LJII = -1;
    public static C68458Qtq LJIIJJI;
    public static C68457Qtp LJIIL;
    public final Context LIZ;
    public static final ThreadLocal<C68465Qtx> LJIIIIZZ = new ThreadLocal<>();
    public static final EGR LJIIIZ = new EGR();
    public static final C68462Qtu LJIIJ = new C68462Qtu();
    public static final R1H LIZIZ = new R1H();
    public static final R1I LIZJ = new R1I();
    public static final R1J LIZLLL = new R1J();

    /* loaded from: classes12.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static Cursor LIZ(ContentResolver contentResolver, Uri uri) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "3198023223587169617"));
        return LIZJ2.LIZ ? (Cursor) LIZJ2.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public DynamiteModule(Context context) {
        QH7.LJIIIIZZ(context);
        this.LIZ = context;
    }

    public static void LJI(ClassLoader classLoader) {
        C68457Qtp c68457Qtp;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c68457Qtp = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C68457Qtp) {
                    c68457Qtp = (C68457Qtp) queryLocalInterface;
                } else {
                    c68457Qtp = new C68457Qtp(iBinder);
                }
            }
            LJIIL = c68457Qtp;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C68460Qts("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r1 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C68458Qtq LJII(android.content.Context r5) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)
            X.Qtq r0 = com.google.android.gms.dynamite.DynamiteModule.LJIIJJI     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L9
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            return r0
        L9:
            r3 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = r5.createPackageContext(r1, r0)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            java.lang.Object r2 = r0.newInstance()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            if (r2 != 0) goto L24
            goto L51
        L24:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            boolean r0 = r1 instanceof X.C68458Qtq     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            if (r0 == 0) goto L35
            X.Qtq r1 = (X.C68458Qtq) r1     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            if (r1 == 0) goto L51
        L32:
            com.google.android.gms.dynamite.DynamiteModule.LJIIJJI = r1     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            goto L3b
        L35:
            X.Qtq r1 = new X.Qtq     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            r1.<init>(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            goto L32
        L3b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            return r1
        L3d:
            r0 = move-exception
            java.lang.String r2 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L51
            r2.concat(r1)     // Catch: java.lang.Throwable -> L53
        L51:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            return r3
        L53:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.LJII(android.content.Context):X.Qtq");
    }

    public final IBinder LIZJ(String str) {
        String str2;
        try {
            return (IBinder) this.LIZ.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            if (str.length() != 0) {
                str2 = "Failed to instantiate module class: ".concat(str);
            } else {
                str2 = new String("Failed to instantiate module class: ");
            }
            throw new C68460Qts(str2, e);
        }
    }

    public static int LIZIZ(Context context, String str) {
        try {
            ClassLoader classLoader = C16880lQ.LLLLL(context).getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!C64363PNv.LIZ(declaredField.get(null), str)) {
                new StringBuilder(String.valueOf(declaredField.get(null)).length() + 51 + str.length());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            new StringBuilder(str.length() + 45);
            return 0;
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf);
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        if (r8.LIZ != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule LIZLLL(android.content.Context r17, X.InterfaceC68461Qtt r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.LIZLLL(android.content.Context, X.Qtt, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    public static int LJ(Context context, String str, boolean z) {
        Field declaredField;
        Cursor cursor;
        int readInt;
        C68465Qtx c68465Qtx;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = LJ;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        declaredField = C16880lQ.LLLLL(context).getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        new StringBuilder(e.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    LJI(classLoader);
                                } catch (C68460Qts unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else {
                            if (!LJI) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int LJFF2 = LJFF(context, str, z);
                                        String str2 = LJFF;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader LJJJI = C78840Uwu.LJJJI();
                                            if (LJJJI == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = LJFF;
                                                    QH7.LJIIIIZZ(str3);
                                                    LJJJI = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = LJFF;
                                                    QH7.LJIIIIZZ(str4);
                                                    LJJJI = new F51(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            LJI(LJJJI);
                                            declaredField.set(null, LJJJI);
                                            LJ = bool2;
                                            return LJFF2;
                                        }
                                        return LJFF2;
                                    } catch (C68460Qts unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        LJ = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return LJFF(context, str, z);
                    } catch (C68460Qts e2) {
                        String valueOf = String.valueOf(e2.getMessage());
                        if (valueOf.length() != 0) {
                            "Failed to retrieve remote module version: ".concat(valueOf);
                        }
                        return 0;
                    }
                }
                C68458Qtq LJII2 = LJII(context);
                try {
                    if (LJII2 == null) {
                        return 0;
                    }
                    try {
                        Parcel LJLJI = LJII2.LJLJI(LJII2.LLJI(), 6);
                        int readInt2 = LJLJI.readInt();
                        LJLJI.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal<C68465Qtx> threadLocal = LJIIIIZZ;
                            C68465Qtx c68465Qtx2 = threadLocal.get();
                            if (c68465Qtx2 != null && (cursor2 = c68465Qtx2.LIZ) != null) {
                                return cursor2.getInt(0);
                            }
                            cursor = (Cursor) BinderC68153Qov.LLJJIII(LJII2.t(new BinderC68153Qov(context), str, z, LJIIIZ.get().longValue()));
                            if (cursor == null) {
                                return 0;
                            }
                            try {
                                if (!cursor.moveToFirst()) {
                                    cursor.close();
                                    return 0;
                                }
                                readInt = cursor.getInt(0);
                                if (readInt > 0 && (c68465Qtx = threadLocal.get()) != null && c68465Qtx.LIZ == null) {
                                    c68465Qtx.LIZ = cursor;
                                } else {
                                    cursor.close();
                                }
                            } catch (RemoteException e3) {
                                e = e3;
                                cursor3 = cursor;
                                String valueOf2 = String.valueOf(e.getMessage());
                                if (valueOf2.length() != 0) {
                                    "Failed to retrieve remote module version: ".concat(valueOf2);
                                }
                                if (cursor3 == null) {
                                    return 0;
                                }
                                cursor3.close();
                                return 0;
                            } catch (Throwable th) {
                                th = th;
                                cursor.close();
                                throw th;
                            }
                        } else if (readInt2 == 2) {
                            BinderC68153Qov binderC68153Qov = new BinderC68153Qov(context);
                            Parcel LLJI = LJII2.LLJI();
                            C67609Qg9.LIZIZ(LLJI, binderC68153Qov);
                            LLJI.writeString(str);
                            LLJI.writeInt(z ? 1 : 0);
                            Parcel LJLJI2 = LJII2.LJLJI(LLJI, 5);
                            readInt = LJLJI2.readInt();
                            LJLJI2.recycle();
                        } else {
                            BinderC68153Qov binderC68153Qov2 = new BinderC68153Qov(context);
                            Parcel LLJI2 = LJII2.LLJI();
                            C67609Qg9.LIZIZ(LLJI2, binderC68153Qov2);
                            LLJI2.writeString(str);
                            LLJI2.writeInt(z ? 1 : 0);
                            Parcel LJLJI3 = LJII2.LJLJI(LLJI2, 3);
                            readInt = LJLJI3.readInt();
                            LJLJI3.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e4) {
                        e = e4;
                    }
                } finally {
                    th = th;
                    if (cursor3 == null) {
                    }
                    cursor.close();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                QH7.LJIIIIZZ(context);
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r6 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJFF(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.LJFF(android.content.Context, java.lang.String, boolean):int");
    }
}
