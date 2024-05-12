package com.ss.android.ugc.aweme.story.avatar;

import X.C16880lQ;
import X.C25620zW;
import X.C54790Les;
import X.C73098SmU;
import X.L7M;
import X.X1D;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AvatarEntryManager$register$1 implements GenericLifecycleObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Integer num;
        Integer num2;
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("target: ");
        LIZ.append((Object) null);
        LIZ.append(", views: ");
        LinkedHashMap linkedHashMap = (LinkedHashMap) C54790Les.LIZLLL;
        Set set = (Set) linkedHashMap.get(null);
        if (set != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        Set set2 = (Set) linkedHashMap.get(null);
        if (set2 != null) {
            for (Object ringLord : set2) {
                o.LJIIIZ(ringLord, "ringLord");
                if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
                    Map<L7M, String> map = C54790Les.LIZJ;
                    String str = (String) ((LinkedHashMap) map).get(ringLord);
                    if (str != null) {
                        StringBuilder LIZIZ = C25620zW.LIZIZ("unregister: uid: ", str, ", views: ");
                        Map<String, Set<L7M>> map2 = C54790Les.LIZIZ;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                        Set set3 = (Set) linkedHashMap2.get(str);
                        if (set3 != null) {
                            num2 = Integer.valueOf(set3.size());
                        } else {
                            num2 = null;
                        }
                        LIZIZ.append(num2);
                        LIZIZ.append(", contains target: ");
                        Set set4 = (Set) linkedHashMap2.get(str);
                        if (set4 != null) {
                            bool = Boolean.valueOf(set4.contains(ringLord));
                        } else {
                            bool = null;
                        }
                        LIZIZ.append(bool);
                        X1D.LIZIZ(LIZIZ);
                        Set set5 = (Set) linkedHashMap2.get(str);
                        if (set5 != null) {
                            set5.remove(ringLord);
                            if (set5.isEmpty()) {
                                map2.remove(str);
                            }
                        }
                        map.remove(ringLord);
                    }
                } else {
                    throw new IllegalAccessException("should unregister in main thread");
                }
            }
        }
        C54790Les.LIZLLL.remove(null);
    }
}
