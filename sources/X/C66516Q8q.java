package X;

import java.io.Serializable;

/* renamed from: X.Q8q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66516Q8q implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLLI;
    public boolean LJLLJ;
    public boolean LJLLLL;
    public String LJLJJLL = "";
    public int LJLL = 1;
    public String LJLLILLLL = "";
    public String LJLLLLLL = "";
    public EnumC66521Q8v LJLLL = EnumC66521Q8v.UNSPECIFIED;

    public C66516Q8q clearCountryCode() {
        this.LJLIL = false;
        this.LJLILLLLZI = 0;
        return this;
    }

    public C66516Q8q clearCountryCodeSource() {
        this.LJLLJ = false;
        this.LJLLL = EnumC66521Q8v.UNSPECIFIED;
        return this;
    }

    public C66516Q8q clearExtension() {
        this.LJLJJL = false;
        this.LJLJJLL = "";
        return this;
    }

    public C66516Q8q clearItalianLeadingZero() {
        this.LJLJL = false;
        this.LJLJLJ = false;
        return this;
    }

    public C66516Q8q clearNationalNumber() {
        this.LJLJI = false;
        this.LJLJJI = 0L;
        return this;
    }

    public C66516Q8q clearNumberOfLeadingZeros() {
        this.LJLJLLL = false;
        this.LJLL = 1;
        return this;
    }

    public C66516Q8q clearPreferredDomesticCarrierCode() {
        this.LJLLLL = false;
        this.LJLLLLLL = "";
        return this;
    }

    public C66516Q8q clearRawInput() {
        this.LJLLI = false;
        this.LJLLILLLL = "";
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.LJLILLLLZI);
        sb.append(" National Number: ");
        sb.append(this.LJLJJI);
        if (hasItalianLeadingZero() && isItalianLeadingZero()) {
            sb.append(" Leading Zero(s): true");
        }
        if (hasNumberOfLeadingZeros()) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.LJLL);
        }
        if (hasExtension()) {
            sb.append(" Extension: ");
            sb.append(this.LJLJJLL);
        }
        if (hasCountryCodeSource()) {
            sb.append(" Country Code Source: ");
            sb.append(this.LJLLL);
        }
        if (hasPreferredDomesticCarrierCode()) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.LJLLLLLL);
        }
        return sb.toString();
    }

    public final C66516Q8q clear() {
        clearCountryCode();
        clearNationalNumber();
        clearExtension();
        clearItalianLeadingZero();
        clearNumberOfLeadingZeros();
        clearRawInput();
        clearCountryCodeSource();
        clearPreferredDomesticCarrierCode();
        return this;
    }

    public int hashCode() {
        int i;
        int hashCode = (getExtension().hashCode() + ((Long.valueOf(getNationalNumber()).hashCode() + ((getCountryCode() + 2173) * 53)) * 53)) * 53;
        int i2 = 1231;
        if (isItalianLeadingZero()) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode2 = (getPreferredDomesticCarrierCode().hashCode() + ((getCountryCodeSource().hashCode() + ((getRawInput().hashCode() + ((getNumberOfLeadingZeros() + ((hashCode + i) * 53)) * 53)) * 53)) * 53)) * 53;
        if (!hasPreferredDomesticCarrierCode()) {
            i2 = 1237;
        }
        return hashCode2 + i2;
    }

    public int getCountryCode() {
        return this.LJLILLLLZI;
    }

    public EnumC66521Q8v getCountryCodeSource() {
        return this.LJLLL;
    }

    public String getExtension() {
        return this.LJLJJLL;
    }

    public long getNationalNumber() {
        return this.LJLJJI;
    }

    public int getNumberOfLeadingZeros() {
        return this.LJLL;
    }

    public String getPreferredDomesticCarrierCode() {
        return this.LJLLLLLL;
    }

    public String getRawInput() {
        return this.LJLLILLLL;
    }

    public boolean hasCountryCode() {
        return this.LJLIL;
    }

    public boolean hasCountryCodeSource() {
        return this.LJLLJ;
    }

    public boolean hasExtension() {
        return this.LJLJJL;
    }

    public boolean hasItalianLeadingZero() {
        return this.LJLJL;
    }

    public boolean hasNationalNumber() {
        return this.LJLJI;
    }

    public boolean hasNumberOfLeadingZeros() {
        return this.LJLJLLL;
    }

    public boolean hasPreferredDomesticCarrierCode() {
        return this.LJLLLL;
    }

    public boolean hasRawInput() {
        return this.LJLLI;
    }

    public boolean isItalianLeadingZero() {
        return this.LJLJLJ;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C66516Q8q) && exactlySameAs((C66516Q8q) obj)) {
            return true;
        }
        return false;
    }

    public boolean exactlySameAs(C66516Q8q c66516Q8q) {
        if (c66516Q8q == null) {
            return false;
        }
        if (this == c66516Q8q) {
            return true;
        }
        if (this.LJLILLLLZI != c66516Q8q.LJLILLLLZI || this.LJLJJI != c66516Q8q.LJLJJI || !this.LJLJJLL.equals(c66516Q8q.LJLJJLL) || this.LJLJLJ != c66516Q8q.LJLJLJ || this.LJLL != c66516Q8q.LJLL || !this.LJLLILLLL.equals(c66516Q8q.LJLLILLLL) || this.LJLLL != c66516Q8q.LJLLL || !this.LJLLLLLL.equals(c66516Q8q.LJLLLLLL) || hasPreferredDomesticCarrierCode() != c66516Q8q.hasPreferredDomesticCarrierCode()) {
            return false;
        }
        return true;
    }

    public C66516Q8q mergeFrom(C66516Q8q c66516Q8q) {
        if (c66516Q8q.hasCountryCode()) {
            setCountryCode(c66516Q8q.getCountryCode());
        }
        if (c66516Q8q.hasNationalNumber()) {
            setNationalNumber(c66516Q8q.getNationalNumber());
        }
        if (c66516Q8q.hasExtension()) {
            setExtension(c66516Q8q.getExtension());
        }
        if (c66516Q8q.hasItalianLeadingZero()) {
            setItalianLeadingZero(c66516Q8q.isItalianLeadingZero());
        }
        if (c66516Q8q.hasNumberOfLeadingZeros()) {
            setNumberOfLeadingZeros(c66516Q8q.getNumberOfLeadingZeros());
        }
        if (c66516Q8q.hasRawInput()) {
            setRawInput(c66516Q8q.getRawInput());
        }
        if (c66516Q8q.hasCountryCodeSource()) {
            setCountryCodeSource(c66516Q8q.getCountryCodeSource());
        }
        if (c66516Q8q.hasPreferredDomesticCarrierCode()) {
            setPreferredDomesticCarrierCode(c66516Q8q.getPreferredDomesticCarrierCode());
        }
        return this;
    }

    public C66516Q8q setCountryCode(int i) {
        this.LJLIL = true;
        this.LJLILLLLZI = i;
        return this;
    }

    public C66516Q8q setCountryCodeSource(EnumC66521Q8v enumC66521Q8v) {
        if (enumC66521Q8v != null) {
            this.LJLLJ = true;
            this.LJLLL = enumC66521Q8v;
            return this;
        }
        throw null;
    }

    public C66516Q8q setExtension(String str) {
        if (str != null) {
            this.LJLJJL = true;
            this.LJLJJLL = str;
            return this;
        }
        throw null;
    }

    public C66516Q8q setItalianLeadingZero(boolean z) {
        this.LJLJL = true;
        this.LJLJLJ = z;
        return this;
    }

    public C66516Q8q setNationalNumber(long j) {
        this.LJLJI = true;
        this.LJLJJI = j;
        return this;
    }

    public C66516Q8q setNumberOfLeadingZeros(int i) {
        this.LJLJLLL = true;
        this.LJLL = i;
        return this;
    }

    public C66516Q8q setPreferredDomesticCarrierCode(String str) {
        if (str != null) {
            this.LJLLLL = true;
            this.LJLLLLLL = str;
            return this;
        }
        throw null;
    }

    public C66516Q8q setRawInput(String str) {
        if (str != null) {
            this.LJLLI = true;
            this.LJLLILLLL = str;
            return this;
        }
        throw null;
    }
}
