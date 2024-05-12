package X;

import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Abt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26577Abt extends F9E {
    public final List<UserTrustItem> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C26577Abt(List<UserTrustItem> userTrustItems) {
        o.LJIIIZ(userTrustItems, "userTrustItems");
        this.LJLIL = userTrustItems;
    }
}
