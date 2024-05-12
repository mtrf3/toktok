package X;

import java.util.HashMap;

/* renamed from: X.R7q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69038R7q<T> implements InterfaceC73518StG {
    public final /* synthetic */ EnumC69116RAq LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ EnumC69113RAn LJFF;

    public C69038R7q(EnumC69116RAq enumC69116RAq, InterfaceC69056R8i interfaceC69056R8i, boolean z, String str, String str2, EnumC69113RAn enumC69113RAn) {
        this.LIZ = enumC69116RAq;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        boolean z;
        if (this.LIZ == EnumC69116RAq.SIGN_UP) {
            z = true;
        } else {
            z = false;
        }
        C68972R5c.LJIIIIZZ(Boolean.valueOf(z), "sms_verification", this.LIZIZ.q9(), false, null, 24);
        R85 r85 = new R85(c73516StE, this.LIZ, this.LJFF);
        this.LIZIZ.bi(r85);
        HashMap hashMap = new HashMap();
        if (this.LIZJ) {
            hashMap.put("verify_reused_mobile", "true");
        }
        this.LIZIZ.r9().LIZJ(this.LIZLLL, this.LJ, hashMap, r85);
    }
}
