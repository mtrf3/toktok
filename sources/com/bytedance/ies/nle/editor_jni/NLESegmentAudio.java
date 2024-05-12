package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public class NLESegmentAudio extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentAudio(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentAudio_getResource = NLEEditorJniJNI.NLESegmentAudio_getResource(this.LIZJ, this);
        if (NLESegmentAudio_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentAudio_getResource);
    }

    public final NLEResourceAV LJ() {
        long NLESegmentAudio_getAVFile = NLEEditorJniJNI.NLESegmentAudio_getAVFile(this.LIZJ, this);
        if (NLESegmentAudio_getAVFile == 0) {
            return null;
        }
        return new NLEResourceAV(NLESegmentAudio_getAVFile);
    }

    public final double LJFF() {
        return NLEEditorJniJNI.NLESegmentAudio_getCurveAveSpeed(this.LIZJ, this);
    }

    public final VecNLEPointSPtr LJI() {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLESegmentAudio_getCurveSpeedPoints(this.LIZJ, this));
    }

    public final long LJII() {
        return NLEEditorJniJNI.NLESegmentAudio_getFadeInLength(this.LIZJ, this);
    }

    public final long LJIIIIZZ() {
        return NLEEditorJniJNI.NLESegmentAudio_getFadeOutLength(this.LIZJ, this);
    }

    public final boolean LJIIIZ() {
        return NLEEditorJniJNI.NLESegmentAudio_getKeepTone(this.LIZJ, this);
    }

    public final NLEResourceNode LJIIJ() {
        long NLESegmentAudio_getPlayResource = NLEEditorJniJNI.NLESegmentAudio_getPlayResource(this.LIZJ, this);
        if (NLESegmentAudio_getPlayResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentAudio_getPlayResource);
    }

    public final NLEResourceAV LJIIJJI() {
        long NLESegmentAudio_getReversedAVFile = NLEEditorJniJNI.NLESegmentAudio_getReversedAVFile(this.LIZJ, this);
        if (NLESegmentAudio_getReversedAVFile == 0) {
            return null;
        }
        return new NLEResourceAV(NLESegmentAudio_getReversedAVFile);
    }

    public final long LJIIL() {
        return NLEEditorJniJNI.NLESegmentAudio_getTimeClipEnd(this.LIZJ, this);
    }

    public final long LJIILIIL() {
        return NLEEditorJniJNI.NLESegmentAudio_getTimeClipStart(this.LIZJ, this);
    }

    public final float LJIILJJIL() {
        return NLEEditorJniJNI.NLESegmentAudio_getVolume(this.LIZJ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public NLENode mo70clone() {
        long NLESegmentAudio_clone = NLEEditorJniJNI.NLESegmentAudio_clone(this.LIZJ, this);
        if (NLESegmentAudio_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentAudio_clone, true);
    }

    public final float getAbsSpeed() {
        return NLEEditorJniJNI.NLESegmentAudio_getAbsSpeed(this.LIZJ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final long getDuration() {
        return NLEEditorJniJNI.NLESegmentAudio_getDuration(this.LIZJ, this);
    }

    public final boolean getRewind() {
        return NLEEditorJniJNI.NLESegmentAudio_getRewind(this.LIZJ, this);
    }

    public final float getSpeed() {
        return NLEEditorJniJNI.NLESegmentAudio_getSpeed(this.LIZJ, this);
    }

    public NLESegmentAudio() {
        this(NLEEditorJniJNI.new_NLESegmentAudio());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    public NLESegmentAudio(long j) {
        super(NLEEditorJniJNI.NLESegmentAudio_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLESegmentAudio LIZLLL(NLENode nLENode) {
        long NLESegmentAudio_dynamicCast = NLEEditorJniJNI.NLESegmentAudio_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentAudio_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAudio(NLESegmentAudio_dynamicCast);
    }

    public final void LJIILL(NLEResourceAV nLEResourceAV) {
        long j;
        long j2 = this.LIZJ;
        if (nLEResourceAV == null) {
            j = 0;
        } else {
            j = nLEResourceAV.LIZJ;
        }
        NLEEditorJniJNI.NLESegmentAudio_setAVFile(j2, this, j, nLEResourceAV);
    }

    public final void LJIILLIIL(double d) {
        NLEEditorJniJNI.NLESegmentAudio_setDbRange(this.LIZJ, this, d);
    }

    public final void LJIIZILJ(long j) {
        NLEEditorJniJNI.NLESegmentAudio_setFadeInLength(this.LIZJ, this, j);
    }

    public final void LJIJ(long j) {
        NLEEditorJniJNI.NLESegmentAudio_setFadeOutLength(this.LIZJ, this, j);
    }

    public final void LJIJI(boolean z) {
        NLEEditorJniJNI.NLESegmentAudio_setKeepTone(this.LIZJ, this, z);
    }

    public final void LJIJJ(long j) {
        NLEEditorJniJNI.NLESegmentAudio_setTimeClipEnd(this.LIZJ, this, j);
    }

    public final void LJIJJLI(long j) {
        NLEEditorJniJNI.NLESegmentAudio_setTimeClipStart(this.LIZJ, this, j);
    }

    public final void LJIL(float f) {
        NLEEditorJniJNI.NLESegmentAudio_setVolume(this.LIZJ, this, f);
    }

    public final void setAbsSpeed(float f) {
        NLEEditorJniJNI.NLESegmentAudio_setAbsSpeed(this.LIZJ, this, f);
    }

    public final void setSpeed(float f) {
        NLEEditorJniJNI.NLESegmentAudio_setSpeed(this.LIZJ, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
