package X;

import kotlin.jvm.internal.IDqS178S0200000_31;

/* renamed from: X.a6b, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92181a6b implements InterfaceC91977a3J {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ C92363a9X LIZIZ;

    public C92181a6b(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C92363a9X c92363a9X) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = c92363a9X;
    }

    @Override // X.InterfaceC91977a3J
    public final void LIZ(int i, int i2, String str, C91975a3H c91975a3H, String str2) {
        InterfaceC91976a3I interfaceC91976a3I;
        InterfaceC91976a3I interfaceC91976a3I2;
        InterfaceC91976a3I interfaceC91976a3I3;
        this.LIZ.invoke();
        if (i == 1) {
            try {
                String str3 = c91975a3H.LIZ;
                if (str3 != null && str3.length() != 0 && (interfaceC91976a3I3 = C91979a3L.LIZ) != null) {
                    interfaceC91976a3I3.LIZJ(c91975a3H.LIZIZ, c91975a3H.LIZ);
                }
                String str4 = c91975a3H.LIZJ;
                if (str4 != null && str4.length() != 0 && (interfaceC91976a3I2 = C91979a3L.LIZIZ) != null) {
                    interfaceC91976a3I2.LIZJ(c91975a3H.LIZLLL, c91975a3H.LIZJ);
                }
                String str5 = c91975a3H.LJ;
                if (str5 != null && str5.length() != 0 && (interfaceC91976a3I = C91979a3L.LIZJ) != null) {
                    interfaceC91976a3I.LIZJ(c91975a3H.LJFF, c91975a3H.LJ);
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (i2 == 107) {
            this.LIZIZ.LJIJJ.invoke();
            C92158a6E c92158a6E = new C92158a6E(null);
            this.LIZIZ.LJJJI.setValue(new C91843a19(c92158a6E, C92054a4Y.LIZ("pipo_payin_dropin_cashier_networkerror", new String[0]), C92054a4Y.LIZ("pipo_payin_dropin_cashier_networkerror_statement", new String[0]), C92054a4Y.LIZ("pipo_payin_state_cashier_btn_ok", new String[0]), new IDqS178S0200000_31(c92158a6E, this.LIZIZ, 4)));
        }
    }
}
