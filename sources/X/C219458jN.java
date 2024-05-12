package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import kotlin.jvm.internal.o;

/* renamed from: X.8jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219458jN implements C33Q {
    public final AddYoursTopic LJLIL;
    public final float LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;

    public C219458jN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C219458jN)) {
            return false;
        }
        C219458jN c219458jN = (C219458jN) obj;
        return o.LJ(this.LJLIL, c219458jN.LJLIL) && Float.compare(this.LJLILLLLZI, c219458jN.LJLILLLLZI) == 0 && o.LJ(this.LJLJI, c219458jN.LJLJI);
    }

    public final int hashCode() {
        int hashCode;
        AddYoursTopic addYoursTopic = this.LJLIL;
        int i = 0;
        if (addYoursTopic == null) {
            hashCode = 0;
        } else {
            hashCode = addYoursTopic.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LJLILLLLZI, hashCode * 31, 31);
        C43I<C76800UCe> c43i = this.LJLJI;
        if (c43i != null) {
            i = c43i.hashCode();
        }
        return LIZIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursDetailPageState(topic=");
        LIZ.append(this.LJLIL);
        LIZ.append(", headerHiddenPercentage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", errorEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C219458jN(int i) {
        this(null, 0.0f, null);
    }

    public C219458jN(AddYoursTopic addYoursTopic, float f, C43I<C76800UCe> c43i) {
        this.LJLIL = addYoursTopic;
        this.LJLILLLLZI = f;
        this.LJLJI = c43i;
    }

    public static C219458jN LIZ(C219458jN c219458jN, AddYoursTopic addYoursTopic, float f, C43I c43i, int i) {
        if ((i & 1) != 0) {
            addYoursTopic = c219458jN.LJLIL;
        }
        if ((i & 2) != 0) {
            f = c219458jN.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i = c219458jN.LJLJI;
        }
        c219458jN.getClass();
        return new C219458jN(addYoursTopic, f, c43i);
    }
}
