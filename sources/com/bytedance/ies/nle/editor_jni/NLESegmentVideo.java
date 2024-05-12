package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentVideo extends NLESegmentAudio {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentVideo(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    public final NLEStyCanvas LJJI() {
        long NLESegmentVideo_getCanvasStyle = NLEEditorJniJNI.NLESegmentVideo_getCanvasStyle(this.LJ, this);
        if (NLESegmentVideo_getCanvasStyle == 0) {
            return null;
        }
        return new NLEStyCanvas(NLESegmentVideo_getCanvasStyle);
    }

    public final NLEStyCrop LJJIFFI() {
        long NLESegmentVideo_getCrop = NLEEditorJniJNI.NLESegmentVideo_getCrop(this.LJ, this);
        if (NLESegmentVideo_getCrop == 0) {
            return null;
        }
        return new NLEStyCrop(NLESegmentVideo_getCrop);
    }

    public final boolean LJJII() {
        return NLEEditorJniJNI.NLESegmentVideo_getEnableAudio(this.LJ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentVideo_clone = NLEEditorJniJNI.NLESegmentVideo_clone(this.LJ, this);
        if (NLESegmentVideo_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentVideo_clone, true);
    }

    public NLESegmentVideo() {
        this(NLEEditorJniJNI.new_NLESegmentVideo());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLESegmentVideo(long j) {
        super(NLEEditorJniJNI.NLESegmentVideo_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    public static NLESegmentVideo LJJ(NLENode nLENode) {
        long NLESegmentVideo_dynamicCast = NLEEditorJniJNI.NLESegmentVideo_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentVideo_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentVideo(NLESegmentVideo_dynamicCast);
    }

    public final void LJJIII(NLEStyCanvas nLEStyCanvas) {
        long j;
        long j2 = this.LJ;
        if (nLEStyCanvas == null) {
            j = 0;
        } else {
            j = nLEStyCanvas.LIZ;
        }
        NLEEditorJniJNI.NLESegmentVideo_setCanvasStyle(j2, this, j, nLEStyCanvas);
    }

    public final void LJJIIJ(NLEStyCrop nLEStyCrop) {
        long j;
        long j2 = this.LJ;
        if (nLEStyCrop == null) {
            j = 0;
        } else {
            j = nLEStyCrop.LIZ;
        }
        NLEEditorJniJNI.NLESegmentVideo_setCrop(j2, this, j, nLEStyCrop);
    }

    public final void LJJIIJZLJL(boolean z) {
        NLEEditorJniJNI.NLESegmentVideo_setEnableAudio(this.LJ, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
