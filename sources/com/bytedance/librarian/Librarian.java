package com.bytedance.librarian;

import X.C25620zW;
import X.C39052FUi;
import X.C39053FUj;
import X.C39096FWa;
import X.C39642Fh8;
import X.C39724FiS;
import X.C39725FiT;
import X.EF7;
import X.X1D;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.zoin.model.LibDependency;
import com.bytedance.zoin.model.ModuleManager;
import com.ss.android.legoimpl.DecompressTask;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public class Librarian {
    public static Context LIZ;
    public static volatile String LIZIZ;
    public static LibrarianMonitor LIZJ;
    public static final Object LIZLLL = new Object();

    public static UnsatisfiedLinkError[] LIZIZ() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = LibrarianUnsatisfiedLinkError.LJLIL;
        synchronized (arrayList) {
            unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) arrayList.toArray(new UnsatisfiedLinkError[0]);
        }
        return unsatisfiedLinkErrorArr;
    }

    public static UnsatisfiedLinkError[] LIZJ() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        ArrayList<UnsatisfiedLinkError> arrayList = LibrarianUnsatisfiedLinkError.LJLILLLLZI;
        synchronized (arrayList) {
            unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) arrayList.toArray(new UnsatisfiedLinkError[arrayList.size()]);
        }
        return unsatisfiedLinkErrorArr;
    }

    public static void LIZ(List<String> list) {
        LibrarianImpl librarianImpl = LibrarianImpl.LJIILL;
        if (librarianImpl != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                synchronized (librarianImpl.LJIIIIZZ) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str != null && str.length() != 0) {
                            File file = new File(str);
                            if (file.exists()) {
                                try {
                                    ((ArrayList) librarianImpl.LJIIIIZZ).add(new ZipFile(file));
                                    LibrarianMonitor librarianMonitor = librarianImpl.LIZIZ;
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("custom apk path: ");
                                    LIZ2.append(str);
                                    X1D.LIZIZ(LIZ2);
                                    librarianMonitor.getClass();
                                } catch (IOException unused) {
                                    LibrarianMonitor librarianMonitor2 = librarianImpl.LIZIZ;
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("custom apk exception ");
                                    LIZ3.append(file.getName());
                                    LIZ3.append(", size ");
                                    LIZ3.append(file.length());
                                    LIZ3.append(", exists ");
                                    LIZ3.append(file.exists());
                                    X1D.LIZIZ(LIZ3);
                                    librarianMonitor2.getClass();
                                }
                            }
                        }
                    }
                }
                librarianImpl.LJIIIZ = null;
            }
        }
    }

    public static void LJ(String str) {
        if (C39096FWa.LIZIZ.get(str) != null) {
            return;
        }
        if (C39052FUi.LIZ) {
            C39642Fh8.LIZ.getClass();
            if (ModuleManager.isCompressed(str)) {
                DecompressTask.InitTask.LIZLLL((Application) EF7.LIZIZ());
                PrintStream printStream = System.err;
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("ZOIN load compressed library ", str, " ");
                LIZIZ2.append(C39725FiT.LIZIZ);
                printStream.println(X1D.LIZIZ(LIZIZ2));
                for (LibDependency libDependency : ModuleManager.getDependencyList()) {
                    if (libDependency.libName.substring(3).replace(".so", "").equals(str)) {
                        PrintStream printStream2 = System.err;
                        StringBuilder LIZIZ3 = C25620zW.LIZIZ("ZOIN load so ", str, " status:");
                        LIZIZ3.append(libDependency.libDecompressed);
                        printStream2.println(X1D.LIZIZ(LIZIZ3));
                        if (!libDependency.libDecompressed) {
                            C39725FiT c39725FiT = C39642Fh8.LIZ;
                            C39724FiS LIZ2 = c39725FiT.LIZ(c39725FiT.LIZIZ(libDependency.libName).moduleName, false);
                            PrintStream printStream3 = System.err;
                            StringBuilder LIZIZ4 = C25620zW.LIZIZ("ZOIN decode when use ", str, " result:");
                            LIZIZ4.append(LIZ2.toString());
                            printStream3.println(X1D.LIZIZ(LIZIZ4));
                            libDependency.libDecompressed = true;
                        }
                        Iterator<String> it = libDependency.depsList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (!Boolean.TRUE.equals(C39053FUj.LIZ.get(next))) {
                                C39053FUj.LIZ(next);
                            }
                        }
                        C39053FUj.LIZ(libDependency.libName);
                        return;
                    }
                }
                PrintStream printStream4 = System.err;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ZOIN load compressed library ");
                LIZ3.append(str);
                LIZ3.append(" Failed!!!");
                printStream4.println(X1D.LIZIZ(LIZ3));
                return;
            }
        }
        LJI(str, false, false, null);
    }

    public static void LJFF(Context context, String str) {
        LJI(str, false, true, context);
    }

    public static void LIZLLL(Context context, String str, LibrarianMonitor librarianMonitor) {
        synchronized (LIZLLL) {
            if (LIZIZ != null) {
                return;
            }
            if (context != null && str != null) {
                LIZ = context;
                LIZIZ = str;
                LIZJ = librarianMonitor;
                return;
            }
            throw new IllegalStateException("context or version is null in init");
        }
    }

    public static void LJI(String str, boolean z, boolean z2, Context context) {
        TextUtils.isEmpty(str);
        if (z2 && LIZ == null) {
            LIZ = context;
        }
        LibrarianImpl librarianImpl = LibrarianImpl.LJIILL;
        if (librarianImpl != null) {
            librarianImpl.LJII(str, z);
        } else {
            LibrarianMonitor librarianMonitor = LIZJ;
            if (librarianMonitor != null) {
                librarianMonitor.LIZ(str);
            } else {
                System.loadLibrary(str);
            }
        }
        TextUtils.isEmpty(str);
    }
}
