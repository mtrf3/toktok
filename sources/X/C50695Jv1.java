package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.o;

/* renamed from: X.Jv1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50695Jv1 implements InterfaceC50310Joo {
    public final Word LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50695Jv1) && o.LJ(this.LIZ, ((C50695Jv1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SugWordUpdateAction(firstWord=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C50695Jv1(Word word) {
        this.LIZ = word;
    }
}
