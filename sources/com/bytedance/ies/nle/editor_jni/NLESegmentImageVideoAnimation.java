package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentImageVideoAnimation extends NLESegmentVideoAnimation {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentImageVideoAnimation(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentImageVideoAnimation_clone = NLEEditorJniJNI.NLESegmentImageVideoAnimation_clone(this.LJ, this);
        if (NLESegmentImageVideoAnimation_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentImageVideoAnimation_clone, true);
    }

    public NLESegmentImageVideoAnimation() {
        this(NLEEditorJniJNI.new_NLESegmentImageVideoAnimation());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLESegmentImageVideoAnimation(long j) {
        super(NLEEditorJniJNI.NLESegmentImageVideoAnimation_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
