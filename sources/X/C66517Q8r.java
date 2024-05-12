package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Q8r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66517Q8r implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean LJLIL;
    public boolean LJLJI;
    public boolean LJLJJLL;
    public boolean LJLJLJ;
    public boolean LJLL;
    public String LJLILLLLZI = "";
    public String LJLJJI = "";
    public final List<String> LJLJJL = new ArrayList();
    public String LJLJL = "";
    public boolean LJLJLLL = false;
    public String LJLLI = "";

    public C66517Q8r clearNationalPrefixFormattingRule() {
        this.LJLJJLL = false;
        this.LJLJL = "";
        return this;
    }

    public static C66518Q8s newBuilder() {
        return new C66518Q8s();
    }

    public int leadingDigitsPatternSize() {
        return ((ArrayList) this.LJLJJL).size();
    }

    public String getDomesticCarrierCodeFormattingRule() {
        return this.LJLLI;
    }

    public String getFormat() {
        return this.LJLJJI;
    }

    public String getNationalPrefixFormattingRule() {
        return this.LJLJL;
    }

    public boolean getNationalPrefixOptionalWhenFormatting() {
        return this.LJLJLLL;
    }

    public String getPattern() {
        return this.LJLILLLLZI;
    }

    public boolean hasDomesticCarrierCodeFormattingRule() {
        return this.LJLL;
    }

    public boolean hasFormat() {
        return this.LJLJI;
    }

    public boolean hasNationalPrefixFormattingRule() {
        return this.LJLJJLL;
    }

    public boolean hasNationalPrefixOptionalWhenFormatting() {
        return this.LJLJLJ;
    }

    public boolean hasPattern() {
        return this.LJLIL;
    }

    public List<String> leadingDigitPatterns() {
        return this.LJLJJL;
    }

    public C66517Q8r addLeadingDigitsPattern(String str) {
        if (str != null) {
            ((ArrayList) this.LJLJJL).add(str);
            return this;
        }
        throw null;
    }

    public String getLeadingDigitsPattern(int i) {
        return (String) ListProtector.get(this.LJLJJL, i);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        setPattern(objectInput.readUTF());
        setFormat(objectInput.readUTF());
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            ((ArrayList) this.LJLJJL).add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setNationalPrefixFormattingRule(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            setDomesticCarrierCodeFormattingRule(objectInput.readUTF());
        }
        setNationalPrefixOptionalWhenFormatting(objectInput.readBoolean());
    }

    public C66517Q8r setDomesticCarrierCodeFormattingRule(String str) {
        this.LJLL = true;
        this.LJLLI = str;
        return this;
    }

    public C66517Q8r setFormat(String str) {
        this.LJLJI = true;
        this.LJLJJI = str;
        return this;
    }

    public C66517Q8r setNationalPrefixFormattingRule(String str) {
        this.LJLJJLL = true;
        this.LJLJL = str;
        return this;
    }

    public C66517Q8r setNationalPrefixOptionalWhenFormatting(boolean z) {
        this.LJLJLJ = true;
        this.LJLJLLL = z;
        return this;
    }

    public C66517Q8r setPattern(String str) {
        this.LJLIL = true;
        this.LJLILLLLZI = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.LJLILLLLZI);
        objectOutput.writeUTF(this.LJLJJI);
        int leadingDigitsPatternSize = leadingDigitsPatternSize();
        objectOutput.writeInt(leadingDigitsPatternSize);
        for (int i = 0; i < leadingDigitsPatternSize; i++) {
            objectOutput.writeUTF((String) ListProtector.get(this.LJLJJL, i));
        }
        objectOutput.writeBoolean(this.LJLJJLL);
        if (this.LJLJJLL) {
            objectOutput.writeUTF(this.LJLJL);
        }
        objectOutput.writeBoolean(this.LJLL);
        if (this.LJLL) {
            objectOutput.writeUTF(this.LJLLI);
        }
        objectOutput.writeBoolean(this.LJLJLLL);
    }
}
