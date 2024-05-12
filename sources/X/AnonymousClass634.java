package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.634, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass634 {
    public final String LIZ;
    public final AnonymousClass631 LIZIZ;
    public C68D LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public final List<String> LJI;
    public boolean LJII;

    public AnonymousClass634() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass634)) {
            return false;
        }
        AnonymousClass634 anonymousClass634 = (AnonymousClass634) obj;
        return o.LJ(this.LIZ, anonymousClass634.LIZ) && o.LJ(this.LIZIZ, anonymousClass634.LIZIZ) && o.LJ(this.LIZJ, anonymousClass634.LIZJ) && this.LIZLLL == anonymousClass634.LIZLLL && this.LJ == anonymousClass634.LJ && this.LJFF == anonymousClass634.LJFF && o.LJ(this.LJI, anonymousClass634.LJI) && this.LJII == anonymousClass634.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        C68D c68d = this.LIZJ;
        int hashCode2 = (hashCode + (c68d == null ? 0 : c68d.hashCode())) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJFF;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        List<String> list = this.LJI;
        return ((i6 + (list != null ? list.hashCode() : 0)) * 31) + (this.LJII ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditTextStickerConfig(fontPanel=");
        LIZ.append(this.LIZ);
        LIZ.append(", funcEnable=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", textBubbleViewFactory=");
        LIZ.append(this.LIZJ);
        LIZ.append(", enableQaSticker=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isShoutout=");
        LIZ.append(this.LJ);
        LIZ.append(", allowQuestion=");
        LIZ.append(this.LJFF);
        LIZ.append(", checkTextIsQuestionRegex=");
        LIZ.append(this.LJI);
        LIZ.append(", isForward2StoryMode=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public AnonymousClass634(AnonymousClass631 anonymousClass631, C44384HbQ c44384HbQ, boolean z, boolean z2, boolean z3, List list) {
        this.LIZ = "textfont";
        this.LIZIZ = anonymousClass631;
        this.LIZJ = c44384HbQ;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = list;
        this.LJII = false;
    }
}
