package com.bytedance.ies.nle.editor_jni;

import X.EnumC123854tZ;
import X.EnumC123864ta;

/* loaded from: classes3.dex */
public class NLEModel extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEModel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearTrack() {
        NLEEditorJniJNI.NLEModel_clearTrack(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public NLENode mo70clone() {
        long NLEModel_clone = NLEEditorJniJNI.NLEModel_clone(this.swigCPtr, this);
        if (NLEModel_clone == 0) {
            return null;
        }
        return new NLENode(NLEModel_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLEModel_copyValueNotMappedToStage(this.swigCPtr, this);
    }

    public String getAlignMode() {
        return NLEEditorJniJNI.NLEModel_getAlignMode(this.swigCPtr, this);
    }

    public VecNLEResourceNodeSPtr getAllResources() {
        return new VecNLEResourceNodeSPtr(NLEEditorJniJNI.NLEModel_getAllResources(this.swigCPtr, this));
    }

    public float getCanvasRatio() {
        return NLEEditorJniJNI.NLEModel_getCanvasRatio(this.swigCPtr, this);
    }

    public NLEVideoFrameModel getCover() {
        long NLEModel_getCover = NLEEditorJniJNI.NLEModel_getCover(this.swigCPtr, this);
        if (NLEModel_getCover == 0) {
            return null;
        }
        return new NLEVideoFrameModel(NLEModel_getCover);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode
    public long getDuration() {
        return NLEEditorJniJNI.NLEModel_getDuration(this.swigCPtr, this);
    }

    public int getEffectLayerMax() {
        return NLEEditorJniJNI.NLEModel_getEffectLayerMax(this.swigCPtr, this);
    }

    public int getLayerMax() {
        return NLEEditorJniJNI.NLEModel_getLayerMax(this.swigCPtr, this);
    }

    public NLETrack getMainTrack() {
        long NLEModel_getMainTrack__SWIG_1 = NLEEditorJniJNI.NLEModel_getMainTrack__SWIG_1(this.swigCPtr, this);
        if (NLEModel_getMainTrack__SWIG_1 == 0) {
            return null;
        }
        return new NLETrack(NLEModel_getMainTrack__SWIG_1);
    }

    public long getMaxTargetEnd() {
        return NLEEditorJniJNI.NLEModel_getMaxTargetEnd__SWIG_1(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode
    public long getMeasuredEndTime() {
        return NLEEditorJniJNI.NLEModel_getMeasuredEndTime(this.swigCPtr, this);
    }

    public long getMinTargetStart() {
        return NLEEditorJniJNI.NLEModel_getMinTargetStart(this.swigCPtr, this);
    }

    public NLERenderSetting getRenderSetting() {
        long NLEModel_getRenderSetting = NLEEditorJniJNI.NLEModel_getRenderSetting(this.swigCPtr, this);
        if (NLEModel_getRenderSetting == 0) {
            return null;
        }
        return new NLERenderSetting(NLEModel_getRenderSetting);
    }

    public EnumC123854tZ getSequenceDurationType() {
        return EnumC123854tZ.swigToEnum(NLEEditorJniJNI.NLEModel_getSequenceDurationType(this.swigCPtr, this));
    }

    public VecNLETrackSPtr getSortedTracks() {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEModel_getSortedTracks(this.swigCPtr, this));
    }

    public VecNLETrackSPtr getSortedTracksWithNoNoneTrack() {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEModel_getSortedTracksWithNoNoneTrack(this.swigCPtr, this));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode
    public long getStartTime() {
        return NLEEditorJniJNI.NLEModel_getStartTime(this.swigCPtr, this);
    }

    public long getThousandFps() {
        return NLEEditorJniJNI.NLEModel_getThousandFps(this.swigCPtr, this);
    }

    public VecNLETrackSPtr getTracks() {
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEModel_getTracks(this.swigCPtr, this));
    }

    public boolean hasAlignMode() {
        return NLEEditorJniJNI.NLEModel_hasAlignMode(this.swigCPtr, this);
    }

    public boolean hasCanvasRatio() {
        return NLEEditorJniJNI.NLEModel_hasCanvasRatio(this.swigCPtr, this);
    }

    public boolean hasSequenceDurationType() {
        return NLEEditorJniJNI.NLEModel_hasSequenceDurationType(this.swigCPtr, this);
    }

    public boolean hasThousandFps() {
        return NLEEditorJniJNI.NLEModel_hasThousandFps(this.swigCPtr, this);
    }

    public NLEModel() {
        this(NLEEditorJniJNI.new_NLEModel(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public static NLEModel dynamicCast(NLENode nLENode) {
        long NLEModel_dynamicCast = NLEEditorJniJNI.NLEModel_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLEModel_dynamicCast == 0) {
            return null;
        }
        return new NLEModel(NLEModel_dynamicCast, true);
    }

    public static long getCPtr(NLEModel nLEModel) {
        if (nLEModel == null) {
            return 0L;
        }
        return nLEModel.swigCPtr;
    }

    public void addTrack(NLETrack nLETrack) {
        NLEEditorJniJNI.NLEModel_addTrack(this.swigCPtr, this, NLETrack.LJI(nLETrack), nLETrack);
    }

    public NLEError applyPatch(NLEModel nLEModel) {
        return NLEError.swigToEnum(NLEEditorJniJNI.NLEModel_applyPatch(this.swigCPtr, this, getCPtr(nLEModel), nLEModel));
    }

    public NLETrack getFirstTrackWithType(EnumC123864ta enumC123864ta) {
        long NLEModel_getFirstTrackWithType = NLEEditorJniJNI.NLEModel_getFirstTrackWithType(this.swigCPtr, this, enumC123864ta.swigValue());
        if (NLEModel_getFirstTrackWithType == 0) {
            return null;
        }
        return new NLETrack(NLEModel_getFirstTrackWithType);
    }

    public NLETrack getMainTrack(boolean z) {
        long NLEModel_getMainTrack__SWIG_0 = NLEEditorJniJNI.NLEModel_getMainTrack__SWIG_0(this.swigCPtr, this, z);
        if (NLEModel_getMainTrack__SWIG_0 == 0) {
            return null;
        }
        return new NLETrack(NLEModel_getMainTrack__SWIG_0);
    }

    public long getMaxTargetEnd(VecNLETrackType vecNLETrackType) {
        long j;
        long j2 = this.swigCPtr;
        if (vecNLETrackType == null) {
            j = 0;
        } else {
            j = vecNLETrackType.LJLIL;
        }
        return NLEEditorJniJNI.NLEModel_getMaxTargetEnd__SWIG_0(j2, this, j, vecNLETrackType);
    }

    public long getMaxTargetEndExcludeDisabledNode(boolean z) {
        return NLEEditorJniJNI.NLEModel_getMaxTargetEndExcludeDisabledNode(this.swigCPtr, this, z);
    }

    public NLEMatrix getRawNLEMatrix(NLETimeSpaceNode nLETimeSpaceNode) {
        long NLEModel_getRawNLEMatrix = NLEEditorJniJNI.NLEModel_getRawNLEMatrix(this.swigCPtr, this, NLETimeSpaceNode.getCPtr(nLETimeSpaceNode), nLETimeSpaceNode);
        if (NLEModel_getRawNLEMatrix == 0) {
            return null;
        }
        return new NLEMatrix(NLEModel_getRawNLEMatrix);
    }

    public NLETrack getTrackBySlot(NLETrackSlot nLETrackSlot) {
        long NLEModel_getTrackBySlot = NLEEditorJniJNI.NLEModel_getTrackBySlot(this.swigCPtr, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
        if (NLEModel_getTrackBySlot == 0) {
            return null;
        }
        return new NLETrack(NLEModel_getTrackBySlot);
    }

    public VecNLETrackSPtr getTracksWithTypes(VecNLETrackType vecNLETrackType) {
        long j;
        long j2 = this.swigCPtr;
        if (vecNLETrackType == null) {
            j = 0;
        } else {
            j = vecNLETrackType.LJLIL;
        }
        return new VecNLETrackSPtr(NLEEditorJniJNI.NLEModel_getTracksWithTypes(j2, this, j, vecNLETrackType));
    }

    public boolean removeTrack(NLETrack nLETrack) {
        return NLEEditorJniJNI.NLEModel_removeTrack(this.swigCPtr, this, NLETrack.LJI(nLETrack), nLETrack);
    }

    public void setAlignMode(String str) {
        NLEEditorJniJNI.NLEModel_setAlignMode(this.swigCPtr, this, str);
    }

    public void setCanvasRatio(float f) {
        NLEEditorJniJNI.NLEModel_setCanvasRatio(this.swigCPtr, this, f);
    }

    public void setCover(NLEVideoFrameModel nLEVideoFrameModel) {
        long j;
        long j2 = this.swigCPtr;
        if (nLEVideoFrameModel == null) {
            j = 0;
        } else {
            j = nLEVideoFrameModel.LIZ;
        }
        NLEEditorJniJNI.NLEModel_setCover(j2, this, j, nLEVideoFrameModel);
    }

    public void setRenderSetting(NLERenderSetting nLERenderSetting) {
        long j;
        long j2 = this.swigCPtr;
        if (nLERenderSetting == null) {
            j = 0;
        } else {
            j = nLERenderSetting.LIZ;
        }
        NLEEditorJniJNI.NLEModel_setRenderSetting(j2, this, j, nLERenderSetting);
    }

    public void setSequenceDurationType(EnumC123854tZ enumC123854tZ) {
        NLEEditorJniJNI.NLEModel_setSequenceDurationType(this.swigCPtr, this, enumC123854tZ.swigValue());
    }

    public void setThousandFps(long j) {
        NLEEditorJniJNI.NLEModel_setThousandFps(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEError unapplyPatch(NLEModel nLEModel) {
        return NLEError.swigToEnum(NLEEditorJniJNI.NLEModel_unapplyPatch(this.swigCPtr, this, getCPtr(nLEModel), nLEModel));
    }

    public NLEModel(long j, boolean z) {
        super(NLEEditorJniJNI.NLEModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void setRewind(boolean z, VecNLETrackType vecNLETrackType) {
        long j;
        long j2 = this.swigCPtr;
        if (vecNLETrackType == null) {
            j = 0;
        } else {
            j = vecNLETrackType.LJLIL;
        }
        NLEEditorJniJNI.NLEModel_setRewind(j2, this, z, j, vecNLETrackType);
    }

    public void updateRelativeSizeWhileGlobalCanvasChanged(float f, float f2) {
        NLEEditorJniJNI.NLEModel_updateRelativeSizeWhileGlobalCanvasChanged(this.swigCPtr, this, f, f2);
    }
}
