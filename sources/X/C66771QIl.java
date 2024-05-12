package X;

/* renamed from: X.QIl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66771QIl implements QJM {
    public final /* synthetic */ C66760QIa LIZ;

    public C66771QIl(C66760QIa c66760QIa) {
        this.LIZ = c66760QIa;
    }

    @Override // X.QJM
    public final void LIZIZ(String str, String str2, String str3) {
        C66769QIj c66769QIj = this.LIZ.LIZLLL.LJIJ;
        if (c66769QIj != null) {
            c66769QIj.LIZIZ(str, str2, str3);
        }
        QI0.LIZIZ("local_did_load", new C66772QIm(this, str, str3, str2));
    }

    @Override // X.QJM
    public final void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        C66769QIj c66769QIj = this.LIZ.LIZLLL.LJIJ;
        if (c66769QIj != null) {
            c66769QIj.LIZ(str, str2, str3, str4, z, str5, str6);
        }
        QI0.LIZIZ("device_register_end", new C66773QIn(this, str2, str4, str6));
    }
}
