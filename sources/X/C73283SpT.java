package X;

import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import kotlin.jvm.internal.o;

/* renamed from: X.SpT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73283SpT extends AbstractC65781Prl implements InterfaceC88473Ynt<C73284SpU, DiscoverSectionList, DiscoverSectionList, DiscoverSectionList> {
    public static final C73283SpT LJLIL = new C73283SpT();

    public C73283SpT() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final DiscoverSectionList invoke(C73284SpU c73284SpU, DiscoverSectionList discoverSectionList, DiscoverSectionList discoverSectionList2) {
        C73284SpU newK = c73284SpU;
        DiscoverSectionList discoverSectionList3 = discoverSectionList;
        o.LJIIIZ(newK, "newK");
        if (newK.getCursor() == -1) {
            if (discoverSectionList3 == null) {
                return discoverSectionList3;
            }
            discoverSectionList3.setCache(true);
            return discoverSectionList3;
        }
        return null;
    }
}
