package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.PtE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65872PtE implements Externalizable {
    public static final C65873PtF Companion = new C65873PtF();
    public static final long serialVersionUID = 0;
    public Collection<?> LJLIL;
    public final int LJLILLLLZI;

    public C65872PtE() {
        this(C61878OQg.INSTANCE, 0);
    }

    private final Object readResolve() {
        return this.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        C61899ORb c61899ORb;
        o.LJIIIZ(input, "input");
        byte readByte = input.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                int i2 = 0;
                if (i != 0) {
                    if (i == 1) {
                        C65865Pt7 c65865Pt7 = new C65865Pt7(readInt);
                        while (i2 < readInt) {
                            c65865Pt7.add(input.readObject());
                            i2++;
                        }
                        c65865Pt7.build();
                        c61899ORb = c65865Pt7;
                    } else {
                        throw new InvalidObjectException(C10120aW.LIZ("Unsupported collection type tag: ", i, '.'));
                    }
                } else {
                    C61899ORb c61899ORb2 = new C61899ORb(readInt);
                    while (i2 < readInt) {
                        c61899ORb2.add(input.readObject());
                        i2++;
                    }
                    c61899ORb2.build();
                    c61899ORb = c61899ORb2;
                }
                this.LJLIL = c61899ORb;
                return;
            }
            throw new InvalidObjectException(C10120aW.LIZ("Illegal size value: ", readInt, '.'));
        }
        throw new InvalidObjectException(C10120aW.LIZ("Unsupported flags value: ", readByte, '.'));
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        o.LJIIIZ(output, "output");
        output.writeByte(this.LJLILLLLZI);
        output.writeInt(this.LJLIL.size());
        Iterator<?> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public C65872PtE(Collection<?> collection, int i) {
        o.LJIIIZ(collection, "collection");
        this.LJLIL = collection;
        this.LJLILLLLZI = i;
    }
}
