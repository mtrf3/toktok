package X;

/* loaded from: classes13.dex */
public final class SMS {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                if (C78966Uyw.LJJIJL()) {
                    return "Followers";
                }
                return "Everyone";
            }
            if (num.intValue() == 1) {
                return "Friends";
            }
            if (num.intValue() == 3) {
                return "No_one";
            }
        }
        return null;
    }
}
