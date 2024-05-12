package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.List;

/* renamed from: X.XdG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85266XdG<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Cert LJLJI;
    public final /* synthetic */ Cert LJLJJI;
    public final /* synthetic */ PoiSearchApi.PoiSearchRecallResult LJLJJL;
    public final /* synthetic */ List<PoiSearchApi.PoiGroup> LJLJJLL;

    public C85266XdG(String str, String str2, Cert cert, Cert cert2, PoiSearchApi.PoiSearchRecallResult poiSearchRecallResult, List<PoiSearchApi.PoiGroup> list) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = cert;
        this.LJLJJI = cert2;
        this.LJLJJL = poiSearchRecallResult;
        this.LJLJJLL = list;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<PoiSearchApi.PoiSearchResultWrapper> interfaceC73573Su9) {
        C56179M3b c56179M3b = C56179M3b.LIZ;
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        c56179M3b.LJIIIIZZ(str, str2, this.LJLJI, this.LJLJJI, new C85265XdF((C73433Srt) interfaceC73573Su9, str, str2, this.LJLJJL, this.LJLJJLL));
    }
}
