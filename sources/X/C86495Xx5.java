package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.idl.LiveInnerPushApi;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.HashMap;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.Xx5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86495Xx5 extends C112554bL implements InterfaceC86486Xww {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC86486Xww
    public final int[] LIZ() {
        return new int[]{22};
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC86486Xww
    public final C119904nC LJ(C86507XxH c86507XxH, InnerPushMessage innerPushMessage) {
        return null;
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    public C86495Xx5() {
        C86506XxG.LJ(this, new int[]{22});
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LIZJ(InnerPushMessage innerPushMessage) {
        String globalSchemaUrl;
        long optLong;
        String str;
        if (innerPushMessage == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onInnerPushShow message:");
        LIZ2.append(innerPushMessage);
        C86478Xwo.LIZ("LiveHandler", X1D.LIZIZ(LIZ2));
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (globalSchemaUrl = uiTemplate.getGlobalSchemaUrl()) != null) {
            boolean z = false;
            Boolean valueOf = Boolean.valueOf(o.LJJJLIIL(globalSchemaUrl, "sslocal://live", false));
            if (valueOf != null) {
                z = valueOf.booleanValue();
            }
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            String LJFF = C57421MgD.LJFF(globalSchemaUrl);
            String LIZIZ = C57421MgD.LIZIZ(globalSchemaUrl);
            String LJ = C57421MgD.LJ(globalSchemaUrl);
            String LIZJ = C57421MgD.LIZJ(globalSchemaUrl);
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(globalSchemaUrl), "is_subscribe");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", "inner_push");
            c188727au.LJIIIZ("enter_from_merge", "inner_push");
            c188727au.LJIIIZ("room_id", LJFF);
            c188727au.LJIIIZ("inner_push_type", LJ);
            c188727au.LJIIIZ("anchor_id", LIZIZ);
            c188727au.LJIIIZ("gd_label", LIZJ);
            c188727au.LJIIIZ("is_subscribe", queryParameter);
            c188727au.LJIIIZ("action_type", "click");
            C67142kI.LIZIZ(c188727au, "");
            if (z) {
                C78688UuS.LJJJJZ(c188727au.LIZ);
            } else {
                FMX.LJIIL("livesdk_anchor_push_show", c188727au.LIZ);
            }
            String LJFF2 = C57421MgD.LJFF(globalSchemaUrl);
            String LIZIZ2 = C57421MgD.LIZIZ(globalSchemaUrl);
            String LIZJ2 = C57421MgD.LIZJ(globalSchemaUrl);
            String valueOf2 = String.valueOf(innerPushMessage.getId());
            HashMap LIZLLL = C57421MgD.LIZLLL(innerPushMessage);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("rule_id", valueOf2);
            c188727au2.LJIIIZ("push_label", LIZJ2);
            c188727au2.LJIIIZ("push_channel", "Android");
            c188727au2.LJIIIZ("room_id", LJFF2);
            c188727au2.LJIIIZ("business_tag", "Live");
            c188727au2.LJIIIZ("anchor_id", LIZIZ2);
            c188727au2.LJIIIZ("o_url", globalSchemaUrl);
            c188727au2.LJIIIZ("user_id", curUserId);
            c188727au2.LJIIIIZZ(LIZLLL);
            FMX.LJIIL("inner_push_show", c188727au2.LIZ);
            LiveInnerPushApi liveInnerPushApi = LCI.LIZ;
            Long valueOf3 = Long.valueOf(System.currentTimeMillis() / 1000);
            Long valueOf4 = Long.valueOf(innerPushMessage.getId());
            String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
            if (bizExtraJsonStr == null) {
                optLong = 0;
            } else {
                optLong = new JSONObject(bizExtraJsonStr).optLong("group_id");
            }
            Long valueOf5 = Long.valueOf(optLong);
            String LIZJ3 = C57421MgD.LIZJ(globalSchemaUrl);
            if (innerPushMessage.getFrom() == EnumC86508XxI.FROM_FRONTIER) {
                str = "frontier";
            } else {
                str = "gcm";
            }
            liveInnerPushApi.reportLiveInnerPush(valueOf3, valueOf4, valueOf5, LIZJ3, globalSchemaUrl, str);
        }
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || createIUserServicebyMonsterPlugin.isLogin()) {
            return false;
        }
        return true;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJI(InnerPushMessage innerPushMessage) {
        String globalSchemaUrl;
        boolean z;
        String str;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onInnerPushClick message:");
        LIZ2.append(innerPushMessage);
        C86478Xwo.LIZ("LiveHandler", X1D.LIZIZ(LIZ2));
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (globalSchemaUrl = uiTemplate.getGlobalSchemaUrl()) != null) {
            Boolean valueOf = Boolean.valueOf(o.LJJJLIIL(globalSchemaUrl, "sslocal://live", false));
            if (valueOf != null) {
                z = valueOf.booleanValue();
            } else {
                z = false;
            }
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            String LJFF = C57421MgD.LJFF(globalSchemaUrl);
            String LIZIZ = C57421MgD.LIZIZ(globalSchemaUrl);
            String LJ = C57421MgD.LJ(globalSchemaUrl);
            String LIZJ = C57421MgD.LIZJ(globalSchemaUrl);
            if (!z) {
                str = "livesdk_anchor_push_click";
            } else {
                str = "livesdk_click_push";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("inner_push_type", LJ);
            c188727au.LJIIIZ("enter_method", "inner_push");
            c188727au.LJIIIZ("enter_from_merge", "inner_push");
            c188727au.LJIIIZ("room_id", LJFF);
            c188727au.LJIIIZ("anchor_id", LIZIZ);
            c188727au.LJIIIZ("gd_label", LIZJ);
            C67142kI.LIZIZ(c188727au, "");
            FMX.LJIIL(str, c188727au.LIZ);
            C57421MgD.LJI(C57421MgD.LJFF(globalSchemaUrl), C57421MgD.LIZIZ(globalSchemaUrl), "others", C57421MgD.LJ(globalSchemaUrl), z, C57421MgD.LIZJ(globalSchemaUrl));
            String LJFF2 = C57421MgD.LJFF(globalSchemaUrl);
            String LIZIZ2 = C57421MgD.LIZIZ(globalSchemaUrl);
            String LIZJ2 = C57421MgD.LIZJ(globalSchemaUrl);
            String valueOf2 = String.valueOf(innerPushMessage.getId());
            HashMap LIZLLL = C57421MgD.LIZLLL(innerPushMessage);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("rule_id", valueOf2);
            c188727au2.LJIIIZ("push_label", LIZJ2);
            c188727au2.LJIIIZ("push_channel", "Android");
            c188727au2.LJIIIZ("room_id", LJFF2);
            c188727au2.LJIIIZ("anchor_id", LIZIZ2);
            c188727au2.LJIIIZ("business_tag", "Live");
            c188727au2.LJIIIZ("o_url", globalSchemaUrl);
            c188727au2.LJIIIZ("user_id", curUserId);
            c188727au2.LJIIIIZZ(LIZLLL);
            FMX.LJIIL("inner_push_click", c188727au2.LIZ);
        }
    }

    @Override // X.InterfaceC86486Xww
    public final boolean LJIIIIZZ(InnerPushMessage message) {
        kotlin.jvm.internal.o.LJIIIZ(message, "message");
        if (AV1.LJIIJJI()) {
            return false;
        }
        return true;
    }

    @Override // X.C112554bL, X.InterfaceC86533Xxh
    public final void LJII(InnerPushMessage innerPushMessage, boolean z, String str) {
        String globalSchemaUrl;
        String str2;
        Integer num;
        String str3 = str;
        if (innerPushMessage == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onInnerPushDismiss message:");
        LIZ2.append(innerPushMessage);
        C86478Xwo.LIZ("LiveHandler", X1D.LIZIZ(LIZ2));
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (globalSchemaUrl = uiTemplate.getGlobalSchemaUrl()) != null) {
            boolean z2 = false;
            Boolean valueOf = Boolean.valueOf(o.LJJJLIIL(globalSchemaUrl, "sslocal://live", false));
            if (valueOf != null) {
                z2 = valueOf.booleanValue();
            }
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            if (str3 == null) {
                if (z) {
                    str3 = "draw";
                } else {
                    str3 = "others";
                }
            }
            if (z) {
                str2 = "slide_up";
            } else {
                str2 = "auto";
            }
            C57421MgD.LJI(C57421MgD.LJFF(globalSchemaUrl), C57421MgD.LIZIZ(globalSchemaUrl), str3, C57421MgD.LJ(globalSchemaUrl), z2, C57421MgD.LIZJ(globalSchemaUrl));
            String LJFF = C57421MgD.LJFF(globalSchemaUrl);
            String LIZIZ = C57421MgD.LIZIZ(globalSchemaUrl);
            String LIZJ = C57421MgD.LIZJ(globalSchemaUrl);
            String valueOf2 = String.valueOf(innerPushMessage.getId());
            InnerPushConfig config = innerPushMessage.getConfig();
            if (config != null) {
                num = Integer.valueOf(config.getPopupDurationSeconds() * 1000);
            } else {
                num = null;
            }
            String valueOf3 = String.valueOf(num);
            HashMap LIZLLL = C57421MgD.LIZLLL(innerPushMessage);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("rule_id", valueOf2);
            c188727au.LJIIIZ("push_label", LIZJ);
            c188727au.LJIIIZ("push_channel", "Android");
            c188727au.LJIIIZ("room_id", LJFF);
            c188727au.LJIIIZ("anchor_id", LIZIZ);
            c188727au.LJIIIZ("item_type", "Live");
            c188727au.LJIIIZ("o_url", globalSchemaUrl);
            c188727au.LJIIIZ("user_id", curUserId);
            c188727au.LJIIIZ("duration", valueOf3);
            c188727au.LJIIIZ("action_type", str2);
            c188727au.LJIIIIZZ(LIZLLL);
            FMX.LJIIL("inner_push_disappear", c188727au.LIZ);
        }
    }
}
