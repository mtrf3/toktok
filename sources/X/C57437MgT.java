package X;

/* renamed from: X.MgT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57437MgT {
    public static EnumC57435MgR LIZ(int i) {
        EnumC57435MgR enumC57435MgR = EnumC57435MgR.NONE;
        if (i == enumC57435MgR.getValue()) {
            return enumC57435MgR;
        }
        EnumC57435MgR enumC57435MgR2 = EnumC57435MgR.UNFOLLOW;
        if (i != enumC57435MgR2.getValue()) {
            enumC57435MgR2 = EnumC57435MgR.FOLLOWED;
            if (i != enumC57435MgR2.getValue()) {
                enumC57435MgR2 = EnumC57435MgR.FOLLOW_MUTUAL;
                if (i != enumC57435MgR2.getValue()) {
                    enumC57435MgR2 = EnumC57435MgR.SAME_USER;
                    if (i != enumC57435MgR2.getValue()) {
                        enumC57435MgR2 = EnumC57435MgR.FOLLOW_REQUESTED;
                        if (i != enumC57435MgR2.getValue()) {
                            enumC57435MgR2 = EnumC57435MgR.UNFOLLOW_BUT_BE_FOLLOWED;
                            if (i != enumC57435MgR2.getValue()) {
                                return enumC57435MgR;
                            }
                        }
                    }
                }
            }
        }
        return enumC57435MgR2;
    }
}
