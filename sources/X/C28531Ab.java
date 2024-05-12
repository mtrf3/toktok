package X;

import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28531Ab implements C07A {
    public final String LIZ;
    public final HashMap<String, File> LIZIZ = new HashMap<>();

    public C28531Ab(String str) {
        this.LIZ = str;
    }

    @Override // X.C07A
    public final android.net.Uri LIZ(File file) {
        String substring;
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry<String, File> entry = null;
            for (Map.Entry<String, File> entry2 : this.LIZIZ.entrySet()) {
                String path = entry2.getValue().getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = entry.getValue().getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(android.net.Uri.encode(entry.getKey()));
                LIZ.append('/');
                LIZ.append(android.net.Uri.encode(substring, "/"));
                return C0F1.LIZ("content").authority(this.LIZ).encodedPath(X1D.LIZIZ(LIZ)).build();
            }
            throw new IllegalArgumentException(i0.LJFF("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException(C0F0.LIZJ("Failed to resolve canonical path for ", file));
        }
    }

    @Override // X.C07A
    public final File LIZIZ(android.net.Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = android.net.Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = android.net.Uri.decode(encodedPath.substring(indexOf + 1));
        File file = this.LIZIZ.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException(C0F0.LIZJ("Failed to resolve canonical path for ", file2));
            }
        }
        throw new IllegalArgumentException(C43588H8u.LIZ("Unable to find configured root for ", uri));
    }
}
