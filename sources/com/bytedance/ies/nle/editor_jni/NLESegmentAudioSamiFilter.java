package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentAudioSamiFilter extends NLESegmentFilter {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentAudioSamiFilter(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentAudioSamiFilter_clone = NLEEditorJniJNI.NLESegmentAudioSamiFilter_clone(this.LJ, this);
        if (NLESegmentAudioSamiFilter_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentAudioSamiFilter_clone, true);
    }

    public NLESegmentAudioSamiFilter() {
        this(NLEEditorJniJNI.new_NLESegmentAudioSamiFilter());
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

    public NLESegmentAudioSamiFilter(long j) {
        super(NLEEditorJniJNI.NLESegmentAudioSamiFilter_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}