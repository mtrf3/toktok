package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes17.dex */
public final class VecNLEMappingNode extends AbstractList<NLEMappingNode> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLETemplateJNI.delete_VecNLEMappingNode(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLETemplateJNI.VecNLEMappingNode_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLETemplateJNI.VecNLEMappingNode_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLETemplateJNI.VecNLEMappingNode_doSize(this.LJLIL, this);
    }

    public VecNLEMappingNode() {
        long new_VecNLEMappingNode__SWIG_0 = NLETemplateJNI.new_VecNLEMappingNode__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEMappingNode__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long j;
        NLEMappingNode nLEMappingNode = (NLEMappingNode) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEMappingNode == null) {
            j = 0;
        } else {
            j = nLEMappingNode.LIZ;
        }
        NLETemplateJNI.VecNLEMappingNode_doAdd__SWIG_0(j2, this, j, nLEMappingNode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEMappingNode_doGet = NLETemplateJNI.VecNLEMappingNode_doGet(this.LJLIL, this, i);
        if (VecNLEMappingNode_doGet == 0) {
            return null;
        }
        return new NLEMappingNode(VecNLEMappingNode_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEMappingNode_doRemove = NLETemplateJNI.VecNLEMappingNode_doRemove(this.LJLIL, this, i);
        if (VecNLEMappingNode_doRemove == 0) {
            return null;
        }
        return new NLEMappingNode(VecNLEMappingNode_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        NLEMappingNode nLEMappingNode = (NLEMappingNode) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEMappingNode == null) {
            j = 0;
        } else {
            j = nLEMappingNode.LIZ;
        }
        NLETemplateJNI.VecNLEMappingNode_doAdd__SWIG_1(j2, this, i, j, nLEMappingNode);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLETemplateJNI.VecNLEMappingNode_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        NLEMappingNode nLEMappingNode = (NLEMappingNode) obj;
        long j2 = this.LJLIL;
        if (nLEMappingNode == null) {
            j = 0;
        } else {
            j = nLEMappingNode.LIZ;
        }
        long VecNLEMappingNode_doSet = NLETemplateJNI.VecNLEMappingNode_doSet(j2, this, i, j, nLEMappingNode);
        if (VecNLEMappingNode_doSet == 0) {
            return null;
        }
        return new NLEMappingNode(VecNLEMappingNode_doSet);
    }
}
