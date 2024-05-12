package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public class NLESegmentVideoAnimation extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentVideoAnimation(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentVideoAnimation_getResource = NLEEditorJniJNI.NLESegmentVideoAnimation_getResource(this.LIZJ, this);
        if (NLESegmentVideoAnimation_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentVideoAnimation_getResource);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public NLENode mo70clone() {
        long NLESegmentVideoAnimation_clone = NLEEditorJniJNI.NLESegmentVideoAnimation_clone(this.LIZJ, this);
        if (NLESegmentVideoAnimation_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentVideoAnimation_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final long getDuration() {
        return NLEEditorJniJNI.NLESegmentVideoAnimation_getDuration(this.LIZJ, this);
    }

    public NLESegmentVideoAnimation() {
        this(NLEEditorJniJNI.new_NLESegmentVideoAnimation());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    public NLESegmentVideoAnimation(long j) {
        super(NLEEditorJniJNI.NLESegmentVideoAnimation_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
