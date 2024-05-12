package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes34.dex */
public class EEStdStringMap extends AbstractMap<Element, EEStdStringSet> {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    /* loaded from: classes34.dex */
    public static class Iterator {
        public transient boolean swigCMemOwn;
        public transient long swigCPtr;

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    EffectCreatorJniJNI.delete_EEStdStringMap_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public Element getKey() {
            long EEStdStringMap_Iterator_getKey = EffectCreatorJniJNI.EEStdStringMap_Iterator_getKey(this.swigCPtr, this);
            if (EEStdStringMap_Iterator_getKey == 0) {
                return null;
            }
            return new Element(EEStdStringMap_Iterator_getKey, true);
        }

        public Iterator getNextUnchecked() {
            return new Iterator(EffectCreatorJniJNI.EEStdStringMap_Iterator_getNextUnchecked(this.swigCPtr, this), true);
        }

        public EEStdStringSet getValue() {
            return new EEStdStringSet(EffectCreatorJniJNI.EEStdStringMap_Iterator_getValue(this.swigCPtr, this), true);
        }

        public void finalize() {
            delete();
        }

        public static long getCPtr(Iterator iterator) {
            if (iterator == null) {
                return 0L;
            }
            return iterator.swigCPtr;
        }

        public boolean isNot(Iterator iterator) {
            return EffectCreatorJniJNI.EEStdStringMap_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public void setValue(EEStdStringSet eEStdStringSet) {
            EffectCreatorJniJNI.EEStdStringMap_Iterator_setValue(this.swigCPtr, this, EEStdStringSet.getCPtr(eEStdStringSet), eEStdStringSet);
        }

        public Iterator(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdStringMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private Iterator begin() {
        return new Iterator(EffectCreatorJniJNI.EEStdStringMap_begin(this.swigCPtr, this), true);
    }

    private Iterator end() {
        return new Iterator(EffectCreatorJniJNI.EEStdStringMap_end(this.swigCPtr, this), true);
    }

    private int sizeImpl() {
        return EffectCreatorJniJNI.EEStdStringMap_sizeImpl(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        EffectCreatorJniJNI.EEStdStringMap_clear(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.effectcreator.swig.EEStdStringMap$1, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Element, EEStdStringSet>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator end = end();
        for (Iterator begin = begin(); begin.isNot(end); begin = begin.getNextUnchecked()) {
            ?? r0 = new Map.Entry<Element, EEStdStringSet>() { // from class: com.bytedance.ies.effectcreator.swig.EEStdStringMap.1
                public Iterator iterator;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Map.Entry
                public Element getKey() {
                    return this.iterator.getKey();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.Map.Entry
                public EEStdStringSet getValue() {
                    return this.iterator.getValue();
                }

                public Map.Entry<Element, EEStdStringSet> init(Iterator iterator) {
                    this.iterator = iterator;
                    return this;
                }

                @Override // java.util.Map.Entry
                public EEStdStringSet setValue(EEStdStringSet eEStdStringSet) {
                    EEStdStringSet value = this.iterator.getValue();
                    this.iterator.setValue(eEStdStringSet);
                    return value;
                }
            };
            r0.init(begin);
            hashSet.add(r0);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdStringMap_isEmpty(this.swigCPtr, this);
    }

    public EEStdStringMap() {
        this(EffectCreatorJniJNI.new_EEStdStringMap__SWIG_0(), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public EEStdStringMap(EEStdStringMap eEStdStringMap) {
        this(EffectCreatorJniJNI.new_EEStdStringMap__SWIG_1(getCPtr(eEStdStringMap), eEStdStringMap), true);
    }

    private boolean containsImpl(Element element) {
        return EffectCreatorJniJNI.EEStdStringMap_containsImpl(this.swigCPtr, this, Element.getCPtr(element), element);
    }

    private Iterator find(Element element) {
        return new Iterator(EffectCreatorJniJNI.EEStdStringMap_find(this.swigCPtr, this, Element.getCPtr(element), element), true);
    }

    public static long getCPtr(EEStdStringMap eEStdStringMap) {
        if (eEStdStringMap == null) {
            return 0L;
        }
        return eEStdStringMap.swigCPtr;
    }

    private void removeUnchecked(Iterator iterator) {
        EffectCreatorJniJNI.EEStdStringMap_removeUnchecked(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (!(obj instanceof Element)) {
            return false;
        }
        return containsImpl((Element) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public EEStdStringSet get(Object obj) {
        if (!(obj instanceof Element)) {
            return null;
        }
        Iterator find = find((Element) obj);
        if (!find.isNot(end())) {
            return null;
        }
        return find.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public EEStdStringSet remove(Object obj) {
        if (!(obj instanceof Element)) {
            return null;
        }
        Iterator find = find((Element) obj);
        if (!find.isNot(end())) {
            return null;
        }
        EEStdStringSet value = find.getValue();
        removeUnchecked(find);
        return value;
    }

    public EEStdStringMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    private void putUnchecked(Element element, EEStdStringSet eEStdStringSet) {
        EffectCreatorJniJNI.EEStdStringMap_putUnchecked(this.swigCPtr, this, Element.getCPtr(element), element, EEStdStringSet.getCPtr(eEStdStringSet), eEStdStringSet);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public EEStdStringSet put(Element element, EEStdStringSet eEStdStringSet) {
        Iterator find = find(element);
        if (find.isNot(end())) {
            EEStdStringSet value = find.getValue();
            find.setValue(eEStdStringSet);
            return value;
        }
        putUnchecked(element, eEStdStringSet);
        return null;
    }
}
