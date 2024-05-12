package X;

/* loaded from: classes12.dex */
public class QUJ {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        int i;
        String str = this.LIZ;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.LIZIZ;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QUJ.class != obj.getClass()) {
            return false;
        }
        QUJ quj = (QUJ) obj;
        String str = this.LIZ;
        if (str == null ? quj.LIZ != null : !str.equals(quj.LIZ)) {
            return false;
        }
        String str2 = this.LIZIZ;
        String str3 = quj.LIZIZ;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public QUJ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
