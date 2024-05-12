package com.bytedance.ies.nle.editor_jni;

import X.C120604oK;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class MapStrStr extends AbstractMap<String, String> {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_MapStrStr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    public final Iterator LIZ() {
        return new Iterator(NLEEditorJniJNI.MapStrStr_end(this.LJLIL, this));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        NLEEditorJniJNI.MapStrStr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, String>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator LIZ = LIZ();
        for (Iterator iterator = new Iterator(NLEEditorJniJNI.MapStrStr_begin(this.LJLIL, this)); iterator.LIZ(LIZ); iterator = new Iterator(NLEEditorJniJNI.MapStrStr_Iterator_getNextUnchecked(iterator.LIZ, iterator))) {
            C120604oK c120604oK = new C120604oK(this);
            c120604oK.LJLIL = iterator;
            hashSet.add(c120604oK);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return NLEEditorJniJNI.MapStrStr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return NLEEditorJniJNI.MapStrStr_sizeImpl(this.LJLIL, this);
    }

    public MapStrStr() {
        this(NLEEditorJniJNI.new_MapStrStr__SWIG_0(), true);
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
                        NLEEditorJniJNI.delete_MapStrStr_Iterator(j);
                    }
                    this.LIZ = 0L;
                }
            }
        }

        public Iterator(long j) {
            this.LIZ = j;
        }

        public final boolean LIZ(Iterator iterator) {
            return NLEEditorJniJNI.MapStrStr_Iterator_isNot(this.LIZ, this, iterator.LIZ, iterator);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return NLEEditorJniJNI.MapStrStr_containsImpl(this.LJLIL, this, (String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            Iterator iterator = new Iterator(NLEEditorJniJNI.MapStrStr_find(this.LJLIL, this, (String) obj));
            if (iterator.LIZ(LIZ())) {
                return NLEEditorJniJNI.MapStrStr_Iterator_getValue(iterator.LIZ, iterator);
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            Iterator iterator = new Iterator(NLEEditorJniJNI.MapStrStr_find(this.LJLIL, this, (String) obj));
            if (iterator.LIZ(LIZ())) {
                String MapStrStr_Iterator_getValue = NLEEditorJniJNI.MapStrStr_Iterator_getValue(iterator.LIZ, iterator);
                NLEEditorJniJNI.MapStrStr_removeUnchecked(this.LJLIL, this, iterator.LIZ, iterator);
                return MapStrStr_Iterator_getValue;
            }
        }
        return null;
    }

    public MapStrStr(long j, boolean z) {
        this.LJLILLLLZI = z;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Iterator iterator = new Iterator(NLEEditorJniJNI.MapStrStr_find(this.LJLIL, this, str));
        if (iterator.LIZ(LIZ())) {
            String MapStrStr_Iterator_getValue = NLEEditorJniJNI.MapStrStr_Iterator_getValue(iterator.LIZ, iterator);
            NLEEditorJniJNI.MapStrStr_Iterator_setValue(iterator.LIZ, iterator, str2);
            return MapStrStr_Iterator_getValue;
        }
        NLEEditorJniJNI.MapStrStr_putUnchecked(this.LJLIL, this, str, str2);
        return null;
    }
}
