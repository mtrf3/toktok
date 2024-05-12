package com.ss.android.ugc.aweme.legoImpl.task;

import X.ActivityC45651qj;
import X.C35936E8m;
import X.C3SZ;
import X.C44271HZb;
import X.C54925Lh3;
import X.C78866UxK;
import X.C87277YNd;
import X.FMX;
import X.InterfaceC55058LjC;
import X.JEX;
import android.app.Activity;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ExitBackgroundManager implements JEX {
    public static final C54925Lh3 Companion = new C54925Lh3();
    public static boolean isActivityFinished;
    public final String eventName;

    public final String getEventName() {
        return this.eventName;
    }

    public ExitBackgroundManager(String eventName) {
        o.LJIIIZ(eventName, "eventName");
        this.eventName = eventName;
        ActivityStack.addAppBackGroundMobListener(this);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x003f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    private final String getEnterFrom(Activity activity) {
        Object obj;
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        String activityType = C44271HZb.LIZIZ.activityType(activity);
        if (activityType != null) {
            return activityType;
        }
        if (!(activity instanceof InterfaceC55058LjC)) {
            return "other";
        }
        if (activity instanceof ActivityC45651qj) {
            obj = activity;
        } else {
            obj = null;
        }
        if (obj != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI((ActivityC45651qj) activity)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null && LJIL.zW("page_profile")) {
            return "others_homepage";
        }
        String enterFrom = ((InterfaceC55058LjC) activity).getEnterFrom();
        if (enterFrom == null) {
            return "other";
        }
        switch (enterFrom.hashCode()) {
            case -2066577748:
                if (!enterFrom.equals("homepage_shop_mall")) {
                    return "other";
                }
                return "others_homepage";
            case -1842036323:
                if (!enterFrom.equals("homepage_fresh")) {
                    return "other";
                }
                return "others_homepage";
            case -1835469164:
                if (!enterFrom.equals("homepage_music")) {
                    return "other";
                }
                return "others_homepage";
            case -1829961372:
                if (!enterFrom.equals("homepage_story")) {
                    return "other";
                }
                return "others_homepage";
            case -1572049565:
                if (!enterFrom.equals("notification_page")) {
                    return "other";
                }
                return enterFrom;
            case -1289597002:
                if (!enterFrom.equals("homepage_familiar")) {
                    return "other";
                }
                return "others_homepage";
            case -1271119582:
                if (!enterFrom.equals("homepage_follow")) {
                    return "other";
                }
                return enterFrom;
            case -1051643920:
                if (!enterFrom.equals("homepage_nearby")) {
                    return "other";
                }
                return "others_homepage";
            case -562830579:
                if (!enterFrom.equals("personal_homepage")) {
                    return "other";
                }
                return enterFrom;
            case -460940408:
                if (!enterFrom.equals("homepage_popular")) {
                    return "other";
                }
                return "others_homepage";
            case -121207376:
                if (!enterFrom.equals("discovery")) {
                    return "other";
                }
                return enterFrom;
            case 384784128:
                if (!enterFrom.equals("homepage_fresh_feed")) {
                    return "other";
                }
                return "others_homepage";
            case 809483594:
                if (!enterFrom.equals("others_homepage")) {
                    return "other";
                }
                return enterFrom;
            case 1691937916:
                if (!enterFrom.equals("homepage_hot")) {
                    return "other";
                }
                return enterFrom;
            default:
                return "other";
        }
    }

    @Override // X.JEX
    public void onAppBackground(Activity activity) {
        int i;
        if (activity == null) {
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String enterFrom = getEnterFrom(activity);
        String awemeID = getAwemeID(activity, enterFrom);
        if (isActivityFinished) {
            i = 2;
        } else {
            i = 1;
        }
        isActivityFinished = false;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZJ("status", "enterbackground");
        c35936E8m.LIZJ("action_time", valueOf);
        if (enterFrom != null) {
            c35936E8m.LIZJ("enter_from", enterFrom);
        }
        if (awemeID != null) {
            c35936E8m.LIZJ("group_id", awemeID);
        }
        c35936E8m.LIZ(i, "action_type");
        Map<String, String> map = c35936E8m.LIZ;
        o.LJIIIIZZ(map, "newBuilder().apply {\n   …)\n            }.builder()");
        FMX.LJIIL(this.eventName, map);
    }

    private final String getAwemeID(Activity activity, String str) {
        ActivityC45651qj activityC45651qj;
        HomePageDataViewModel LIZ;
        Aweme aweme;
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1271119582) {
            if (hashCode != 809483594) {
                if (hashCode != 1691937916 || !str.equals("homepage_hot")) {
                    return null;
                }
            } else if (!str.equals("others_homepage")) {
                return null;
            }
        } else if (!str.equals("homepage_follow")) {
            return null;
        }
        if (!(activity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) activity) == null || (LIZ = C3SZ.LIZ(activityC45651qj)) == null || (aweme = LIZ.LJLJLLL) == null) {
            return null;
        }
        return aweme.getAid();
    }
}
