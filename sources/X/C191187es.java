package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.7es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191187es implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;

    public static /* synthetic */ C191187es copy$default(C191187es c191187es, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c191187es.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c191187es.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c191187es.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c191187es.LJLJJI;
        }
        if ((i & 16) != 0) {
            str5 = c191187es.LJLJJL;
        }
        if ((i & 32) != 0) {
            str6 = c191187es.LJLJJLL;
        }
        return c191187es.copy(str, str2, str3, str4, str5, str6);
    }

    public final C191187es copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new C191187es(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C191187es)) {
            return false;
        }
        C191187es c191187es = (C191187es) obj;
        return o.LJ(this.LJLIL, c191187es.LJLIL) && o.LJ(this.LJLILLLLZI, c191187es.LJLILLLLZI) && o.LJ(this.LJLJI, c191187es.LJLJI) && o.LJ(this.LJLJJI, c191187es.LJLJJI) && o.LJ(this.LJLJJL, c191187es.LJLJJL) && o.LJ(this.LJLJJLL, c191187es.LJLJJLL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJLJJLL;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiReserveTableMobData(provider=");
        LIZ.append(this.LJLIL);
        LIZ.append(", poiId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", poiCity=");
        LIZ.append(this.LJLJI);
        LIZ.append(", poiRegionCode=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", ttTypeCode=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", collectInfo=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public final String getCollectInfo() {
        return this.LJLJJLL;
    }

    public final String getPoiCity() {
        return this.LJLJI;
    }

    public final String getPoiId() {
        return this.LJLILLLLZI;
    }

    public final String getPoiRegionCode() {
        return this.LJLJJI;
    }

    public final String getProvider() {
        return this.LJLIL;
    }

    public final String getTtTypeCode() {
        return this.LJLJJL;
    }

    public C191187es(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
    }
}
