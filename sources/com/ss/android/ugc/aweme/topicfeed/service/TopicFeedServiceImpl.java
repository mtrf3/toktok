package com.ss.android.ugc.aweme.topicfeed.service;

import X.ActivityC45651qj;
import X.C53772L8m;
import X.C53774L8o;
import X.C55096Ljo;
import X.C55230Lly;
import X.C58096Mr6;
import X.EnumC53808L9w;
import X.InterfaceC55058LjC;
import X.KMP;
import X.X1D;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.ITopicFeedService;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import ujb.o;

/* loaded from: classes10.dex */
public final class TopicFeedServiceImpl implements ITopicFeedService {
    public final HashMap<String, Integer> LIZ = new HashMap<>();

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean E1(int i) {
        switch (i) {
            case 50:
            case 51:
            case 52:
            case 53:
                return true;
            default:
                return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final String M1(int i) {
        switch (i) {
            case 50:
                return "Topic0";
            case 51:
                return "Topic1";
            case 52:
                return "Topic2";
            case 53:
                return "Topic3";
            default:
                return "";
        }
    }

    public static ITopicFeedService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ITopicFeedService.class, false);
        if (LIZ != null) {
            return (ITopicFeedService) LIZ;
        }
        if (C58096Mr6.C7 == null) {
            synchronized (ITopicFeedService.class) {
                if (C58096Mr6.C7 == null) {
                    C58096Mr6.C7 = new TopicFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.C7;
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean D1() {
        C53774L8o.LIZ.getClass();
        return C53774L8o.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void C1() {
        Fragment Ja;
        HomeViewPagerAbility homeViewPagerAbility;
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack != null) {
            for (Activity activity : activityStack) {
                if ((activity instanceof InterfaceC55058LjC) && (Ja = Hox.LJLLI.LIZ((ActivityC45651qj) activity).Ja("HOME")) != null && (homeViewPagerAbility = (HomeViewPagerAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(Ja, null), HomeViewPagerAbility.class, null)) != null) {
                    homeViewPagerAbility.C1();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean F1(String str) {
        return o.LJJJLIIL(str, "Topic", false);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean G1(String fragmentIdentifier) {
        kotlin.jvm.internal.o.LJIIIZ(fragmentIdentifier, "fragmentIdentifier");
        return o.LJJJLIIL(fragmentIdentifier, "TopicFeedFragment", false);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final int H1(String eventType) {
        kotlin.jvm.internal.o.LJIIIZ(eventType, "eventType");
        Integer num = this.LIZ.get(eventType);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void I1(HashMap<String, String> hashMap) {
        C53774L8o.LIZ.getClass();
        int i = C53774L8o.LJI;
        for (int i2 = 0; i2 < i; i2++) {
            String LJ = KMP.LJ("Topic", i2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("homepage_topic_");
            C53774L8o.LIZ.getClass();
            LIZ.append(C53774L8o.LIZIZ(i2).eventTrackingName);
            String LIZIZ = X1D.LIZIZ(LIZ);
            hashMap.put(LJ, LIZIZ);
            this.LIZ.put(LIZIZ, Integer.valueOf(C53774L8o.LIZIZ(i2).topicFeedId + 300));
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final boolean J1(String str) {
        if (str == null) {
            return false;
        }
        return o.LJJJLIIL(str, "homepage_topic", false);
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final void K1(HashMap<String, String> hashMap) {
        C53774L8o.LIZ.getClass();
        int i = C53774L8o.LJI;
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Topic");
            LIZ.append(i2);
            hashMap.put(X1D.LIZIZ(LIZ), "enter_topic_tab");
        }
    }

    @Override // com.ss.android.ugc.aweme.ITopicFeedService
    public final Object L1(Object key) {
        kotlin.jvm.internal.o.LJIIIZ(key, "key");
        if (key instanceof EnumC53808L9w) {
            return new C53772L8m((EnumC53808L9w) key);
        }
        return null;
    }
}
