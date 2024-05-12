package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Q8p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66515Q8p implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean LJLIL;
    public boolean LJLJJL;
    public String LJLILLLLZI = "";
    public final List<Integer> LJLJI = new ArrayList();
    public final List<Integer> LJLJJI = new ArrayList();
    public String LJLJJLL = "";

    public C66515Q8p clearExampleNumber() {
        this.LJLJJL = false;
        this.LJLJJLL = "";
        return this;
    }

    public C66515Q8p clearNationalNumberPattern() {
        this.LJLIL = false;
        this.LJLILLLLZI = "";
        return this;
    }

    public static C66520Q8u newBuilder() {
        return new C66520Q8u();
    }

    public C66515Q8p clearPossibleLength() {
        ((ArrayList) this.LJLJI).clear();
        return this;
    }

    public C66515Q8p clearPossibleLengthLocalOnly() {
        ((ArrayList) this.LJLJJI).clear();
        return this;
    }

    public int getPossibleLengthCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public int getPossibleLengthLocalOnlyCount() {
        return ((ArrayList) this.LJLJJI).size();
    }

    public String getExampleNumber() {
        return this.LJLJJLL;
    }

    public String getNationalNumberPattern() {
        return this.LJLILLLLZI;
    }

    public List<Integer> getPossibleLengthList() {
        return this.LJLJI;
    }

    public List<Integer> getPossibleLengthLocalOnlyList() {
        return this.LJLJJI;
    }

    public boolean hasExampleNumber() {
        return this.LJLJJL;
    }

    public boolean hasNationalNumberPattern() {
        return this.LJLIL;
    }

    public C66515Q8p addPossibleLength(int i) {
        ((ArrayList) this.LJLJI).add(Integer.valueOf(i));
        return this;
    }

    public C66515Q8p addPossibleLengthLocalOnly(int i) {
        ((ArrayList) this.LJLJJI).add(Integer.valueOf(i));
        return this;
    }

    public boolean exactlySameAs(C66515Q8p c66515Q8p) {
        if (this.LJLILLLLZI.equals(c66515Q8p.LJLILLLLZI) && this.LJLJI.equals(c66515Q8p.LJLJI) && this.LJLJJI.equals(c66515Q8p.LJLJJI) && this.LJLJJLL.equals(c66515Q8p.LJLJJLL)) {
            return true;
        }
        return false;
    }

    public int getPossibleLength(int i) {
        return ((Integer) ListProtector.get(this.LJLJI, i)).intValue();
    }

    public int getPossibleLengthLocalOnly(int i) {
        return ((Integer) ListProtector.get(this.LJLJJI, i)).intValue();
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            setNationalNumberPattern(objectInput.readUTF());
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            ((ArrayList) this.LJLJI).add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            ((ArrayList) this.LJLJJI).add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            setExampleNumber(objectInput.readUTF());
        }
    }

    public C66515Q8p setExampleNumber(String str) {
        this.LJLJJL = true;
        this.LJLJJLL = str;
        return this;
    }

    public C66515Q8p setNationalNumberPattern(String str) {
        this.LJLIL = true;
        this.LJLILLLLZI = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.LJLIL);
        if (this.LJLIL) {
            objectOutput.writeUTF(this.LJLILLLLZI);
        }
        int possibleLengthCount = getPossibleLengthCount();
        objectOutput.writeInt(possibleLengthCount);
        for (int i = 0; i < possibleLengthCount; i++) {
            objectOutput.writeInt(((Integer) ListProtector.get(this.LJLJI, i)).intValue());
        }
        int possibleLengthLocalOnlyCount = getPossibleLengthLocalOnlyCount();
        objectOutput.writeInt(possibleLengthLocalOnlyCount);
        for (int i2 = 0; i2 < possibleLengthLocalOnlyCount; i2++) {
            objectOutput.writeInt(((Integer) ListProtector.get(this.LJLJJI, i2)).intValue());
        }
        objectOutput.writeBoolean(this.LJLJJL);
        if (this.LJLJJL) {
            objectOutput.writeUTF(this.LJLJJLL);
        }
    }
}
