package X;

import a04.IDfS0S0100000_11;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.share.model.ShareContent;
import java.util.HashMap;
import java.util.List;
import m43.u;

/* loaded from: classes12.dex */
public final class Q7O extends Q7M<ShareContent<?, ?>, Q6O> {
    public static final int LJII;
    public final boolean LJFF;
    public final List<Q7M<ShareContent<?, ?>, Q6O>.b> LJI;

    static {
        C16880lQ.LJLLJ(Q7O.class);
        LJII = Q5U.Share.toRequestCode();
    }

    @Override // X.Q7M
    public final Q6H LIZIZ() {
        return new Q6H(this.LIZJ);
    }

    @Override // X.Q7M
    public final List<Q7M<ShareContent<?, ?>, Q6O>.b> LIZJ() {
        return this.LJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q7O(android.app.Activity r6) {
        /*
            r5 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            int r3 = X.Q7O.LJII
            r5.<init>(r6, r3)
            r4 = 1
            r5.LJFF = r4
            r0 = 5
            X.Q7M$b[] r2 = new X.Q7M.b[r0]
            X.Q7S r1 = new X.Q7S
            r1.<init>(r5)
            r0 = 0
            r2[r0] = r1
            X.Q7d r0 = new X.Q7d
            r0.<init>(r5)
            r2[r4] = r0
            X.Q7Y r1 = new X.Q7Y
            r1.<init>(r5)
            r0 = 2
            r2[r0] = r1
            X.Q7T r1 = new X.Q7T
            r1.<init>(r5)
            r0 = 3
            r2[r0] = r1
            X.Q7U r1 = new X.Q7U
            r1.<init>(r5)
            r0 = 4
            r2[r0] = r1
            java.util.ArrayList r0 = X.C47261Igj.LJII(r2)
            r5.LJI = r0
            X.Q6A r1 = X.Q6B.LIZIZ
            X.Q6J r0 = new X.Q6J
            r0.<init>()
            r1.LIZ(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q7O.<init>(android.app.Activity):void");
    }

    public final void LJ(ShareContent shareContent, Q7V q7v) {
        String str;
        if (this.LJFF) {
            q7v = Q7V.AUTOMATIC;
        }
        int i = Q7R.LIZ[q7v.ordinal()];
        String str2 = "unknown";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "unknown";
                } else {
                    str = "native";
                }
            } else {
                str = "web";
            }
        } else {
            str = "automatic";
        }
        InterfaceC66439Q5r LIZ = Q7P.LIZ(shareContent.getClass());
        if (LIZ == Q7Q.SHARE_DIALOG) {
            str2 = "status";
        } else if (LIZ == Q7Q.PHOTOS) {
            str2 = "photo";
        } else if (LIZ == Q7Q.VIDEO) {
            str2 = "video";
        } else if (LIZ == Q6X.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        }
        u.LIZLLL();
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
    }

    public final void LJFF(Q6B q6b, final C66494Q7u c66494Q7u) {
        final int i = this.LIZJ;
        Q6C q6c = new Q6C() { // from class: X.Q6K
            @Override // X.Q6C
            public final boolean LIZ(int i2, Intent intent) {
                return Q6F.LJ(i, intent, new IDfS0S0100000_11(c66494Q7u, (Q6L<Q6O>) 2));
            }
        };
        ((HashMap) q6b.LIZ).put(Integer.valueOf(i), q6c);
    }
}
