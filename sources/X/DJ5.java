package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DJ5 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJ5 LJLIL = new DJ5();

    public DJ5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("search_suggest_list_widget", 1);
    }
}
