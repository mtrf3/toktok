package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.RBs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69144RBs extends AbstractC65781Prl implements InterfaceC88474Ynu<Fragment, InterfaceC69056R8i, String, String, AbstractC73635Sv9<R40<R7Y>>> {
    public static final C69144RBs LJLIL = new C69144RBs();

    public C69144RBs() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final AbstractC73635Sv9<R40<R7Y>> invoke(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str, String str2) {
        Fragment fragment2 = fragment;
        InterfaceC69056R8i accountCallback = interfaceC69056R8i;
        String data = str;
        String sendMethod = str2;
        o.LJIIIZ(fragment2, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        o.LJIIIZ(data, "data");
        o.LJIIIZ(sendMethod, "sendMethod");
        if (C69145RBt.LIZ[accountCallback.scene().ordinal()] == 1) {
            return C69093R9t.LJIJI(fragment2, accountCallback, "", C69143RBr.LIZ(accountCallback), sendMethod, null, null, 224);
        }
        return C69093R9t.LJIJI(fragment2, accountCallback, data, C69143RBr.LIZ(accountCallback), sendMethod, null, null, 224);
    }
}
