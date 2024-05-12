package X;

/* renamed from: X.2cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC62522cq {
    CreatorPlusStatusUnknown(0),
    CreatorPlusStatusNoRights(1),
    CreatorPlusStatusNeverEnrolled(2),
    CreatorPlusStatusEnrolled(3),
    CreatorPlusStatusMeetsAllRequirements(4),
    CreatorPlusStatusMeetsSomeRequirements(5),
    CreatorPlusStatusEnrollFailed(6),
    CreatorPlusStatusLeft(7),
    CreatorPlusStatusEvicted(8);

    public final int LJLIL;

    public static EnumC62522cq valueOf(String str) {
        return (EnumC62522cq) V0N.LJJJ(EnumC62522cq.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC62522cq(int i) {
        this.LJLIL = i;
    }
}
