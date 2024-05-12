package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESegmentHDRFilter extends NLESegmentFilter {
    public transient long LJ;
    public transient boolean LJFF;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LJ;
        if (j != 0) {
            if (this.LJFF) {
                this.LJFF = false;
                NLEEditorJniJNI.delete_NLESegmentHDRFilter(j);
            }
            this.LJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLESegmentHDRFilter_clone = NLEEditorJniJNI.NLESegmentHDRFilter_clone(this.LJ, this);
        if (NLESegmentHDRFilter_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentHDRFilter_clone, true);
    }

    public NLESegmentHDRFilter() {
        this(NLEEditorJniJNI.new_NLESegmentHDRFilter());
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

    public NLESegmentHDRFilter(long j) {
        super(NLEEditorJniJNI.NLESegmentHDRFilter_SWIGSmartPtrUpcast(j));
        this.LJFF = true;
        this.LJ = j;
    }

    public static NLESegmentHDRFilter LJIIIIZZ(NLESegment nLESegment) {
        long NLESegmentHDRFilter_dynamicCast = NLEEditorJniJNI.NLESegmentHDRFilter_dynamicCast(NLENode.getCPtr(nLESegment), nLESegment);
        if (NLESegmentHDRFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentHDRFilter(NLESegmentHDRFilter_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LJFF = z;
        super.swigSetCMemOwn(z);
    }
}
