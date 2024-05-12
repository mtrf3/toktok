package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBA implements Serializable {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public KBA() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KBA copy$default(KBA kba, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kba.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = kba.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = kba.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = kba.LJLJJI;
        }
        if ((i & 16) != 0) {
            str5 = kba.LJLJJL;
        }
        return kba.copy(str, str2, str3, str4, str5);
    }

    public final KBA copy(String str, String str2, String str3, String str4, String str5) {
        return new KBA(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KBA)) {
            return false;
        }
        KBA kba = (KBA) obj;
        return o.LJ(this.LJLIL, kba.LJLIL) && o.LJ(this.LJLILLLLZI, kba.LJLILLLLZI) && o.LJ(this.LJLJI, kba.LJLJI) && o.LJ(this.LJLJJI, kba.LJLJJI) && o.LJ(this.LJLJJL, kba.LJLJJL);
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
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeepLinkAdFromMallModel(adUrl=");
        LIZ.append(this.LJLIL);
        LIZ.append(", adDeepLinkType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", adCreativeId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", adCampaignId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", adPreviousPage=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public final String getAdCampaignId() {
        return this.LJLJJI;
    }

    public final String getAdCreativeId() {
        return this.LJLJI;
    }

    public final String getAdDeepLinkType() {
        return this.LJLILLLLZI;
    }

    public final String getAdPreviousPage() {
        return this.LJLJJL;
    }

    public final String getAdUrl() {
        return this.LJLIL;
    }

    public final void setAdCampaignId(String str) {
        this.LJLJJI = str;
    }

    public final void setAdCreativeId(String str) {
        this.LJLJI = str;
    }

    public final void setAdDeepLinkType(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setAdPreviousPage(String str) {
        this.LJLJJL = str;
    }

    public final void setAdUrl(String str) {
        this.LJLIL = str;
    }

    public KBA(String str, String str2, String str3, String str4, String str5) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
    }

    public /* synthetic */ KBA(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
