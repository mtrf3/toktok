package X;

import java.text.BreakIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.23n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523123n extends AbstractC65781Prl implements InterfaceC88472Yns<C1YW, InterfaceC14750hz> {
    public static final C523123n LJLIL = new C523123n();

    public C523123n() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC14750hz invoke(C1YW c1yw) {
        C1YW deleteIfSelectedOr = c1yw;
        o.LJIIIZ(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        String str = deleteIfSelectedOr.LJI.LJLIL;
        int LIZJ = C08350Ul.LIZJ(deleteIfSelectedOr.LJFF);
        o.LJIIIZ(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int following = characterInstance.following(LIZJ);
        if (following != -1) {
            return new C1U1(0, following - C08350Ul.LIZJ(deleteIfSelectedOr.LJFF));
        }
        return null;
    }
}
