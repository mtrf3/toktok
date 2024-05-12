package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.inbox.InboxFollowerFragment;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.AWr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26373AWr {
    public final Fragment LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26373AWr)) {
            return false;
        }
        C26373AWr c26373AWr = (C26373AWr) obj;
        return o.LJ(this.LIZ, c26373AWr.LIZ) && o.LJ(this.LIZIZ, c26373AWr.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FragmentInfo(fragment=");
        LIZ.append(this.LIZ);
        LIZ.append(", titleName=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C26373AWr(InboxFollowerFragment inboxFollowerFragment, String str) {
        this.LIZ = inboxFollowerFragment;
        this.LIZIZ = str;
    }
}
