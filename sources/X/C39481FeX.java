package X;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.FeX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39481FeX {
    public static final ConcurrentHashMap<String, List<C39480FeW>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentLinkedQueue<C39480FeW> LIZIZ = new ConcurrentLinkedQueue<>();

    public static C39484Fea LIZ(Intent intent, NavigationConfig navigationConfig) {
        ComponentName component;
        String className;
        Bundle LLJJIJI;
        if ((navigationConfig == null || navigationConfig.enableRouterRecord) && (component = intent.getComponent()) != null && (className = component.getClassName()) != null && className.hashCode() == 1231814645 && className.equals("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2") && (LLJJIJI = C16880lQ.LLJJIJI(intent)) != null) {
            if (LLJJIJI.containsKey("dl_from")) {
                return new C39484Fea(LLJJIJI.getString("dl_from", ""));
            }
            if (LLJJIJI.containsKey("in_app_enter_from")) {
                return new C39484Fea(LLJJIJI.getString("in_app_enter_from", ""));
            }
            if (LLJJIJI.containsKey("from_notification") && LLJJIJI.getBoolean("from_notification", false)) {
                return new C39484Fea("from_notification");
            }
        }
        return null;
    }

    public static void LIZIZ(Intent intent, Throwable th, NavigationConfig navigationConfig) {
        ComponentName component;
        String className;
        C39480FeW c39480FeW;
        C39480FeW c39480FeW2;
        List<String> list;
        List<String> list2;
        String str;
        if ((navigationConfig == null || navigationConfig.enable) && (component = intent.getComponent()) != null && (className = component.getClassName()) != null) {
            android.net.Uri data = intent.getData();
            PQ0 pq0 = PQ0.LJFF;
            o.LJIIIIZZ(pq0, "LifecycleMonitor.get()");
            String pageStack = pq0.LIZ.toString();
            String LIZ2 = C64401PPh.LIZ();
            String str2 = "";
            if (o.LJ(LIZ2, "null")) {
                LIZ2 = "";
            }
            C39483FeZ.LIZIZ.getClass();
            ConcurrentHashMap<String, List<String>> concurrentHashMap = C39483FeZ.LIZ;
            if (concurrentHashMap.containsKey(LIZ2) && (list = concurrentHashMap.get(LIZ2)) != null && list.size() == 1 && (list2 = concurrentHashMap.get(LIZ2)) != null && (str = (String) ORZ.LLFII(list2)) != null) {
                str2 = str;
            }
            ConcurrentHashMap<String, List<C39480FeW>> concurrentHashMap2 = LIZ;
            if (concurrentHashMap2.containsKey(className)) {
                List<C39480FeW> list3 = concurrentHashMap2.get(className);
                if (list3 != null) {
                    Iterator<C39480FeW> it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c39480FeW2 = it.next();
                            C39480FeW c39480FeW3 = c39480FeW2;
                            if (o.LJ(c39480FeW3.LJLIL, LIZ2) && o.LJ(c39480FeW3.LJLJJI, pageStack) && o.LJ(c39480FeW3.LJLILLLLZI, className)) {
                                break;
                            }
                        } else {
                            c39480FeW2 = null;
                            break;
                        }
                    }
                    c39480FeW = c39480FeW2;
                    if (c39480FeW != null) {
                        c39480FeW.LJLJL = th;
                        c39480FeW.LJLJI = str2;
                        c39480FeW.LJLJJL = C35997EAv.LIZ(data);
                        c39480FeW.LJLJJLL = LIZ(intent, navigationConfig);
                    }
                }
                o.LJIIIIZZ(pageStack, "pageStack");
                c39480FeW = new C39480FeW(LIZ2, className, str2, pageStack, C35997EAv.LIZ(data), LIZ(intent, navigationConfig), th);
                if (list3 != null) {
                    list3.add(c39480FeW);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                o.LJIIIIZZ(pageStack, "pageStack");
                c39480FeW = new C39480FeW(LIZ2, className, str2, pageStack, C35997EAv.LIZ(data), LIZ(intent, navigationConfig), th);
                arrayList.add(c39480FeW);
                concurrentHashMap2.put(className, arrayList);
            }
            if (navigationConfig != null && navigationConfig.enableRouterRecord) {
                if (o.LJ(c39480FeW.LJLIL, "com.ss.android.ugc.aweme.main.MainActivity")) {
                    Iterator<C39480FeW> it2 = LIZIZ.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C39480FeW next = it2.next();
                        if (i >= 0) {
                            if (o.LJ(next.LJLIL, c39480FeW.LJLIL)) {
                                if (i > 0) {
                                    LIZIZ.clear();
                                }
                            } else {
                                i++;
                            }
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                ConcurrentLinkedQueue<C39480FeW> concurrentLinkedQueue = LIZIZ;
                concurrentLinkedQueue.add(c39480FeW);
                if (concurrentLinkedQueue.size() > 6) {
                    concurrentLinkedQueue.poll();
                }
            }
        }
    }
}
