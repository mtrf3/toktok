package X;

/* renamed from: X.3V7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3V7 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C109544Rq c109544Rq) {
        int msgType = c109544Rq.getMsgType();
        if (msgType != 3001) {
            switch (msgType) {
                case 1801:
                    break;
                case 1802:
                    return "photo_card";
                case 1803:
                    return "video_card";
                default:
                    return "unknown";
            }
        }
        return "image_card";
    }
}
