package X;

import java.util.Iterator;

/* renamed from: X.Emf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37437Emf {
    public static final /* synthetic */ int LJ = 0;
    public Integer LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final java.util.Set<String> LIZLLL;

    public final int hashCode() {
        if (this.LIZ == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.LIZJ);
            C40658FxW.LJLI(this.LIZLLL);
            Iterator<String> it = this.LIZLLL.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
            this.LIZ = Integer.valueOf(sb.toString().hashCode());
        }
        Integer num = this.LIZ;
        if (num != null) {
            return num.intValue();
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
    }

    public final String toString() {
        if (this.LIZIZ == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.LIZJ);
            if (!this.LIZLLL.isEmpty()) {
                sb.append('?');
            }
            C40658FxW.LJLI(this.LIZLLL);
            int i = 0;
            for (String str : this.LIZLLL) {
                int i2 = i + 1;
                if (i >= 0) {
                    sb.append(str);
                    if (i < this.LIZLLL.size() - 1) {
                        sb.append('&');
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            this.LIZIZ = sb.toString();
        }
        String str2 = this.LIZIZ;
        if (str2 != null) {
            return str2;
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof String) {
            return equals(C37438Emg.LIZ((String) obj));
        }
        if ((obj instanceof C37437Emf) && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    public C37437Emf(String str, java.util.Set<String> set) {
        this.LIZJ = str;
        this.LIZLLL = set;
    }
}
