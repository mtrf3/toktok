package X;

import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourcePreloadConfig;
import java.util.List;

/* renamed from: X.Ffa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39546Ffa extends AbstractC65781Prl implements InterfaceC88473Ynt<String, Boolean, String, C76800UCe> {
    public final /* synthetic */ EN1 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ EcomResourcePreloadConfig.EcomResourceImageModel LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ List<String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39546Ffa(EN1 en1, String str, EcomResourcePreloadConfig.EcomResourceImageModel ecomResourceImageModel, List<String> list, List<String> list2) {
        super(3);
        this.LJLIL = en1;
        this.LJLILLLLZI = str;
        this.LJLJI = ecomResourceImageModel;
        this.LJLJJI = list;
        this.LJLJJL = list2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, Boolean bool, String str2) {
        EN1 en1 = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        String path = this.LJLJI.getPath();
        String value = EnumC39545FfZ.IMAGE.getValue();
        Integer valueOf = Integer.valueOf(this.LJLJJI.size());
        Integer valueOf2 = Integer.valueOf(this.LJLJJL.size());
        en1.getClass();
        C76542zS.LIZJ("rd_tiktokec_resource_preload", new C61972OTw(str3, bool.booleanValue(), str2, path, value, valueOf, valueOf2, str));
        return C76800UCe.LIZ;
    }
}
