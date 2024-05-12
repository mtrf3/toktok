package com.ss.android.ugc.aweme.search.arch.v2.docker.components.common;

import X.C48891JGt;
import X.C49133JQb;
import X.InterfaceC48888JGq;
import X.InterfaceC50155JmJ;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ComponentHelper {
    public static final Map<LifecycleOwner, ComponentHelper> LIZJ = new LinkedHashMap();
    public final Map<String, InterfaceC50155JmJ> LIZ = new LinkedHashMap();
    public final Map<String, ComponentInfo> LIZIZ = new LinkedHashMap();

    /* loaded from: classes9.dex */
    public static final class Companion {
        public static ComponentHelper LIZ(final LifecycleOwner owner) {
            o.LJIIIZ(owner, "owner");
            Map<LifecycleOwner, ComponentHelper> map = ComponentHelper.LIZJ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            linkedHashMap.get(owner);
            ComponentHelper componentHelper = (ComponentHelper) linkedHashMap.get(owner);
            if (componentHelper == null) {
                ComponentHelper componentHelper2 = new ComponentHelper();
                map.put(owner, componentHelper2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("add ");
                LIZ.append(componentHelper2);
                LIZ.append(" to ");
                LIZ.append(owner);
                LIZ.append(" and size is");
                LIZ.append(map.size());
                X1D.LIZIZ(LIZ);
                owner.getLifecycle().addObserver(new InterfaceC48888JGq() { // from class: com.ss.android.ugc.aweme.search.arch.v2.docker.components.common.ComponentHelper$Companion$get$1$1
                    @Override // X.InterfaceC48888JGq
                    public final void onDestroy() {
                        Map<LifecycleOwner, ComponentHelper> map2 = ComponentHelper.LIZJ;
                        ComponentHelper componentHelper3 = (ComponentHelper) ((LinkedHashMap) map2).get(LifecycleOwner.this);
                        if (componentHelper3 != null) {
                            ((LinkedHashMap) componentHelper3.LIZ).clear();
                            ((LinkedHashMap) componentHelper3.LIZIZ).clear();
                        }
                        map2.remove(LifecycleOwner.this);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("remove ");
                        LIZ2.append(componentHelper3);
                        LIZ2.append(" from ");
                        LIZ2.append(LifecycleOwner.this);
                        LIZ2.append(" and size is");
                        LIZ2.append(map2.size());
                        C49133JQb.LIZ("ComponentHelper", X1D.LIZIZ(LIZ2));
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                    public void onCreate() {
                        C48891JGt.onCreate(this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                    public void onPause() {
                        C48891JGt.onPause(this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                    public void onResume() {
                        C48891JGt.onResume(this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_START)
                    public void onStart() {
                        C48891JGt.onStart(this);
                    }

                    @Override // X.InterfaceC48888JGq
                    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                    public void onStop() {
                        C48891JGt.onStop(this);
                    }
                });
                return componentHelper2;
            }
            return componentHelper;
        }
    }
}
