package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLETrackMV extends NLETrack {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                NLEEditorJniJNI.delete_NLETrackMV(j);
            }
            this.LIZJ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLETrackMV_clone = NLEEditorJniJNI.NLETrackMV_clone(this.LIZJ, this);
        if (NLETrackMV_clone == 0) {
            return null;
        }
        return new NLENode(NLETrackMV_clone, true);
    }

    public NLETrackMV() {
        this(NLEEditorJniJNI.new_NLETrackMV());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLETrackMV(long j) {
        super(NLEEditorJniJNI.NLETrackMV_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }

    public static NLETrackMV LJJII(NLETrack nLETrack) {
        long NLETrackMV_dynamicCast = NLEEditorJniJNI.NLETrackMV_dynamicCast(NLENode.getCPtr(nLETrack), nLETrack);
        if (NLETrackMV_dynamicCast == 0) {
            return null;
        }
        return new NLETrackMV(NLETrackMV_dynamicCast);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZLLL = z;
        super.swigSetCMemOwn(z);
    }
}
