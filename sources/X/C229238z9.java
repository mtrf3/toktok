package X;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.8z9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229238z9 implements Serializable {
    public String LJLIL;
    public Integer LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public final String LJLJJL;
    public final transient Bundle LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C229238z9() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C229238z9 copy$default(C229238z9 c229238z9, String str, Integer num, String str2, int i, String str3, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c229238z9.LJLIL;
        }
        if ((i2 & 2) != 0) {
            num = c229238z9.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str2 = c229238z9.LJLJI;
        }
        if ((i2 & 8) != 0) {
            i = c229238z9.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            str3 = c229238z9.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            bundle = c229238z9.LJLJJLL;
        }
        return c229238z9.copy(str, num, str2, i, str3, bundle);
    }

    public final C229238z9 copy(String str, Integer num, String str2, int i, String str3, Bundle bundle) {
        return new C229238z9(str, num, str2, i, str3, bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C229238z9)) {
            return false;
        }
        C229238z9 c229238z9 = (C229238z9) obj;
        return o.LJ(this.LJLIL, c229238z9.LJLIL) && o.LJ(this.LJLILLLLZI, c229238z9.LJLILLLLZI) && o.LJ(this.LJLJI, c229238z9.LJLJI) && this.LJLJJI == c229238z9.LJLJJI && o.LJ(this.LJLJJL, c229238z9.LJLJJL) && o.LJ(this.LJLJJLL, c229238z9.LJLJJLL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJLJJI) * 31;
        String str3 = this.LJLJJL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Bundle bundle = this.LJLJJLL;
        return hashCode4 + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchParam(searchId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isFromVideo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", searchType=");
        LIZ.append(this.LJLJI);
        LIZ.append(", flowStartPositionInGeneralSearch=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", searchResultId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", bundle=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Bundle getBundle() {
        return this.LJLJJLL;
    }

    public final int getFlowStartPositionInGeneralSearch() {
        return this.LJLJJI;
    }

    public final String getSearchId() {
        return this.LJLIL;
    }

    public final String getSearchResultId() {
        return this.LJLJJL;
    }

    public final String getSearchType() {
        return this.LJLJI;
    }

    public final Integer isFromVideo() {
        return this.LJLILLLLZI;
    }

    public final void setFlowStartPositionInGeneralSearch(int i) {
        this.LJLJJI = i;
    }

    public final void setFromVideo(Integer num) {
        this.LJLILLLLZI = num;
    }

    public final void setSearchId(String str) {
        this.LJLIL = str;
    }

    public final void setSearchType(String str) {
        this.LJLJI = str;
    }

    public C229238z9(String str, Integer num, String str2, int i, String str3, Bundle bundle) {
        this.LJLIL = str;
        this.LJLILLLLZI = num;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = str3;
        this.LJLJJLL = bundle;
    }

    public /* synthetic */ C229238z9(String str, Integer num, String str2, int i, String str3, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : num, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? str3 : "", (i2 & 32) != 0 ? null : bundle);
    }
}
