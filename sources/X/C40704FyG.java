package X;

import defpackage.i0;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.FyG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40704FyG {
    public static final java.util.Set<String> LIZJ;
    public static final java.util.Set<String> LIZLLL;
    public static final java.util.Set<String> LJ;
    public final android.net.Uri LIZ;
    public final String LIZIZ;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/gif");
        hashSet.add("image/webp");
        C19U.LJ(hashSet, "video/*", "video/mp4", "audio/*", "audio/mpeg");
        LIZLLL = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add("content");
        hashSet2.add("android.resource");
        hashSet2.add("file");
        LIZJ = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("http");
        hashSet3.add("https");
        LJ = Collections.unmodifiableSet(hashSet3);
    }

    public C40704FyG(C40703FyF c40703FyF) {
        android.net.Uri uri = c40703FyF.LIZ;
        this.LIZ = uri;
        String str = c40703FyF.LIZIZ;
        this.LIZIZ = str;
        if (uri != null) {
            if (str != null) {
                if (LIZJ.contains(uri.getScheme())) {
                    if (LIZLLL.contains(str)) {
                        return;
                    } else {
                        throw new IllegalArgumentException(i0.LJFF("Unsupported mime-type: ", str));
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unsupported URI scheme: ");
                    LIZ.append(uri.getScheme());
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                }
            }
            throw new NullPointerException("Must provide mimeType");
        }
        throw new NullPointerException("Must provide non-null uri");
    }
}
