package X;

import java.io.File;

/* renamed from: X.H3j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43447H3j extends AbstractC43460H3w {
    public final String LIZIZ;

    @Override // X.AbstractC43460H3w
    public final H4Z LIZLLL() {
        String str = this.LIZIZ;
        if (str == null || str.length() == 0) {
            return H4Z.CLIENT;
        }
        File file = new File(this.LIZIZ);
        Throwable LIZ = LIZ();
        if (LIZ instanceof C43466H4c) {
            return H4Z.CLIENT;
        }
        if (!file.exists() || file.length() == 0) {
            return H4Z.CLIENT;
        }
        if (LIZ instanceof C41767GaJ) {
            return H4Z.UPLOAD_SDK;
        }
        return H4Z.CLIENT;
    }

    @Override // X.AbstractC43460H3w
    public final int LIZJ() {
        Throwable LIZ = LIZ();
        if (LIZ instanceof H0H) {
            return ((C41819Gb9) LIZ).getErrorCode();
        }
        return 14;
    }

    public C43447H3j(H0H h0h, String str) {
        super(h0h);
        this.LIZIZ = str;
    }
}
