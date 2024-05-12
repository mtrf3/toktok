package com.bytedance.android.live.rank.impl.list.controller;

import X.BZI;
import X.C0JU;
import X.C221108m2;
import X.C28246B6s;
import X.C28652BMi;
import X.C28787BRn;
import X.C28835BTj;
import X.C29049Baf;
import X.C29306Beo;
import X.C62822Ol8;
import X.C73943T0h;
import X.C77934UiI;
import X.C77942UiQ;
import X.C78020Ujg;
import X.CN1;
import X.EnumC31514CYk;
import X.InterfaceC77939UiN;
import X.InterfaceC77992UjE;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.rank.impl.list.controller.base.IBaseController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RankRootController extends IBaseController {
    public final Fragment LJLILLLLZI;
    public final C77934UiI LJLJI;
    public InterfaceC77939UiN LJLJJI;
    public InterfaceC77992UjE LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final RankRootViewModel LIZIZ() {
        return (RankRootViewModel) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final RankRootViewModel LIZ() {
        return LIZIZ();
    }

    public final void LIZLLL(C78020Ujg rankFAQItem) {
        Uri tempUri;
        String queryParameter;
        Object obj;
        Long l;
        String str;
        o.LJIIIZ(rankFAQItem, "rankFAQItem");
        String str2 = "1";
        if (rankFAQItem.LIZ.LIZ == EnumC31514CYk.E_COMMERCE) {
            C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
            BZI LIZ = C28787BRn.LIZ("livesdk_tiktokec_sale_rank_rule_click");
            LIZ.LJIIZILJ();
            if (LIZIZ().LJLJI) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(obj, "is_self");
            LIZ.LJIJJ(Long.valueOf(C28652BMi.LIZ(rankFAQItem.LIZ.LIZIZ.type, false)), "author_rank");
            if (c28246B6s != null) {
                l = c28246B6s.LIZJ;
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "author_id");
            if (LIZIZ().LJLJJLL) {
                str = "last";
            } else {
                str = "this";
            }
            LIZ.LJIJJ(str, "rank_period");
            LIZ.LJIJJ("TEMAI", "EVENT_ORIGIN_FEATURE");
            LIZ.LJIJJ("live", "page_name");
            LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
            LIZ.LJJIIJZLJL();
        }
        if (TextUtils.isEmpty(rankFAQItem.LIZIZ) || (queryParameter = UriProtector.getQueryParameter((tempUri = UriProtector.parse(rankFAQItem.LIZIZ)), "url")) == null) {
            return;
        }
        boolean z = LIZIZ().LJLILLLLZI;
        Uri.Builder buildUpon = UriProtector.parse(queryParameter).buildUpon();
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        buildUpon.appendQueryParameter("landscape", str2);
        if (!z) {
            buildUpon.appendQueryParameter("trait_mode", "dark");
        }
        o.LJIIIIZZ(tempUri, "tempUri");
        String builder = buildUpon.toString();
        o.LJIIIIZZ(builder, "realUri.toString()");
        Uri LJJIJL = C29306Beo.LJJIJL(tempUri, "url", builder);
        InterfaceC77939UiN interfaceC77939UiN = this.LJLJJI;
        if (interfaceC77939UiN != null) {
            interfaceC77939UiN.Id(LJJIJL);
        }
    }

    public RankRootController(Fragment fragment, C77934UiI c77934UiI) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLILLLLZI = fragment;
        this.LJLJI = c77934UiI;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 178));
    }

    public final void LIZJ(Context context, C77942UiQ rankEntranceItem) {
        o.LJIIIZ(rankEntranceItem, "rankEntranceItem");
        if (context != null) {
            InterfaceC77939UiN interfaceC77939UiN = this.LJLJJI;
            if (interfaceC77939UiN != null) {
                interfaceC77939UiN.dismiss();
            }
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, UriProtector.parse(rankEntranceItem.LIZIZ.schema));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo r15, X.C77935UiJ r16) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.controller.RankRootController.LJ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo, X.UiJ):void");
    }

    public static void LJFF(boolean z, RankListV2Response.RankInfo rankInfo, boolean z2, String str) {
        String str2;
        String str3;
        UserProfileEvent userProfileEvent = new UserProfileEvent(rankInfo.user);
        userProfileEvent.mReportType = "report_anchor";
        userProfileEvent.roomId = rankInfo.roomId;
        userProfileEvent.mSource = str;
        userProfileEvent.coHostEnable = z2;
        userProfileEvent.currentHasMultiCoHostPermission = ((IInteractService) CN1.LIZ(IInteractService.class)).ZQ();
        userProfileEvent.linkInRoomEnable = false;
        LinkedHashMap LIZ = C0JU.LIZ("click_user_position", str);
        LIZ.put("click_anchor_rank", String.valueOf(rankInfo.rank));
        if (rankInfo.roomId > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.put("is_live", str2);
        if (z) {
            str3 = "last";
        } else {
            str3 = "this";
        }
        LIZ.put("rank_period", str3);
        userProfileEvent.mRankInfo = LIZ;
        userProfileEvent.setEnterFromRankList(Boolean.TRUE);
        userProfileEvent.clickModule = "weekly_rank";
        C73943T0h.LIZ().LIZIZ(userProfileEvent);
    }
}
