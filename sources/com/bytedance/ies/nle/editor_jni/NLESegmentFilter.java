package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public class NLESegmentFilter extends NLESegment {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLESegmentFilter(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public final NLEResourceNode LIZIZ() {
        long NLESegmentFilter_getResource = NLEEditorJniJNI.NLESegmentFilter_getResource(this.LIZJ, this);
        if (NLESegmentFilter_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentFilter_getResource);
    }

    public final NLEResourceNode LJ() {
        long NLESegmentFilter_getEffectSDKFilter = NLEEditorJniJNI.NLESegmentFilter_getEffectSDKFilter(this.LIZJ, this);
        if (NLESegmentFilter_getEffectSDKFilter == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegmentFilter_getEffectSDKFilter);
    }

    public final String LJFF() {
        return NLEEditorJniJNI.NLESegmentFilter_getFilterName(this.LIZJ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public NLENode mo70clone() {
        long NLESegmentFilter_clone = NLEEditorJniJNI.NLESegmentFilter_clone(this.LIZJ, this);
        if (NLESegmentFilter_clone == 0) {
            return null;
        }
        return new NLENode(NLESegmentFilter_clone, true);
    }

    public NLESegmentFilter() {
        this(NLEEditorJniJNI.new_NLESegmentFilter());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    public NLESegmentFilter(long j) {
        super(NLEEditorJniJNI.NLESegmentFilter_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLESegmentFilter LIZLLL(NLENode nLENode) {
        long NLESegmentFilter_dynamicCast = NLEEditorJniJNI.NLESegmentFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (NLESegmentFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentFilter(NLESegmentFilter_dynamicCast);
    }

    public final void LJI(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentFilter_setEffectSDKFilter(this.LIZJ, this, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
    }

    public final void LJII(String str) {
        NLEEditorJniJNI.NLESegmentFilter_setFilterName(this.LIZJ, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
