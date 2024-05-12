package X;

import android.os.StrictMode;
import android.os.Trace;
import com.facebook.soloader.Api18TraceUtils;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Fgx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39631Fgx extends AbstractC39635Fh1 {
    public final File LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;

    @Override // X.AbstractC39635Fh1
    public final String toString() {
        String name;
        try {
            name = String.valueOf(this.LIZ.getCanonicalPath());
        } catch (IOException unused) {
            name = this.LIZ.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return UPJ.LIZLLL(sb, this.LIZIZ, ']');
    }

    public C39631Fgx(File file, int i) {
        this(file, i, new String[0]);
    }

    public C39631Fgx(File file, int i, String[] strArr) {
        this.LIZ = file;
        this.LIZIZ = i;
        this.LIZJ = Arrays.asList(strArr);
    }

    @Override // X.AbstractC39635Fh1
    public int LIZ(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return LIZJ(str, i, threadPolicy);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ab: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:65:? A[TRY_LEAVE] (LINE:50331819), block:B:62:0x00ab */
    public final int LIZJ(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        AutoCloseable autoCloseable;
        C39638Fh4 c39638Fh4;
        if (C39633Fgz.LIZIZ != null) {
            if (this.LIZJ.contains(str)) {
                return 0;
            }
            File file = new File(this.LIZ, str);
            if (!file.exists()) {
                return 0;
            }
            if ((i & 1) != 0 && (this.LIZIZ & 2) != 0) {
                return 2;
            }
            if ((this.LIZIZ & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean equals = file.getName().equals(str);
            try {
                if (!z && equals) {
                    c39638Fh4 = null;
                } else {
                    try {
                        c39638Fh4 = new C39638Fh4(file);
                        if (z) {
                            try {
                                boolean z2 = C39633Fgz.LIZ;
                                if (z2) {
                                    Api18TraceUtils.LIZ("SoLoader.getElfDependencies[", str, "]");
                                }
                                try {
                                    String[] LIZ = C39637Fh3.LIZ(c39638Fh4);
                                    if (z2) {
                                        Trace.endSection();
                                    }
                                    for (String str2 : LIZ) {
                                        if (!str2.startsWith("/")) {
                                            C39633Fgz.LJIIIIZZ(str2, null, i | 1, threadPolicy);
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (C39633Fgz.LIZ) {
                                        Trace.endSection();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                if (c39638Fh4 != null) {
                                    c39638Fh4.close();
                                    throw th2;
                                }
                                throw th2;
                            }
                        }
                        if (!equals) {
                            InterfaceC37245EjZ interfaceC37245EjZ = C39633Fgz.LIZIZ;
                            file.getAbsolutePath();
                            ((C37244EjY) interfaceC37245EjZ).getClass();
                            throw new UnsupportedOperationException();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                ((C37244EjY) C39633Fgz.LIZIZ).LIZIZ(i, file.getAbsolutePath());
                if (c39638Fh4 != null) {
                    c39638Fh4.close();
                }
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    if (autoCloseable != null) {
                        autoCloseable.close();
                        return 3;
                    }
                    return 3;
                }
                throw e;
            }
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }
}
