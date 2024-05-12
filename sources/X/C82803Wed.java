package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wed, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82803Wed<R> implements Comparable<C82803Wed<R>> {
    public static String LJLLJ = "";
    public final String LJLIL;
    public final N26 LJLILLLLZI;
    public final String LJLJI;
    public final N28 LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final boolean LJLJL;
    public final R LJLJLJ;
    public EnumC82806Weg LJLJLLL;
    public String LJLL;
    public int LJLLI;
    public final java.util.Map<InterfaceC82810Wek<?>, Class<?>> LJLLILLLL;

    public C82803Wed() {
        throw null;
    }

    public final String toString() {
        return "DynamicResourceStrategy(key=" + this.LJLIL + ", type=" + this.LJLILLLLZI + ", cdnUrl=" + this.LJLJI + ", priority=" + this.LJLJJI + ", hash=" + this.LJLJJL + ", size=" + this.LJLJJLL + ", enable=" + this.LJLJL + ", fallback=" + this.LJLJLJ + ", status=" + this.LJLJLLL + ", localPath=" + this.LJLL + ", failureCount=" + this.LJLLI + ", callbacks=" + this.LJLLILLLL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.LJLJJL, (this.LJLJJI.hashCode() + C79062V1e.LJ(this.LJLJI, (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31, 31)) * 31, 31) + this.LJLJJLL) * 31;
        boolean z = this.LJLJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        R r = this.LJLJLJ;
        if (r == null) {
            hashCode = 0;
        } else {
            hashCode = r.hashCode();
        }
        return this.LJLLILLLL.hashCode() + ((C79062V1e.LJ(this.LJLL, (this.LJLJLLL.hashCode() + ((i2 + hashCode) * 31)) * 31, 31) + this.LJLLI) * 31);
    }

    public final boolean LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZLLL());
        LIZ.append('/');
        LIZ.append(LJ());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (LIZIZ.length() > 0 && C1B6.LIZIZ(LIZIZ)) {
            this.LJLL = LIZIZ;
            this.LJLJLLL = EnumC82806Weg.SUCCESS;
            return true;
        }
        this.LJLL = "";
        if (this.LJLJLLL == EnumC82806Weg.SUCCESS) {
            this.LJLJLLL = EnumC82806Weg.IDLE;
        }
        return false;
    }

    public final String LIZLLL() {
        C39030FTm.LIZIZ();
        String str = LJLLJ;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLJ);
        LIZ.append(this.LJLIL);
        return X1D.LIZIZ(LIZ);
    }

    public final String LJ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJL);
        int i = N25.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "";
                } else {
                    str = ".json";
                }
            } else {
                str = ".mp4";
            }
        } else {
            str = ".mp3";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C82803Wed other = (C82803Wed) obj;
        o.LJIIIZ(other, "other");
        int i = this.LJLLI;
        int i2 = other.LJLLI;
        if (i >= i2) {
            if (i <= i2) {
                if (this.LJLJJI.getValue() <= other.LJLJJI.getValue() && (this.LJLJJI.getValue() != other.LJLJJI.getValue() || this.LJLJJLL <= other.LJLJJLL)) {
                    if (this.LJLJJI.getValue() == other.LJLJJI.getValue() && this.LJLJJLL == other.LJLJJLL) {
                        return 0;
                    }
                }
            }
            return -1;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C82803Wed)) {
            C82803Wed c82803Wed = (C82803Wed) obj;
            if (o.LJ(this.LJLIL, c82803Wed.LJLIL) && o.LJ(this.LJLJJL, c82803Wed.LJLJJL)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82803Wed(String key, N26 type, String cdnUrl, N28 priority, String hash, int i, boolean z, Object obj) {
        EnumC82806Weg status = EnumC82806Weg.IDLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o.LJIIIZ(key, "key");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(cdnUrl, "cdnUrl");
        o.LJIIIZ(priority, "priority");
        o.LJIIIZ(hash, "hash");
        o.LJIIIZ(status, "status");
        this.LJLIL = key;
        this.LJLILLLLZI = type;
        this.LJLJI = cdnUrl;
        this.LJLJJI = priority;
        this.LJLJJL = hash;
        this.LJLJJLL = i;
        this.LJLJL = z;
        this.LJLJLJ = obj;
        this.LJLJLLL = status;
        this.LJLL = "";
        this.LJLLI = 0;
        this.LJLLILLLL = linkedHashMap;
    }
}
