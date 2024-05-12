package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEVideoEffect extends NLETimeSpaceNode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEVideoEffect(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final NLESegmentEffect LIZIZ() {
        long NLEVideoEffect_getSegment = NLEEditorJniJNI.NLEVideoEffect_getSegment(this.LIZ, this);
        if (NLEVideoEffect_getSegment == 0) {
            return null;
        }
        return new NLESegmentEffect(NLEVideoEffect_getSegment);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEVideoEffect_clone = NLEEditorJniJNI.NLEVideoEffect_clone(this.LIZ, this);
        if (NLEVideoEffect_clone == 0) {
            return null;
        }
        return new NLENode(NLEVideoEffect_clone, true);
    }

    public NLEVideoEffect() {
        this(NLEEditorJniJNI.new_NLEVideoEffect());
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

    public NLEVideoEffect(long j) {
        super(NLEEditorJniJNI.NLEVideoEffect_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEVideoEffect nLEVideoEffect) {
        if (nLEVideoEffect == null) {
            return 0L;
        }
        return nLEVideoEffect.LIZ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
