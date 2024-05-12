package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7bW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189107bW extends AbstractC65781Prl implements InterfaceC88472Yns<C189907co, Boolean> {
    public static final C189107bW LJLIL = new C189107bW();

    public C189107bW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C189907co c189907co) {
        C189907co it = c189907co;
        o.LJIIIZ(it, "it");
        PoiListApi.PoiDetailResponse LIZ = it.LJLIL.LIZ();
        if (LIZ != null) {
            return Boolean.valueOf(LIZ.isCollected);
        }
        return null;
    }
}
