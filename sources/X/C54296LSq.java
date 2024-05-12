package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;

/* renamed from: X.LSq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54296LSq {
    public final Class<? extends CommonPageFragment> LIZ;
    public final String LIZIZ;
    public final Bundle LIZJ;
    public final float LIZLLL = 1.0f;
    public final int LJ;

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LJ;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C54296LSq) {
            C54296LSq c54296LSq = (C54296LSq) obj;
            if (this.LIZIZ.equals(c54296LSq.LIZIZ) && this.LJ == c54296LSq.LJ) {
                return true;
            }
        }
        return false;
    }

    public C54296LSq(Class cls, String str, int i, Bundle bundle) {
        this.LIZ = cls;
        this.LIZIZ = str;
        this.LIZJ = bundle;
        this.LJ = i;
    }
}
