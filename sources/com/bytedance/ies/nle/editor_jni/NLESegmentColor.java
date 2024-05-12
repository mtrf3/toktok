package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentColor extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentColor(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentColor_clone = NLEEditorJniJNI.NLESegmentColor_clone(this.LIZJ, this);
        if (NLESegmentColor_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentColor_clone, true);
    }

    public NLESegmentColor() {
        this(NLEEditorJniJNI.new_NLESegmentColor());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    public NLESegmentColor(long j) {
        super(NLEEditorJniJNI.NLESegmentColor_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
