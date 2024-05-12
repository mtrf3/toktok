package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEChromaChannel extends NLETimeSpaceNode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEChromaChannel(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final NLESegmentChromaChannel LIZIZ() {
        long NLEChromaChannel_getSegment = NLEEditorJniJNI.NLEChromaChannel_getSegment(this.LIZ, this);
        if (NLEChromaChannel_getSegment == 0) {
            return null;
        }
        return new NLESegmentChromaChannel(NLEChromaChannel_getSegment);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEChromaChannel_clone = NLEEditorJniJNI.NLEChromaChannel_clone(this.LIZ, this);
        if (NLEChromaChannel_clone == 0) {
            return null;
        }
        return new NLENode(NLEChromaChannel_clone, true);
    }

    public NLEChromaChannel() {
        this(NLEEditorJniJNI.new_NLEChromaChannel());
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

    public NLEChromaChannel(long j) {
        super(NLEEditorJniJNI.NLEChromaChannel_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEChromaChannel nLEChromaChannel) {
        if (nLEChromaChannel == null) {
            return 0L;
        }
        return nLEChromaChannel.LIZ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
