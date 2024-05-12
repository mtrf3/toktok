package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3VU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VU extends F9E {
    public final String LJLIL;
    public final java.util.Map<String, Boolean> LJLILLLLZI;
    public final SharePackage LJLJI;
    public final List<IMContact> LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3VU(String type, java.util.Map<String, Boolean> map, SharePackage sharePackage, List<? extends IMContact> list) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(list, "list");
        this.LJLIL = type;
        this.LJLILLLLZI = map;
        this.LJLJI = sharePackage;
        this.LJLJJI = list;
    }
}
