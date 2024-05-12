package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Q8t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66519Q8t implements Externalizable {
    public static final long serialVersionUID = 1;
    public final List<C66514Q8o> LJLIL = new ArrayList();

    public static Q91 newBuilder() {
        return new Q91();
    }

    public C66519Q8t clear() {
        ((ArrayList) this.LJLIL).clear();
        return this;
    }

    public int getMetadataCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public List<C66514Q8o> getMetadataList() {
        return this.LJLIL;
    }

    public C66519Q8t addMetadata(C66514Q8o c66514Q8o) {
        if (c66514Q8o != null) {
            ((ArrayList) this.LJLIL).add(c66514Q8o);
            return this;
        }
        throw null;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            C66514Q8o c66514Q8o = new C66514Q8o();
            c66514Q8o.readExternal(objectInput);
            ((ArrayList) this.LJLIL).add(c66514Q8o);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int metadataCount = getMetadataCount();
        objectOutput.writeInt(metadataCount);
        for (int i = 0; i < metadataCount; i++) {
            ((C66514Q8o) ListProtector.get(this.LJLIL, i)).writeExternal(objectOutput);
        }
    }
}
