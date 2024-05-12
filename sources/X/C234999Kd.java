package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.9Kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234999Kd implements InterfaceC198557ql {
    public final User LIZ;
    public final C43I<User> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C43I<User> LJ;
    public final EnumC235129Kq LJFF;
    public final C43I<C76800UCe> LJI;
    public final C43I<C76800UCe> LJII;

    public C234999Kd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C234999Kd)) {
            return false;
        }
        C234999Kd c234999Kd = (C234999Kd) obj;
        return o.LJ(this.LIZ, c234999Kd.LIZ) && o.LJ(this.LIZIZ, c234999Kd.LIZIZ) && this.LIZJ == c234999Kd.LIZJ && this.LIZLLL == c234999Kd.LIZLLL && o.LJ(this.LJ, c234999Kd.LJ) && this.LJFF == c234999Kd.LJFF && o.LJ(this.LJI, c234999Kd.LJI) && o.LJ(this.LJII, c234999Kd.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        User user = this.LIZ;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        C43I<User> c43i = this.LIZIZ;
        int hashCode2 = (hashCode + (c43i == null ? 0 : c43i.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode2 + i) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        C43I<User> c43i2 = this.LJ;
        int hashCode3 = (this.LJFF.hashCode() + ((i2 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31)) * 31;
        C43I<C76800UCe> c43i3 = this.LJI;
        int hashCode4 = (hashCode3 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<C76800UCe> c43i4 = this.LJII;
        return hashCode4 + (c43i4 != null ? c43i4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileInfoData(user=");
        LIZ.append(this.LIZ);
        LIZ.append(", userUpdateEvent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fromSetSimpleUser=");
        LIZ.append(this.LIZJ);
        LIZ.append(", fromRecSimpleUser=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", onUserLoadEvent=");
        LIZ.append(this.LJ);
        LIZ.append(", action=");
        LIZ.append(this.LJFF);
        LIZ.append(", changeTabs=");
        LIZ.append(this.LJI);
        LIZ.append(", refreshEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public /* synthetic */ C234999Kd(int i) {
        this(null, null, false, false, null, EnumC235129Kq.NORMAL, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C234999Kd(User user, C43I<? extends User> c43i, boolean z, boolean z2, C43I<? extends User> c43i2, EnumC235129Kq action, C43I<C76800UCe> c43i3, C43I<C76800UCe> c43i4) {
        o.LJIIIZ(action, "action");
        this.LIZ = user;
        this.LIZIZ = c43i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = c43i2;
        this.LJFF = action;
        this.LJI = c43i3;
        this.LJII = c43i4;
    }

    public static C234999Kd LIZ(C234999Kd c234999Kd, User user, C43I c43i, boolean z, boolean z2, EnumC235129Kq enumC235129Kq, C43I c43i2, C43I c43i3, int i) {
        C43I<User> c43i4;
        C43I c43i5 = c43i3;
        C43I c43i6 = c43i;
        User user2 = user;
        boolean z3 = z;
        boolean z4 = z2;
        EnumC235129Kq action = enumC235129Kq;
        C43I c43i7 = c43i2;
        if ((i & 1) != 0) {
            user2 = c234999Kd.LIZ;
        }
        if ((i & 2) != 0) {
            c43i6 = c234999Kd.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c234999Kd.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c234999Kd.LIZLLL;
        }
        if ((i & 16) != 0) {
            c43i4 = c234999Kd.LJ;
        } else {
            c43i4 = null;
        }
        if ((i & 32) != 0) {
            action = c234999Kd.LJFF;
        }
        if ((i & 64) != 0) {
            c43i7 = c234999Kd.LJI;
        }
        if ((i & 128) != 0) {
            c43i5 = c234999Kd.LJII;
        }
        c234999Kd.getClass();
        o.LJIIIZ(action, "action");
        return new C234999Kd(user2, c43i6, z3, z4, c43i4, action, c43i7, c43i5);
    }
}
