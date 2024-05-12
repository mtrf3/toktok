package X;

import android.content.Intent;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.9yM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254229yM implements InterfaceC80653En, InterfaceC87283bg {
    public final long LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final Intent LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public final int LJLJLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C254229yM)) {
            return false;
        }
        C254229yM c254229yM = (C254229yM) obj;
        return this.LJLIL == c254229yM.LJLIL && this.LJLILLLLZI == c254229yM.LJLILLLLZI && o.LJ(this.LJLJI, c254229yM.LJLJI) && o.LJ(this.LJLJJI, c254229yM.LJLJJI) && o.LJ(this.LJLJJL, c254229yM.LJLJJL) && this.LJLJJLL == c254229yM.LJLJJLL && this.LJLJL == c254229yM.LJLJL && this.LJLJLJ == c254229yM.LJLJLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, ((C16880lQ.LLJIJIL(this.LJLIL) * 31) + this.LJLILLLLZI) * 31, 31), 31);
        Intent intent = this.LJLJJL;
        if (intent == null) {
            hashCode = 0;
        } else {
            hashCode = intent.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.LJLJJLL;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        if (!this.LJLJL) {
            i2 = 0;
        }
        return ((i4 + i2) * 31) + this.LJLJLJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentCollectionListHierarchyData(creatorUid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listSource=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLJI);
        LIZ.append(", sessionId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", intent=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isFromAnchorFlow=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isPromoteFlow=");
        LIZ.append(this.LJLJL);
        LIZ.append(", anchorType=");
        return b0.LIZJ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    public C254229yM(long j, int i, String str, String sessionId, Intent intent, boolean z, boolean z2, int i2) {
        o.LJIIIZ(sessionId, "sessionId");
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = sessionId;
        this.LJLJJL = intent;
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLJLJ = i2;
        C221108m2.LIZIZ(C254239yN.LJLIL);
    }
}
