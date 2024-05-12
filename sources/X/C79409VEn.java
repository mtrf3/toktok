package X;

import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.VEn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79409VEn {
    public final int LIZ;
    public final Intent LIZIZ;

    public C79409VEn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79409VEn)) {
            return false;
        }
        C79409VEn c79409VEn = (C79409VEn) obj;
        return this.LIZ == c79409VEn.LIZ && o.LJ(this.LIZIZ, c79409VEn.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Intent intent = this.LIZIZ;
        return i + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChooseMusicResult(resultCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", intent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C79409VEn(int i) {
        this(Integer.MAX_VALUE, null);
    }

    public C79409VEn(int i, Intent intent) {
        this.LIZ = i;
        this.LIZIZ = intent;
    }
}
