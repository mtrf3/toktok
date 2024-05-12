package X;

import java.util.zip.ZipEntry;

/* renamed from: X.X6z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84309X6z extends X73 implements Comparable {
    public final ZipEntry LJLJI;
    public final int LJLJJI;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.LJLIL.compareTo(((X73) obj).LJLIL);
    }

    public C84309X6z(String str, ZipEntry zipEntry, int i) {
        super(str, C16880lQ.LLLZ("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
        this.LJLJI = zipEntry;
        this.LJLJJI = i;
    }
}
