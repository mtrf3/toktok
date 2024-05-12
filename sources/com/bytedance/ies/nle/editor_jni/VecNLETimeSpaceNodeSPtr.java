package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETimeSpaceNodeSPtr extends AbstractList<NLETimeSpaceNode> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETimeSpaceNodeSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doSize(this.LJLIL, this);
    }

    public VecNLETimeSpaceNodeSPtr() {
        long new_VecNLETimeSpaceNodeSPtr__SWIG_0 = NLEEditorJniJNI.new_VecNLETimeSpaceNodeSPtr__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLETimeSpaceNodeSPtr__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doAdd__SWIG_0(this.LJLIL, this, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLETimeSpaceNodeSPtr_doGet = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doGet(this.LJLIL, this, i);
        if (VecNLETimeSpaceNodeSPtr_doGet == 0) {
            return null;
        }
        return new NLETimeSpaceNode(VecNLETimeSpaceNodeSPtr_doGet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETimeSpaceNodeSPtr_doRemove = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLETimeSpaceNodeSPtr_doRemove == 0) {
            return null;
        }
        return new NLETimeSpaceNode(VecNLETimeSpaceNodeSPtr_doRemove, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
        long VecNLETimeSpaceNodeSPtr_doSet = NLEEditorJniJNI.VecNLETimeSpaceNodeSPtr_doSet(this.LJLIL, this, i, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
        if (VecNLETimeSpaceNodeSPtr_doSet == 0) {
            return null;
        }
        return new NLETimeSpaceNode(VecNLETimeSpaceNodeSPtr_doSet, true);
    }
}
