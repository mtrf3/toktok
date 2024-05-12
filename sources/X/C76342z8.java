package X;

import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$1$1", f = "SharedVideoDeepLinkHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2z8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76342z8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SharedVideoDeepLinkHelper LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ RelationStatus LJLJI;
    public final /* synthetic */ Integer LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76342z8(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, String str, RelationStatus relationStatus, Integer num, InterfaceC67352kd<? super C76342z8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = sharedVideoDeepLinkHelper;
        this.LJLILLLLZI = str;
        this.LJLJI = relationStatus;
        this.LJLJJI = num;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76342z8(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((C76322z6) this.LJLIL.LJLJLJ.getValue()).LIZ(this.LJLJI.getFollowStatus(), this.LJLJJI.intValue(), this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
