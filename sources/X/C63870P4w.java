package X;

import java.util.HashMap;

/* renamed from: X.P4w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63870P4w {
    public final java.util.Map<String, String> LIZ = new HashMap();
    public final StringBuilder LIZIZ = new StringBuilder();
    public boolean LIZJ = true;

    public final void LIZ(float f, String str) {
        java.util.Map<String, String> map = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(f);
        LIZ.append("");
        ((HashMap) map).put(str, X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(f);
        LIZ2.append("");
        LIZLLL(str, X1D.LIZIZ(LIZ2));
    }

    public final void LIZIZ(int i, String str) {
        ((HashMap) this.LIZ).put(str, C72972SkS.LIZLLL(i, ""));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append("");
        LIZLLL(str, X1D.LIZIZ(LIZ));
    }

    public final void LIZJ(String str, String str2) {
        ((HashMap) this.LIZ).put(str, str2);
        LIZLLL(str, str2);
    }

    public final void LIZLLL(String str, String str2) {
        if (!this.LIZJ) {
            this.LIZIZ.append(",");
        }
        this.LIZIZ.append("\"");
        this.LIZIZ.append(str);
        this.LIZIZ.append("\"");
        this.LIZIZ.append(":");
        this.LIZIZ.append("\"");
        this.LIZIZ.append(str2);
        this.LIZIZ.append("\"");
        if (this.LIZJ) {
            this.LIZJ = false;
        }
    }
}
