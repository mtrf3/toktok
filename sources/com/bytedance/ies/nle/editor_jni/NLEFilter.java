package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEFilter extends NLETimeSpaceNode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEFilter(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final NLESegmentFilter LIZIZ() {
        long NLEFilter_getSegment = NLEEditorJniJNI.NLEFilter_getSegment(this.LIZ, this);
        if (NLEFilter_getSegment == 0) {
            return null;
        }
        return new NLESegmentFilter(NLEFilter_getSegment);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEFilter_clone = NLEEditorJniJNI.NLEFilter_clone(this.LIZ, this);
        if (NLEFilter_clone == 0) {
            return null;
        }
        return new NLENode(NLEFilter_clone, true);
    }

    public NLEFilter() {
        this(NLEEditorJniJNI.new_NLEFilter());
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

    public NLEFilter(long j) {
        super(NLEEditorJniJNI.NLEFilter_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEFilter nLEFilter) {
        if (nLEFilter == null) {
            return 0L;
        }
        return nLEFilter.LIZ;
    }

    public final void LIZJ(NLESegmentFilter nLESegmentFilter) {
        NLEEditorJniJNI.NLEFilter_setSegment(this.LIZ, this, nLESegmentFilter.LIZJ, nLESegmentFilter);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
