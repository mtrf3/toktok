package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207038Ap implements InterfaceC207018An {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final long LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;

    @Override // X.InterfaceC207018An
    public final java.util.Map<String, String> LLIL() {
        Object obj;
        OSZ[] oszArr = new OSZ[6];
        String str = this.LJLILLLLZI;
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("enter_from", str);
        String str2 = "1";
        if (this.LJLJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ("is_coldstart_first_enter", obj);
        oszArr[2] = new OSZ("duration", String.valueOf(this.LJLJJI));
        oszArr[3] = new OSZ("enter_method", this.LJLIL);
        if (!this.LJLJJL) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[4] = new OSZ("is_top_tab", str2);
        oszArr[5] = new OSZ("shoot_enter_from", this.LJLJJLL);
        return C113554cx.LJJL(oszArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C207038Ap)) {
            return false;
        }
        C207038Ap c207038Ap = (C207038Ap) obj;
        return o.LJ(this.LJLIL, c207038Ap.LJLIL) && o.LJ(this.LJLILLLLZI, c207038Ap.LJLILLLLZI) && this.LJLJI == c207038Ap.LJLJI && this.LJLJJI == c207038Ap.LJLJJI && this.LJLJJL == c207038Ap.LJLJJL && o.LJ(this.LJLJJLL, c207038Ap.LJLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.LJLJI;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LIZJ = JBR.LIZJ(this.LJLJJI, (i + i3) * 31, 31);
        if (!this.LJLJJL) {
            i2 = 0;
        }
        return this.LJLJJLL.hashCode() + ((LIZJ + i2) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnterExploreET(enterMethod=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isColdStartFirstEnter=");
        LIZ.append(this.LJLJI);
        LIZ.append(", duration=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isTopTab=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", shootEnterFrom=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.InterfaceC207018An
    public final String getEventName() {
        return this.LJLJL;
    }

    public C207038Ap(long j, String enterMethod, String str, String str2, boolean z, boolean z2) {
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = enterMethod;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = j;
        this.LJLJJL = z2;
        this.LJLJJLL = str2;
        this.LJLJL = "enter_homepage_explore";
    }
}
