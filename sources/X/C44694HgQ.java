package X;

import Y.ACallableS34S1100000_7;
import Y.AgS110S0200000_7;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.LruCache;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HgQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44694HgQ {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C82892Wg4 LIZIZ;
    public static InterfaceC44698HgU LIZJ;
    public static InterfaceC44699HgV LIZLLL;
    public static final String[] LJ;
    public static final String[] LJFF;
    public static InterfaceC44697HgT LJI;
    public static final LruCache<String, String> LJII;
    public static final LruCache<String, String> LJIIIIZZ;
    public static final LruCache<String, Boolean> LJIIIZ;
    public static final String LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static final C44694HgQ LJIILIIL;

    static {
        TBV tbv = new TBV(C44694HgQ.class, "application", "getApplication()Landroid/app/Application;", 0);
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbv};
        LJIILIIL = new C44694HgQ();
        LIZIZ = new C82892Wg4(C44696HgS.LJLIL);
        LJ = new String[]{"png", "jpg", "jpeg", "bmp", "heif", "heic", "ico"};
        LJFF = new String[]{"gif", "webp"};
        LJII = new LruCache<>(200);
        LJIIIIZZ = new LruCache<>(200);
        LJIIIZ = new LruCache<>(200);
        LJIIJ = "MIME_TYPE_NULL_VALUE";
    }

    public final Application LJ() {
        return (Application) LIZIZ.LIZ(this, LIZ[0]);
    }

    public static final boolean LJJ() {
        InterfaceC44699HgV interfaceC44699HgV = LIZLLL;
        if (interfaceC44699HgV != null) {
            return interfaceC44699HgV.LIZIZ();
        }
        return true;
    }

    public static final void LJJIFFI() {
        if (LJIILIIL.LJ() != null) {
        } else {
            throw new IllegalArgumentException("invalid application info to set AdapterAndroidRUtils.application");
        }
    }

    public static final boolean LIZ(String str) {
        if (str != null) {
            for (String str2 : LJ) {
                if (s.LJJJLZIJ(str, str2, true)) {
                    return true;
                }
            }
            for (String str3 : LJFF) {
                if (s.LJJJLZIJ(str, str3, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final long LJFF(String str) {
        LJJIFFI();
        try {
            if (LJIL(str)) {
                return C268613q.LJIIIZ(LJIILIIL.LJ(), UriProtector.parse(str));
            }
            return new File(str).length();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static final String LJII(String str) {
        if (s.LJJJLZIJ(str, "image", true)) {
            List LJLJJL = s.LJLJJL(str, new String[]{"image/"}, 0, 6);
            if (LJLJJL.size() > 1) {
                return (String) ListProtector.get(LJLJJL, 1);
            }
            return "";
        }
        if (s.LJJJLZIJ(str, "video", true)) {
            List LJLJJL2 = s.LJLJJL(str, new String[]{"video/"}, 0, 6);
            if (LJLJJL2.size() > 1) {
                return (String) ListProtector.get(LJLJJL2, 1);
            }
            return "";
        }
        return "";
    }

    public static final android.net.Uri LJIIIIZZ(String str) {
        if (LJIL(str)) {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJIIIIZZ(parse, "Uri.parse(path)");
            return parse;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("file://");
        LIZ2.append(str);
        android.net.Uri parse2 = UriProtector.parse(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(parse2, "Uri.parse(\"file://$path\")");
        return parse2;
    }

    public static final ExifInterface LJIIIZ(String str) {
        LJJIFFI();
        try {
            if (LJIL(str) && Build.VERSION.SDK_INT >= 24) {
                Application LJ2 = LJIILIIL.LJ();
                ParcelFileDescriptor openFileDescriptor = LJ2.getContentResolver().openFileDescriptor(UriProtector.parse(str), "r");
                o.LJIIIIZZ(openFileDescriptor, "BdFileSystem.getFileDesc…on, Uri.parse(path), \"r\")");
                return new ExifInterface(openFileDescriptor.getFileDescriptor());
            }
            if (str == null) {
                return null;
            }
            return new ExifInterface(str);
        } catch (Exception e) {
            InterfaceC44698HgU interfaceC44698HgU = LIZJ;
            if (interfaceC44698HgU != null) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ2.append(android.util.Log.getStackTraceString(e));
                X1D.LIZIZ(LIZIZ2);
                interfaceC44698HgU.LIZ();
            }
            InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
            if (interfaceC44698HgU2 != null) {
                StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ3.append(android.util.Log.getStackTraceString(e));
                interfaceC44698HgU2.LIZIZ(1, X1D.LIZIZ(LIZIZ3));
            }
            return null;
        }
    }

    public static final C68887R1v LJIIJ(String str) {
        String str2;
        LJJIFFI();
        C68887R1v c68887R1v = null;
        try {
            if (LJIL(str)) {
                str2 = C00S.LIZIZ(LJIILIIL.LJ(), UriProtector.parse(str));
            } else {
                str2 = str;
            }
            if (str2 == null) {
                return null;
            }
            c68887R1v = new C68887R1v(str2);
            return c68887R1v;
        } catch (Exception e) {
            InterfaceC44698HgU interfaceC44698HgU = LIZJ;
            if (interfaceC44698HgU != null) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ2.append(android.util.Log.getStackTraceString(e));
                X1D.LIZIZ(LIZIZ2);
                interfaceC44698HgU.LIZ();
            }
            InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
            if (interfaceC44698HgU2 != null) {
                StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ3.append(android.util.Log.getStackTraceString(e));
                interfaceC44698HgU2.LIZIZ(1, X1D.LIZIZ(LIZIZ3));
            }
            return c68887R1v;
        } catch (OutOfMemoryError unused) {
            InterfaceC44698HgU interfaceC44698HgU3 = LIZJ;
            if (interfaceC44698HgU3 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("path: ");
                LIZ2.append(str);
                LIZ2.append(", out of memory error");
                X1D.LIZIZ(LIZ2);
                interfaceC44698HgU3.LIZ();
            }
            InterfaceC44698HgU interfaceC44698HgU4 = LIZJ;
            if (interfaceC44698HgU4 != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("path: ");
                LIZ3.append(str);
                LIZ3.append(", out of memory error");
                interfaceC44698HgU4.LIZIZ(2, X1D.LIZIZ(LIZ3));
            }
            return c68887R1v;
        }
    }

    public static final C0MZ LJIIJJI(String str) {
        String str2;
        Application LJ2 = LJIILIIL.LJ();
        InterfaceC44698HgU interfaceC44698HgU = LIZJ;
        LJJIFFI();
        try {
            if (LJIL(str)) {
                str2 = C00S.LIZIZ(LJ2, UriProtector.parse(str));
            } else {
                str2 = str;
            }
            if (str2 != null) {
                return new C0MZ(str2);
            }
        } catch (Exception e) {
            if (interfaceC44698HgU != null) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ2.append(android.util.Log.getStackTraceString(e));
                X1D.LIZIZ(LIZIZ2);
                interfaceC44698HgU.LIZ();
            }
            if (interfaceC44698HgU != null) {
                StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ3.append(android.util.Log.getStackTraceString(e));
                interfaceC44698HgU.LIZIZ(1, X1D.LIZIZ(LIZIZ3));
            }
        } catch (OutOfMemoryError unused) {
            if (interfaceC44698HgU != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("path: ");
                LIZ2.append(str);
                LIZ2.append(", out of memory error");
                X1D.LIZIZ(LIZ2);
                interfaceC44698HgU.LIZ();
            }
            if (interfaceC44698HgU != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("path: ");
                LIZ3.append(str);
                LIZ3.append(", out of memory error");
                interfaceC44698HgU.LIZIZ(2, X1D.LIZIZ(LIZ3));
            }
        }
        return null;
    }

    public static final String LJIIL(MediaModel mediaModel) {
        if (mediaModel != null) {
            if (LJIL(mediaModel.fileLocalUriPath)) {
                StringBuilder LIZ2 = X1D.LIZ();
                File LLLLLLLLLL = C16880lQ.LLLLLLLLLL();
                o.LJIIIIZZ(LLLLLLLLLL, "Environment.getExternalStorageDirectory()");
                LIZ2.append(LLLLLLLLLL.getPath());
                LIZ2.append(File.separator);
                LIZ2.append(mediaModel.relativePath);
                LIZ2.append(mediaModel.fileName);
                return X1D.LIZIZ(LIZ2);
            }
            String str = mediaModel.fileLocalUriPath;
            o.LJIIIIZZ(str, "mediaModel.fileLocalUriPath");
            return str;
        }
        return "";
    }

    public static final String LJIILIIL(String str) {
        LJJIFFI();
        try {
            if (LJIL(str)) {
                C44694HgQ c44694HgQ = LJIILIIL;
                o.LJI(str);
                return c44694HgQ.LJIJ(str);
            }
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(LJIILL(str, false));
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String LJIILJJIL(String str) {
        boolean z;
        String str2;
        boolean z2 = false;
        String str3 = "";
        if (LJIIJJI) {
            if (str == null || ujb.o.LJJJJJL(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (str2 = LJIIIIZZ.get(str)) != null) {
                str3 = str2;
            }
        }
        String str4 = LJIIJ;
        if (o.LJ(str3, str4)) {
            return null;
        }
        if (!ujb.o.LJJJJJL(str3)) {
            return str3;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            LIZLLL(str, options);
            if (LJIIJJI) {
                if (str == null || ujb.o.LJJJJJL(str)) {
                    z2 = true;
                }
                if (!z2) {
                    LruCache<String, String> lruCache = LJIIIIZZ;
                    String str5 = options.outMimeType;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    lruCache.put(str, str4);
                }
            }
            return options.outMimeType;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final MediaMetadataRetriever LJIILLIIL(String str) {
        LJJIFFI();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (LJIL(str)) {
                mediaMetadataRetriever.setDataSource(LJIILIIL.LJ(), UriProtector.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
        } catch (Exception e) {
            InterfaceC44698HgU interfaceC44698HgU = LIZJ;
            if (interfaceC44698HgU != null) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ2.append(android.util.Log.getStackTraceString(e));
                X1D.LIZIZ(LIZIZ2);
                interfaceC44698HgU.LIZ();
            }
            InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
            if (interfaceC44698HgU2 != null) {
                StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ3.append(android.util.Log.getStackTraceString(e));
                interfaceC44698HgU2.LIZIZ(3, X1D.LIZIZ(LIZIZ3));
            }
        }
        return mediaMetadataRetriever;
    }

    public static final boolean LJIJJ(MediaModel mediaModel) {
        if (mediaModel == null) {
            return false;
        }
        if (LIZ(LJIILL(mediaModel.fileLocalUriPath, false)) && LIZ(mediaModel.mimeType)) {
            return true;
        }
        return LJIJI(mediaModel.fileLocalUriPath, true);
    }

    public static final boolean LJIL(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            if (parse != null) {
                str2 = parse.getScheme();
            } else {
                str2 = null;
            }
        } catch (Exception e) {
            InterfaceC44698HgU interfaceC44698HgU = LIZJ;
            if (interfaceC44698HgU != null) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ2.append(android.util.Log.getStackTraceString(e));
                X1D.LIZIZ(LIZIZ2);
                interfaceC44698HgU.LIZ();
            }
            InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
            if (interfaceC44698HgU2 != null) {
                StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ3.append(android.util.Log.getStackTraceString(e));
                interfaceC44698HgU2.LIZIZ(0, X1D.LIZIZ(LIZIZ3));
            }
        }
        if (o.LJ("content", str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0026, code lost:
    
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, X.C44694HgQ.LJIIJ) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIJ(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = X.C44694HgQ.LJIIJJI
            java.lang.String r4 = ""
            if (r0 == 0) goto L31
            android.util.LruCache<java.lang.String, java.lang.String> r0 = X.C44694HgQ.LJIIIIZZ
            java.lang.Object r3 = r0.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L2f
        L10:
            boolean r0 = ujb.o.LJJJJJL(r3)
            if (r0 != 0) goto L1e
            java.lang.String r0 = X.C44694HgQ.LJIIJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L28
        L1e:
            android.util.LruCache<java.lang.String, java.lang.String> r0 = X.C44694HgQ.LJII
            java.lang.Object r3 = r0.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L31
        L28:
            boolean r0 = ujb.o.LJJJJJL(r3)
            if (r0 == 0) goto L6d
            goto L33
        L2f:
            r3 = r4
            goto L10
        L31:
            r3 = r4
            goto L28
        L33:
            android.app.Application r0 = r5.LJ()     // Catch: java.lang.Exception -> L54
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Exception -> L54
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L54
            java.lang.String r0 = r0.getType(r1)     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L48
            r3 = r0
            goto L4a
        L48:
            java.lang.String r3 = X.C44694HgQ.LJIIJ     // Catch: java.lang.Exception -> L54
        L4a:
            boolean r0 = X.C44694HgQ.LJIIJJI     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L6d
            android.util.LruCache<java.lang.String, java.lang.String> r0 = X.C44694HgQ.LJII     // Catch: java.lang.Exception -> L54
            r0.put(r6, r3)     // Catch: java.lang.Exception -> L54
            goto L6d
        L54:
            X.HgU r2 = X.C44694HgQ.LIZJ
            if (r2 == 0) goto L6d
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "file path:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r0 = -10
            r2.LIZIZ(r0, r1)
        L6d:
            java.lang.String r0 = X.C44694HgQ.LJIIJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L76
            return r4
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44694HgQ.LJIJ(java.lang.String):java.lang.String");
    }

    public static boolean LIZIZ(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        FileChannel fileChannel3 = null;
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                fileChannel3 = fileOutputStream.getChannel();
                if (channel != null) {
                    channel.transferTo(0L, channel.size(), fileChannel3);
                }
                try {
                    fileInputStream.close();
                    if (channel != null) {
                        channel.close();
                    }
                    fileOutputStream.close();
                    if (fileChannel3 != null) {
                        fileChannel3.close();
                        return true;
                    }
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            } catch (Exception unused2) {
                fileChannel2 = fileChannel3;
                fileChannel3 = channel;
                try {
                    fileInputStream.close();
                    if (fileChannel3 != null) {
                        fileChannel3.close();
                    }
                    fileOutputStream.close();
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                } catch (Exception unused3) {
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileChannel = fileChannel3;
                fileChannel3 = channel;
                try {
                    fileInputStream.close();
                    if (fileChannel3 != null) {
                        fileChannel3.close();
                    }
                    fileOutputStream.close();
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    throw th;
                } catch (Exception unused4) {
                    return false;
                }
            }
        } catch (Exception unused5) {
            fileChannel2 = null;
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #10 {Exception -> 0x00b2, blocks: (B:66:0x00a9, B:58:0x00ae), top: B:65:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(java.lang.String r9, java.lang.String r10) {
        /*
            r7 = 0
            if (r9 == 0) goto L9
            int r0 = r9.length()
            if (r0 != 0) goto La
        L9:
            return r7
        La:
            if (r10 == 0) goto L9
            int r0 = r10.length()
            if (r0 != 0) goto L13
            goto L9
        L13:
            boolean r0 = X.C44687HgJ.LIZIZ(r9)
            if (r0 != 0) goto L1a
            return r7
        L1a:
            r8 = 0
            java.io.FileInputStream r3 = LJIIZILJ(r7, r9)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> Lb7
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> La4
            r2.<init>(r10)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> La4
            if (r3 != 0) goto L2f
            r2.close()     // Catch: java.lang.Exception -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L2e:
            return r7
        L2f:
            X.HgQ r0 = X.C44694HgQ.LJIILIIL     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            r0.getClass()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            boolean r1 = LIZIZ(r3, r2)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            r3.close()     // Catch: java.lang.Exception -> L3f
            r2.close()     // Catch: java.lang.Exception -> L3f
            goto L43
        L3f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L43:
            return r1
        L44:
            r1 = move-exception
            r8 = r2
            goto La5
        L47:
            r6 = move-exception
            r8 = r2
            goto L4b
        L4a:
            r6 = move-exception
        L4b:
            r5 = r8
            r8 = r3
            goto L50
        L4e:
            r6 = move-exception
            r5 = r8
        L50:
            X.HgU r2 = X.C44694HgQ.LIZJ     // Catch: java.lang.Throwable -> La2
            java.lang.String r4 = ", "
            java.lang.String r3 = "path:"
            if (r2 == 0) goto L72
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> La2
            r1.append(r3)     // Catch: java.lang.Throwable -> La2
            r1.append(r9)     // Catch: java.lang.Throwable -> La2
            r1.append(r4)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = android.util.Log.getStackTraceString(r6)     // Catch: java.lang.Throwable -> La2
            r1.append(r0)     // Catch: java.lang.Throwable -> La2
            X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> La2
            r2.LIZ()     // Catch: java.lang.Throwable -> La2
        L72:
            X.HgU r2 = X.C44694HgQ.LIZJ     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L92
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> La2
            r1.append(r3)     // Catch: java.lang.Throwable -> La2
            r1.append(r9)     // Catch: java.lang.Throwable -> La2
            r1.append(r4)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = android.util.Log.getStackTraceString(r6)     // Catch: java.lang.Throwable -> La2
            r1.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> La2
            r0 = 6
            r2.LIZIZ(r0, r1)     // Catch: java.lang.Throwable -> La2
        L92:
            if (r8 == 0) goto L97
            r8.close()     // Catch: java.lang.Exception -> L9d
        L97:
            if (r5 == 0) goto La1
            r5.close()     // Catch: java.lang.Exception -> L9d
            goto La1
        L9d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        La1:
            return r7
        La2:
            r1 = move-exception
            goto La7
        La4:
            r1 = move-exception
        La5:
            r5 = r8
            r8 = r3
        La7:
            if (r8 == 0) goto Lac
            r8.close()     // Catch: java.lang.Exception -> Lb2
        Lac:
            if (r5 == 0) goto Lb8
            r5.close()     // Catch: java.lang.Exception -> Lb2
            goto Lb8
        Lb2:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto Lb8
        Lb7:
            r1 = move-exception
        Lb8:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44694HgQ.LIZJ(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x007b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:33554555), block:B:42:0x007b */
    public static final Bitmap LIZLLL(String str, BitmapFactory.Options options) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor fd;
        LJJIFFI();
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Bitmap bitmap = null;
        r4 = null;
        Bitmap bitmap2 = null;
        try {
            if (LJIL(str)) {
                try {
                    fd = LJIILIIL.LJ().getContentResolver().openFileDescriptor(android.net.Uri.parse(str), "r");
                    try {
                        o.LJIIIIZZ(fd, "fd");
                        bitmap2 = BitmapFactory.decodeFileDescriptor(fd.getFileDescriptor(), null, options);
                    } catch (Exception e) {
                        e = e;
                        InterfaceC44698HgU interfaceC44698HgU = LIZJ;
                        if (interfaceC44698HgU != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("path:");
                            LIZ2.append(str);
                            LIZ2.append(", ");
                            LIZ2.append(android.util.Log.getStackTraceString(e));
                            X1D.LIZIZ(LIZ2);
                            interfaceC44698HgU.LIZ();
                        }
                        InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
                        if (interfaceC44698HgU2 != null) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("path:");
                            LIZ3.append(str);
                            LIZ3.append(", ");
                            LIZ3.append(android.util.Log.getStackTraceString(e));
                            interfaceC44698HgU2.LIZIZ(2, X1D.LIZIZ(LIZ3));
                        }
                        if (fd == null) {
                            return bitmap2;
                        }
                        fd.close();
                        return bitmap2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fd = null;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptor2 != null) {
                        parcelFileDescriptor2.close();
                    }
                    throw th;
                }
                fd.close();
                return bitmap2;
            }
            try {
                bitmap = BitmapFactory.decodeFile(str, options);
                return bitmap;
            } catch (Exception e3) {
                InterfaceC44698HgU interfaceC44698HgU3 = LIZJ;
                if (interfaceC44698HgU3 != null) {
                    StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                    LIZIZ2.append(android.util.Log.getStackTraceString(e3));
                    X1D.LIZIZ(LIZIZ2);
                    interfaceC44698HgU3.LIZ();
                }
                InterfaceC44698HgU interfaceC44698HgU4 = LIZJ;
                if (interfaceC44698HgU4 != null) {
                    StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                    LIZIZ3.append(android.util.Log.getStackTraceString(e3));
                    interfaceC44698HgU4.LIZIZ(2, X1D.LIZIZ(LIZIZ3));
                    return bitmap;
                }
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
            parcelFileDescriptor2 = parcelFileDescriptor;
        }
    }

    public static final String LJI(Context context, String str) {
        o.LJIIIZ(context, "context");
        if (str != null && LJIL(str)) {
            LJIILIIL.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            File LLIIIL = C16880lQ.LLIIIL(context);
            o.LJIIIIZZ(LLIIIL, "context.cacheDir");
            LIZ2.append(LLIIIL.getAbsolutePath());
            LIZ2.append("/tools/temMedia/");
            LIZ2.append(str.hashCode());
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (LIZJ(str, LIZIZ2)) {
                return LIZIZ2;
            }
            InterfaceC44698HgU interfaceC44698HgU = LIZJ;
            if (interfaceC44698HgU == null) {
                return str;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("copy file failed path:");
            LIZ3.append(LIZIZ2);
            interfaceC44698HgU.LIZIZ(-1, X1D.LIZIZ(LIZ3));
            return str;
        }
        return str;
    }

    public static final String LJIILL(String str, boolean z) {
        String substring;
        String str2;
        LJJIFFI();
        if (LJIL(str)) {
            C44694HgQ c44694HgQ = LJIILIIL;
            o.LJI(str);
            String LJIJ = c44694HgQ.LJIJ(str);
            if (z) {
                if (s.LJJJLZIJ(LJIJ, "image", false)) {
                    LJIJ = LJIILJJIL(str);
                    if (LJIJ == null) {
                        LJIJ = "";
                    }
                } else if (s.LJJJLZIJ(LJIJ, "video", false)) {
                    MediaMetadataRetriever LJIILLIIL = LJIILLIIL(str);
                    LJIJ = LJIILLIIL.extractMetadata(12);
                    try {
                        LJIILLIIL.release();
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    if (LJIJ == null) {
                        LJIJ = "";
                    }
                    if (LJIIJJI && (!ujb.o.LJJJJJL(LJIJ))) {
                        LJIIIIZZ.put(str, LJIJ);
                    }
                }
            }
            if (!TextUtils.isEmpty(LJIJ)) {
                return LJII(LJIJ);
            }
            InterfaceC44698HgU interfaceC44698HgU = LIZJ;
            if (interfaceC44698HgU == null) {
                return "";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("file path:");
            LIZ2.append(str);
            interfaceC44698HgU.LIZIZ(-10, X1D.LIZIZ(LIZ2));
            return "";
        }
        if (str == null) {
            substring = "";
        } else {
            try {
                substring = str.substring(s.LJJLIIJ(str, ".", 6) + 1, str.length());
                o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } catch (Exception e2) {
                InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
                if (interfaceC44698HgU2 != null) {
                    StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                    LIZIZ2.append(android.util.Log.getStackTraceString(e2));
                    X1D.LIZIZ(LIZIZ2);
                    interfaceC44698HgU2.LIZ();
                }
                InterfaceC44698HgU interfaceC44698HgU3 = LIZJ;
                if (interfaceC44698HgU3 != null) {
                    StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                    LIZIZ3.append(android.util.Log.getStackTraceString(e2));
                    interfaceC44698HgU3.LIZIZ(5, X1D.LIZIZ(LIZIZ3));
                }
                return "";
            }
        }
        if (z) {
            String str3 = null;
            if (LIZ(substring)) {
                str2 = LJIILJJIL(str);
            } else {
                try {
                    str2 = LJIILLIIL(str).extractMetadata(12);
                } catch (Throwable unused) {
                    str2 = null;
                }
            }
            if (str2 != null) {
                str3 = LJII(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                o.LJI(str3);
                return str3;
            }
        }
        return substring;
    }

    public static final FileInputStream LJIIZILJ(int i, String str) {
        LJJIFFI();
        try {
            if (LJIL(str)) {
                Application LJ2 = LJIILIIL.LJ();
                ParcelFileDescriptor openFileDescriptor = LJ2.getContentResolver().openFileDescriptor(UriProtector.parse(str), "r");
                o.LJIIIIZZ(openFileDescriptor, "BdFileSystem.getFileDesc…on, Uri.parse(path), \"r\")");
                return new FileInputStream(openFileDescriptor.getFileDescriptor());
            }
            return new FileInputStream(str);
        } catch (Exception e) {
            if ((e instanceof NullPointerException) && i <= 3) {
                return LJIIZILJ(i + 1, str);
            }
            InterfaceC44698HgU interfaceC44698HgU = LIZJ;
            if (interfaceC44698HgU != null) {
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ2.append(android.util.Log.getStackTraceString(e));
                X1D.LIZIZ(LIZIZ2);
                interfaceC44698HgU.LIZ();
            }
            InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
            if (interfaceC44698HgU2 != null) {
                StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                LIZIZ3.append(android.util.Log.getStackTraceString(e));
                interfaceC44698HgU2.LIZIZ(4, X1D.LIZIZ(LIZIZ3));
                return null;
            }
            return null;
        }
    }

    public static final boolean LJIJI(String str, boolean z) {
        if (z) {
            return LIZ(LJIILJJIL(str));
        }
        return LIZ(LJIILL(str, false));
    }

    public static final boolean LJIJJLI(String str, InterfaceC44688HgK interfaceC44688HgK) {
        Boolean bool;
        boolean z = false;
        if (LJIIL && (bool = LJIIIZ.get(str)) != null) {
            boolean booleanValue = bool.booleanValue();
            if (interfaceC44688HgK == null) {
                return booleanValue;
            }
            interfaceC44688HgK.LIZ(Boolean.valueOf(booleanValue));
            return false;
        }
        if (LJIL(str)) {
            LJJIFFI();
            if (interfaceC44688HgK == null) {
                try {
                    boolean LJIIJJI2 = C268613q.LJIIJJI(LJIILIIL.LJ(), UriProtector.parse(str));
                    LJIIIZ.put(str, Boolean.valueOf(LJIIJJI2));
                    z = LJIIJJI2;
                    return z;
                } catch (Exception e) {
                    InterfaceC44698HgU interfaceC44698HgU = LIZJ;
                    if (interfaceC44698HgU != null) {
                        StringBuilder LIZIZ2 = C25620zW.LIZIZ("path:", str, ", ");
                        LIZIZ2.append(android.util.Log.getStackTraceString(e));
                        X1D.LIZIZ(LIZIZ2);
                        interfaceC44698HgU.LIZ();
                    }
                    InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
                    if (interfaceC44698HgU2 != null) {
                        StringBuilder LIZIZ3 = C25620zW.LIZIZ("path:", str, ", ");
                        LIZIZ3.append(android.util.Log.getStackTraceString(e));
                        interfaceC44698HgU2.LIZIZ(9, X1D.LIZIZ(LIZIZ3));
                        return z;
                    }
                    return z;
                }
            }
            C34K c34k = new C34K();
            c34k.element = false;
            android.net.Uri parse = UriProtector.parse(str);
            C10H c10h = new C10H();
            C10K.LIZJ(new ACallableS34S1100000_7(parse, str, 2)).LJ(new AgS110S0200000_7(c34k, interfaceC44688HgK, 3), C10K.LJIIIIZZ, c10h.LIZIZ());
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new RunnableC44695HgR(c34k, c10h, parse, str, interfaceC44688HgK), 100L);
        }
        return false;
    }

    public static android.net.Uri LJJI(Context context, String str, String str2, boolean z, String str3, int i) {
        android.net.Uri LIZLLL2;
        OutputStream outputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        if ((i & 16) != 0) {
            str3 = null;
        }
        o.LJIIIZ(context, "context");
        boolean z2 = true;
        if (z) {
            if (str3 != null && !ujb.o.LJJJJJL(str3)) {
                z2 = false;
            }
            if (z2) {
                str3 = "video/mp4";
            }
            LIZLLL2 = C268613q.LJI(context, str2, str3);
        } else {
            if (str3 != null && !ujb.o.LJJJJJL(str3)) {
                z2 = false;
            }
            if (z2) {
                str3 = "image/jpeg";
            }
            LIZLLL2 = C268613q.LIZLLL(context, str2, str3);
        }
        if (LIZLLL2 != null) {
            try {
                try {
                    try {
                        outputStream = context.getContentResolver().openOutputStream(LIZLLL2);
                        try {
                            fileInputStream2 = LJIIZILJ(0, str);
                        } catch (Exception e) {
                            e = e;
                            fileInputStream2 = null;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = null;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception unused) {
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    outputStream = null;
                    fileInputStream2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    fileInputStream = null;
                }
                if (outputStream == null || fileInputStream2 == null) {
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (outputStream == null) {
                        return null;
                    }
                    outputStream.close();
                    return null;
                }
                try {
                    if (outputStream instanceof FileOutputStream) {
                        LJIILIIL.getClass();
                        if (!LIZIZ(fileInputStream2, (FileOutputStream) outputStream)) {
                            LIZLLL2 = null;
                        }
                    } else {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = fileInputStream2.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            outputStream.write(bArr, 0, read);
                        }
                        outputStream.flush();
                    }
                    fileInputStream2.close();
                    outputStream.close();
                } catch (Exception e3) {
                    e = e3;
                    LJIILIIL.getClass();
                    InterfaceC44698HgU interfaceC44698HgU = LIZJ;
                    if (interfaceC44698HgU != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("path:");
                        LIZ2.append(str);
                        LIZ2.append(", ");
                        LIZ2.append(android.util.Log.getStackTraceString(e));
                        X1D.LIZIZ(LIZ2);
                        interfaceC44698HgU.LIZ();
                    }
                    InterfaceC44698HgU interfaceC44698HgU2 = LIZJ;
                    if (interfaceC44698HgU2 != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("path:");
                        LIZ3.append(str);
                        LIZ3.append(", ");
                        LIZ3.append(android.util.Log.getStackTraceString(e));
                        interfaceC44698HgU2.LIZIZ(8, X1D.LIZIZ(LIZ3));
                    }
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (outputStream == null) {
                        return null;
                    }
                    outputStream.close();
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return LIZLLL2;
    }
}
