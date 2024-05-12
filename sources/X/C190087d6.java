package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;

/* renamed from: X.7d6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190087d6 implements InterfaceC214228aw<InterfaceC189217bh> {
    public final C190077d5 LIZ = new InterfaceC189217bh() { // from class: X.7d5
        @Override // X.InterfaceC189217bh
        public final AbstractC73672Svk LLFII(int i, String str, String str2, long j) {
            PoiListApi.LIZ.getClass();
            return C189927cq.LIZ().getPoiVideoList(str, j, i, str2);
        }

        @Override // X.InterfaceC189217bh
        public final AbstractC73672Svk LJII(String str, long j, int i, String str2, String str3) {
            PoiListApi.LIZ.getClass();
            return C189927cq.LIZ().getPoiVideoListBySearchApi(str, j, i, "poi_detail_regional", 0, str2, str3);
        }
    };

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC189217bh getOperator() {
        return this.LIZ;
    }
}
