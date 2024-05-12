package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189907co extends F9E implements C33Q {
    public final AbstractC72932td<PoiListApi.PoiDetailResponse> LJLIL;
    public final boolean LJLILLLLZI;

    public C189907co() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C189907co(int i) {
        this(C33X.LIZ, false);
    }

    public C189907co(AbstractC72932td<PoiListApi.PoiDetailResponse> detailResponse, boolean z) {
        o.LJIIIZ(detailResponse, "detailResponse");
        this.LJLIL = detailResponse;
        this.LJLILLLLZI = z;
    }

    public static C189907co L(C189907co c189907co, AbstractC72932td detailResponse, boolean z, int i) {
        if ((i & 1) != 0) {
            detailResponse = c189907co.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c189907co.LJLILLLLZI;
        }
        c189907co.getClass();
        o.LJIIIZ(detailResponse, "detailResponse");
        return new C189907co(detailResponse, z);
    }
}
