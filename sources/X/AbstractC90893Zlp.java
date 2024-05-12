package X;

import X.AbstractC90695Zid;
import X.AbstractC90893Zlp;
import java.io.IOException;

/* renamed from: X.Zlp, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90893Zlp<MessageType extends AbstractC90893Zlp<MessageType, BuilderType>, BuilderType extends AbstractC90695Zid<MessageType, BuilderType>> implements InterfaceC90712Ziu {
    public int zza;

    public int LIZ() {
        throw null;
    }

    public void LIZIZ(int i) {
        throw null;
    }

    @Override // X.InterfaceC90712Ziu
    public final C90895Zlr LJIIIZ() {
        try {
            AbstractC90950Zmk abstractC90950Zmk = (AbstractC90950Zmk) this;
            int LJFF = abstractC90950Zmk.LJFF();
            byte[] bArr = new byte[LJFF];
            C90898Zlu c90898Zlu = new C90898Zlu(bArr, LJFF);
            InterfaceC90399Zdr LIZ = C90375ZdT.LIZJ.LIZ(abstractC90950Zmk.getClass());
            C90405Zdx c90405Zdx = c90898Zlu.LIZ;
            if (c90405Zdx == null) {
                c90405Zdx = new C90405Zdx(c90898Zlu);
            }
            LIZ.LJI(abstractC90950Zmk, c90405Zdx);
            if (c90898Zlu.LJIJJLI() == 0) {
                return new C90895Zlr(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
