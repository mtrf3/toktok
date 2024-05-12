package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IeL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47113IeL {
    public String LIZ;
    public long LIZIZ;
    public int LIZJ;
    public List<C47160If6> LIZLLL;
    public String LJ = "";

    public final C47156If2 LIZIZ() {
        C47156If2 c47156If2 = new C47156If2();
        c47156If2.LIZ = this.LIZ;
        c47156If2.LJ = this.LJ;
        c47156If2.LIZIZ = this.LIZIZ;
        c47156If2.LIZLLL = this.LIZJ;
        if (this.LIZLLL == null) {
            this.LIZLLL = new ArrayList();
        }
        c47156If2.LIZJ = this.LIZLLL;
        return c47156If2;
    }

    public final void LIZ(C47159If5 c47159If5) {
        if (this.LIZLLL == null) {
            this.LIZLLL = new ArrayList();
        }
        ((ArrayList) this.LIZLLL).add(c47159If5);
    }

    public final void LIZJ(String str) {
        this.LIZ = str;
        if (TextUtils.isEmpty(this.LJ)) {
            this.LJ = str;
        }
    }
}
