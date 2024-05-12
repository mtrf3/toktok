package X;

import Y.IDcS136S0200000_10;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Osd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63287Osd extends AbstractC65781Prl implements InterfaceC88473Ynt<String, List<? extends MessageIDIndexEntry>, InterfaceC86963bA<List<? extends C109544Rq>>, C76800UCe> {
    public static final C63287Osd LJLIL = new C63287Osd();

    public C63287Osd() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, List<? extends MessageIDIndexEntry> list, InterfaceC86963bA<List<? extends C109544Rq>> interfaceC86963bA) {
        String id = str;
        List<? extends MessageIDIndexEntry> e = list;
        InterfaceC86963bA<List<? extends C109544Rq>> c = interfaceC86963bA;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(e, "e");
        o.LJIIIZ(c, "c");
        C63356Otk.LJIIIZ().getClass();
        C115284fk.LJIILIIL().LJIIJ(id, new IDcS136S0200000_10(c, e, 3));
        return C76800UCe.LIZ;
    }
}
