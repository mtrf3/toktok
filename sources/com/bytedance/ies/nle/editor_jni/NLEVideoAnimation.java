package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEVideoAnimation extends NLETimeSpaceNode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEVideoAnimation(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final NLESegmentVideoAnimation LIZIZ() {
        long NLEVideoAnimation_getSegment = NLEEditorJniJNI.NLEVideoAnimation_getSegment(this.LIZ, this);
        if (NLEVideoAnimation_getSegment == 0) {
            return null;
        }
        return new NLESegmentVideoAnimation(NLEVideoAnimation_getSegment);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEVideoAnimation_clone = NLEEditorJniJNI.NLEVideoAnimation_clone(this.LIZ, this);
        if (NLEVideoAnimation_clone == 0) {
            return null;
        }
        return new NLENode(NLEVideoAnimation_clone, true);
    }

    public NLEVideoAnimation() {
        this(NLEEditorJniJNI.new_NLEVideoAnimation());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLEVideoAnimation(long j) {
        super(NLEEditorJniJNI.NLEVideoAnimation_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEVideoAnimation nLEVideoAnimation) {
        if (nLEVideoAnimation == null) {
            return 0L;
        }
        return nLEVideoAnimation.LIZ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
