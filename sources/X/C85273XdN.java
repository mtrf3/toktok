package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;

/* renamed from: X.XdN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85273XdN extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ C72242sW LJLJI;
    public final /* synthetic */ C68322mC<PoiSearchApi.PoiSearchResultWrapper> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<PoiSearchApi.PoiSearchResultWrapper, C76800UCe> LJLJJL;
    public final /* synthetic */ C85268XdI LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<Throwable, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C85273XdN(C72242sW c72242sW, C72242sW c72242sW2, C72242sW c72242sW3, C68322mC<PoiSearchApi.PoiSearchResultWrapper> c68322mC, InterfaceC88472Yns<? super PoiSearchApi.PoiSearchResultWrapper, C76800UCe> interfaceC88472Yns, C85268XdI c85268XdI, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        super(0);
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = c72242sW2;
        this.LJLJI = c72242sW3;
        this.LJLJJI = c68322mC;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = c85268XdI;
        this.LJLJL = interfaceC88472Yns2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C85267XdH.LIZLLL(this.LJLIL.element, this.LJLILLLLZI.element, System.currentTimeMillis() - this.LJLJI.element, "use_rank");
        M3Z m3z = new M3Z("video_post_page");
        m3z.LIZLLL = "network";
        m3z.LIZ(this.LJLIL.element);
        m3z.LIZIZ(1L);
        C56178M3a.LIZ(m3z);
        M3Z m3z2 = new M3Z("video_post_page");
        m3z2.LIZLLL = "data_parse";
        m3z2.LIZ(this.LJLILLLLZI.element);
        m3z2.LIZIZ(1L);
        C56178M3a.LIZ(m3z2);
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = this.LJLJJI.element;
        if (poiSearchResultWrapper != null) {
            this.LJLJJL.invoke(poiSearchResultWrapper);
        } else {
            C85269XdJ c85269XdJ = C85269XdJ.LIZ;
            C85268XdI c85268XdI = this.LJLJJLL;
            InterfaceC88472Yns<PoiSearchApi.PoiSearchResultWrapper, C76800UCe> interfaceC88472Yns = this.LJLJJL;
            InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns2 = this.LJLJL;
            c85269XdJ.getClass();
            C85269XdJ.LIZ(c85268XdI, interfaceC88472Yns, interfaceC88472Yns2);
        }
        return C76800UCe.LIZ;
    }
}
