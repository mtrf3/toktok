package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6UI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UI {
    public final List<AddYoursAvatar> LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final long LJFF;

    public C6UI() {
        this(null, null, 0L, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6UI)) {
            return false;
        }
        C6UI c6ui = (C6UI) obj;
        return o.LJ(this.LIZ, c6ui.LIZ) && o.LJ(this.LIZIZ, c6ui.LIZIZ) && this.LIZJ == c6ui.LIZJ && this.LIZLLL == c6ui.LIZLLL && o.LJ(this.LJ, c6ui.LJ) && this.LJFF == c6ui.LJFF;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        int hashCode2 = (((((hashCode + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        return C16880lQ.LLJIJIL(this.LJFF) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(avatars=");
        LIZ.append(this.LIZ);
        LIZ.append(", buttonClickListener=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", iconId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", buttonText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", text=");
        LIZ.append(this.LJ);
        LIZ.append(", followUsersCount=");
        return C47135Ieh.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6UI(java.util.List r9, java.lang.String r10, long r11, int r13) {
        /*
            r8 = this;
            r6 = r11
            r1 = r9
            r5 = r10
            r0 = r13 & 1
            if (r0 == 0) goto L9
            X.OQg r1 = X.C61878OQg.INSTANCE
        L9:
            r2 = 0
            r0 = r13 & 4
            if (r0 == 0) goto L2a
            r3 = 2131755429(0x7f1001a5, float:1.9141737E38)
        L11:
            r0 = r13 & 8
            if (r0 == 0) goto L28
            r4 = 2131823333(0x7f110ae5, float:1.9279463E38)
        L18:
            r0 = r13 & 16
            if (r0 == 0) goto L1d
            r5 = 0
        L1d:
            r0 = r13 & 32
            if (r0 == 0) goto L23
            r6 = 0
        L23:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L28:
            r4 = 0
            goto L18
        L2a:
            r3 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6UI.<init>(java.util.List, java.lang.String, long, int):void");
    }

    public static C6UI LIZ(C6UI c6ui, InterfaceC65784Pro interfaceC65784Pro, int i, int i2) {
        List<AddYoursAvatar> avatars = c6ui.LIZ;
        String str = c6ui.LJ;
        long j = c6ui.LJFF;
        o.LJIIIZ(avatars, "avatars");
        return new C6UI(avatars, interfaceC65784Pro, i, i2, str, j);
    }

    public C6UI(List<AddYoursAvatar> avatars, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2, String str, long j) {
        o.LJIIIZ(avatars, "avatars");
        this.LIZ = avatars;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str;
        this.LJFF = j;
    }
}
