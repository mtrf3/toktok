package X;

import com.facebook.FacebookRequestError;
import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.Psc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65834Psc extends Q4W {
    public static final C65836Pse Companion = new C65836Pse();
    public static final long serialVersionUID = 1;
    public final FacebookRequestError LJLIL;

    @Override // X.Q4W, java.lang.Throwable
    public String toString() {
        StringBuilder LIZJ = b1.LIZJ("{FacebookServiceException: ", "httpResponseCode: ");
        LIZJ.append(this.LJLIL.requestStatusCode);
        LIZJ.append(", facebookErrorCode: ");
        LIZJ.append(this.LJLIL.errorCode);
        LIZJ.append(", facebookErrorType: ");
        LIZJ.append(this.LJLIL.errorType);
        LIZJ.append(", message: ");
        LIZJ.append(this.LJLIL.LIZ());
        LIZJ.append("}");
        String LIZIZ = X1D.LIZIZ(LIZJ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return LIZIZ;
    }

    public final FacebookRequestError getRequestError() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65834Psc(FacebookRequestError requestError, String str) {
        super(str);
        o.LJIIIZ(requestError, "requestError");
        this.LJLIL = requestError;
    }
}
