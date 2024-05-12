package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.FhF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39649FhF {
    public final long LIZ;
    public final Context LIZIZ;
    public File LIZJ;

    public C39649FhF(Context context) {
        this.LIZIZ = context;
        this.LIZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionCode;
    }

    public static void LIZLLL(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                LIZLLL(file2);
            }
        }
        if (file.exists() && !C16880lQ.LLLZZIL(file)) {
            throw new IOException(C16880lQ.LLLZ("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    public static File LJI(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static void LJII(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (file.isDirectory()) {
                return;
            }
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
        }
    }

    public final void LIZ() {
        File LJFF = LJFF();
        String[] list = LJFF.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.LIZ))) {
                    File file = new File(LJFF, str);
                    new StringBuilder(String.valueOf(file).length() + 118);
                    LIZLLL(file);
                }
            }
        }
    }

    public final File LJ() {
        File file = new File(LJFF(), Long.toString(this.LIZ));
        LJII(file);
        return file;
    }

    public final File LJFF() {
        if (this.LIZJ == null) {
            Context context = this.LIZIZ;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.LIZJ = C16880lQ.LLIIJLIL(context);
        }
        File file = new File(this.LIZJ, "splitcompat");
        LJII(file);
        return file;
    }

    public final java.util.Set<C36728EbE> LIZJ() {
        File file = new File(LJ(), "verified-splits");
        LJII(file);
        HashSet hashSet = new HashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk")) {
                    hashSet.add(new C36728EbE(file2, file2.getName().substring(0, r1.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final File LIZIZ(String str) {
        File file = new File(LJ(), "verified-splits");
        LJII(file);
        return LJI(file, String.valueOf(str).concat(".apk"));
    }
}
