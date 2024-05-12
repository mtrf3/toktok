package X;

import androidx.lifecycle.LiveData;

/* renamed from: X.3B3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3B3 {
    public static /* synthetic */ void LIZJ(C3B2 c3b2, String str, long j, int i) {
        boolean z;
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        c3b2.LJIIIIZZ(j, str, z);
    }

    public static /* synthetic */ LiveData LIZ(C3B2 c3b2, String str, C3BA c3ba, String str2, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            c3ba = C3BA.OTHERS;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return c3b2.LIZIZ(str, z, c3ba, str2);
    }
}
