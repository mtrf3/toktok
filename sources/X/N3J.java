package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class N3J {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;

    public final String toString() {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tplv-");
        LIZ.append(this.LIZ);
        LIZ.append('-');
        LIZ.append(this.LIZIZ);
        List<String> list = this.LIZJ;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(':');
            List<String> list2 = this.LIZJ;
            if (list2 != null) {
                str2 = ORZ.LLD(list2, ":", null, null, null, 62);
            } else {
                str2 = null;
            }
            LIZ2.append(str2);
            str = X1D.LIZIZ(LIZ2);
        }
        LIZ.append(str);
        LIZ.append('.');
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public N3J(String str, String str2, List<String> list, String str3) {
        HH1.LIZ(str, "serviceID", str2, "name", str3, "format");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = str3;
    }
}
