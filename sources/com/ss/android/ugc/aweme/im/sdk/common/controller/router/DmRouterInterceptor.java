package com.ss.android.ugc.aweme.im.sdk.common.controller.router;

import X.C00F;
import X.C100723xM;
import X.C16880lQ;
import X.C38350F3i;
import X.C45804HyK;
import X.C62712d9;
import X.C98603tw;
import X.C98663u2;
import X.C98673u3;
import X.HG3;
import X.INB;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.util.Util;
import com.ss.android.ugc.aweme.account.PreLoginHandleService;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DmRouterInterceptor implements IInterceptor {
    public static String LJLIL = "";
    public static long LJLILLLLZI;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        return o.LJ("chat", str);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        String str;
        Long l;
        Integer num;
        Long l2;
        String conversationId;
        Integer messagePreviewEnabled;
        Activity LJIJJ;
        Integer LJJIL;
        Integer LJJIL2;
        Integer LJJIL3;
        Long LJJIZ;
        Integer LJJIL4;
        if (context != null && routeIntent != null) {
            String url = routeIntent.getUrl();
            o.LJIIIIZZ(url, "url");
            routeIntent.setUrl(ujb.o.LJJJJZ(url, "chat/center", "chat/center2", false));
            HG3.LJIIL();
            if (HG3.LJLJL.LJFF().isLogin() || !(context instanceof Activity)) {
                C98673u3.LIZ = System.currentTimeMillis();
                if (!C100723xM.LJFF && !C100723xM.LJI) {
                    i = 0;
                } else if (C100723xM.LJI) {
                    i = 1;
                } else {
                    i = 2;
                }
                C100723xM.LJ = i;
                C98663u2 c98663u2 = DMNavArg.Companion;
                Intent extra = routeIntent.getExtra();
                o.LJIIIIZZ(extra, "routeIntent.extra");
                c98663u2.getClass();
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(extra, "enter_from");
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(extra, "enter_method");
                String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(extra, "message_cnt");
                if (LLJJIJIIJIL3 != null && (LJJIL4 = C38350F3i.LJJIL(LLJJIJIIJIL3)) != null) {
                    i2 = LJJIL4.intValue();
                } else {
                    i2 = 0;
                }
                Integer valueOf = Integer.valueOf(i2);
                String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(extra, "notice_type");
                String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(extra, "im_group_invite_id");
                String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(extra, "conversation_id");
                String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(extra, "msg_id");
                if (LLJJIJIIJIL7 != null && (LJJIZ = C38350F3i.LJJIZ(LLJJIJIIJIL7)) != null) {
                    j = LJJIZ.longValue();
                } else {
                    j = 0;
                }
                String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(extra, "is_member_request");
                if (LLJJIJIIJIL8 != null && (LJJIL3 = C38350F3i.LJJIL(LLJJIJIIJIL8)) != null) {
                    i3 = LJJIL3.intValue();
                } else {
                    i3 = 0;
                }
                Integer valueOf2 = Integer.valueOf(i3);
                String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(extra, "chat_type");
                if (LLJJIJIIJIL9 != null && (LJJIL2 = C38350F3i.LJJIL(LLJJIJIIJIL9)) != null) {
                    i4 = LJJIL2.intValue();
                } else {
                    i4 = 0;
                }
                Integer valueOf3 = Integer.valueOf(i4);
                String LLJJIJIIJIL10 = C16880lQ.LLJJIJIIJIL(extra, "message_preview_enabled");
                if (LLJJIJIIJIL10 != null && (LJJIL = C38350F3i.LJJIL(LLJJIJIIJIL10)) != null) {
                    i5 = LJJIL.intValue();
                } else {
                    i5 = 0;
                }
                Integer valueOf4 = Integer.valueOf(i5);
                String LLJJIJIIJIL11 = C16880lQ.LLJJIJIIJIL(extra, "reply_to_message_content");
                if (LLJJIJIIJIL11 != null) {
                    str = Uri.decode(LLJJIJIIJIL11);
                } else {
                    str = null;
                }
                String LLJJIJIIJIL12 = C16880lQ.LLJJIJIIJIL(extra, "reply_to_message_server_id");
                if (LLJJIJIIJIL12 != null) {
                    l = C38350F3i.LJJIZ(LLJJIJIIJIL12);
                } else {
                    l = null;
                }
                String LLJJIJIIJIL13 = C16880lQ.LLJJIJIIJIL(extra, "reply_to_message_type");
                if (LLJJIJIIJIL13 != null) {
                    num = C38350F3i.LJJIL(LLJJIJIIJIL13);
                } else {
                    num = null;
                }
                String LLJJIJIIJIL14 = C16880lQ.LLJJIJIIJIL(extra, "reply_to_message_from_uid");
                if (LLJJIJIIJIL14 != null) {
                    l2 = C38350F3i.LJJIZ(LLJJIJIIJIL14);
                } else {
                    l2 = null;
                }
                DMNavArg dMNavArg = new DMNavArg(LLJJIJIIJIL, LLJJIJIIJIL2, valueOf, LLJJIJIIJIL4, LLJJIJIIJIL5, LLJJIJIIJIL6, j, valueOf2, valueOf3, valueOf4, str, l, num, l2);
                String url2 = routeIntent.getUrl();
                o.LJIIIIZZ(url2, "routeIntent.url");
                if (o.LJ(Util.sliceUrlParams(url2).get("enter_method"), "deeplink_email") || (conversationId = dMNavArg.getConversationId()) == null || conversationId.length() <= 0 || (messagePreviewEnabled = dMNavArg.getMessagePreviewEnabled()) == null || messagePreviewEnabled.intValue() != 1 || (C00F.LIZ(31744, 0, "dm_dev_out_app_push_to_chat_room_optimize_v2", true) != 1 && (C00F.LIZ(31744, 0, "dm_dev_out_app_push_to_chat_room_optimize_v2", true) != 2 || MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAppHot()))) {
                    if (INB.LIZIZ()) {
                        Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(context);
                        if (mainActivityIntent != null) {
                            mainActivityIntent.setFlags(67108864);
                            mainActivityIntent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                            mainActivityIntent.putExtras(routeIntent.getExtra());
                        } else {
                            mainActivityIntent = null;
                        }
                        C16880lQ.LIZJ(context, mainActivityIntent);
                        return true;
                    }
                } else {
                    if ((LJLIL.length() <= 0 || !o.LJ(LJLIL, dMNavArg.getConversationId()) || TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - LJLILLLLZI) >= 800) && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                        String conversationId2 = dMNavArg.getConversationId();
                        if (conversationId2 == null) {
                            conversationId2 = "";
                        }
                        LJLIL = conversationId2;
                        LJLILLLLZI = System.nanoTime();
                        new C98603tw(0).LIZIZ(LJIJJ, dMNavArg);
                    }
                    return true;
                }
            } else {
                C16880lQ.LIZJ(context, PreLoginHandleService.LIZIZ().LIZ((Activity) context, routeIntent.getExtra(), UriProtector.getQueryParameter(routeIntent.getUri(), "multi_account_push_uid")));
                return true;
            }
        }
        return false;
    }
}
