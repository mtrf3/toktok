package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.Objects;

/* renamed from: X.Ctf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32775Ctf extends Gift {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C32775Ctf() {
        this(0);
    }

    public final Object[] LIZIZ() {
        return new Object[]{this.LIZ, this.LIZIZ, this.LIZJ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32775Ctf) {
            return C78966Uyw.LJIIIZ(((C32775Ctf) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("EducationPanelItem:%s,%s,%s", LIZIZ());
    }

    public C32775Ctf(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
    }
}
