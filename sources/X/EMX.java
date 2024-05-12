package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EMX implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;

    public static /* synthetic */ EMX copy$default(EMX emx, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = emx.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str2 = emx.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str3 = emx.LJLJI;
        }
        if ((i2 & 8) != 0) {
            str4 = emx.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            str5 = emx.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            str6 = emx.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            i = emx.LJLJL;
        }
        if ((i2 & 128) != 0) {
            str7 = emx.LJLJLJ;
        }
        return emx.copy(str, str2, str3, str4, str5, str6, i, str7);
    }

    public final EMX copy(String contactName, String phoneNumber, String nationalNumber, String e164PhoneNumber, String str, String str2, int i, String str3) {
        o.LJIIIZ(contactName, "contactName");
        o.LJIIIZ(phoneNumber, "phoneNumber");
        o.LJIIIZ(nationalNumber, "nationalNumber");
        o.LJIIIZ(e164PhoneNumber, "e164PhoneNumber");
        return new EMX(contactName, phoneNumber, nationalNumber, e164PhoneNumber, str, str2, i, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EMX)) {
            return false;
        }
        EMX emx = (EMX) obj;
        return o.LJ(this.LJLIL, emx.LJLIL) && o.LJ(this.LJLILLLLZI, emx.LJLILLLLZI) && o.LJ(this.LJLJI, emx.LJLJI) && o.LJ(this.LJLJJI, emx.LJLJJI) && o.LJ(this.LJLJJL, emx.LJLJJL) && o.LJ(this.LJLJJLL, emx.LJLJJLL) && this.LJLJL == emx.LJLJL && o.LJ(this.LJLJLJ, emx.LJLJLJ);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31);
        String str = this.LJLJJL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LJLJJLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.LJLJL) * 31;
        String str3 = this.LJLJLJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactBookFlatReadItem(contactName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", phoneNumber=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", nationalNumber=");
        LIZ.append(this.LJLJI);
        LIZ.append(", e164PhoneNumber=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", photoUri=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", regionCode=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", regionCodeSource=");
        LIZ.append(this.LJLJL);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    public final String getContactName() {
        return this.LJLIL;
    }

    public final String getE164PhoneNumber() {
        return this.LJLJJI;
    }

    public final String getNationalNumber() {
        return this.LJLJI;
    }

    public final String getPhoneNumber() {
        return this.LJLILLLLZI;
    }

    public final String getPhotoUri() {
        return this.LJLJJL;
    }

    public final String getRegionCode() {
        return this.LJLJJLL;
    }

    public final int getRegionCodeSource() {
        return this.LJLJL;
    }

    public final String getRequestId() {
        return this.LJLJLJ;
    }

    public EMX(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        C43588H8u.LIZLLL(str, "contactName", str2, "phoneNumber", str3, "nationalNumber", str4, "e164PhoneNumber");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = i;
        this.LJLJLJ = str7;
    }

    public /* synthetic */ EMX(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? 0 : i, (i2 & 128) == 0 ? str7 : null);
    }
}
