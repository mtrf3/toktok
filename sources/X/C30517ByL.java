package X;

import android.text.TextUtils;

/* renamed from: X.ByL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30517ByL {
    public final String LIZ;
    public boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30517ByL)) {
            return false;
        }
        return TextUtils.equals(((C30517ByL) obj).LIZ, this.LIZ);
    }

    public C30517ByL(long j, long j2, String str) {
        this.LIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
