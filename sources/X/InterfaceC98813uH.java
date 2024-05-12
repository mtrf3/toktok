package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFrgament;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.router.DmRouterInterceptor;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.3uH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC98813uH {
    String LIZ(String str);

    void LIZIZ();

    void LIZJ();

    void LIZLLL(java.util.Map map, AqS167S0100000_1 aqS167S0100000_1);

    void LJ(String str);

    void LJFF(C98593tv c98593tv);

    DmRouterInterceptor LJI();

    DetailFeedQuickDMFrgament LJII(View view, FragmentManager fragmentManager, Bundle bundle, Aweme aweme, C224508rW c224508rW);

    void LJIIIIZZ(FragmentManager fragmentManager, User user, Aweme aweme, String str, String str2, InterfaceC88472Yns<? super CharSequence, C76800UCe> interfaceC88472Yns, InterfaceC92963kq interfaceC92963kq, boolean z, String str3, InterfaceC110994Xf interfaceC110994Xf);

    void LJIIIZ();

    void LJIIJ(Fragment fragment);

    void LJIIJJI(View view, FragmentManager fragmentManager, Bundle bundle, String str, C55350Lnu c55350Lnu);

    void LJIIL(Context context, String str, IMUser iMUser, C98803uG c98803uG);

    ChatInviteViewModelImpl LJIILIIL(ActivityC45651qj activityC45651qj);

    void LJIILJJIL(FragmentManager fragmentManager, Aweme aweme, String str, AqS167S0100000_1 aqS167S0100000_1);

    void LJIILL(ActivityC45651qj activityC45651qj, String str, Bundle bundle);

    void LJIILLIIL(Context context, Bundle bundle, boolean z, Integer num);
}
