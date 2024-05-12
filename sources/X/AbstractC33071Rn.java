package X;

/* renamed from: X.1Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC33071Rn implements InterfaceC13740gM {
    public final InterfaceC13750gN LIZ;

    public abstract boolean LIZIZ();

    public AbstractC33071Rn(C33061Rm c33061Rm) {
        this.LIZ = c33061Rm;
    }

    @Override // X.InterfaceC13740gM
    public final boolean LIZ(int i, CharSequence charSequence) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            InterfaceC13750gN interfaceC13750gN = this.LIZ;
            if (interfaceC13750gN == null) {
                return LIZIZ();
            }
            int LIZ = interfaceC13750gN.LIZ(i, charSequence);
            if (LIZ == 0) {
                return true;
            }
            if (LIZ != 1) {
                return LIZIZ();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }
}
