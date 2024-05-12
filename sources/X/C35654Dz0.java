package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJPreloadData;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import kotlin.jvm.internal.o;

/* renamed from: X.Dz0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35654Dz0 extends C35656Dz2 {
    public final PersonalizedNUJV2Data LIZIZ;
    public final IPluginService.NonForcedLoginRegionFlow LIZJ;
    public final PersonalizedNUJPreloadData LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35654Dz0)) {
            return false;
        }
        C35654Dz0 c35654Dz0 = (C35654Dz0) obj;
        return o.LJ(this.LIZIZ, c35654Dz0.LIZIZ) && o.LJ(this.LIZJ, c35654Dz0.LIZJ) && o.LJ(this.LIZLLL, c35654Dz0.LIZLLL);
    }

    public final int hashCode() {
        PersonalizedNUJV2Data personalizedNUJV2Data = this.LIZIZ;
        int hashCode = (personalizedNUJV2Data == null ? 0 : personalizedNUJV2Data.hashCode()) * 31;
        IPluginService.NonForcedLoginRegionFlow nonForcedLoginRegionFlow = this.LIZJ;
        int hashCode2 = (hashCode + (nonForcedLoginRegionFlow == null ? 0 : nonForcedLoginRegionFlow.hashCode())) * 31;
        PersonalizedNUJPreloadData personalizedNUJPreloadData = this.LIZLLL;
        return hashCode2 + (personalizedNUJPreloadData != null ? personalizedNUJPreloadData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SmartLockData(personalizedNUJV2Data=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nonForcedLoginRegionFLow=");
        LIZ.append(this.LIZJ);
        LIZ.append(", personalizedNUJPreloadData=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZ() {
        boolean z;
        PersonalizedNUJV2Data personalizedNUJV2Data = this.LIZIZ;
        if (personalizedNUJV2Data != null) {
            z = o.LJ(personalizedNUJV2Data.shouldTrySmartLock, Boolean.TRUE);
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldTyrSmartLockWhenForcedLogin ");
        LIZ.append(z);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.LIZ() == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJPreloadData r0 = r3.LIZLLL
            if (r0 == 0) goto L1f
            boolean r0 = r0.LIZ()
            r2 = 1
            if (r0 != r2) goto L1f
        Lb:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "shouldTyrSmartLockWhenForcedLoginPreLoad "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C40741Fyr.LIZ(r0)
            return r2
        L1f:
            r2 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35654Dz0.LIZIZ():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r0.enableFlow == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.plugin.IPluginService$NonForcedLoginRegionFlow r0 = r3.LIZJ
            if (r0 == 0) goto L1d
            boolean r0 = r0.enableFlow
            r2 = 1
            if (r0 != r2) goto L1d
        L9:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "shouldTyrSmartLockWhenNonForcedLogin "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C40741Fyr.LIZ(r0)
            return r2
        L1d:
            r2 = 0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35654Dz0.LIZJ():boolean");
    }

    public C35654Dz0(PersonalizedNUJV2Data personalizedNUJV2Data, IPluginService.NonForcedLoginRegionFlow nonForcedLoginRegionFlow, PersonalizedNUJPreloadData personalizedNUJPreloadData) {
        super(null);
        this.LIZIZ = personalizedNUJV2Data;
        this.LIZJ = nonForcedLoginRegionFlow;
        this.LIZLLL = personalizedNUJPreloadData;
    }
}
