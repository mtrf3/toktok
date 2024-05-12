package X;

import java.text.BreakIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.23l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C522923l extends AbstractC65781Prl implements InterfaceC88472Yns<C1YW, InterfaceC14750hz> {
    public static final C522923l LJLIL = new C522923l();

    public C522923l() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC14750hz invoke(C1YW c1yw) {
        C1YW deleteIfSelectedOr = c1yw;
        o.LJIIIZ(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        int LIZJ = C08350Ul.LIZJ(deleteIfSelectedOr.LJFF);
        String str = deleteIfSelectedOr.LJI.LJLIL;
        int LIZJ2 = C08350Ul.LIZJ(deleteIfSelectedOr.LJFF);
        o.LJIIIZ(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return new C1U1(LIZJ - characterInstance.preceding(LIZJ2), 0);
    }
}
