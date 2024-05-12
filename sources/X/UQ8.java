package X;

import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UQ8 {
    public final int LIZ;
    public final FriendList<? extends User> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UQ8)) {
            return false;
        }
        UQ8 uq8 = (UQ8) obj;
        return this.LIZ == uq8.LIZ && o.LJ(this.LIZIZ, uq8.LIZIZ) && o.LJ(this.LIZJ, uq8.LIZJ) && o.LJ(this.LIZLLL, uq8.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        FriendList<? extends User> friendList = this.LIZIZ;
        int hashCode = (i + (friendList == null ? 0 : friendList.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SocialRecFlowData(nextStep=");
        LIZ.append(this.LIZ);
        LIZ.append(", friends=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", platform=");
        LIZ.append(this.LIZJ);
        LIZ.append(", skipPlatform=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UQ8(int r5, com.ss.android.ugc.aweme.friends.model.FriendList r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 2
            r3 = 0
            if (r0 == 0) goto L6
            r6 = r3
        L6:
            r0 = r7 & 4
            java.lang.String r2 = ""
            if (r0 == 0) goto L16
            r1 = r2
        Ld:
            r0 = r7 & 8
            if (r0 == 0) goto L12
            r3 = r2
        L12:
            r4.<init>(r5, r6, r1, r3)
            return
        L16:
            r1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQ8.<init>(int, com.ss.android.ugc.aweme.friends.model.FriendList, int):void");
    }

    public UQ8(int i, FriendList<? extends User> friendList, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = friendList;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
