package com.bytedance.ies.smartmovie.jni;

import X.C45176HoC;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class UnorderedMapStrStr extends AbstractMap<String, String> {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    SmartMovieJniJNI.delete_UnorderedMapStrStr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    public final Iterator LIZ() {
        return new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_end(this.LJLIL, this));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        SmartMovieJniJNI.UnorderedMapStrStr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, String>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator LIZ = LIZ();
        for (Iterator iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_begin(this.LJLIL, this)); iterator.LIZ(LIZ); iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getNextUnchecked(iterator.LIZ, iterator))) {
            C45176HoC c45176HoC = new C45176HoC(this);
            c45176HoC.LJLIL = iterator;
            hashSet.add(c45176HoC);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return SmartMovieJniJNI.UnorderedMapStrStr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return SmartMovieJniJNI.UnorderedMapStrStr_sizeImpl(this.LJLIL, this);
    }

    public UnorderedMapStrStr() {
        this(SmartMovieJniJNI.new_UnorderedMapStrStr__SWIG_0());
    }

    /* loaded from: classes8.dex */
    public static class Iterator {
        public transient long LIZ;
        public transient boolean LIZIZ = true;

        public final void finalize() {
            synchronized (this) {
                long j = this.LIZ;
                if (j != 0) {
                    if (this.LIZIZ) {
                        this.LIZIZ = false;
                        SmartMovieJniJNI.delete_UnorderedMapStrStr_Iterator(j);
                    }
                    this.LIZ = 0L;
                }
            }
        }

        public Iterator(long j) {
            this.LIZ = j;
        }

        public final boolean LIZ(Iterator iterator) {
            return SmartMovieJniJNI.UnorderedMapStrStr_Iterator_isNot(this.LIZ, this, iterator.LIZ, iterator);
        }
    }

    public UnorderedMapStrStr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    public static long LIZIZ(UnorderedMapStrStr unorderedMapStrStr) {
        if (unorderedMapStrStr == null) {
            return 0L;
        }
        return unorderedMapStrStr.LJLIL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return SmartMovieJniJNI.UnorderedMapStrStr_containsImpl(this.LJLIL, this, (String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            Iterator iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_find(this.LJLIL, this, (String) obj));
            if (iterator.LIZ(LIZ())) {
                return SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            Iterator iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_find(this.LJLIL, this, (String) obj));
            if (iterator.LIZ(LIZ())) {
                String UnorderedMapStrStr_Iterator_getValue = SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
                SmartMovieJniJNI.UnorderedMapStrStr_removeUnchecked(this.LJLIL, this, iterator.LIZ, iterator);
                return UnorderedMapStrStr_Iterator_getValue;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Iterator iterator = new Iterator(SmartMovieJniJNI.UnorderedMapStrStr_find(this.LJLIL, this, str));
        if (iterator.LIZ(LIZ())) {
            String UnorderedMapStrStr_Iterator_getValue = SmartMovieJniJNI.UnorderedMapStrStr_Iterator_getValue(iterator.LIZ, iterator);
            SmartMovieJniJNI.UnorderedMapStrStr_Iterator_setValue(iterator.LIZ, iterator, str2);
            return UnorderedMapStrStr_Iterator_getValue;
        }
        SmartMovieJniJNI.UnorderedMapStrStr_putUnchecked(this.LJLIL, this, str, str2);
        return null;
    }
}
