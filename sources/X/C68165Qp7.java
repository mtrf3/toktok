package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Qp7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68165Qp7 {
    public Boolean LIZ;
    public Context LIZIZ;
    public final ActivityC45651qj LIZJ;
    public InterfaceC67979Qm7 LIZLLL;
    public final String LJ;
    public String LJFF;
    public C67966Qlu LJI;
    public String LJII;

    public C68165Qp7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68165Qp7)) {
            return false;
        }
        C68165Qp7 c68165Qp7 = (C68165Qp7) obj;
        return o.LJ(this.LIZ, c68165Qp7.LIZ) && o.LJ(this.LIZIZ, c68165Qp7.LIZIZ) && o.LJ(this.LIZJ, c68165Qp7.LIZJ) && o.LJ(this.LIZLLL, c68165Qp7.LIZLLL) && o.LJ(this.LJ, c68165Qp7.LJ) && o.LJ(this.LJFF, c68165Qp7.LJFF) && o.LJ(this.LJI, c68165Qp7.LJI) && o.LJ(this.LJII, c68165Qp7.LJII);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Context context = this.LIZIZ;
        int hashCode2 = (hashCode + (context == null ? 0 : context.hashCode())) * 31;
        ActivityC45651qj activityC45651qj = this.LIZJ;
        int hashCode3 = (hashCode2 + (activityC45651qj == null ? 0 : activityC45651qj.hashCode())) * 31;
        InterfaceC67979Qm7 interfaceC67979Qm7 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (interfaceC67979Qm7 == null ? 0 : interfaceC67979Qm7.hashCode())) * 31;
        String str = this.LJ;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C67966Qlu c67966Qlu = this.LJI;
        int hashCode7 = (hashCode6 + (c67966Qlu == null ? 0 : c67966Qlu.hashCode())) * 31;
        String str3 = this.LJII;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Builder(isBOE=");
        LIZ.append(this.LIZ);
        LIZ.append(", context=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", activity=");
        LIZ.append(this.LIZJ);
        LIZ.append(", callback=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", country=");
        LIZ.append((Object) this.LJ);
        LIZ.append(", gatewayMerchantId=");
        LIZ.append((Object) this.LJFF);
        LIZ.append(", appInfo=");
        LIZ.append(this.LJI);
        LIZ.append(", merchantName=");
        LIZ.append((Object) this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C67963Qlr LIZ() {
        Context context = this.LIZIZ;
        if (context != null) {
            InterfaceC67979Qm7 interfaceC67979Qm7 = this.LIZLLL;
            if (interfaceC67979Qm7 != null) {
                if (this.LJI != null) {
                    if (this.LJFF != null) {
                        Boolean bool = this.LIZ;
                        o.LJI(interfaceC67979Qm7);
                        String str = this.LJ;
                        if (str == null) {
                            str = "US";
                        }
                        C67966Qlu c67966Qlu = this.LJI;
                        o.LJI(c67966Qlu);
                        String str2 = this.LJFF;
                        o.LJI(str2);
                        return new C67963Qlr(bool, context, interfaceC67979Qm7, str, c67966Qlu, str2, this.LJII);
                    }
                    throw new IllegalArgumentException("need to set gatewayMerchantId");
                }
                throw new IllegalArgumentException("need to set appInfo");
            }
            throw new IllegalArgumentException("need to set callback");
        }
        throw new IllegalArgumentException("need to set context");
    }

    public C68165Qp7(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
    }
}
