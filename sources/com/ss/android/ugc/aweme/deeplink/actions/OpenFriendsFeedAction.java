package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC54341LUj;
import X.C32I;
import X.C47261Igj;
import X.C53295Kvr;
import X.C54029LIj;
import X.C76800UCe;
import X.HG3;
import X.InterfaceC55058LjC;
import X.LGE;
import X.LIR;
import X.LWM;
import X.M5X;
import X.ORZ;
import X.OSZ;
import X.RBX;
import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class OpenFriendsFeedAction extends AbstractC54341LUj<C76800UCe> {
    public static final LIR Companion = new LIR();

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

    /* JADX WARN: Multi-variable type inference failed */
    private final void resolveFollowingInsertAwemeIds(HashMap<String, Object> hashMap) {
        String str;
        Object obj = hashMap.get("insert_ids");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            LWM lwm = LWM.LIZIZ;
            List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
            Iterator it = LJLJJL.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            lwm.LIZ.LIZIZ(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resolveFriendsInsertAwemeIds(HashMap<String, Object> hashMap) {
        String str;
        String str2;
        Object obj = hashMap.get("insert_ids");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
            Iterator it = LJLJJL.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            C54029LIj c54029LIj = C54029LIj.LIZIZ;
            c54029LIj.LIZ.LIZIZ(arrayList);
            Object obj2 = hashMap.get("insert_relation");
            if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
                c54029LIj.LIZ.LJIJI(str2, arrayList);
            }
        }
    }

    @Override // X.AbstractC54341LUj
    public OSZ<String, HashMap<String, Object>> buildInnerUrl(String outerUrl, HashMap<String, Object> originalQueryMap, M5X deepLinkData) {
        String str;
        Boolean bool;
        o.LJIIIZ(outerUrl, "outerUrl");
        o.LJIIIZ(originalQueryMap, "originalQueryMap");
        o.LJIIIZ(deepLinkData, "deepLinkData");
        if (C53295Kvr.LIZIZ()) {
            resolveFollowingInsertAwemeIds(originalQueryMap);
            originalQueryMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "Following");
        } else if (C53295Kvr.LIZJ()) {
            resolveFollowingInsertAwemeIds(originalQueryMap);
            originalQueryMap.put("tab", Integer.valueOf(LGE.FOLLOW.getValue()));
            originalQueryMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "Following");
        } else {
            String str2 = null;
            if (((RBX) HG3.LJIILL()).isLogin()) {
                C54029LIj c54029LIj = C54029LIj.LIZIZ;
                if (c54029LIj.LJJIZ()) {
                    resolveFriendsInsertAwemeIds(originalQueryMap);
                    Object obj = originalQueryMap.get("insert_asc");
                    if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                        c54029LIj.LJIIL(bool.booleanValue());
                    }
                    Activity[] activityStack = ActivityStack.getActivityStack();
                    o.LJIIIIZZ(activityStack, "getActivityStack()");
                    if (isHotStart(activityStack)) {
                        originalQueryMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
                        if (c54029LIj.LJJIJL()) {
                            originalQueryMap.put("tab", Integer.valueOf(LGE.FRIENDS.getValue()));
                        }
                    } else if (c54029LIj.LJJIJL()) {
                        originalQueryMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                        originalQueryMap.put("tab", Integer.valueOf(LGE.FRIENDS.getValue()));
                    } else {
                        originalQueryMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
                    }
                }
            }
            Object obj2 = originalQueryMap.get("insert_ids");
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            }
            if (str2 == null || (str = (String) ORZ.LJLLLLLL(0, s.LJLJJL(str2, new String[]{","}, 0, 6))) == null) {
                str = "";
            }
            if (str.length() > 0) {
                originalQueryMap.put("id", str);
                return new OSZ<>("//aweme/detail", originalQueryMap);
            }
        }
        originalQueryMap.put("enter_method", "push_landing");
        return new OSZ<>("//main", originalQueryMap);
    }
}
