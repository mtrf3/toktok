package com.bytedance.ies.nle.editor_jni;

import X.EnumC123874tb;

/* loaded from: classes3.dex */
public final class NLESegmentCherEffect extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentCherEffect(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final EnumC123874tb LIZJ() {
        return EnumC123874tb.swigToEnum(NLEEditorJniJNI.NLESegmentCherEffect_getType(this.LIZJ, this));
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentCherEffect_clone = NLEEditorJniJNI.NLESegmentCherEffect_clone(this.LIZJ, this);
        if (NLESegmentCherEffect_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentCherEffect_clone, true);
    }

    public NLESegmentCherEffect() {
        this(NLEEditorJniJNI.new_NLESegmentCherEffect());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentCherEffect(long j) {
        super(NLEEditorJniJNI.NLESegmentCherEffect_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
