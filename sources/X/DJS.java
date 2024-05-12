package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DJS extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJS LJLIL = new DJS();

    public DJS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("search_intermediate_recom_cache", 1);
    }
}
