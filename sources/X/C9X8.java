package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9X8, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9X8 implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public C9XG LJLJJI;
    public final boolean LJLJJL;

    public C9X8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9X8)) {
            return false;
        }
        C9X8 c9x8 = (C9X8) obj;
        return o.LJ(this.LJLIL, c9x8.LJLIL) && o.LJ(this.LJLILLLLZI, c9x8.LJLILLLLZI) && o.LJ(this.LJLJI, c9x8.LJLJI) && this.LJLJJI == c9x8.LJLJJI && this.LJLJJL == c9x8.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        String str = this.LJLJI;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.LJLJJI.hashCode() + ((LJ + hashCode) * 31)) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileSignatureTranslationState(originalContent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", srcLang=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", translatedContent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", currentDisplayState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", srcLangTranslatable=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ C9X8(int i) {
        this("", "", null, C9XG.ORIGINAL, true);
    }

    public C9X8(String originalContent, String srcLang, String str, C9XG currentDisplayState, boolean z) {
        o.LJIIIZ(originalContent, "originalContent");
        o.LJIIIZ(srcLang, "srcLang");
        o.LJIIIZ(currentDisplayState, "currentDisplayState");
        this.LJLIL = originalContent;
        this.LJLILLLLZI = srcLang;
        this.LJLJI = str;
        this.LJLJJI = currentDisplayState;
        this.LJLJJL = z;
    }

    public static C9X8 LIZ(C9X8 c9x8, String str, String str2, C9XG c9xg, int i) {
        String originalContent;
        boolean z;
        C9XG currentDisplayState = c9xg;
        String srcLang = str;
        String str3 = str2;
        if ((i & 1) != 0) {
            originalContent = c9x8.LJLIL;
        } else {
            originalContent = null;
        }
        if ((i & 2) != 0) {
            srcLang = c9x8.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c9x8.LJLJI;
        }
        if ((i & 8) != 0) {
            currentDisplayState = c9x8.LJLJJI;
        }
        if ((i & 16) != 0) {
            z = c9x8.LJLJJL;
        } else {
            z = false;
        }
        c9x8.getClass();
        o.LJIIIZ(originalContent, "originalContent");
        o.LJIIIZ(srcLang, "srcLang");
        o.LJIIIZ(currentDisplayState, "currentDisplayState");
        return new C9X8(originalContent, srcLang, str3, currentDisplayState, z);
    }
}