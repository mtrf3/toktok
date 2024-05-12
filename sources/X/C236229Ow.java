package X;

import com.bytedance.touchpoint.core.invitecode.TTInviteCodeViewModel;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;

/* renamed from: X.9Ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C236229Ow extends AbstractC244999jT {
    public static String LJLIL;
    public static final C214378bB LJLILLLLZI;
    public static final C236229Ow LJLJI;

    static {
        C236229Ow c236229Ow = new C236229Ow();
        LJLJI = c236229Ow;
        C221108m2.LIZIZ(C9P1.LJLIL);
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(TTInviteCodeViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9P0.INSTANCE, null, null);
        LJLILLLLZI = c214378bB;
        C8YN.LJII(c236229Ow, c214378bB.getValue(), new TBT() { // from class: X.9Ou
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C236009Oa) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), C236239Ox.LJLIL, 4);
        C8YN.LJII(c236229Ow, c214378bB.getValue(), new TBT() { // from class: X.9Oz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236009Oa) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C236249Oy.LJLIL, 4);
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        return (BaseTouchPointDataVM) LJLILLLLZI.getValue();
    }
}
