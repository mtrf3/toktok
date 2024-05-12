package X;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog;
import kotlin.jvm.internal.o;

/* renamed from: X.aaU */
/* loaded from: classes34.dex */
public final class C94034aaU {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ void LIZIZ(String str) {
        LIZ("CKE-editor", str);
    }

    public static final void LIZLLL(String str) {
        ILog iLog = (ILog) C93892aYC.LIZ(ILog.class);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[CKE]::");
        LIZ2.append("KeyBoardUtils");
        iLog.w(X1D.LIZIZ(LIZ2), str);
    }

    public static final void LIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        ILog iLog = (ILog) C93892aYC.LIZ(ILog.class);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[CKE]::");
        LIZ2.append(tag);
        iLog.d(X1D.LIZIZ(LIZ2), msg);
    }

    public static final void LIZJ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        ILog iLog = (ILog) C93892aYC.LIZ(ILog.class);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[CKE]::");
        LIZ2.append(tag);
        iLog.e(X1D.LIZIZ(LIZ2), msg);
    }
}
