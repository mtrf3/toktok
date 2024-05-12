package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232629Ba implements IEvent {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C232629Ba)) {
            return false;
        }
        C232629Ba c232629Ba = (C232629Ba) obj;
        return o.LJ(this.LJLIL, c232629Ba.LJLIL) && o.LJ(this.LJLILLLLZI, c232629Ba.LJLILLLLZI) && this.LJLJI == c232629Ba.LJLJI && this.LJLJJI == c232629Ba.LJLJJI && this.LJLJJL == c232629Ba.LJLJJL && o.LJ(this.LJLJJLL, c232629Ba.LJLJJLL);
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
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, hashCode * 31, 31), 31);
        boolean z = this.LJLJJI;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LIZJ + i3) * 31;
        if (!this.LJLJJL) {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.LJLJJLL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareUndoEvent(awemeId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", identity=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", duration=");
        LIZ.append(this.LJLJI);
        LIZ.append(", hasShowAnimation=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", hasDismissAnimation=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public C232629Ba(String str, String identity, String str2, boolean z, boolean z2) {
        o.LJIIIZ(identity, "identity");
        this.LJLIL = str;
        this.LJLILLLLZI = identity;
        this.LJLJI = 2000L;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = str2;
    }
}
