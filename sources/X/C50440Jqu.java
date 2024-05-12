package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;

/* renamed from: X.Jqu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50440Jqu {
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static EnumC223268pW LJFF;

    static {
        EnumC223268pW LIZ2;
        if (!C50526JsI.LIZ()) {
            LIZ2 = EnumC223268pW.AUTO_SCROLL_STATE_STOP;
        } else {
            LIZ2 = C50437Jqr.LIZ();
        }
        LJFF = LIZ2;
    }

    public static boolean LIZ() {
        ((ISurveyDebuggerService) ServiceManager.get().getService(ISurveyDebuggerService.class)).isOpen();
        return LIZJ;
    }
}
