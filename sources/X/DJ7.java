package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DJ7 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJ7 LJLIL = new DJ7();

    public DJ7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("search_server_sug_cache", 0);
    }
}
