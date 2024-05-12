package X;

import com.facebook.FacebookRequestError;
import kotlin.jvm.internal.o;

/* renamed from: X.Psd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65835Psd extends Q4W {
    public final C66381Q3l LJLIL;

    @Override // X.Q4W, java.lang.Throwable
    public String toString() {
        FacebookRequestError facebookRequestError;
        C66381Q3l c66381Q3l = this.LJLIL;
        if (c66381Q3l == null) {
            facebookRequestError = null;
        } else {
            facebookRequestError = c66381Q3l.LIZLLL;
        }
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.requestStatusCode);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.errorCode);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.errorType);
            sb.append(", message: ");
            sb.append(facebookRequestError.LIZ());
            sb.append("}");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "errorStringBuilder.toString()");
        return sb2;
    }

    public final C66381Q3l getGraphResponse() {
        return this.LJLIL;
    }

    public C65835Psd(C66381Q3l c66381Q3l, String str) {
        super(str);
        this.LJLIL = c66381Q3l;
    }
}
