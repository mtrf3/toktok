package X;

import android.util.Base64;
import kotlin.jvm.internal.o;

/* renamed from: X.Whv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83007Whv implements InterfaceC66693QFl {
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC83010Why LIZJ;
    public final /* synthetic */ C79453VGf LIZLLL;

    @Override // X.InterfaceC66693QFl
    public final void LIZ() {
        this.LIZJ.LIZ(new C83009Whx("connected", this.LIZIZ).LIZ());
    }

    @Override // X.InterfaceC66693QFl
    public final void onFailed(String reason) {
        o.LJIIJ(reason, "reason");
        C83009Whx c83009Whx = new C83009Whx("failed", this.LIZIZ);
        InterfaceC83010Why interfaceC83010Why = this.LIZJ;
        c83009Whx.LIZ = reason;
        interfaceC83010Why.LIZ(c83009Whx.LIZ());
        C79453VGf c79453VGf = this.LIZLLL;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        c79453VGf.getClass();
        C79453VGf.LIZIZ(str, str2);
    }

    @Override // X.InterfaceC66693QFl
    public final void onMessage(byte[] bArr) {
        C83009Whx c83009Whx = new C83009Whx("onMessaged", this.LIZIZ);
        String encodeToString = Base64.encodeToString(bArr, 0);
        InterfaceC83010Why interfaceC83010Why = this.LIZJ;
        c83009Whx.LIZIZ = encodeToString;
        c83009Whx.LIZJ = "base64";
        interfaceC83010Why.LIZ(c83009Whx.LIZ());
    }

    @Override // X.InterfaceC66693QFl
    public final void onMessage(String str) {
        C83009Whx c83009Whx = new C83009Whx("onMessaged", this.LIZIZ);
        InterfaceC83010Why interfaceC83010Why = this.LIZJ;
        c83009Whx.LIZIZ = str;
        c83009Whx.LIZJ = "string";
        interfaceC83010Why.LIZ(c83009Whx.LIZ());
    }

    @Override // X.InterfaceC66693QFl
    public final void LIZIZ(String str, boolean z) {
        C83009Whx c83009Whx = new C83009Whx("closed", this.LIZIZ);
        c83009Whx.LIZ = str;
        if (z) {
            this.LIZJ.LIZ(c83009Whx.LIZ());
        }
        C79453VGf c79453VGf = this.LIZLLL;
        String str2 = this.LIZ;
        String str3 = this.LIZIZ;
        c79453VGf.getClass();
        C79453VGf.LIZIZ(str2, str3);
    }

    public C83007Whv(C79453VGf c79453VGf, String str, String str2, C83006Whu c83006Whu) {
        this.LIZLLL = c79453VGf;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c83006Whu;
    }
}
