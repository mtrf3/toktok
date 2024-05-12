package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBR {
    public final C46141rW<Long> LIZ = new C46141rW<>(false);
    public final C0FT LIZIZ = new C0FT(Boolean.FALSE);
    public final C0FT LIZJ = new C0FT((Object) null);
    public final C0FT LIZLLL = new C0FT((Object) 0L);
    public final C46141rW<Long> LJ = new C46141rW<>(false);
    public final String LJFF;
    public final /* synthetic */ XBL LJI;

    public final String LIZJ() {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = this.LIZ.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            sb.append(' ');
            sb.append(longValue);
        }
        String sb2 = sb.toString();
        o.LJFF(sb2, "result.toString()");
        return sb2;
    }

    public final String LIZLLL() {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = this.LJ.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            sb.append(' ');
            sb.append(longValue);
        }
        String sb2 = sb.toString();
        o.LJFF(sb2, "result.toString()");
        return sb2;
    }

    public static void LJ(String[] strArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unexpected journal line: ");
        LIZ.append(strArr);
        throw new Exception(X1D.LIZIZ(LIZ));
    }

    public final C10830bf LIZ(int i) {
        if (i == 0) {
            return new C10830bf(this.LJI.LJIILIIL).LIZ(this.LJFF);
        }
        C10830bf c10830bf = new C10830bf(this.LJI.LJIILIIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJFF);
        LIZ.append('.');
        LIZ.append(i);
        return c10830bf.LIZ(X1D.LIZIZ(LIZ));
    }

    public final C10830bf LIZIZ(int i) {
        if (i == 0) {
            C10830bf c10830bf = new C10830bf(this.LJI.LJIILIIL);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJFF);
            LIZ.append(".tmp");
            return c10830bf.LIZ(X1D.LIZIZ(LIZ));
        }
        C10830bf c10830bf2 = new C10830bf(this.LJI.LJIILIIL);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJFF);
        LIZ2.append('.');
        LIZ2.append(i);
        LIZ2.append(".tmp");
        return c10830bf2.LIZ(X1D.LIZIZ(LIZ2));
    }

    public XBR(XBL xbl, String str) {
        this.LJI = xbl;
        this.LJFF = str;
        int i = xbl.LJIILL;
        for (int i2 = 0; i2 < i; i2++) {
            this.LIZ.add(0L);
            this.LJ.add(0L);
        }
    }
}
