package X;

import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Gwc */
/* loaded from: classes8.dex */
public final class C43150Gwc {
    public static boolean LIZ = true;
    public static boolean LIZIZ = true;
    public static boolean LIZJ = true;
    public static InterfaceC43151Gwd LIZLLL;

    public static final void LIZ(String str) {
        LIZJ("camera_error", str, null, 12);
    }

    public static final void LIZIZ(String str, String str2, String msg) {
        o.LJIIIZ(msg, "msg");
        LIZJ(str, str2, msg, 8);
    }

    public static void LIZLLL(String str) {
        InterfaceC43151Gwd interfaceC43151Gwd = LIZLLL;
        if (interfaceC43151Gwd != null) {
            try {
                interfaceC43151Gwd.LIZ(str);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("RuntimeBehaviorManager---> EventType : ");
                LIZ2.append(str);
                H78.LIZ(X1D.LIZIZ(LIZ2));
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        throw new IllegalStateException("behavior reporter not init");
    }

    public static void LJ(String str, String str2, String str3) {
        try {
            InterfaceC43151Gwd interfaceC43151Gwd = LIZLLL;
            o.LJI(interfaceC43151Gwd);
            interfaceC43151Gwd.event(str, str2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RuntimeBehaviorManager---> EventType : ");
            LIZ2.append(str);
            LIZ2.append(" , code : ");
            LIZ2.append(str2);
            LIZ2.append(" , msg : ");
            LIZ2.append(str3);
            H78.LIZ(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void LJIIIZ(int i, String publishId, String str) {
        o.LJIIIZ(publishId, "publishId");
        BehaviorType behaviorType = BehaviorType.FAILED;
        String valueOf = String.valueOf(i);
        if (str == null) {
            str = "";
        }
        LJII(publishId, behaviorType, "SN", valueOf, str);
    }

    public static void LIZJ(String str, String code, String msg, int i) {
        if ((i & 2) != 0) {
            code = "-1";
        }
        String str2 = "";
        if ((i & 4) != 0) {
            msg = "";
        }
        if ((i & 8) == 0) {
            str2 = null;
        }
        o.LJIIIZ(code, "code");
        o.LJIIIZ(msg, "msg");
        if (str2 == null || str2.length() == 0) {
            LJ(str, code, msg);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(code);
        LIZ2.append('-');
        LIZ2.append(str2);
        LJ(str, X1D.LIZIZ(LIZ2), msg);
    }

    public static void LJII(String str, BehaviorType behaviorType, String str2, String str3, String str4) {
        try {
            InterfaceC43151Gwd interfaceC43151Gwd = LIZLLL;
            if (interfaceC43151Gwd != null) {
                String LJLILLLLZI = C78880UxY.LJLILLLLZI(new PublishBehaviorModel(System.currentTimeMillis(), str, behaviorType, str2, str3, str4));
                o.LJIIIIZZ(LJLILLLLZI, "toJson(PublishBehaviorMo…type, stage, code, info))");
                interfaceC43151Gwd.event("publish", LJLILLLLZI);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RuntimeBehaviorManager|id:");
            LIZ2.append(str);
            LIZ2.append(" type:");
            LIZ2.append(behaviorType);
            LIZ2.append(" stage:");
            LIZ2.append(str2);
            LIZ2.append(" code:");
            LIZ2.append(str3);
            LIZ2.append(" info:");
            LIZ2.append(str4);
            H78.LIZ(X1D.LIZIZ(LIZ2));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void LJIIIIZZ(String str, BehaviorType behaviorType, String str2, String str3, int i) {
        String str4 = "";
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) == 0) {
            str4 = null;
        }
        LJII(str, behaviorType, str2, str3, str4);
    }
}
