package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.EHe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36162EHe {
    public final String LIZ;
    public final Aweme LIZIZ;

    public C36162EHe(String str, Aweme aweme) {
        this.LIZ = str;
        this.LIZIZ = aweme;
    }

    public final void LIZ(String str, String str2) {
        String str3;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", this.LIZ);
        Aweme aweme = this.LIZIZ;
        String str4 = null;
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        oszArr[1] = new OSZ("author_id", str3);
        Aweme aweme2 = this.LIZIZ;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        oszArr[2] = new OSZ("group_id", str4);
        oszArr[3] = new OSZ("action_type", str);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (str2 != null) {
            LJJLIIIIJ.put("platform", str2);
        }
        FMX.LJIIL("invite_to_watch", LJJLIIIIJ);
    }
}
