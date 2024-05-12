package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.PtD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65871PtD implements Externalizable {
    public static final long serialVersionUID = 0;
    public java.util.Map<?, ?> LJLIL;

    public C65871PtD() {
        this(C113554cx.LJJJLIIL());
    }

    private final Object readResolve() {
        return this.LJLIL;
    }

    public C65871PtD(java.util.Map<?, ?> map) {
        o.LJIIIZ(map, "map");
        this.LJLIL = map;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        o.LJIIIZ(input, "input");
        byte readByte = input.readByte();
        if (readByte == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                C65864Pt6 c65864Pt6 = new C65864Pt6(readInt);
                for (int i = 0; i < readInt; i++) {
                    c65864Pt6.put(input.readObject(), input.readObject());
                }
                c65864Pt6.build();
                this.LJLIL = c65864Pt6;
                return;
            }
            throw new InvalidObjectException(C10120aW.LIZ("Illegal size value: ", readInt, '.'));
        }
        throw new InvalidObjectException(KMP.LJ("Unsupported flags value: ", readByte));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        o.LJIIIZ(output, "output");
        output.writeByte(0);
        output.writeInt(this.LJLIL.size());
        for (Map.Entry<?, ?> entry : this.LJLIL.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
