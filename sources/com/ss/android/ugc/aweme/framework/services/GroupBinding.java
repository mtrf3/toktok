package com.ss.android.ugc.aweme.framework.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class GroupBinding<T> {
    public Map<Class<?>, Map<String, ServiceProvider<?>>> classProviderMaps;
    public String groupName;
    public Class<T> klass;
    public ServiceProvider<T> serviceProvider;

    public GroupBinding<T> asSingleton() {
        if (!(this.serviceProvider instanceof SingletonProvider)) {
            Map map = this.classProviderMaps.get(this.klass);
            map.remove(this.serviceProvider);
            SingletonProvider singletonProvider = new SingletonProvider(this.serviceProvider);
            this.serviceProvider = singletonProvider;
            map.put(this.groupName, singletonProvider);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupBinding(Map<Class<?>, Map<String, ServiceProvider<?>>> map, Class<T> cls, String str, ServiceProvider<T> serviceProvider) {
        this.classProviderMaps = map;
        this.groupName = str;
        this.klass = cls;
        this.serviceProvider = serviceProvider;
        Map<String, ServiceProvider<?>> map2 = map.get(cls);
        if (map2 == null) {
            map2 = Collections.synchronizedMap(new HashMap());
            this.classProviderMaps.put(cls, map2);
        }
        map2.put(str, serviceProvider);
    }
}
