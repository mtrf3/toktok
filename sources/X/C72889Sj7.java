package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Sj7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72889Sj7 implements InterfaceC87283bg {
    public final User LJLIL;
    public final EnumC72891Sj9 LJLILLLLZI;
    public final boolean LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72889Sj7)) {
            return false;
        }
        C72889Sj7 c72889Sj7 = (C72889Sj7) obj;
        return o.LJ(this.LJLIL, c72889Sj7.LJLIL) && this.LJLILLLLZI == c72889Sj7.LJLILLLLZI && this.LJLJI == c72889Sj7.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        User user = this.LJLIL;
        int hashCode = (this.LJLILLLLZI.hashCode() + ((user == null ? 0 : user.hashCode()) * 31)) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationListHierarchyData(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", scene=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isMyself=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C72889Sj7(User user, EnumC72891Sj9 scene, boolean z) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = user;
        this.LJLILLLLZI = scene;
        this.LJLJI = z;
    }
}
