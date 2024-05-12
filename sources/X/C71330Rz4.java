package X;

import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.logger.AnchorLogger$logCommentAnchorView$1", f = "AnchorLogger.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rz4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71330Rz4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ ShopWindowAnchorModel LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71330Rz4(Aweme aweme, String str, boolean z, ShopWindowAnchorModel shopWindowAnchorModel, boolean z2, String str2, InterfaceC67352kd<? super C71330Rz4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = shopWindowAnchorModel;
        this.LJLJJL = z2;
        this.LJLJJLL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71330Rz4(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        CommonVideoAnchorModel LJJIIZ = C71360RzY.LJJIIZ(this.LJLIL, this.LJLILLLLZI);
        if (this.LJLJI) {
            str = "tiktok_video_anchor_view";
        } else {
            str = "tiktok_video_anchor_click";
        }
        C76542zS.LIZJ(str, new C71329Rz3(LJJIIZ, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLIL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
