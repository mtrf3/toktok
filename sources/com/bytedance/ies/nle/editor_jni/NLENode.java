package com.bytedance.ies.nle.editor_jni;

import X.EnumC123884tc;

/* loaded from: classes3.dex */
public class NLENode {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLENode(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void clearExtra() {
        NLEEditorJniJNI.NLENode_clearExtra(this.swigCPtr, this);
    }

    public void clearListener() {
        NLEEditorJniJNI.NLENode_clearListener(this.swigCPtr, this);
    }

    public void clearTransientExtra() {
        NLEEditorJniJNI.NLENode_clearTransientExtra(this.swigCPtr, this);
    }

    public void clearWorkingDirty() {
        NLEEditorJniJNI.NLENode_clearWorkingDirty(this.swigCPtr, this);
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NLENode mo70clone() {
        long NLENode_clone = NLEEditorJniJNI.NLENode_clone(this.swigCPtr, this);
        if (NLENode_clone == 0) {
            return null;
        }
        return new NLENode(NLENode_clone, true);
    }

    public void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLENode_copyValueNotMappedToStage(this.swigCPtr, this);
    }

    public NLENode deepClone() {
        long NLENode_deepClone__SWIG_0 = NLEEditorJniJNI.NLENode_deepClone__SWIG_0(this.swigCPtr, this);
        if (NLENode_deepClone__SWIG_0 == 0) {
            return null;
        }
        return new NLENode(NLENode_deepClone__SWIG_0, true);
    }

    public MapStrNLENodeSPtr getChildren() {
        return new MapStrNLENodeSPtr(NLEEditorJniJNI.NLENode_getChildren(this.swigCPtr, this), false);
    }

    public EnumC123884tc getClassType() {
        return EnumC123884tc.swigToEnum(NLEEditorJniJNI.NLENode_getClassType(this.swigCPtr, this));
    }

    public boolean getEnable() {
        return NLEEditorJniJNI.NLENode_getEnable(this.swigCPtr, this);
    }

    public VecString getExtraKeys() {
        return new VecString(NLEEditorJniJNI.NLENode_getExtraKeys(this.swigCPtr, this), true);
    }

    public long getId() {
        return NLEEditorJniJNI.NLENode_getId(this.swigCPtr, this);
    }

    public String getName() {
        return NLEEditorJniJNI.NLENode_getName(this.swigCPtr, this);
    }

    public NLENode getStage() {
        long NLENode_getStage = NLEEditorJniJNI.NLENode_getStage(this.swigCPtr, this);
        if (NLENode_getStage == 0) {
            return null;
        }
        return new NLENode(NLENode_getStage, true);
    }

    public String getStringId() {
        return NLEEditorJniJNI.NLENode_getStringId(this.swigCPtr, this);
    }

    public String getUUID() {
        return NLEEditorJniJNI.NLENode_getUUID(this.swigCPtr, this);
    }

    public ChangeBits getWorkingDirty() {
        return new ChangeBits(NLEEditorJniJNI.NLENode_getWorkingDirty(this.swigCPtr, this));
    }

    public boolean hasEnable() {
        return NLEEditorJniJNI.NLENode_hasEnable(this.swigCPtr, this);
    }

    public boolean hasName() {
        return NLEEditorJniJNI.NLENode_hasName(this.swigCPtr, this);
    }

    public boolean hasUUID() {
        return NLEEditorJniJNI.NLENode_hasUUID(this.swigCPtr, this);
    }

    public String hash() {
        return NLEEditorJniJNI.NLENode_hash(this.swigCPtr, this);
    }

    public boolean isWorkingDirty() {
        return NLEEditorJniJNI.NLENode_isWorkingDirty(this.swigCPtr, this);
    }

    public String toJsonString() {
        return NLEEditorJniJNI.NLENode_toJsonString(this.swigCPtr, this);
    }

    public String toString() {
        return NLEEditorJniJNI.NLENode_toString(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLENode nLENode) {
        if (nLENode == null) {
            return 0L;
        }
        return nLENode.swigCPtr;
    }

    public void addFeature(String str) {
        NLEEditorJniJNI.NLENode_addFeature(this.swigCPtr, this, str);
    }

    public void addListener(NLEChangeListener nLEChangeListener) {
        NLEEditorJniJNI.NLENode_addListener(this.swigCPtr, this, NLEChangeListener.getCPtr(nLEChangeListener), nLEChangeListener);
    }

    public NLENode addToStage(long j) {
        long NLENode_addToStage = NLEEditorJniJNI.NLENode_addToStage(this.swigCPtr, this, j);
        if (NLENode_addToStage == 0) {
            return null;
        }
        return new NLENode(NLENode_addToStage, true);
    }

    public boolean addToWorking(NLENode nLENode) {
        return NLEEditorJniJNI.NLENode_addToWorking(this.swigCPtr, this, getCPtr(nLENode), nLENode);
    }

    public void clearExtraRecursively(VecString vecString) {
        NLEEditorJniJNI.NLENode_clearExtraRecursively(this.swigCPtr, this, VecString.LIZJ(vecString), vecString);
    }

    public void clearUnnecessaryExtraRecursively(VecString vecString) {
        NLEEditorJniJNI.NLENode_clearUnnecessaryExtraRecursively(this.swigCPtr, this, VecString.LIZJ(vecString), vecString);
    }

    public void collectResources(VecNLEResourceNodeSPtr vecNLEResourceNodeSPtr) {
        long j;
        long j2 = this.swigCPtr;
        if (vecNLEResourceNodeSPtr == null) {
            j = 0;
        } else {
            j = vecNLEResourceNodeSPtr.LJLIL;
        }
        NLEEditorJniJNI.NLENode_collectResources(j2, this, j, vecNLEResourceNodeSPtr);
    }

    public NLENode deepClone(boolean z) {
        long NLENode_deepClone__SWIG_1 = NLEEditorJniJNI.NLENode_deepClone__SWIG_1(this.swigCPtr, this, z);
        if (NLENode_deepClone__SWIG_1 == 0) {
            return null;
        }
        return new NLENode(NLENode_deepClone__SWIG_1, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            try {
                return equals((NLENode) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public String getExtra(String str) {
        return NLEEditorJniJNI.NLENode_getExtra(this.swigCPtr, this, str);
    }

    public String getTransientExtra(String str) {
        return NLEEditorJniJNI.NLENode_getTransientExtra(this.swigCPtr, this, str);
    }

    public boolean hasExtra(String str) {
        return NLEEditorJniJNI.NLENode_hasExtra(this.swigCPtr, this, str);
    }

    public boolean hasTransientExtra(String str) {
        return NLEEditorJniJNI.NLENode_hasTransientExtra(this.swigCPtr, this, str);
    }

    public void removeExtraWithKey(String str) {
        NLEEditorJniJNI.NLENode_removeExtraWithKey(this.swigCPtr, this, str);
    }

    public void removeTransientExtraWithKey(String str) {
        NLEEditorJniJNI.NLENode_removeTransientExtraWithKey(this.swigCPtr, this, str);
    }

    public void setEnable(boolean z) {
        NLEEditorJniJNI.NLENode_setEnable(this.swigCPtr, this, z);
    }

    public void setName(String str) {
        NLEEditorJniJNI.NLENode_setName(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public boolean unorderEquals(NLENode nLENode) {
        return NLEEditorJniJNI.NLENode_unorderEquals__SWIG_1(this.swigCPtr, this, getCPtr(nLENode), nLENode);
    }

    public boolean equals(NLENode nLENode) {
        return NLEEditorJniJNI.NLENode_equals(this.swigCPtr, this, getCPtr(nLENode), nLENode);
    }

    public NLENode(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void cloneToNode(NLENode nLENode, boolean z) {
        NLEEditorJniJNI.NLENode_cloneToNode(this.swigCPtr, this, getCPtr(nLENode), nLENode, z);
    }

    public void setExtra(String str, String str2) {
        NLEEditorJniJNI.NLENode_setExtra(this.swigCPtr, this, str, str2);
    }

    public void setTransientExtra(String str, String str2) {
        NLEEditorJniJNI.NLENode_setTransientExtra(this.swigCPtr, this, str, str2);
    }

    public boolean unorderEquals(NLENode nLENode, boolean z) {
        return NLEEditorJniJNI.NLENode_unorderEquals__SWIG_0(this.swigCPtr, this, getCPtr(nLENode), nLENode, z);
    }
}
