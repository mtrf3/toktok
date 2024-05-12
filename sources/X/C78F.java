package X;

import kotlin.jvm.internal.o;

/* renamed from: X.78F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C78F implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final AnonymousClass787 LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78F)) {
            return false;
        }
        C78F c78f = (C78F) obj;
        return o.LJ(this.LJLIL, c78f.LJLIL) && o.LJ(this.LJLILLLLZI, c78f.LJLILLLLZI) && this.LJLJI == c78f.LJLJI;
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        return this.LJLJI.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RepostedListInitData(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", userId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", scene=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C78F() {
        this(null, null, AnonymousClass787.PROFILE_TAB_REPOSTED_LIST);
    }

    public C78F(String str, String str2, AnonymousClass787 scene) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = scene;
    }
}
