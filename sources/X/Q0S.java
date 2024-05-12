package X;

import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.List;

/* loaded from: classes12.dex */
public final class Q0S {
    public static final ThreadLocal<C66314Q0w> LIZ = new ThreadLocal<>();
    public static final C66305Q0n LIZIZ = new C66305Q0n();
    public static final Q0Q LIZJ = new Q0Q();
    public static final List<String> LIZLLL = C47261Igj.LJJIJIIJI("location", "video", "audio", "clipboard", "contact", OHQ.LIZ);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000c. Please report as an issue. */
    public static String LIZ(C66120PxE c66120PxE) {
        String LIZIZ2 = LIZIZ(c66120PxE);
        if (LIZIZ2 != null) {
            switch (LIZIZ2.hashCode()) {
                case -1600397930:
                    if (LIZIZ2.equals("clipboard")) {
                        return "bpea_event_clipboard";
                    }
                    break;
                case -517618225:
                    if (LIZIZ2.equals(OHQ.LIZ)) {
                        return "bpea_event_permission";
                    }
                    break;
                case 93166550:
                    if (LIZIZ2.equals("audio")) {
                        return "bpea_event_microphone";
                    }
                    break;
                case 112202875:
                    if (LIZIZ2.equals("video")) {
                        return "bpea_event_camera";
                    }
                    break;
                case 951526432:
                    if (LIZIZ2.equals("contact")) {
                        return "bpea_event_contact";
                    }
                    break;
                case 1901043637:
                    if (LIZIZ2.equals("location")) {
                        return "bpea_event_location";
                    }
                    break;
            }
        }
        return null;
    }

    public static String LIZIZ(C66120PxE c66120PxE) {
        int i = c66120PxE.LJLJI;
        switch (i) {
            default:
                switch (i) {
                    case 100004:
                        break;
                    case 100100:
                    case 100206:
                        return "video";
                    case 100400:
                        return "audio";
                    default:
                        switch (i) {
                            case 101800:
                            case 101801:
                            case 101802:
                            case 101803:
                            case 101804:
                            case 101805:
                            case 101806:
                            case 101807:
                            case 101808:
                            case 101809:
                                return "clipboard";
                            default:
                                switch (i) {
                                    case 102600:
                                    case 102601:
                                        return OHQ.LIZ;
                                    default:
                                        switch (i) {
                                            case 240034:
                                            case 240035:
                                                return "contact";
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
            case ImagePreloadExperiment.PRIORITY_DEFAULT /* 100000 */:
            case 100001:
            case 100002:
                return "location";
        }
    }
}
