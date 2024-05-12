package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes12.dex */
public class PK2 {
    public String LIZ;
    public String LIZIZ;
    public long LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        if (C77123UOp.LJLILLLLZI == null) {
            C77123UOp.LJLILLLLZI = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        LIZ.append(C77123UOp.LJLILLLLZI.format(new Date(this.LIZJ)));
        LIZ.append(" : ");
        LIZ.append(this.LIZ);
        LIZ.append(' ');
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public PK2(String str, String str2, long j) {
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZ = str;
    }
}
