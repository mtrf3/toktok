package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T4Q extends T4S {
    public final Effect LIZ;
    public final int LIZIZ;
    public final EnumC44267HYx LIZJ;
    public final boolean LIZLLL;
    public final Bundle LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i;
        int i2;
        Effect effect = this.LIZ;
        int i3 = 0;
        if (effect != null) {
            i = effect.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((i * 31) + this.LIZIZ) * 31;
        EnumC44267HYx enumC44267HYx = this.LIZJ;
        if (enumC44267HYx != null) {
            i2 = enumC44267HYx.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        boolean z = this.LIZLLL;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        Bundle bundle = this.LJ;
        if (bundle != null) {
            i3 = bundle.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedStickerHandleSession(sticker=");
        LIZ.append(this.LIZ);
        LIZ.append(", clickPosition=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", requestSource=");
        LIZ.append(this.LIZJ);
        LIZ.append(", interceptLoad=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", extraData=");
        LIZ.append(this.LJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.T4S
    public final Effect LIZ() {
        return this.LIZ;
    }

    public static T4Q LIZIZ(T4Q t4q) {
        Effect sticker = t4q.LIZ;
        int i = t4q.LIZIZ;
        EnumC44267HYx requestSource = t4q.LIZJ;
        Bundle bundle = t4q.LJ;
        t4q.getClass();
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(requestSource, "requestSource");
        return new T4Q(sticker, i, requestSource, true, bundle);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof T4Q) {
                T4Q t4q = (T4Q) obj;
                if (o.LJ(this.LIZ, t4q.LIZ) && this.LIZIZ == t4q.LIZIZ && o.LJ(this.LIZJ, t4q.LIZJ) && this.LIZLLL == t4q.LIZLLL && o.LJ(this.LJ, t4q.LJ)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public T4Q(Effect sticker, int i, EnumC44267HYx requestSource, boolean z, Bundle bundle) {
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(requestSource, "requestSource");
        this.LIZ = sticker;
        this.LIZIZ = i;
        this.LIZJ = requestSource;
        this.LIZLLL = z;
        this.LJ = bundle;
    }
}
