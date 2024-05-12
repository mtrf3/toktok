package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ug.config.DynamicResource;
import com.ss.android.ugc.aweme.ug.dynamicresource.BackgroundTask;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig;
import com.ss.android.ugc.aweme.ug.dynamicresource.IdleTask;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FTl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC39029FTl<V> implements Callable {
    public static final CallableC39029FTl<V> LJLIL = new CallableC39029FTl<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Iterator it = ((LinkedHashMap) C35611DyJ.LIZ).entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                DynamicResource[] dynamicResourceArr = (DynamicResource[]) SettingsManager.LIZLLL().LJIIIIZZ("ug_dynamic_resource_list", DynamicResource[].class, C39031FTn.LIZ);
                if (dynamicResourceArr == null || dynamicResourceArr.length == 0) {
                    ConcurrentHashMap<String, C82803Wed<?>> concurrentHashMap = C82802Wec.LIZIZ;
                    Object obj = concurrentHashMap.get(entry.getKey());
                    Object obj2 = obj;
                    if (obj == null) {
                        IDynamicResourceConfig config = (IDynamicResourceConfig) entry.getValue();
                        o.LJIIIZ(config, "config");
                        C82803Wed c82803Wed = new C82803Wed(config.key(), config.type(), "", config.priority(), "", 0, config.enable(), config.fallback());
                        c82803Wed.LIZJ();
                        obj2 = c82803Wed;
                    }
                    concurrentHashMap.put(entry.getKey(), obj2);
                } else {
                    try {
                        for (DynamicResource dynamicResource : dynamicResourceArr) {
                            if (o.LJ(dynamicResource.key, entry.getKey())) {
                                ConcurrentHashMap<String, C82803Wed<?>> concurrentHashMap2 = C82802Wec.LIZIZ;
                                C82803Wed<?> c82803Wed2 = concurrentHashMap2.get(dynamicResource.key);
                                if (c82803Wed2 == null || !o.LJ(c82803Wed2.LJLJJL, dynamicResource.hash)) {
                                    c82803Wed2 = C39030FTm.LIZ((IDynamicResourceConfig) entry.getValue(), dynamicResource);
                                }
                                concurrentHashMap2.put(dynamicResource.key, c82803Wed2);
                                C82802Wec.LIZJ.add(c82803Wed2);
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                        break;
                    } catch (NoSuchElementException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            } else {
                C82802Wec.LIZ.getClass();
                if (C82802Wec.LIZLLL) {
                    C82802Wec.LIZLLL = false;
                    C82802Wec.LJIILIIL("boot_finish_miss");
                }
                if (!C82802Wec.LJ) {
                    C36093EEn.LIZ.getClass();
                    C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                    LJIIIZ.LIZIZ(new BackgroundTask(), true);
                    LJIIIZ.LIZIZ(new IdleTask(), true);
                    LJIIIZ.LIZJ();
                }
                C82802Wec.LJ = true;
                return C76800UCe.LIZ;
            }
        }
    }
}
