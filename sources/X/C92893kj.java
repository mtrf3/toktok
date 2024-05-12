package X;

import android.text.Editable;
import android.text.TextUtils;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92893kj extends AbstractC65781Prl implements InterfaceC88472Yns<Editable, Boolean> {
    public static final C92893kj LJLIL = new C92893kj();

    public C92893kj() {
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
