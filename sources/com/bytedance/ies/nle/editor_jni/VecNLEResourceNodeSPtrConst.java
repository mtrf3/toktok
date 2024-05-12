package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEResourceNodeSPtrConst extends AbstractList<NLEResourceNode> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEResourceNodeSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEResourceNodeSPtrConst() {
        long new_VecNLEResourceNodeSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEResourceNodeSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEResourceNodeSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEResourceNode nLEResourceNode = (NLEResourceNode) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEResourceNodeSPtrConst_doGet = NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEResourceNodeSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEResourceNode(VecNLEResourceNodeSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEResourceNodeSPtrConst_doRemove = NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEResourceNodeSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEResourceNode(VecNLEResourceNodeSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEResourceNode nLEResourceNode = (NLEResourceNode) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEResourceNode nLEResourceNode = (NLEResourceNode) obj;
        long VecNLEResourceNodeSPtrConst_doSet = NLEEditorJniJNI.VecNLEResourceNodeSPtrConst_doSet(this.LJLIL, this, i, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        if (VecNLEResourceNodeSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEResourceNode(VecNLEResourceNodeSPtrConst_doSet);
    }
}
