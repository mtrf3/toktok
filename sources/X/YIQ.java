package X;

import X.YIQ;
import X.YIS;
import java.io.IOException;

/* loaded from: classes16.dex */
public abstract class YIQ<MessageType extends YIQ<MessageType, BuilderType>, BuilderType extends YIS<MessageType, BuilderType>> implements YIZ {
    public static boolean zzfud;
    public int zzfuc;

    @Override // X.YIZ
    public final C87142YHy LJ() {
        try {
            YIO yio = (YIO) this;
            C40661FxZ c40661FxZ = new C40661FxZ(yio.LIZLLL());
            yio.LIZ((AbstractC87156YIm) c40661FxZ.LJLIL);
            if (((AbstractC87156YIm) c40661FxZ.LJLIL).LJII() == 0) {
                return new C87142YHy((byte[]) c40661FxZ.LJLILLLLZI);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(C1FL.LIZ(name, 62, 10));
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int LJFF() {
        throw new UnsupportedOperationException();
    }

    public void LJI(int i) {
        throw new UnsupportedOperationException();
    }
}
