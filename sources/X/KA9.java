package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA9 implements Serializable {
    public final String LJLIL;
    public final Long LJLILLLLZI;
    public final Integer LJLJI;
    public final Integer LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;

    public static /* synthetic */ KA9 copy$default(KA9 ka9, String str, Long l, Integer num, Integer num2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ka9.LJLIL;
        }
        if ((i & 2) != 0) {
            l = ka9.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            num = ka9.LJLJI;
        }
        if ((i & 8) != 0) {
            num2 = ka9.LJLJJI;
        }
        if ((i & 16) != 0) {
            str2 = ka9.LJLJJL;
        }
        if ((i & 32) != 0) {
            str3 = ka9.LJLJJLL;
        }
        if ((i & 64) != 0) {
            str4 = ka9.LJLJL;
        }
        return ka9.copy(str, l, num, num2, str2, str3, str4);
    }

    public final KA9 copy(String str, Long l, Integer num, Integer num2, String str2, String str3, String str4) {
        return new KA9(str, l, num, num2, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KA9)) {
            return false;
        }
        KA9 ka9 = (KA9) obj;
        return o.LJ(this.LJLIL, ka9.LJLIL) && o.LJ(this.LJLILLLLZI, ka9.LJLILLLLZI) && o.LJ(this.LJLJI, ka9.LJLJI) && o.LJ(this.LJLJJI, ka9.LJLJJI) && o.LJ(this.LJLJJL, ka9.LJLJJL) && o.LJ(this.LJLJJLL, ka9.LJLJJLL) && o.LJ(this.LJLJL, ka9.LJLJL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LJLJI;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJL;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuessSignalModel(lastGroupId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", totalPlayTime=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", hasEffectiveClick=");
        LIZ.append(this.LJLJI);
        LIZ.append(", backFromSearch=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", lastSuggestWords=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", lastSearchQuery=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", lastSearchSource=");
        return q.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public final Integer getBackFromSearch() {
        return this.LJLJJI;
    }

    public final Integer getHasEffectiveClick() {
        return this.LJLJI;
    }

    public final String getLastGroupId() {
        return this.LJLIL;
    }

    public final String getLastSearchQuery() {
        return this.LJLJJLL;
    }

    public final String getLastSearchSource() {
        return this.LJLJL;
    }

    public final String getLastSuggestWords() {
        return this.LJLJJL;
    }

    public final Long getTotalPlayTime() {
        return this.LJLILLLLZI;
    }

    public KA9(String str, Long l, Integer num, Integer num2, String str2, String str3, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = l;
        this.LJLJI = num;
        this.LJLJJI = num2;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
    }
}
