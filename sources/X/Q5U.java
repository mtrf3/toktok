package X;

import java.util.Arrays;
import m43.u;

/* loaded from: classes12.dex */
public enum Q5U {
    Login(0),
    Share(1),
    Message(2),
    Like(3),
    GameRequest(4),
    AppGroupCreate(5),
    AppGroupJoin(6),
    AppInvite(7),
    DeviceShare(8),
    GamingFriendFinder(9),
    GamingGroupIntegration(10),
    Referral(11),
    GamingContextCreate(12),
    GamingContextSwitch(13),
    GamingContextChoose(14),
    TournamentShareDialog(15);

    public final int LJLIL;

    public final int toRequestCode() {
        Q4J.LJI();
        return u.LJIIIIZZ + this.LJLIL;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Q5U[] valuesCustom() {
        return (Q5U[]) Arrays.copyOf(values(), 16);
    }

    Q5U(int i) {
        this.LJLIL = i;
    }
}
