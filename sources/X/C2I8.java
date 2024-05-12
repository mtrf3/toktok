package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2I8, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2I8 extends TBS implements InterfaceC88472Yns<Integer, C08350Ul> {
    public C2I8(C08440Uu c08440Uu) {
        super(1, c08440Uu, C18520o4.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    @Override // X.InterfaceC88472Yns
    public final C08350Ul invoke(Integer num) {
        int intValue = num.intValue();
        CharSequence charSequence = (CharSequence) this.receiver;
        o.LJIIIZ(charSequence, "<this>");
        int i = intValue - 1;
        while (true) {
            if (i > 0) {
                int i2 = i - 1;
                if (charSequence.charAt(i2) == '\n') {
                    break;
                }
                i = i2;
            } else {
                i = 0;
                break;
            }
        }
        return new C08350Ul(C17N.LIZLLL(i, C18520o4.LIZ(intValue, charSequence)));
    }
}
