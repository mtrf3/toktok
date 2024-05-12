package com.bytedance.ies.nle.editor_jni;

import X.EnumC123874tb;

/* loaded from: classes3.dex */
public final class NLESegmentTextTemplate extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentTextTemplate(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentTextTemplate_getResource = NLEEditorJniJNI.NLESegmentTextTemplate_getResource(this.LIZJ, this);
        if (NLESegmentTextTemplate_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentTextTemplate_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final EnumC123874tb LIZJ() {
        return EnumC123874tb.swigToEnum(NLEEditorJniJNI.NLESegmentTextTemplate_getType(this.LIZJ, this));
    }

    public final VecNLETextTemplateClipSPtr LJ() {
        return new VecNLETextTemplateClipSPtr(NLEEditorJniJNI.NLESegmentTextTemplate_getTextClips(this.LIZJ, this));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentTextTemplate_clone = NLEEditorJniJNI.NLESegmentTextTemplate_clone(this.LIZJ, this);
        if (NLESegmentTextTemplate_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentTextTemplate_clone, true);
    }

    public NLESegmentTextTemplate() {
        this(NLEEditorJniJNI.new_NLESegmentTextTemplate());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentTextTemplate(long j) {
        super(NLEEditorJniJNI.NLESegmentTextTemplate_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLESegmentTextTemplate LIZLLL(NLENode nLENode) {
        long NLESegmentTextTemplate_dynamicCast = NLEEditorJniJNI.NLESegmentTextTemplate_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentTextTemplate_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentTextTemplate(NLESegmentTextTemplate_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
