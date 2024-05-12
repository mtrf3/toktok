package com.ss.android.ugc.effectmanager.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes12.dex */
public class Multimap<K, V> {
    public HashMap<K, Collection<V>> mInternalHashMap = new HashMap<>();

    /* loaded from: classes12.dex */
    public static class Entry<K, V> {
        public K mKey;
        public V mValue;

        public int hashCode() {
            return this.mValue.hashCode() + (this.mKey.hashCode() * 31);
        }

        public K getKey() {
            return this.mKey;
        }

        public V getValue() {
            return this.mValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.mKey.equals(entry.mKey)) {
                return false;
            }
            return this.mValue.equals(entry.mValue);
        }

        public void setKey(K k) {
            this.mKey = k;
        }

        public void setValue(V v) {
            this.mValue = v;
        }

        public Entry(K k, V v) {
            this.mKey = k;
            this.mValue = v;
        }
    }

    public Set<Entry<K, V>> entrySet() {
        HashSet hashSet = new HashSet();
        for (K k : keySet()) {
            Iterator<V> it = get(k).iterator();
            while (it.hasNext()) {
                hashSet.add(new Entry(k, it.next()));
            }
        }
        return hashSet;
    }

    public Set<K> keySet() {
        return this.mInternalHashMap.keySet();
    }

    public Collection<V> values() {
        Collection<Collection<V>> values = this.mInternalHashMap.values();
        ArrayList arrayList = new ArrayList();
        Iterator<Collection<V>> it = values.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public boolean containsKey(K k) {
        return this.mInternalHashMap.containsKey(k);
    }

    public Collection<V> get(K k) {
        Collection<V> collection = this.mInternalHashMap.get(k);
        if (collection == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableCollection(collection);
    }

    public boolean containsEntry(K k, V v) {
        return get(k).contains(v);
    }

    public void put(K k, V v) {
        Collection<V> collection = this.mInternalHashMap.get(k);
        if (collection == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(v);
            this.mInternalHashMap.put(k, arrayList);
            return;
        }
        collection.add(v);
    }

    public boolean remove(K k, V v) {
        Collection<V> collection = this.mInternalHashMap.get(k);
        if (collection == null) {
            return false;
        }
        boolean remove = collection.remove(v);
        if (remove && collection.isEmpty()) {
            this.mInternalHashMap.remove(k);
        }
        return remove;
    }
}
