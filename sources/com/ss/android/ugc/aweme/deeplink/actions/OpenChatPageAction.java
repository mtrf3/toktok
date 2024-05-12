package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C47261Igj;
import X.C76800UCe;
import X.InterfaceC55058LjC;
import X.M5X;
import X.OSZ;
import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class OpenChatPageAction extends AbstractC54341LUj<C76800UCe> {
    @Override // X.AbstractC54341LUj
    public ArrayList<Integer> getFlags() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activityStack, "getActivityStack()");
        if (isHotStart(activityStack)) {
            return C47261Igj.LJII(67108864, 268435456);
        }
        return null;
    }

    private final boolean isHotStart(Activity[] activityArr) {
        for (Activity activity : activityArr) {
            if (activity instanceof InterfaceC55058LjC) {
                if (activity == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        originalQueryMap.put("tab", 1);
        return new OSZ<>("aweme://main", originalQueryMap);
    }
}
