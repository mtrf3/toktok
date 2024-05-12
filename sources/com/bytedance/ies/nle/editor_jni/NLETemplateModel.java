package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public class NLETemplateModel extends NLEModel {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLETemplateJNI.delete_NLETemplateModel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public static VecUInt32 getSupportFeatureBits() {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getSupportFeatureBits__SWIG_1());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public NLENode mo70clone() {
        long NLETemplateModel_clone = NLETemplateJNI.NLETemplateModel_clone(this.swigCPtr, this);
        if (NLETemplateModel_clone == 0) {
            return null;
        }
        return new NLENode(NLETemplateModel_clone, true);
    }

    public VecNLENode getAllMutableItems() {
        return new VecNLENode(NLETemplateJNI.NLETemplateModel_getAllMutableItems(this.swigCPtr, this));
    }

    public VecUInt32 getFeatureBits() {
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getFeatureBits(this.swigCPtr, this));
    }

    public VecNLETrackSlotSPtr getMutableAssetItems() {
        return new VecNLETrackSlotSPtr(NLETemplateJNI.NLETemplateModel_getMutableAssetItems(this.swigCPtr, this));
    }

    public VecNLETrackSlotSPtr getMutableTextItems() {
        return new VecNLETrackSlotSPtr(NLETemplateJNI.NLETemplateModel_getMutableTextItems(this.swigCPtr, this));
    }

    public NLESize getTemplateCanvasSize() {
        return new NLESize(NLETemplateJNI.NLETemplateModel_getTemplateCanvasSize(this.swigCPtr, this));
    }

    public TemplateInfo getTemplateInfo() {
        long NLETemplateModel_getTemplateInfo = NLETemplateJNI.NLETemplateModel_getTemplateInfo(this.swigCPtr, this);
        if (NLETemplateModel_getTemplateInfo == 0) {
            return null;
        }
        return new TemplateInfo(NLETemplateModel_getTemplateInfo);
    }

    public String store() {
        return NLETemplateJNI.NLETemplateModel_store(this.swigCPtr, this);
    }

    public NLETemplateModel() {
        this(NLETemplateJNI.new_NLETemplateModel(), true);
    }

    public static String NLE_TEMPLATE_JSON_FILENAME() {
        return NLETemplateJNI.NLETemplateModel_NLE_TEMPLATE_JSON_FILENAME();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public static boolean canSupportFeatureBits(VecUInt32 vecUInt32) {
        long j;
        if (vecUInt32 == null) {
            j = 0;
        } else {
            j = vecUInt32.LJLIL;
        }
        return NLETemplateJNI.NLETemplateModel_canSupportFeatureBits(j, vecUInt32);
    }

    public static String compressTemplateJson(String str) {
        return NLETemplateJNI.NLETemplateModel_compressTemplateJson(str);
    }

    public static NLETemplateModel createFromDraft(NLEModel nLEModel) {
        long NLETemplateModel_createFromDraft = NLETemplateJNI.NLETemplateModel_createFromDraft(NLEModel.getCPtr(nLEModel), nLEModel);
        if (NLETemplateModel_createFromDraft == 0) {
            return null;
        }
        return new NLETemplateModel(NLETemplateModel_createFromDraft, true);
    }

    public static String createLocalRelativePath(NLEResourceNode nLEResourceNode) {
        return NLETemplateJNI.NLETemplateModel_createLocalRelativePath(NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
    }

    public static NLETemplateModel dynamicCast(NLENode nLENode) {
        long NLETemplateModel_dynamicCast = NLETemplateJNI.NLETemplateModel_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLETemplateModel_dynamicCast == 0) {
            return null;
        }
        return new NLETemplateModel(NLETemplateModel_dynamicCast, true);
    }

    public static SetString featureListInTemplateModel(String str) {
        return new SetString(NLETemplateJNI.NLETemplateModel_featureListInTemplateModel(str));
    }

    public static long getCPtr(NLETemplateModel nLETemplateModel) {
        if (nLETemplateModel == null) {
            return 0L;
        }
        return nLETemplateModel.swigCPtr;
    }

    public static int getFeatureIndex(String str) {
        return NLETemplateJNI.NLETemplateModel_getFeatureIndex(str);
    }

    public static VecUInt32 getSupportFeatureBits(SetString setString) {
        long j;
        if (setString == null) {
            j = 0;
        } else {
            j = setString.LJLIL;
        }
        return new VecUInt32(NLETemplateJNI.NLETemplateModel_getSupportFeatureBits__SWIG_0(j, setString));
    }

    public static NLETemplateModel restore(String str) {
        long NLETemplateModel_restore = NLETemplateJNI.NLETemplateModel_restore(str);
        if (NLETemplateModel_restore == 0) {
            return null;
        }
        return new NLETemplateModel(NLETemplateModel_restore, true);
    }

    public static NLETemplateModel restoreFromPath(String str) {
        long NLETemplateModel_restoreFromPath = NLETemplateJNI.NLETemplateModel_restoreFromPath(str);
        if (NLETemplateModel_restoreFromPath == 0) {
            return null;
        }
        return new NLETemplateModel(NLETemplateModel_restoreFromPath, true);
    }

    public static NLEModel saveToDraft(NLETemplateModel nLETemplateModel) {
        long NLETemplateModel_saveToDraft = NLETemplateJNI.NLETemplateModel_saveToDraft(getCPtr(nLETemplateModel), nLETemplateModel);
        if (NLETemplateModel_saveToDraft == 0) {
            return null;
        }
        return new NLEModel(NLETemplateModel_saveToDraft, true);
    }

    public static String templateJsonDecompress(String str) {
        return NLETemplateJNI.NLETemplateModel_templateJsonDecompress(str);
    }

    public NLEMappingNode convertNLEMappingNode(NLENode nLENode) {
        long NLETemplateModel_convertNLEMappingNode = NLETemplateJNI.NLETemplateModel_convertNLEMappingNode(this.swigCPtr, this, NLENode.getCPtr(nLENode), nLENode);
        if (NLETemplateModel_convertNLEMappingNode == 0) {
            return null;
        }
        return new NLEMappingNode(NLETemplateModel_convertNLEMappingNode);
    }

    public VecNLETextTemplateClipSPtr getAllMutableTextClipsFromSlot(NLETrackSlot nLETrackSlot) {
        return new VecNLETextTemplateClipSPtr(NLETemplateJNI.NLETemplateModel_getAllMutableTextClipsFromSlot(this.swigCPtr, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot));
    }

    public String getReproductionID(NLETrackSlot nLETrackSlot) {
        return NLETemplateJNI.NLETemplateModel_getReproductionID(this.swigCPtr, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
    }

    public void setTemplateInfo(TemplateInfo templateInfo) {
        long j;
        long j2 = this.swigCPtr;
        if (templateInfo == null) {
            j = 0;
        } else {
            j = templateInfo.LIZ;
        }
        NLETemplateJNI.NLETemplateModel_setTemplateInfo(j2, this, j, templateInfo);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETemplateModel(long j, boolean z) {
        super(NLETemplateJNI.NLETemplateModel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void updateResourcePath(String str, String str2) {
        NLETemplateJNI.NLETemplateModel_updateResourcePath(this.swigCPtr, this, str, str2);
    }

    public String storeToZip(String str, String str2, NLEBaseTemplateZipProgressHandler nLEBaseTemplateZipProgressHandler) {
        return NLETemplateJNI.NLETemplateModel_storeToZip(this.swigCPtr, this, str, str2, NLEBaseTemplateZipProgressHandler.getCPtr(nLEBaseTemplateZipProgressHandler), nLEBaseTemplateZipProgressHandler);
    }
}
