package X;

/* renamed from: X.12b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C264512b {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, int i2) {
        switch (i) {
            case 1:
                return EnumC264412a.LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP.ordinal();
            case 2:
                return EnumC264412a.LIVE_TIP_PERCEPTION_MESSAGE_P1.ordinal();
            case 3:
                return EnumC264412a.LIVE_TIP_BOTTOM_MESSAGE_CLOSE.ordinal();
            case 4:
                return EnumC264412a.LIVE_TIP_BOTTOM_MESSAGE_NO_CLOSE.ordinal();
            case 5:
                return -1;
            case 6:
                return EnumC264412a.LIVE_TIP_GO_APPEAL_TIPS.ordinal();
            case 7:
                return EnumC264412a.LIVE_TIP_APPEAL_SUCCESS_TIPS.ordinal();
            default:
                return i2;
        }
    }

    public static boolean LIZIZ(EnumC264412a enumC264412a, EnumC264412a enumC264412a2) {
        if (enumC264412a != enumC264412a2 || !ORZ.LJLJJI(enumC264412a, C77275UUl.LJIIIIZZ(EnumC264412a.LIVE_TIP_PERCEPTION_MESSAGE_P1, EnumC264412a.LIVE_TIP_BOTTOM_MESSAGE_NO_CLOSE, EnumC264412a.LIVE_TIP_BOTTOM_MESSAGE_CLOSE, EnumC264412a.LIVE_TIP_MESSAGE_WARNING_TIP, EnumC264412a.LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP, EnumC264412a.LIVE_TIP_GO_APPEAL_TIPS, EnumC264412a.LIVE_TIP_APPEAL_SUCCESS_TIPS))) {
            return false;
        }
        return true;
    }
}
