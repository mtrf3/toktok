package X;

import java.util.HashMap;

/* renamed from: X.KFa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51394KFa implements InterfaceC54958Lha {
    public final KG1 LIZ;
    public Long LIZIZ;

    @Override // X.InterfaceC54958Lha
    public final void LIZ(long j) {
    }

    @Override // X.InterfaceC54958Lha
    public final boolean hasMore() {
        KG1 kg1 = this.LIZ;
        if (kg1 == null || !kg1.X1()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54958Lha
    public final void LIZIZ(java.util.Map<String, String> map) {
        KG1 kg1 = this.LIZ;
        if (kg1 != null) {
            Object obj = ((HashMap) map).get("roomId");
            if (obj == null) {
                obj = "";
            }
            kg1.LJLLJ((String) obj);
        }
    }

    @Override // X.InterfaceC54958Lha
    public final void LIZJ(C50039JkR c50039JkR) {
        KG1 kg1 = this.LIZ;
        if (kg1 != null) {
            kg1.H0(c50039JkR, this.LIZIZ);
        }
        this.LIZIZ = null;
    }

    public C51394KFa(KG1 kg1, Long l) {
        this.LIZ = kg1;
        this.LIZIZ = l;
    }
}
