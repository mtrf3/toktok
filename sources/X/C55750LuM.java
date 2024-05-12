package X;

import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import kotlin.jvm.internal.AqS64S1200000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$collectSharerState$1$1", f = "SharedVideoDeepLinkHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.LuM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55750LuM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SharedVideoDeepLinkHelper LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ User LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C238479Xn LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55750LuM(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, boolean z, User user, String str, C238479Xn c238479Xn, InterfaceC67352kd<? super C55750LuM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = sharedVideoDeepLinkHelper;
        this.LJLILLLLZI = z;
        this.LJLJI = user;
        this.LJLJJI = str;
        this.LJLJJL = c238479Xn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55750LuM(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper = this.LJLIL;
        boolean z2 = this.LJLILLLLZI;
        User user = this.LJLJI;
        String awemeId = this.LJLJJI;
        C238479Xn c238479Xn = this.LJLJJL;
        sharedVideoDeepLinkHelper.getClass();
        if (z2 && ((Boolean) DVO.LIZJ.getValue()).booleanValue() && !C70412pZ.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (c238479Xn != null && ((Boolean) C53282Kve.LIZ.getValue()).booleanValue() && user != null && user.getFollowStatus() == 0) {
            C55756LuS c55756LuS = sharedVideoDeepLinkHelper.LJLJJL;
            if (c55756LuS != null) {
                o.LJIIIZ(awemeId, "awemeId");
                if (o.LJ(c55756LuS.LIZJ, awemeId) && o.LJ(c55756LuS.LIZLLL.getUid(), user.getUid())) {
                    C221018lt.LJFF("@LinkRelation_Video", "show dialog by old operator!");
                    C55756LuS c55756LuS2 = sharedVideoDeepLinkHelper.LJLJJL;
                    if (c55756LuS2 != null) {
                        c55756LuS2.LIZ();
                    }
                }
            }
            C221018lt.LJFF("@LinkRelation_Video", "show dialog by new operator!");
            C55756LuS c55756LuS3 = sharedVideoDeepLinkHelper.LJLJJL;
            if (c55756LuS3 != null) {
                c55756LuS3.LIZIZ();
            }
            C55756LuS c55756LuS4 = new C55756LuS(sharedVideoDeepLinkHelper.LJLIL, c238479Xn, awemeId, user);
            sharedVideoDeepLinkHelper.LJLJJL = c55756LuS4;
            c55756LuS4.LIZ();
        } else if (z) {
            if (user != null) {
                UVX uvx = new UVX(sharedVideoDeepLinkHelper.LJLIL, awemeId, user);
                if (SharedVideoDeepLinkHelper.LJLL) {
                    uvx.LIZIZ();
                } else {
                    sharedVideoDeepLinkHelper.LJLJL = uvx;
                }
            }
            C221018lt.LJFF("@LinkRelation_Video", "inserted by api, try refresh view holder!");
        } else if (C70412pZ.LIZ()) {
            A7X landAutoMsgToChatHelper = IMService.createIIMServicebyMonsterPlugin(false).getLandAutoMsgToChatHelper();
            landAutoMsgToChatHelper.LIZIZ();
            landAutoMsgToChatHelper.LIZ(sharedVideoDeepLinkHelper.LJLIL.getContext(), new AqS64S1200000_9(sharedVideoDeepLinkHelper, awemeId, user, 2));
        } else {
            sharedVideoDeepLinkHelper.LIZIZ(user, awemeId);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
