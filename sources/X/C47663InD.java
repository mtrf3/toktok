package X;

import kotlin.jvm.internal.o;

/* renamed from: X.InD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47663InD {
    public final /* synthetic */ int LIZ = 1;
    public final String LIZIZ;
    public Object LIZJ;
    public Object LIZLLL;

    public final String toString() {
        String str;
        switch (this.LIZ) {
            case 1:
                StringBuilder sb = new StringBuilder("{");
                if (this.LIZJ != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("extConfigMap:");
                    LIZ.append(this.LIZJ);
                    sb.append(X1D.LIZIZ(LIZ));
                }
                if (this.LIZLLL != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(", extConfigObj:");
                    Object obj = this.LIZLLL;
                    if (obj != null) {
                        str = obj.getClass().getName();
                    } else {
                        str = null;
                    }
                    LIZ2.append(str);
                    sb.append(X1D.LIZIZ(LIZ2));
                }
                return C0EH.LIZJ(sb, "}", "sb.toString()");
            default:
                return super.toString();
        }
    }

    public C47663InD(String name) {
        o.LJIIIZ(name, "name");
        this.LIZIZ = name;
    }

    public C47663InD(String uiLanguage, String str) {
        o.LJIIIZ(uiLanguage, "uiLanguage");
        this.LIZIZ = "awrxudrcbk09y7wi";
        this.LIZJ = uiLanguage;
        this.LIZLLL = str;
    }
}
