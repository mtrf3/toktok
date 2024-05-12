package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;

/* renamed from: X.XdM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85272XdM<T> implements InterfaceC64592gB {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<PoiSearchApi.PoiSearchResultWrapper, C76800UCe> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C85272XdM(C72242sW c72242sW, long j, InterfaceC88472Yns<? super PoiSearchApi.PoiSearchResultWrapper, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        this.LJLIL.element = System.currentTimeMillis() - this.LJLILLLLZI;
        long currentTimeMillis = System.currentTimeMillis();
        PoiSearchApi.PoiSearchResultWrapper LIZ = C85239Xcp.LIZ((String) obj);
        C85267XdH.LIZLLL(this.LJLIL.element, System.currentTimeMillis() - currentTimeMillis, 0L, "just_search");
        M3Z m3z = new M3Z("video_post_page");
        m3z.LIZLLL = "network";
        m3z.LIZ(this.LJLIL.element);
        C56178M3a.LIZ(m3z);
        M3Z m3z2 = new M3Z("video_post_page");
        m3z2.LIZLLL = "data_parse";
        m3z2.LIZ(System.currentTimeMillis() - currentTimeMillis);
        C56178M3a.LIZ(m3z2);
        this.LJLJI.invoke(LIZ);
    }
}
