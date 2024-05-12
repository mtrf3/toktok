package X;

import com.ss.android.ugc.aweme.challenge.ui.DetailPreloadViewCountInfo;

/* renamed from: X.VJm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79538VJm extends AbstractC65781Prl implements InterfaceC65784Pro<DetailPreloadViewCountInfo> {
    public static final C79538VJm LJLIL = new C79538VJm();

    public C79538VJm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.challenge.ui.DetailPreloadViewCountInfo] */
    @Override // X.InterfaceC65784Pro
    public final DetailPreloadViewCountInfo invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        DetailPreloadViewCountInfo detailPreloadViewCountInfo = C79537VJl.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "studio_recyclerview_prefetch_list_count", 31744, DetailPreloadViewCountInfo.class, detailPreloadViewCountInfo);
        if (LJIJ == 0) {
            return detailPreloadViewCountInfo;
        }
        return LJIJ;
    }
}
