package X;

import Y.IDhS97S0100000_4;
import Y.IDxS305S0100000_4;
import android.content.Context;
import android.text.TextUtils;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.9u6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251589u6 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C251579u5.LJLIL);

    public final InputStream LIZIZ(String str, String str2, String str3) {
        C251629uA c251629uA = (C251629uA) this.LIZ.getValue();
        if (c251629uA != null) {
            String LJFF = i0.LJFF(str3, ".json");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c251629uA.LIZJ(str, str2));
            try {
                return new FileInputStream(new File(JBR.LJFF(LIZ, File.separator, LJFF, LIZ)));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final void LIZ(Context context, String str, String url, String md5, C250009rY c250009rY) {
        Boolean bool;
        File[] listFiles;
        boolean equals;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(md5, "md5");
        C251629uA c251629uA = (C251629uA) this.LIZ.getValue();
        if (c251629uA != null) {
            File file = new File(c251629uA.LIZLLL(str, md5));
            File file2 = new File(c251629uA.LIZJ(str, md5));
            if (!file.exists() || !file2.exists() || !file2.isDirectory() || (listFiles = file2.listFiles()) == null || listFiles.length == 0 || !file.exists()) {
                equals = false;
            } else {
                equals = TextUtils.equals(C38352F3k.LIZIZ(file), md5);
            }
            bool = Boolean.valueOf(equals);
        } else {
            bool = null;
        }
        if (bool.booleanValue()) {
            c250009rY.onSuccess();
            return;
        }
        C251629uA c251629uA2 = (C251629uA) this.LIZ.getValue();
        if (c251629uA2 == null) {
            return;
        }
        AbstractC73672Svk.LJIIJ(new C251609u8(c251629uA2, str, md5, url)).LJJJJJL(Long.MAX_VALUE, new C75806Tp4()).LJJIII(new IDhS97S0100000_4(c251629uA2, 3), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(c250009rY, 13));
    }
}
