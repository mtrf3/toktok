package X;

import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.995, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass995 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC55235Lm3, C76800UCe> {
    public static final AnonymousClass995 LJLIL = new AnonymousClass995();

    public AnonymousClass995() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC55235Lm3 interfaceC55235Lm3) {
        InterfaceC55235Lm3 vScope = interfaceC55235Lm3;
        o.LJIIIZ(vScope, "vScope");
        List LJIJ = C62814Ol0.LJIJ(vScope, DescExpandModeProtocol.class);
        if (LJIJ != null) {
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                DescExpandModeProtocol descExpandModeProtocol = (DescExpandModeProtocol) it.next();
                if (descExpandModeProtocol != null) {
                    descExpandModeProtocol.LLILLJJLI();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}