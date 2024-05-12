package com.bytedance.ies.nle.editor_jni;

import X.EnumC123874tb;

/* loaded from: classes3.dex */
public final class NLESegmentTimeEffect extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentTimeEffect(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final EnumC123874tb LIZJ() {
        return EnumC123874tb.swigToEnum(NLEEditorJniJNI.NLESegmentTimeEffect_getType(this.LIZJ, this));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentTimeEffect_clone = NLEEditorJniJNI.NLESegmentTimeEffect_clone(this.LIZJ, this);
        if (NLESegmentTimeEffect_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentTimeEffect_clone, true);
    }

    public NLESegmentTimeEffect() {
        this(NLEEditorJniJNI.new_NLESegmentTimeEffect());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentTimeEffect(long j) {
        super(NLEEditorJniJNI.NLESegmentTimeEffect_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLESegmentTimeEffect LIZLLL(NLESegment nLESegment) {
        long NLESegmentTimeEffect_dynamicCast = NLEEditorJniJNI.NLESegmentTimeEffect_dynamicCast(NLENode.getCPtr(nLESegment), nLESegment);
        if (NLESegmentTimeEffect_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentTimeEffect(NLESegmentTimeEffect_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
