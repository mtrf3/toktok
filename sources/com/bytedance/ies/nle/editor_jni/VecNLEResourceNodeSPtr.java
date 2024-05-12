package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEResourceNodeSPtr extends AbstractList<NLEResourceNode> implements RandomAccess {
    public static final /* synthetic */ int LJLJI = 0;
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEResourceNodeSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEResourceNodeSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEResourceNodeSPtr() {
        this(NLEEditorJniJNI.new_VecNLEResourceNodeSPtr__SWIG_0());
    }

    public VecNLEResourceNodeSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEResourceNode nLEResourceNode = (NLEResourceNode) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEResourceNodeSPtr_doGet = NLEEditorJniJNI.VecNLEResourceNodeSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEResourceNodeSPtr_doGet == 0) {
            return null;
        }
        return new NLEResourceNode(VecNLEResourceNodeSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEResourceNodeSPtr_doRemove = NLEEditorJniJNI.VecNLEResourceNodeSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEResourceNodeSPtr_doRemove == 0) {
            return null;
        }
        return new NLEResourceNode(VecNLEResourceNodeSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEResourceNode nLEResourceNode = (NLEResourceNode) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEResourceNodeSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEResourceNode nLEResourceNode = (NLEResourceNode) obj;
        long VecNLEResourceNodeSPtr_doSet = NLEEditorJniJNI.VecNLEResourceNodeSPtr_doSet(this.LJLIL, this, i, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        if (VecNLEResourceNodeSPtr_doSet == 0) {
            return null;
        }
        return new NLEResourceNode(VecNLEResourceNodeSPtr_doSet);
    }
}
