package com.bytedance.ies.nle.editor_jni;

import X.C120594oJ;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class MapStrNLENodeSPtrConst extends AbstractMap<String, NLENode> {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

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
                        NLEEditorJniJNI.delete_MapStrNLENodeSPtrConst_Iterator(j);
                    }
                    this.LIZ = 0L;
                }
            }
        }

        public final NLENode LIZ() {
            long MapStrNLENodeSPtrConst_Iterator_getValue = NLEEditorJniJNI.MapStrNLENodeSPtrConst_Iterator_getValue(this.LIZ, this);
            if (MapStrNLENodeSPtrConst_Iterator_getValue == 0) {
                return null;
            }
            return new NLENode(MapStrNLENodeSPtrConst_Iterator_getValue, true);
        }

        public Iterator(long j) {
            this.LIZ = j;
        }

        public final boolean LIZIZ(Iterator iterator) {
            return NLEEditorJniJNI.MapStrNLENodeSPtrConst_Iterator_isNot(this.LIZ, this, iterator.LIZ, iterator);
        }
    }

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_MapStrNLENodeSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    public final Iterator LIZ() {
        return new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtrConst_end(this.LJLIL, this));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        NLEEditorJniJNI.MapStrNLENodeSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, NLENode>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator LIZ = LIZ();
        for (Iterator iterator = new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtrConst_begin(this.LJLIL, this)); iterator.LIZIZ(LIZ); iterator = new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtrConst_Iterator_getNextUnchecked(iterator.LIZ, iterator))) {
            C120594oJ c120594oJ = new C120594oJ(this);
            c120594oJ.LJLIL = iterator;
            hashSet.add(c120594oJ);
        }
        return hashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return NLEEditorJniJNI.MapStrNLENodeSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return NLEEditorJniJNI.MapStrNLENodeSPtrConst_sizeImpl(this.LJLIL, this);
    }

    public MapStrNLENodeSPtrConst() {
        long new_MapStrNLENodeSPtrConst__SWIG_0 = NLEEditorJniJNI.new_MapStrNLENodeSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_MapStrNLENodeSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return NLEEditorJniJNI.MapStrNLENodeSPtrConst_containsImpl(this.LJLIL, this, (String) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            Iterator iterator = new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtrConst_find(this.LJLIL, this, (String) obj));
            if (iterator.LIZIZ(LIZ())) {
                return iterator.LIZ();
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            Iterator iterator = new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtrConst_find(this.LJLIL, this, (String) obj));
            if (iterator.LIZIZ(LIZ())) {
                NLENode LIZ = iterator.LIZ();
                NLEEditorJniJNI.MapStrNLENodeSPtrConst_removeUnchecked(this.LJLIL, this, iterator.LIZ, iterator);
                return LIZ;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        NLENode nLENode = (NLENode) obj2;
        Iterator iterator = new Iterator(NLEEditorJniJNI.MapStrNLENodeSPtrConst_find(this.LJLIL, this, str));
        if (iterator.LIZIZ(LIZ())) {
            NLENode LIZ = iterator.LIZ();
            NLEEditorJniJNI.MapStrNLENodeSPtrConst_Iterator_setValue(iterator.LIZ, iterator, NLENode.getCPtr(nLENode), nLENode);
            return LIZ;
        }
        NLEEditorJniJNI.MapStrNLENodeSPtrConst_putUnchecked(this.LJLIL, this, str, NLENode.getCPtr(nLENode), nLENode);
        return null;
    }
}
