package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.0Lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06070Lr {
    public final String LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final User LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06070Lr)) {
            return false;
        }
        C06070Lr c06070Lr = (C06070Lr) obj;
        return o.LJ(this.LIZ, c06070Lr.LIZ) && o.LJ(this.LIZIZ, c06070Lr.LIZIZ) && o.LJ(this.LIZJ, c06070Lr.LIZJ) && o.LJ(this.LIZLLL, c06070Lr.LIZLLL) && o.LJ(this.LJ, c06070Lr.LJ) && o.LJ(this.LJFF, c06070Lr.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LIZIZ;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJ;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        User user = this.LJFF;
        return hashCode5 + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenGiftDialogParams(source=");
        LIZ.append(this.LIZ);
        LIZ.append(", anchorGiftId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", anchorColorId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isShowAMGPanel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isShowSwitchTargetUser=");
        LIZ.append(this.LJ);
        LIZ.append(", toUser=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C06070Lr(String str, Long l, Long l2, Boolean bool, Boolean bool2, User user) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = l2;
        this.LIZLLL = bool;
        this.LJ = bool2;
        this.LJFF = user;
    }
}
