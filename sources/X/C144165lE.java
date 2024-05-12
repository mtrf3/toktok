package X;

import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import defpackage.i0;
import java.io.File;
import ujb.o;

/* renamed from: X.5lE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144165lE extends AbstractC65781Prl implements InterfaceC65784Pro<C144155lD> {
    public static final C144165lE LJLIL = new C144165lE();

    public C144165lE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5lD] */
    @Override // X.InterfaceC65784Pro
    public final C144155lD invoke() {
        return new DAVUnZipFunc() { // from class: X.5lD
            @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
            public final boolean unZip(String str, String str2, boolean z) {
                boolean z2 = false;
                if (str != null && !o.LJJJJJL(str) && str2 != null && !o.LJJJJJL(str2)) {
                    File file = new File(i0.LJFF(str2, "_temp"));
                    if (file.exists()) {
                        C16880lQ.LLLZZIL(file);
                    }
                    try {
                        C38978FRm.LIZLLL(new File(str), file);
                        String absolutePath = file.getAbsolutePath();
                        kotlin.jvm.internal.o.LJIIIIZZ(absolutePath, "unzipTemp.absolutePath");
                        if (new File(str2).exists()) {
                            OR7.LLLIIL(new File(str2));
                        }
                        File file2 = new File(absolutePath);
                        File file3 = new File(str2);
                        if (file2.exists()) {
                            z2 = file2.renameTo(file3);
                        }
                        if (z) {
                            C16880lQ.LLLZZIL(new File(str));
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
                return z2;
            }
        };
    }
}
