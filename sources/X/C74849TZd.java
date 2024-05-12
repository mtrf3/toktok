package X;

import com.bytedance.android.live.base.model.user.User;
import defpackage.b0;

/* renamed from: X.TZd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74849TZd {
    public final User LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ModeratorInviteGuestEvent{user=");
        LIZ.append(this.LIZ);
        LIZ.append(", inviteSource='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", inviteSourceCode=");
        LIZ.append(this.LIZJ);
        LIZ.append(", invitationMicIdx=");
        return b0.LIZJ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public C74849TZd(User user) {
        this.LIZLLL = -1;
        this.LIZ = user;
        this.LIZIZ = "user_profile";
        this.LIZJ = 3;
    }

    public C74849TZd(User user, String str, int i) {
        this.LIZLLL = -1;
        this.LIZ = user;
        this.LIZIZ = str;
        this.LIZJ = 1;
        this.LIZLLL = i;
    }
}
