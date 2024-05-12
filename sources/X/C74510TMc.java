package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import defpackage.b1;
import defpackage.s0;

/* renamed from: X.TMc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74510TMc implements InterfaceC74509TMb<Object> {
    public final /* synthetic */ InterfaceC73573Su9 LIZ;

    public C74510TMc(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // X.InterfaceC74509TMb
    public final void onFail(ExceptionResult exceptionResult) {
        Exception runtimeException;
        String str;
        Exception exception;
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            C16880lQ.LLLLIIL(exception);
        }
        InterfaceC73573Su9 interfaceC73573Su9 = this.LIZ;
        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
            StringBuilder LIZJ = b1.LIZJ("Failed on fetch from effect platform, ", "msg : ");
            Integer num = null;
            if (exceptionResult != null) {
                str = exceptionResult.getMsg();
            } else {
                str = null;
            }
            LIZJ.append(str);
            LIZJ.append(", code : ");
            if (exceptionResult != null) {
                num = Integer.valueOf(exceptionResult.getErrorCode());
            }
            runtimeException = new RuntimeException(s0.LIZJ(LIZJ, num, '.', LIZJ));
        }
        interfaceC73573Su9.tryOnError(runtimeException);
        this.LIZ.onComplete();
    }

    @Override // X.InterfaceC74509TMb
    public final void onSuccess(Object obj) {
        this.LIZ.onNext(C1XY.LJJIIJ(obj));
        this.LIZ.onComplete();
    }
}
