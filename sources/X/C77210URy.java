package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.URy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77210URy {
    public final Context LIZ;
    public final ActivityC45651qj LIZIZ;
    public final InterfaceC70422pa LIZJ;
    public final USH LIZLLL;
    public final M4B LJ;
    public final Bundle LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77210URy)) {
            return false;
        }
        C77210URy c77210URy = (C77210URy) obj;
        return o.LJ(this.LIZ, c77210URy.LIZ) && o.LJ(this.LIZIZ, c77210URy.LIZIZ) && o.LJ(this.LIZJ, c77210URy.LIZJ) && o.LJ(this.LIZLLL, c77210URy.LIZLLL) && o.LJ(this.LJ, c77210URy.LJ) && o.LJ(this.LJFF, c77210URy.LJFF);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        ActivityC45651qj activityC45651qj = this.LIZIZ;
        int hashCode2 = (this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((hashCode + (activityC45651qj == null ? 0 : activityC45651qj.hashCode())) * 31)) * 31)) * 31)) * 31;
        Bundle bundle = this.LJFF;
        return hashCode2 + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationAuthConfig(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", hostActivity=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", coroutineScope=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pipelineConfig=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", tracker=");
        LIZ.append(this.LJ);
        LIZ.append(", bundle=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C77210URy(Context context, ActivityC45651qj activityC45651qj, InterfaceC70422pa coroutineScope, USH pipelineConfig, M4B tracker, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(coroutineScope, "coroutineScope");
        o.LJIIIZ(pipelineConfig, "pipelineConfig");
        o.LJIIIZ(tracker, "tracker");
        this.LIZ = context;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = coroutineScope;
        this.LIZLLL = pipelineConfig;
        this.LJ = tracker;
        this.LJFF = bundle;
    }
}
