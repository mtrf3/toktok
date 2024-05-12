package X;

import java.util.HashMap;

/* renamed from: X.Qqu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68276Qqu {
    public String LIZ;
    public final long LIZIZ;
    public final java.util.Map LIZJ;

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C68276Qqu clone() {
        return new C68276Qqu(this.LIZIZ, this.LIZ, new HashMap(this.LIZJ));
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode();
        long j = this.LIZIZ;
        return this.LIZJ.hashCode() + (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.LIZ;
        long j = this.LIZIZ;
        String obj = this.LIZJ.toString();
        StringBuilder sb = new StringBuilder("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        return FP1.LIZLLL(sb, ", params=", obj, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68276Qqu)) {
            return false;
        }
        C68276Qqu c68276Qqu = (C68276Qqu) obj;
        if (this.LIZIZ != c68276Qqu.LIZIZ || !this.LIZ.equals(c68276Qqu.LIZ)) {
            return false;
        }
        return this.LIZJ.equals(c68276Qqu.LIZJ);
    }

    public C68276Qqu(long j, String str, java.util.Map map) {
        this.LIZ = str;
        this.LIZIZ = j;
        HashMap hashMap = new HashMap();
        this.LIZJ = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }
}
