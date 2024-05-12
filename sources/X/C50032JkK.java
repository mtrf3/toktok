package X;

import Y.ACallableS85S0200000_8;
import Y.AgS111S0200000_8;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.JkK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50032JkK implements InterfaceC54958Lha {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InterfaceC50036JkO LJ;
    public Boolean LJFF;
    public final InterfaceC78468Uqu LJI;
    public long LJII;

    @Override // X.InterfaceC54958Lha
    public final void LIZ(long j) {
    }

    @Override // X.InterfaceC54958Lha
    public final boolean hasMore() {
        return o.LJ(this.LJFF, Boolean.TRUE);
    }

    @Override // X.InterfaceC54958Lha
    public final void LIZIZ(java.util.Map<String, String> map) {
        InterfaceC50036JkO interfaceC50036JkO = this.LJ;
        if (interfaceC50036JkO != null) {
            Object obj = ((HashMap) map).get("roomId");
            if (obj == null) {
                obj = "";
            }
            interfaceC50036JkO.LJLLJ((String) obj);
        }
    }

    @Override // X.InterfaceC54958Lha
    public final void LIZJ(C50039JkR c50039JkR) {
        Integer num;
        if (o.LJ(this.LJFF, Boolean.FALSE)) {
            c50039JkR.LIZ.onFail();
            return;
        }
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        C10K.LIZJ(new ACallableS85S0200000_8(this, num, 10)).LJ(new AgS111S0200000_8(this, c50039JkR, 3), C10K.LJIIIIZZ, null);
    }

    public C50032JkK(String str, long j, String str2, String str3, String str4, InterfaceC50036JkO interfaceC50036JkO, Boolean bool, InterfaceC78468Uqu interfaceC78468Uqu) {
        HH1.LIZ(str, "keyword", str3, "enterFrom", str4, "searchId");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = interfaceC50036JkO;
        this.LJFF = bool;
        this.LJI = interfaceC78468Uqu;
        this.LJII = j;
    }
}
