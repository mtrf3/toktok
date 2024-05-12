package X;

import android.text.Editable;
import android.text.TextUtils;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.84R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84R extends AbstractC65781Prl implements InterfaceC88472Yns<Editable, Boolean> {
    public static final C84R LJLIL = new C84R();

    public C84R() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Editable s) {
        int i;
        boolean z;
        o.LJIIIZ(s, "s");
        String obj = s.toString();
        boolean z2 = true;
        int length = obj.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length) {
            if (!z3) {
                i = i2;
            } else {
                i = length;
            }
            if (o.LJIIJJI(obj.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z3) {
                if (!z) {
                    z3 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        String LIZJ = C132805Jc.LIZJ(length, 1, obj, i2);
        if (!TextUtils.isEmpty(LIZJ) && !s.LJJJLZIJ(LIZJ, "@", false)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
