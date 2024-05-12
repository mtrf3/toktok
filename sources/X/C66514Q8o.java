package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Q8o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66514Q8o implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean LJLIL;
    public C66515Q8p LJLILLLLZI;
    public boolean LJLJI;
    public C66515Q8p LJLJJI;
    public boolean LJLJJL;
    public C66515Q8p LJLJJLL;
    public boolean LJLJL;
    public C66515Q8p LJLJLJ;
    public boolean LJLJLLL;
    public C66515Q8p LJLL;
    public boolean LJLLI;
    public C66515Q8p LJLLILLLL;
    public boolean LJLLJ;
    public C66515Q8p LJLLL;
    public boolean LJLLLL;
    public C66515Q8p LJLLLLLL;
    public boolean LJLZ;
    public C66515Q8p LJZ;
    public boolean LJZI;
    public C66515Q8p LJZL;
    public boolean LL;
    public C66515Q8p LLD;
    public boolean LLF;
    public C66515Q8p LLFF;
    public boolean LLFFF;
    public C66515Q8p LLFII;
    public boolean LLFZ;
    public C66515Q8p LLI;
    public boolean LLIFFJFJJ;
    public C66515Q8p LLII;
    public boolean LLIIII;
    public C66515Q8p LLIIIILZ;
    public boolean LLIIIJ;
    public C66515Q8p LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJLIL;
    public int LLIIL;
    public boolean LLIILII;
    public boolean LLIIZ;
    public boolean LLILII;
    public boolean LLILL;
    public boolean LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLJI;
    public boolean LLJILJIL;
    public boolean LLJILLL;
    public boolean LLJJI;
    public String LLIIJI = "";
    public String LLIILZL = "";
    public String LLIL = "";
    public String LLILIL = "";
    public String LLILLIZIL = "";
    public String LLILLL = "";
    public String LLILZIL = "";
    public final List<C66517Q8r> LLIZLLLIL = new ArrayList();
    public final List<C66517Q8r> LLJ = new ArrayList();
    public boolean LLJIJIL = false;
    public String LLJILJILJ = "";
    public boolean LLJJ = false;
    public boolean LLJJIII = false;

    public C66514Q8o clearLeadingZeroPossible() {
        this.LLJILLL = false;
        this.LLJJ = false;
        return this;
    }

    public C66514Q8o clearMainCountryForCode() {
        this.LLJI = false;
        this.LLJIJIL = false;
        return this;
    }

    public C66514Q8o clearMobileNumberPortableRegion() {
        this.LLJJI = false;
        this.LLJJIII = false;
        return this;
    }

    public C66514Q8o clearNationalPrefix() {
        this.LLILII = false;
        this.LLILIL = "";
        return this;
    }

    public C66514Q8o clearNationalPrefixTransformRule() {
        this.LLILZ = false;
        this.LLILZIL = "";
        return this;
    }

    public C66514Q8o clearPreferredExtnPrefix() {
        this.LLILL = false;
        this.LLILLIZIL = "";
        return this;
    }

    public C66514Q8o clearPreferredInternationalPrefix() {
        this.LLIIZ = false;
        this.LLIL = "";
        return this;
    }

    public C66514Q8o clearSameMobileAndFixedLinePattern() {
        this.LLILZLL = false;
        this.LLIZ = false;
        return this;
    }

    public static Q90 newBuilder() {
        return new Q90();
    }

    public C66514Q8o clearIntlNumberFormat() {
        ((ArrayList) this.LLJ).clear();
        return this;
    }

    public int intlNumberFormatSize() {
        return ((ArrayList) this.LLJ).size();
    }

    public int numberFormatSize() {
        return ((ArrayList) this.LLIZLLLIL).size();
    }

    public C66515Q8p getCarrierSpecific() {
        return this.LLII;
    }

    public int getCountryCode() {
        return this.LLIIL;
    }

    public C66515Q8p getEmergency() {
        return this.LLD;
    }

    public C66515Q8p getFixedLine() {
        return this.LJLJJI;
    }

    public C66515Q8p getGeneralDesc() {
        return this.LJLILLLLZI;
    }

    public String getId() {
        return this.LLIIJI;
    }

    public String getInternationalPrefix() {
        return this.LLIILZL;
    }

    public String getLeadingDigits() {
        return this.LLJILJILJ;
    }

    public boolean getMainCountryForCode() {
        return this.LLJIJIL;
    }

    public C66515Q8p getMobile() {
        return this.LJLJJLL;
    }

    public String getNationalPrefix() {
        return this.LLILIL;
    }

    public String getNationalPrefixForParsing() {
        return this.LLILLL;
    }

    public String getNationalPrefixTransformRule() {
        return this.LLILZIL;
    }

    public C66515Q8p getNoInternationalDialling() {
        return this.LLIIIL;
    }

    public C66515Q8p getPager() {
        return this.LJZ;
    }

    public C66515Q8p getPersonalNumber() {
        return this.LJLLL;
    }

    public String getPreferredExtnPrefix() {
        return this.LLILLIZIL;
    }

    public String getPreferredInternationalPrefix() {
        return this.LLIL;
    }

    public C66515Q8p getPremiumRate() {
        return this.LJLL;
    }

    public boolean getSameMobileAndFixedLinePattern() {
        return this.LLIZ;
    }

    public C66515Q8p getSharedCost() {
        return this.LJLLILLLL;
    }

    public C66515Q8p getShortCode() {
        return this.LLFII;
    }

    public C66515Q8p getSmsServices() {
        return this.LLIIIILZ;
    }

    public C66515Q8p getStandardRate() {
        return this.LLI;
    }

    public C66515Q8p getTollFree() {
        return this.LJLJLJ;
    }

    public C66515Q8p getUan() {
        return this.LJZL;
    }

    public C66515Q8p getVoicemail() {
        return this.LLFF;
    }

    public C66515Q8p getVoip() {
        return this.LJLLLLLL;
    }

    public boolean hasCarrierSpecific() {
        return this.LLIFFJFJJ;
    }

    public boolean hasCountryCode() {
        return this.LLIIJLIL;
    }

    public boolean hasEmergency() {
        return this.LL;
    }

    public boolean hasFixedLine() {
        return this.LJLJI;
    }

    public boolean hasGeneralDesc() {
        return this.LJLIL;
    }

    public boolean hasId() {
        return this.LLIIIZ;
    }

    public boolean hasInternationalPrefix() {
        return this.LLIILII;
    }

    public boolean hasLeadingDigits() {
        return this.LLJILJIL;
    }

    public boolean hasLeadingZeroPossible() {
        return this.LLJILLL;
    }

    public boolean hasMainCountryForCode() {
        return this.LLJI;
    }

    public boolean hasMobile() {
        return this.LJLJJL;
    }

    public boolean hasMobileNumberPortableRegion() {
        return this.LLJJI;
    }

    public boolean hasNationalPrefix() {
        return this.LLILII;
    }

    public boolean hasNationalPrefixForParsing() {
        return this.LLILLJJLI;
    }

    public boolean hasNationalPrefixTransformRule() {
        return this.LLILZ;
    }

    public boolean hasNoInternationalDialling() {
        return this.LLIIIJ;
    }

    public boolean hasPager() {
        return this.LJLZ;
    }

    public boolean hasPersonalNumber() {
        return this.LJLLJ;
    }

    public boolean hasPreferredExtnPrefix() {
        return this.LLILL;
    }

    public boolean hasPreferredInternationalPrefix() {
        return this.LLIIZ;
    }

    public boolean hasPremiumRate() {
        return this.LJLJLLL;
    }

    public boolean hasSameMobileAndFixedLinePattern() {
        return this.LLILZLL;
    }

    public boolean hasSharedCost() {
        return this.LJLLI;
    }

    public boolean hasShortCode() {
        return this.LLFFF;
    }

    public boolean hasSmsServices() {
        return this.LLIIII;
    }

    public boolean hasStandardRate() {
        return this.LLFZ;
    }

    public boolean hasTollFree() {
        return this.LJLJL;
    }

    public boolean hasUan() {
        return this.LJZI;
    }

    public boolean hasVoicemail() {
        return this.LLF;
    }

    public boolean hasVoip() {
        return this.LJLLLL;
    }

    public List<C66517Q8r> intlNumberFormats() {
        return this.LLJ;
    }

    public boolean isLeadingZeroPossible() {
        return this.LLJJ;
    }

    public boolean isMainCountryForCode() {
        return this.LLJIJIL;
    }

    public boolean isMobileNumberPortableRegion() {
        return this.LLJJIII;
    }

    public List<C66517Q8r> numberFormats() {
        return this.LLIZLLLIL;
    }

    public C66514Q8o addIntlNumberFormat(C66517Q8r c66517Q8r) {
        if (c66517Q8r != null) {
            ((ArrayList) this.LLJ).add(c66517Q8r);
            return this;
        }
        throw null;
    }

    public C66514Q8o addNumberFormat(C66517Q8r c66517Q8r) {
        if (c66517Q8r != null) {
            ((ArrayList) this.LLIZLLLIL).add(c66517Q8r);
            return this;
        }
        throw null;
    }

    public C66517Q8r getIntlNumberFormat(int i) {
        return (C66517Q8r) ListProtector.get(this.LLJ, i);
    }

    public C66517Q8r getNumberFormat(int i) {
        return (C66517Q8r) ListProtector.get(this.LLIZLLLIL, i);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p = new C66515Q8p();
            c66515Q8p.readExternal(objectInput);
            setGeneralDesc(c66515Q8p);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p2 = new C66515Q8p();
            c66515Q8p2.readExternal(objectInput);
            setFixedLine(c66515Q8p2);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p3 = new C66515Q8p();
            c66515Q8p3.readExternal(objectInput);
            setMobile(c66515Q8p3);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p4 = new C66515Q8p();
            c66515Q8p4.readExternal(objectInput);
            setTollFree(c66515Q8p4);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p5 = new C66515Q8p();
            c66515Q8p5.readExternal(objectInput);
            setPremiumRate(c66515Q8p5);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p6 = new C66515Q8p();
            c66515Q8p6.readExternal(objectInput);
            setSharedCost(c66515Q8p6);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p7 = new C66515Q8p();
            c66515Q8p7.readExternal(objectInput);
            setPersonalNumber(c66515Q8p7);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p8 = new C66515Q8p();
            c66515Q8p8.readExternal(objectInput);
            setVoip(c66515Q8p8);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p9 = new C66515Q8p();
            c66515Q8p9.readExternal(objectInput);
            setPager(c66515Q8p9);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p10 = new C66515Q8p();
            c66515Q8p10.readExternal(objectInput);
            setUan(c66515Q8p10);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p11 = new C66515Q8p();
            c66515Q8p11.readExternal(objectInput);
            setEmergency(c66515Q8p11);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p12 = new C66515Q8p();
            c66515Q8p12.readExternal(objectInput);
            setVoicemail(c66515Q8p12);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p13 = new C66515Q8p();
            c66515Q8p13.readExternal(objectInput);
            setShortCode(c66515Q8p13);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p14 = new C66515Q8p();
            c66515Q8p14.readExternal(objectInput);
            setStandardRate(c66515Q8p14);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p15 = new C66515Q8p();
            c66515Q8p15.readExternal(objectInput);
            setCarrierSpecific(c66515Q8p15);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p16 = new C66515Q8p();
            c66515Q8p16.readExternal(objectInput);
            setSmsServices(c66515Q8p16);
        }
        if (objectInput.readBoolean()) {
            C66515Q8p c66515Q8p17 = new C66515Q8p();
            c66515Q8p17.readExternal(objectInput);
            setNoInternationalDialling(c66515Q8p17);
        }
        setId(objectInput.readUTF());
        setCountryCode(objectInput.readInt());
        setInternationalPrefix(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            setPreferredInternationalPrefix(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setNationalPrefix(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setPreferredExtnPrefix(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setNationalPrefixForParsing(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setNationalPrefixTransformRule(objectInput.readUTF());
        }
        setSameMobileAndFixedLinePattern(objectInput.readBoolean());
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            C66517Q8r c66517Q8r = new C66517Q8r();
            c66517Q8r.readExternal(objectInput);
            ((ArrayList) this.LLIZLLLIL).add(c66517Q8r);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            C66517Q8r c66517Q8r2 = new C66517Q8r();
            c66517Q8r2.readExternal(objectInput);
            ((ArrayList) this.LLJ).add(c66517Q8r2);
        }
        setMainCountryForCode(objectInput.readBoolean());
        if (objectInput.readBoolean()) {
            setLeadingDigits(objectInput.readUTF());
        }
        setLeadingZeroPossible(objectInput.readBoolean());
        setMobileNumberPortableRegion(objectInput.readBoolean());
    }

    public C66514Q8o setCarrierSpecific(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LLIFFJFJJ = true;
            this.LLII = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setCountryCode(int i) {
        this.LLIIJLIL = true;
        this.LLIIL = i;
        return this;
    }

    public C66514Q8o setEmergency(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LL = true;
            this.LLD = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setFixedLine(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLJI = true;
            this.LJLJJI = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setGeneralDesc(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLIL = true;
            this.LJLILLLLZI = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setId(String str) {
        this.LLIIIZ = true;
        this.LLIIJI = str;
        return this;
    }

    public C66514Q8o setInternationalPrefix(String str) {
        this.LLIILII = true;
        this.LLIILZL = str;
        return this;
    }

    public C66514Q8o setLeadingDigits(String str) {
        this.LLJILJIL = true;
        this.LLJILJILJ = str;
        return this;
    }

    public C66514Q8o setLeadingZeroPossible(boolean z) {
        this.LLJILLL = true;
        this.LLJJ = z;
        return this;
    }

    public C66514Q8o setMainCountryForCode(boolean z) {
        this.LLJI = true;
        this.LLJIJIL = z;
        return this;
    }

    public C66514Q8o setMobile(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLJJL = true;
            this.LJLJJLL = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setMobileNumberPortableRegion(boolean z) {
        this.LLJJI = true;
        this.LLJJIII = z;
        return this;
    }

    public C66514Q8o setNationalPrefix(String str) {
        this.LLILII = true;
        this.LLILIL = str;
        return this;
    }

    public C66514Q8o setNationalPrefixForParsing(String str) {
        this.LLILLJJLI = true;
        this.LLILLL = str;
        return this;
    }

    public C66514Q8o setNationalPrefixTransformRule(String str) {
        this.LLILZ = true;
        this.LLILZIL = str;
        return this;
    }

    public C66514Q8o setNoInternationalDialling(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LLIIIJ = true;
            this.LLIIIL = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setPager(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLZ = true;
            this.LJZ = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setPersonalNumber(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLLJ = true;
            this.LJLLL = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setPreferredExtnPrefix(String str) {
        this.LLILL = true;
        this.LLILLIZIL = str;
        return this;
    }

    public C66514Q8o setPreferredInternationalPrefix(String str) {
        this.LLIIZ = true;
        this.LLIL = str;
        return this;
    }

    public C66514Q8o setPremiumRate(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLJLLL = true;
            this.LJLL = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setSameMobileAndFixedLinePattern(boolean z) {
        this.LLILZLL = true;
        this.LLIZ = z;
        return this;
    }

    public C66514Q8o setSharedCost(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLLI = true;
            this.LJLLILLLL = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setShortCode(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LLFFF = true;
            this.LLFII = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setSmsServices(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LLIIII = true;
            this.LLIIIILZ = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setStandardRate(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LLFZ = true;
            this.LLI = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setTollFree(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLJL = true;
            this.LJLJLJ = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setUan(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJZI = true;
            this.LJZL = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setVoicemail(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LLF = true;
            this.LLFF = c66515Q8p;
            return this;
        }
        throw null;
    }

    public C66514Q8o setVoip(C66515Q8p c66515Q8p) {
        if (c66515Q8p != null) {
            this.LJLLLL = true;
            this.LJLLLLLL = c66515Q8p;
            return this;
        }
        throw null;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.LJLIL);
        if (this.LJLIL) {
            this.LJLILLLLZI.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJLJI);
        if (this.LJLJI) {
            this.LJLJJI.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJLJJL);
        if (this.LJLJJL) {
            this.LJLJJLL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJLJL);
        if (this.LJLJL) {
            this.LJLJLJ.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJLJLLL);
        if (this.LJLJLLL) {
            this.LJLL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJLLI);
        if (this.LJLLI) {
            this.LJLLILLLL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJLLJ);
        if (this.LJLLJ) {
            this.LJLLL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJLLLL);
        if (this.LJLLLL) {
            this.LJLLLLLL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJLZ);
        if (this.LJLZ) {
            this.LJZ.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LJZI);
        if (this.LJZI) {
            this.LJZL.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LL);
        if (this.LL) {
            this.LLD.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLF);
        if (this.LLF) {
            this.LLFF.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLFFF);
        if (this.LLFFF) {
            this.LLFII.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLFZ);
        if (this.LLFZ) {
            this.LLI.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLIFFJFJJ);
        if (this.LLIFFJFJJ) {
            this.LLII.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLIIII);
        if (this.LLIIII) {
            this.LLIIIILZ.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLIIIJ);
        if (this.LLIIIJ) {
            this.LLIIIL.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.LLIIJI);
        objectOutput.writeInt(this.LLIIL);
        objectOutput.writeUTF(this.LLIILZL);
        objectOutput.writeBoolean(this.LLIIZ);
        if (this.LLIIZ) {
            objectOutput.writeUTF(this.LLIL);
        }
        objectOutput.writeBoolean(this.LLILII);
        if (this.LLILII) {
            objectOutput.writeUTF(this.LLILIL);
        }
        objectOutput.writeBoolean(this.LLILL);
        if (this.LLILL) {
            objectOutput.writeUTF(this.LLILLIZIL);
        }
        objectOutput.writeBoolean(this.LLILLJJLI);
        if (this.LLILLJJLI) {
            objectOutput.writeUTF(this.LLILLL);
        }
        objectOutput.writeBoolean(this.LLILZ);
        if (this.LLILZ) {
            objectOutput.writeUTF(this.LLILZIL);
        }
        objectOutput.writeBoolean(this.LLIZ);
        int numberFormatSize = numberFormatSize();
        objectOutput.writeInt(numberFormatSize);
        for (int i = 0; i < numberFormatSize; i++) {
            ((C66517Q8r) ListProtector.get(this.LLIZLLLIL, i)).writeExternal(objectOutput);
        }
        int intlNumberFormatSize = intlNumberFormatSize();
        objectOutput.writeInt(intlNumberFormatSize);
        for (int i2 = 0; i2 < intlNumberFormatSize; i2++) {
            ((C66517Q8r) ListProtector.get(this.LLJ, i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.LLJIJIL);
        objectOutput.writeBoolean(this.LLJILJIL);
        if (this.LLJILJIL) {
            objectOutput.writeUTF(this.LLJILJILJ);
        }
        objectOutput.writeBoolean(this.LLJJ);
        objectOutput.writeBoolean(this.LLJJIII);
    }
}
