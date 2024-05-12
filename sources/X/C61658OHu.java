package X;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.OHu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61658OHu {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final MutableLiveData<C76800UCe> LIZJ;

    public C61658OHu() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61658OHu)) {
            return false;
        }
        C61658OHu c61658OHu = (C61658OHu) obj;
        return this.LIZ == c61658OHu.LIZ && this.LIZIZ == c61658OHu.LIZIZ && o.LJ(this.LIZJ, c61658OHu.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        MutableLiveData<C76800UCe> mutableLiveData = this.LIZJ;
        return i + (mutableLiveData == null ? 0 : mutableLiveData.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NaviConfig(continueToSetProfile=");
        LIZ.append(this.LIZ);
        LIZ.append(", useNaviCameraFeatures=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", signal=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C61658OHu(androidx.lifecycle.MutableLiveData r4, int r5) {
        /*
            r3 = this;
            r0 = r5 & 1
            r2 = 0
            if (r0 == 0) goto L14
            r1 = 1
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lb
            r2 = 1
        Lb:
            r0 = r5 & 4
            if (r0 == 0) goto L10
            r4 = 0
        L10:
            r3.<init>(r1, r2, r4)
            return
        L14:
            r1 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61658OHu.<init>(androidx.lifecycle.MutableLiveData, int):void");
    }

    public C61658OHu(boolean z, boolean z2, MutableLiveData<C76800UCe> mutableLiveData) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = mutableLiveData;
    }
}
