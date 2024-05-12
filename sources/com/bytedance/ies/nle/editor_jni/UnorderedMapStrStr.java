package com.bytedance.ies.nle.editor_jni;

import X.C120614oL;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class UnorderedMapStrStr extends AbstractMap<String, String> {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_UnorderedMapStrStr(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private Iterator begin() {
        return new Iterator(NLEEditorJniJNI.UnorderedMapStrStr_begin(this.swigCPtr, this));
    }

    private Iterator end() {
        return new Iterator(NLEEditorJniJNI.UnorderedMapStrStr_end(this.swigCPtr, this));
    }

    private int sizeImpl() {
        return NLEEditorJniJNI.UnorderedMapStrStr_sizeImpl(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        NLEEditorJniJNI.UnorderedMapStrStr_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, String>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator end = end();
        for (Iterator begin = begin(); begin.LIZ(end); begin = new Iterator(NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getNextUnchecked(begin.LIZ, begin))) {
            C120614oL c120614oL = new C120614oL(this);
            c120614oL.LJLIL = begin;
            hashSet.add(c120614oL);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return NLEEditorJniJNI.UnorderedMapStrStr_isEmpty(this.swigCPtr, this);
    }

    public UnorderedMapStrStr() {
        this(NLEEditorJniJNI.new_UnorderedMapStrStr__SWIG_0(), true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    /* loaded from: classes3.dex */
    public static class Iterator {
        public transient long LIZ;
        public transient boolean LIZIZ = true;

        public final void finalize() {
            synchronized (this) {
                long j = this.LIZ;
                if (j != 0) {
                    if (this.LIZIZ) {
                        this.LIZIZ = false;
                        NLEEditorJniJNI.delete_UnorderedMapStrStr_Iterator(j);
                    }
                    this.LIZ = 0L;
                }
            }
        }

        public Iterator(long j) {
            this.LIZ = j;
        }

        public final boolean LIZ(Iterator iterator) {
            long j;
            long j2 = this.LIZ;
            if (iterator == null) {
                j = 0;
            } else {
                j = iterator.LIZ;
            }
            return NLEEditorJniJNI.UnorderedMapStrStr_Iterator_isNot(j2, this, j, iterator);
        }
    }

    public UnorderedMapStrStr(UnorderedMapStrStr unorderedMapStrStr) {
        this(NLEEditorJniJNI.new_UnorderedMapStrStr__SWIG_1(getCPtr(unorderedMapStrStr), unorderedMapStrStr), true);
    }

    private boolean containsImpl(String str) {
        return NLEEditorJniJNI.UnorderedMapStrStr_containsImpl(this.swigCPtr, this, str);
    }

    private Iterator find(String str) {
        return new Iterator(NLEEditorJniJNI.UnorderedMapStrStr_find(this.swigCPtr, this, str));
    }

    public static long getCPtr(UnorderedMapStrStr unorderedMapStrStr) {
        if (unorderedMapStrStr == null) {
            return 0L;
        }
        return unorderedMapStrStr.swigCPtr;
    }

    private void removeUnchecked(Iterator iterator) {
        long j;
        long j2 = this.swigCPtr;
        if (iterator == null) {
            j = 0;
        } else {
            j = iterator.LIZ;
        }
        NLEEditorJniJNI.UnorderedMapStrStr_removeUnchecked(j2, this, j, iterator);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsImpl((String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator find = find((String) obj);
        if (!find.LIZ(end())) {
            return null;
        }
        return NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getValue(find.LIZ, find);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator find = find((String) obj);
        if (!find.LIZ(end())) {
            return null;
        }
        String UnorderedMapStrStr_Iterator_getValue = NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getValue(find.LIZ, find);
        removeUnchecked(find);
        return UnorderedMapStrStr_Iterator_getValue;
    }

    public UnorderedMapStrStr(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    private void putUnchecked(String str, String str2) {
        NLEEditorJniJNI.UnorderedMapStrStr_putUnchecked(this.swigCPtr, this, str, str2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String put(String str, String str2) {
        Iterator find = find(str);
        if (find.LIZ(end())) {
            String UnorderedMapStrStr_Iterator_getValue = NLEEditorJniJNI.UnorderedMapStrStr_Iterator_getValue(find.LIZ, find);
            NLEEditorJniJNI.UnorderedMapStrStr_Iterator_setValue(find.LIZ, find, str2);
            return UnorderedMapStrStr_Iterator_getValue;
        }
        putUnchecked(str, str2);
        return null;
    }
}
