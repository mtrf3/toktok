package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7z8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203747z8 extends AbstractC65781Prl implements InterfaceC88471Ynr<String, Boolean, C76800UCe> {
    public final /* synthetic */ InterfaceC88471Ynr<String, Boolean, C76800UCe> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ AwemeCollectionAgent LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC79150V4o LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203747z8(InterfaceC88471Ynr interfaceC88471Ynr, String str, AwemeCollectionAgent awemeCollectionAgent, boolean z, XKQ xkq) {
        super(2);
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = str;
        this.LJLJI = awemeCollectionAgent;
        this.LJLJJI = z;
        this.LJLJJL = xkq;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, Boolean bool) {
        int i;
        String itemId = str;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(itemId, "itemId");
        InterfaceC88471Ynr<String, Boolean, C76800UCe> interfaceC88471Ynr = this.LJLIL;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(this.LJLILLLLZI, Boolean.valueOf(booleanValue));
        }
        if (!booleanValue) {
            AwemeCollectionAgent awemeCollectionAgent = this.LJLJI;
            boolean z = this.LJLJJI;
            awemeCollectionAgent.getClass();
            if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false)) {
                Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
            }
            Aweme i6 = AwemeService.LIZ().i6(itemId);
            AwemeService.LIZ().g6(z ? 1 : 0, itemId);
            IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
            if (i6 != null) {
                i = i6.getAwemeType();
            } else {
                i = -1;
            }
            iMusicDspService.LJIJI(z ? 1 : 0, i, itemId);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("is_success", "1");
            FMX.LJIIL("collection_request_result", c188727au.LIZ);
            this.LJLJJL.LIZIZ(null);
        }
        return C76800UCe.LIZ;
    }
}
