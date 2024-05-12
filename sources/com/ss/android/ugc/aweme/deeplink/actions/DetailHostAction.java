package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C47261Igj;
import X.C55837Lvl;
import X.C76800UCe;
import X.M5K;
import X.M5X;
import X.M62;
import X.OSZ;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DetailHostAction extends AbstractC54341LUj<C76800UCe> {
    public boolean shouldInsertFeed;

    @Override // X.AbstractC54341LUj
    public ArrayList<Integer> getFlags() {
        if (this.shouldInsertFeed) {
            return C47261Igj.LJII(268435456, 67108864);
        }
        return super.getFlags();
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        String str;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        Uri originalUri = UriProtector.parse(outerUrl);
        HashMap hashMap = new HashMap();
        String queryParameter = UriProtector.getQueryParameter(originalUri, "share_comment_id");
        String queryParameter2 = UriProtector.getQueryParameter(originalUri, "id");
        Object obj = "";
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        Object obj2 = deepLinkData.LJLJJL.get("from_token");
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = deepLinkData.LJLJJL.get("is_from_notification");
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        if (TextUtils.isEmpty(str2)) {
            str = "web";
        } else {
            str = str2;
        }
        o.LJIIIIZZ(originalUri, "originalUri");
        String str3 = "aweme://detail";
        if (C55837Lvl.LJI(originalUri, queryParameter2)) {
            Object obj4 = originalQueryMap.get("enter_from");
            Object obj5 = originalQueryMap.get("id");
            Object obj6 = originalQueryMap.get("commentId");
            if (obj5 == null) {
                obj5 = "";
            }
            hashMap.put("id", obj5);
            hashMap.put("video_from", "STORY_ENTRANCE_DEFAULT");
            hashMap.put("refer", "web");
            if (obj4 == null) {
                obj4 = "";
            }
            hashMap.put("enter_from", obj4);
            hashMap.put("story type", "1");
            if (C55837Lvl.LJFF(originalUri, "utm_campaign", "client_share") || C55837Lvl.LJFF(originalUri, "utm_campaign", "client_scan_code")) {
                Boolean bool = Boolean.TRUE;
                hashMap.put("share_expose_sharer", bool);
                String LIZJ = C55837Lvl.LIZJ(originalUri);
                if (LIZJ == null) {
                    LIZJ = "";
                }
                hashMap.put("userid", LIZJ);
                hashMap.put("is_from_story_client_share", bool);
            }
            if (obj6 != null) {
                obj = obj6;
            }
            hashMap.put("cid", obj);
            if (!M5K.LIZJ()) {
                SmartRouter.buildRoute(deepLinkData.LJLIL, "//main").open();
            }
        } else {
            boolean LJIIIZ = M5K.LJIIIZ(originalUri);
            boolean LJII = C55837Lvl.LJII(originalUri, booleanValue, queryParameter2, M5K.LJI(), LJIIIZ);
            this.shouldInsertFeed = LJII;
            if (LJII) {
                C55837Lvl.LIZLLL(queryParameter2, hashMap);
                str3 = "aweme://main";
            }
            C55837Lvl.LIZ(originalUri, hashMap, booleanValue);
            hashMap.put("refer", str);
            hashMap.put("from_token", str2);
            Object obj7 = originalQueryMap.get("id");
            if (obj7 == null) {
                obj7 = "";
            }
            hashMap.put("id", obj7);
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put("cid", String.valueOf(queryParameter));
            }
            if (C55837Lvl.LJFF(originalUri, "jump_to_search_detail", "1") && !this.shouldInsertFeed && LJIIIZ) {
                M5K.LIZIZ(originalUri, hashMap);
            }
            M62.LIZIZ.LIZIZ(originalUri, "detail", booleanValue);
        }
        return new OSZ<>(str3, hashMap);
    }
}
