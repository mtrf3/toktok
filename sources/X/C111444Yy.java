package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.ui.avatar.LegacyDMInboxAvatarLoadHelper$loadAvatar$1", f = "LegacyDMInboxAvatarLoadHelper.kt", l = {63, SubscriptionExpireRemindHourSetting.DEFAULT, 78}, m = "invokeSuspend")
/* renamed from: X.4Yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111444Yy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UrlModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ImageUrlModel LJLJJI;
    public final /* synthetic */ InterfaceC85013Vh LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C111444Yy(UrlModel urlModel, String str, ImageUrlModel imageUrlModel, InterfaceC85013Vh interfaceC85013Vh, int i, InterfaceC67352kd<? super C111444Yy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = urlModel;
        this.LJLJI = str;
        this.LJLJJI = imageUrlModel;
        this.LJLJJL = interfaceC85013Vh;
        this.LJLJJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C111444Yy(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj);
                        C85353Wp.LIZJ(2, this.LJLJI);
                        return C76800UCe.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
                C85353Wp.LIZJ(2, this.LJLJI);
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
            C85353Wp.LIZJ(2, this.LJLJI);
            return C76800UCe.LIZ;
        }
        C141335gf.LIZJ(obj);
        List<String> urlList = this.LJLILLLLZI.getUrlList();
        o.LJIIIIZZ(urlList, "avatar.urlList");
        String str = (String) ORZ.LJLLLLLL(0, urlList);
        if (str == null) {
            str = "";
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (W5U.LIZJ().LJII(parse)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("inMemoryCache, uid=");
            C48690J9a.LJIIL(LIZ, this.LJLJI, LIZ, "InboxDMAvatarLoadHelper");
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C111454Yz c111454Yz = new C111454Yz(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c111454Yz, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            C85353Wp.LIZJ(2, this.LJLJI);
            return C76800UCe.LIZ;
        }
        if (W5U.LIZJ().LIZ(parse)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("hasCachedFile, uid=");
            C48690J9a.LJIIL(LIZ2, this.LJLJI, LIZ2, "InboxDMAvatarLoadHelper");
            AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
            C4Z0 c4z0 = new C4Z0(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN2, c4z0, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            C85353Wp.LIZJ(2, this.LJLJI);
            return C76800UCe.LIZ;
        }
        AbstractC78621UtN abstractC78621UtN3 = C36636EZk.LIZ;
        C4Z1 c4z1 = new C4Z1(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null);
        this.LJLIL = 3;
        if (XKX.LJI(abstractC78621UtN3, c4z1, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        C85353Wp.LIZJ(2, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
