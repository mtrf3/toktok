package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N41 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N41 LJLIL = new N41();

    public N41() {
        super(1);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0022. Please report as an issue. */
    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        Object obj;
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        OSZ osz = (OSZ) $receiver.LIZ(OSZ.class);
        if (osz != null) {
            obj = osz.getFirst();
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        switch (valueOf.hashCode()) {
            case -1271119582:
                if (!valueOf.equals("homepage_follow")) {
                    return null;
                }
                return "homepage_follow";
            case 1548399886:
                if (!valueOf.equals("FeedRecommendFragment")) {
                    return null;
                }
                return "homepage_hot";
            case 1630634623:
                if (!valueOf.equals("FeedFollowFragment")) {
                    return null;
                }
                return "homepage_follow";
            case 1691937916:
                if (!valueOf.equals("homepage_hot")) {
                    return null;
                }
                return "homepage_hot";
            default:
                return null;
        }
    }
}
