package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import java.util.List;

/* renamed from: X.AoD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27341AoD extends F9E {
    public final List<StaticSellingPoint> LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C27341AoD(List<StaticSellingPoint> list, boolean z) {
        this.LJLIL = list;
        this.LJLILLLLZI = z;
    }
}
