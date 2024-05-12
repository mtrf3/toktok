package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A4Y implements Serializable {
    public static final int $stable = 0;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Long LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final String LJLJL;
    public final long LJLJLJ;
    public final boolean LJLJLLL;
    public final String LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final EnumC25632A4e LJLLL;
    public final boolean LJLLLL;

    public static /* synthetic */ A4Y copy$default(A4Y a4y, String str, String str2, Long l, String str3, String str4, int i, String str5, long j, boolean z, String str6, boolean z2, boolean z3, boolean z4, EnumC25632A4e enumC25632A4e, boolean z5, int i2, Object obj) {
        Long l2 = l;
        String str7 = str;
        String str8 = str2;
        int i3 = i;
        String str9 = str3;
        String str10 = str4;
        long j2 = j;
        String str11 = str5;
        String str12 = str6;
        boolean z6 = z;
        boolean z7 = z4;
        boolean z8 = z2;
        boolean z9 = z3;
        EnumC25632A4e enumC25632A4e2 = enumC25632A4e;
        boolean z10 = z5;
        if ((i2 & 1) != 0) {
            str7 = a4y.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str8 = a4y.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            l2 = a4y.LJLJI;
        }
        if ((i2 & 8) != 0) {
            str9 = a4y.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            str10 = a4y.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            i3 = a4y.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            str11 = a4y.LJLJL;
        }
        if ((i2 & 128) != 0) {
            j2 = a4y.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            z6 = a4y.LJLJLLL;
        }
        if ((i2 & 512) != 0) {
            str12 = a4y.LJLL;
        }
        if ((i2 & 1024) != 0) {
            z8 = a4y.LJLLI;
        }
        if ((i2 & 2048) != 0) {
            z9 = a4y.LJLLILLLL;
        }
        if ((i2 & 4096) != 0) {
            z7 = a4y.LJLLJ;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            enumC25632A4e2 = a4y.LJLLL;
        }
        if ((i2 & 16384) != 0) {
            z10 = a4y.LJLLLL;
        }
        return a4y.copy(str7, str8, l2, str9, str10, i3, str11, j2, z6, str12, z8, z9, z7, enumC25632A4e2, z10);
    }

    public final A4Y copy(String str, String str2, Long l, String str3, String str4, int i, String str5, long j, boolean z, String str6, boolean z2, boolean z3, boolean z4, EnumC25632A4e enumC25632A4e, boolean z5) {
        return new A4Y(str, str2, l, str3, str4, i, str5, j, z, str6, z2, z3, z4, enumC25632A4e, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A4Y)) {
            return false;
        }
        A4Y a4y = (A4Y) obj;
        return o.LJ(this.LJLIL, a4y.LJLIL) && o.LJ(this.LJLILLLLZI, a4y.LJLILLLLZI) && o.LJ(this.LJLJI, a4y.LJLJI) && o.LJ(this.LJLJJI, a4y.LJLJJI) && o.LJ(this.LJLJJL, a4y.LJLJJL) && this.LJLJJLL == a4y.LJLJJLL && o.LJ(this.LJLJL, a4y.LJLJL) && this.LJLJLJ == a4y.LJLJLJ && this.LJLJLLL == a4y.LJLJLLL && o.LJ(this.LJLL, a4y.LJLL) && this.LJLLI == a4y.LJLLI && this.LJLLILLLL == a4y.LJLLILLLL && this.LJLLJ == a4y.LJLLJ && this.LJLLL == a4y.LJLLL && this.LJLLLL == a4y.LJLLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LJLILLLLZI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l = this.LJLJI;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.LJLJJI;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.LJLJJL;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (((i5 + hashCode5) * 31) + this.LJLJJLL) * 31;
        String str5 = this.LJLJL;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJLJLJ, (i6 + hashCode6) * 31, 31);
        boolean z = this.LJLJLLL;
        int i7 = 1;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int i9 = (LIZJ + i8) * 31;
        String str6 = this.LJLL;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        boolean z2 = this.LJLLI;
        int i11 = z2;
        if (z2 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z3 = this.LJLLILLLL;
        int i13 = z3;
        if (z3 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z4 = this.LJLLJ;
        int i15 = z4;
        if (z4 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        EnumC25632A4e enumC25632A4e = this.LJLLL;
        if (enumC25632A4e != null) {
            i = enumC25632A4e.hashCode();
        }
        int i17 = (i16 + i) * 31;
        if (!this.LJLLLL) {
            i7 = 0;
        }
        return i17 + i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReviewObject(id=");
        sb.append(this.LJLIL);
        sb.append(", creatorId=");
        sb.append(this.LJLILLLLZI);
        sb.append(", collectionId=");
        sb.append(this.LJLJI);
        sb.append(", name=");
        sb.append(this.LJLJJI);
        sb.append(", profileUrl=");
        sb.append(this.LJLJJL);
        sb.append(", numStars=");
        sb.append(this.LJLJJLL);
        sb.append(", contentText=");
        sb.append(this.LJLJL);
        sb.append(", unixTimestamp=");
        sb.append(this.LJLJLJ);
        sb.append(", canReply=");
        sb.append(this.LJLJLLL);
        sb.append(", replyRefId=");
        sb.append(this.LJLL);
        sb.append(", isReply=");
        sb.append(this.LJLLI);
        sb.append(", isEditable=");
        sb.append(this.LJLLILLLL);
        sb.append(", isVerifiedUser=");
        sb.append(this.LJLLJ);
        sb.append(", tempOverrideState=");
        sb.append(this.LJLLL);
        sb.append(", isTransient=");
        return C08880Wm.LIZJ(sb, this.LJLLLL, ')');
    }

    public final boolean getCanReply() {
        return this.LJLJLLL;
    }

    public final Long getCollectionId() {
        return this.LJLJI;
    }

    public final String getContentText() {
        return this.LJLJL;
    }

    public final String getCreatorId() {
        return this.LJLILLLLZI;
    }

    public final String getId() {
        return this.LJLIL;
    }

    public final String getName() {
        return this.LJLJJI;
    }

    public final int getNumStars() {
        return this.LJLJJLL;
    }

    public final String getProfileUrl() {
        return this.LJLJJL;
    }

    public final String getReplyRefId() {
        return this.LJLL;
    }

    public final EnumC25632A4e getTempOverrideState() {
        return this.LJLLL;
    }

    public final long getUnixTimestamp() {
        return this.LJLJLJ;
    }

    public final boolean isEditable() {
        return this.LJLLILLLL;
    }

    public final boolean isReply() {
        return this.LJLLI;
    }

    public final boolean isTransient() {
        return this.LJLLLL;
    }

    public final boolean isVerifiedUser() {
        return this.LJLLJ;
    }

    public A4Y(String str, String str2, Long l, String str3, String str4, int i, String str5, long j, boolean z, String str6, boolean z2, boolean z3, boolean z4, EnumC25632A4e enumC25632A4e, boolean z5) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = l;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = i;
        this.LJLJL = str5;
        this.LJLJLJ = j;
        this.LJLJLLL = z;
        this.LJLL = str6;
        this.LJLLI = z2;
        this.LJLLILLLL = z3;
        this.LJLLJ = z4;
        this.LJLLL = enumC25632A4e;
        this.LJLLLL = z5;
    }

    public /* synthetic */ A4Y(String str, String str2, Long l, String str3, String str4, int i, String str5, long j, boolean z, String str6, boolean z2, boolean z3, boolean z4, EnumC25632A4e enumC25632A4e, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l, str3, str4, i, str5, j, z, str6, z2, z3, z4, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : enumC25632A4e, (i2 & 16384) != 0 ? false : z5);
    }
}
