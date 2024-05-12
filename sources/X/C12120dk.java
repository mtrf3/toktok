package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.0dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12120dk {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<List<byte[]>> LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FontRequest {mProviderAuthority: ");
        LIZ.append(this.LIZ);
        LIZ.append(", mProviderPackage: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mQuery: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", mCertificates:");
        sb.append(X1D.LIZIZ(LIZ));
        for (int i = 0; i < this.LIZLLL.size(); i++) {
            sb.append(" [");
            List list = (List) ListProtector.get(this.LIZLLL, i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) ListProtector.get(list, i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("mCertificatesArray: ");
        LIZ2.append(0);
        sb.append(X1D.LIZIZ(LIZ2));
        return sb.toString();
    }

    public C12120dk(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.LIZ = str;
        str2.getClass();
        this.LIZIZ = str2;
        this.LIZJ = str3;
        list.getClass();
        this.LIZLLL = list;
        this.LJ = str + "-" + str2 + "-" + str3;
    }
}
