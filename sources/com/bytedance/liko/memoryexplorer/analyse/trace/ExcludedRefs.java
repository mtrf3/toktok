package com.bytedance.liko.memoryexplorer.analyse.trace;

import defpackage.i0;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class ExcludedRefs implements Serializable {
    public static final long serialVersionUID = 691858859591875722L;
    public final Map<String, Set<String>> excludeFieldMap;
    public final Map<String, Set<String>> excludeStaticFieldMap;
    public final Set<String> excludedThreads;

    /* loaded from: classes7.dex */
    public static final class Builder {
        public final Map<String, Set<String>> excludeFieldMap = new LinkedHashMap();
        public final Map<String, Set<String>> excludeStaticFieldMap = new LinkedHashMap();
        public final Set<String> excludedThreads = new LinkedHashSet();

        public ExcludedRefs build() {
            return new ExcludedRefs(this.excludeFieldMap, this.excludeStaticFieldMap, this.excludedThreads);
        }

        public Builder thread(String str) {
            ExcludedRefs.checkNotNull(str, "threadName");
            this.excludedThreads.add(str);
            return this;
        }

        public Builder instanceField(String str, String str2) {
            ExcludedRefs.checkNotNull(str, "className");
            ExcludedRefs.checkNotNull(str2, "fieldName");
            Set<String> set = this.excludeFieldMap.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
                this.excludeFieldMap.put(str, set);
            }
            set.add(str2);
            return this;
        }

        public Builder staticField(String str, String str2) {
            ExcludedRefs.checkNotNull(str, "className");
            ExcludedRefs.checkNotNull(str2, "fieldName");
            Set<String> set = this.excludeStaticFieldMap.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
                this.excludeStaticFieldMap.put(str, set);
            }
            set.add(str2);
            return this;
        }
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(i0.LJFF(str, " must not be null"));
    }

    public ExcludedRefs(Map<String, Set<String>> map, Map<String, Set<String>> map2, Set<String> set) {
        this.excludeFieldMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        this.excludeStaticFieldMap = Collections.unmodifiableMap(new LinkedHashMap(map2));
        this.excludedThreads = Collections.unmodifiableSet(new LinkedHashSet(set));
    }
}
