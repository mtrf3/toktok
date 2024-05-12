package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentAudioFadeFilter extends NLESegmentFilter {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentAudioFadeFilter(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentAudioFadeFilter_clone = NLEEditorJniJNI.NLESegmentAudioFadeFilter_clone(this.LJ, this);
        if (NLESegmentAudioFadeFilter_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentAudioFadeFilter_clone, true);
    }

    public NLESegmentAudioFadeFilter() {
        this(NLEEditorJniJNI.new_NLESegmentAudioFadeFilter());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLESegmentAudioFadeFilter(long j) {
        super(NLEEditorJniJNI.NLESegmentAudioFadeFilter_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
