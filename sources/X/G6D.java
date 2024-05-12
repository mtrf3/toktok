package X;

import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.b0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G6D implements Serializable {
    public final int LJLIL;
    public final List<User> LJLILLLLZI;
    public final int LJLJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public G6D() {
        /*
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 7
            r0 = r6
            r3 = r1
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G6D.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G6D(int i) {
        this(i, null, 0, 6, 0 == true ? 1 : 0);
    }

    public G6D(int i, List<? extends User> list) {
        this(i, list, 0, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ G6D copy$default(G6D g6d, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = g6d.LJLIL;
        }
        if ((i3 & 2) != 0) {
            list = g6d.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            i2 = g6d.LJLJI;
        }
        return g6d.copy(i, list, i2);
    }

    public final G6D copy(int i, List<? extends User> list, int i2) {
        return new G6D(i, list, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G6D)) {
            return false;
        }
        G6D g6d = (G6D) obj;
        return this.LJLIL == g6d.LJLIL && o.LJ(this.LJLILLLLZI, g6d.LJLILLLLZI) && this.LJLJI == g6d.LJLJI;
    }

    public int hashCode() {
        int i = this.LJLIL * 31;
        List<User> list = this.LJLILLLLZI;
        return ((i + (list == null ? 0 : list.hashCode())) * 31) + this.LJLJI;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermissionWrapper(permission=");
        LIZ.append(this.LJLIL);
        LIZ.append(", excludeUserList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", allowRecommend=");
        return b0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final int getAllowRecommend() {
        return this.LJLJI;
    }

    public final List<User> getExcludeUserList() {
        return this.LJLILLLLZI;
    }

    public final int getPermission() {
        return this.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G6D(int i, List<? extends User> list, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = list;
        this.LJLJI = i2;
    }

    public /* synthetic */ G6D(int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : list, (i3 & 4) != 0 ? 0 : i2);
    }
}
