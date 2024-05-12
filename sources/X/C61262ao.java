package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.b0;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.2ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61262ao {
    public final String LIZ;
    public boolean LIZIZ;
    public final List<Aweme> LIZJ;
    public final int LIZLLL;
    public int LJ = 0;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZJ, Boolean.valueOf(this.LIZIZ));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightFriendPostBean(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", allRead=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", awemeList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", priority=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", expectedPos=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61262ao)) {
            return false;
        }
        C61262ao c61262ao = (C61262ao) obj;
        if (o.LJ(this.LIZ, c61262ao.LIZ) && o.LJ(this.LIZJ, c61262ao.LIZJ) && this.LIZIZ == c61262ao.LIZIZ) {
            return true;
        }
        return false;
    }

    public C61262ao(int i, String str, List list, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = list;
        this.LIZLLL = i;
    }
}
