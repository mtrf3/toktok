package X;

import android.content.Context;
import java.util.LinkedHashSet;
import ujb.o;
import ujb.s;

/* renamed from: X.EOd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36343EOd extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<? extends String>> {
    public static final C36343EOd INSTANCE = new C36343EOd();

    public C36343EOd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<? extends String> invoke() {
        String string;
        boolean z;
        boolean z2;
        boolean z3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Context LIZIZ = EF7.LIZIZ();
            string = C16880lQ.LLLLLLLLL(LIZIZ.getPackageManager(), LIZIZ.getPackageName(), 128).metaData.getString("com.android.dynamic.apk.fused.modules");
        } catch (Throwable unused) {
        }
        if (string != null) {
            if (string.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                for (String str : s.LJLJJL(string, new String[]{","}, 0, 6)) {
                    if (str.length() <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        if (o.LJJJLIIL(str, "config.", false) || s.LJJJLZIJ(str, ".config.", false)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            linkedHashSet.add(str);
                        }
                    }
                }
                linkedHashSet.remove("base");
                return linkedHashSet;
            }
        }
        return OQY.INSTANCE;
    }
}
