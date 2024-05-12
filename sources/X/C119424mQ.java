package X;

import android.os.Bundle;

/* renamed from: X.4mQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119424mQ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Bundle LJ;

    public C119424mQ(C119434mR c119434mR) {
        Bundle bundle = new Bundle();
        this.LJ = bundle;
        this.LIZ = "";
        String str = c119434mR.LIZ;
        this.LIZIZ = str == null ? "" : str;
        String str2 = c119434mR.LIZIZ;
        this.LIZJ = str2 == null ? "" : str2;
        String str3 = c119434mR.LIZJ;
        this.LIZLLL = str3 != null ? str3 : "";
        bundle.putAll(c119434mR.LIZLLL);
    }
}
