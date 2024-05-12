package X;

import Y.ACallableS2S1000000_3;
import com.ss.android.ugc.aweme.feed.assem.friendstab.FriendsTabEducateButtonAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8tW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225748tW extends AbstractC65781Prl implements InterfaceC88474Ynu<FriendsTabEducateButtonAssem, C43I<? extends C76800UCe>, C43I<? extends C76800UCe>, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C225748tW LJLIL = new C225748tW();

    public C225748tW() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(FriendsTabEducateButtonAssem friendsTabEducateButtonAssem, C43I<? extends C76800UCe> c43i, C43I<? extends C76800UCe> c43i2, C43I<? extends C76800UCe> c43i3) {
        FriendsTabEducateButtonAssem selectSubscribe = friendsTabEducateButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (selectSubscribe.LLII && !selectSubscribe.LLIIII && selectSubscribe.Y3().getVisibility() != 0 && C226068u2.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme(), EnumC61832bj.BOTTOM_BUTTON) && (!C53324KwK.LIZ() || c43i != null || c43i2 != null || c43i3 != null)) {
            selectSubscribe.LLIIII = true;
            C17N.LJJLIIIJJI(selectSubscribe.Y3());
            C17N.LJJLIIIJJI(selectSubscribe.getContainerView());
            C10K.LIZJ(new ACallableS2S1000000_3("show", 0));
        }
        return C76800UCe.LIZ;
    }
}
