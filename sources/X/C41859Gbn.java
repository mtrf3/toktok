package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gbn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41859Gbn {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C41861Gbp.LJLIL);

    public final C41860Gbo LIZ() {
        return (C41860Gbo) this.LIZ.getValue();
    }

    public static final void LJI(Throwable error) {
        o.LJIIIZ(error, "error");
        C60903NvH.LJIIJJI().LJJIIJ();
        C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishFailed: ");
        LIZ.append(C36747EbX.LIZIZ(error));
        LJJ.LIZJ("publish", X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(Object obj) {
        C41860Gbo LIZ = LIZ();
        LIZ.getClass();
        if (C19N.LJ("enable_publish_online_business_log", true)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("[stage-", "CaptionComponent", "][thread-");
            LIZIZ.append(C16880lQ.LLLLIIIILLL().getName());
            LIZIZ.append("] ");
            LIZIZ.append("handleIllegalVideoDesc");
            LIZIZ.append(", payload: ");
            LIZIZ.append(obj);
            LIZ.LIZ.log(C40689Fy1.LLIIII(C41860Gbo.LIZIZ, X1D.LIZIZ(LIZIZ)));
        }
    }

    public final void LIZJ(String stage, String message) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(message, "message");
        C41860Gbo LIZ = LIZ();
        LIZ.getClass();
        if (C19N.LJ("enable_publish_online_business_log", true)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("[stage-", stage, "][thread-");
            LIZIZ.append(C16880lQ.LLLLIIIILLL().getName());
            LIZIZ.append("] ");
            LIZIZ.append(message);
            LIZ.LIZ.log(C40689Fy1.LLIIII(C41860Gbo.LIZIZ, X1D.LIZIZ(LIZIZ)));
        }
    }

    public final void LIZLLL(String str, Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        LIZ().LIZIZ(str, throwable);
    }

    public final void LJ(String stage, String message) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(message, "message");
        LIZ();
        C41860Gbo.LIZJ(stage, message);
    }

    public final void LJFF(String stage, InterfaceC65784Pro<String> messageBuilder) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(messageBuilder, "messageBuilder");
        LIZ().getClass();
        C41860Gbo.LIZ();
    }
}
