package X;

/* renamed from: X.1Rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33051Rl implements InterfaceC13750gN {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC13750gN
    public final int LIZ(int i, CharSequence charSequence) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            if (directionality != 0) {
                if (directionality == 1 || directionality == 2) {
                    return 0;
                }
            } else {
                z = true;
            }
        }
        if (z) {
            return 1;
        }
        return 2;
    }
}
