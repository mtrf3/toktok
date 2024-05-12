package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.9BZ, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9BZ implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final IMContact LJLJJI;
    public final boolean LJLJJL;
    public final C107294Iz LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9BZ)) {
            return false;
        }
        C9BZ c9bz = (C9BZ) obj;
        return o.LJ(this.LJLIL, c9bz.LJLIL) && o.LJ(this.LJLILLLLZI, c9bz.LJLILLLLZI) && this.LJLJI == c9bz.LJLJI && o.LJ(this.LJLJJI, c9bz.LJLJJI) && this.LJLJJL == c9bz.LJLJJL && o.LJ(this.LJLJJLL, c9bz.LJLJJLL) && o.LJ(this.LJLJL, c9bz.LJLJL) && o.LJ(this.LJLJLJ, c9bz.LJLJLJ) && this.LJLJLLL == c9bz.LJLJLLL && this.LJLL == c9bz.LJLL && this.LJLLI == c9bz.LJLLI && o.LJ(this.LJLLILLLL, c9bz.LJLLILLLL) && o.LJ(this.LJLLJ, c9bz.LJLLJ);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (this.LJLJJI.hashCode() + JBR.LIZJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, hashCode * 31, 31), 31)) * 31;
        boolean z = this.LJLJJL;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int hashCode6 = (this.LJLJJLL.hashCode() + ((hashCode5 + i3) * 31)) * 31;
        String str2 = this.LJLJL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (hashCode6 + hashCode2) * 31;
        String str3 = this.LJLJLJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        boolean z2 = this.LJLJLLL;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z3 = this.LJLL;
        int i8 = z3;
        if (z3 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        if (!this.LJLLI) {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        String str4 = this.LJLLILLLL;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str5 = this.LJLLJ;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareSendingEvent(awemeId=");
        sb.append(this.LJLIL);
        sb.append(", identity=");
        sb.append(this.LJLILLLLZI);
        sb.append(", duration=");
        sb.append(this.LJLJI);
        sb.append(", contact=");
        sb.append(this.LJLJJI);
        sb.append(", isMulti=");
        sb.append(this.LJLJJL);
        sb.append(", undoCallback=");
        sb.append(this.LJLJJLL);
        sb.append(", enterFrom=");
        sb.append(this.LJLJL);
        sb.append(", enterMethod=");
        sb.append(this.LJLJLJ);
        sb.append(", hasShowAnimation=");
        sb.append(this.LJLJLLL);
        sb.append(", hasDismissAnimation=");
        sb.append(this.LJLL);
        sb.append(", isNewGroup=");
        sb.append(this.LJLLI);
        sb.append(", enterPosition=");
        sb.append(this.LJLLILLLL);
        sb.append(", followStatus=");
        return C07670Rv.LIZIZ(sb, this.LJLLJ, ')');
    }

    public C9BZ(String str, String identity, IMContact contact, boolean z, C107294Iz c107294Iz, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4, String str5) {
        o.LJIIIZ(identity, "identity");
        o.LJIIIZ(contact, "contact");
        this.LJLIL = str;
        this.LJLILLLLZI = identity;
        this.LJLJI = 3000L;
        this.LJLJJI = contact;
        this.LJLJJL = z;
        this.LJLJJLL = c107294Iz;
        this.LJLJL = str2;
        this.LJLJLJ = str3;
        this.LJLJLLL = z2;
        this.LJLL = z3;
        this.LJLLI = z4;
        this.LJLLILLLL = str4;
        this.LJLLJ = str5;
    }
}
