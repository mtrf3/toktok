package com.bytedance.ies.nle.editor_jni;

import X.EnumC123874tb;

/* loaded from: classes3.dex */
public class NLESegment extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLESegment(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public NLEResourceNode LIZIZ() {
        long NLESegment_getResource = NLEEditorJniJNI.NLESegment_getResource(this.LIZ, this);
        if (NLESegment_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(NLESegment_getResource);
    }

    public EnumC123874tb LIZJ() {
        return EnumC123874tb.swigToEnum(NLEEditorJniJNI.NLESegment_getType(this.LIZ, this));
    }

    public long getDuration() {
        return NLEEditorJniJNI.NLESegment_getDuration(this.LIZ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    public NLESegment(long j) {
        super(NLEEditorJniJNI.NLESegment_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLESegment nLESegment) {
        if (nLESegment == null) {
            return 0L;
        }
        return nLESegment.LIZ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
