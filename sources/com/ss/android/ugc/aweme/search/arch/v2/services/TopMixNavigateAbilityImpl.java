package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C47261Igj;
import X.C49489JbZ;
import X.C50322Jp0;
import X.C50452Jr6;
import X.C50948Jz6;
import X.C55096Ljo;
import X.C76800UCe;
import X.C78934UyQ;
import X.InterfaceC55235Lm3;
import X.InterfaceC88472Yns;
import X.JNW;
import X.JYL;
import X.JYP;
import X.Z9N;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TopMixNavigateAbilityImpl implements SearchServiceCenter$NavigateAbility {
    public final Fragment LJLIL;
    public final JYL LJLILLLLZI;
    public final InterfaceC88472Yns<Aweme, C76800UCe> LJLJI;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    public final boolean xK() {
        return C50452Jr6.LIZ();
    }

    public TopMixNavigateAbilityImpl(Fragment fragment, JYP jyp, AqS174S0100000_8 aqS174S0100000_8) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = jyp;
        this.LJLJI = aqS174S0100000_8;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    public final void ns(InterfaceC55235Lm3 vScope, Aweme aweme, InterfaceC88472Yns<? super EnterRoomConfig, EnterRoomConfig> interfaceC88472Yns) {
        User author;
        o.LJIIIZ(vScope, "vScope");
        if (!aweme.isLive() || (author = aweme.getAuthor()) == null) {
            return;
        }
        long LJIILJJIL = C78934UyQ.LJIILJJIL(author);
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class);
        C49489JbZ c49489JbZ = C49489JbZ.LIZ;
        Context requireContext = this.LJLIL.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        ArrayList LJII = C47261Igj.LJII(Long.valueOf(LJIILJJIL));
        ArrayList LJII2 = C47261Igj.LJII(new RoomInfo(LJIILJJIL, author.getUid()));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C50322Jp0 LIZJ = iSearchContextAbility.If().LIZJ();
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String str = LIZJ.LJLJI;
        logData.search_id = str;
        logData.requestId = str;
        logData.search_keyword = LIZJ.LJLJJI;
        logData.search_type = "general";
        logData.list_item_id = String.valueOf(LJIILJJIL);
        enterRoomConfig.mLogData.anchorId = author.getUid();
        enterRoomConfig.mRoomsData.followStatus = String.valueOf(author.getFollowStatus());
        EnterRoomConfig invoke = interfaceC88472Yns.invoke(enterRoomConfig);
        String str2 = iSearchContextAbility.ut0().LIZJ().LJLJI;
        c49489JbZ.getClass();
        C49489JbZ.LIZ(LJIILJJIL, requireContext, invoke, str2, LJII, LJII2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x05dc, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L92;
     */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y80(X.InterfaceC55235Lm3 r28, com.ss.android.ugc.aweme.feed.model.Aweme r29, X.JMS r30) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.services.TopMixNavigateAbilityImpl.y80(X.Lm3, com.ss.android.ugc.aweme.feed.model.Aweme, X.JMS):void");
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$NavigateAbility
    public final void su(InterfaceC55235Lm3 vScope, Context context, User user, String str) {
        o.LJIIIZ(vScope, "vScope");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        o.LJIIIIZZ(buildRoute, "buildRoute(context, Constants.URL_USER_PROFILE)");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("enter_from", "general_search");
        buildRoute.withParam("previous_page", "general_search");
        buildRoute.withParam("extra_from_pre_page", "general_search");
        buildRoute.withParam("extra_from_event_enter_from", "general_search");
        buildRoute.withParam("enter_from_request_id", user.getRequestId());
        buildRoute.withParam("extra_previous_page_position", "main_head");
        buildRoute.withParam("enter_method", JNW.LIZIZ(((ISearchContextAbility) C55096Ljo.LIZIZ(vScope, ISearchContextAbility.class)).If().LIZJ().LJLJJI));
        buildRoute.withParam("search_request_id", user.getRequestId());
        buildRoute.withParam("sticky_content", CardStruct.IStatusCode.DEFAULT);
        buildRoute.withParam("trackParams", str);
        if (!TextUtils.isEmpty(null)) {
            buildRoute.withParam("from_scene", (String) null);
        }
        C50948Jz6 LJJLIIIJLJLI = Z9N.LIZIZ.LJJLIIIJLJLI();
        if (LJJLIIIJLJLI != null && LJJLIIIJLJLI.getSourcePage() != null) {
            buildRoute.withParam("source_page", LJJLIIIJLJLI.getSourcePage());
        }
        buildRoute.open();
    }
}
