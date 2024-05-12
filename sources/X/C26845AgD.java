package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AgD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26845AgD extends F9E implements InterfaceC27632Asu {
    public final List<ReviewImageItem> LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLILLLLZI;
    }

    public C26845AgD(List<ReviewImageItem> list) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = EnumC27721AuL.REVIEW.getValue();
    }
}
