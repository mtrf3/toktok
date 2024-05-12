package X;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* renamed from: X.13n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C268313n extends File {
    public static final C263111n LJLIL = C263011m.LIZ;

    @Override // java.io.File
    public C268313n getAbsoluteFile() {
        try {
            return new C268313n(getAbsolutePath());
        } catch (C271114p e) {
            e.toString();
            return null;
        }
    }

    @Override // java.io.File
    public String getParent() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new C268313n(parent).getPath();
        } catch (C271114p e) {
            e.toString();
            return null;
        }
    }

    @Override // java.io.File
    public C268313n getParentFile() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new C268313n(parent);
        } catch (C271114p e) {
            e.toString();
            return null;
        }
    }

    @Override // java.io.File
    public C268313n[] listFiles() {
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        C268313n[] c268313nArr = new C268313n[length];
        for (int i = 0; i < length; i++) {
            try {
                c268313nArr[i] = new C268313n(getPath(), list[i]);
            } catch (C271114p e) {
                e.toString();
            }
        }
        return c268313nArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C268313n(java.net.URI r12) {
        /*
            r11 = this;
            X.11n r10 = X.C268313n.LJLIL
            r10.getClass()
            boolean r0 = r12.isAbsolute()
            if (r0 == 0) goto Lbc
            boolean r0 = r12.isOpaque()
            if (r0 != 0) goto Lb4
            java.lang.String r1 = r12.getScheme()
            if (r1 == 0) goto Lac
            java.lang.String r0 = "file"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lac
            java.lang.String r0 = r12.getAuthority()
            if (r0 != 0) goto La4
            java.lang.String r0 = r12.getFragment()
            if (r0 != 0) goto L9c
            java.lang.String r0 = r12.getQuery()
            if (r0 != 0) goto L94
            java.lang.String r9 = r12.getPath()
            java.lang.String r0 = ""
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L8c
            java.lang.String r0 = "/"
            boolean r0 = r9.endsWith(r0)
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L51
            int r0 = r9.length()
            if (r0 <= r8) goto L51
            java.lang.String r9 = X.C79061V1d.LJ(r9, r8, r7)
        L51:
            char r0 = java.io.File.separatorChar
            r6 = 47
            if (r0 == r6) goto L5b
            java.lang.String r9 = r9.replace(r6, r0)
        L5b:
            int r5 = r9.length()
            char[] r4 = r9.toCharArray()
            r3 = 0
            r0 = 0
            r2 = 0
        L66:
            if (r3 >= r5) goto L77
            char r1 = r4[r3]
            if (r1 != r6) goto L6e
            if (r0 == r6) goto L73
        L6e:
            int r0 = r2 + 1
            r4[r2] = r1
            r2 = r0
        L73:
            int r3 = r3 + 1
            r0 = r1
            goto L66
        L77:
            if (r0 != r6) goto L7d
            if (r5 <= r8) goto L7d
            int r2 = r2 + (-1)
        L7d:
            if (r2 == r5) goto L84
            java.lang.String r9 = new java.lang.String
            r9.<init>(r4, r7, r2)
        L84:
            java.lang.String r0 = r10.LIZ(r9)
            r11.<init>(r0)
            return
        L8c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "URI path component is empty"
            r1.<init>(r0)
            throw r1
        L94:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "URI has a query component"
            r1.<init>(r0)
            throw r1
        L9c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "URI has a fragment component"
            r1.<init>(r0)
            throw r1
        La4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "URI has an authority component"
            r1.<init>(r0)
            throw r1
        Lac:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "URI scheme is not \"file\""
            r1.<init>(r0)
            throw r1
        Lb4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "URI is not hierarchical"
            r1.<init>(r0)
            throw r1
        Lbc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "URI is not absolute"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268313n.<init>(java.net.URI):void");
    }

    @Override // java.io.File
    public C268313n[] listFiles(FileFilter fileFilter) {
        C268313n c268313n;
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                c268313n = new C268313n(getPath(), str);
            } catch (C271114p e) {
                e.toString();
                c268313n = null;
            }
            if (fileFilter == null || fileFilter.accept(c268313n)) {
                arrayList.add(c268313n);
            }
        }
        return (C268313n[]) arrayList.toArray(new C268313n[arrayList.size()]);
    }

    public C268313n(String str) {
        super(LJLIL.LIZ(str));
    }

    @Override // java.io.File
    public C268313n[] listFiles(FilenameFilter filenameFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                try {
                    arrayList.add(new C268313n(getPath(), str));
                } catch (C271114p e) {
                    e.toString();
                }
            }
        }
        return (C268313n[]) arrayList.toArray(new C268313n[arrayList.size()]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C268313n(java.io.File r4, java.lang.String r5) {
        /*
            r3 = this;
            X.11n r2 = X.C268313n.LJLIL
            r2.getClass()
            if (r5 != 0) goto Lb
        L7:
            r3.<init>(r5)
            return
        Lb:
            if (r4 == 0) goto L29
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "/"
            java.lang.String r5 = r2.LIZIZ(r0, r5)
            goto L7
        L20:
            java.lang.String r0 = r4.getPath()
            java.lang.String r5 = r2.LIZIZ(r0, r5)
            goto L7
        L29:
            java.lang.String r5 = r2.LIZ(r5)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268313n.<init>(java.io.File, java.lang.String):void");
    }

    public C268313n(String str, String str2) {
        super(LJLIL.LIZIZ(str, str2));
    }
}
