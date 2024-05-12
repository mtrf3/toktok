package X;

import defpackage.i0;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* renamed from: X.Pcv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64861Pcv {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("sticker_", "photo-message-template", "video-message-template", "AwemeCoverManager:MsgCover");

    public static final boolean LIZ(String str) {
        Iterator<String> it = LIZ.iterator();
        while (it.hasNext()) {
            if (o.LJJJLIIL(str, it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static final String LIZJ(Throwable th) {
        if (th == null) {
            return "NullThrowable";
        }
        if (th instanceof C64799Pbv) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CronetIOException: ");
            LIZ2.append(((C64799Pbv) th).getStatusCode());
            return X1D.LIZIZ(LIZ2);
        }
        if (th instanceof MalformedURLException) {
            return "MalformedURLException";
        }
        if (th instanceof IllegalArgumentException) {
            return "IllegalArgumentException";
        }
        if (th instanceof IllegalStateException) {
            return "IllegalStateException";
        }
        if (th instanceof OutOfMemoryError) {
            return "OutOfMemoryError";
        }
        if (th instanceof UnsatisfiedLinkError) {
            return "UnsatisfiedLinkError";
        }
        if (th instanceof C64802Pby) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("HttpResponseException: ");
            LIZ3.append(((C64802Pby) th).getStatusCode());
            return X1D.LIZIZ(LIZ3);
        }
        if (th instanceof C64698PaI) {
            return "NetworkNotAvailabeException";
        }
        if (th instanceof C81822W9i) {
            return "DecodeException";
        }
        if (th instanceof G91) {
            return "InvalidValueException";
        }
        if (th instanceof P3U) {
            return "InvalidSizeException";
        }
        if (th instanceof P3V) {
            return "SizeTooLargeException";
        }
        if (th instanceof H77) {
            return "PoolSizeViolationException";
        }
        String LJLLILLLL = C16880lQ.LJLLILLLL(th.getClass());
        if (LJLLILLLL != null) {
            return LJLLILLLL;
        }
        return th.getClass().getName();
    }

    public static final String LIZIZ(String str, Throwable th) {
        if (th == null) {
            return i0.LJFF("NullThrowable: url: ", str);
        }
        if (th instanceof C64799Pbv) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("CronetIOException: url: ", str, " error: ");
            C64799Pbv c64799Pbv = (C64799Pbv) th;
            LIZIZ.append(c64799Pbv.getStatusCode());
            LIZIZ.append(": ");
            LIZIZ.append(c64799Pbv.getMessage());
            return X1D.LIZIZ(LIZIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LJLLILLLL(th.getClass()));
        LIZ2.append(": url: ");
        LIZ2.append(str);
        LIZ2.append(" error: ");
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        LIZ2.append(message);
        return X1D.LIZIZ(LIZ2);
    }
}
