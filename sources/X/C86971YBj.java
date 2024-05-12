package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.YBj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86971YBj extends C86968YBg {
    public C86971YBj(List<Locale> list) {
        super(list);
    }

    @Override // X.C86968YBg
    public final int LIZJ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        int LIZJ = super.LIZJ(str);
        if (LIZJ == -1) {
            return super.LIZJ(C78897Uxp.LJJIII(str));
        }
        return LIZJ;
    }
}
