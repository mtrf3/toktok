package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3IU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IU implements C33Q {
    public final IMUser LJLIL;
    public final String LJLILLLLZI;

    public C3IU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3IU)) {
            return false;
        }
        C3IU c3iu = (C3IU) obj;
        return o.LJ(this.LJLIL, c3iu.LJLIL) && o.LJ(this.LJLILLLLZI, c3iu.LJLILLLLZI);
    }

    public final int hashCode() {
        IMUser iMUser = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((iMUser == null ? 0 : iMUser.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingleTitleBarCenterState(user=");
        LIZ.append(this.LJLIL);
        LIZ.append(", lastHintText=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C3IU(int i) {
        this(null, "");
    }

    public C3IU(IMUser iMUser, String lastHintText) {
        o.LJIIIZ(lastHintText, "lastHintText");
        this.LJLIL = iMUser;
        this.LJLILLLLZI = lastHintText;
    }
}
