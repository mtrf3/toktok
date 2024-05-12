package X;

import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.Psm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65844Psm extends Q4W {
    public static final C65845Psn Companion = new C65845Psn();
    public static final long serialVersionUID = 1;
    public final int LJLIL;
    public final String LJLILLLLZI;

    @Override // X.Q4W, java.lang.Throwable
    public String toString() {
        StringBuilder LIZJ = b1.LIZJ("{FacebookDialogException: ", "errorCode: ");
        LIZJ.append(this.LJLIL);
        LIZJ.append(", message: ");
        LIZJ.append(getMessage());
        LIZJ.append(", url: ");
        LIZJ.append(this.LJLILLLLZI);
        LIZJ.append("}");
        String LIZIZ = X1D.LIZIZ(LIZJ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return LIZIZ;
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getFailingUrl() {
        return this.LJLILLLLZI;
    }

    public C65844Psm(String str, int i, String str2) {
        super(str);
        this.LJLIL = i;
        this.LJLILLLLZI = str2;
    }
}
