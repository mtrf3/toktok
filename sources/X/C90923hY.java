package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.thereparty.ClearHistorySheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.3hY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90923hY extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C90923hY LJLIL = new C90923hY();

    public C90923hY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        TuxSheet tuxSheet = ClearHistorySheet.LJLJJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
            return C76800UCe.LIZ;
        }
        o.LJIJI("sheet");
        throw null;
    }
}
