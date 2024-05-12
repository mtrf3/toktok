package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.Mky, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57716Mky implements InterfaceC57671MkF<String> {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC57724Ml6 LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final int hashCode() {
        return C79062V1e.LJ(this.LIZLLL, (this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31)) * 31, 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendNewVideoLoadParams(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", secUid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", scene=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pageToken=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", loadCount=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57716Mky)) {
            return false;
        }
        C57716Mky c57716Mky = (C57716Mky) obj;
        if (o.LJ(this.LIZ, c57716Mky.LIZ) && o.LJ(this.LIZIZ, c57716Mky.LIZIZ) && this.LIZJ == c57716Mky.LIZJ && o.LJ(this.LIZLLL, c57716Mky.LIZLLL) && this.LJ == c57716Mky.LJ) {
            return true;
        }
        return false;
    }

    public static C57716Mky LIZ(C57716Mky c57716Mky, String str) {
        String uid = c57716Mky.LIZ;
        String secUid = c57716Mky.LIZIZ;
        EnumC57724Ml6 scene = c57716Mky.LIZJ;
        int i = c57716Mky.LJ;
        c57716Mky.getClass();
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(scene, "scene");
        return new C57716Mky(uid, secUid, scene, str, i);
    }

    public C57716Mky(String str, String str2, EnumC57724Ml6 scene, String str3, int i) {
        o.LJIIIZ(scene, "scene");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = scene;
        this.LIZLLL = str3;
        this.LJ = i;
    }
}
