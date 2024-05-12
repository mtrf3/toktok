package X;

import com.ss.android.ugc.aweme.relation.storage.model.UserData;
import defpackage.q;

/* renamed from: X.2vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74212vh extends AbstractC74192vf {
    public final UserData LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateEvent(");
        return q.LIZIZ(LIZ, this.LIZJ.uid, ')', LIZ);
    }

    public C74212vh(UserData userData, String str, long j) {
        super(str, j);
        this.LIZJ = userData;
    }
}
