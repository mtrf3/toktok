package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.2lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67852lR {
    public final Activity LIZ;
    public User LIZIZ;
    public Object LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C67852lR) && o.LJ(this.LIZ, ((C67852lR) obj).LIZ);
    }

    public final int hashCode() {
        Activity activity = this.LIZ;
        if (activity == null) {
            return 0;
        }
        return activity.hashCode();
    }

    public final String toString() {
        String str;
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowWrap{");
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        User user = this.LIZIZ;
        Integer num2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", ");
        User user2 = this.LIZIZ;
        if (user2 != null) {
            num = Integer.valueOf(user2.getFollowStatus());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        User user3 = this.LIZIZ;
        if (user3 != null) {
            num2 = Integer.valueOf(user3.getFollowerStatus());
        }
        return s0.LIZJ(LIZ, num2, '}', LIZ);
    }

    public C67852lR(Activity activity) {
        this.LIZ = activity;
    }
}
