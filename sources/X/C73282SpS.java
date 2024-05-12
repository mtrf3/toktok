package X;

import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import kotlin.jvm.internal.o;

/* renamed from: X.SpS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73282SpS<T, R> implements InterfaceC48038ItG {
    public static final C73282SpS<T, R> LJLIL = new C73282SpS<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        DiscoverSectionList sectionList = (DiscoverSectionList) obj;
        o.LJIIIZ(sectionList, "sectionList");
        return new OSZ(sectionList.getSections(), new C70839Rr9(sectionList.getHasMore(), sectionList.getCursor()));
    }
}
