package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.a9r, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92383a9r extends AbstractC60811Ntn {
    public long LJLILLLLZI;
    public String LJLJI = "";

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C91924a2S.LIZ(C91924a2S.LIZ, "rd_pipo_bnpl_webview", "", null, C113554cx.LJJL(new OSZ("duration", String.valueOf(System.currentTimeMillis() - this.LJLILLLLZI)), new OSZ("url_schema", this.LJLJI), new OSZ("status", "1"), new OSZ("biz_type", "BNPL")), 12);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJ(view, url);
        C91924a2S.LIZ(C91924a2S.LIZ, "rd_pipo_bnpl_webview", "", null, C113554cx.LJJL(new OSZ("duration", String.valueOf(System.currentTimeMillis() - this.LJLILLLLZI)), new OSZ("url_schema", this.LJLJI), new OSZ("status", CardStruct.IStatusCode.DEFAULT), new OSZ("biz_type", "BNPL")), 12);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLILLLLZI = System.currentTimeMillis();
        this.LJLJI = url;
    }
}
