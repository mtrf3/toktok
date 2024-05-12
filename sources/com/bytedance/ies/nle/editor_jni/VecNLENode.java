package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes17.dex */
public final class VecNLENode extends AbstractList<NLENode> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLETemplateJNI.delete_VecNLENode(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLETemplateJNI.VecNLENode_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLETemplateJNI.VecNLENode_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLETemplateJNI.VecNLENode_doSize(this.LJLIL, this);
    }

    public VecNLENode() {
        this(NLETemplateJNI.new_VecNLENode__SWIG_0());
    }

    public VecNLENode(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLENode nLENode = (NLENode) obj;
        ((AbstractList) this).modCount++;
        NLETemplateJNI.VecNLENode_doAdd__SWIG_0(this.LJLIL, this, NLENode.getCPtr(nLENode), nLENode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLENode_doGet = NLETemplateJNI.VecNLENode_doGet(this.LJLIL, this, i);
        if (VecNLENode_doGet == 0) {
            return null;
        }
        return new NLENode(VecNLENode_doGet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLENode_doRemove = NLETemplateJNI.VecNLENode_doRemove(this.LJLIL, this, i);
        if (VecNLENode_doRemove == 0) {
            return null;
        }
        return new NLENode(VecNLENode_doRemove, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLENode nLENode = (NLENode) obj;
        ((AbstractList) this).modCount++;
        NLETemplateJNI.VecNLENode_doAdd__SWIG_1(this.LJLIL, this, i, NLENode.getCPtr(nLENode), nLENode);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLETemplateJNI.VecNLENode_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLENode nLENode = (NLENode) obj;
        long VecNLENode_doSet = NLETemplateJNI.VecNLENode_doSet(this.LJLIL, this, i, NLENode.getCPtr(nLENode), nLENode);
        if (VecNLENode_doSet == 0) {
            return null;
        }
        return new NLENode(VecNLENode_doSet, true);
    }
}
