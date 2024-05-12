package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SdB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72521SdB extends C72523SdD {
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.C72523SdD, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C72521SdB) {
            C72521SdB c72521SdB = (C72521SdB) interfaceC57784Mm4;
            if (o.LJ(this.LJLILLLLZI, c72521SdB.LJLILLLLZI) && o.LJ(this.LJLJI, c72521SdB.LJLJI)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C72523SdD, X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof C72521SdB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72521SdB(String titleText, String str, String str2) {
        super(0);
        o.LJIIIZ(titleText, "titleText");
        this.LJLILLLLZI = titleText;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }
}
