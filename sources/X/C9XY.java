package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9XY, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9XY extends AbstractC238349Xa {
    public final String LIZIZ;
    public final C5H3 LIZJ;

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-params>(...)");
        return (java.util.Map) value;
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C9XY(String url, boolean z, Throwable th, int i) {
        boolean z2;
        Throwable th2 = (i & 4) != 0 ? null : th;
        if ((i & 8) != 0) {
            z2 = ((RBX) HG3.LJIILL()).isLogin();
        } else {
            z2 = false;
        }
        o.LJIIIZ(url, "url");
        this.LIZIZ = "link_checksum_result";
        this.LIZJ = C221108m2.LIZ(EnumC221088m0.NONE, new C238499Xp(this, z, z2, th2, url));
        StringBuilder LIZIZ = C25620zW.LIZIZ("checksum -> final url: ", url, ", track: ");
        LIZIZ.append(LIZIZ());
        C221018lt.LJFF("@LinkRelation", X1D.LIZIZ(LIZIZ));
    }
}
