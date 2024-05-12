package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a7F, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92221a7F implements InterfaceC91946a2o<String> {
    public final /* synthetic */ String LIZ;

    public C92221a7F(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        boolean z;
        String str2;
        String it = str;
        o.LJIIIZ(it, "it");
        if (it.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "";
        if (z) {
            str2 = "";
        } else {
            String str4 = this.LIZ;
            if (str4 == null || str4.length() == 0) {
                str2 = "pipo_cashier_form_error_required";
            } else {
                str2 = "pipo_common_error_required_field";
            }
            String str5 = this.LIZ;
            if (str5 == null || str5.length() == 0) {
                str3 = C92054a4Y.LIZ("pipo_cashier_form_error_required", new String[0]);
            } else {
                str3 = C92054a4Y.LJFF(C92054a4Y.LIZ("pipo_common_error_required_field", new String[0]), this.LIZ);
            }
        }
        return new C92223a7H(z, str2, str3);
    }
}
