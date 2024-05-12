package com.ss.android.ugc.aweme.framework.services;

import X.C28V;
import X.Q4K;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.plugin.PluginInstaller;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class ServiceManager {
    public final ConcurrentHashMap<Class<?>, Set<ServiceProvider<?>>> classServiceProviderConcurrentHashMap;
    public volatile boolean enableDynamicProxyDefault;
    public final Map<Class<?>, Map<String, ServiceProvider<?>>> groupServiceProviderConcurrentHashMap;
    public final Set<String> legacyServiceSet;
    public final Set<Class<?>> resolvedClasses;

    /* loaded from: classes11.dex */
    public static final class Holder {
        public static final ServiceManager INSTANCE = new ServiceManager();
    }

    public ServiceManager() {
        this.classServiceProviderConcurrentHashMap = new ConcurrentHashMap<>();
        this.groupServiceProviderConcurrentHashMap = Collections.synchronizedMap(new HashMap());
        this.legacyServiceSet = Q4K.LIZLLL();
        this.enableDynamicProxyDefault = true;
        this.resolvedClasses = Q4K.LIZLLL();
    }

    public static ServiceManager get() {
        return Holder.INSTANCE;
    }

    public Map<Class<?>, Map<String, ServiceProvider<?>>> getGroupServiceProviderMap() {
        return this.groupServiceProviderConcurrentHashMap;
    }

    public ConcurrentHashMap getServiceProviderMap() {
        return this.classServiceProviderConcurrentHashMap;
    }

    private <T> T getLegacyService(Class<T> cls) {
        if (!this.legacyServiceSet.contains(cls.getName())) {
            return null;
        }
        Iterator it = ConfigLoader.iterator(cls);
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    private void markResolved(Class cls) {
        this.resolvedClasses.add(cls);
    }

    public void addLegacyService(String str) {
        this.legacyServiceSet.add(str);
    }

    public boolean downgradeComponent(String str) {
        return downgradeComponent(str, false);
    }

    public <T> Set<T> getLegacyServices(Class<T> cls) {
        C28V c28v = (Set<T>) Collections.synchronizedSet(new LinkedHashSet());
        if (!this.legacyServiceSet.contains(cls.getName())) {
            return c28v;
        }
        Iterator it = ConfigLoader.iterator(cls);
        while (it.hasNext()) {
            c28v.add(it.next());
        }
        return c28v;
    }

    public <T> T getService(Class<T> cls) {
        return (T) getService(cls, false);
    }

    public <T> T getServiceForReal(Class<T> cls) {
        return (T) getService(cls, false, this.enableDynamicProxyDefault, true);
    }

    public <T> Set<T> getServices(Class<T> cls) {
        return getServices(cls, false);
    }

    public boolean onPluginInstall(String str) {
        return PluginInstaller.INSTANCE.onPluginInstall(str);
    }

    public void setDynamicProxyEnableDefault(boolean z) {
        this.enableDynamicProxyDefault = z;
    }

    public void addLegacyService(Set<String> set) {
        this.legacyServiceSet.addAll(set);
    }

    public <T> Binding bind(Class<T> cls, ServiceProvider<T> serviceProvider) {
        return new Binding(this, cls, serviceProvider);
    }

    public <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider) {
        bindDowngradeImpl(cls, serviceProvider, true);
    }

    public boolean downgradeComponent(String str, boolean z) {
        if (!z) {
            Map<String, String> map = DowngradeImplManager.getInstance().componentsMap;
            for (String str2 : map.keySet()) {
                if (this.resolvedClasses.contains(str2) && TextUtils.equals(map.get(str2), str)) {
                    return false;
                }
            }
        }
        DowngradeImplManager.getInstance().downgradeComponent(str);
        return true;
    }

    public <T> T getService(Class<T> cls, boolean z) {
        return (T) getService(cls, z, this.enableDynamicProxyDefault);
    }

    public <T> T getServiceByGroup(Class<T> cls, String str) {
        Map<String, ServiceProvider<?>> map = this.groupServiceProviderConcurrentHashMap.get(cls);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (T) map.get(str).get();
    }

    public <T> Set<T> getServices(Class<T> cls, boolean z) {
        Set<T> staticServiceImplSet;
        Set<ServiceProvider<?>> set = this.classServiceProviderConcurrentHashMap.get(cls);
        if (set == null || set.isEmpty()) {
            Set<T> staticServiceImplSet2 = StaticServiceImplManager.getInstance().getStaticServiceImplSet(cls);
            if (staticServiceImplSet2 != null && !staticServiceImplSet2.isEmpty()) {
                return staticServiceImplSet2;
            }
            return getLegacyServices(cls);
        }
        C28V c28v = (Set<T>) Collections.synchronizedSet(new LinkedHashSet());
        Iterator<ServiceProvider<?>> it = set.iterator();
        while (it.hasNext()) {
            c28v.add(it.next().get());
        }
        if (z && (staticServiceImplSet = StaticServiceImplManager.getInstance().getStaticServiceImplSet(cls)) != null && !staticServiceImplSet.isEmpty()) {
            c28v.addAll(staticServiceImplSet);
        }
        return c28v;
    }

    public <T> GroupBinding bind(Class<T> cls, String str, ServiceProvider<T> serviceProvider) {
        return new GroupBinding(this.groupServiceProviderConcurrentHashMap, cls, str, serviceProvider);
    }

    public <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider, boolean z) {
        if (z) {
            serviceProvider = new SingletonProvider(serviceProvider);
        }
        DowngradeImplManager.getInstance().bindDowngradeImpl(cls, serviceProvider);
    }

    public <T> T getService(Class<T> cls, boolean z, boolean z2) {
        return (T) getService(cls, z, z2, false);
    }

    public <T> T getService(Class<T> cls, boolean z, boolean z2, boolean z3) {
        boolean z4;
        T t;
        if (!z3 && DowngradeImplManager.getInstance().isServiceForceDowngrade(cls)) {
            T t2 = (T) DowngradeImplManager.getInstance().getDowngradeImpl(cls);
            if (t2 != null) {
                return t2;
            }
            z4 = true;
        } else {
            z4 = false;
        }
        Set<ServiceProvider<?>> set = this.classServiceProviderConcurrentHashMap.get(cls);
        if (set != null && !set.isEmpty() && !z && (t = (T) ((ServiceProvider) set.toArray()[0]).get()) != null) {
            markResolved(cls);
            return t;
        }
        T t3 = (T) StaticServiceImplManager.getInstance().getStaticServiceImpl(cls);
        if (t3 != null) {
            markResolved(cls);
            return t3;
        }
        if (z3) {
            return null;
        }
        T t4 = (T) getLegacyService(cls);
        if (t4 != null) {
            markResolved(cls);
            return t4;
        }
        if (z4 || (t4 = (T) DowngradeImplManager.getInstance().getDowngradeImpl(cls)) == null) {
            if (!z2) {
                return t4;
            }
            new DynamicProxy();
            return (T) DynamicProxy.get(cls);
        }
        return t4;
    }
}
