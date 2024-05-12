package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C221018lt;
import X.C76800UCe;
import X.M5X;
import X.OSZ;
import X.X1D;
import android.content.Intent;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProfileFollowerListAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public String getTargetPageName() {
        return "profile_follower_list";
    }

    @Override // X.AbstractC54344LUm, com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
        C221018lt.LJFF("ProfileFollowerListAction", "onSuccess");
        super.onSuccess(intent);
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("before build inner url = ");
        LIZ.append(outerUrl);
        LIZ.append(" , ");
        LIZ.append(originalQueryMap);
        C221018lt.LJFF("ProfileFollowerListAction", X1D.LIZIZ(LIZ));
        Object obj = originalQueryMap.get("push_uids");
        if (obj == null) {
            obj = "";
        }
        originalQueryMap.put("notice_uids", obj);
        originalQueryMap.put("enter_from", "push");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("after build inner url = ");
        LIZ2.append(outerUrl);
        LIZ2.append(" , ");
        LIZ2.append(originalQueryMap);
        C221018lt.LJFF("ProfileFollowerListAction", X1D.LIZIZ(LIZ2));
        return new OSZ<>("//profile/followerlist", originalQueryMap);
    }
}
