package com.ss.android.ugc.aweme.framework.services;

import X.AnonymousClass028;
import X.C16880lQ;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ConfigLoader {
    public static final String[] DIRS = {"services/", "services/AwemeLive/", "services/AwemeIM/", "services/AwemeReactNative/", "services/AwemePush/", "services/AwemeShare/", "services/AwemeMain/", "services/AwemePlugin/", "services/SdkDebugger/", "services/AwemeMusic/", "services/AwemeVideo/", "services/AwemeFramework/", "services/AwemeCommerce/"};
    public static final Map<String, List<CacheItem>> CLASSES = Collections.synchronizedMap(new LinkedHashMap());

    /* loaded from: classes7.dex */
    public static class ConfigIterator<T> implements Iterator<T> {
        public Class mClass;
        public ClassLoader mClassLoader;
        public List<CacheItem> mClasses;
        public int mIndex;

        @Override // java.util.Iterator
        public boolean hasNext() {
            List<CacheItem> list = this.mClasses;
            if (list != null && this.mIndex < list.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            T t;
            CacheItem cacheItem = (CacheItem) ListProtector.get(this.mClasses, this.mIndex);
            this.mIndex++;
            synchronized (cacheItem) {
                boolean z = cacheItem.persistence;
                if (z && (t = (T) cacheItem.cacheService) != null) {
                    return t;
                }
                if (z) {
                    T newService = newService(cacheItem);
                    cacheItem.cacheService = newService;
                    return newService;
                }
                return newService(cacheItem);
            }
        }

        private T newService(CacheItem cacheItem) {
            try {
                Class<?> cls = Class.forName(cacheItem.className, false, this.mClassLoader);
                if (this.mClass.isAssignableFrom(cls)) {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        return (T) declaredConstructor.newInstance(new Object[0]);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException(e2);
                    } catch (NoSuchMethodException e3) {
                        throw new RuntimeException(e3);
                    } catch (InvocationTargetException e4) {
                        throw new RuntimeException(e4);
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("source: ");
                LIZ.append(cls.getName());
                LIZ.append(", dest: ");
                LIZ.append(this.mClass.getName());
                throw new RuntimeException(new ClassCastException(X1D.LIZIZ(LIZ)));
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(e5);
            }
        }

        public ConfigIterator(List<CacheItem> list, Class<T> cls, ClassLoader classLoader) {
            this.mClassLoader = classLoader;
            this.mClass = cls;
            this.mClasses = list;
        }
    }

    static {
        addCache("com.bytedance.ies.bullet.kit.lynx.ILynxKitApi", "com.bytedance.ies.bullet.kit.lynx.LynxKitApi");
        addCache("com.bytedance.ies.bullet.kit.web.IWebKitApi", "com.bytedance.ies.bullet.kit.web.WebKitApi");
    }

    /* loaded from: classes7.dex */
    public static class CacheItem {
        public Object cacheService;
        public final String className;
        public final boolean persistence;

        public static CacheItem fromConfig(String str) {
            if (str != null && !"".equals(str)) {
                String[] split = str.split(":");
                boolean z = false;
                String str2 = split[0];
                if (split.length > 1) {
                    z = Boolean.parseBoolean(split[1]);
                }
                return new CacheItem(str2, z);
            }
            return null;
        }

        public CacheItem(String str, boolean z) {
            this.className = str;
            this.persistence = z;
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static <T> Iterator<T> iterator(Class<T> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return new ConfigIterator(loadClasses(cls, classLoader), cls, classLoader);
    }

    public static List<CacheItem> parse(URL url) {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        LinkedList linkedList = new LinkedList();
        BufferedReader bufferedReader2 = null;
        try {
            inputStream = url.openStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        try {
                            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                CacheItem fromConfig = CacheItem.fromConfig(readLine);
                                if (fromConfig != null) {
                                    linkedList.add(fromConfig);
                                }
                            }
                        } catch (IOException e) {
                            e = e;
                            C16880lQ.LLLLIIL(e);
                            closeQuietly(bufferedReader);
                            closeQuietly(inputStreamReader);
                            closeQuietly(inputStream);
                            return linkedList;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        closeQuietly(bufferedReader2);
                        closeQuietly(inputStreamReader);
                        closeQuietly(inputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(bufferedReader2);
                    closeQuietly(inputStreamReader);
                    closeQuietly(inputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                bufferedReader = null;
                inputStreamReader = null;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (IOException e4) {
            e = e4;
            inputStreamReader = null;
            bufferedReader = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            inputStreamReader = null;
        }
        closeQuietly(bufferedReader);
        closeQuietly(inputStreamReader);
        closeQuietly(inputStream);
        return linkedList;
    }

    public static List<CacheItem> parseSafely(URL url) {
        for (int i = 0; i < 3; i++) {
            try {
                return parse(url);
            } catch (ConcurrentModificationException e) {
                if (i < 2) {
                    try {
                        Thread.sleep(2L);
                    } catch (InterruptedException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                } else {
                    throw e;
                }
            }
        }
        return new LinkedList();
    }

    public static void addCache(String str, String str2) {
        String[] split = str2.split("\n");
        ArrayList arrayList = new ArrayList();
        for (String str3 : split) {
            arrayList.add(CacheItem.fromConfig(str3));
        }
        CLASSES.put(str, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public static <T> List<CacheItem> loadClasses(Class<T> cls, ClassLoader classLoader) {
        LinkedList linkedList;
        Map<String, List<CacheItem>> map = CLASSES;
        synchronized (map) {
            List<CacheItem> list = map.get(cls.getName());
            if (list != null) {
                return list;
            }
            LinkedList linkedList2 = new LinkedList();
            for (String str : DIRS) {
                Enumeration<URL> urls = getUrls(cls, classLoader, str);
                while (urls != null && urls.hasMoreElements()) {
                    linkedList2.addAll(parseSafely(urls.nextElement()));
                }
            }
            Map<String, List<CacheItem>> map2 = CLASSES;
            synchronized (map2) {
                if (!map2.containsKey(cls.getName())) {
                    map2.put(cls.getName(), linkedList2);
                    linkedList = linkedList2;
                } else {
                    linkedList = (List) map2.get(cls.getName());
                }
            }
            return linkedList;
        }
    }

    public static Enumeration<URL> getUrls(Class cls, ClassLoader classLoader, String str) {
        StringBuilder LIZ = X1D.LIZ();
        String LIZLLL = AnonymousClass028.LIZLLL(LIZ, str, cls, LIZ);
        if (classLoader == null) {
            try {
                return ClassLoader.getSystemResources(LIZLLL);
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        try {
            return classLoader.getResources(LIZLLL);
        } catch (IOException e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        }
    }
}
