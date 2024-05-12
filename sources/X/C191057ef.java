package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191057ef extends AbstractC65781Prl implements InterfaceC88472Yns<C190977eX, String> {
    public static final C191057ef LJLIL = new C191057ef();

    public C191057ef() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(C190977eX c190977eX) {
        C190977eX it = c190977eX;
        o.LJIIIZ(it, "it");
        PoiListApi.PoiDetailResponse LIZ = it.LJLIL.LIZ();
        if (LIZ != null) {
            return LIZ.address;
        }
        return null;
    }
}
