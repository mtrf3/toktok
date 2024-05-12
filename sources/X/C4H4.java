package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4H4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4H4 implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final Integer LJLJI;
    public final InterfaceC116744i6 LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4H4)) {
            return false;
        }
        C4H4 c4h4 = (C4H4) obj;
        return o.LJ(this.LJLIL, c4h4.LJLIL) && this.LJLILLLLZI == c4h4.LJLILLLLZI && o.LJ(this.LJLJI, c4h4.LJLJI) && o.LJ(this.LJLJJI, c4h4.LJLJJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.LJLJI;
        int hashCode2 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        InterfaceC116744i6 interfaceC116744i6 = this.LJLJJI;
        return hashCode2 + (interfaceC116744i6 != null ? interfaceC116744i6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnswerTextItem(content=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isHighLight=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", highLightIndex=");
        LIZ.append(this.LJLJI);
        LIZ.append(", onSpanClickListener=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C4H4(String content, boolean z, Integer num, AnonymousClass481 anonymousClass481) {
        o.LJIIIZ(content, "content");
        this.LJLIL = content;
        this.LJLILLLLZI = z;
        this.LJLJI = num;
        this.LJLJJI = anonymousClass481;
    }
}
