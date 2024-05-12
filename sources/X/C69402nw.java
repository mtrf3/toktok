package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.2nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69402nw implements InterfaceC86772Y3s {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final Integer LJLJJL;
    public final Integer LJLJJLL;
    public final Integer LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.LJLIL * 31;
        String str = this.LJLILLLLZI;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJI, (i + hashCode) * 31, 31);
        boolean z = this.LJLJJI;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LJ + i3) * 31;
        Integer num = this.LJLJJL;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Integer num2 = this.LJLJJLL;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        Integer num3 = this.LJLJL;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionTranslationCacheValue(translatedSubId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", translatedContent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", targetLang=");
        LIZ.append(this.LJLJI);
        LIZ.append(", realtime=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", aiLabTime=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", translationCacheTime=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", translationSize=");
        return s0.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    @Override // X.InterfaceC86772Y3s
    public final Integer i() {
        return this.LJLJL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69402nw)) {
            return false;
        }
        C69402nw c69402nw = (C69402nw) obj;
        if (this.LJLIL == c69402nw.LJLIL && o.LJ(this.LJLILLLLZI, c69402nw.LJLILLLLZI) && o.LJ(this.LJLJI, c69402nw.LJLJI) && this.LJLJJI == c69402nw.LJLJJI && o.LJ(this.LJLJJL, c69402nw.LJLJJL) && o.LJ(this.LJLJJLL, c69402nw.LJLJJLL) && o.LJ(this.LJLJL, c69402nw.LJLJL)) {
            return true;
        }
        return false;
    }

    public C69402nw(int i, String str, String targetLang, boolean z, Integer num, Integer num2, Integer num3) {
        o.LJIIIZ(targetLang, "targetLang");
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = targetLang;
        this.LJLJJI = z;
        this.LJLJJL = num;
        this.LJLJJLL = num2;
        this.LJLJL = num3;
    }
}
